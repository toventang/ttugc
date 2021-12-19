package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IVideo2GifService;
import com.p2082ss.android.vesdk.C85581w;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a.f */
final /* synthetic */ class CallableC70054f implements Callable {

    /* renamed from: a */
    private final IVideo2GifService.ConvertListener f156662a;

    /* renamed from: b */
    private final C85581w f156663b;

    static {
        Covode.recordClassIndex(82474);
    }

    CallableC70054f(IVideo2GifService.ConvertListener convertListener, C85581w wVar) {
        this.f156662a = convertListener;
        this.f156663b = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C70051c.m123687a(this.f156662a, this.f156663b);
    }
}
