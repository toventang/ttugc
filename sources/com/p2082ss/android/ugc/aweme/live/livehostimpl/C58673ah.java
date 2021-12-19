package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.p695c.AbstractC11800a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ah */
final /* synthetic */ class C58673ah implements AbstractC34543f {

    /* renamed from: a */
    private final AbstractC11800a f133586a;

    static {
        Covode.recordClassIndex(68975);
    }

    C58673ah(AbstractC11800a aVar) {
        this.f133586a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: b */
    public final void mo57674b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: a */
    public final void mo57673a() {
        this.f133586a.mo17909a(C58702s.m107859a(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser()));
    }
}
