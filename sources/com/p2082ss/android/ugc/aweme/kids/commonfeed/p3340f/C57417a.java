package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3340f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3339e.C57407a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.f.a */
public final class C57417a implements OnUIPlayListener {

    /* renamed from: a */
    public final AbstractC80747i f130891a = new C81079v(false);

    /* renamed from: b */
    private final C57407a f130892b;

    static {
        Covode.recordClassIndex(67339);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: a */
    public final boolean mo94682a() {
        return this.f130891a.mo123892o();
    }

    /* renamed from: c */
    public final void mo94684c() {
        this.f130891a.mo123950y();
    }

    /* renamed from: d */
    public final void mo94685d() {
        this.f130891a.mo123908B();
    }

    /* renamed from: e */
    private final OnUIPlayListener m104041e() {
        AbstractC57448a d = this.f130892b.mo94672d();
        if (!(d instanceof OnUIPlayListener)) {
            d = null;
        }
        return (OnUIPlayListener) d;
    }

    /* renamed from: b */
    public final void mo94683b() {
        Video video;
        AbstractC57448a d = this.f130892b.mo94672d();
        if (d != null) {
            Aweme b = d.mo94720b();
            this.f130891a.mo123937a(this);
            this.f130891a.mo123934a(d.mo94725g());
            AbstractC80747i iVar = this.f130891a;
            if (b != null) {
                video = b.getVideo();
            } else {
                video = null;
            }
            iVar.mo123928a(video, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onDecoderBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onPausePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onPlayCompleted(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onPlayFailed(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onPlayProgressChange(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onPreparePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onResumePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        OnUIPlayListener e = m104041e();
        if (e != null) {
            e.onRetryOnError(lVar);
        }
    }

    public C57417a(C57407a aVar) {
        C89219l.m154721d(aVar, "");
        this.f130892b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRenderReady(com.p2082ss.android.ugc.playerkit.model.C84215n r7) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3340f.C57417a.onRenderReady(com.ss.android.ugc.playerkit.model.n):void");
    }
}
