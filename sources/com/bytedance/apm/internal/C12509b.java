package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.SharedPreferencesC12438d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.internal.b */
public final class C12509b {

    /* renamed from: a */
    public final SharedPreferences f30378a;

    static {
        Covode.recordClassIndex(14325);
    }

    /* renamed from: com.bytedance.apm.internal.b$a */
    public static class C12510a {

        /* renamed from: a */
        public static final C12509b f30379a = new C12509b((byte) 0);

        static {
            Covode.recordClassIndex(14326);
        }
    }

    private C12509b() {
        this.f30378a = SharedPreferencesC12438d.m22396a(C12397c.f29931a, "monitor_config");
    }

    /* synthetic */ C12509b(byte b) {
        this();
    }

    /* renamed from: a */
    public final String mo20339a(String str) {
        return this.f30378a.getString(str, null);
    }

    /* renamed from: b */
    public final long mo20342b(String str) {
        return this.f30378a.getLong(str, 0);
    }

    /* renamed from: a */
    public final void mo20340a(String str, long j) {
        this.f30378a.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final void mo20341a(String str, String str2) {
        this.f30378a.edit().putString(str, str2).apply();
    }
}
