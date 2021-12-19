package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.k */
public final class C34514k implements AbstractC32080t {

    /* renamed from: a */
    private Context f81501a;

    /* renamed from: b */
    private SharedPreferences f81502b;

    static {
        Covode.recordClassIndex(41472);
    }

    public C34514k(Context context) {
        this.f81501a = context;
        this.f81502b = C34822d.m71158a(context, "LoginSharePreferences", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t
    /* renamed from: a */
    public final void mo58037a(String str) {
        SharedPreferences.Editor edit = this.f81502b.edit();
        edit.putString("latest_login_info", str);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t
    /* renamed from: b */
    public final String mo58039b(String str) {
        return this.f81502b.getString("latest_login_info", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t
    /* renamed from: a */
    public final void mo58038a(boolean z) {
        SharedPreferences.Editor edit = this.f81502b.edit();
        edit.putBoolean("save_login_info", z);
        edit.apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t
    /* renamed from: b */
    public final boolean mo58040b(boolean z) {
        return this.f81502b.getBoolean("save_login_info", z);
    }
}
