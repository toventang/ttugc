package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.e */
public final class C25592e implements Parcelable.Creator<WakeLockEvent> {
    static {
        Covode.recordClassIndex(31001);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C25567a.m49339d(parcel, readInt);
                    break;
                case 2:
                    j = C25567a.m49340e(parcel, readInt);
                    break;
                case 3:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
                case 4:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i3 = C25567a.m49339d(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    arrayList = C25567a.m49345j(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    j2 = C25567a.m49340e(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    i2 = C25567a.m49339d(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    str4 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    i4 = C25567a.m49339d(parcel, readInt);
                    break;
                case 15:
                    C25567a.m49333a(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case 16:
                    j3 = C25567a.m49340e(parcel, readInt);
                    break;
                case 17:
                    str5 = C25567a.m49341f(parcel, readInt);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    z = C25567a.m49338c(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }
}
