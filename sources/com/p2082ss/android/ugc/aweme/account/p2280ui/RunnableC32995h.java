package com.p2082ss.android.ugc.aweme.account.p2280ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.ui.h */
final /* synthetic */ class RunnableC32995h implements Runnable {

    /* renamed from: a */
    private final RecoverDeletedAccountActivity f78523a;

    static {
        Covode.recordClassIndex(39799);
    }

    RunnableC32995h(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f78523a = recoverDeletedAccountActivity;
    }

    public final void run() {
        this.f78523a.f78509j.queryUser();
    }
}
