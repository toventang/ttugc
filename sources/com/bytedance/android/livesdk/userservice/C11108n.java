package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userservice.n */
final /* synthetic */ class C11108n implements AbstractC88433f {

    /* renamed from: a */
    private final C11092c f26715a;

    static {
        Covode.recordClassIndex(12731);
    }

    C11108n(C11092c cVar) {
        this.f26715a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11092c cVar = this.f26715a;
        User user = (User) obj;
        cVar.f26673d.onNext(user);
        cVar.mo13155a(user);
    }
}
