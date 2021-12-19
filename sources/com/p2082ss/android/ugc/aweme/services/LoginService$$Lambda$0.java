package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.LoginService$$Lambda$0 */
public final /* synthetic */ class LoginService$$Lambda$0 implements IAccountService.AbstractC31277g {
    static final IAccountService.AbstractC31277g $instance = new LoginService$$Lambda$0();

    static {
        Covode.recordClassIndex(79679);
    }

    private LoginService$$Lambda$0() {
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        LoginService.lambda$showLoginAndRegisterViewInner$1$LoginService(i, i2, obj);
    }
}
