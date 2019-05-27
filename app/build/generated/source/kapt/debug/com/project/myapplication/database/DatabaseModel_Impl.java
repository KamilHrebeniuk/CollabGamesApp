package com.project.myapplication.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DatabaseModel_Impl extends DatabaseModel {
  private volatile DatabaseDao _databaseDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `projects` (`globalID` INTEGER NOT NULL, `Name` TEXT NOT NULL, `Status` TEXT NOT NULL, `Distinctions` INTEGER NOT NULL, `WWW` TEXT, `StartDate` INTEGER NOT NULL, `EndDate` INTEGER, `FinishedPart` INTEGER NOT NULL, `Precision` TEXT, `ShortDesc` TEXT NOT NULL, `LongDesc` TEXT NOT NULL, `Like` TEXT, PRIMARY KEY(`globalID`), FOREIGN KEY(`globalID`) REFERENCES `globalID`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tags` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Tag` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `teams` (`globalID` INTEGER NOT NULL, `Name` TEXT NOT NULL, `Status` TEXT NOT NULL, `Distinctions` INTEGER NOT NULL, `WWW` TEXT, `StartDate` INTEGER NOT NULL, `ShortDesc` TEXT NOT NULL, `LongDesc` TEXT NOT NULL, `Like` TEXT, PRIMARY KEY(`globalID`), FOREIGN KEY(`globalID`) REFERENCES `globalID`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE UNIQUE INDEX `index_teams_Name` ON `teams` (`Name`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `people` (`globalID` INTEGER NOT NULL, `Name` TEXT NOT NULL, `Email` TEXT NOT NULL, `Password` TEXT NOT NULL, `Status` TEXT NOT NULL, `Distinctions` INTEGER NOT NULL, `WWW` TEXT, `StartDate` INTEGER NOT NULL, `ShortDesc` TEXT NOT NULL, `LongDesc` TEXT NOT NULL, `Like` TEXT, PRIMARY KEY(`globalID`), FOREIGN KEY(`globalID`) REFERENCES `globalID`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE UNIQUE INDEX `index_people_Name_Email` ON `people` (`Name`, `Email`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `globalID` (`globalID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `URL` TEXT NOT NULL, `Type` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_globalID_URL` ON `globalID` (`URL`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `projecttags` (`ProjectID` INTEGER NOT NULL, `TagID` INTEGER NOT NULL, PRIMARY KEY(`ProjectID`, `TagID`), FOREIGN KEY(`ProjectID`) REFERENCES `projects`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION , FOREIGN KEY(`TagID`) REFERENCES `tags`(`ID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `projectworkers` (`ProjectID` INTEGER NOT NULL, `WorkerID` INTEGER NOT NULL, `Role` TEXT NOT NULL, PRIMARY KEY(`WorkerID`, `ProjectID`), FOREIGN KEY(`WorkerID`) REFERENCES `people`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION , FOREIGN KEY(`ProjectID`) REFERENCES `projects`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE UNIQUE INDEX `index_projectworkers_ProjectID_WorkerID` ON `projectworkers` (`ProjectID`, `WorkerID`)");
        _db.execSQL("CREATE  INDEX `index_projectworkers_WorkerID` ON `projectworkers` (`WorkerID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `teammembers` (`TeamID` INTEGER NOT NULL, `MemberID` INTEGER NOT NULL, `Type` TEXT NOT NULL, `Role` TEXT NOT NULL, PRIMARY KEY(`TeamID`, `MemberID`), FOREIGN KEY(`MemberID`) REFERENCES `globalID`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION , FOREIGN KEY(`TeamID`) REFERENCES `teams`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE UNIQUE INDEX `index_teammembers_TeamID_MemberID` ON `teammembers` (`TeamID`, `MemberID`)");
        _db.execSQL("CREATE  INDEX `index_teammembers_MemberID` ON `teammembers` (`MemberID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `personalhistory` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `PersonID` INTEGER NOT NULL, `VisitedID` INTEGER NOT NULL)");
        _db.execSQL("CREATE  INDEX `index_personalhistory_PersonID_VisitedID` ON `personalhistory` (`PersonID`, `VisitedID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `log` (`globalID` INTEGER NOT NULL, `Action` TEXT NOT NULL, `ActionTime` INTEGER NOT NULL, PRIMARY KEY(`globalID`))");
        _db.execSQL("CREATE  INDEX `index_log_globalID` ON `log` (`globalID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `presence` (`globalID` INTEGER NOT NULL, `PresenceDate` INTEGER NOT NULL, PRIMARY KEY(`globalID`), FOREIGN KEY(`globalID`) REFERENCES `globalID`(`globalID`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c9987d9ec4463adc6bb2a55aca315483\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `projects`");
        _db.execSQL("DROP TABLE IF EXISTS `tags`");
        _db.execSQL("DROP TABLE IF EXISTS `teams`");
        _db.execSQL("DROP TABLE IF EXISTS `people`");
        _db.execSQL("DROP TABLE IF EXISTS `globalID`");
        _db.execSQL("DROP TABLE IF EXISTS `projecttags`");
        _db.execSQL("DROP TABLE IF EXISTS `projectworkers`");
        _db.execSQL("DROP TABLE IF EXISTS `teammembers`");
        _db.execSQL("DROP TABLE IF EXISTS `personalhistory`");
        _db.execSQL("DROP TABLE IF EXISTS `log`");
        _db.execSQL("DROP TABLE IF EXISTS `presence`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProjects = new HashMap<String, TableInfo.Column>(12);
        _columnsProjects.put("globalID", new TableInfo.Column("globalID", "INTEGER", true, 1));
        _columnsProjects.put("Name", new TableInfo.Column("Name", "TEXT", true, 0));
        _columnsProjects.put("Status", new TableInfo.Column("Status", "TEXT", true, 0));
        _columnsProjects.put("Distinctions", new TableInfo.Column("Distinctions", "INTEGER", true, 0));
        _columnsProjects.put("WWW", new TableInfo.Column("WWW", "TEXT", false, 0));
        _columnsProjects.put("StartDate", new TableInfo.Column("StartDate", "INTEGER", true, 0));
        _columnsProjects.put("EndDate", new TableInfo.Column("EndDate", "INTEGER", false, 0));
        _columnsProjects.put("FinishedPart", new TableInfo.Column("FinishedPart", "INTEGER", true, 0));
        _columnsProjects.put("Precision", new TableInfo.Column("Precision", "TEXT", false, 0));
        _columnsProjects.put("ShortDesc", new TableInfo.Column("ShortDesc", "TEXT", true, 0));
        _columnsProjects.put("LongDesc", new TableInfo.Column("LongDesc", "TEXT", true, 0));
        _columnsProjects.put("Like", new TableInfo.Column("Like", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProjects = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysProjects.add(new TableInfo.ForeignKey("globalID", "NO ACTION", "NO ACTION",Arrays.asList("globalID"), Arrays.asList("globalID")));
        final HashSet<TableInfo.Index> _indicesProjects = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProjects = new TableInfo("projects", _columnsProjects, _foreignKeysProjects, _indicesProjects);
        final TableInfo _existingProjects = TableInfo.read(_db, "projects");
        if (! _infoProjects.equals(_existingProjects)) {
          throw new IllegalStateException("Migration didn't properly handle projects(com.project.myapplication.database.ProjectsTable).\n"
                  + " Expected:\n" + _infoProjects + "\n"
                  + " Found:\n" + _existingProjects);
        }
        final HashMap<String, TableInfo.Column> _columnsTags = new HashMap<String, TableInfo.Column>(2);
        _columnsTags.put("ID", new TableInfo.Column("ID", "INTEGER", true, 1));
        _columnsTags.put("Tag", new TableInfo.Column("Tag", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTags = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTags = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTags = new TableInfo("tags", _columnsTags, _foreignKeysTags, _indicesTags);
        final TableInfo _existingTags = TableInfo.read(_db, "tags");
        if (! _infoTags.equals(_existingTags)) {
          throw new IllegalStateException("Migration didn't properly handle tags(com.project.myapplication.database.TagsTable).\n"
                  + " Expected:\n" + _infoTags + "\n"
                  + " Found:\n" + _existingTags);
        }
        final HashMap<String, TableInfo.Column> _columnsTeams = new HashMap<String, TableInfo.Column>(9);
        _columnsTeams.put("globalID", new TableInfo.Column("globalID", "INTEGER", true, 1));
        _columnsTeams.put("Name", new TableInfo.Column("Name", "TEXT", true, 0));
        _columnsTeams.put("Status", new TableInfo.Column("Status", "TEXT", true, 0));
        _columnsTeams.put("Distinctions", new TableInfo.Column("Distinctions", "INTEGER", true, 0));
        _columnsTeams.put("WWW", new TableInfo.Column("WWW", "TEXT", false, 0));
        _columnsTeams.put("StartDate", new TableInfo.Column("StartDate", "INTEGER", true, 0));
        _columnsTeams.put("ShortDesc", new TableInfo.Column("ShortDesc", "TEXT", true, 0));
        _columnsTeams.put("LongDesc", new TableInfo.Column("LongDesc", "TEXT", true, 0));
        _columnsTeams.put("Like", new TableInfo.Column("Like", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTeams = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTeams.add(new TableInfo.ForeignKey("globalID", "NO ACTION", "NO ACTION",Arrays.asList("globalID"), Arrays.asList("globalID")));
        final HashSet<TableInfo.Index> _indicesTeams = new HashSet<TableInfo.Index>(1);
        _indicesTeams.add(new TableInfo.Index("index_teams_Name", true, Arrays.asList("Name")));
        final TableInfo _infoTeams = new TableInfo("teams", _columnsTeams, _foreignKeysTeams, _indicesTeams);
        final TableInfo _existingTeams = TableInfo.read(_db, "teams");
        if (! _infoTeams.equals(_existingTeams)) {
          throw new IllegalStateException("Migration didn't properly handle teams(com.project.myapplication.database.TeamsTable).\n"
                  + " Expected:\n" + _infoTeams + "\n"
                  + " Found:\n" + _existingTeams);
        }
        final HashMap<String, TableInfo.Column> _columnsPeople = new HashMap<String, TableInfo.Column>(11);
        _columnsPeople.put("globalID", new TableInfo.Column("globalID", "INTEGER", true, 1));
        _columnsPeople.put("Name", new TableInfo.Column("Name", "TEXT", true, 0));
        _columnsPeople.put("Email", new TableInfo.Column("Email", "TEXT", true, 0));
        _columnsPeople.put("Password", new TableInfo.Column("Password", "TEXT", true, 0));
        _columnsPeople.put("Status", new TableInfo.Column("Status", "TEXT", true, 0));
        _columnsPeople.put("Distinctions", new TableInfo.Column("Distinctions", "INTEGER", true, 0));
        _columnsPeople.put("WWW", new TableInfo.Column("WWW", "TEXT", false, 0));
        _columnsPeople.put("StartDate", new TableInfo.Column("StartDate", "INTEGER", true, 0));
        _columnsPeople.put("ShortDesc", new TableInfo.Column("ShortDesc", "TEXT", true, 0));
        _columnsPeople.put("LongDesc", new TableInfo.Column("LongDesc", "TEXT", true, 0));
        _columnsPeople.put("Like", new TableInfo.Column("Like", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPeople = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPeople.add(new TableInfo.ForeignKey("globalID", "NO ACTION", "NO ACTION",Arrays.asList("globalID"), Arrays.asList("globalID")));
        final HashSet<TableInfo.Index> _indicesPeople = new HashSet<TableInfo.Index>(1);
        _indicesPeople.add(new TableInfo.Index("index_people_Name_Email", true, Arrays.asList("Name","Email")));
        final TableInfo _infoPeople = new TableInfo("people", _columnsPeople, _foreignKeysPeople, _indicesPeople);
        final TableInfo _existingPeople = TableInfo.read(_db, "people");
        if (! _infoPeople.equals(_existingPeople)) {
          throw new IllegalStateException("Migration didn't properly handle people(com.project.myapplication.database.PeopleTable).\n"
                  + " Expected:\n" + _infoPeople + "\n"
                  + " Found:\n" + _existingPeople);
        }
        final HashMap<String, TableInfo.Column> _columnsGlobalID = new HashMap<String, TableInfo.Column>(3);
        _columnsGlobalID.put("globalID", new TableInfo.Column("globalID", "INTEGER", true, 1));
        _columnsGlobalID.put("URL", new TableInfo.Column("URL", "TEXT", true, 0));
        _columnsGlobalID.put("Type", new TableInfo.Column("Type", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGlobalID = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGlobalID = new HashSet<TableInfo.Index>(1);
        _indicesGlobalID.add(new TableInfo.Index("index_globalID_URL", true, Arrays.asList("URL")));
        final TableInfo _infoGlobalID = new TableInfo("globalID", _columnsGlobalID, _foreignKeysGlobalID, _indicesGlobalID);
        final TableInfo _existingGlobalID = TableInfo.read(_db, "globalID");
        if (! _infoGlobalID.equals(_existingGlobalID)) {
          throw new IllegalStateException("Migration didn't properly handle globalID(com.project.myapplication.database.GlobalIDTable).\n"
                  + " Expected:\n" + _infoGlobalID + "\n"
                  + " Found:\n" + _existingGlobalID);
        }
        final HashMap<String, TableInfo.Column> _columnsProjecttags = new HashMap<String, TableInfo.Column>(2);
        _columnsProjecttags.put("ProjectID", new TableInfo.Column("ProjectID", "INTEGER", true, 1));
        _columnsProjecttags.put("TagID", new TableInfo.Column("TagID", "INTEGER", true, 2));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProjecttags = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysProjecttags.add(new TableInfo.ForeignKey("projects", "NO ACTION", "NO ACTION",Arrays.asList("ProjectID"), Arrays.asList("globalID")));
        _foreignKeysProjecttags.add(new TableInfo.ForeignKey("tags", "NO ACTION", "NO ACTION",Arrays.asList("TagID"), Arrays.asList("ID")));
        final HashSet<TableInfo.Index> _indicesProjecttags = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProjecttags = new TableInfo("projecttags", _columnsProjecttags, _foreignKeysProjecttags, _indicesProjecttags);
        final TableInfo _existingProjecttags = TableInfo.read(_db, "projecttags");
        if (! _infoProjecttags.equals(_existingProjecttags)) {
          throw new IllegalStateException("Migration didn't properly handle projecttags(com.project.myapplication.database.ProjectTagsTable).\n"
                  + " Expected:\n" + _infoProjecttags + "\n"
                  + " Found:\n" + _existingProjecttags);
        }
        final HashMap<String, TableInfo.Column> _columnsProjectworkers = new HashMap<String, TableInfo.Column>(3);
        _columnsProjectworkers.put("ProjectID", new TableInfo.Column("ProjectID", "INTEGER", true, 2));
        _columnsProjectworkers.put("WorkerID", new TableInfo.Column("WorkerID", "INTEGER", true, 1));
        _columnsProjectworkers.put("Role", new TableInfo.Column("Role", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProjectworkers = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysProjectworkers.add(new TableInfo.ForeignKey("people", "NO ACTION", "NO ACTION",Arrays.asList("WorkerID"), Arrays.asList("globalID")));
        _foreignKeysProjectworkers.add(new TableInfo.ForeignKey("projects", "NO ACTION", "NO ACTION",Arrays.asList("ProjectID"), Arrays.asList("globalID")));
        final HashSet<TableInfo.Index> _indicesProjectworkers = new HashSet<TableInfo.Index>(2);
        _indicesProjectworkers.add(new TableInfo.Index("index_projectworkers_ProjectID_WorkerID", true, Arrays.asList("ProjectID","WorkerID")));
        _indicesProjectworkers.add(new TableInfo.Index("index_projectworkers_WorkerID", false, Arrays.asList("WorkerID")));
        final TableInfo _infoProjectworkers = new TableInfo("projectworkers", _columnsProjectworkers, _foreignKeysProjectworkers, _indicesProjectworkers);
        final TableInfo _existingProjectworkers = TableInfo.read(_db, "projectworkers");
        if (! _infoProjectworkers.equals(_existingProjectworkers)) {
          throw new IllegalStateException("Migration didn't properly handle projectworkers(com.project.myapplication.database.ProjectWorkersTable).\n"
                  + " Expected:\n" + _infoProjectworkers + "\n"
                  + " Found:\n" + _existingProjectworkers);
        }
        final HashMap<String, TableInfo.Column> _columnsTeammembers = new HashMap<String, TableInfo.Column>(4);
        _columnsTeammembers.put("TeamID", new TableInfo.Column("TeamID", "INTEGER", true, 1));
        _columnsTeammembers.put("MemberID", new TableInfo.Column("MemberID", "INTEGER", true, 2));
        _columnsTeammembers.put("Type", new TableInfo.Column("Type", "TEXT", true, 0));
        _columnsTeammembers.put("Role", new TableInfo.Column("Role", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTeammembers = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysTeammembers.add(new TableInfo.ForeignKey("globalID", "NO ACTION", "NO ACTION",Arrays.asList("MemberID"), Arrays.asList("globalID")));
        _foreignKeysTeammembers.add(new TableInfo.ForeignKey("teams", "NO ACTION", "NO ACTION",Arrays.asList("TeamID"), Arrays.asList("globalID")));
        final HashSet<TableInfo.Index> _indicesTeammembers = new HashSet<TableInfo.Index>(2);
        _indicesTeammembers.add(new TableInfo.Index("index_teammembers_TeamID_MemberID", true, Arrays.asList("TeamID","MemberID")));
        _indicesTeammembers.add(new TableInfo.Index("index_teammembers_MemberID", false, Arrays.asList("MemberID")));
        final TableInfo _infoTeammembers = new TableInfo("teammembers", _columnsTeammembers, _foreignKeysTeammembers, _indicesTeammembers);
        final TableInfo _existingTeammembers = TableInfo.read(_db, "teammembers");
        if (! _infoTeammembers.equals(_existingTeammembers)) {
          throw new IllegalStateException("Migration didn't properly handle teammembers(com.project.myapplication.database.TeamMembersTable).\n"
                  + " Expected:\n" + _infoTeammembers + "\n"
                  + " Found:\n" + _existingTeammembers);
        }
        final HashMap<String, TableInfo.Column> _columnsPersonalhistory = new HashMap<String, TableInfo.Column>(3);
        _columnsPersonalhistory.put("ID", new TableInfo.Column("ID", "INTEGER", true, 1));
        _columnsPersonalhistory.put("PersonID", new TableInfo.Column("PersonID", "INTEGER", true, 0));
        _columnsPersonalhistory.put("VisitedID", new TableInfo.Column("VisitedID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPersonalhistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPersonalhistory = new HashSet<TableInfo.Index>(1);
        _indicesPersonalhistory.add(new TableInfo.Index("index_personalhistory_PersonID_VisitedID", false, Arrays.asList("PersonID","VisitedID")));
        final TableInfo _infoPersonalhistory = new TableInfo("personalhistory", _columnsPersonalhistory, _foreignKeysPersonalhistory, _indicesPersonalhistory);
        final TableInfo _existingPersonalhistory = TableInfo.read(_db, "personalhistory");
        if (! _infoPersonalhistory.equals(_existingPersonalhistory)) {
          throw new IllegalStateException("Migration didn't properly handle personalhistory(com.project.myapplication.database.PersonalHistoryTable).\n"
                  + " Expected:\n" + _infoPersonalhistory + "\n"
                  + " Found:\n" + _existingPersonalhistory);
        }
        final HashMap<String, TableInfo.Column> _columnsLog = new HashMap<String, TableInfo.Column>(3);
        _columnsLog.put("globalID", new TableInfo.Column("globalID", "INTEGER", true, 1));
        _columnsLog.put("Action", new TableInfo.Column("Action", "TEXT", true, 0));
        _columnsLog.put("ActionTime", new TableInfo.Column("ActionTime", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLog = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLog = new HashSet<TableInfo.Index>(1);
        _indicesLog.add(new TableInfo.Index("index_log_globalID", false, Arrays.asList("globalID")));
        final TableInfo _infoLog = new TableInfo("log", _columnsLog, _foreignKeysLog, _indicesLog);
        final TableInfo _existingLog = TableInfo.read(_db, "log");
        if (! _infoLog.equals(_existingLog)) {
          throw new IllegalStateException("Migration didn't properly handle log(com.project.myapplication.database.LogTable).\n"
                  + " Expected:\n" + _infoLog + "\n"
                  + " Found:\n" + _existingLog);
        }
        final HashMap<String, TableInfo.Column> _columnsPresence = new HashMap<String, TableInfo.Column>(2);
        _columnsPresence.put("globalID", new TableInfo.Column("globalID", "INTEGER", true, 1));
        _columnsPresence.put("PresenceDate", new TableInfo.Column("PresenceDate", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPresence = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPresence.add(new TableInfo.ForeignKey("globalID", "NO ACTION", "NO ACTION",Arrays.asList("globalID"), Arrays.asList("globalID")));
        final HashSet<TableInfo.Index> _indicesPresence = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPresence = new TableInfo("presence", _columnsPresence, _foreignKeysPresence, _indicesPresence);
        final TableInfo _existingPresence = TableInfo.read(_db, "presence");
        if (! _infoPresence.equals(_existingPresence)) {
          throw new IllegalStateException("Migration didn't properly handle presence(com.project.myapplication.database.PresenceTable).\n"
                  + " Expected:\n" + _infoPresence + "\n"
                  + " Found:\n" + _existingPresence);
        }
      }
    }, "c9987d9ec4463adc6bb2a55aca315483");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "projects","tags","teams","people","globalID","projecttags","projectworkers","teammembers","personalhistory","log","presence");
  }

  @Override
  public DatabaseDao databaseDao() {
    if (_databaseDao != null) {
      return _databaseDao;
    } else {
      synchronized(this) {
        if(_databaseDao == null) {
          _databaseDao = new DatabaseDao_Impl(this);
        }
        return _databaseDao;
      }
    }
  }
}
