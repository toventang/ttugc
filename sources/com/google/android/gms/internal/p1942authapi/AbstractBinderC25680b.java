package com.google.android.gms.internal.p1942authapi;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.b */
public abstract class AbstractBinderC25680b extends BinderC25693o implements AbstractC25674a {
    static {
        Covode.recordClassIndex(31094);
    }

    public AbstractBinderC25680b() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p1942authapi.BinderC25693o
    /* renamed from: a */
    public final boolean mo41424a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo41924a((Status) C25695q.m49622a(parcel, Status.CREATOR), (BeginSignInResult) C25695q.m49622a(parcel, BeginSignInResult.CREATOR));
        return true;
    }
}
