package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.p */
public final /* synthetic */ class RunnableC74026p implements Runnable {

    /* renamed from: a */
    private final Activity f166155a;

    /* renamed from: b */
    private final Intent f166156b;

    static {
        Covode.recordClassIndex(86776);
    }

    RunnableC74026p(Activity activity, Intent intent) {
        this.f166155a = activity;
        this.f166156b = intent;
    }

    public final void run() {
        C72724a.m128203a().mo62201c(this.f166155a, this.f166156b);
    }
}
