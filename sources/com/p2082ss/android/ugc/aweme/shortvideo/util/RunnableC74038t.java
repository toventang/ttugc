package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.t */
public final /* synthetic */ class RunnableC74038t implements Runnable {

    /* renamed from: a */
    private final Activity f166183a;

    /* renamed from: b */
    private final String f166184b;

    static {
        Covode.recordClassIndex(86790);
    }

    RunnableC74038t(Activity activity, String str) {
        this.f166183a = activity;
        this.f166184b = str;
    }

    public final void run() {
        Activity activity = this.f166183a;
        new C79459a(activity).mo123052a(this.f166184b).mo123053a();
    }
}
