package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.AbstractC33921c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.n */
public final class C34517n implements AbstractC33921c {

    /* renamed from: a */
    private Context f81507a;

    /* renamed from: b */
    private SharedPreferences f81508b;

    static {
        Covode.recordClassIndex(41475);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2335aq.p2336a.AbstractC33921c
    /* renamed from: a */
    public final long mo60159a() {
        return this.f81508b.getLong("shotLastShowTime", 0);
    }

    public C34517n(Context context) {
        this.f81507a = context;
        this.f81508b = C34822d.m71158a(context, "ShowXmaxTreeCache", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2335aq.p2336a.AbstractC33921c
    /* renamed from: a */
    public final void mo60160a(long j) {
        SharedPreferences.Editor edit = this.f81508b.edit();
        edit.putLong("shotLastShowTime", j);
        edit.apply();
    }
}
