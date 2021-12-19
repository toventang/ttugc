package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.AbstractC62928f;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.C62908a;
import com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80670ab;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80688n;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80693p;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80696r;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.AbstractC80807a;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.PlayerExperimentImpl */
public class PlayerExperimentImpl extends C74613a {
    private static Boolean sDashABREnabled;

    static {
        Covode.recordClassIndex(94304);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int enableIntertrust() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int enableIntertrustDemotion() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int getSuperResolutionStrategyConstDash() {
        return 4;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean Bytevc1PlayAddrPolicyUnifyExperiment() {
        return AbstractC80807a.f180735a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int frameWait() {
        return C80696r.f180415d;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int get265DecodeType() {
        return C80688n.f180395b;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public float getVolLoudUnity() {
        return AbstractC62928f.f142833a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean isAsyncInit() {
        return C80670ab.f180362b;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean videoBitRateEnabled() {
        return VideoBitRateABManager.f180314a.mo123829d();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int ABR4GMaxResolutionIndex() {
        return C16048b.m29633a().mo25412a(true, "player_abr_4g_max_res_index", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int ABRFixedLevel() {
        return C16048b.m29633a().mo25412a(true, "player_abr_fixed_level", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayeAbDashHijackRetryEnableExp() {
        return C16048b.m29633a().mo25412a(true, "player_dash_enable_hijack_retry", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayeAbFixPrepareSeqTmpEnableExp() {
        return ((Number) C62908a.f142802a.getValue()).intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayeAbVIDDashHijackRetryEnableExp() {
        return C16048b.m29633a().mo25412a(true, "player_vid_dash_enable_hijack_retry", 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public float PlayerAbABRBandwidthParamExp() {
        return C16048b.m29633a().mo25410a(true, "player_abr_bandwidth_param", 1.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public float PlayerAbABRStallPenaltyParamExp() {
        return C16048b.m29633a().mo25410a(true, "player_abr_stall_penalty_param", 9.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayerAbABRStartUpModelExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_startup_model", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayerAbABRSwitchCsModelExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_cs_model", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public float PlayerAbABRSwitchPenaltyParamExp() {
        return C16048b.m29633a().mo25410a(true, "player_abr_switch_penalty_param", 2.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayerAbABRSwitchSensitivityExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_switch_sensitivity", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int PlayerAbABRTimerIntervalMillExp() {
        return C16048b.m29633a().mo25412a(true, "player_abr_time_interval_mill", 500);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean PreloadProcessDataExperiment() {
        return C16048b.m29633a().mo25421a(true, "is_preload_process_data", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean enableCdnUrlExpiredExperiment() {
        if (C16048b.m29633a().mo25412a(true, "enable_video_cdn_url_expired_tt", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public int enableSplitVideoAudioPlayback() {
        return C16048b.m29633a().mo25412a(true, "enable_engine_split_mode", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean playEventLogEnabled() {
        return ((Boolean) C80693p.f180406b.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment, com.p2082ss.android.ugc.aweme.simkit.config.p3908b.C74613a
    public boolean isDashABREnabled() {
        if (sDashABREnabled == null) {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "player_abr_enable", 0) != 1) {
                z = false;
            }
            sDashABREnabled = Boolean.valueOf(z);
        }
        return sDashABREnabled.booleanValue();
    }
}
