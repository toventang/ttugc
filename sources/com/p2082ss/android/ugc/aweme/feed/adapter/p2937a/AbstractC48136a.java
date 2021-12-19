package com.p2082ss.android.ugc.aweme.feed.adapter.p2937a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34835bi;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a;
import com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.a.a */
public abstract class AbstractC48136a implements AbstractC34835bi, AbstractC48147ag, OnUIPlayListener, AbstractC84292h {

    /* renamed from: a */
    public DataCenter f111526a;

    static {
        Covode.recordClassIndex(56878);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: N */
    public AbstractC80726a mo80100N() {
        return null;
    }

    /* renamed from: a */
    public AbstractC48149ai mo80265a(String str) {
        return null;
    }

    /* renamed from: a */
    public void mo80266a() {
    }

    /* renamed from: a */
    public void mo80267a(int i) {
    }

    /* renamed from: a */
    public void mo80268a(Aweme aweme, int i) {
        C89219l.m154721d(aweme, "");
    }

    /* renamed from: a */
    public void mo80269a(EnumC76739a aVar) {
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public abstract void mo80270a(AbstractC84295k kVar);

    /* renamed from: b */
    public void mo80271b(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: b */
    public boolean mo80272b() {
        return false;
    }

    /* renamed from: c */
    public abstract AbstractC84293i mo80273c();

    /* renamed from: d */
    public AbstractC48149ai mo80274d() {
        return null;
    }

    /* renamed from: e */
    public void mo80275e() {
    }

    /* renamed from: f */
    public void mo80276f() {
    }

    /* renamed from: g */
    public void mo80277g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    /* renamed from: h */
    public AbstractC77713a mo80278h() {
        return null;
    }

    /* renamed from: i */
    public void mo80279i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i, int i2) {
    }
}
