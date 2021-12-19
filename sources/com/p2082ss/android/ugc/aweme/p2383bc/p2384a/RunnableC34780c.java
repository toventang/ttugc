package com.p2082ss.android.ugc.aweme.p2383bc.p2384a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.p2133d.C29847a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bc.a.c */
public final class RunnableC34780c implements Runnable {
    static {
        Covode.recordClassIndex(41776);
    }

    public final void run() {
        IExternalService a = AVExternalServiceImpl.m113114a();
        Application a2 = C17879g.m33104a();
        C89219l.m154716b(a2, "");
        a.attachApplication(a2);
        C29847a.f71195a = "/aweme";
    }
}
