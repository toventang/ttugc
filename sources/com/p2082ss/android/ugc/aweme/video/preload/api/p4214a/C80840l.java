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

/* renamed from: com.ss.android.ugc.aweme.video.preload.api.a.l */
public final class C80840l implements IVideoPreloadConfig {

    /* renamed from: a */
    public static final C80840l f180785a = new C80840l();

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80846e getSpeedManager() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return false;
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
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int playerPreferchTtsAudioSize() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        return false;
    }

    private C80840l() {
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC84272h createVideoUrlProcessor() {
        return C80841m.f180786a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80828a getAppLog() {
        return C80829a.f180775a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC63032b getBitrateSelectListener() {
        return C80830b.f180776a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80843b getCacheHelper() {
        return C80831c.f180777a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80844c getMLServiceSpeedModel() {
        return C80832d.f180778a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80845d getMusicService() {
        return C80833e.f180779a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC63037g getNetClient() {
        return C80834f.f180780a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80848g getPlayerCommonParamManager() {
        return C80836h.f180782a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80847f getPlayerEventReportService() {
        return C80835g.f180781a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80850i getStorageManager() {
        return C80838j.f180783a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final AbstractC80852j getVideoCachePlugin() {
        return C80839k.f180784a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return new C80837i();
    }

    static {
        Covode.recordClassIndex(94138);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C84223u getSelectedBitrateForColdBoot(C84241i iVar) {
        C89219l.m154719c(iVar, "");
        return new C84223u();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC63056b getProperResolution(String str, AbstractC63057c cVar) {
        return EnumC63056b.Undefine;
    }
}
