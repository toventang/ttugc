package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.fy */
public abstract class AbstractC26400fy extends C26401fz {

    /* renamed from: a */
    private boolean f62076a;

    static {
        Covode.recordClassIndex(31822);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M_ */
    public void mo43187M_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo43065d();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo43287w() {
        if (this.f62076a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo43288x() {
        if (!mo43287w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void mo43289y() {
        if (this.f62076a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo43065d()) {
            this.f62077z.mo43267v();
            this.f62076a = true;
        }
    }

    /* renamed from: z */
    public final void mo43290z() {
        if (!this.f62076a) {
            mo43187M_();
            this.f62077z.mo43267v();
            this.f62076a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    AbstractC26400fy(C26381ff ffVar) {
        super(ffVar);
        this.f62077z.f62006j++;
    }
}
