package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "projecttags", primaryKeys = {"ProjectID", "TagID"}, foreignKeys = {@android.arch.persistence.room.ForeignKey(entity = com.project.myapplication.database.ProjectsTable.class, childColumns = {"ProjectID"}, parentColumns = {"globalID"}), @android.arch.persistence.room.ForeignKey(entity = com.project.myapplication.database.TagsTable.class, childColumns = {"TagID"}, parentColumns = {"ID"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/project/myapplication/database/ProjectTagsTable;", "", "projectId", "", "tagId", "(II)V", "getProjectId", "()I", "setProjectId", "(I)V", "getTagId", "setTagId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class ProjectTagsTable {
    @android.arch.persistence.room.ColumnInfo(name = "ProjectID")
    private int projectId;
    @android.arch.persistence.room.ColumnInfo(name = "TagID")
    private int tagId;
    public static final com.project.myapplication.database.ProjectTagsTable.Companion Companion = null;
    
    public final int getProjectId() {
        return 0;
    }
    
    public final void setProjectId(int p0) {
    }
    
    public final int getTagId() {
        return 0;
    }
    
    public final void setTagId(int p0) {
    }
    
    public ProjectTagsTable(int projectId, int tagId) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.ProjectTagsTable copy(int projectId, int tagId) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/project/myapplication/database/ProjectTagsTable$Companion;", "", "()V", "populateEntity", "", "Lcom/project/myapplication/database/ProjectTagsTable;", "()[Lcom/project/myapplication/database/ProjectTagsTable;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.ProjectTagsTable[] populateEntity() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}