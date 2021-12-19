package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.userservice.r */
public final /* synthetic */ class C11112r implements AbstractC88433f {

    /* renamed from: a */
    private final C11092c f26719a;

    static {
        Covode.recordClassIndex(12735);
    }

    C11112r(C11092c cVar) {
        this.f26719a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11092c cVar = this.f26719a;
        AbstractC2994b bVar = (AbstractC2994b) obj;
        cVar.f26673d.onNext(bVar);
        cVar.f26670a = bVar;
    }
}
