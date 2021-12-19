package com.p2082ss.android.ugc.aweme.simkit.config;

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
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84267d;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.config.c */
public final class C74614c implements IVideoPreloadConfig {

    /* renamed from: a */
    private final IVideoPreloadConfig f167753a;

    static {
        Covode.recordClassIndex(87435);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return this.f167753a.canPreload();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80828a getAppLog() {
        return this.f167753a.getAppLog();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80843b getCacheHelper() {
        return this.f167753a.getCacheHelper();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return this.f167753a.getExperiment();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80844c getMLServiceSpeedModel() {
        return this.f167753a.getMLServiceSpeedModel();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80845d getMusicService() {
        return this.f167753a.getMusicService();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC63037g getNetClient() {
        return this.f167753a.getNetClient();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80848g getPlayerCommonParamManager() {
        return this.f167753a.getPlayerCommonParamManager();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80847f getPlayerEventReportService() {
        return this.f167753a.getPlayerEventReportService();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC63056b getProperResolution(String str, AbstractC63057c cVar) {
        return this.f167753a.getProperResolution(str, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80846e getSpeedManager() {
        return this.f167753a.getSpeedManager();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80850i getStorageManager() {
        return this.f167753a.getStorageManager();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80852j getVideoCachePlugin() {
        return this.f167753a.getVideoCachePlugin();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return this.f167753a.isDashABREnabled();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        return this.f167753a.isPreloadV3Enabled();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int playerPreferchTtsAudioSize() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        return this.f167753a.useSyncPreloadStyle();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC84272h createVideoUrlProcessor() {
        AbstractC84272h createVideoUrlProcessor = this.f167753a.createVideoUrlProcessor();
        if (createVideoUrlProcessor != null) {
            return createVideoUrlProcessor;
        }
        return C74609a.m131031a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC63032b getBitrateSelectListener() {
        AbstractC63032b bitrateSelectListener = this.f167753a.getBitrateSelectListener();
        C89219l.m154709a((Object) bitrateSelectListener, "");
        return bitrateSelectListener;
    }

    public C74614c(IVideoPreloadConfig iVideoPreloadConfig) {
        C89219l.m154719c(iVideoPreloadConfig, "");
        this.f167753a = iVideoPreloadConfig;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C84223u getSelectedBitrateForColdBoot(C84241i iVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(iVar, "");
        return C84267d.m144907a(iVar, (ArrayList<AbstractC84278n>) null);
    }
}
