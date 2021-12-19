package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.measurement.internal.jx */
public final class C26508jx implements Parcelable.Creator<zzkr> {
    static {
        Covode.recordClassIndex(31930);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkr[] newArray(int i) {
        return new zzkr[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkr createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
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
                    j = C25567a.m49340e(parcel, readInt);
                    break;
                case 4:
                    int a2 = C25567a.m49331a(parcel, readInt);
                    if (a2 != 0) {
                        C25567a.m49335b(parcel, a2, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l = null;
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    int a3 = C25567a.m49331a(parcel, readInt);
                    if (a3 != 0) {
                        C25567a.m49335b(parcel, a3, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    int a4 = C25567a.m49331a(parcel, readInt);
                    if (a4 != 0) {
                        C25567a.m49335b(parcel, a4, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new zzkr(i, str, j, l, f, str2, str3, d);
    }
}
