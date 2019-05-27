package com.project.myapplication.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/project/myapplication/database/Converters;", "", "()V", "Companion", "app_debug"})
public final class Converters {
    public static final com.project.myapplication.database.Converters.Companion Companion = null;
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public static final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.TypeConverter()
    public static final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final java.lang.String typeToString(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final com.project.myapplication.database.Type stringToType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final java.lang.String statusToString(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Status type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final com.project.myapplication.database.Status stringToStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final java.lang.String precisionToString(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Precision type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final com.project.myapplication.database.Precision stringToPrecision(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final java.lang.String roleToString(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Role type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final com.project.myapplication.database.Role stringToRole(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final java.lang.String actionToString(@org.jetbrains.annotations.NotNull()
    com.project.myapplication.database.Action type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public static final com.project.myapplication.database.Action stringToAction(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/project/myapplication/database/Converters$Companion;", "", "()V", "actionToString", "", "type", "Lcom/project/myapplication/database/Action;", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromTimestamp", "value", "(Ljava/lang/Long;)Ljava/util/Date;", "precisionToString", "Lcom/project/myapplication/database/Precision;", "roleToString", "Lcom/project/myapplication/database/Role;", "statusToString", "Lcom/project/myapplication/database/Status;", "stringToAction", "stringToPrecision", "stringToRole", "stringToStatus", "stringToType", "Lcom/project/myapplication/database/Type;", "typeToString", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        @android.arch.persistence.room.TypeConverter()
        public final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable()
        java.lang.Long value) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @android.arch.persistence.room.TypeConverter()
        public final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.Nullable()
        java.util.Date date) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final java.lang.String typeToString(@org.jetbrains.annotations.NotNull()
        com.project.myapplication.database.Type type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final com.project.myapplication.database.Type stringToType(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final java.lang.String statusToString(@org.jetbrains.annotations.NotNull()
        com.project.myapplication.database.Status type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final com.project.myapplication.database.Status stringToStatus(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final java.lang.String precisionToString(@org.jetbrains.annotations.NotNull()
        com.project.myapplication.database.Precision type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final com.project.myapplication.database.Precision stringToPrecision(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final java.lang.String roleToString(@org.jetbrains.annotations.NotNull()
        com.project.myapplication.database.Role type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final com.project.myapplication.database.Role stringToRole(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final java.lang.String actionToString(@org.jetbrains.annotations.NotNull()
        com.project.myapplication.database.Action type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.arch.persistence.room.TypeConverter()
        public final com.project.myapplication.database.Action stringToAction(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}