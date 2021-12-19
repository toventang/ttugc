package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hm */
public final /* synthetic */ class RunnableC26442hm implements Runnable {

    /* renamed from: a */
    private final RunnableC26439hj f62182a;

    /* renamed from: b */
    private final int f62183b;

    /* renamed from: c */
    private final Exception f62184c;

    /* renamed from: d */
    private final byte[] f62185d;

    /* renamed from: e */
    private final Map f62186e;

    static {
        Covode.recordClassIndex(31864);
    }

    RunnableC26442hm(RunnableC26439hj hjVar, int i, Exception exc, byte[] bArr, Map map) {
        this.f62182a = hjVar;
        this.f62183b = i;
        this.f62184c = exc;
        this.f62185d = bArr;
        this.f62186e = map;
    }

    public final void run() {
        RunnableC26439hj hjVar = this.f62182a;
        hjVar.f62176a.mo43250a(this.f62183b, this.f62184c, this.f62185d);
    }
}
