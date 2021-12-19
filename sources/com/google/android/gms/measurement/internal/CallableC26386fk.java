package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.fk */
final class CallableC26386fk implements Callable<List<C26507jw>> {

    /* renamed from: a */
    private final /* synthetic */ zzn f62032a;

    /* renamed from: b */
    private final /* synthetic */ String f62033b;

    /* renamed from: c */
    private final /* synthetic */ String f62034c;

    /* renamed from: d */
    private final /* synthetic */ BinderC26382fg f62035d;

    static {
        Covode.recordClassIndex(31808);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C26507jw> call() {
        this.f62035d.f62022a.mo43484k();
        return this.f62035d.f62022a.mo43476d().mo43074a(this.f62032a.f62590a, this.f62033b, this.f62034c);
    }

    CallableC26386fk(BinderC26382fg fgVar, zzn zzn, String str, String str2) {
        this.f62035d = fgVar;
        this.f62032a = zzn;
        this.f62033b = str;
        this.f62034c = str2;
    }
}
