package com.p2082ss.android.ugc.aweme.login;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.login.i */
public final /* synthetic */ class RunnableC58963i implements Runnable {

    /* renamed from: a */
    private final Activity f134204a;

    static {
        Covode.recordClassIndex(69290);
    }

    RunnableC58963i(Activity activity) {
        this.f134204a = activity;
    }

    public final void run() {
        Context context = this.f134204a;
        if (context == null) {
            context = C17867d.m33078a();
        }
        C39223a.m79603q().mo68630b(context);
    }
}
