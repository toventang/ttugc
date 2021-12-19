package com.google.firebase.analytics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.C25605g;
import com.google.android.gms.internal.measurement.BinderC26218ov;
import com.google.android.gms.internal.measurement.C25761aa;
import com.google.android.gms.internal.measurement.C25939f;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.a */
public final class CallableC27686a implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAnalytics f65086a;

    static {
        Covode.recordClassIndex(33267);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        MethodCollector.m26663i(915);
        String b = this.f65086a.mo46313b();
        if (b != null) {
            MethodCollector.m26664o(915);
            return b;
        }
        C25939f fVar = this.f65086a.f65081a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C25761aa(fVar, ovVar));
        String a = ovVar.mo42911a(120000);
        if (a != null) {
            FirebaseAnalytics firebaseAnalytics = this.f65086a;
            synchronized (firebaseAnalytics.f65084d) {
                try {
                    firebaseAnalytics.f65082b = a;
                    firebaseAnalytics.f65083c = C25605g.f60716a.mo41858b();
                } finally {
                    MethodCollector.m26664o(915);
                }
            }
            return a;
        }
        TimeoutException timeoutException = new TimeoutException();
        MethodCollector.m26664o(915);
        throw timeoutException;
    }

    CallableC27686a(FirebaseAnalytics firebaseAnalytics) {
        this.f65086a = firebaseAnalytics;
    }
}
