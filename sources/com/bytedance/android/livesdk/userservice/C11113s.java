package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: com.bytedance.android.livesdk.userservice.s */
final /* synthetic */ class C11113s implements AbstractC88438k {

    /* renamed from: a */
    private final long f26720a;

    static {
        Covode.recordClassIndex(12736);
    }

    C11113s(long j) {
        this.f26720a = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        AbstractC2994b bVar = (AbstractC2994b) obj;
        return bVar != null && bVar.getId() == this.f26720a;
    }
}
