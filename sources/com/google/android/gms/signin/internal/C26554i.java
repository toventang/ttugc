package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.signin.internal.i */
public final class C26554i implements Parcelable.Creator<zak> {
    static {
        Covode.recordClassIndex(31982);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i) {
        return new zak[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i2 == 2) {
                connectionResult = (ConnectionResult) C25567a.m49332a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 != 3) {
                C25567a.m49334b(parcel, readInt);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) C25567a.m49332a(parcel, readInt, ResolveAccountResponse.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zak(i, connectionResult, resolveAccountResponse);
    }
}
