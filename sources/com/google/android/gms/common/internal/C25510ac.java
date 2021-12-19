package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.internal.ac */
public final class C25510ac implements Parcelable.Creator<ResolveAccountRequest> {
    static {
        Covode.recordClassIndex(30913);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) C25567a.m49332a(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = C25567a.m49339d(parcel, readInt);
            } else if (i3 != 4) {
                C25567a.m49334b(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C25567a.m49332a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }
}
