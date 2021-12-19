package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.identity.e */
public final class C25286e implements Parcelable.Creator<BeginSignInRequest.PasswordRequestOptions> {
    static {
        Covode.recordClassIndex(30668);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.PasswordRequestOptions[] newArray(int i) {
        return new BeginSignInRequest.PasswordRequestOptions[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.PasswordRequestOptions createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C25567a.m49334b(parcel, readInt);
            } else {
                z = C25567a.m49338c(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new BeginSignInRequest.PasswordRequestOptions(z);
    }
}
