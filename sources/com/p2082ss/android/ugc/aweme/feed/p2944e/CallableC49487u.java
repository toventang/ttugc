package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.e.u */
public final /* synthetic */ class CallableC49487u implements Callable {

    /* renamed from: a */
    private final C49445o f113816a;

    /* renamed from: b */
    private final int f113817b;

    /* renamed from: c */
    private final long f113818c;

    /* renamed from: d */
    private final long f113819d;

    /* renamed from: e */
    private final Video f113820e;

    static {
        Covode.recordClassIndex(58300);
    }

    CallableC49487u(C49445o oVar, int i, long j, long j2, Video video) {
        this.f113816a = oVar;
        this.f113817b = i;
        this.f113818c = j;
        this.f113819d = j2;
        this.f113820e = video;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f113816a.mo81178a(this.f113817b, this.f113818c, this.f113819d, this.f113820e);
    }
}
