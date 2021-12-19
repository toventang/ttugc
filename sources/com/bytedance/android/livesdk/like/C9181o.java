package com.bytedance.android.livesdk.like;

import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.like.o */
public final /* synthetic */ class C9181o implements AbstractC88433f {

    /* renamed from: a */
    private final LikeHelper f22355a;

    static {
        Covode.recordClassIndex(10088);
    }

    C9181o(LikeHelper likeHelper) {
        this.f22355a = likeHelper;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LikeHelper likeHelper = this.f22355a;
        LikeHelper.C9166c cVar = (LikeHelper.C9166c) obj;
        likeHelper.f22315r.put(cVar.f22328b, cVar.f22329c);
        if (cVar.f22327a) {
            likeHelper.f22316s.add(cVar.f22329c);
        } else {
            likeHelper.f22314q.add(cVar.f22329c);
        }
    }
}
