package com.project.myapplication.database;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;

public class DatabaseDao_Impl implements DatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGlobalIDTable;

  private final EntityInsertionAdapter __insertionAdapterOfLogTable;

  private final EntityInsertionAdapter __insertionAdapterOfPeopleTable;

  private final EntityInsertionAdapter __insertionAdapterOfPersonalHistoryTable;

  private final EntityInsertionAdapter __insertionAdapterOfProjectsTable;

  private final EntityInsertionAdapter __insertionAdapterOfProjectTagsTable;

  private final EntityInsertionAdapter __insertionAdapterOfProjectWorkersTable;

  private final EntityInsertionAdapter __insertionAdapterOfTagsTable;

  private final EntityInsertionAdapter __insertionAdapterOfTeamMembersTable;

  private final EntityInsertionAdapter __insertionAdapterOfTeamsTable;

  public DatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGlobalIDTable = new EntityInsertionAdapter<GlobalIDTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `globalID`(`globalID`,`URL`,`Type`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GlobalIDTable value) {
        stmt.bindLong(1, value.getGlobalId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        final String _tmp;
        _tmp = Converters.typeToString(value.getType());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__insertionAdapterOfLogTable = new EntityInsertionAdapter<LogTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `log`(`globalID`,`Action`,`ActionTime`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LogTable value) {
        stmt.bindLong(1, value.getGlobalId());
        final String _tmp;
        _tmp = Converters.actionToString(value.getAction());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = Converters.dateToTimestamp(value.getActionTime());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp_1);
        }
      }
    };
    this.__insertionAdapterOfPeopleTable = new EntityInsertionAdapter<PeopleTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `people`(`globalID`,`Name`,`Email`,`Password`,`Status`,`Distinctions`,`WWW`,`StartDate`,`ShortDesc`,`LongDesc`,`Like`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PeopleTable value) {
        stmt.bindLong(1, value.getGlobalId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPassword());
        }
        final String _tmp;
        _tmp = Converters.statusToString(value.getStatus());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        stmt.bindLong(6, value.getDistinctions());
        if (value.getWww() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWww());
        }
        final Long _tmp_1;
        _tmp_1 = Converters.dateToTimestamp(value.getStartDate());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_1);
        }
        if (value.getShortDesc() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getShortDesc());
        }
        if (value.getLongDesc() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLongDesc());
        }
        if (value.getLike() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getLike());
        }
      }
    };
    this.__insertionAdapterOfPersonalHistoryTable = new EntityInsertionAdapter<PersonalHistoryTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `personalhistory`(`ID`,`PersonID`,`VisitedID`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PersonalHistoryTable value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getPersonId());
        stmt.bindLong(3, value.getVisitedId());
      }
    };
    this.__insertionAdapterOfProjectsTable = new EntityInsertionAdapter<ProjectsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `projects`(`globalID`,`Name`,`Status`,`Distinctions`,`WWW`,`StartDate`,`EndDate`,`FinishedPart`,`Precision`,`ShortDesc`,`LongDesc`,`Like`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProjectsTable value) {
        stmt.bindLong(1, value.getGlobalID());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = Converters.statusToString(value.getStatus());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getDistinctions());
        if (value.getWww() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWww());
        }
        final Long _tmp_1;
        _tmp_1 = Converters.dateToTimestamp(value.getStartDate());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = Converters.dateToTimestamp(value.getEndDate());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_2);
        }
        stmt.bindLong(8, value.getFinishedPart());
        if (value.getPrecision() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPrecision());
        }
        if (value.getShortDesc() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getShortDesc());
        }
        if (value.getLongDesc() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getLongDesc());
        }
        if (value.getLike() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getLike());
        }
      }
    };
    this.__insertionAdapterOfProjectTagsTable = new EntityInsertionAdapter<ProjectTagsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `projecttags`(`ProjectID`,`TagID`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProjectTagsTable value) {
        stmt.bindLong(1, value.getProjectId());
        stmt.bindLong(2, value.getTagId());
      }
    };
    this.__insertionAdapterOfProjectWorkersTable = new EntityInsertionAdapter<ProjectWorkersTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `projectworkers`(`ProjectID`,`WorkerID`,`Role`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProjectWorkersTable value) {
        stmt.bindLong(1, value.getProjectID());
        stmt.bindLong(2, value.getWorkerId());
        final String _tmp;
        _tmp = Converters.roleToString(value.getRole());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__insertionAdapterOfTagsTable = new EntityInsertionAdapter<TagsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `tags`(`ID`,`Tag`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TagsTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getTag() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTag());
        }
      }
    };
    this.__insertionAdapterOfTeamMembersTable = new EntityInsertionAdapter<TeamMembersTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `teammembers`(`TeamID`,`MemberID`,`Type`,`Role`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TeamMembersTable value) {
        stmt.bindLong(1, value.getTeamId());
        stmt.bindLong(2, value.getMemberId());
        final String _tmp;
        _tmp = Converters.typeToString(value.getType());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = Converters.roleToString(value.getRole());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
      }
    };
    this.__insertionAdapterOfTeamsTable = new EntityInsertionAdapter<TeamsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `teams`(`globalID`,`Name`,`Status`,`Distinctions`,`WWW`,`StartDate`,`ShortDesc`,`LongDesc`,`Like`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TeamsTable value) {
        stmt.bindLong(1, value.getGlobalId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = Converters.statusToString(value.getStatus());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getDistinctions());
        if (value.getWww() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWww());
        }
        final Long _tmp_1;
        _tmp_1 = Converters.dateToTimestamp(value.getStartDate());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp_1);
        }
        if (value.getShortDesc() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getShortDesc());
        }
        if (value.getLongDesc() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLongDesc());
        }
        if (value.getLike() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLike());
        }
      }
    };
  }

  @Override
  public void insertAll(GlobalIDTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGlobalIDTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(LogTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLogTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(PeopleTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPeopleTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(PersonalHistoryTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPersonalHistoryTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(ProjectsTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfProjectsTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(ProjectTagsTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfProjectTagsTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(ProjectWorkersTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfProjectWorkersTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(TagsTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTagsTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(TeamMembersTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTeamMembersTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(TeamsTable... objects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTeamsTable.insert(objects);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int initialQuery() {
    final String _sql = "SELECT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public GlobalIDTable[] testQuery() {
    final String _sql = "SELECT * FROM globalID";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfGlobalId = _cursor.getColumnIndexOrThrow("globalID");
      final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("URL");
      final int _cursorIndexOfType = _cursor.getColumnIndexOrThrow("Type");
      final GlobalIDTable[] _result = new GlobalIDTable[_cursor.getCount()];
      int _index = 0;
      while(_cursor.moveToNext()) {
        final GlobalIDTable _item;
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        final Type _tmpType;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfType);
        _tmpType = Converters.stringToType(_tmp);
        _item = new GlobalIDTable(_tmpUrl,_tmpType);
        final int _tmpGlobalId;
        _tmpGlobalId = _cursor.getInt(_cursorIndexOfGlobalId);
        _item.setGlobalId(_tmpGlobalId);
        _result[_index] = _item;
        _index ++;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
