package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14188h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.z */
public final /* synthetic */ class RunnableC72825z implements Runnable {

    /* renamed from: a */
    private final C72809t f163413a;

    /* renamed from: b */
    private final long f163414b;

    static {
        Covode.recordClassIndex(85511);
    }

    RunnableC72825z(C72809t tVar, long j) {
        this.f163413a = tVar;
        this.f163414b = j;
    }

    public final void run() {
        C72809t tVar = this.f163413a;
        tVar.f163373g.mo6999a(new C14188h(tVar.f163304E, this.f163414b, tVar.f163305F));
    }
}
