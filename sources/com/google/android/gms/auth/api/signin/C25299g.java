package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.signin.g */
public final class C25299g implements Parcelable.Creator<SignInAccount> {
    static {
        Covode.recordClassIndex(30686);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 4) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i == 7) {
                googleSignInAccount = (GoogleSignInAccount) C25567a.m49332a(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (i != 8) {
                C25567a.m49334b(parcel, readInt);
            } else {
                str2 = C25567a.m49341f(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
