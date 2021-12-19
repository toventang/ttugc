package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.util.C37193e;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.aa */
public final /* synthetic */ class RunnableC37009aa implements Runnable {

    /* renamed from: a */
    private final C37157k f87171a;

    /* renamed from: b */
    private final long f87172b;

    static {
        Covode.recordClassIndex(44363);
    }

    RunnableC37009aa(C37157k kVar, long j) {
        this.f87171a = kVar;
        this.f87172b = j;
    }

    public final void run() {
        C37157k kVar = this.f87171a;
        C37193e.m75160a(kVar.f87622b.getAid(), this.f87172b);
    }
}
