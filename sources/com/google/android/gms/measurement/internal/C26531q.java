package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C26531q implements Parcelable.Creator<zzao> {
    static {
        Covode.recordClassIndex(31953);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzao[] newArray(int i) {
        return new zzao[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzao createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        zzan zzan = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i == 3) {
                zzan = (zzan) C25567a.m49332a(parcel, readInt, zzan.CREATOR);
            } else if (i == 4) {
                str2 = C25567a.m49341f(parcel, readInt);
            } else if (i != 5) {
                C25567a.m49334b(parcel, readInt);
            } else {
                j = C25567a.m49340e(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzao(str, zzan, str2, j);
    }
}
