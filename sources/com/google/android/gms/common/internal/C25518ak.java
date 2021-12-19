package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1946e.C25729b;
import com.google.android.gms.p1934b.AbstractC25324a;

/* renamed from: com.google.android.gms.common.internal.ak */
public final class C25518ak extends C25729b implements AbstractC25517aj {
    static {
        Covode.recordClassIndex(30921);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25517aj
    /* renamed from: a */
    public final AbstractC25324a mo41767a() {
        MethodCollector.m26663i(9759);
        Parcel a = mo41960a(1, mo41963c());
        AbstractC25324a a2 = AbstractC25324a.AbstractBinderC25325a.m48693a(a.readStrongBinder());
        a.recycle();
        MethodCollector.m26664o(9759);
        return a2;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25517aj
    /* renamed from: b */
    public final int mo41768b() {
        MethodCollector.m26663i(9908);
        Parcel a = mo41960a(2, mo41963c());
        int readInt = a.readInt();
        a.recycle();
        MethodCollector.m26664o(9908);
        return readInt;
    }

    public C25518ak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
        MethodCollector.m26663i(9757);
        MethodCollector.m26664o(9757);
    }
}
