package com.p2082ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 */
public final class VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 implements IEffectService.OnVideoCoverCallback {
    final /* synthetic */ IEffectService.OnVideoCoverCallback $callback;
    final /* synthetic */ C43223c $draft;
    final /* synthetic */ VideoCoverServiceImpl this$0;

    static {
        Covode.recordClassIndex(80031);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.$callback;
        if (onVideoCoverCallback != null) {
            onVideoCoverCallback.onGetVideoCoverFailed(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        Bitmap mergeCoverTextImage = this.this$0.mergeCoverTextImage(bitmap, this.$draft.f100900W.f100785aR);
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.$callback;
        if (onVideoCoverCallback != null) {
            onVideoCoverCallback.onGetVideoCoverSuccess(mergeCoverTextImage);
        }
    }

    VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1(VideoCoverServiceImpl videoCoverServiceImpl, C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.this$0 = videoCoverServiceImpl;
        this.$draft = cVar;
        this.$callback = onVideoCoverCallback;
    }
}
