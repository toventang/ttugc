package com.p2082ss.android.ugc.aweme.video.simkit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.lancet.C58034o;
import com.p2082ss.android.ugc.aweme.video.C80779o;
import com.p2082ss.android.ugc.aweme.video.EnumC81083x;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import com.p2082ss.android.ugc.aweme.video.p4208b.AbstractC80671ac;
import com.p2082ss.android.ugc.aweme.video.p4208b.AbstractC80679e;
import com.p2082ss.android.ugc.aweme.video.p4208b.AbstractC80702v;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80674af;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80682h;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80697s;
import com.p2082ss.android.ugc.playerkit.model.AbstractC84205i;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.PlayerGlobalConfigImpl */
public class PlayerGlobalConfigImpl implements PlayerGlobalConfig {
    private static int isEnableSurfaceLifeCycleExpCachedVal = -1;
    private static boolean sForceHttps;
    private static C84209m.EnumC84214e sPlayerType;

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    public String getPredictLabelResult() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public C84203g getVideoEffectInfo() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isCallbackCompletionFix() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDebug() {
        return false;
    }

    public boolean isEnableByteVC1AutoRetry() {
        return false;
    }

    public boolean isPowerModeHandlerEnable() {
        return false;
    }

    public boolean isPrepareAhead() {
        return false;
    }

    public boolean isSurfaceControlClearSurface() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceControl() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getRenderType() {
        return AbstractC80671ac.f180364a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1() {
        return AbstractC80679e.f180379a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceView() {
        return C80771f.f180597a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseVideoTextureRenderer() {
        return AbstractC80702v.f180425a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public AbstractC84205i prepareConfig() {
        return EnumC81083x.Normal;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public Context context() {
        return C17867d.m33078a();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPreloadType() {
        return C80695q.m139909b();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDynamicBitrateEnable() {
        return VideoBitRateABManager.f180314a.mo123829d();
    }

    public boolean isPlayLinkSelectEnabled() {
        return C80682h.m139907a();
    }

    static {
        Covode.recordClassIndex(94257);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean forceHttps() {
        if (C58034o.f132267a || sForceHttps) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public double getBitrateModelThreshold() {
        return C16048b.m29633a().mo25409a(true, "video_auto_model_threshold", -1.0d);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlayerFramesWait() {
        return C16048b.m29633a().mo25412a(true, "player_framews_wait", 1);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public C84209m.EnumC84214e getPlayerType() {
        if (sPlayerType == null) {
            sPlayerType = C80779o.m140114b();
        }
        return sPlayerType;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isAsyncInit() {
        return C16048b.m29633a().mo25421a(true, "is_ttplayer_async_init", true);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1BlackList() {
        return C16048b.m29633a().mo25421a(true, "enable_bytevc1_black_list", false);
    }

    public boolean isEnableLocalVideoPlay() {
        return C16048b.m29633a().mo25421a(true, "is_local_video_play_enable", true);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnablePlayerLogV2() {
        return C16048b.m29633a().mo25421a(true, "player_event_log_v2_open", true);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isMultiPlayer() {
        return C16048b.m29633a().mo25421a(true, "enable_multi_player", false);
    }

    public boolean isUseVideoCacheHttpDns() {
        return C16048b.m29633a().mo25421a(true, "use_video_cache_http_dns", false);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean shouldForceToKeepSurfaceBelowKITKAT() {
        return C16048b.m29633a().mo25421a(true, "should_force_to_keep_surface_below_kitkat", false);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableSurfaceLifeCycleNotification() {
        if (-1 == isEnableSurfaceLifeCycleExpCachedVal) {
            isEnableSurfaceLifeCycleExpCachedVal = C16048b.m29633a().mo25412a(true, "surface_lifecycle_notification_enabled", 0);
        }
        if (1 == isEnableSurfaceLifeCycleExpCachedVal) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isPrerenderSurfaceSlowSetFix() {
        if (C46796cm.f109016a) {
            return ((Boolean) C80697s.f180417a.getValue()).booleanValue();
        }
        return C16048b.m29633a().mo25421a(true, "player_prerender_surface_slow_set_fix", false);
    }

    public boolean isUseTTNet() {
        if (C16048b.m29633a().mo25412a(true, "use_ttnet", 1) == C80674af.f180369a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public void setForceHttps(boolean z) {
        sForceHttps = z;
    }
}
