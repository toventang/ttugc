package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.measurement.internal.o */
public final class C26529o implements Parcelable.Creator<zzan> {
    static {
        Covode.recordClassIndex(31951);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i) {
        return new zzan[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C25567a.m49334b(parcel, readInt);
            } else {
                bundle = C25567a.m49343h(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzan(bundle);
    }
}
