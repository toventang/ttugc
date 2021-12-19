package com.p2082ss.ttvideoengine;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.ttvideoengine.p4430s.C86641i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ttvideoengine.al */
public final /* synthetic */ class RunnableC86343al implements Runnable {

    /* renamed from: a */
    private final C86313ai f193420a;

    /* renamed from: b */
    private final Looper f193421b;

    static {
        Covode.recordClassIndex(101571);
    }

    RunnableC86343al(C86313ai aiVar, Looper looper) {
        this.f193420a = aiVar;
        this.f193421b = looper;
    }

    public final void run() {
        C86313ai aiVar = this.f193420a;
        Looper looper = this.f193421b;
        aiVar.mo137205c();
        if (aiVar.f192977bn != null) {
            VideoSurface videoSurface = aiVar.f192977bn;
            if (looper != null) {
                videoSurface.f192168c = new Handler(looper, videoSurface);
            }
        }
        C86641i.m150113b("TTVideoEngine", "[SRLog]setupTextureRender in child thread");
    }
}
