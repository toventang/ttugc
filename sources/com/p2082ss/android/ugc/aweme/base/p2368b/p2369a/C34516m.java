package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.hitrank.AbstractC42065c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.m */
public final class C34516m implements AbstractC42065c {

    /* renamed from: a */
    private Context f81505a;

    /* renamed from: b */
    private SharedPreferences f81506b;

    static {
        Covode.recordClassIndex(41474);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.hitrank.AbstractC42065c
    /* renamed from: a */
    public final boolean mo60943a() {
        return this.f81506b.getBoolean("hasShowToast", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.hitrank.AbstractC42065c
    /* renamed from: b */
    public final void mo60944b() {
        SharedPreferences.Editor edit = this.f81506b.edit();
        edit.putBoolean("hasShowToast", true);
        edit.apply();
    }

    public C34516m(Context context) {
        this.f81505a = context;
        this.f81506b = C34822d.m71158a(context, "RankSp", 0);
    }
}
