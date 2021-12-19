package com.facebook.imagepipeline.p1880e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.imagepipeline.e.a */
public final class C24406a implements AbstractC24410e {

    /* renamed from: a */
    private final Executor f57862a = m46496a(2, new ThreadFactoryC24429l("FrescoIoBoundExecutor"));

    /* renamed from: b */
    private final Executor f57863b;

    /* renamed from: c */
    private final Executor f57864c;

    /* renamed from: d */
    private final Executor f57865d;

    static {
        Covode.recordClassIndex(28549);
    }

    @Override // com.facebook.imagepipeline.p1880e.AbstractC24410e
    /* renamed from: a */
    public final Executor mo40216a() {
        return this.f57862a;
    }

    @Override // com.facebook.imagepipeline.p1880e.AbstractC24410e
    /* renamed from: b */
    public final Executor mo40217b() {
        return this.f57862a;
    }

    @Override // com.facebook.imagepipeline.p1880e.AbstractC24410e
    /* renamed from: c */
    public final Executor mo40218c() {
        return this.f57863b;
    }

    @Override // com.facebook.imagepipeline.p1880e.AbstractC24410e
    /* renamed from: d */
    public final Executor mo40219d() {
        return this.f57864c;
    }

    @Override // com.facebook.imagepipeline.p1880e.AbstractC24410e
    /* renamed from: e */
    public final Executor mo40220e() {
        return this.f57865d;
    }

    public C24406a(int i) {
        this.f57863b = m46496a(i, new ThreadFactoryC24429l("FrescoDecodeExecutor"));
        this.f57864c = m46496a(i, new ThreadFactoryC24429l("FrescoBackgroundExecutor"));
        this.f57865d = m46496a(1, new ThreadFactoryC24429l("FrescoLightWeightBackgroundExecutor"));
    }

    /* renamed from: a */
    private static ExecutorService m46496a(int i, ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = i;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }
}
