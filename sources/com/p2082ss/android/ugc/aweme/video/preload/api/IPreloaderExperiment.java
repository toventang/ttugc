package com.p2082ss.android.ugc.aweme.video.preload.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.model.C80927c;
import com.p2082ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.p2082ss.android.ugc.playerkit.model.C84202f;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment */
public interface IPreloaderExperiment {
    static {
        Covode.recordClassIndex(94125);
    }

    Boolean CheckVideoCacheRequestHeaderExperiment();

    int DisableVideocacheLocalServerExperiment();

    boolean EnableDetailNotification();

    int EnableDownloaderLogExpErrorExperiment();

    boolean EnableGetCDNLogExperiment();

    int EnableP2pStragetyControlExperiment();

    Boolean EnablePreloaderPreConnect();

    boolean EnableTTnetClientInject();

    int EngineEnableMaxFileMemCacheNumExp();

    int EngineEnableMaxFileMemCacheSizeExp();

    int EnginePreloaderConcurrentNumExperiment();

    EnginePreloaderConfig EnginePreloaderConfigExperiment();

    int EnginePreloaderEnableNetworkChangedListenExperiment();

    int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment();

    int EnginePreloaderNetSchedulerBlockDurationExperiment();

    int EnginePreloaderNetSchedulerBlockErrorCountExperiment();

    int EnginePreloaderNetSchedulerEnableExperiment();

    int EnginePreloaderOpenTimeoutExperiment();

    int EnginePreloaderPreloadStrategyExperiment();

    int EnginePreloaderRWTimeoutExperiment();

    int EnginePreloaderStackOrQueueExperiment();

    int EnginePreloaderTlsSessionTimeoutExperiment();

    int P2pStragetyEnableSyndnsExperiment();

    int P2pStragetyExpiredTimeExperiment();

    int P2pStragetyMaxBufferingTimeExperiment();

    int P2pStragetyMaxLeaveWaitTimeExperiment();

    int P2pStragetyMinNetSpeedExperiment();

    int P2pStragetyMinPlayNumberExperiment();

    int P2pStragetyXyLibValueExperiment();

    int PlayUse2UrlExperiment();

    int PlayeAbUserHttp2Exp();

    int PlayerAbABRAlgoExp();

    int PlayerAbABRSpeedPredictAlgoExp();

    int PlayerAbABRSpeedPredictTimeIntervalExp();

    int PlayerAbBackupDnsTypeExp();

    int PlayerAbChecksumLevelExp();

    int PlayerAbDashPreloadAudioFirstExp();

    int PlayerAbEnableDebugLogExp();

    int PlayerAbMainDnsDelayTimeExp();

    int PlayerAbMainDnsTypeExp();

    int PlayerAbMediaLoaderCheckPreloadLevelExp();

    int PlayerAbMedialoaderAccessCheckLevelExp();

    int PlayerAbMedialoaderEnableBackupDnsIPExp();

    int PlayerAbMedialoaderEnableBenchmarkExp();

    int PlayerAbMedialoaderEnableDnsLogExp();

    int PlayerAbMedialoaderEnableDnsParallelExp();

    int PlayerAbMedialoaderEnableDnsRefreshExp();

    int PlayerAbMedialoaderEnableFileExtendBuffer();

    int PlayerAbMedialoaderEnableFileRingBuffer();

    int PlayerAbMedialoaderEnablePreconneExp();

    int PlayerAbMedialoaderEnableSpeedCoefficientExp();

    int PlayerAbMedialoaderEnableTLSSessionReuseExp();

    int PlayerAbMedialoaderEnableTaskReuseExp();

    String PlayerAbMedialoaderGoogleDnsHostExp();

    int PlayerAbMedialoaderHeaderDataMemCache();

    int PlayerAbMedialoaderIpv4Num();

    int PlayerAbMedialoaderIpv6Num();

    int PlayerAbMedialoaderLazyBufferPoolEnableExp();

    String PlayerAbMedialoaderOwnDnsHostExp();

    int PlayerAbMedialoaderPreconnectNumExp();

    int PlayerAbMedialoaderTLSVersionExp();

    int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp();

    int PlayerAbPreloadSizeOffsetThresholdExp();

    int PlayerAbTestSpeedVersionExp();

    Boolean PlayerAbUseLastIf403Exp();

    int PlayerDataEncryptExperiment();

    int PlayerMdlLogEnableExperiment();

    Boolean PlayerPreloadLazyGetUrlsExperiment();

    Boolean PreloadLocalCachePathVideoPlayExperiment();

    AbstractC80918i.EnumC80919a PreloadTypeExperiment();

    int RingBufferSizeMdlExperiment();

    int UseTTNetExperiment();

    Boolean UseVideoCacheHttpDnsExperiment();

    Boolean VideoCacheAutoAdjustPreloadMaxExperiment();

    int VideoCacheLoaderTypeExperiment();

    int VideoCacheMaxCacheSizeExperiment();

    int VideoCacheP2pLevelExperiment();

    int VideoCacheReadBuffersizeExperiment();

    int VideoCacheTTnetPreloadTimeoutExperiment();

    int VideoCacheTTnetProxyTimeoutExperiment();

    Boolean VideoCacheWriteAsynchronousExperiment();

    int VideoDownloadSpeedCostTimeExperiment();

    int VideoNetworkSpeedAlgorithmExperiment();

    int VideoSpeedQueueSizeExperiment();

    int enginePreloaderEnableTTnetLoader();

    List<C84202f> engineStaticOptionList();

    String getBandWidthJsonString();

    double getBitrateSwitchThreshold();

    String getDataLoaderMdlExtensionOpts();

    Map<String, Long> getExCacheDirSizeConfig();

    String getGearStrategyJsonString();

    String getModuleConfigJsonString();

    C80927c getPreloaderExpModel();
}
