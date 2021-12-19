package com.bytedance.ies.ugc.statisticlogger;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2144h.C29921d;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.g */
public final /* synthetic */ class RunnableC18231g implements Runnable {

    /* renamed from: a */
    public static final Runnable f43424a = new RunnableC18231g();

    static {
        Covode.recordClassIndex(20890);
    }

    private RunnableC18231g() {
    }

    public final void run() {
        if (C18230f.f43423b != null) {
            Activity activity = C18230f.f43423b.get();
            if (activity != null) {
                C29921d.C29923a.f71406a.mo52229a(activity);
            }
            C18230f.f43423b = null;
        }
    }
}
