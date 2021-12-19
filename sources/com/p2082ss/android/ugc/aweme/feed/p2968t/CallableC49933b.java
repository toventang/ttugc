package com.p2082ss.android.ugc.aweme.feed.p2968t;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4314h.C84119i;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.t.b */
final /* synthetic */ class CallableC49933b implements Callable {

    /* renamed from: a */
    private final C84119i[] f115101a;

    /* renamed from: b */
    private final String f115102b;

    /* renamed from: c */
    private final int f115103c;

    /* renamed from: d */
    private final String f115104d;

    /* renamed from: e */
    private final int f115105e;

    static {
        Covode.recordClassIndex(59044);
    }

    CallableC49933b(C84119i[] iVarArr, String str, int i, String str2, int i2) {
        this.f115101a = iVarArr;
        this.f115102b = str;
        this.f115103c = i;
        this.f115104d = str2;
        this.f115105e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C49932a.m93756a(this.f115101a, this.f115102b, this.f115103c, this.f115104d, this.f115105e);
    }
}
