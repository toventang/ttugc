package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.fn */
final class CallableC26389fn implements Callable<List<C26507jw>> {

    /* renamed from: a */
    private final /* synthetic */ String f62042a;

    /* renamed from: b */
    private final /* synthetic */ String f62043b;

    /* renamed from: c */
    private final /* synthetic */ String f62044c;

    /* renamed from: d */
    private final /* synthetic */ BinderC26382fg f62045d;

    static {
        Covode.recordClassIndex(31811);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C26507jw> call() {
        this.f62045d.f62022a.mo43484k();
        return this.f62045d.f62022a.mo43476d().mo43074a(this.f62042a, this.f62043b, this.f62044c);
    }

    CallableC26389fn(BinderC26382fg fgVar, String str, String str2, String str3) {
        this.f62045d = fgVar;
        this.f62042a = str;
        this.f62043b = str2;
        this.f62044c = str3;
    }
}
