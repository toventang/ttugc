package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.internal.ad */
public final class C25511ad implements Parcelable.Creator<ResolveAccountResponse> {
    static {
        Covode.recordClassIndex(30914);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = C25567a.m49342g(parcel, readInt);
            } else if (i2 == 3) {
                connectionResult = (ConnectionResult) C25567a.m49332a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 == 4) {
                z = C25567a.m49338c(parcel, readInt);
            } else if (i2 != 5) {
                C25567a.m49334b(parcel, readInt);
            } else {
                z2 = C25567a.m49338c(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
    }
}
