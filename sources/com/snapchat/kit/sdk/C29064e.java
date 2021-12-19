package com.snapchat.kit.sdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.core.p2067a.C28953a;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;

/* renamed from: com.snapchat.kit.sdk.e */
public final class C29064e {

    /* renamed from: a */
    private volatile C28953a f68652a;

    /* renamed from: b */
    private final SecureSharedPreferences f68653b;

    /* renamed from: c */
    private final C29072l f68654c;

    static {
        Covode.recordClassIndex(35413);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo50738f() {
        if (!TextUtils.isEmpty(mo50737e())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized String mo50736d() {
        MethodCollector.m26663i(8819);
        if (this.f68652a == null) {
            MethodCollector.m26664o(8819);
            return null;
        }
        String accessToken = this.f68652a.getAccessToken();
        MethodCollector.m26664o(8819);
        return accessToken;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized String mo50737e() {
        MethodCollector.m26663i(8973);
        if (this.f68652a == null) {
            MethodCollector.m26664o(8973);
            return null;
        }
        String refreshToken = this.f68652a.getRefreshToken();
        MethodCollector.m26664o(8973);
        return refreshToken;
    }

    /* renamed from: b */
    public final synchronized boolean mo50734b() {
        MethodCollector.m26663i(8528);
        if (this.f68652a == null) {
            MethodCollector.m26664o(8528);
            return false;
        } else if (this.f68652a.isExpired()) {
            MethodCollector.m26664o(8528);
            return true;
        } else {
            boolean willBeExpiredAfter = this.f68652a.willBeExpiredAfter(300000L);
            MethodCollector.m26664o(8528);
            return willBeExpiredAfter;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized String mo50735c() {
        MethodCollector.m26663i(8667);
        if (this.f68652a != null && !this.f68652a.isExpired()) {
            if (!this.f68652a.willBeExpiredAfter(300000L)) {
                String accessToken = this.f68652a.getAccessToken();
                MethodCollector.m26664o(8667);
                return accessToken;
            }
        }
        MethodCollector.m26664o(8667);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo50739g() {
        MethodCollector.m26663i(9126);
        this.f68652a = null;
        SecureSharedPreferences secureSharedPreferences = this.f68653b;
        if (secureSharedPreferences != null) {
            secureSharedPreferences.clearEntry("auth_token");
        }
        this.f68654c.clearEntry("auth_token");
        MethodCollector.m26664o(9126);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo50732a() {
        MethodCollector.m26663i(8526);
        if (this.f68652a == null || this.f68652a.isComplete()) {
            MethodCollector.m26664o(8526);
            return false;
        }
        MethodCollector.m26664o(8526);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo50731a(C28953a aVar) {
        MethodCollector.m26663i(9127);
        if (this.f68652a == null || this.f68652a.getLastUpdated() <= aVar.getLastUpdated()) {
            this.f68652a = aVar;
            this.f68654c.put("auth_token", this.f68652a);
            SecureSharedPreferences secureSharedPreferences = this.f68653b;
            if (secureSharedPreferences != null) {
                secureSharedPreferences.clearEntry("auth_token");
            }
        }
        MethodCollector.m26664o(9127);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo50733a(String str) {
        MethodCollector.m26663i(8366);
        if (this.f68652a == null || !this.f68652a.hasAccessToScope(str)) {
            MethodCollector.m26664o(8366);
            return false;
        }
        MethodCollector.m26664o(8366);
        return true;
    }

    C29064e(SecureSharedPreferences secureSharedPreferences, C29072l lVar) {
        this.f68653b = secureSharedPreferences;
        this.f68654c = lVar;
        this.f68652a = (C28953a) lVar.get("auth_token", C28953a.class);
        if (this.f68652a == null && secureSharedPreferences != null) {
            this.f68652a = (C28953a) secureSharedPreferences.get("auth_token", C28953a.class);
        }
    }
}
