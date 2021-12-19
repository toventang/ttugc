package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.BaseLoginService$$Lambda$0 */
public final /* synthetic */ class BaseLoginService$$Lambda$0 implements Runnable {
    private final BaseLoginService arg$1;

    static {
        Covode.recordClassIndex(79592);
    }

    BaseLoginService$$Lambda$0(BaseLoginService baseLoginService) {
        this.arg$1 = baseLoginService;
    }

    public final void run() {
        this.arg$1.lambda$computeNumOfUidsOnDevice$0$BaseLoginService();
    }
}
