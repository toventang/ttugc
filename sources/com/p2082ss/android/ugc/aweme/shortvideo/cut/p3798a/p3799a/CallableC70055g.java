package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IVideo2GifService;
import com.p2082ss.android.vesdk.C85581w;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a.g */
final /* synthetic */ class CallableC70055g implements Callable {

    /* renamed from: a */
    private final int f156664a;

    /* renamed from: b */
    private final IVideo2GifService.ConvertListener f156665b;

    /* renamed from: c */
    private final float f156666c;

    /* renamed from: d */
    private final C85581w f156667d;

    static {
        Covode.recordClassIndex(82475);
    }

    CallableC70055g(int i, IVideo2GifService.ConvertListener convertListener, float f, C85581w wVar) {
        this.f156664a = i;
        this.f156665b = convertListener;
        this.f156666c = f;
        this.f156667d = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C70051c.m123686a(this.f156664a, this.f156665b, this.f156666c, this.f156667d);
    }
}
