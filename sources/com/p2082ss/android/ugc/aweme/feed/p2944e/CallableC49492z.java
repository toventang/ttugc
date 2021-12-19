package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.e.z */
final /* synthetic */ class CallableC49492z implements Callable {

    /* renamed from: a */
    private final C49445o f113840a;

    /* renamed from: b */
    private final long f113841b;

    /* renamed from: c */
    private final long f113842c;

    /* renamed from: d */
    private final boolean f113843d;

    /* renamed from: e */
    private final AbstractC48149ai f113844e;

    /* renamed from: f */
    private final int f113845f;

    /* renamed from: g */
    private final String f113846g;

    /* renamed from: h */
    private final String f113847h;

    /* renamed from: i */
    private final AbstractC49849am f113848i;

    /* renamed from: j */
    private final String f113849j;

    static {
        Covode.recordClassIndex(58305);
    }

    CallableC49492z(C49445o oVar, long j, long j2, boolean z, AbstractC48149ai aiVar, int i, String str, String str2, AbstractC49849am amVar, String str3) {
        this.f113840a = oVar;
        this.f113841b = j;
        this.f113842c = j2;
        this.f113843d = z;
        this.f113844e = aiVar;
        this.f113845f = i;
        this.f113846g = str;
        this.f113847h = str2;
        this.f113848i = amVar;
        this.f113849j = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f113840a.mo81179a(this.f113841b, this.f113842c, this.f113843d, this.f113844e, this.f113845f, this.f113846g, this.f113847h, this.f113848i, this.f113849j);
    }
}
