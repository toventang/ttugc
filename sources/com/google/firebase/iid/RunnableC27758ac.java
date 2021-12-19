package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.C27809x;

/* renamed from: com.google.firebase.iid.ac */
final /* synthetic */ class RunnableC27758ac implements Runnable {

    /* renamed from: a */
    private final C27809x.ServiceConnectionC27810a f65221a;

    static {
        Covode.recordClassIndex(33346);
    }

    RunnableC27758ac(C27809x.ServiceConnectionC27810a aVar) {
        this.f65221a = aVar;
    }

    public final void run() {
        this.f65221a.mo46459a(2, "Service disconnected");
    }
}
