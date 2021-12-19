package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.redbadge.C30173b;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.af */
final /* synthetic */ class RunnableC81856af implements Runnable {

    /* renamed from: a */
    private final Activity f183014a;

    static {
        Covode.recordClassIndex(95270);
    }

    RunnableC81856af(Activity activity) {
        this.f183014a = activity;
    }

    public final void run() {
        Activity activity = this.f183014a;
        if (C81850aa.f183008a == 0) {
            C81859c.m141752a("method_push_start_redbadge_client_init");
            C30173b a = C30173b.m61015a(activity);
            if (a.f71934a != null) {
                if (!a.f71938e) {
                    a.f71938e = true;
                    a.f71935b.sendEmptyMessage(0);
                } else if (a.f71937d) {
                    a.f71937d = false;
                    a.f71935b.sendEmptyMessage(3);
                }
                Logger.debug();
                a.f71935b.removeCallbacks(a.f71939f);
            }
            C81859c.m141753b("method_push_start_redbadge_client_init");
        }
    }
}
