package com.p2082ss.android.ugc.aweme.editSticker.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.b */
public final class C45937b {

    /* renamed from: a */
    public AbstractC89172b<? super StickerItemModel, Boolean> f107001a;

    static {
        Covode.recordClassIndex(54470);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C45937b) && C89219l.m154714a(this.f107001a, ((C45937b) obj).f107001a);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC89172b<? super StickerItemModel, Boolean> bVar = this.f107001a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StickerItemModelConfigure(infoStickerTypeExtraPredicate=" + this.f107001a + ")";
    }

    public /* synthetic */ C45937b() {
        this(C459381.f107002a);
    }

    private C45937b(AbstractC89172b<? super StickerItemModel, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        this.f107001a = bVar;
    }
}
