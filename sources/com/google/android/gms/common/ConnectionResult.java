package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.Arrays;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C25579k();

    /* renamed from: a */
    public static final ConnectionResult f60081a = new ConnectionResult(0);

    /* renamed from: b */
    public final int f60082b;

    /* renamed from: c */
    public final PendingIntent f60083c;

    /* renamed from: d */
    public final String f60084d;

    /* renamed from: e */
    private final int f60085e;

    /* renamed from: b */
    public final boolean mo41434b() {
        if (this.f60082b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo41433a() {
        if (this.f60082b == 0 || this.f60083c == null) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(30722);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f60082b), this.f60083c, this.f60084d});
    }

    public final String toString() {
        return C25560p.m49307a(this).mo41827a("statusCode", m48700a(this.f60082b)).mo41827a("resolution", this.f60083c).mo41827a("message", this.f60084d).toString();
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f60082b != connectionResult.f60082b || !C25560p.m49308a(this.f60083c, connectionResult.f60083c) || !C25560p.m49308a(this.f60084d, connectionResult.f60084d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m48700a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "INVALID_ACCOUNT";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "RESOLUTION_REQUIRED";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "NETWORK_ERROR";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "INTERNAL_ERROR";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "SERVICE_INVALID";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "DEVELOPER_ERROR";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        return "CANCELED";
                    case ABRConfig.ABR_SELECT_SCENE:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
                }
        }
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60085e);
        C25569b.m49360b(parcel, 2, this.f60082b);
        C25569b.m49352a(parcel, 3, this.f60083c, i);
        C25569b.m49353a(parcel, 4, this.f60084d);
        C25569b.m49359b(parcel, a);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f60085e = i;
        this.f60082b = i2;
        this.f60083c = pendingIntent;
        this.f60084d = str;
    }
}
