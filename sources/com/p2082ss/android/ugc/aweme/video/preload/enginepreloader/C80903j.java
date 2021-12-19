package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.ttvideoengine.EnumC86649v;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.j */
public final class C80903j {

    /* renamed from: a */
    public static final C80903j f180897a = new C80903j();

    private C80903j() {
    }

    static {
        Covode.recordClassIndex(94202);
    }

    /* renamed from: a */
    public static EnumC86649v m140383a(EnumC63056b bVar) {
        if (bVar != null) {
            switch (C80904k.f180898a[bVar.ordinal()]) {
                case 1:
                    return EnumC86649v.Undefine;
                case 2:
                    return EnumC86649v.Standard;
                case 3:
                    return EnumC86649v.High;
                case 4:
                    return EnumC86649v.SuperHigh;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return EnumC86649v.ExtremelyHigh;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return EnumC86649v.FourK;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return EnumC86649v.HDR;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return EnumC86649v.Auto;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return EnumC86649v.L_Standard;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return EnumC86649v.H_High;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return EnumC86649v.TwoK;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return EnumC86649v.ExtremelyHigh_50F;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return EnumC86649v.TwoK_50F;
                case ABRConfig.ABR_SELECT_SCENE:
                    return EnumC86649v.FourK_50F;
                case 15:
                    return EnumC86649v.ExtremelyHigh_60F;
                case 16:
                    return EnumC86649v.TwoK_60F;
                case 17:
                    return EnumC86649v.FourK_60F;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    return EnumC86649v.ExtremelyHigh_120F;
                case 19:
                    return EnumC86649v.TwoK_120F;
                case C84224v.f188239U:
                    return EnumC86649v.FourK_120F;
            }
        }
        return EnumC86649v.Undefine;
    }
}
