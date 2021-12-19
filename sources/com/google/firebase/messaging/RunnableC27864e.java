package com.google.firebase.messaging;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.C25632i;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.e */
public final /* synthetic */ class RunnableC27864e implements Runnable {

    /* renamed from: a */
    private final AbstractServiceC27862d f65444a;

    /* renamed from: b */
    private final Intent f65445b;

    /* renamed from: c */
    private final C25632i f65446c;

    static {
        Covode.recordClassIndex(33457);
    }

    RunnableC27864e(AbstractServiceC27862d dVar, Intent intent, C25632i iVar) {
        this.f65444a = dVar;
        this.f65445b = intent;
        this.f65446c = iVar;
    }

    public final void run() {
        this.f65444a.lambda$processIntent$0$EnhancedIntentService(this.f65445b, this.f65446c);
    }
}
