package com.p2082ss.android.ugc.aweme.adaptation.analysis;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.adaptation.analysis.a */
final /* synthetic */ class CallableC33400a implements Callable {

    /* renamed from: a */
    private final AnalysisActivityComponent f79364a;

    /* renamed from: b */
    private final long f79365b;

    static {
        Covode.recordClassIndex(40257);
    }

    CallableC33400a(AnalysisActivityComponent analysisActivityComponent, long j) {
        this.f79364a = analysisActivityComponent;
        this.f79365b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f79364a.mo59472a(this.f79365b);
    }
}
