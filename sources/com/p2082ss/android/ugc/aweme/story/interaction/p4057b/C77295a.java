package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.a */
public final class C77295a extends C77299e {

    /* renamed from: a */
    public final Comment f173408a;

    /* renamed from: b */
    public final boolean f173409b;

    /* renamed from: c */
    public final C77302g f173410c;

    static {
        Covode.recordClassIndex(90314);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77295a)) {
            return false;
        }
        C77295a aVar = (C77295a) obj;
        return C89219l.m154714a(this.f173408a, aVar.f173408a) && this.f173409b == aVar.f173409b && C89219l.m154714a(this.f173410c, aVar.f173410c);
    }

    public final int hashCode() {
        Comment comment = this.f173408a;
        int i = 0;
        int hashCode = (comment != null ? comment.hashCode() : 0) * 31;
        boolean z = this.f173409b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        C77302g gVar = this.f173410c;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "ReactionBubbleCommentItem(comment=" + this.f173408a + ", forceInsert=" + this.f173409b + ", mobEventParam=" + this.f173410c + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77299e, com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        return super.mo28110b(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77299e, com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C77295a)) {
            return super.mo28109a(aVar);
        }
        if (!C89219l.m154714a((Object) ((C77295a) aVar).f173408a.getText(), (Object) this.f173408a.getText()) || !super.mo28109a(aVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77295a(Comment comment, boolean z, C77302g gVar) {
        super(1);
        C89219l.m154721d(comment, "");
        this.f173408a = comment;
        this.f173409b = z;
        this.f173410c = gVar;
    }
}
