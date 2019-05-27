package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\'\u00a2\u0006\u0002\u0010\tJ!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0007\"\u00020\nH\'\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\"\u00020\fH\'\u00a2\u0006\u0002\u0010\rJ!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0007\"\u00020\u000eH\'\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0007\"\u00020\u0010H\'\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0007\"\u00020\u0012H\'\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0007\"\u00020\u0014H\'\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0007\"\u00020\u0016H\'\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0007\"\u00020\u0018H\'\u00a2\u0006\u0002\u0010\u0019J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0007\"\u00020\u001aH\'\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/project/myapplication/database/DatabaseDao;", "", "initialQuery", "", "insertAll", "", "objects", "", "Lcom/project/myapplication/database/GlobalIDTable;", "([Lcom/project/myapplication/database/GlobalIDTable;)V", "Lcom/project/myapplication/database/LogTable;", "([Lcom/project/myapplication/database/LogTable;)V", "Lcom/project/myapplication/database/PeopleTable;", "([Lcom/project/myapplication/database/PeopleTable;)V", "Lcom/project/myapplication/database/PersonalHistoryTable;", "([Lcom/project/myapplication/database/PersonalHistoryTable;)V", "Lcom/project/myapplication/database/ProjectTagsTable;", "([Lcom/project/myapplication/database/ProjectTagsTable;)V", "Lcom/project/myapplication/database/ProjectWorkersTable;", "([Lcom/project/myapplication/database/ProjectWorkersTable;)V", "Lcom/project/myapplication/database/ProjectsTable;", "([Lcom/project/myapplication/database/ProjectsTable;)V", "Lcom/project/myapplication/database/TagsTable;", "([Lcom/project/myapplication/database/TagsTable;)V", "Lcom/project/myapplication/database/TeamMembersTable;", "([Lcom/project/myapplication/database/TeamMembersTable;)V", "Lcom/project/myapplication/database/TeamsTable;", "([Lcom/project/myapplication/database/TeamsTable;)V", "testQuery", "()[Lcom/project/myapplication/database/GlobalIDTable;", "app_debug"})
public abstract interface DatabaseDao {
    
    @android.arch.persistence.room.Query(value = "SELECT 1")
    public abstract int initialQuery();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM globalID")
    public abstract com.project.myapplication.database.GlobalIDTable[] testQuery();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.GlobalIDTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.LogTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.PeopleTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.PersonalHistoryTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.ProjectsTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.ProjectTagsTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.ProjectWorkersTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.TagsTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.TeamMembersTable... objects);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.ABORT)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.TeamsTable... objects);
}