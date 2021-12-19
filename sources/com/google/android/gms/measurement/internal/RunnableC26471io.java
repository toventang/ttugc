package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.io */
public final class RunnableC26471io implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62289a;

    /* renamed from: b */
    private final /* synthetic */ String f62290b;

    /* renamed from: c */
    private final /* synthetic */ String f62291c;

    /* renamed from: d */
    private final /* synthetic */ String f62292d;

    /* renamed from: e */
    private final /* synthetic */ boolean f62293e;

    /* renamed from: f */
    private final /* synthetic */ zzn f62294f;

    /* renamed from: g */
    private final /* synthetic */ C26451hv f62295g;

    static {
        Covode.recordClassIndex(31893);
    }

    public final void run() {
        MethodCollector.m26663i(5438);
        synchronized (this.f62289a) {
            try {
                AbstractC26341dt dtVar = this.f62295g.f62222b;
                if (dtVar == null) {
                    this.f62295g.mo43016q().f61827c.mo43172a("(legacy) Failed to get user properties; not connected to service", C26350eb.m51691a(this.f62290b), this.f62291c, this.f62292d);
                    this.f62289a.set(Collections.emptyList());
                    try {
                        this.f62289a.notify();
                    } finally {
                        MethodCollector.m26664o(5438);
                    }
                } else {
                    if (TextUtils.isEmpty(this.f62290b)) {
                        this.f62289a.set(dtVar.mo43029a(this.f62291c, this.f62292d, this.f62293e, this.f62294f));
                    } else {
                        this.f62289a.set(dtVar.mo43028a(this.f62290b, this.f62291c, this.f62292d, this.f62293e));
                    }
                    this.f62295g.mo43382A();
                    this.f62289a.notify();
                    MethodCollector.m26664o(5438);
                }
            } catch (RemoteException e) {
                this.f62295g.mo43016q().f61827c.mo43172a("(legacy) Failed to get user properties; remote exception", C26350eb.m51691a(this.f62290b), this.f62291c, e);
                this.f62289a.set(Collections.emptyList());
                this.f62289a.notify();
            } catch (Throwable th) {
                this.f62289a.notify();
                MethodCollector.m26664o(5438);
                throw th;
            }
        }
    }

    RunnableC26471io(C26451hv hvVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzn zzn) {
        this.f62295g = hvVar;
        this.f62289a = atomicReference;
        this.f62290b = str;
        this.f62291c = str2;
        this.f62292d = str3;
        this.f62293e = z;
        this.f62294f = zzn;
    }
}
