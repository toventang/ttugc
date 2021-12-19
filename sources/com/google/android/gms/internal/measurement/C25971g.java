package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C25971g implements Parcelable.Creator<zzae> {
    static {
        Covode.recordClassIndex(31386);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j = C25567a.m49340e(parcel, readInt);
                    break;
                case 2:
                    j2 = C25567a.m49340e(parcel, readInt);
                    break;
                case 3:
                    z = C25567a.m49338c(parcel, readInt);
                    break;
                case 4:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    bundle = C25567a.m49343h(parcel, readInt);
                    break;
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzae(j, j2, z, str, str2, str3, bundle);
    }
}
