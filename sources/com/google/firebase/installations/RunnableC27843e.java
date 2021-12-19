package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.e */
public final /* synthetic */ class RunnableC27843e implements Runnable {

    /* renamed from: a */
    private final C27839c f65417a;

    static {
        Covode.recordClassIndex(33432);
    }

    private RunnableC27843e(C27839c cVar) {
        this.f65417a = cVar;
    }

    /* renamed from: a */
    public static Runnable m55739a(C27839c cVar) {
        return new RunnableC27843e(cVar);
    }

    public final void run() {
        this.f65417a.mo46541a(false);
    }
}
