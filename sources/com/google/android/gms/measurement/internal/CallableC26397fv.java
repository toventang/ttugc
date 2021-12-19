package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.fv */
final class CallableC26397fv implements Callable<List<C26507jw>> {

    /* renamed from: a */
    private final /* synthetic */ zzn f62066a;

    /* renamed from: b */
    private final /* synthetic */ BinderC26382fg f62067b;

    static {
        Covode.recordClassIndex(31819);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C26507jw> call() {
        this.f62067b.f62022a.mo43484k();
        return this.f62067b.f62022a.mo43476d().mo43072a(this.f62066a.f62590a);
    }

    CallableC26397fv(BinderC26382fg fgVar, zzn zzn) {
        this.f62067b = fgVar;
        this.f62066a = zzn;
    }
}
