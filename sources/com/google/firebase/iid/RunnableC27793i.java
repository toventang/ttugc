package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.i */
public final /* synthetic */ class RunnableC27793i implements Runnable {

    /* renamed from: a */
    private final FirebaseInstanceId f65296a;

    static {
        Covode.recordClassIndex(33381);
    }

    RunnableC27793i(FirebaseInstanceId firebaseInstanceId) {
        this.f65296a = firebaseInstanceId;
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.f65296a;
        if (firebaseInstanceId.f65207h.mo46404a()) {
            firebaseInstanceId.mo46393a();
        }
    }
}
