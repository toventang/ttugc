package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public final class C25303c implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    static {
        Covode.recordClassIndex(30693);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        int i = 0;
        Bundle bundle = null;
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
                bundle = C25567a.m49343h(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new GoogleSignInOptionsExtensionParcelable(i, i2, bundle);
    }
}
