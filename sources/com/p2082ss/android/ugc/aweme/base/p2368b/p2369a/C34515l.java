package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.AbstractC40105b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.l */
public final class C34515l implements AbstractC40105b {

    /* renamed from: a */
    private Context f81503a;

    /* renamed from: b */
    private SharedPreferences f81504b;

    static {
        Covode.recordClassIndex(41473);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.AbstractC40105b
    /* renamed from: a */
    public final String mo60941a() {
        return this.f81504b.getString("teenage_mode_setting", "");
    }

    public C34515l(Context context) {
        this.f81503a = context;
        this.f81504b = C34822d.m71158a(context, "TeenageModeSetting", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.AbstractC40105b
    /* renamed from: a */
    public final void mo60942a(String str) {
        SharedPreferences.Editor edit = this.f81504b.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
