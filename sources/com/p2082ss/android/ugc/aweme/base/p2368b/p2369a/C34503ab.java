package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.AbstractC68791a;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.ab */
public final class C34503ab implements AbstractC68791a {

    /* renamed from: a */
    private Context f81488a;

    /* renamed from: b */
    private SharedPreferences f81489b;

    static {
        Covode.recordClassIndex(41461);
    }

    public C34503ab(Context context) {
        this.f81488a = context;
        this.f81489b = C34822d.m71158a(context, "VerifyActionManager", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.AbstractC68791a
    /* renamed from: a */
    public final void mo60939a(String str) {
        SharedPreferences.Editor edit = this.f81489b.edit();
        edit.putString("verify_action", str);
        edit.apply();
    }
}
