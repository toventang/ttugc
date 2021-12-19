package com.p2082ss.android.ugc.aweme.player.sdk.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener */
public interface OnUIPlayListener {
    static {
        Covode.recordClassIndex(73869);
    }

    OnUIPlayListener getWrapperedListener();

    void onBufferedPercent(String str, long j, int i);

    void onBufferedTimeMs(String str, long j);

    void onBuffering(String str, boolean z);

    void onBuffering(boolean z);

    void onCompleteLoaded(String str, boolean z);

    void onDecoderBuffering(String str, boolean z);

    void onDecoderBuffering(boolean z);

    void onPausePlay(String str);

    void onPlayCompleted(String str);

    void onPlayCompleted(String str, int i);

    void onPlayCompletedFirstTime(String str);

    void onPlayFailed(C84208l lVar);

    void onPlayFailed(String str, C84208l lVar);

    void onPlayPause(String str);

    void onPlayPrepare(String str);

    void onPlayProgressChange(float f);

    void onPlayProgressChange(String str, long j, long j2);

    void onPlayRelease(String str);

    void onPlayStop(String str);

    void onPlayStop(String str, JSONObject jSONObject);

    void onPlayStop(String str, boolean z);

    void onPlayerInternalEvent(String str, int i, JSONObject jSONObject);

    void onPlaying(String str);

    void onPreParePlay(String str, C84215n nVar);

    void onPreRenderSessionMissed(String str);

    void onPreparePlay(String str);

    void onRenderFirstFrame(C84216o oVar);

    void onRenderFirstFrame(String str, C84216o oVar);

    void onRenderFirstFrameFromResume(String str);

    void onRenderReady(C84215n nVar);

    void onResumePlay(String str);

    void onRetryOnError(C84208l lVar);

    void onRetryOnError(String str, C84208l lVar);

    void onSeekEnd(String str, boolean z);

    void onSeekStart(String str, int i, float f);

    void onVideoBitrateChanged(String str, EnumC63056b bVar, int i);

    void onVideoSizeChanged(String str, int i, int i2);
}
