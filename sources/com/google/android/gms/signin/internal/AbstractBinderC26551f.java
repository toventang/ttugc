package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1945d.BinderC25721a;
import com.google.android.gms.internal.p1945d.C25723c;

/* renamed from: com.google.android.gms.signin.internal.f */
public abstract class AbstractBinderC26551f extends BinderC25721a implements AbstractC26548c {
    static {
        Covode.recordClassIndex(31979);
    }

    public AbstractBinderC26551f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p1945d.BinderC25721a
    /* renamed from: a */
    public final boolean mo41710a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            C25723c.m49674a(parcel, ConnectionResult.CREATOR);
            C25723c.m49674a(parcel, zab.CREATOR);
        } else if (i == 4) {
            C25723c.m49674a(parcel, Status.CREATOR);
        } else if (i == 6) {
            C25723c.m49674a(parcel, Status.CREATOR);
        } else if (i == 7) {
            C25723c.m49674a(parcel, Status.CREATOR);
            C25723c.m49674a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            mo41580a((zak) C25723c.m49674a(parcel, zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
