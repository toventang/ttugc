package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.redbadge.C30173b;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.ae */
final /* synthetic */ class RunnableC81855ae implements Runnable {

    /* renamed from: a */
    private final Activity f183013a;

    static {
        Covode.recordClassIndex(95269);
    }

    RunnableC81855ae(Activity activity) {
        this.f183013a = activity;
    }

    public final void run() {
        Activity activity = this.f183013a;
        if (C81850aa.f183008a == 0) {
            C30173b.m61015a(activity).mo53574b();
        }
    }
}
