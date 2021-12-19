package com.p2082ss.android.ugc.aweme.upvote.detail.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.d */
public final class C79787d implements AbstractC17641a {

    /* renamed from: a */
    public final C79714h f178996a;

    /* renamed from: b */
    public final C79899b f178997b;

    /* renamed from: c */
    public boolean f178998c;

    static {
        Covode.recordClassIndex(93011);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79787d)) {
            return false;
        }
        C79787d dVar = (C79787d) obj;
        return C89219l.m154714a(this.f178996a, dVar.f178996a) && C89219l.m154714a(this.f178997b, dVar.f178997b) && this.f178998c == dVar.f178998c;
    }

    public final int hashCode() {
        C79714h hVar = this.f178996a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C79899b bVar = this.f178997b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f178998c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "UpvoteDetailPanelListItem(upvote=" + this.f178996a + ", detailMobParam=" + this.f178997b + ", needHighlight=" + this.f178998c + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C79787d)) {
            return false;
        }
        return C89219l.m154714a((Object) this.f178996a.getCommentId(), (Object) ((C79787d) aVar).f178996a.getCommentId());
    }

    public C79787d(C79714h hVar, C79899b bVar, boolean z) {
        C89219l.m154721d(hVar, "");
        this.f178996a = hVar;
        this.f178997b = bVar;
        this.f178998c = z;
    }
}
