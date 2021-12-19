package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61567b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.w */
final class C34526w implements AbstractC61567b {

    /* renamed from: a */
    private Context f81525a;

    /* renamed from: b */
    private SharedPreferences f81526b;

    static {
        Covode.recordClassIndex(41484);
    }

    public C34526w(Context context) {
        this.f81525a = context;
        this.f81526b = C34822d.m71158a(context, "default_config", 0);
    }
}
