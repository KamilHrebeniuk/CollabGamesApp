package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "projects", foreignKeys = {@android.arch.persistence.room.ForeignKey(entity = com.project.myapplication.database.GlobalIDTable.class, childColumns = {"globalID"}, parentColumns = {"globalID"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0001EBq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0089\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"\u00a8\u0006F"}, d2 = {"Lcom/project/myapplication/database/ProjectsTable;", "", "globalID", "", "name", "", "status", "Lcom/project/myapplication/database/Status;", "distinctions", "www", "startDate", "Ljava/util/Date;", "endDate", "finishedPart", "precision", "shortDesc", "longDesc", "like", "(ILjava/lang/String;Lcom/project/myapplication/database/Status;ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDistinctions", "()I", "setDistinctions", "(I)V", "getEndDate", "()Ljava/util/Date;", "setEndDate", "(Ljava/util/Date;)V", "getFinishedPart", "setFinishedPart", "getGlobalID", "setGlobalID", "getLike", "()Ljava/lang/String;", "setLike", "(Ljava/lang/String;)V", "getLongDesc", "setLongDesc", "getName", "setName", "getPrecision", "setPrecision", "getShortDesc", "setShortDesc", "getStartDate", "setStartDate", "getStatus", "()Lcom/project/myapplication/database/Status;", "setStatus", "(Lcom/project/myapplication/database/Status;)V", "getWww", "setWww", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class ProjectsTable {
    @android.arch.persistence.room.ColumnInfo(name = "globalID")
    @android.arch.persistence.room.PrimaryKey()
    private int globalID;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "Name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "Status")
    private com.project.myapplication.database.Status status;
    @android.arch.persistence.room.ColumnInfo(name = "Distinctions")
    private int distinctions;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "WWW")
    private java.lang.String www;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "StartDate")
    private java.util.Date startDate;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "EndDate")
    private java.util.Date endDate;
    @android.arch.persistence.room.ColumnInfo(name = "FinishedPart")
    private int finishedPart;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "Precision")
    private java.lang.String precision;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "ShortDesc")
    private java.lang.String shortDesc;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "LongDesc")
    private java.lang.String longDesc;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "Like")
    private java.lang.String like;
    public static final com.project.myapplication.database.ProjectsTable.Companion Companion = null;
    
    public final int getGlobalID() {
        return 0;
    }
    
    public final void setGlobalID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Status p0) {
    }
    
    public final int getDistinctions() {
        return 0;
    }
    
    public final void setDistinctions(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWww() {
        return null;
    }
    
    public final void setWww(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getStartDate() {
        return null;
    }
    
    public final void setStartDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getEndDate() {
        return null;
    }
    
    public final void setEndDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    public final int getFinishedPart() {
        return 0;
    }
    
    public final void setFinishedPart(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrecision() {
        return null;
    }
    
    public final void setPrecision(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortDesc() {
        return null;
    }
    
    public final void setShortDesc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLongDesc() {
        return null;
    }
    
    public final void setLongDesc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLike() {
        return null;
    }
    
    public final void setLike(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ProjectsTable(int globalID, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Status status, int distinctions, @org.jetbrains.annotations.Nullable()
    java.lang.String www, @org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.Nullable()
    java.util.Date endDate, int finishedPart, @org.jetbrains.annotations.Nullable()
    java.lang.String precision, @org.jetbrains.annotations.NotNull()
    java.lang.String shortDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String longDesc, @org.jetbrains.annotations.Nullable()
    java.lang.String like) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Status component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.ProjectsTable copy(int globalID, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Status status, int distinctions, @org.jetbrains.annotations.Nullable()
    java.lang.String www, @org.jetbrains.annotations.NotNull()
    java.util.Date startDate, @org.jetbrains.annotations.Nullable()
    java.util.Date endDate, int finishedPart, @org.jetbrains.annotations.Nullable()
    java.lang.String precision, @org.jetbrains.annotations.NotNull()
    java.lang.String shortDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String longDesc, @org.jetbrains.annotations.Nullable()
    java.lang.String like) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/project/myapplication/database/ProjectsTable$Companion;", "", "()V", "populateEntity", "", "Lcom/project/myapplication/database/ProjectsTable;", "()[Lcom/project/myapplication/database/ProjectsTable;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.ProjectsTable[] populateEntity() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}