package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.v */
public final class C25617v implements Parcelable.Creator<zzj> {
    static {
        Covode.recordClassIndex(31027);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i == 2) {
                iBinder = C25567a.m49342g(parcel, readInt);
            } else if (i == 3) {
                z = C25567a.m49338c(parcel, readInt);
            } else if (i != 4) {
                C25567a.m49334b(parcel, readInt);
            } else {
                z2 = C25567a.m49338c(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzj(str, iBinder, z, z2);
    }
}
