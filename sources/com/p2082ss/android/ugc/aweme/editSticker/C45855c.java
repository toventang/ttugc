package com.p2082ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45901f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45893a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45919d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45918c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.c */
public final class C45855c {

    /* renamed from: a */
    public final int f106818a;

    /* renamed from: b */
    public final int f106819b;

    /* renamed from: c */
    public final AbstractC45901f f106820c;

    /* renamed from: d */
    public final AbstractC45913a f106821d;

    /* renamed from: e */
    public final AbstractC45919d f106822e;

    /* renamed from: f */
    public final AbstractC89171a<C89391z> f106823f;

    static {
        Covode.recordClassIndex(54378);
    }

    public C45855c() {
        this(0, 0, (AbstractC45901f) null, (AbstractC45913a) null, (AbstractC45919d) null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45855c)) {
            return false;
        }
        C45855c cVar = (C45855c) obj;
        return this.f106818a == cVar.f106818a && this.f106819b == cVar.f106819b && C89219l.m154714a(this.f106820c, cVar.f106820c) && C89219l.m154714a(this.f106821d, cVar.f106821d) && C89219l.m154714a(this.f106822e, cVar.f106822e) && C89219l.m154714a(this.f106823f, cVar.f106823f);
    }

    public final int hashCode() {
        int i = ((this.f106818a * 31) + this.f106819b) * 31;
        AbstractC45901f fVar = this.f106820c;
        int i2 = 0;
        int hashCode = (i + (fVar != null ? fVar.hashCode() : 0)) * 31;
        AbstractC45913a aVar = this.f106821d;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC45919d dVar = this.f106822e;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        AbstractC89171a<C89391z> aVar2 = this.f106823f;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EditStickerConfig(defaultVideoWidth=" + this.f106818a + ", defaultVideoHeight=" + this.f106819b + ", stickerDeleteViewFactory=" + this.f106820c + ", borderLineViewFactory=" + this.f106821d + ", fakeFeedViewFactory=" + this.f106822e + ", textStickerConvertToQaSticker=" + this.f106823f + ")";
    }

    public C45855c(int i, int i2, AbstractC45901f fVar, AbstractC45913a aVar, AbstractC45919d dVar, AbstractC89171a<C89391z> aVar2) {
        this.f106818a = i;
        this.f106819b = i2;
        this.f106820c = fVar;
        this.f106821d = aVar;
        this.f106822e = dVar;
        this.f106823f = aVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45855c(int i, int i2, AbstractC45901f fVar, AbstractC45913a aVar, AbstractC45919d dVar, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new C45893a() : fVar, (i3 & 8) != 0 ? new C45918c() : aVar, (i3 & 16) != 0 ? null : dVar, (AbstractC89171a<C89391z>) null);
    }
}
