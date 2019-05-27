package com.project.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/project/myapplication/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "PREFERENCESNAME", "", "TAG", "kotlin.jvm.PlatformType", "USERID", "db", "Lcom/project/myapplication/database/DatabaseModel;", "globalID", "", "getGlobalID", "()I", "setGlobalID", "(I)V", "requestQueue", "Lcom/android/volley/RequestQueue;", "worker", "Lcom/project/myapplication/database/DbWorkerThread;", "goToRegister", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "restoreData", "saveData", "visitAsGuest", "visitAsUser", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity {
    private final java.lang.String PREFERENCESNAME = "CollabGamesSettings";
    private final java.lang.String USERID = "UserID";
    private com.android.volley.RequestQueue requestQueue;
    private com.project.myapplication.database.DbWorkerThread worker;
    private com.project.myapplication.database.DatabaseModel db;
    private java.lang.String TAG;
    private int globalID;
    private java.util.HashMap _$_findViewCache;
    
    public final int getGlobalID() {
        return 0;
    }
    
    public final void setGlobalID(int p0) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void saveData() {
    }
    
    private final void restoreData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void visitAsUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void goToRegister(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void visitAsGuest(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public MainActivity() {
        super();
    }
}