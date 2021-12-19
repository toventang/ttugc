package com.p2082ss.texturerender.p4404a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.texturerender.a.e */
public final class C86175e {
    static {
        Covode.recordClassIndex(101318);
    }

    /* renamed from: a */
    public static AbstractC86171a m148024a(int i) {
        switch (i) {
            case 1:
                return new C86172b();
            case 2:
                return new C86183m();
            case 3:
                return new C86185o();
            case 4:
                return new C86182l();
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return new C86186p();
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            default:
                return null;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return new C86180j();
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new C86184n();
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return new C86181k();
        }
    }
}
