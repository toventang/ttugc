package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.measurement.internal.kn */
public final class C26525kn implements Parcelable.Creator<zzw> {
    static {
        Covode.recordClassIndex(31947);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzw[] newArray(int i) {
        return new zzw[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzw createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str2 = null;
        zzkr zzkr = null;
        String str3 = null;
        zzao zzao = null;
        zzao zzao2 = null;
        zzao zzao3 = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case 3:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case 4:
                    zzkr = (zzkr) C25567a.m49332a(parcel, readInt, zzkr.CREATOR);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    j = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    z = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    zzao = (zzao) C25567a.m49332a(parcel, readInt, zzao.CREATOR);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    j2 = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    zzao2 = (zzao) C25567a.m49332a(parcel, readInt, zzao.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    j3 = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    zzao3 = (zzao) C25567a.m49332a(parcel, readInt, zzao.CREATOR);
                    break;
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzw(str, str2, zzkr, j, z, str3, zzao, j2, zzao2, j3, zzao3);
    }
}
