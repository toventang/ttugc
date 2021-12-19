package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.f */
public final /* synthetic */ class CallableC34282f implements Callable {

    /* renamed from: a */
    private final C34279d f81059a;

    /* renamed from: b */
    private final String f81060b;

    static {
        Covode.recordClassIndex(41223);
    }

    CallableC34282f(C34279d dVar, String str) {
        this.f81059a = dVar;
        this.f81060b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f81059a.mo60704a(this.f81060b);
    }
}
