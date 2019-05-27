package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "log", indices = {@android.arch.persistence.room.Index(unique = false, value = {"globalID"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/project/myapplication/database/LogTable;", "", "globalId", "", "action", "Lcom/project/myapplication/database/Action;", "actionTime", "Ljava/util/Date;", "(ILcom/project/myapplication/database/Action;Ljava/util/Date;)V", "getAction", "()Lcom/project/myapplication/database/Action;", "setAction", "(Lcom/project/myapplication/database/Action;)V", "getActionTime", "()Ljava/util/Date;", "setActionTime", "(Ljava/util/Date;)V", "getGlobalId", "()I", "setGlobalId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class LogTable {
    @android.arch.persistence.room.ColumnInfo(name = "globalID")
    @android.arch.persistence.room.PrimaryKey()
    private int globalId;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "Action")
    private com.project.myapplication.database.Action action;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "ActionTime")
    private java.util.Date actionTime;
    public static final com.project.myapplication.database.LogTable.Companion Companion = null;
    
    public final int getGlobalId() {
        return 0;
    }
    
    public final void setGlobalId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Action getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Action p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getActionTime() {
        return null;
    }
    
    public final void setActionTime(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public LogTable(int globalId, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Action action, @org.jetbrains.annotations.NotNull()
    java.util.Date actionTime) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Action component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.LogTable copy(int globalId, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Action action, @org.jetbrains.annotations.NotNull()
    java.util.Date actionTime) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/project/myapplication/database/LogTable$Companion;", "", "()V", "populateEntity", "", "Lcom/project/myapplication/database/LogTable;", "()[Lcom/project/myapplication/database/LogTable;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.LogTable[] populateEntity() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}