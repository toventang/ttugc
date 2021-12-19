package com.google.android.gms.internal.p1942authapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.auth-api.o */
public class BinderC25693o extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(31107);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41424a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public BinderC25693o(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        MethodCollector.m26663i(9033);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            MethodCollector.m26664o(9033);
            return true;
        }
        boolean a = mo41424a(i, parcel, parcel2);
        MethodCollector.m26664o(9033);
        return a;
    }
}
