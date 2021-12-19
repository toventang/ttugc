package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.kc */
public final class C26514kc implements Parcelable.Creator<zzn> {
    static {
        Covode.recordClassIndex(31936);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn[] newArray(int i) {
        return new zzn[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn createFromParcel(Parcel parcel) {
        boolean z;
        int a = C25567a.m49330a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
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
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str4 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    j = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    j2 = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str5 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    z2 = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    z3 = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    j6 = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str6 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    j3 = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    j4 = C25567a.m49340e(parcel, readInt);
                    break;
                case 15:
                    i = C25567a.m49339d(parcel, readInt);
                    break;
                case 16:
                    z4 = C25567a.m49338c(parcel, readInt);
                    break;
                case 17:
                    z5 = C25567a.m49338c(parcel, readInt);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    z6 = C25567a.m49338c(parcel, readInt);
                    break;
                case 19:
                    str7 = C25567a.m49341f(parcel, readInt);
                    break;
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
                case 21:
                    int a2 = C25567a.m49331a(parcel, readInt);
                    if (a2 != 0) {
                        C25567a.m49335b(parcel, a2, 4);
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j5 = C25567a.m49340e(parcel, readInt);
                    break;
                case 23:
                    arrayList = C25567a.m49345j(parcel, readInt);
                    break;
                case 24:
                    str8 = C25567a.m49341f(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzn(str, str2, str3, str4, j, j2, str5, z2, z3, j6, str6, j3, j4, i, z4, z5, z6, str7, bool, j5, arrayList, str8);
    }
}
