package com.bytedance.lobby;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lobby.c */
public final class C20891c extends Exception {

    /* renamed from: a */
    private int f49395a;

    /* renamed from: b */
    private String f49396b;

    /* renamed from: c */
    private int f49397c;

    /* renamed from: d */
    private boolean f49398d;

    /* renamed from: e */
    private boolean f49399e;

    /* renamed from: f */
    private String f49400f;

    static {
        Covode.recordClassIndex(24479);
    }

    public final int getErrorCode() {
        return this.f49395a;
    }

    public final String getErrorStage() {
        return this.f49400f;
    }

    public final int getProviderErrorCode() {
        return this.f49397c;
    }

    public final boolean isCancelled() {
        return this.f49399e;
    }

    public final boolean isFromLobby() {
        return this.f49398d;
    }

    public final String getMessage() {
        if (getCause() != null) {
            return super.getMessage();
        }
        return this.f49396b;
    }

    public final String toString() {
        if (getCause() != null) {
            return super.toString();
        }
        return "LobbyException{code: " + getErrorCode() + ", providerCode: " + getProviderErrorCode() + ", message: " + getMessage() + ", cancelled: " + isCancelled() + ", fromLobby: " + isFromLobby() + "}";
    }

    public final C20891c setCancelled(boolean z) {
        this.f49399e = z;
        return this;
    }

    public C20891c(Exception exc) {
        super(exc);
        this.f49395a = -999;
    }

    public C20891c(int i, String str) {
        this(i, 0, str, "");
    }

    public C20891c(int i, int i2, String str) {
        this(i, i2, str, "");
    }

    public C20891c(int i, String str, String str2) {
        this(i, 0, str, str2);
    }

    public C20891c(int i, int i2, String str, String str2) {
        this.f49395a = -999;
        this.f49395a = i;
        this.f49397c = i2;
        this.f49396b = TextUtils.isEmpty(str) ? "" : str;
        this.f49398d = true;
        this.f49400f = str2;
        if (i == 4) {
            setCancelled(true);
        }
    }
}
