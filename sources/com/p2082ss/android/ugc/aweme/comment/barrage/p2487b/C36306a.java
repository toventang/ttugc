package com.p2082ss.android.ugc.aweme.comment.barrage.p2487b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.b.a */
public final class C36306a extends C36309d {

    /* renamed from: a */
    public final Comment f85823a;

    /* renamed from: b */
    public final boolean f85824b;

    /* renamed from: c */
    public final C36296a f85825c;

    static {
        Covode.recordClassIndex(43583);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36306a)) {
            return false;
        }
        C36306a aVar = (C36306a) obj;
        return C89219l.m154714a(this.f85823a, aVar.f85823a) && this.f85824b == aVar.f85824b && C89219l.m154714a(this.f85825c, aVar.f85825c);
    }

    public final int hashCode() {
        Comment comment = this.f85823a;
        int i = 0;
        int hashCode = (comment != null ? comment.hashCode() : 0) * 31;
        boolean z = this.f85824b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        C36296a aVar = this.f85825c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "ReactionBubbleCommentItem(comment=" + this.f85823a + ", forceInsert=" + this.f85824b + ", mobEventParam=" + this.f85825c + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36309d
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        return super.mo28110b(aVar);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36309d
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C36306a)) {
            return super.mo28109a(aVar);
        }
        if (!C89219l.m154714a((Object) ((C36306a) aVar).f85823a.getText(), (Object) this.f85823a.getText()) || !super.mo28109a(aVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36306a(Comment comment, boolean z, C36296a aVar) {
        super(1);
        C89219l.m154721d(comment, "");
        this.f85823a = comment;
        this.f85824b = z;
        this.f85825c = aVar;
    }
}
