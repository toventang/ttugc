package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25605g;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.internal.measurement.C26115l;
import com.google.android.gms.internal.measurement.C26142m;
import com.google.android.gms.internal.measurement.C26169n;
import com.google.android.gms.measurement.internal.AbstractC26438hi;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.C27695b;
import com.google.firebase.installations.AbstractC27845g;
import com.google.firebase.installations.C27839c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {

    /* renamed from: e */
    private static volatile FirebaseAnalytics f65080e;

    /* renamed from: a */
    final C25939f f65081a;

    /* renamed from: b */
    String f65082b;

    /* renamed from: c */
    long f65083c;

    /* renamed from: d */
    final Object f65084d = new Object();

    /* renamed from: f */
    private ExecutorService f65085f;

    static {
        Covode.recordClassIndex(33266);
    }

    /* renamed from: c */
    private final ExecutorService m55346c() {
        ExecutorService executorService;
        MethodCollector.m26663i(1130);
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f65085f == null) {
                    this.f65085f = new C27687b(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f65085f;
            } finally {
                MethodCollector.m26664o(1130);
            }
        }
        return executorService;
    }

    /* renamed from: a */
    public final AbstractC25631h<String> mo46309a() {
        try {
            String b = mo46313b();
            if (b != null) {
                return C25635k.m49512a(b);
            }
            return C25635k.m49513a(m55346c(), new CallableC27686a(this));
        } catch (Exception e) {
            this.f65081a.mo42393a("Failed to schedule task for getAppInstanceId", (Object) null);
            return C25635k.m49511a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo46313b() {
        MethodCollector.m26663i(1169);
        synchronized (this.f65084d) {
            try {
                if (Math.abs(C25605g.f60716a.mo41858b() - this.f65083c) < 1000) {
                    return this.f65082b;
                }
                MethodCollector.m26664o(1169);
                return null;
            } finally {
                MethodCollector.m26664o(1169);
            }
        }
    }

    public final String getFirebaseInstanceId() {
        boolean z;
        try {
            C27695b d = C27695b.m55376d();
            if (d != null) {
                z = true;
            } else {
                z = false;
            }
            C25565r.m49325b(z, "Null is not a valid value of FirebaseApp.");
            return (String) C25635k.m49515a(((C27839c) d.mo46325a(AbstractC27845g.class)).mo46539a(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private FirebaseAnalytics(C25939f fVar) {
        C25565r.m49314a(fVar);
        this.f65081a = fVar;
    }

    /* renamed from: a */
    public final void mo46310a(String str) {
        C25939f fVar = this.f65081a;
        fVar.mo42391a(new C26142m(fVar, str));
    }

    /* renamed from: a */
    public final void mo46312a(boolean z) {
        C25939f fVar = this.f65081a;
        fVar.mo42391a(new C26169n(fVar, z));
    }

    public static FirebaseAnalytics getInstance(Context context) {
        MethodCollector.m26663i(1105);
        if (f65080e == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f65080e == null) {
                        f65080e = new FirebaseAnalytics(C25939f.m50211a(context, (Bundle) null));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1105);
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f65080e;
        MethodCollector.m26664o(1105);
        return firebaseAnalytics;
    }

    /* renamed from: a */
    public final void mo46311a(String str, Bundle bundle) {
        this.f65081a.mo42395a(null, str, bundle, false);
    }

    public static AbstractC26438hi getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C25939f a = C25939f.m50211a(context, bundle);
        if (a == null) {
            return null;
        }
        return new C27688c(a);
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C25939f fVar = this.f65081a;
        fVar.mo42391a(new C26115l(fVar, activity, str, str2));
    }
}
