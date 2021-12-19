package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.d */
public final /* synthetic */ class CallableC63837d implements Callable {

    /* renamed from: a */
    private final C63833b f144740a;

    /* renamed from: b */
    private final boolean f144741b;

    /* renamed from: c */
    private final String f144742c;

    /* renamed from: d */
    private final int f144743d;

    /* renamed from: e */
    private final long f144744e;

    /* renamed from: f */
    private final int f144745f;

    /* renamed from: g */
    private final String f144746g;

    /* renamed from: h */
    private final int f144747h;

    /* renamed from: i */
    private final int f144748i;

    static {
        Covode.recordClassIndex(75261);
    }

    CallableC63837d(C63833b bVar, boolean z, String str, int i, long j, int i2, String str2, int i3, int i4) {
        this.f144740a = bVar;
        this.f144741b = z;
        this.f144742c = str;
        this.f144743d = i;
        this.f144744e = j;
        this.f144745f = i2;
        this.f144746g = str2;
        this.f144747h = i3;
        this.f144748i = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f144740a.mo103301a(this.f144741b, this.f144742c, this.f144743d, this.f144744e, this.f144745f, this.f144746g, this.f144747h, this.f144748i);
    }
}
