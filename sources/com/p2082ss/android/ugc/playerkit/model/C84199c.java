package com.p2082ss.android.ugc.playerkit.model;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.p4322b.C84181a;

/* renamed from: com.ss.android.ugc.playerkit.model.c */
public final class C84199c implements PlayerGlobalConfig {

    /* renamed from: a */
    public static C84199c f187979a = new C84199c();

    /* renamed from: b */
    public PlayerGlobalConfig f187980b;

    /* renamed from: c */
    private PlayerGlobalConfig f187981c = new C84181a();

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDebug() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final void setForceHttps(boolean z) {
    }

    static {
        Covode.recordClassIndex(98106);
    }

    /* renamed from: a */
    private void m144800a() {
        if (this.f187980b == null) {
            this.f187980b = (PlayerGlobalConfig) InjectedConfigManager.getConfig(PlayerGlobalConfig.class);
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final float getAdjustedVolume() {
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getAdjustedVolume();
        }
        return this.f187981c.getAdjustedVolume();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final Context context() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.context();
        }
        return this.f187981c.context();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean forceHttps() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.forceHttps();
        }
        return this.f187981c.forceHttps();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final double getBitrateModelThreshold() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getBitrateModelThreshold();
        }
        return this.f187981c.getBitrateModelThreshold();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerBackgroundSleepStrategy() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerBackgroundSleepStrategy();
        }
        return this.f187981c.getPlayerBackgroundSleepStrategy();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerFramesWait() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerFramesWait();
        }
        return this.f187981c.getPlayerFramesWait();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final C84209m.EnumC84214e getPlayerType() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerType();
        }
        return this.f187981c.getPlayerType();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPreloadType() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPreloadType();
        }
        return this.f187981c.getPreloadType();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getRenderType() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getRenderType();
        }
        return this.f187981c.getRenderType();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final C84203g getVideoEffectInfo() {
        m144800a();
        try {
            PlayerGlobalConfig playerGlobalConfig = this.f187980b;
            if (playerGlobalConfig != null) {
                return playerGlobalConfig.getVideoEffectInfo();
            }
            return this.f187981c.getVideoEffectInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isAsyncInit() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isAsyncInit();
        }
        return this.f187981c.isAsyncInit();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isCallbackCompletionFix() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isCallbackCompletionFix();
        }
        return this.f187981c.isCallbackCompletionFix();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicBitrateEnable() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isDynamicBitrateEnable();
        }
        return this.f187981c.isDynamicBitrateEnable();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableBytevc1();
        }
        return this.f187981c.isEnableBytevc1();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1BlackList() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableBytevc1BlackList();
        }
        return this.f187981c.isEnableBytevc1BlackList();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnablePlayerLogV2() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnablePlayerLogV2();
        }
        return this.f187981c.isEnablePlayerLogV2();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableSurfaceLifeCycleNotification() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableSurfaceLifeCycleNotification();
        }
        return this.f187981c.isEnableSurfaceLifeCycleNotification();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isMultiPlayer() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isMultiPlayer();
        }
        return this.f187981c.isMultiPlayer();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPrerenderSurfaceSlowSetFix() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isPrerenderSurfaceSlowSetFix();
        }
        return this.f187981c.isPrerenderSurfaceSlowSetFix();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceControl() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig == null) {
            return this.f187981c.isUseSurfaceControl();
        }
        if (!playerGlobalConfig.isUseSurfaceControl() || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceView() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isUseSurfaceView();
        }
        return this.f187981c.isUseSurfaceView();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseVideoTextureRenderer() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isUseVideoTextureRenderer();
        }
        return this.f187981c.isUseVideoTextureRenderer();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final AbstractC84205i prepareConfig() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.prepareConfig();
        }
        return this.f187981c.prepareConfig();
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean shouldForceToKeepSurfaceBelowKITKAT() {
        m144800a();
        PlayerGlobalConfig playerGlobalConfig = this.f187980b;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.shouldForceToKeepSurfaceBelowKITKAT();
        }
        return this.f187981c.shouldForceToKeepSurfaceBelowKITKAT();
    }
}
