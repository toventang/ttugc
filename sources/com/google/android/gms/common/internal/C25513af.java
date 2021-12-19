package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.internal.af */
public final class C25513af implements Parcelable.Creator<GetServiceRequest> {
    static {
        Covode.recordClassIndex(30916);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C25567a.m49339d(parcel, readInt);
                    break;
                case 2:
                    i2 = C25567a.m49339d(parcel, readInt);
                    break;
                case 3:
                    i3 = C25567a.m49339d(parcel, readInt);
                    break;
                case 4:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    iBinder = C25567a.m49342g(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    scopeArr = (Scope[]) C25567a.m49336b(parcel, readInt, Scope.CREATOR);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    bundle = C25567a.m49343h(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    account = (Account) C25567a.m49332a(parcel, readInt, Account.CREATOR);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    featureArr = (Feature[]) C25567a.m49336b(parcel, readInt, Feature.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    featureArr2 = (Feature[]) C25567a.m49336b(parcel, readInt, Feature.CREATOR);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    z = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    i4 = C25567a.m49339d(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4);
    }
}
