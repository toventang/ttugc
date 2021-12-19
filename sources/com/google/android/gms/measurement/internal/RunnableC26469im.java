package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.im */
public final class RunnableC26469im implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62277a;

    /* renamed from: b */
    private final /* synthetic */ String f62278b;

    /* renamed from: c */
    private final /* synthetic */ String f62279c;

    /* renamed from: d */
    private final /* synthetic */ String f62280d;

    /* renamed from: e */
    private final /* synthetic */ zzn f62281e;

    /* renamed from: f */
    private final /* synthetic */ C26451hv f62282f;

    static {
        Covode.recordClassIndex(31891);
    }

    public final void run() {
        MethodCollector.m26663i(5559);
        synchronized (this.f62277a) {
            try {
                AbstractC26341dt dtVar = this.f62282f.f62222b;
                if (dtVar == null) {
                    this.f62282f.mo43016q().f61827c.mo43172a("(legacy) Failed to get conditional properties; not connected to service", C26350eb.m51691a(this.f62278b), this.f62279c, this.f62280d);
                    this.f62277a.set(Collections.emptyList());
                    try {
                        this.f62277a.notify();
                    } finally {
                        MethodCollector.m26664o(5559);
                    }
                } else {
                    if (TextUtils.isEmpty(this.f62278b)) {
                        this.f62277a.set(dtVar.mo43026a(this.f62279c, this.f62280d, this.f62281e));
                    } else {
                        this.f62277a.set(dtVar.mo43027a(this.f62278b, this.f62279c, this.f62280d));
                    }
                    this.f62282f.mo43382A();
                    this.f62277a.notify();
                    MethodCollector.m26664o(5559);
                }
            } catch (RemoteException e) {
                this.f62282f.mo43016q().f61827c.mo43172a("(legacy) Failed to get conditional properties; remote exception", C26350eb.m51691a(this.f62278b), this.f62279c, e);
                this.f62277a.set(Collections.emptyList());
                this.f62277a.notify();
            } catch (Throwable th) {
                this.f62277a.notify();
                MethodCollector.m26664o(5559);
                throw th;
            }
        }
    }

    RunnableC26469im(C26451hv hvVar, AtomicReference atomicReference, String str, String str2, String str3, zzn zzn) {
        this.f62282f = hvVar;
        this.f62277a = atomicReference;
        this.f62278b = str;
        this.f62279c = str2;
        this.f62280d = str3;
        this.f62281e = zzn;
    }
}
