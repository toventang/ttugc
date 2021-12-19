package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.p3439c.AbstractC59237a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.b.a.u */
public final class C34524u implements AbstractC59237a {

    /* renamed from: a */
    private Context f81521a;

    /* renamed from: b */
    private SharedPreferences f81522b;

    static {
        Covode.recordClassIndex(41482);
    }

    public C34524u(Context context) {
        this.f81521a = context;
        this.f81522b = C34822d.m71158a(context, "LogpbPreference", 0);
    }
}
