package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.g */
public final /* synthetic */ class RunnableC69988g implements Runnable {

    /* renamed from: a */
    private final C69980b f156438a;

    /* renamed from: b */
    private final long f156439b;

    static {
        Covode.recordClassIndex(82402);
    }

    RunnableC69988g(C69980b bVar, long j) {
        this.f156438a = bVar;
        this.f156439b = j;
    }

    public final void run() {
        C69980b bVar = this.f156438a;
        long j = this.f156439b;
        bVar.f156419q = false;
        bVar.f156414l.mo110437b().setValue(C88296t.m153438b(j));
        bVar.mo110430a(j);
    }
}
