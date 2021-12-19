package com.google.android.gms.internal.p1943b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.b.b */
public class BinderC25706b extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(31121);
    }

    protected BinderC25706b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41944a(int i, Parcel parcel) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean a;
        MethodCollector.m26663i(11968);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                a = true;
            }
            a = mo41944a(i, parcel);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            a = mo41944a(i, parcel);
        }
        MethodCollector.m26664o(11968);
        return a;
    }
}
