package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.an */
public final /* synthetic */ class CallableC48319an implements Callable {

    /* renamed from: a */
    private final String f111970a;

    /* renamed from: b */
    private final String f111971b;

    /* renamed from: c */
    private final String f111972c;

    /* renamed from: d */
    private final String f111973d;

    static {
        Covode.recordClassIndex(57061);
    }

    CallableC48319an(String str, String str2, String str3, String str4) {
        this.f111970a = str;
        this.f111971b = str2;
        this.f111972c = str3;
        this.f111973d = str4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C48318am.m91759a(this.f111970a, this.f111971b, this.f111972c, this.f111973d);
    }
}
