package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.signin.internal.h */
public final class C26553h implements Parcelable.Creator<zai> {
    static {
        Covode.recordClassIndex(31981);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i) {
        return new zai[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i2 != 2) {
                C25567a.m49334b(parcel, readInt);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) C25567a.m49332a(parcel, readInt, ResolveAccountRequest.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zai(i, resolveAccountRequest);
    }
}
