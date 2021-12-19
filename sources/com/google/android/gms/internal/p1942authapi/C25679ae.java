package com.google.android.gms.internal.p1942authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.internal.auth-api.ae */
public final class C25679ae implements Parcelable.Creator<zzz> {
    static {
        Covode.recordClassIndex(31093);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i) {
        return new zzz[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C25567a.m49334b(parcel, readInt);
            } else {
                credential = (Credential) C25567a.m49332a(parcel, readInt, Credential.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzz(credential);
    }
}
