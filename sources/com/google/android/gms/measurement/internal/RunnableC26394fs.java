package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.fs */
final class RunnableC26394fs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzkr f62058a;

    /* renamed from: b */
    private final /* synthetic */ zzn f62059b;

    /* renamed from: c */
    private final /* synthetic */ BinderC26382fg f62060c;

    static {
        Covode.recordClassIndex(31816);
    }

    public final void run() {
        this.f62060c.f62022a.mo43484k();
        if (this.f62058a.mo43675a() == null) {
            this.f62060c.f62022a.mo43471b(this.f62058a, this.f62059b);
        } else {
            this.f62060c.f62022a.mo43466a(this.f62058a, this.f62059b);
        }
    }

    RunnableC26394fs(BinderC26382fg fgVar, zzkr zzkr, zzn zzn) {
        this.f62060c = fgVar;
        this.f62058a = zzkr;
        this.f62059b = zzn;
    }
}
