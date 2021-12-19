package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.o */
public final /* synthetic */ class RunnableC74025o implements Runnable {

    /* renamed from: a */
    private final Activity f166153a;

    /* renamed from: b */
    private final Intent f166154b;

    static {
        Covode.recordClassIndex(86775);
    }

    RunnableC74025o(Activity activity, Intent intent) {
        this.f166153a = activity;
        this.f166154b = intent;
    }

    public final void run() {
        C72724a.m128203a().mo62201c(this.f166153a, this.f166154b);
    }
}
