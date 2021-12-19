package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.credentials.f */
public final class C25271f implements Parcelable.Creator<Credential> {
    static {
        Covode.recordClassIndex(30648);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i) {
        return new Credential[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
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
                    uri = (Uri) C25567a.m49332a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C25567a.m49337c(parcel, readInt, IdToken.CREATOR);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str4 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str5 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str6 = C25567a.m49341f(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }
}
