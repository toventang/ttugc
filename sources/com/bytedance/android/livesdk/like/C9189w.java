package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.like.w */
final /* synthetic */ class C9189w implements AbstractC88433f {

    /* renamed from: a */
    private final OptimizedLikeHelper f22367a;

    /* renamed from: b */
    private final String f22368b;

    static {
        Covode.recordClassIndex(10096);
    }

    C9189w(OptimizedLikeHelper optimizedLikeHelper, String str) {
        this.f22367a = optimizedLikeHelper;
        this.f22368b = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f22367a.mo15303a(this.f22368b, (Throwable) obj);
    }
}
