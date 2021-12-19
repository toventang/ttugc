package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ex */
public final class C26372ex extends AbstractC26400fy {

    /* renamed from: f */
    static final AtomicLong f61958f = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: a */
    C26378fc f61959a;

    /* renamed from: b */
    C26378fc f61960b;

    /* renamed from: c */
    final Object f61961c = new Object();

    /* renamed from: d */
    final Semaphore f61962d = new Semaphore(2);

    /* renamed from: e */
    volatile boolean f61963e;

    /* renamed from: g */
    private final PriorityBlockingQueue<C26379fd<?>> f61964g = new PriorityBlockingQueue<>();

    /* renamed from: h */
    private final BlockingQueue<C26379fd<?>> f61965h = new LinkedBlockingQueue();

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f61966i = new C26374ez(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: j */
    private final Thread.UncaughtExceptionHandler f61967j = new C26374ez(this, "Thread death: Uncaught exception on network thread");

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: d */
    public final boolean mo43065d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    static {
        Covode.recordClassIndex(31794);
    }

    /* renamed from: f */
    public final boolean mo43223f() {
        if (Thread.currentThread() == this.f61959a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final void mo43002c() {
        if (Thread.currentThread() != this.f61959a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final void mo42999b() {
        if (Thread.currentThread() != this.f61960b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: a */
    public final void mo43220a(Runnable runnable) {
        mo43288x();
        C25565r.m49314a(runnable);
        m51832a(new C26379fd<>(this, runnable, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final <V> Future<V> mo43221b(Callable<V> callable) {
        mo43288x();
        C25565r.m49314a(callable);
        C26379fd<?> fdVar = new C26379fd<>(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f61959a) {
            fdVar.run();
        } else {
            m51832a(fdVar);
        }
        return fdVar;
    }

    C26372ex(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    private final void m51832a(C26379fd<?> fdVar) {
        MethodCollector.m26663i(4517);
        synchronized (this.f61961c) {
            try {
                this.f61964g.add(fdVar);
                C26378fc fcVar = this.f61959a;
                if (fcVar == null) {
                    C26378fc fcVar2 = new C26378fc(this, "Measurement Worker", this.f61964g);
                    this.f61959a = fcVar2;
                    fcVar2.setUncaughtExceptionHandler(this.f61966i);
                    this.f61959a.start();
                } else {
                    fcVar.mo43246a();
                }
            } finally {
                MethodCollector.m26664o(4517);
            }
        }
    }

    /* renamed from: b */
    public final void mo43222b(Runnable runnable) {
        MethodCollector.m26663i(4541);
        mo43288x();
        C25565r.m49314a(runnable);
        C26379fd<?> fdVar = new C26379fd<>(this, runnable, "Task exception on network thread");
        synchronized (this.f61961c) {
            try {
                this.f61965h.add(fdVar);
                C26378fc fcVar = this.f61960b;
                if (fcVar == null) {
                    C26378fc fcVar2 = new C26378fc(this, "Measurement Network", this.f61965h);
                    this.f61960b = fcVar2;
                    fcVar2.setUncaughtExceptionHandler(this.f61967j);
                    this.f61960b.start();
                } else {
                    fcVar.mo43246a();
                }
            } finally {
                MethodCollector.m26664o(4541);
            }
        }
    }

    /* renamed from: a */
    public final <V> Future<V> mo43219a(Callable<V> callable) {
        mo43288x();
        C25565r.m49314a(callable);
        C26379fd<?> fdVar = new C26379fd<>(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f61959a) {
            if (!this.f61964g.isEmpty()) {
                mo43016q().f61830f.mo43169a("Callable skipped the worker queue.");
            }
            fdVar.run();
        } else {
            m51832a(fdVar);
        }
        return fdVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo43218a(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        String str2;
        String str3;
        MethodCollector.m26663i(4482);
        synchronized (atomicReference) {
            try {
                mo43015p().mo43220a(runnable);
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    C26353ee eeVar = mo43016q().f61830f;
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = "Interrupted waiting for ".concat(valueOf);
                    } else {
                        str2 = new String("Interrupted waiting for ");
                    }
                    eeVar.mo43169a(str2);
                    MethodCollector.m26664o(4482);
                    return null;
                }
            } finally {
                MethodCollector.m26664o(4482);
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            C26353ee eeVar2 = mo43016q().f61830f;
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3 = "Timed out waiting for ".concat(valueOf2);
            } else {
                str3 = new String("Timed out waiting for ");
            }
            eeVar2.mo43169a(str3);
        }
        return t;
    }
}
