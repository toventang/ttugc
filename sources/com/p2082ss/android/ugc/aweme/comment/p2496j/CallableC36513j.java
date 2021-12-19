package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.j.j */
final /* synthetic */ class CallableC36513j implements Callable {

    /* renamed from: a */
    private final C36510i f86454a;

    /* renamed from: b */
    private final String f86455b;

    /* renamed from: c */
    private final long f86456c;

    /* renamed from: d */
    private final int f86457d = 20;

    /* renamed from: e */
    private final Long f86458e;

    /* renamed from: f */
    private final int f86459f;

    static {
        Covode.recordClassIndex(43816);
    }

    CallableC36513j(C36510i iVar, String str, long j, Long l, int i) {
        this.f86454a = iVar;
        this.f86455b = str;
        this.f86456c = j;
        this.f86458e = l;
        this.f86459f = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f86454a.mo63979a(this.f86455b, this.f86456c, this.f86457d, this.f86458e, this.f86459f);
    }
}
