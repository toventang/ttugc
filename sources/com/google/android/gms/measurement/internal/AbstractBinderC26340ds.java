package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.BinderC25793as;
import com.google.android.gms.internal.measurement.C26232w;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ds */
public abstract class AbstractBinderC26340ds extends BinderC25793as implements AbstractC26341dt {
    static {
        Covode.recordClassIndex(31762);
    }

    public AbstractBinderC26340ds() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC25793as
    /* renamed from: a */
    public final boolean mo42042a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo43032a((zzao) C26232w.m51357a(parcel, zzao.CREATOR), (zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo43034a((zzkr) C26232w.m51357a(parcel, zzkr.CREATOR), (zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            default:
                return false;
            case 4:
                mo43035a((zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                mo43033a((zzao) C26232w.m51357a(parcel, zzao.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                mo43039b((zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                List<zzkr> a = mo43025a((zzn) C26232w.m51357a(parcel, zzn.CREATOR), C26232w.m51361a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                byte[] a2 = mo43038a((zzao) C26232w.m51357a(parcel, zzao.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                return true;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                mo43030a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                String c = mo43040c((zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                mo43037a((zzw) C26232w.m51357a(parcel, zzw.CREATOR), (zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                mo43036a((zzw) C26232w.m51357a(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_SELECT_SCENE:
                List<zzkr> a3 = mo43029a(parcel.readString(), parcel.readString(), C26232w.m51361a(parcel), (zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                return true;
            case 15:
                List<zzkr> a4 = mo43028a(parcel.readString(), parcel.readString(), parcel.readString(), C26232w.m51361a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                return true;
            case 16:
                List<zzw> a5 = mo43026a(parcel.readString(), parcel.readString(), (zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                return true;
            case 17:
                List<zzw> a6 = mo43027a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                return true;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                mo43041d((zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo43031a((Bundle) C26232w.m51357a(parcel, Bundle.CREATOR), (zzn) C26232w.m51357a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
