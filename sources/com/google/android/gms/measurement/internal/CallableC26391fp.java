package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.fp */
final class CallableC26391fp implements Callable<List<zzw>> {

    /* renamed from: a */
    private final /* synthetic */ String f62048a;

    /* renamed from: b */
    private final /* synthetic */ String f62049b;

    /* renamed from: c */
    private final /* synthetic */ String f62050c;

    /* renamed from: d */
    private final /* synthetic */ BinderC26382fg f62051d;

    static {
        Covode.recordClassIndex(31813);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() {
        this.f62051d.f62022a.mo43484k();
        return this.f62051d.f62022a.mo43476d().mo43087b(this.f62048a, this.f62049b, this.f62050c);
    }

    CallableC26391fp(BinderC26382fg fgVar, String str, String str2, String str3) {
        this.f62051d = fgVar;
        this.f62048a = str;
        this.f62049b = str2;
        this.f62050c = str3;
    }
}
