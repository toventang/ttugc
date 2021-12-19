package com.p2082ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;

/* renamed from: com.ss.android.ugc.aweme.initializer.b */
final /* synthetic */ class C56772b implements IAccountService.AbstractC31272b {

    /* renamed from: a */
    private final AbstractC63269z.AbstractC63271b f129331a;

    static {
        Covode.recordClassIndex(66637);
    }

    C56772b(AbstractC63269z.AbstractC63271b bVar) {
        this.f129331a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        AbstractC63269z.AbstractC63271b bVar = this.f129331a;
        if (user != null) {
            ShareDependService.C68822a.m121324a().mo109323a(user);
        }
        bVar.mo101762a(i, z);
    }
}
