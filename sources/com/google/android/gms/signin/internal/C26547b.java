package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.signin.internal.b */
public final class C26547b implements Parcelable.Creator<zab> {
    static {
        Covode.recordClassIndex(31975);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zab[] newArray(int i) {
        return new zab[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zab createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i3 == 2) {
                i2 = C25567a.m49339d(parcel, readInt);
            } else if (i3 != 3) {
                C25567a.m49334b(parcel, readInt);
            } else {
                intent = (Intent) C25567a.m49332a(parcel, readInt, Intent.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zab(i, i2, intent);
    }
}
