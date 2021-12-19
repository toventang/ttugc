package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.e.aa */
public final /* synthetic */ class CallableC49425aa implements Callable {

    /* renamed from: a */
    private final C49445o f113585a;

    /* renamed from: b */
    private final AbstractC48149ai f113586b;

    /* renamed from: c */
    private final String f113587c;

    /* renamed from: d */
    private final long f113588d;

    /* renamed from: e */
    private final String f113589e;

    /* renamed from: f */
    private final boolean f113590f;

    /* renamed from: g */
    private final boolean f113591g;

    static {
        Covode.recordClassIndex(58238);
    }

    CallableC49425aa(C49445o oVar, AbstractC48149ai aiVar, String str, long j, String str2, boolean z, boolean z2) {
        this.f113585a = oVar;
        this.f113586b = aiVar;
        this.f113587c = str;
        this.f113588d = j;
        this.f113589e = str2;
        this.f113590f = z;
        this.f113591g = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f113585a.mo81180a(this.f113586b, this.f113587c, this.f113588d, this.f113589e, this.f113590f, this.f113591g);
    }
}
