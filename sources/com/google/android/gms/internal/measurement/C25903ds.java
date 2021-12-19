package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.ds */
public final class C25903ds extends C25760a implements AbstractC25849bs {
    static {
        Covode.recordClassIndex(31318);
    }

    public C25903ds(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        MethodCollector.m26663i(7024);
        MethodCollector.m26664o(7024);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25849bs
    /* renamed from: a */
    public final Bundle mo42202a(Bundle bundle) {
        MethodCollector.m26663i(7181);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, bundle);
        Parcel a = mo42000a(1, F_);
        Bundle bundle2 = (Bundle) C26232w.m51357a(a, Bundle.CREATOR);
        a.recycle();
        MethodCollector.m26664o(7181);
        return bundle2;
    }
}
