package com.google.android.play.core.p1966e;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.ao */
public final class RunnableC27009ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC27034f f63914a;

    /* renamed from: b */
    final /* synthetic */ int f63915b;

    /* renamed from: c */
    final /* synthetic */ int f63916c;

    /* renamed from: d */
    final /* synthetic */ C27010ap f63917d;

    static {
        Covode.recordClassIndex(32485);
    }

    RunnableC27009ao(C27010ap apVar, AbstractC27034f fVar, int i, int i2) {
        this.f63917d = apVar;
        this.f63914a = fVar;
        this.f63915b = i;
        this.f63916c = i2;
    }

    public final void run() {
        C27010ap apVar = this.f63917d;
        AbstractC27034f fVar = this.f63914a;
        apVar.mo44661a(new C27036h(fVar.mo44734a(), this.f63915b, this.f63916c, fVar.mo44737d(), fVar.mo44738e(), fVar.mo44742i(), fVar.mo44743j(), fVar.mo44741h(), fVar.mo44744k()));
    }
}
