package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.fm */
final class CallableC26388fm implements Callable<List<zzw>> {

    /* renamed from: a */
    private final /* synthetic */ zzn f62038a;

    /* renamed from: b */
    private final /* synthetic */ String f62039b;

    /* renamed from: c */
    private final /* synthetic */ String f62040c;

    /* renamed from: d */
    private final /* synthetic */ BinderC26382fg f62041d;

    static {
        Covode.recordClassIndex(31810);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() {
        this.f62041d.f62022a.mo43484k();
        return this.f62041d.f62022a.mo43476d().mo43087b(this.f62038a.f62590a, this.f62039b, this.f62040c);
    }

    CallableC26388fm(BinderC26382fg fgVar, zzn zzn, String str, String str2) {
        this.f62041d = fgVar;
        this.f62038a = zzn;
        this.f62039b = str;
        this.f62040c = str2;
    }
}
