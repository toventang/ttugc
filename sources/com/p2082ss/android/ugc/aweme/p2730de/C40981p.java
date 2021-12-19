package com.p2082ss.android.ugc.aweme.p2730de;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.de.p */
public final class C40981p {

    /* renamed from: a */
    public SharedPreferences f95820a;

    /* renamed from: b */
    private SharedPreferences.Editor f95821b;

    static {
        Covode.recordClassIndex(48833);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70160a() {
        if (this.f95821b == null) {
            this.f95821b = this.f95820a.edit();
        }
        return this.f95821b;
    }

    /* renamed from: a */
    public final int mo70159a(String str) {
        return this.f95820a.getInt(str, 0);
    }

    /* renamed from: b */
    public final boolean mo70163b(String str) {
        return this.f95820a.getBoolean(str, true);
    }

    /* renamed from: c */
    public final void mo70164c(String str) {
        mo70160a().putBoolean(str, false).apply();
    }

    public C40981p(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f95820a = C34822d.m71158a(applicationContext, str, 0);
    }

    /* renamed from: a */
    public final String mo70161a(String str, String str2) {
        return this.f95820a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo70162a(String str, int i) {
        mo70160a().putInt(str, i).apply();
    }
}
