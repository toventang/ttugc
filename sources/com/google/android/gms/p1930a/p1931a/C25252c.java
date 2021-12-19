package com.google.android.gms.p1930a.p1931a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25504g;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.google.android.gms.a.a.c */
public final class C25252c {

    /* renamed from: a */
    private SharedPreferences f59864a;

    static {
        Covode.recordClassIndex(30624);
    }

    public C25252c(Context context) {
        try {
            Context d = C25504g.m49188d(context);
            this.f59864a = d == null ? null : C34822d.m71158a(d, "google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f59864a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo41291a(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f59864a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo41292a(String str) {
        try {
            SharedPreferences sharedPreferences = this.f59864a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo41293b(String str) {
        try {
            SharedPreferences sharedPreferences = this.f59864a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
