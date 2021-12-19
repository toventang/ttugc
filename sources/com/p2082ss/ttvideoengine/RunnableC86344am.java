package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.VideoSurface;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ttvideoengine.am */
public final /* synthetic */ class RunnableC86344am implements Runnable {

    /* renamed from: a */
    private final C86313ai f193422a;

    static {
        Covode.recordClassIndex(101572);
    }

    RunnableC86344am(C86313ai aiVar) {
        this.f193422a = aiVar;
    }

    public final void run() {
        C86313ai aiVar = this.f193422a;
        VideoSurface e = aiVar.mo137223e(true);
        if (e != null) {
            e.release();
        }
        aiVar.f192987bx = false;
    }
}
