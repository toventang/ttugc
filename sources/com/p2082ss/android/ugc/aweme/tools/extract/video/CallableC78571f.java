package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.f */
public final /* synthetic */ class CallableC78571f implements Callable {

    /* renamed from: a */
    private final C78567b f176570a;

    /* renamed from: b */
    private final CountDownLatch f176571b;

    /* renamed from: c */
    private final C43223c f176572c;

    /* renamed from: d */
    private final Object f176573d;

    static {
        Covode.recordClassIndex(91705);
    }

    public CallableC78571f(C78567b bVar, CountDownLatch countDownLatch, C43223c cVar, Object obj) {
        this.f176570a = bVar;
        this.f176571b = countDownLatch;
        this.f176572c = cVar;
        this.f176573d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C78567b.m137181a(this.f176571b, this.f176572c, this.f176573d);
    }
}
