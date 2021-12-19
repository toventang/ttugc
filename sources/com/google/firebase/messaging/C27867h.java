package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25628e;

/* renamed from: com.google.firebase.messaging.h */
final /* synthetic */ class C27867h implements AbstractC25628e {

    /* renamed from: a */
    private final FirebaseMessaging f65450a;

    static {
        Covode.recordClassIndex(33460);
    }

    C27867h(FirebaseMessaging firebaseMessaging) {
        this.f65450a = firebaseMessaging;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25628e
    /* renamed from: a */
    public final void mo34354a(Object obj) {
        C27884v vVar = (C27884v) obj;
        if (this.f65450a.f65430a.f65207h.mo46404a() && vVar.f65479a.mo46588a() != null && !vVar.mo46594b()) {
            vVar.mo46590a(0);
        }
    }
}
