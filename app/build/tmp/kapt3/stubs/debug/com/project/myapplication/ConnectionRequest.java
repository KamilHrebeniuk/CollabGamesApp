package com.project.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\fH\u0002J.\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/project/myapplication/ConnectionRequest;", "", "requestQueue", "Lcom/android/volley/RequestQueue;", "listener", "Lcom/project/myapplication/ConnectionRequest$ConnectionRequestListener;", "(Lcom/android/volley/RequestQueue;Lcom/project/myapplication/ConnectionRequest$ConnectionRequestListener;)V", "connectionManager", "Lcom/project/myapplication/ConnectionManager;", "url", "", "loginRequest", "", "login", "password", "makeConnection", "registerRequest", "email", "short_desc", "long_desc", "searchRequest", "target", "query", "page", "ConnectionRequestListener", "app_debug"})
public final class ConnectionRequest {
    private final java.lang.String url = "http:/www.collabgames.pl/scripts/external_communicator.php";
    private com.project.myapplication.ConnectionManager connectionManager;
    private final com.android.volley.RequestQueue requestQueue = null;
    private com.project.myapplication.ConnectionRequest.ConnectionRequestListener listener;
    
    private final void makeConnection() {
    }
    
    public final void loginRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void registerRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String short_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String long_desc) {
    }
    
    public final void searchRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String target, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String page) {
    }
    
    public ConnectionRequest(@org.jetbrains.annotations.NotNull()
    com.android.volley.RequestQueue requestQueue, @org.jetbrains.annotations.NotNull()
    com.project.myapplication.ConnectionRequest.ConnectionRequestListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/project/myapplication/ConnectionRequest$ConnectionRequestListener;", "", "handlePostRequest", "", "response", "", "app_debug"})
    public static abstract interface ConnectionRequestListener {
        
        public abstract void handlePostRequest(@org.jetbrains.annotations.NotNull()
        java.lang.String response);
    }
}