package com.google.firebase.messaging;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.g */
public final /* synthetic */ class C27866g implements AbstractC25626c {

    /* renamed from: a */
    private final AbstractServiceC27862d f65448a;

    /* renamed from: b */
    private final Intent f65449b;

    static {
        Covode.recordClassIndex(33459);
    }

    C27866g(AbstractServiceC27862d dVar, Intent intent) {
        this.f65448a = dVar;
        this.f65449b = intent;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h hVar) {
        this.f65448a.lambda$onStartCommand$1$EnhancedIntentService(this.f65449b, hVar);
    }
}
