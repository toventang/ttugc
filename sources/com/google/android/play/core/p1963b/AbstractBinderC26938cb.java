package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.google.android.play.core.b.cb */
public abstract class AbstractBinderC26938cb extends BinderC26928bs implements AbstractC26939cc {
    static {
        Covode.recordClassIndex(32413);
    }

    public AbstractBinderC26938cb() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p1963b.BinderC26928bs
    /* renamed from: a */
    public final boolean mo44576a(int i, Parcel parcel) {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44545a(readInt);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44550b(readInt2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44554c(readInt3);
                return true;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                mo44548a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44551b((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                mo44546a((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44555c((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            default:
                return false;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44556d((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                mo44547a((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR), (Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                mo44552b((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR), (Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44544a();
                return true;
            case ABRConfig.ABR_SELECT_SCENE:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44553c();
                return true;
            case 15:
                C26929bt.m53497a(parcel, Bundle.CREATOR);
                mo44549b();
                return true;
        }
    }
}
