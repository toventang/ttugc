package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.e.x */
public final /* synthetic */ class CallableC49490x implements Callable {

    /* renamed from: a */
    private final C49445o f113826a;

    /* renamed from: b */
    private final Video f113827b;

    /* renamed from: c */
    private final AbstractC48149ai f113828c;

    /* renamed from: d */
    private final C84215n f113829d;

    static {
        Covode.recordClassIndex(58303);
    }

    CallableC49490x(C49445o oVar, Video video, AbstractC48149ai aiVar, C84215n nVar) {
        this.f113826a = oVar;
        this.f113827b = video;
        this.f113828c = aiVar;
        this.f113829d = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f113826a.mo81182a(this.f113827b, this.f113828c, this.f113829d);
    }
}
