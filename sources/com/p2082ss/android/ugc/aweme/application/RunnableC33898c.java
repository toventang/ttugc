package com.p2082ss.android.ugc.aweme.application;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.application.c */
final /* synthetic */ class RunnableC33898c implements Runnable {

    /* renamed from: a */
    static final Runnable f80198a = new RunnableC33898c();

    static {
        Covode.recordClassIndex(40816);
    }

    private RunnableC33898c() {
    }

    public final void run() {
        Keva.getRepoSync("safemode", 1);
    }
}
