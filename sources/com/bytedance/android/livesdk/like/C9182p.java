package com.bytedance.android.livesdk.like;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.like.p */
public final /* synthetic */ class C9182p implements AbstractC88433f {

    /* renamed from: a */
    private final LikeHelper f22356a;

    /* renamed from: b */
    private final String f22357b;

    static {
        Covode.recordClassIndex(10089);
    }

    C9182p(LikeHelper likeHelper, String str) {
        this.f22356a = likeHelper;
        this.f22357b = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f22356a.mo15285d(this.f22357b);
    }
}
