package com.p2082ss.android.ugc.aweme.video.config;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.video.config.IPlayerExperiment */
public interface IPlayerExperiment {
    static {
        Covode.recordClassIndex(93998);
    }

    int ABR4GMaxResolutionIndex();

    int ABRFixedLevel();

    boolean Bytevc1PlayAddrPolicyUnifyExperiment();

    int PlayeAbDashHijackRetryEnableExp();

    int PlayeAbEnableCustomizeThreadPoolExp();

    int PlayeAbFixPrepareSeqTmpEnableExp();

    int PlayeAbVIDDashHijackRetryEnableExp();

    float PlayerAbABRBandwidthParamExp();

    float PlayerAbABRStallPenaltyParamExp();

    int PlayerAbABRStartUpModelExp();

    int PlayerAbABRSwitchCsModelExp();

    float PlayerAbABRSwitchPenaltyParamExp();

    int PlayerAbABRSwitchSensitivityExp();

    int PlayerAbABRTimerIntervalMillExp();

    int PlayerAbSuperResolutionVideoDurationExp();

    boolean PreloadProcessDataExperiment();

    int cacheDuration(int i);

    long cdnUrlExpiredOffset();

    boolean enableBufferTimeControl();

    boolean enableCdnUrlExpiredExperiment();

    int enableIntertrust();

    int enableIntertrustDemotion();

    int enableSplitVideoAudioPlayback();

    int frameWait();

    int get265DecodeType();

    float getVolLoudUnity();

    boolean isAsyncInit();

    boolean isDashABREnabled();

    boolean isDirectUrlCheckInfoEnable();

    int memCacheVideoDurationThreshold();

    boolean playEventLogEnabled();

    int resumeFileIoBlockDurationThreshold();

    boolean videoBitRateEnabled();
}
