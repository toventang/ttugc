package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C25884d extends C25760a implements AbstractC25830b {
    static {
        Covode.recordClassIndex(31299);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25830b
    /* renamed from: a */
    public final int mo42184a() {
        MethodCollector.m26663i(8350);
        Parcel a = mo42000a(2, mo41999F_());
        int readInt = a.readInt();
        a.recycle();
        MethodCollector.m26664o(8350);
        return readInt;
    }

    C25884d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        MethodCollector.m26663i(8072);
        MethodCollector.m26664o(8072);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25830b
    /* renamed from: a */
    public final void mo42185a(String str, String str2, Bundle bundle, long j) {
        MethodCollector.m26663i(8348);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51359a(F_, bundle);
        F_.writeLong(j);
        mo42002b(1, F_);
        MethodCollector.m26664o(8348);
    }
}
