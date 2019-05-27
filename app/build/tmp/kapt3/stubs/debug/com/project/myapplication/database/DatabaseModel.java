package com.project.myapplication.database;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {com.project.myapplication.database.Converters.class})
@android.arch.persistence.room.Database(entities = {com.project.myapplication.database.ProjectsTable.class, com.project.myapplication.database.TagsTable.class, com.project.myapplication.database.TeamsTable.class, com.project.myapplication.database.PeopleTable.class, com.project.myapplication.database.GlobalIDTable.class, com.project.myapplication.database.ProjectTagsTable.class, com.project.myapplication.database.ProjectWorkersTable.class, com.project.myapplication.database.TeamMembersTable.class, com.project.myapplication.database.PersonalHistoryTable.class, com.project.myapplication.database.LogTable.class, com.project.myapplication.database.PresenceTable.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/project/myapplication/database/DatabaseModel;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "databaseDao", "Lcom/project/myapplication/database/DatabaseDao;", "Companion", "app_debug"})
public abstract class DatabaseModel extends android.arch.persistence.room.RoomDatabase {
    private static volatile com.project.myapplication.database.DatabaseModel INSTANCE;
    private static final java.util.concurrent.ExecutorService IO_EXECUTOR = null;
    public static final com.project.myapplication.database.DatabaseModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.project.myapplication.database.DatabaseDao databaseDao();
    
    public DatabaseModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/project/myapplication/database/DatabaseModel$Companion;", "", "()V", "INSTANCE", "Lcom/project/myapplication/database/DatabaseModel;", "IO_EXECUTOR", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "destroyInstance", "", "getDatabase", "context", "Landroid/content/Context;", "ioThread", "f", "Lkotlin/Function0;", "app_debug"})
    public static final class Companion {
        
        public final void ioThread(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> f) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.project.myapplication.database.DatabaseModel getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}