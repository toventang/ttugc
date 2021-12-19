package com.p2082ss.android.ugc.aweme.video.preload.api.p4214a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80828a;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80843b;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80844c;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80845d;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80846e;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80847f;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80848g;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80852j;
import com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.api.a.n */
public final class C80842n implements IVideoPreloadConfig {

    /* renamed from: a */
    public final IVideoPreloadConfig f180787a;

    static {
        Covode.recordClassIndex(94140);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.canPreload();
        }
        return C80840l.f180785a.canPreload();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isDashABREnabled();
        }
        return C80840l.f180785a.isDashABREnabled();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPlayerPreferchCaption();
        }
        return C80840l.f180785a.isPlayerPreferchCaption();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPlayerPreferchTtsAudio();
        }
        return C80840l.f180785a.isPlayerPreferchTtsAudio();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPreloadV3Enabled();
        }
        return C80840l.f180785a.isPreloadV3Enabled();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int playerPreferchTtsAudioSize() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.playerPreferchTtsAudioSize();
        }
        return C80840l.f180785a.playerPreferchTtsAudioSize();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.useSyncPreloadStyle();
        }
        return C80840l.f180785a.useSyncPreloadStyle();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC84272h createVideoUrlProcessor() {
        AbstractC84272h createVideoUrlProcessor;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (createVideoUrlProcessor = iVideoPreloadConfig.createVideoUrlProcessor()) == null) {
            return C80840l.f180785a.createVideoUrlProcessor();
        }
        return createVideoUrlProcessor;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80828a getAppLog() {
        AbstractC80828a appLog;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (appLog = iVideoPreloadConfig.getAppLog()) == null) {
            return C80840l.f180785a.getAppLog();
        }
        return appLog;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC63032b getBitrateSelectListener() {
        AbstractC63032b bitrateSelectListener;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (bitrateSelectListener = iVideoPreloadConfig.getBitrateSelectListener()) == null) {
            return C80840l.f180785a.getBitrateSelectListener();
        }
        return bitrateSelectListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80843b getCacheHelper() {
        AbstractC80843b cacheHelper;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (cacheHelper = iVideoPreloadConfig.getCacheHelper()) == null) {
            return C80840l.f180785a.getCacheHelper();
        }
        return cacheHelper;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        IPreloaderExperiment experiment;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (experiment = iVideoPreloadConfig.getExperiment()) == null) {
            return C80840l.f180785a.getExperiment();
        }
        return experiment;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80844c getMLServiceSpeedModel() {
        AbstractC80844c mLServiceSpeedModel;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (mLServiceSpeedModel = iVideoPreloadConfig.getMLServiceSpeedModel()) == null) {
            return C80840l.f180785a.getMLServiceSpeedModel();
        }
        return mLServiceSpeedModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80845d getMusicService() {
        AbstractC80845d musicService;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (musicService = iVideoPreloadConfig.getMusicService()) == null) {
            return C80840l.f180785a.getMusicService();
        }
        return musicService;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC63037g getNetClient() {
        AbstractC63037g netClient;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (netClient = iVideoPreloadConfig.getNetClient()) == null) {
            return C80840l.f180785a.getNetClient();
        }
        return netClient;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80848g getPlayerCommonParamManager() {
        AbstractC80848g playerCommonParamManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (playerCommonParamManager = iVideoPreloadConfig.getPlayerCommonParamManager()) == null) {
            return C80840l.f180785a.getPlayerCommonParamManager();
        }
        return playerCommonParamManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80847f getPlayerEventReportService() {
        AbstractC80847f playerEventReportService;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (playerEventReportService = iVideoPreloadConfig.getPlayerEventReportService()) == null) {
            return C80840l.f180785a.getPlayerEventReportService();
        }
        return playerEventReportService;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80846e getSpeedManager() {
        AbstractC80846e speedManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (speedManager = iVideoPreloadConfig.getSpeedManager()) == null) {
            return C80840l.f180785a.getSpeedManager();
        }
        return speedManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80850i getStorageManager() {
        AbstractC80850i storageManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (storageManager = iVideoPreloadConfig.getStorageManager()) == null) {
            return C80840l.f180785a.getStorageManager();
        }
        return storageManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80852j getVideoCachePlugin() {
        AbstractC80852j videoCachePlugin;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (videoCachePlugin = iVideoPreloadConfig.getVideoCachePlugin()) == null) {
            return C80840l.f180785a.getVideoCachePlugin();
        }
        return videoCachePlugin;
    }

    public C80842n(IVideoPreloadConfig iVideoPreloadConfig) {
        this.f180787a = iVideoPreloadConfig;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C84223u getSelectedBitrateForColdBoot(C84241i iVar) {
        C84223u selectedBitrateForColdBoot;
        C89219l.m154719c(iVar, "");
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (selectedBitrateForColdBoot = iVideoPreloadConfig.getSelectedBitrateForColdBoot(iVar)) == null) {
            return C80840l.f180785a.getSelectedBitrateForColdBoot(iVar);
        }
        return selectedBitrateForColdBoot;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC63056b getProperResolution(String str, AbstractC63057c cVar) {
        EnumC63056b properResolution;
        IVideoPreloadConfig iVideoPreloadConfig = this.f180787a;
        if (iVideoPreloadConfig == null || (properResolution = iVideoPreloadConfig.getProperResolution(str, cVar)) == null) {
            return C80840l.f180785a.getProperResolution(str, cVar);
        }
        return properResolution;
    }
}
