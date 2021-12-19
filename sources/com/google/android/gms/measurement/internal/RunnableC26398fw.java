package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.fw */
final class RunnableC26398fw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzw f62068a;

    /* renamed from: b */
    private final /* synthetic */ zzn f62069b;

    /* renamed from: c */
    private final /* synthetic */ BinderC26382fg f62070c;

    static {
        Covode.recordClassIndex(31820);
    }

    public final void run() {
        this.f62070c.f62022a.mo43484k();
        if (this.f62068a.f62614c.mo43675a() == null) {
            this.f62070c.f62022a.mo43473b(this.f62068a, this.f62069b);
        } else {
            this.f62070c.f62022a.mo43468a(this.f62068a, this.f62069b);
        }
    }

    RunnableC26398fw(BinderC26382fg fgVar, zzw zzw, zzn zzn) {
        this.f62070c = fgVar;
        this.f62068a = zzw;
        this.f62069b = zzn;
    }
}
