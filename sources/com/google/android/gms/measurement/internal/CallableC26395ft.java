package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.ft */
final class CallableC26395ft implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzao f62061a;

    /* renamed from: b */
    private final /* synthetic */ String f62062b;

    /* renamed from: c */
    private final /* synthetic */ BinderC26382fg f62063c;

    static {
        Covode.recordClassIndex(31817);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f62063c.f62022a.mo43484k();
        C26498jo joVar = this.f62063c.f62022a;
        C26498jo.m52277a(joVar.f62354a);
        return joVar.f62354a.mo43367a(this.f62061a, this.f62062b);
    }

    CallableC26395ft(BinderC26382fg fgVar, zzao zzao, String str) {
        this.f62063c = fgVar;
        this.f62061a = zzao;
        this.f62062b = str;
    }
}
