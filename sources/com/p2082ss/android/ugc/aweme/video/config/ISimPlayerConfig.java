package com.p2082ss.android.ugc.aweme.video.config;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63071d;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84270f;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84271g;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig */
public interface ISimPlayerConfig {

    /* renamed from: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a */
    public interface AbstractC80715a {
        static {
            Covode.recordClassIndex(94001);
        }
    }

    static {
        Covode.recordClassIndex(93999);
    }

    AbstractC84270f createAudioUrlProcessor();

    AbstractC84271g createSubUrlProcessor();

    AbstractC84272h createVideoUrlProcessor();

    boolean disableSleepResume(String str);

    void downloadFile(String str, String str2, String str3, String str4);

    boolean enableByteVc1FailCheckCountPolicy();

    boolean enableFileIoOpt(String str);

    boolean enableForceUseH264CheckPolicy();

    boolean enableForceUseH264Global();

    int getAverageSpeedInKBps();

    AbstractC63032b getBitrateSelectListener();

    AbstractC63034d getBitrateSelector();

    C84223u getDashProcessUrlData(String str, boolean z, long j);

    C63071d getISimPlayerPlaySessionConfig(boolean z);

    C84209m getPlayerConfig(C84209m.EnumC84214e eVar, boolean z, boolean z2);

    int getPlayerType();

    EnumC63056b getProperResolution(String str, AbstractC63057c cVar);

    String getThumbCacheDir(Context context);

    C84241i getVideoPlayAddr(C84240h hVar, C84209m.EnumC84214e eVar);

    boolean isCache(C84241i iVar);

    boolean isHttpsVideoUrlModel(C84241i iVar);

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPluginApplied();

    void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2);

    void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2);

    void recordMiscLog(Context context, String str, JSONObject jSONObject);
}
