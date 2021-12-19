package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.b */
final /* synthetic */ class CallableC63428b implements Callable {

    /* renamed from: a */
    private final String f144019a;

    /* renamed from: b */
    private final String f144020b;

    /* renamed from: c */
    private final int f144021c;

    /* renamed from: d */
    private final int f144022d;

    static {
        Covode.recordClassIndex(74733);
    }

    CallableC63428b(String str, String str2, int i, int i2) {
        this.f144019a = str;
        this.f144020b = str2;
        this.f144021c = i;
        this.f144022d = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return BlockApi.m115011a(this.f144019a, this.f144020b, this.f144021c, this.f144022d);
    }
}
