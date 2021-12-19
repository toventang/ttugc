package com.p2082ss.android.ugc.aweme.base.p2377h;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.base.h.e */
public final class C34598e {

    /* renamed from: a */
    public SharedPreferences f81646a;

    /* renamed from: b */
    private SharedPreferences.Editor f81647b;

    static {
        Covode.recordClassIndex(41560);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo61050a() {
        if (this.f81647b == null) {
            this.f81647b = this.f81646a.edit();
        }
        return this.f81647b;
    }

    /* renamed from: a */
    public final long mo61049a(String str) {
        return this.f81646a.getLong(str, 0);
    }

    /* renamed from: a */
    public final int mo61048a(String str, int i) {
        return this.f81646a.getInt(str, i);
    }

    public C34598e(Context context, String str) {
        this.f81646a = C34822d.m71158a(context, str, 0);
    }

    /* renamed from: b */
    public final void mo61056b(String str, int i) {
        mo61050a().putInt(str, i).apply();
    }

    /* renamed from: b */
    public final void mo61057b(String str, String str2) {
        mo61050a().putString(str, str2).apply();
    }

    /* renamed from: a */
    public final String mo61051a(String str, String str2) {
        return this.f81646a.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo61058b(String str, boolean z) {
        mo61050a().putBoolean(str, z).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.util.List<T> mo61052a(java.lang.String r3, java.lang.Class<T> r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r2.mo61051a(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0015
            java.util.List r0 = com.p2082ss.android.ugc.aweme.utils.C80361dw.m139335b(r1, r4)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0016
        L_0x0011:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2377h.C34598e.mo61052a(java.lang.String, java.lang.Class):java.util.List");
    }

    /* renamed from: a */
    public final void mo61053a(String str, long j) {
        mo61050a().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final void mo61054a(String str, Set<String> set) {
        mo61050a().putStringSet(str, set).apply();
    }

    /* renamed from: a */
    public final boolean mo61055a(String str, boolean z) {
        return this.f81646a.getBoolean(str, z);
    }
}
