package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFluencySupportSampleSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9335a DEFAULT;
    public static final LiveFluencySupportSampleSetting INSTANCE = new LiveFluencySupportSampleSetting();
    private static C9335a liveFluencySupportSample;

    private LiveFluencySupportSampleSetting() {
    }

    public final boolean isAudienceLinkPeriodEnable() {
        return liveFluencySupportSample.f22798i;
    }

    public final boolean isBroadcastEnterEnable() {
        return liveFluencySupportSample.f22793d;
    }

    public final boolean isBroadcastLinkPeriodEnable() {
        return liveFluencySupportSample.f22797h;
    }

    public final boolean isBroadcastPeriodEnable() {
        return liveFluencySupportSample.f22797h;
    }

    public final boolean isGiftPlayEnable() {
        return liveFluencySupportSample.f22800k;
    }

    public final boolean isPanelBeautySlideEnable() {
        return liveFluencySupportSample.f22805p;
    }

    public final boolean isPanelBroadcastLinkSlideEnable() {
        return liveFluencySupportSample.f22803n;
    }

    public final boolean isPanelFilterSlideEnable() {
        return liveFluencySupportSample.f22806q;
    }

    public final boolean isPanelGiftSlideEnable() {
        return liveFluencySupportSample.f22801l;
    }

    public final boolean isPanelHourlyRankSlideEnable() {
        return liveFluencySupportSample.f22802m;
    }

    public final boolean isPanelPublicScreenSlideEnable() {
        return liveFluencySupportSample.f22804o;
    }

    public final boolean isPanelStickerSlideEnable() {
        return liveFluencySupportSample.f22807r;
    }

    public final boolean isPkPeriodEnable() {
        return liveFluencySupportSample.f22799j;
    }

    public final boolean isPreviewEnterEnable() {
        return liveFluencySupportSample.f22795f;
    }

    public final boolean isPreviewPeriodEnable() {
        return liveFluencySupportSample.f22796g;
    }

    public final boolean isWatchEnterEnable() {
        return liveFluencySupportSample.f22790a;
    }

    public final boolean isWatchPeriodEnable() {
        return liveFluencySupportSample.f22792c;
    }

    public final boolean isWatchSlideEnable() {
        return liveFluencySupportSample.f22791b;
    }

    static {
        Covode.recordClassIndex(10648);
        C9335a aVar = new C9335a((byte) 0);
        DEFAULT = aVar;
        C9335a aVar2 = (C9335a) SettingsManager.INSTANCE.getValueSafely(LiveFluencySupportSampleSetting.class);
        if (aVar2 != null) {
            aVar = aVar2;
        }
        liveFluencySupportSample = aVar;
    }
}
