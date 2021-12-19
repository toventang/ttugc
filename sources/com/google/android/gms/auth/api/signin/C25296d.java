package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C25567a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.d */
public final class C25296d implements Parcelable.Creator<GoogleSignInAccount> {
    static {
        Covode.recordClassIndex(30683);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C25567a.m49339d(parcel, readInt);
                    break;
                case 2:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case 3:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case 4:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str4 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    uri = (Uri) C25567a.m49332a(parcel, readInt, Uri.CREATOR);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str5 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    j = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str6 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    arrayList = C25567a.m49337c(parcel, readInt, Scope.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    str7 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str8 = C25567a.m49341f(parcel, readInt);
                    break;
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }
}
