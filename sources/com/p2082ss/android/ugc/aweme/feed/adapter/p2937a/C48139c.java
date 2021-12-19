package com.p2082ss.android.ugc.aweme.feed.adapter.p2937a;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.a.c */
public final class C48139c extends AbstractC48136a {

    /* renamed from: b */
    public final AbstractC84295k f111529b;

    /* renamed from: c */
    private VideoViewComponent f111530c;

    /* renamed from: d */
    private final AbstractC84293i f111531d;

    /* renamed from: e */
    private final Context f111532e;

    static {
        Covode.recordClassIndex(56881);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: A */
    public final void mo80149A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: b */
    public final void mo80209b(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80215e(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: s */
    public final int mo80228s() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: z */
    public final void mo80235z() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: c */
    public final AbstractC84293i mo80273c() {
        return this.f111531d;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag, com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: N */
    public final AbstractC80726a mo80100N() {
        return super.mo80100N();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: w */
    public final boolean mo80232w() {
        return this.f111531d.mo129315c();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: x */
    public final Surface mo80233x() {
        return this.f111531d.mo129313b();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: y */
    public final View mo80234y() {
        return this.f111531d.mo129311a();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: b */
    public final boolean mo80272b() {
        if (this.f111531d.mo129317e() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: j */
    public final AbstractC63042j.C63049g mo80281j() {
        VideoViewComponent videoViewComponent = this.f111530c;
        if (videoViewComponent != null) {
            return videoViewComponent.mo80281j();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        super.onPlayPause(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        super.onPlayPrepare(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        super.onPlayRelease(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        super.onPlayStop(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        super.onPlaying(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        super.onRenderReady(nVar);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: a */
    public final void mo80280a(OnUIPlayListener onUIPlayListener) {
        VideoViewComponent videoViewComponent = this.f111530c;
        if (videoViewComponent != null) {
            videoViewComponent.mo80280a(onUIPlayListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80270a(AbstractC84295k kVar) {
        this.f111531d.mo129312a(kVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80217e(boolean z) {
        if (z) {
            this.f111531d.mo129319g();
        } else {
            this.f111531d.mo129320h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        super.onBufferedTimeMs(str, j);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        super.onBuffering(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        super.onSeekEnd(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        super.onPlayCompleted(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
        super.onPlayFailed(str, lVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        super.onPlayStop(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
        super.onRenderFirstFrame(str, oVar);
    }

    public C48139c(ViewGroup viewGroup, AbstractC84295k kVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(kVar, "");
        this.f111529b = kVar;
        Context context = viewGroup.getContext();
        this.f111532e = context;
        C84294j a = C84294j.m144980a(viewGroup);
        C89219l.m154716b(a, "");
        this.f111531d = a;
        if (C80771f.f180597a && (a.mo129311a() instanceof SurfaceView)) {
            C13605d dVar = AbstractC48234cd.C48235a.f111738a.get(context);
            if (dVar == null) {
                dVar = new C13605d();
                AbstractC48234cd.C48235a.f111738a.put(context, dVar);
            }
            View a2 = a.mo129311a();
            C89219l.m154716b(a2, "");
            a2.setVisibility(8);
            a.mo129312a(kVar);
            View a3 = a.mo129311a();
            Objects.requireNonNull(a3, "null cannot be cast to non-null type android.view.SurfaceView");
            dVar.mo21864a(a3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        super.onBufferedPercent(str, j, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        super.onSeekStart(str, i, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
        super.onVideoBitrateChanged(str, bVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        super.onPlayProgressChange(str, j, j2);
    }
}
