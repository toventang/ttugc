package com.bytedance.android.live.core.p218f.p220b.p221a;

import android.content.Context;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3924c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.b.a.e */
public final class C3918e implements AbstractC3924c {
    static {
        Covode.recordClassIndex(4447);
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3924c
    /* renamed from: a */
    public final boolean mo9270a(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
