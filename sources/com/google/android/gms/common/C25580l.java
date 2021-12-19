package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.l */
public final class C25580l implements Parcelable.Creator<Feature> {
    static {
        Covode.recordClassIndex(30987);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature[] newArray(int i) {
        return new Feature[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i2 == 2) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i2 != 3) {
                C25567a.m49334b(parcel, readInt);
            } else {
                j = C25567a.m49340e(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new Feature(str, i, j);
    }
}
