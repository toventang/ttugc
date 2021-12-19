package com.bytedance.android.livesdk.like;

import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.like.t */
final /* synthetic */ class C9186t implements AbstractC88433f {

    /* renamed from: a */
    private final LikeHelper f22362a;

    static {
        Covode.recordClassIndex(10093);
    }

    C9186t(LikeHelper likeHelper) {
        this.f22362a = likeHelper;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LikeHelper likeHelper = this.f22362a;
        LikeHelper.C9166c cVar = (LikeHelper.C9166c) obj;
        likeHelper.f22315r.put(cVar.f22328b, cVar.f22329c);
        if (cVar.f22327a) {
            likeHelper.f22316s.add(cVar.f22329c);
        }
    }
}
