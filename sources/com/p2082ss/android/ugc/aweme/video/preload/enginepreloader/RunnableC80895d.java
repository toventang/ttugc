package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80914f;
import com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.p2082ss.ttvideoengine.C86385d;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.d */
final /* synthetic */ class RunnableC80895d implements Runnable {

    /* renamed from: a */
    private final EnginePreloader.C808815 f180882a;

    /* renamed from: b */
    private final C86385d.C86398f f180883b;

    /* renamed from: c */
    private final long f180884c;

    /* renamed from: d */
    private final long f180885d;

    static {
        Covode.recordClassIndex(94194);
    }

    RunnableC80895d(EnginePreloader.C808815 r1, C86385d.C86398f fVar, long j, long j2) {
        this.f180882a = r1;
        this.f180883b = fVar;
        this.f180884c = j;
        this.f180885d = j2;
    }

    public final void run() {
        EnginePreloader.C808815 r0 = this.f180882a;
        C86385d.C86398f fVar = this.f180883b;
        long j = this.f180884c;
        long j2 = this.f180885d;
        for (WeakReference<AbstractC80914f> weakReference : EnginePreloader.this.f180824a) {
            AbstractC80914f fVar2 = weakReference.get();
            if (fVar2 != null) {
                fVar2.mo84697a(fVar.f193665a, j, j2);
            }
        }
    }
}
