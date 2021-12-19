package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userservice.p */
final /* synthetic */ class C11110p implements AbstractC88433f {

    /* renamed from: a */
    private final C11092c f26717a;

    static {
        Covode.recordClassIndex(12733);
    }

    C11110p(C11092c cVar) {
        this.f26717a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11092c cVar = this.f26717a;
        User user = (User) obj;
        cVar.f26673d.onNext(user);
        cVar.mo13155a(user);
    }
}
