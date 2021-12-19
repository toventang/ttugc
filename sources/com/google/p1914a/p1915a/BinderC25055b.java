package com.google.p1914a.p1915a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.a.a.b */
public class BinderC25055b extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(30419);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40969a(int i, Parcel parcel) {
        return false;
    }

    public final IBinder asBinder() {
        return this;
    }

    public BinderC25055b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        MethodCollector.m26663i(11036);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            MethodCollector.m26664o(11036);
            return true;
        }
        boolean a = mo40969a(i, parcel);
        MethodCollector.m26664o(11036);
        return a;
    }
}
