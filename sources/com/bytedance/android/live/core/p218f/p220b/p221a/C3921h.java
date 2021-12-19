package com.bytedance.android.live.core.p218f.p220b.p221a;

import android.content.Context;
import com.bytedance.android.live.core.p218f.C3904ad;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3924c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.b.a.h */
public final class C3921h implements AbstractC3924c {
    static {
        Covode.recordClassIndex(4450);
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3924c
    /* renamed from: a */
    public final boolean mo9270a(Context context) {
        if (C3904ad.m9537b("ro.miui.notch") == 1) {
            return true;
        }
        return false;
    }
}
