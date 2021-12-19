package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.LoginService$$Lambda$2 */
public final /* synthetic */ class LoginService$$Lambda$2 implements Runnable {
    private final LoginService arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(79681);
    }

    LoginService$$Lambda$2(LoginService loginService, boolean z) {
        this.arg$1 = loginService;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$retryLogin$3$LoginService(this.arg$2);
    }
}
