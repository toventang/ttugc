package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.pb */
public abstract class AbstractBinderC26225pb extends BinderC25793as implements AbstractC26221oy {
    static {
        Covode.recordClassIndex(31640);
    }

    public AbstractBinderC26225pb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.BinderC25793as
    /* renamed from: a */
    public final boolean mo42042a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo42912a((Bundle) C26232w.m51357a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
