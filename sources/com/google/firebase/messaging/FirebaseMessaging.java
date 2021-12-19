package com.google.firebase.messaging;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.AbstractC25114g;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.C27695b;
import com.google.firebase.iid.C27760ae;
import com.google.firebase.iid.C27801q;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.AbstractC27845g;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {

    /* renamed from: b */
    static AbstractC25114g f65429b;

    /* renamed from: a */
    final FirebaseInstanceId f65430a;

    /* renamed from: c */
    private final Context f65431c;

    /* renamed from: d */
    private final AbstractC25631h<C27884v> f65432d;

    static {
        Covode.recordClassIndex(33444);
    }

    /* renamed from: a */
    public static synchronized FirebaseMessaging m55759a() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            MethodCollector.m26663i(13218);
            instance = getInstance(C27695b.m55376d());
            MethodCollector.m26664o(13218);
        }
        return instance;
    }

    static synchronized FirebaseMessaging getInstance(C27695b bVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            MethodCollector.m26663i(13289);
            firebaseMessaging = (FirebaseMessaging) bVar.mo46325a(FirebaseMessaging.class);
            MethodCollector.m26664o(13289);
        }
        return firebaseMessaging;
    }

    FirebaseMessaging(C27695b bVar, FirebaseInstanceId firebaseInstanceId, AbstractC27749h hVar, AbstractC27706c cVar, AbstractC27845g gVar, AbstractC25114g gVar2) {
        f65429b = gVar2;
        this.f65430a = firebaseInstanceId;
        Context a = bVar.mo46324a();
        this.f65431c = a;
        C27760ae aeVar = new C27760ae(a);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC25597b("Firebase-Messaging-Topics-Io"));
        AbstractC25631h<C27884v> a2 = C25635k.m49513a(scheduledThreadPoolExecutor, new CallableC27885w(a, scheduledThreadPoolExecutor, firebaseInstanceId, aeVar, new C27801q(bVar, aeVar, hVar, cVar, gVar)));
        this.f65432d = a2;
        a2.mo41875a(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC25597b("Firebase-Messaging-Trigger-Topics-Io")), new C27867h(this));
    }
}
