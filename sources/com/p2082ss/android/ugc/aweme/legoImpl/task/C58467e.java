package com.p2082ss.android.ugc.aweme.legoImpl.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.e */
final /* synthetic */ class C58467e implements AbstractC1729g {

    /* renamed from: a */
    static final AbstractC1729g f133102a = new C58467e();

    static {
        Covode.recordClassIndex(68746);
    }

    private C58467e() {
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C51423a.m95787a("TokenSdkTask finished, start to fetch IM token");
        IMService.createIIMServicebyMonsterPlugin(false).ensureIMState();
        return null;
    }
}
