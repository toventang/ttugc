package com.p2082ss.android.ugc.aweme.account.login.authorize;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.c */
final /* synthetic */ class RunnableC31876c implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f76170a;

    static {
        Covode.recordClassIndex(38620);
    }

    RunnableC31876c(AuthorizeActivity authorizeActivity) {
        this.f76170a = authorizeActivity;
    }

    public final void run() {
        this.f76170a.finish();
    }
}
