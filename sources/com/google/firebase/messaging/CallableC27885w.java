package com.google.firebase.messaging;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.C27760ae;
import com.google.firebase.iid.C27801q;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.w */
public final /* synthetic */ class CallableC27885w implements Callable {

    /* renamed from: a */
    private final Context f65487a;

    /* renamed from: b */
    private final ScheduledExecutorService f65488b;

    /* renamed from: c */
    private final FirebaseInstanceId f65489c;

    /* renamed from: d */
    private final C27760ae f65490d;

    /* renamed from: e */
    private final C27801q f65491e;

    static {
        Covode.recordClassIndex(33478);
    }

    CallableC27885w(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C27760ae aeVar, C27801q qVar) {
        this.f65487a = context;
        this.f65488b = scheduledExecutorService;
        this.f65489c = firebaseInstanceId;
        this.f65490d = aeVar;
        this.f65491e = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f65487a;
        ScheduledExecutorService scheduledExecutorService = this.f65488b;
        return new C27884v(this.f65489c, this.f65490d, C27883u.m55817a(context, scheduledExecutorService), this.f65491e, context, scheduledExecutorService);
    }
}
