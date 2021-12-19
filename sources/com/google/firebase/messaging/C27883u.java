package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.u */
final class C27883u {

    /* renamed from: a */
    private static WeakReference<C27883u> f65474a;

    /* renamed from: b */
    private final SharedPreferences f65475b;

    /* renamed from: c */
    private C27880r f65476c;

    /* renamed from: d */
    private final Executor f65477d;

    static {
        Covode.recordClassIndex(33476);
    }

    /* renamed from: b */
    private final synchronized void m55818b() {
        MethodCollector.m26663i(12881);
        this.f65476c = C27880r.m55814a(this.f65475b, "topic_operation_queue", ",", this.f65477d);
        MethodCollector.m26664o(12881);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C27882t mo46588a() {
        MethodCollector.m26663i(12969);
        String a = this.f65476c.mo46583a();
        if (TextUtils.isEmpty(a)) {
            MethodCollector.m26664o(12969);
            return null;
        }
        String[] split = a.split("!", -1);
        if (split.length != 2) {
            MethodCollector.m26664o(12969);
            return null;
        }
        C27882t tVar = new C27882t(split[0], split[1]);
        MethodCollector.m26664o(12969);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo46589a(C27882t tVar) {
        boolean a;
        MethodCollector.m26663i(12970);
        a = this.f65476c.mo46584a(tVar.f65473c);
        MethodCollector.m26664o(12970);
        return a;
    }

    private C27883u(SharedPreferences sharedPreferences, Executor executor) {
        this.f65477d = executor;
        this.f65475b = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C27883u m55817a(Context context, Executor executor) {
        C27883u uVar;
        synchronized (C27883u.class) {
            MethodCollector.m26663i(12882);
            WeakReference<C27883u> weakReference = f65474a;
            if (weakReference == null || (uVar = weakReference.get()) == null) {
                uVar = new C27883u(C34822d.m71158a(context, "com.google.android.gms.appid", 0), executor);
                uVar.m55818b();
                f65474a = new WeakReference<>(uVar);
            }
            MethodCollector.m26664o(12882);
        }
        return uVar;
    }
}
