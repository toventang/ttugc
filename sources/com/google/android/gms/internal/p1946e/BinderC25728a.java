package com.google.android.gms.internal.p1946e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.e.a */
public class BinderC25728a extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(31143);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41769a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public BinderC25728a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        MethodCollector.m26663i(7430);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            MethodCollector.m26664o(7430);
            return true;
        }
        boolean a = mo41769a(i, parcel, parcel2);
        MethodCollector.m26664o(7430);
        return a;
    }
}
