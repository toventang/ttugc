package com.google.android.gms.internal.p1942authapi;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.aa */
public abstract class AbstractBinderC25675aa extends BinderC25693o implements AbstractC25676ab {
    static {
        Covode.recordClassIndex(31089);
    }

    public AbstractBinderC25675aa() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p1942authapi.BinderC25693o
    /* renamed from: a */
    public final boolean mo41424a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo41927a((Status) C25695q.m49622a(parcel, Status.CREATOR), (Credential) C25695q.m49622a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo41926a((Status) C25695q.m49622a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C25695q.m49622a(parcel, Status.CREATOR);
            parcel.readString();
            mo41925a();
        }
        parcel2.writeNoException();
        return true;
    }
}
