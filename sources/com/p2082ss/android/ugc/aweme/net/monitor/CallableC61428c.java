package com.p2082ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.c */
final /* synthetic */ class CallableC61428c implements Callable {

    /* renamed from: a */
    private final String f139474a;

    /* renamed from: b */
    private final String f139475b;

    /* renamed from: c */
    private final String f139476c;

    /* renamed from: d */
    private final boolean f139477d;

    /* renamed from: e */
    private final String f139478e;

    /* renamed from: f */
    private final boolean f139479f;

    static {
        Covode.recordClassIndex(72083);
    }

    CallableC61428c(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        this.f139474a = str;
        this.f139475b = str2;
        this.f139476c = str3;
        this.f139477d = z;
        this.f139478e = str4;
        this.f139479f = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C61427b.m111207a(this.f139474a, this.f139475b, this.f139476c, this.f139477d, this.f139478e, this.f139479f);
    }
}
