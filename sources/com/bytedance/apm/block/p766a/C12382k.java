package com.bytedance.apm.block.p766a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.apm.block.a.k */
public final class C12382k {

    /* renamed from: a */
    static SharedPreferences f29865a;

    static {
        Covode.recordClassIndex(14188);
    }

    /* renamed from: a */
    static synchronized void m22238a(Context context) {
        synchronized (C12382k.class) {
            if (f29865a == null) {
                f29865a = C34822d.m71158a(context, "evil_method_SPUtils", 0);
            }
        }
    }
}
