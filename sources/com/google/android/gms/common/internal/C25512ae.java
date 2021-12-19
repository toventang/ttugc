package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.internal.ae */
public final class C25512ae implements Parcelable.Creator<zza> {
    static {
        Covode.recordClassIndex(30915);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i) {
        return new zza[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = C25567a.m49343h(parcel, readInt);
            } else if (i2 == 2) {
                featureArr = (Feature[]) C25567a.m49336b(parcel, readInt, Feature.CREATOR);
            } else if (i2 != 3) {
                C25567a.m49334b(parcel, readInt);
            } else {
                i = C25567a.m49339d(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zza(bundle, featureArr, i);
    }
}
