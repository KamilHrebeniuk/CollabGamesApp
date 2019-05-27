package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "personalhistory", indices = {@android.arch.persistence.room.Index(unique = false, value = {"PersonID", "VisitedID"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/project/myapplication/database/PersonalHistoryTable;", "", "personId", "", "visitedId", "(II)V", "id", "getId", "()I", "setId", "(I)V", "getPersonId", "setPersonId", "getVisitedId", "setVisitedId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class PersonalHistoryTable {
    @android.arch.persistence.room.ColumnInfo(name = "ID")
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int id;
    @android.arch.persistence.room.ColumnInfo(name = "PersonID")
    private int personId;
    @android.arch.persistence.room.ColumnInfo(name = "VisitedID")
    private int visitedId;
    public static final com.project.myapplication.database.PersonalHistoryTable.Companion Companion = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getPersonId() {
        return 0;
    }
    
    public final void setPersonId(int p0) {
    }
    
    public final int getVisitedId() {
        return 0;
    }
    
    public final void setVisitedId(int p0) {
    }
    
    public PersonalHistoryTable(int personId, int visitedId) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.PersonalHistoryTable copy(int personId, int visitedId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/project/myapplication/database/PersonalHistoryTable$Companion;", "", "()V", "populateEntity", "", "Lcom/project/myapplication/database/PersonalHistoryTable;", "()[Lcom/project/myapplication/database/PersonalHistoryTable;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.PersonalHistoryTable[] populateEntity() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}