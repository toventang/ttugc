package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: com.bytedance.android.livesdk.userservice.t */
final /* synthetic */ class C11114t implements AbstractC88438k {

    /* renamed from: a */
    private final C11092c f26721a;

    static {
        Covode.recordClassIndex(12737);
    }

    C11114t(C11092c cVar) {
        this.f26721a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        C11092c cVar = this.f26721a;
        AbstractC2994b bVar = (AbstractC2994b) obj;
        return (bVar == null || cVar.f26671b == null || bVar.getId() != cVar.f26671b.getCurUserId()) ? false : true;
    }
}
