package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.fl */
final class RunnableC26387fl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzw f62036a;

    /* renamed from: b */
    private final /* synthetic */ BinderC26382fg f62037b;

    static {
        Covode.recordClassIndex(31809);
    }

    public final void run() {
        this.f62037b.f62022a.mo43484k();
        if (this.f62036a.f62614c.mo43675a() == null) {
            C26498jo joVar = this.f62037b.f62022a;
            zzw zzw = this.f62036a;
            zzn a = joVar.mo43461a(zzw.f62612a);
            if (a != null) {
                joVar.mo43473b(zzw, a);
                return;
            }
            return;
        }
        C26498jo joVar2 = this.f62037b.f62022a;
        zzw zzw2 = this.f62036a;
        zzn a2 = joVar2.mo43461a(zzw2.f62612a);
        if (a2 != null) {
            joVar2.mo43468a(zzw2, a2);
        }
    }

    RunnableC26387fl(BinderC26382fg fgVar, zzw zzw) {
        this.f62037b = fgVar;
        this.f62036a = zzw;
    }
}
