package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87794k;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.d */
public final /* synthetic */ class RunnableC87725d implements Runnable {

    /* renamed from: a */
    private final C87724c f199243a;

    /* renamed from: b */
    private final C87718b f199244b;

    static {
        Covode.recordClassIndex(103714);
    }

    RunnableC87725d(C87724c cVar, C87718b bVar) {
        this.f199243a = cVar;
        this.f199244b = bVar;
    }

    public final void run() {
        C87724c cVar = this.f199243a;
        C87718b bVar = this.f199244b;
        C87718b a = cVar.mo142171a();
        if (!bVar.equals(a)) {
            C87794k.m152811c().mo142113b();
            cVar.mo142172a(a);
        }
    }
}
