package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.fb */
public abstract class AbstractC26377fb extends C26296cb {

    /* renamed from: a */
    private boolean f61979a;

    static {
        Covode.recordClassIndex(31799);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo43045u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo43046v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean mo43242C() {
        if (this.f61979a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo43243D() {
        if (!mo43242C()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: E */
    public final void mo43244E() {
        if (this.f61979a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo43045u()) {
            this.f62077z.mo43267v();
            this.f61979a = true;
        }
    }

    /* renamed from: F */
    public final void mo43245F() {
        if (!this.f61979a) {
            mo43046v();
            this.f62077z.mo43267v();
            this.f61979a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    AbstractC26377fb(C26381ff ffVar) {
        super(ffVar);
        this.f62077z.f62006j++;
    }
}
