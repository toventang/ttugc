package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.ttvideoengine.EnumC86649v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.f */
public final class C62968f {

    /* renamed from: a */
    public static final C62968f f142929a = new C62968f();

    private C62968f() {
    }

    static {
        Covode.recordClassIndex(73805);
    }

    /* renamed from: a */
    public static EnumC63056b m113420a(EnumC86649v vVar) {
        C89219l.m154719c(vVar, "");
        switch (C62969g.f142931b[vVar.ordinal()]) {
            case 1:
                return EnumC63056b.Undefine;
            case 2:
                return EnumC63056b.Standard;
            case 3:
                return EnumC63056b.High;
            case 4:
                return EnumC63056b.SuperHigh;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return EnumC63056b.ExtremelyHigh;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return EnumC63056b.FourK;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return EnumC63056b.HDR;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return EnumC63056b.Auto;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return EnumC63056b.L_Standard;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return EnumC63056b.H_High;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return EnumC63056b.TwoK;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return EnumC63056b.ExtremelyHigh_50F;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return EnumC63056b.TwoK_50F;
            case ABRConfig.ABR_SELECT_SCENE:
                return EnumC63056b.FourK_50F;
            case 15:
                return EnumC63056b.ExtremelyHigh_60F;
            case 16:
                return EnumC63056b.TwoK_60F;
            case 17:
                return EnumC63056b.FourK_60F;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return EnumC63056b.ExtremelyHigh_120F;
            case 19:
                return EnumC63056b.TwoK_120F;
            case C84224v.f188239U:
                return EnumC63056b.FourK_120F;
            default:
                return EnumC63056b.Undefine;
        }
    }

    /* renamed from: a */
    public static EnumC86649v m113421a(EnumC63056b bVar) {
        if (bVar != null) {
            switch (C62969g.f142930a[bVar.ordinal()]) {
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
