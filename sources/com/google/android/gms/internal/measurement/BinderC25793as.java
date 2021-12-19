package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.as */
public class BinderC25793as extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(31208);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo42042a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public BinderC25793as(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        MethodCollector.m26663i(7770);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            MethodCollector.m26664o(7770);
            return true;
        }
        boolean a = mo42042a(i, parcel, parcel2);
        MethodCollector.m26664o(7770);
        return a;
    }
}
