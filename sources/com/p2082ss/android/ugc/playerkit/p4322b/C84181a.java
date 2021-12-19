package com.p2082ss.android.ugc.playerkit.p4322b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.AbstractC84205i;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig;

/* renamed from: com.ss.android.ugc.playerkit.b.a */
public final class C84181a implements PlayerGlobalConfig {

    /* renamed from: a */
    public static Context f187860a;

    static {
        Covode.recordClassIndex(98083);
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean forceHttps() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final double getBitrateModelThreshold() {
        return -1.0d;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerFramesWait() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPreloadType() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getRenderType() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final C84203g getVideoEffectInfo() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isAsyncInit() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isCallbackCompletionFix() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDebug() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicBitrateEnable() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1BlackList() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnablePlayerLogV2() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableSurfaceLifeCycleNotification() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isMultiPlayer() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPrerenderSurfaceSlowSetFix() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceControl() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceView() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseVideoTextureRenderer() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final void setForceHttps(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean shouldForceToKeepSurfaceBelowKITKAT() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final Context context() {
        return f187860a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final C84209m.EnumC84214e getPlayerType() {
        return C84209m.EnumC84214e.TT;
    }

    @Override // com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final AbstractC84205i prepareConfig() {
        return new AbstractC84205i() {
            /* class com.p2082ss.android.ugc.playerkit.p4322b.C84181a.C841821 */

            static {
                Covode.recordClassIndex(98084);
            }

            @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
            public final String getFirstFrameKey() {
                return "first_frame_time";
            }

            @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
            public final String getPrepareKey() {
                return "prepare_time";
            }

            @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
            public final boolean isLoop() {
                return true;
            }

            @Override // com.p2082ss.android.ugc.playerkit.model.AbstractC84205i
            public final boolean isPlayLoop() {
                return true;
            }
        };
    }
}
