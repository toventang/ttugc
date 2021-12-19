package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.HandlerC26206oj;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h */
public abstract class AbstractC26429h {

    /* renamed from: c */
    private static volatile Handler f62153c;

    /* renamed from: a */
    volatile long f62154a;

    /* renamed from: b */
    private final AbstractC26404gb f62155b;

    /* renamed from: d */
    private final Runnable f62156d;

    static {
        Covode.recordClassIndex(31851);
    }

    /* renamed from: a */
    public abstract void mo43335a();

    /* renamed from: b */
    public final boolean mo43337b() {
        if (this.f62154a != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43338c() {
        this.f62154a = 0;
        m52040d().removeCallbacks(this.f62156d);
    }

    /* renamed from: d */
    private final Handler m52040d() {
        Handler handler;
        if (f62153c != null) {
            return f62153c;
        }
        synchronized (AbstractC26429h.class) {
            if (f62153c == null) {
                f62153c = new HandlerC26206oj(this.f62155b.mo43012m().getMainLooper());
            }
            handler = f62153c;
        }
        return handler;
    }

    AbstractC26429h(AbstractC26404gb gbVar) {
        C25565r.m49314a(gbVar);
        this.f62155b = gbVar;
        this.f62156d = new RunnableC26511k(this, gbVar);
    }

    /* renamed from: a */
    public final void mo43336a(long j) {
        mo43338c();
        if (j >= 0) {
            this.f62154a = this.f62155b.mo43011l().mo41857a();
            if (!m52040d().postDelayed(this.f62156d, j)) {
                this.f62155b.mo43016q().f61827c.mo43170a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }
}
