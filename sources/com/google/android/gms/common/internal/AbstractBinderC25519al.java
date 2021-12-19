package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1946e.BinderC25728a;
import com.google.android.gms.internal.p1946e.C25730c;
import com.google.android.gms.p1934b.AbstractC25324a;

/* renamed from: com.google.android.gms.common.internal.al */
public abstract class AbstractBinderC25519al extends BinderC25728a implements AbstractC25517aj {
    static {
        Covode.recordClassIndex(30922);
    }

    public AbstractBinderC25519al() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.p1946e.BinderC25728a
    /* renamed from: a */
    public final boolean mo41769a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            AbstractC25324a a = mo41767a();
            parcel2.writeNoException();
            C25730c.m49683a(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            int b = mo41768b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
