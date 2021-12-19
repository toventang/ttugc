package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.credentials.g */
public final class C25272g implements Parcelable.Creator<CredentialPickerConfig> {
    static {
        Covode.recordClassIndex(30649);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                z = C25567a.m49338c(parcel, readInt);
            } else if (i3 == 2) {
                z2 = C25567a.m49338c(parcel, readInt);
            } else if (i3 == 3) {
                z3 = C25567a.m49338c(parcel, readInt);
            } else if (i3 == 4) {
                i2 = C25567a.m49339d(parcel, readInt);
            } else if (i3 != 1000) {
                C25567a.m49334b(parcel, readInt);
            } else {
                i = C25567a.m49339d(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }
}
