package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.google.android.play.core.b.ar */
public abstract class AbstractBinderC26900ar extends BinderC26928bs implements AbstractC26901as {
    static {
        Covode.recordClassIndex(32375);
    }

    public AbstractBinderC26900ar() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p1963b.BinderC26928bs
    /* renamed from: a */
    public final boolean mo44576a(int i, Parcel parcel) {
        switch (i) {
            case 2:
                mo44579a(parcel.readInt(), (Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44578a(readInt);
                return true;
            case 4:
                mo44582b(parcel.readInt(), (Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                mo44584c(parcel.readInt(), (Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                mo44580a((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                parcel.createTypedArrayList(Bundle.CREATOR);
                mo44577a();
                return true;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44581b();
                return true;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44583c();
                return true;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44588g();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44587f();
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44585d();
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44586e();
                return true;
            default:
                return false;
        }
    }
}
