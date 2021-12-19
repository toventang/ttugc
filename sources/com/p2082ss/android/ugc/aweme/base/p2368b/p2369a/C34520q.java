package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.AbstractC57884a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.q */
final class C34520q implements AbstractC57884a {

    /* renamed from: a */
    private Context f81513a;

    /* renamed from: b */
    private SharedPreferences f81514b;

    static {
        Covode.recordClassIndex(41478);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.AbstractC57884a
    /* renamed from: a */
    public final String mo60948a() {
        return this.f81514b.getString("teenage_mode_setting", "");
    }

    public C34520q(Context context) {
        this.f81513a = context;
        this.f81514b = C34822d.m71158a(context, "TeenageModeSetting", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.AbstractC57884a
    /* renamed from: a */
    public final void mo60949a(String str) {
        SharedPreferences.Editor edit = this.f81514b.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
