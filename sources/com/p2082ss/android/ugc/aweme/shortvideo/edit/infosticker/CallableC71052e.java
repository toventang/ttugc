package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p4600h.C89391z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.e */
public final /* synthetic */ class CallableC71052e implements Callable {

    /* renamed from: a */
    private final C71050c f159088a;

    /* renamed from: b */
    private final StickerItemModel f159089b;

    static {
        Covode.recordClassIndex(83550);
    }

    CallableC71052e(C71050c cVar, StickerItemModel stickerItemModel) {
        this.f159088a = cVar;
        this.f159089b = stickerItemModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C71050c cVar = this.f159088a;
        StickerItemModel stickerItemModel = this.f159089b;
        ByteBuffer a = C71046al.m125455a(stickerItemModel.pinAlgorithmFile);
        if (a != null) {
            cVar.f159077e.mo56268a(stickerItemModel.getId(), a);
        }
        return C89391z.f203057a;
    }
}
