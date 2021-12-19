package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.c */
public final /* synthetic */ class CallableC63836c implements Callable {

    /* renamed from: a */
    private final C63833b f144731a;

    /* renamed from: b */
    private final boolean f144732b;

    /* renamed from: c */
    private final String f144733c;

    /* renamed from: d */
    private final int f144734d;

    /* renamed from: e */
    private final long f144735e;

    /* renamed from: f */
    private final int f144736f;

    /* renamed from: g */
    private final String f144737g;

    /* renamed from: h */
    private final int f144738h;

    /* renamed from: i */
    private final int f144739i;

    static {
        Covode.recordClassIndex(75260);
    }

    CallableC63836c(C63833b bVar, boolean z, String str, int i, long j, int i2, String str2, int i3, int i4) {
        this.f144731a = bVar;
        this.f144732b = z;
        this.f144733c = str;
        this.f144734d = i;
        this.f144735e = j;
        this.f144736f = i2;
        this.f144737g = str2;
        this.f144738h = i3;
        this.f144739i = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f144731a.mo103301a(this.f144732b, this.f144733c, this.f144734d, this.f144735e, this.f144736f, this.f144737g, this.f144738h, this.f144739i);
    }
}
