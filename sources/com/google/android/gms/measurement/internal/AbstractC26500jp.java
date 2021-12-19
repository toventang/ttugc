package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.jp */
public abstract class AbstractC26500jp extends C26496jm {

    /* renamed from: a */
    private boolean f62382a;

    static {
        Covode.recordClassIndex(31922);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo43092d();

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo43485A() {
        if (this.f62382a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo43486B() {
        if (!mo43485A()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: C */
    public final void mo43487C() {
        if (!this.f62382a) {
            mo43092d();
            this.f62350j.f62358e++;
            this.f62382a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    AbstractC26500jp(C26498jo joVar) {
        super(joVar);
        this.f62350j.f62357d++;
    }
}
