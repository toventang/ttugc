package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.utils.m */
final /* synthetic */ class C3735m implements AbstractC88433f {

    /* renamed from: a */
    private final StickerImageUploader f10335a;

    /* renamed from: b */
    private final StickerImageUploader.C3713c f10336b;

    static {
        Covode.recordClassIndex(4250);
    }

    C3735m(StickerImageUploader stickerImageUploader, StickerImageUploader.C3713c cVar) {
        this.f10335a = stickerImageUploader;
        this.f10336b = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10335a;
        C3854a.m9453a(6, "StickerImageUploader", "upload sticker success pic->" + this.f10336b.f10288b);
        stickerImageUploader.f10282c = false;
        stickerImageUploader.mo9024a();
    }
}
