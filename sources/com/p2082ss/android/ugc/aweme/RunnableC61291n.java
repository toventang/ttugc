package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.login.LoginUtilsServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.n */
final /* synthetic */ class RunnableC61291n implements Runnable {

    /* renamed from: a */
    private final Bundle f139202a;

    static {
        Covode.recordClassIndex(71910);
    }

    RunnableC61291n(Bundle bundle) {
        this.f139202a = bundle;
    }

    public final void run() {
        LoginUtilsServiceImpl.m108310a().mo96439a(this.f139202a);
    }
}
