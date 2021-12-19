package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.identity.g */
public final class C25289g implements Parcelable.Creator<SignInCredential> {
    static {
        Covode.recordClassIndex(30671);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInCredential[] newArray(int i) {
        return new SignInCredential[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInCredential createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case 2:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case 3:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case 4:
                    str4 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    uri = (Uri) C25567a.m49332a(parcel, readInt, Uri.CREATOR);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str5 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str6 = C25567a.m49341f(parcel, readInt);
                    break;
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6);
    }
}
