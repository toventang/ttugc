package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.fx */
final class RunnableC26399fx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f62071a;

    /* renamed from: b */
    private final /* synthetic */ String f62072b;

    /* renamed from: c */
    private final /* synthetic */ String f62073c;

    /* renamed from: d */
    private final /* synthetic */ long f62074d;

    /* renamed from: e */
    private final /* synthetic */ BinderC26382fg f62075e;

    static {
        Covode.recordClassIndex(31821);
    }

    public final void run() {
        if (this.f62071a == null) {
            this.f62075e.f62022a.f62355b.mo43259h().mo43377a(this.f62072b, (C26443hn) null);
            return;
        }
        this.f62075e.f62022a.f62355b.mo43259h().mo43377a(this.f62072b, new C26443hn(this.f62073c, this.f62071a, this.f62074d));
    }

    RunnableC26399fx(BinderC26382fg fgVar, String str, String str2, String str3, long j) {
        this.f62075e = fgVar;
        this.f62071a = str;
        this.f62072b = str2;
        this.f62073c = str3;
        this.f62074d = j;
    }
}
