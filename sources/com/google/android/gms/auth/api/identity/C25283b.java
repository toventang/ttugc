package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.identity.b */
public final class C25283b implements Parcelable.Creator<BeginSignInRequest> {
    static {
        Covode.recordClassIndex(30665);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest[] newArray(int i) {
        return new BeginSignInRequest[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) C25567a.m49332a(parcel, readInt, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            } else if (i == 2) {
                googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) C25567a.m49332a(parcel, readInt, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
            } else if (i == 3) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i != 4) {
                C25567a.m49334b(parcel, readInt);
            } else {
                z = C25567a.m49338c(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z);
    }
}
