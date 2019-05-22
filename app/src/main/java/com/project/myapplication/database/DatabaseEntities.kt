package com.project.myapplication.database

import android.arch.persistence.room.*
import java.sql.Date

enum class Type
{
    PROJECT,
    TEAM,
    PERSON
}

enum class Status
{
    ACTIVE,
    SUSPENDED,
    TERMINATED,
    RELEASED
}

enum class Precision
{
    MONTH,
    QUARTER,
    YEAR
}

enum class Role
{
    OWNER,
    ADMIN,
    MOD,
    MEMBER
}

enum class Action
{
    CREATE,
    EDIT,
    DELETE
}

@Entity(tableName = "projects",
        indices = [Index(value = ["Name"], unique = true)],
        foreignKeys = [ForeignKey(
            entity = GlobalIDTable::class,
            parentColumns = ["globalID"],
            childColumns = ["globalID"])])
data class ProjectsTable(
    @PrimaryKey @ColumnInfo(name = "globalID") var globalID: Int,
    @ColumnInfo(name="Name") var name: String,
    @ColumnInfo(name="Status") var status: String,
    @ColumnInfo(name="Distinctions") var distinctions: Int,
    @ColumnInfo(name="WWW") var www: String,
    @ColumnInfo(name="StartDate") var startDate: Date,
    @ColumnInfo(name="EndDate") var endDate: Date,
    @ColumnInfo(name="FinishedPart") var finishedPart: String,
    @ColumnInfo(name="Precision") var precision: String,
    @ColumnInfo(name="ShortDesc") var shortDesc: String,
    @ColumnInfo(name="LongDesc") var longDesc: String,
    @ColumnInfo(name="Like") var like: String
)

@Entity(tableName = "tags")
data class TagsTable(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "ID") var id: Int,
    @ColumnInfo(name = "Tag") var tag: String
)

@Entity(tableName = "teams",
        indices = [Index(value = ["Name"], unique = true)],
        foreignKeys = [ForeignKey(
            entity = GlobalIDTable::class,
            parentColumns = arrayOf("globalID"),
            childColumns = arrayOf("globalID")
        )])
data class TeamsTable(
    @PrimaryKey @ColumnInfo(name = "globalID") var globalId: Int,
    @ColumnInfo(name = "Name") var name: String,
    @ColumnInfo(name = "Status") var status: String,
    @ColumnInfo(name = "Distinctions") var distinctions: Int,
    @ColumnInfo(name = "WWW") var www: String,
    @ColumnInfo(name = "StartDate") var startDate: Date,
    @ColumnInfo(name = "ShortDesc") var shortDesc: String,
    @ColumnInfo(name = "LongDesc") var longDesc: String,
    @ColumnInfo(name = "Like") var like: String
)

@Entity(tableName = "people",
        indices = [Index(value = ["Name", "Email"], unique = true)],
        foreignKeys = [ForeignKey(
            entity = GlobalIDTable::class,
            parentColumns = ["globalID"],
            childColumns = ["globalID"])])
data class PeopleTable(
    @PrimaryKey @ColumnInfo(name = "globalID") var globalId: Int,
    @ColumnInfo(name = "Name") var name: String,
    @ColumnInfo(name = "Email") var email: String,
    @ColumnInfo(name = "Password") var password: String,
    @ColumnInfo(name = "Status") var status: String,
    @ColumnInfo(name = "Distinctions") var distinctions: Int,
    @ColumnInfo(name = "WWW") var www: String,
    @ColumnInfo(name = "StartDate") var startDate: Date,
    @ColumnInfo(name = "ShortDesc") var shortDesc: String,
    @ColumnInfo(name = "LongDesc") var longDesc: String,
    @ColumnInfo(name = "Like") var like: String
)

@Entity(tableName = "globalID",
        indices = [Index(value = ["URL"], unique = true)])
data class GlobalIDTable(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "globalID") var globalId: Int,
    @ColumnInfo(name = "URL") var url: String,
    @ColumnInfo(name = "Type") var type: String
)

@Entity(tableName = "projecttags",
        indices = [Index(value = ["ProjectID", "TagID"], unique = true),
                   Index(value = ["TagID"], unique = false)],
        foreignKeys = [ForeignKey(
            entity = ProjectsTable::class,
            parentColumns = ["globalID"],
            childColumns = ["ProjectID"]),
                       ForeignKey(
            entity = TagsTable::class,
            parentColumns = ["ID"],
            childColumns = ["TagID"])])
data class ProjectTagsTable(
    @PrimaryKey @ColumnInfo(name = "ProjectID") var projectId: Int,
    @ColumnInfo(name = "TagID") var tagId: Int
)

@Entity(tableName = "projectworkers",
        indices = [Index(value = ["ProjectID", "WorkerID"], unique = true),
                   Index(value = ["WorkerID"])],
        foreignKeys = [ForeignKey(
            entity = PeopleTable::class,
            parentColumns = ["globalID"],
            childColumns = ["WorkerID"]),
                       ForeignKey(
            entity = ProjectsTable::class,
            parentColumns = ["globalID"],
            childColumns = ["ProjectID"])])
data class ProjectWorkersTable(
    @PrimaryKey @ColumnInfo(name = "ProjectID") var ProjectID: Int,
    @ColumnInfo(name = "WorkerID") var workerId: Int
)

@Entity(tableName = "teammembers",
        indices = [Index(value = ["TeamID", "MemberID"], unique = true),
                          Index(value = ["MemberID"])],
        foreignKeys = [ForeignKey(
            entity = GlobalIDTable::class,
            parentColumns = ["globalID"],
            childColumns = ["MemberID"]),
                       ForeignKey(
            entity = TeamsTable::class,
            parentColumns = ["globalID"],
            childColumns = ["TeamID"])])
data class TeamMembersTable(
    @PrimaryKey @ColumnInfo(name = "TeamID") var teamId: Int,
    @ColumnInfo(name = "MemberID") var memberId: Int,
    @ColumnInfo(name = "Type") var type: String,
    @ColumnInfo(name = "Role") var role: String
)

@Entity(tableName = "personalhistory",
        indices = [Index(value = ["PersonID", "VisitedID"])])
data class PersonalHistoryTable(
    @PrimaryKey @ColumnInfo(name = "PersonID") var personId: Int,
    @ColumnInfo(name = "VisitedID") var visitedId: Int
)

@Entity(tableName = "log",
        indices = [Index(value = ["globalID"])])
data class LogTable(
    @PrimaryKey @ColumnInfo(name = "globalID") var globalId: Int,
    @ColumnInfo(name = "Action") var action: String,
    @ColumnInfo(name = "ActionTime") var actionTime: Date
)

@Entity(tableName = "presence",
        foreignKeys = [ForeignKey(
            entity = GlobalIDTable::class,
            parentColumns = ["globalID"],
            childColumns = ["globalID"])])
data class PresenceTable(
    @ColumnInfo(name = "globalID") @PrimaryKey var globalId: Int,
    @ColumnInfo(name = "PresenceDate") var presenceDate: Date
)

class Converters
{
    companion object {
        @TypeConverter
        @JvmStatic
        fun fromTimestamp(value: Long): Date {
            return Date(value)
        }

        @TypeConverter
        @JvmStatic
        fun dateToTimestamp(date: Date): Long {
            return date.time
        }
    }
}