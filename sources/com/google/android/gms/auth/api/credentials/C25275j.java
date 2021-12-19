package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.credentials.j */
public final class C25275j implements Parcelable.Creator<IdToken> {
    static {
        Covode.recordClassIndex(30652);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IdToken[] newArray(int i) {
        return new IdToken[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IdToken createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i != 2) {
                C25567a.m49334b(parcel, readInt);
            } else {
                str2 = C25567a.m49341f(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new IdToken(str, str2);
    }
}
