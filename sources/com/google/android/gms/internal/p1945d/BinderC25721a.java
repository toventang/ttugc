package com.google.android.gms.internal.p1945d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.d.a */
public class BinderC25721a extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(31136);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41710a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public BinderC25721a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        MethodCollector.m26663i(9906);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            MethodCollector.m26664o(9906);
            return true;
        }
        boolean a = mo41710a(i, parcel, parcel2);
        MethodCollector.m26664o(9906);
        return a;
    }
}
