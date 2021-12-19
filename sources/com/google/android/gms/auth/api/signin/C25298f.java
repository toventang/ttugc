package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C25567a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C25298f implements Parcelable.Creator<GoogleSignInOptions> {
    static {
        Covode.recordClassIndex(30685);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C25567a.m49339d(parcel, readInt);
                    break;
                case 2:
                    arrayList = C25567a.m49337c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C25567a.m49332a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    z2 = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    z3 = C25567a.m49338c(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str2 = C25567a.m49341f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    arrayList2 = C25567a.m49337c(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str3 = C25567a.m49341f(parcel, readInt);
                    break;
                default:
                    C25567a.m49334b(parcel, readInt);
                    break;
            }
        }
        C25567a.m49346k(parcel, a);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }
}
