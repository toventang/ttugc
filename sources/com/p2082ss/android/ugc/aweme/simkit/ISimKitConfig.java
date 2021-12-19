package com.p2082ss.android.ugc.aweme.simkit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.p2082ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.p2082ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;

/* renamed from: com.ss.android.ugc.aweme.simkit.ISimKitConfig */
public interface ISimKitConfig {
    static {
        Covode.recordClassIndex(87413);
    }

    PlayerSettingService PlayerSettingService();

    IALog getALog();

    IAppConfig getAppConfig();

    ICommonConfig getCommonConfig();

    IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig();

    IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig();

    IEvent getEvent();

    IMonitor getMonitor();

    PlayerGlobalConfig getPlayerGlobalConfig();

    IPreloaderExperiment getPreloaderExperiment();

    ISimPlayerConfig getSimPlayerConfig();

    IPlayerExperiment getSimPlayerExperiment();

    ISimReporterConfig getSimReporterConfig();

    ISpeedCalculatorConfig getSpeedCalculatorConfig();

    IVideoPreloadConfig getVideoPreloaderManagerConfig();
}
