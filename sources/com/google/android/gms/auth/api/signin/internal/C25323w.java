package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.w */
public final class C25323w implements Parcelable.Creator<SignInConfiguration> {
    static {
        Covode.recordClassIndex(30713);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i != 5) {
                C25567a.m49334b(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C25567a.m49332a(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new SignInConfiguration(str, googleSignInOptions);
    }
}
