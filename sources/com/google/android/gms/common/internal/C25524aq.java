package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.internal.aq */
public final class C25524aq implements Parcelable.Creator<zzs> {
    static {
        Covode.recordClassIndex(30927);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs[] newArray(int i) {
        return new zzs[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C25567a.m49334b(parcel, readInt);
            } else {
                i = C25567a.m49339d(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzs(i);
    }
}
