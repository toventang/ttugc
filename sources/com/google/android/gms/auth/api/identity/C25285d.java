package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.C25567a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.identity.d */
public final class C25285d implements Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> {
    static {
        Covode.recordClassIndex(30667);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.GoogleIdTokenRequestOptions[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.GoogleIdTokenRequestOptions createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = C25567a.m49338c(parcel, readInt);
                    break;
                case 2:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case 3:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case 4:
                    z2 = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    arrayList = C25567a.m49345j(parcel, readInt);
                    break;
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList);
    }
}
