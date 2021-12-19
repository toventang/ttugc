package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.j */
public final class C81012j implements OnUIPlayListener {

    /* renamed from: a */
    public OnUIPlayListener f181086a;

    /* renamed from: b */
    public HashMap<String, Object> f181087b;

    /* renamed from: c */
    private C80997c f181088c;

    /* renamed from: d */
    private AbstractC81002f.AbstractC81006d f181089d;

    static {
        Covode.recordClassIndex(94330);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return this.f181086a;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPause(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepare(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayRelease(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlaying(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderReady(nVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z);
        }
    }

    public C81012j(AbstractC81002f.AbstractC81006d dVar, C80997c cVar) {
        this.f181089d = dVar;
        this.f181088c = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedTimeMs(str, j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(str, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCompleteLoaded(str, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(str, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrame(str, oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(str, lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedPercent(str, j, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoBitrateChanged(str, bVar, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSizeChanged(str, i, i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        OnUIPlayListener onUIPlayListener = this.f181086a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
    }
}
