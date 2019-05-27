package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "presence", foreignKeys = {@android.arch.persistence.room.ForeignKey(entity = com.project.myapplication.database.GlobalIDTable.class, childColumns = {"globalID"}, parentColumns = {"globalID"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/project/myapplication/database/PresenceTable;", "", "globalId", "", "presenceDate", "Ljava/util/Date;", "(ILjava/util/Date;)V", "getGlobalId", "()I", "setGlobalId", "(I)V", "getPresenceDate", "()Ljava/util/Date;", "setPresenceDate", "(Ljava/util/Date;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class PresenceTable {
    @android.arch.persistence.room.PrimaryKey()
    @android.arch.persistence.room.ColumnInfo(name = "globalID")
    private int globalId;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "PresenceDate")
    private java.util.Date presenceDate;
    public static final com.project.myapplication.database.PresenceTable.Companion Companion = null;
    
    public final int getGlobalId() {
        return 0;
    }
    
    public final void setGlobalId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getPresenceDate() {
        return null;
    }
    
    public final void setPresenceDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public PresenceTable(int globalId, @org.jetbrains.annotations.NotNull()
    java.util.Date presenceDate) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.PresenceTable copy(int globalId, @org.jetbrains.annotations.NotNull()
    java.util.Date presenceDate) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/project/myapplication/database/PresenceTable$Companion;", "", "()V", "populateEntity", "", "Lcom/project/myapplication/database/PresenceTable;", "()[Lcom/project/myapplication/database/PresenceTable;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.PresenceTable[] populateEntity() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}