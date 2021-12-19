package com.google.android.play.core.p1963b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.play.core.b.bs */
public class BinderC26928bs extends Binder implements IInterface {
    static {
        Covode.recordClassIndex(32403);
    }

    protected BinderC26928bs(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo44576a(int i, Parcel parcel) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean a;
        MethodCollector.m26663i(14074);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                a = true;
            }
            a = mo44576a(i, parcel);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            a = mo44576a(i, parcel);
        }
        MethodCollector.m26664o(14074);
        return a;
    }
}
