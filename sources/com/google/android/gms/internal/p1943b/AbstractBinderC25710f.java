package com.google.android.gms.internal.p1943b;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.b.f */
public abstract class AbstractBinderC25710f extends BinderC25706b implements AbstractC25709e {
    static {
        Covode.recordClassIndex(31125);
    }

    public AbstractBinderC25710f() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p1943b.BinderC25706b
    /* renamed from: a */
    public final boolean mo41944a(int i, Parcel parcel) {
        if (i != 1) {
            return false;
        }
        mo41948a(parcel.readInt() == 0 ? null : Status.CREATOR.createFromParcel(parcel));
        return true;
    }
}
