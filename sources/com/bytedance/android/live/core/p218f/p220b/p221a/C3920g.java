package com.bytedance.android.live.core.p218f.p220b.p221a;

import android.content.Context;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3924c;
import com.bytedance.common.utility.reflect.C13637b;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.b.a.g */
public final class C3920g implements AbstractC3924c {
    static {
        Covode.recordClassIndex(4449);
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3924c
    /* renamed from: a */
    public final boolean mo9270a(Context context) {
        try {
            return ((Boolean) Reflect.m24530on("android.util.FtFeature").call("isFeatureSupport", new Class[]{Integer.class}, 32).get()).booleanValue();
        } catch (C13637b unused) {
            return false;
        }
    }
}
