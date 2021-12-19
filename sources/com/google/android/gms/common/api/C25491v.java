package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.api.v */
public final class C25491v implements Parcelable.Creator<Scope> {
    static {
        Covode.recordClassIndex(30890);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i2 != 2) {
                C25567a.m49334b(parcel, readInt);
            } else {
                str = C25567a.m49341f(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new Scope(i, str);
    }
}
