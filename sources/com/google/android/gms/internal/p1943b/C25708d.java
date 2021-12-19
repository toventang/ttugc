package com.google.android.gms.internal.p1943b;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.b.d */
public final class C25708d extends C25705a implements AbstractC25707c {
    static {
        Covode.recordClassIndex(31123);
    }

    C25708d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        MethodCollector.m26663i(9773);
        MethodCollector.m26664o(9773);
    }

    @Override // com.google.android.gms.internal.p1943b.AbstractC25707c
    /* renamed from: a */
    public final void mo41947a(AbstractC25709e eVar) {
        MethodCollector.m26663i(9912);
        Parcel a = mo41941a();
        a.writeStrongBinder(eVar.asBinder());
        mo41942a(a);
        MethodCollector.m26664o(9912);
    }
}
