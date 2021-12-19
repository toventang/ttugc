package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.pa */
public final class C26224pa extends C25760a implements AbstractC26221oy {
    static {
        Covode.recordClassIndex(31639);
    }

    C26224pa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
        MethodCollector.m26663i(6905);
        MethodCollector.m26664o(6905);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26221oy
    /* renamed from: a */
    public final void mo42912a(Bundle bundle) {
        MethodCollector.m26663i(7050);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, bundle);
        mo42002b(1, F_);
        MethodCollector.m26664o(7050);
    }
}
