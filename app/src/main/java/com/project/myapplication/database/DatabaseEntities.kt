package com.project.myapplication.database

import android.arch.persistence.room.*
import java.util.Date

enum class Type(private val type: String)
{
    PROJECT("PROJECT"),
    TEAM("TEAM"),
    PERSON("PERSON"),
    UNKNOWN("UNKNOWN");

    override fun toString(): String {
        return type
    }
}

enum class Status(private val status: String)
{
    ACTIVE("ACTIVE"),
    SUSPENDED("SUSPENDED"),
    TERMINATED("TERMINATED"),
    RELEASED("RELEASED"),
    UNKNOWN("UNKNOWN");

    override fun toString(): String {
        return status
    }
}

enum class Precision(private val precision: String)
{
    MONTH("MONTH"),
    QUARTER("QUARTER"),
    YEAR("YEAR"),
    UNKNOWN("UNKNOWN");

    override fun toString(): String {
        return precision
    }
}

enum class Role(private val role: String)
{
    OWNER("OWNER"),
    ADMIN("ADMIN"),
    MOD("MOD"),
    MEMBER("MEMBER"),
    UNKNOWN("UNKNOWN");

    override fun toString(): String {
        return role
    }
}

enum class Action(private val action: String)
{
    CREATE("CREATE"),
    EDIT("EDIT"),
    DELETE("DELETE"),
    UNKNOWN("UNKNOWN");

    override fun toString(): String {
        return action
    }
}

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

        @TypeConverter
        @JvmStatic
        fun typeToString(type: Type): String
        {
            return type.toString()
        }

        @TypeConverter
        @JvmStatic
        fun stringToType(type: String): Type
        {
            when (type) {
                "PERSON" -> return Type.PERSON
                "TEAM" -> return Type.TEAM
                "PROJECT" -> return Type.PROJECT
                else -> return Type.UNKNOWN
            }
        }
        @TypeConverter
        @JvmStatic
        fun statusToString(type: Status): String
        {
            return type.toString()
        }

        @TypeConverter
        @JvmStatic
        fun stringToStatus(type: String): Status
        {
            when (type) {
                "ACTIVE" -> return Status.ACTIVE
                "RELEASED" -> return Status.RELEASED
                "SUSPENDED" -> return Status.SUSPENDED
                "TERMINATED" -> return Status.TERMINATED
                else -> return Status.UNKNOWN
            }
        }

        @TypeConverter
        @JvmStatic
        fun precisionToString(type: Precision): String
        {
            return type.toString()
        }

        @TypeConverter
        @JvmStatic
        fun stringToPrecision(type: String): Precision
        {
            when (type) {
                "MONTH" -> return Precision.MONTH
                "QUARTER" -> return Precision.QUARTER
                "YEAR" -> return Precision.YEAR
                else -> return Precision.UNKNOWN
            }
        }

        @TypeConverter
        @JvmStatic
        fun roleToString(type: Role): String
        {
            return type.toString()
        }

        @TypeConverter
        @JvmStatic
        fun stringToRole(type: String): Role
        {
            when (type) {
                "ADMIN" -> return Role.ADMIN
                "MEMBER" -> return Role.MEMBER
                "MOD" -> return Role.MOD
                "OWNER" -> return Role.OWNER
                else -> return Role.UNKNOWN
            }
        }

        @TypeConverter
        @JvmStatic
        fun actionToString(type: Action): String
        {
            return type.toString()
        }

        @TypeConverter
        @JvmStatic
        fun stringToAction(type: String): Action
        {
            when (type) {
                "CREATE" -> return Action.CREATE
                "DELETE" -> return Action.DELETE
                "EDIT" -> return Action.EDIT
                else -> return Action.UNKNOWN
            }
        }
    }
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
    @ColumnInfo(name="Status") var status: Status,
    @ColumnInfo(name="Distinctions") var distinctions: Int,
    @ColumnInfo(name="WWW") var www: String?,
    @ColumnInfo(name="StartDate") var startDate: Date,
    @ColumnInfo(name="EndDate") var endDate: Date? = null,
    @ColumnInfo(name="FinishedPart") var finishedPart: Int,
    @ColumnInfo(name="Precision") var precision: String? = null,
    @ColumnInfo(name="ShortDesc") var shortDesc: String,
    @ColumnInfo(name="LongDesc") var longDesc: String,
    @ColumnInfo(name="Like") var like: String?
)
{
    companion object {
        fun populateEntity(): Array<ProjectsTable>
        {
            return arrayOf(
                ProjectsTable(3, "Zespołowy123", Status.ACTIVE, 0, null, Date(), null,
                    0, null, "Dzala", "Dziala", null),
                ProjectsTable(3, "testuTest123", Status.ACTIVE, 0, null, Date(), null,
                    0, null, "Dzala", "Dziala", null)
            )
        }
    }
}

@Entity(tableName = "tags")
data class TagsTable(
    @ColumnInfo(name = "Tag") var tag: String
)
{
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "ID") var id: Int = 1
    companion object {
        fun populateEntity(): Array<TagsTable>
        {
            return arrayOf(
                TagsTable("Action"),
                TagsTable("RPG"),
                TagsTable("Strategy"),
                TagsTable("Economic"),
                TagsTable("Simulation"),
                TagsTable("Casual"),
                TagsTable("Racing"),
                TagsTable("Sport"),
                TagsTable("Logical")
            )
        }
    }
}

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
    @ColumnInfo(name = "Status") var status: Status,
    @ColumnInfo(name = "Distinctions") var distinctions: Int,
    @ColumnInfo(name = "WWW") var www: String?,
    @ColumnInfo(name = "StartDate") var startDate: Date,
    @ColumnInfo(name = "ShortDesc") var shortDesc: String,
    @ColumnInfo(name = "LongDesc") var longDesc: String,
    @ColumnInfo(name = "Like") var like: String?
)
{
    companion object {
        fun populateEntity(): Array<TeamsTable>
        {
            return arrayOf(
                TeamsTable(2, "TEstuTestu123", Status.ACTIVE, 0, null, Date(),
                    "taki tam", "dziala", null)
            )
        }
    }
}

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
    @ColumnInfo(name = "Status") var status: Status,
    @ColumnInfo(name = "Distinctions") var distinctions: Int,
    @ColumnInfo(name = "WWW") var www: String?,
    @ColumnInfo(name = "StartDate") var startDate: Date,
    @ColumnInfo(name = "ShortDesc") var shortDesc: String,
    @ColumnInfo(name = "LongDesc") var longDesc: String,
    @ColumnInfo(name = "Like") var like: String?
)
{
    companion object {
        fun populateEntity(): Array<PeopleTable>
        {
            return arrayOf(
                PeopleTable(1, "Bob", "tmp@mail.pl", "password", Status.ACTIVE,
                    0, null, Date(), "nie dziala", "nie dziala", null)
            )
        }
    }
}

@Entity(tableName = "globalID",
        indices = [Index(value = ["URL"], unique = true)])
data class GlobalIDTable(
    @ColumnInfo(name = "URL") var url: String,
    @ColumnInfo(name = "Type") var type: Type)
{
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "globalID") var globalId: Int = 0
    companion object {
        fun populateEntity(): Array<GlobalIDTable> {
            return arrayOf(
                GlobalIDTable("3f8eb3f84ac41b514bac54b65355cc78", Type.PERSON),
                GlobalIDTable( "e988ca9b80e331d3ef8a18bac07385d3", Type.TEAM),
                GlobalIDTable( "f7c3b43dd99d161af82502860baed380", Type.PROJECT),
                GlobalIDTable( "c071f53c780c0243dadf4e8027f68e17", Type.PROJECT)
            )
        }
    }
}

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
{
    companion object {
        fun populateEntity(): Array<ProjectTagsTable>
        {
            return arrayOf(
                ProjectTagsTable(4, 3),
                ProjectTagsTable(4, 4)
            )
        }
    }
}

@Entity(tableName = "projectworkers",
        indices = [Index(value = ["ProjectID", "WorkerID"], unique = true),
                   Index(value = ["WorkerID"], unique = false)],
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
    @ColumnInfo(name = "WorkerID") var workerId: Int,
    @ColumnInfo(name = "Role") var role: Role
)
{
    companion object {
        fun populateEntity(): Array<ProjectWorkersTable>
        {
            return arrayOf(
                ProjectWorkersTable(3, 1, Role.OWNER),
                ProjectWorkersTable(4, 1, Role.OWNER)
            )
        }
    }
}

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
    @ColumnInfo(name = "Type") var type: Type,
    @ColumnInfo(name = "Role") var role: Role
)
{
    companion object {
        fun populateEntity(): Array<TeamMembersTable>
        {
            return arrayOf(
                TeamMembersTable(2, 1, Type.PERSON, Role.OWNER)
            )
        }
    }
}

@Entity(tableName = "personalhistory",
        indices = [Index(value = ["PersonID", "VisitedID"], unique = false)])
data class PersonalHistoryTable(
    @PrimaryKey @ColumnInfo(name = "PersonID") var personId: Int,
    @ColumnInfo(name = "VisitedID") var visitedId: Int
)
{
    companion object {
        fun populateEntity(): Array<PersonalHistoryTable>
        {
            return arrayOf(
                PersonalHistoryTable(1, 1),
                PersonalHistoryTable(1, 4),
                PersonalHistoryTable(1, 4),
                PersonalHistoryTable(1, 4),
                PersonalHistoryTable(1, 4)
            )
        }
    }
}

@Entity(tableName = "log",
        indices = [Index(value = ["globalID"], unique = false)])
data class LogTable(
    @PrimaryKey @ColumnInfo(name = "globalID") var globalId: Int,
    @ColumnInfo(name = "Action") var action: Action,
    @ColumnInfo(name = "ActionTime") var actionTime: Date
)
{
    companion object {
        fun populateEntity(): Array<LogTable>
        {
            return arrayOf(
                LogTable(1, Action.CREATE, Date()),
                LogTable(2, Action.CREATE, Date()),
                LogTable(3, Action.CREATE, Date()),
                LogTable(4, Action.CREATE, Date())
            )
        }
    }
}

@Entity(tableName = "presence",
        foreignKeys = [ForeignKey(
            entity = GlobalIDTable::class,
            parentColumns = ["globalID"],
            childColumns = ["globalID"])])
data class PresenceTable(
    @ColumnInfo(name = "globalID") @PrimaryKey var globalId: Int,
    @ColumnInfo(name = "PresenceDate") var presenceDate: Date
)
{
    companion object {
        fun populateEntity(): Array<PresenceTable>
        {
            return arrayOf(

            )
        }
    }
}