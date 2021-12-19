package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.utils.l */
public final /* synthetic */ class C3734l implements AbstractC88433f {

    /* renamed from: a */
    private final StickerImageUploader f10333a;

    /* renamed from: b */
    private final StickerImageUploader.C3713c f10334b;

    static {
        Covode.recordClassIndex(4249);
    }

    C3734l(StickerImageUploader stickerImageUploader, StickerImageUploader.C3713c cVar) {
        this.f10333a = stickerImageUploader;
        this.f10334b = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10333a;
        C3854a.m9453a(6, "StickerImageUploader", "compress file  throw error->" + this.f10334b.f10288b);
        stickerImageUploader.f10282c = false;
        stickerImageUploader.mo9024a();
    }
}
