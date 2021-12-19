package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
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

/* renamed from: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig */
public interface IVideoPreloadConfig {
    static {
        Covode.recordClassIndex(94072);
    }

    boolean canPreload();

    AbstractC84272h createVideoUrlProcessor();

    AbstractC80828a getAppLog();

    AbstractC63032b getBitrateSelectListener();

    AbstractC80843b getCacheHelper();

    IPreloaderExperiment getExperiment();

    AbstractC80844c getMLServiceSpeedModel();

    AbstractC80845d getMusicService();

    AbstractC63037g getNetClient();

    AbstractC80848g getPlayerCommonParamManager();

    AbstractC80847f getPlayerEventReportService();

    EnumC63056b getProperResolution(String str, AbstractC63057c cVar);

    C84223u getSelectedBitrateForColdBoot(C84241i iVar);

    AbstractC80846e getSpeedManager();

    AbstractC80850i getStorageManager();

    AbstractC80852j getVideoCachePlugin();

    boolean isDashABREnabled();

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPreloadV3Enabled();

    int playerPreferchTtsAudioSize();

    boolean useSyncPreloadStyle();
}
