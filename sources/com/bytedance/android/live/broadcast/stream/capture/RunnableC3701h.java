package com.bytedance.android.live.broadcast.stream.capture;

import android.view.Surface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.h */
final /* synthetic */ class RunnableC3701h implements Runnable {

    /* renamed from: a */
    private final C3698g f10184a;

    /* renamed from: b */
    private final Surface f10185b;

    static {
        Covode.recordClassIndex(4214);
    }

    RunnableC3701h(C3698g gVar, Surface surface) {
        this.f10184a = gVar;
        this.f10185b = surface;
    }

    public final void run() {
        C3698g gVar = this.f10184a;
        Surface surface = this.f10185b;
        if (gVar.f10167b != null) {
            gVar.f10167b.mo9017a(surface);
        }
    }
}
