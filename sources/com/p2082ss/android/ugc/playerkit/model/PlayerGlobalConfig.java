package com.p2082ss.android.ugc.playerkit.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.C84209m;

/* renamed from: com.ss.android.ugc.playerkit.model.PlayerGlobalConfig */
public interface PlayerGlobalConfig {
    static {
        Covode.recordClassIndex(98103);
    }

    Context context();

    boolean forceHttps();

    float getAdjustedVolume();

    double getBitrateModelThreshold();

    int getPlayerBackgroundSleepStrategy();

    int getPlayerFramesWait();

    C84209m.EnumC84214e getPlayerType();

    int getPreloadType();

    int getRenderType();

    C84203g getVideoEffectInfo();

    boolean isAsyncInit();

    boolean isCallbackCompletionFix();

    boolean isDebug();

    boolean isDynamicBitrateEnable();

    boolean isEnableBytevc1();

    boolean isEnableBytevc1BlackList();

    boolean isEnablePlayerLogV2();

    boolean isEnableSurfaceLifeCycleNotification();

    boolean isMultiPlayer();

    boolean isPrerenderSurfaceSlowSetFix();

    boolean isUseSurfaceControl();

    boolean isUseSurfaceView();

    boolean isUseVideoTextureRenderer();

    AbstractC84205i prepareConfig();

    void setForceHttps(boolean z);

    boolean shouldForceToKeepSurfaceBelowKITKAT();
}
