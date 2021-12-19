package com.p2082ss.android.ugc.aweme.editSticker.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.c */
public final class C45939c {

    /* renamed from: a */
    public static final C45937b f107003a = new C45937b();

    /* renamed from: b */
    private static final int[] f107004b = {7, 8, 9, 18, 19};

    static {
        Covode.recordClassIndex(54472);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m88695a(StickerItemModel stickerItemModel) {
        AbstractC89172b<? super StickerItemModel, Boolean> bVar = f107003a.f107001a;
        C89219l.m154721d(stickerItemModel, "");
        C89219l.m154721d(bVar, "");
        if (!(!bVar.invoke(stickerItemModel).booleanValue() || stickerItemModel.type == 2 || stickerItemModel.type == 13)) {
            C89219l.m154721d(stickerItemModel, "");
            if (!C89064i.m154487a(f107004b, stickerItemModel.type)) {
                C89219l.m154721d(stickerItemModel, "");
                if (stickerItemModel.type == 4 || stickerItemModel.type == 22 || stickerItemModel.type == 21) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
