package com.p2082ss.android.ugc.aweme.services.mvtemplate;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImpl$create$1 */
public final class AVVideoViewComponentFactoryImpl$create$1 implements AbstractC78933e {
    final /* synthetic */ VideoViewComponent $videoViewComponent;
    private OnUIPlayListener aVOnUIPlayListener;

    static {
        Covode.recordClassIndex(79905);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final boolean isPlaying() {
        return this.$videoViewComponent.mo129273g();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void pause() {
        this.$videoViewComponent.mo129267b();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void stop() {
        this.$videoViewComponent.mo129269c();
    }

    AVVideoViewComponentFactoryImpl$create$1(VideoViewComponent videoViewComponent) {
        this.$videoViewComponent = videoViewComponent;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void tryResume(Video video) {
        C89219l.m154721d(video, "");
        this.$videoViewComponent.mo129262a(video);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void wrap(TextureView textureView) {
        C89219l.m154721d(textureView, "");
        this.$videoViewComponent.mo129265a((KeepSurfaceTextureView) textureView);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void addPlayerListener(AbstractC78931c cVar) {
        C89219l.m154721d(cVar, "");
        VideoViewComponent videoViewComponent = this.$videoViewComponent;
        OnUIPlayListener onUIPlayListener = AVVideoViewComponentFactoryImplKt.toOnUIPlayListener(cVar);
        this.aVOnUIPlayListener = onUIPlayListener;
        videoViewComponent.mo129268b(onUIPlayListener);
    }
}
