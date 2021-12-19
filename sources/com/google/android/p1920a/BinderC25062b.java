package com.google.android.p1920a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.a.b */
public class BinderC25062b extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(30426);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40979a(int i, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        MethodCollector.m26663i(5845);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            MethodCollector.m26664o(5845);
            return true;
        }
        boolean a = mo40979a(i, parcel, parcel2);
        MethodCollector.m26664o(5845);
        return a;
    }
}
