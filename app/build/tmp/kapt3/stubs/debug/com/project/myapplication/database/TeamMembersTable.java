package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "teammembers", primaryKeys = {"TeamID", "MemberID"}, indices = {@android.arch.persistence.room.Index(unique = true, value = {"TeamID", "MemberID"}), @android.arch.persistence.room.Index(value = {"MemberID"})}, foreignKeys = {@android.arch.persistence.room.ForeignKey(entity = com.project.myapplication.database.GlobalIDTable.class, childColumns = {"MemberID"}, parentColumns = {"globalID"}), @android.arch.persistence.room.ForeignKey(entity = com.project.myapplication.database.TeamsTable.class, childColumns = {"TeamID"}, parentColumns = {"globalID"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/project/myapplication/database/TeamMembersTable;", "", "teamId", "", "memberId", "type", "Lcom/project/myapplication/database/Type;", "role", "Lcom/project/myapplication/database/Role;", "(IILcom/project/myapplication/database/Type;Lcom/project/myapplication/database/Role;)V", "getMemberId", "()I", "setMemberId", "(I)V", "getRole", "()Lcom/project/myapplication/database/Role;", "setRole", "(Lcom/project/myapplication/database/Role;)V", "getTeamId", "setTeamId", "getType", "()Lcom/project/myapplication/database/Type;", "setType", "(Lcom/project/myapplication/database/Type;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class TeamMembersTable {
    @android.arch.persistence.room.ColumnInfo(name = "TeamID")
    private int teamId;
    @android.arch.persistence.room.ColumnInfo(name = "MemberID")
    private int memberId;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "Type")
    private com.project.myapplication.database.Type type;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "Role")
    private com.project.myapplication.database.Role role;
    public static final com.project.myapplication.database.TeamMembersTable.Companion Companion = null;
    
    public final int getTeamId() {
        return 0;
    }
    
    public final void setTeamId(int p0) {
    }
    
    public final int getMemberId() {
        return 0;
    }
    
    public final void setMemberId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Type getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Type p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Role getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Role p0) {
    }
    
    public TeamMembersTable(int teamId, int memberId, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Type type, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Role role) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Type component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.Role component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.myapplication.database.TeamMembersTable copy(int teamId, int memberId, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Type type, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Role role) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/project/myapplication/database/TeamMembersTable$Companion;", "", "()V", "populateEntity", "", "Lcom/project/myapplication/database/TeamMembersTable;", "()[Lcom/project/myapplication/database/TeamMembersTable;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.TeamMembersTable[] populateEntity() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}