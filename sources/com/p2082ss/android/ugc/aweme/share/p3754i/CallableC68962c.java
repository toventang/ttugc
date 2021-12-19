package com.p2082ss.android.ugc.aweme.share.p3754i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.i.c */
public final /* synthetic */ class CallableC68962c implements Callable {

    /* renamed from: a */
    private final C68960a f154282a;

    /* renamed from: b */
    private final String f154283b;

    /* renamed from: c */
    private final int f154284c;

    static {
        Covode.recordClassIndex(81276);
    }

    CallableC68962c(C68960a aVar, String str, int i) {
        this.f154282a = aVar;
        this.f154283b = str;
        this.f154284c = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f154282a.mo109506b(this.f154283b, this.f154284c);
    }
}
