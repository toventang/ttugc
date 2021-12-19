package com.p2082ss.android.ugc.aweme.legoImp.service;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.utils.C80229aw;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.b */
final /* synthetic */ class Choreographer$FrameCallbackC58299b implements Choreographer.FrameCallback {

    /* renamed from: a */
    static final Choreographer.FrameCallback f132787a = new Choreographer$FrameCallbackC58299b();

    static {
        Covode.recordClassIndex(68381);
    }

    private Choreographer$FrameCallbackC58299b() {
    }

    public final void doFrame(long j) {
        C58945a.C58947b.f134185a.mo96429b("cold_boot_main_resume_to_measure", false);
        C80229aw.m139065b("cold_boot_main_resume_to_measure");
        C58945a.C58947b.f134185a.mo96425a("cold_boot_main_measure_duration", false);
    }
}
