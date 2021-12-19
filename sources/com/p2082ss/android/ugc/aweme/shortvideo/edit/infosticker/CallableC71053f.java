package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p4600h.C89391z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.f */
public final /* synthetic */ class CallableC71053f implements Callable {

    /* renamed from: a */
    private final C71050c f159090a;

    /* renamed from: b */
    private final StickerItemModel f159091b;

    static {
        Covode.recordClassIndex(83551);
    }

    CallableC71053f(C71050c cVar, StickerItemModel stickerItemModel) {
        this.f159090a = cVar;
        this.f159091b = stickerItemModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C71050c cVar = this.f159090a;
        StickerItemModel stickerItemModel = this.f159091b;
        ByteBuffer a = C71046al.m125455a(stickerItemModel.pinAlgorithmFile);
        if (a != null) {
            cVar.f159077e.mo56268a(stickerItemModel.getId(), a);
        }
        return C89391z.f203057a;
    }
}
