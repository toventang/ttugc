package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.m */
final /* synthetic */ class RunnableC15149m implements Runnable {

    /* renamed from: a */
    private final C15140e f36985a;

    /* renamed from: b */
    private final C15126d f36986b;

    /* renamed from: c */
    private final IapChannelUserData f36987c;

    static {
        Covode.recordClassIndex(17317);
    }

    RunnableC15149m(C15140e eVar, C15126d dVar, IapChannelUserData iapChannelUserData) {
        this.f36985a = eVar;
        this.f36986b = dVar;
        this.f36987c = iapChannelUserData;
    }

    public final void run() {
        this.f36985a.mo24420c();
    }
}
