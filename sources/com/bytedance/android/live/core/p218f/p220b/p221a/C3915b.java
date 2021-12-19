package com.bytedance.android.live.core.p218f.p220b.p221a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3904ad;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3924c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.b.a.b */
public final class C3915b implements AbstractC3924c {
    static {
        Covode.recordClassIndex(4444);
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3924c
    /* renamed from: a */
    public final boolean mo9270a(Context context) {
        try {
            String a = C3904ad.m9536a("ro.hmct.notch_height");
            String a2 = C3904ad.m9536a("ro.hmct.notch_width");
            if (!TextUtils.equals(a.trim(), "0") && !TextUtils.isEmpty(a.trim()) && !TextUtils.equals(a2.trim(), "0")) {
                if (!TextUtils.isEmpty(a2.trim())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
