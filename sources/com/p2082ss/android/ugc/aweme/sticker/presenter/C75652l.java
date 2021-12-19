package com.p2082ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.l */
public final class C75652l {

    /* renamed from: a */
    public final C75651k f170065a;

    /* renamed from: b */
    public final C75651k f170066b;

    static {
        Covode.recordClassIndex(88583);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75652l)) {
            return false;
        }
        C75652l lVar = (C75652l) obj;
        return C89219l.m154714a(this.f170065a, lVar.f170065a) && C89219l.m154714a(this.f170066b, lVar.f170066b);
    }

    public final int hashCode() {
        C75651k kVar = this.f170065a;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C75651k kVar2 = this.f170066b;
        if (kVar2 != null) {
            i = kVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MultiStickerChangeEvent(from=" + this.f170065a + ", to=" + this.f170066b + ")";
    }

    private /* synthetic */ C75652l() {
        this(new C75651k(), new C75651k());
    }

    public C75652l(C75651k kVar, C75651k kVar2) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        this.f170065a = kVar;
        this.f170066b = kVar2;
    }
}
