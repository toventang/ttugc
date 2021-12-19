package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.utils.n */
final /* synthetic */ class C3736n implements AbstractC88433f {

    /* renamed from: a */
    private final StickerImageUploader f10337a;

    /* renamed from: b */
    private final StickerImageUploader.C3713c f10338b;

    static {
        Covode.recordClassIndex(4251);
    }

    C3736n(StickerImageUploader stickerImageUploader, StickerImageUploader.C3713c cVar) {
        this.f10337a = stickerImageUploader;
        this.f10338b = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10337a;
        C3854a.m9453a(6, "StickerImageUploader", "upload sticker fail pic->" + this.f10338b.f10288b);
        stickerImageUploader.f10282c = false;
        stickerImageUploader.mo9024a();
    }
}
