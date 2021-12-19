package com.p2082ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34881bk;
import com.p2082ss.android.ugc.aweme.C47173f;
import com.p2082ss.android.ugc.aweme.account.C31575b;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.e */
final /* synthetic */ class RunnableC33580e implements Runnable {

    /* renamed from: a */
    private final C47173f f79748a;

    static {
        Covode.recordClassIndex(40470);
    }

    RunnableC33580e(C47173f fVar) {
        this.f79748a = fVar;
    }

    public final void run() {
        C31575b.m65861c().saveSharedAccount(new AbstractC34881bk.C34882a(this.f79748a));
    }
}
