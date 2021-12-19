package com.google.android.gms.internal.p1941a;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.a.c */
public final class C25673c extends C25671a implements AbstractC25672b {
    static {
        Covode.recordClassIndex(31087);
    }

    public C25673c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        MethodCollector.m26663i(5492);
        MethodCollector.m26664o(5492);
    }

    @Override // com.google.android.gms.internal.p1941a.AbstractC25672b
    /* renamed from: a */
    public final String mo41922a() {
        MethodCollector.m26663i(5602);
        Parcel a = mo41920a(1, mo41919E_());
        String readString = a.readString();
        a.recycle();
        MethodCollector.m26664o(5602);
        return readString;
    }

    @Override // com.google.android.gms.internal.p1941a.AbstractC25672b
    /* renamed from: b */
    public final boolean mo41923b() {
        MethodCollector.m26663i(5604);
        Parcel E_ = mo41919E_();
        boolean z = true;
        E_.writeInt(1);
        Parcel a = mo41920a(2, E_);
        if (a.readInt() == 0) {
            z = false;
        }
        a.recycle();
        MethodCollector.m26664o(5604);
        return z;
    }
}
