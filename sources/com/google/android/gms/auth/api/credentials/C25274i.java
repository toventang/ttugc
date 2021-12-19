package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.credentials.i */
public final class C25274i implements Parcelable.Creator<HintRequest> {
    static {
        Covode.recordClassIndex(30651);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest[] newArray(int i) {
        return new HintRequest[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != 1000) {
                switch (i2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) C25567a.m49332a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        continue;
                    case 2:
                        z = C25567a.m49338c(parcel, readInt);
                        continue;
                    case 3:
                        z2 = C25567a.m49338c(parcel, readInt);
                        continue;
                    case 4:
                        strArr = C25567a.m49344i(parcel, readInt);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        z3 = C25567a.m49338c(parcel, readInt);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        str = C25567a.m49341f(parcel, readInt);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        str2 = C25567a.m49341f(parcel, readInt);
                        continue;
                    default:
                        C25567a.m49334b(parcel, readInt);
                        continue;
                }
            } else {
                i = C25567a.m49339d(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }
}
