package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.scribe.j */
public final /* synthetic */ class RunnableC87771j implements Runnable {

    /* renamed from: a */
    private final AbstractC87770i f199367a;

    /* renamed from: b */
    private final Object f199368b;

    /* renamed from: c */
    private final boolean f199369c = false;

    static {
        Covode.recordClassIndex(103769);
    }

    RunnableC87771j(AbstractC87770i iVar, Object obj) {
        this.f199367a = iVar;
        this.f199368b = obj;
    }

    public final void run() {
        this.f199367a.mo142231a(this.f199368b, this.f199369c);
    }
}
