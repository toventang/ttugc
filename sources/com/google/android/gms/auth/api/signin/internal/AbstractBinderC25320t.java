package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1942authapi.BinderC25693o;
import com.google.android.gms.internal.p1942authapi.C25695q;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public abstract class AbstractBinderC25320t extends BinderC25693o implements AbstractC25317q {
    static {
        Covode.recordClassIndex(30710);
    }

    public AbstractBinderC25320t() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p1942authapi.BinderC25693o
    /* renamed from: a */
    public final boolean mo41424a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                C25695q.m49622a(parcel, GoogleSignInAccount.CREATOR);
                C25695q.m49622a(parcel, Status.CREATOR);
                mo41406a();
                break;
            case 102:
                mo41407a((Status) C25695q.m49622a(parcel, Status.CREATOR));
                break;
            case 103:
                mo41408b((Status) C25695q.m49622a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
