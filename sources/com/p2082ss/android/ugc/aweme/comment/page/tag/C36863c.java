package com.p2082ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.c */
public final class C36863c implements AbstractC17641a {

    /* renamed from: a */
    public final C36889f f86848a;

    static {
        Covode.recordClassIndex(44201);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C36863c) && C89219l.m154714a(this.f86848a, ((C36863c) obj).f86848a);
        }
        return true;
    }

    public final int hashCode() {
        C36889f fVar = this.f86848a;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FeedTaggedEditItem(param=" + this.f86848a + ")";
    }

    public C36863c(C36889f fVar) {
        this.f86848a = fVar;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }
}
