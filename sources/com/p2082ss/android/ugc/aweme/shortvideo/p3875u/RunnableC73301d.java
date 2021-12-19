package com.p2082ss.android.ugc.aweme.shortvideo.p3875u;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.u.d */
final /* synthetic */ class RunnableC73301d implements Runnable {

    /* renamed from: a */
    private final IEffectService.OnVideoCoverCallback f164615a;

    /* renamed from: b */
    private final Bitmap f164616b;

    static {
        Covode.recordClassIndex(86020);
    }

    RunnableC73301d(IEffectService.OnVideoCoverCallback onVideoCoverCallback, Bitmap bitmap) {
        this.f164615a = onVideoCoverCallback;
        this.f164616b = bitmap;
    }

    public final void run() {
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.f164615a;
        Bitmap bitmap = this.f164616b;
        if (onVideoCoverCallback == null) {
            return;
        }
        if (bitmap != null) {
            onVideoCoverCallback.onGetVideoCoverSuccess(bitmap);
        } else {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        }
    }
}
