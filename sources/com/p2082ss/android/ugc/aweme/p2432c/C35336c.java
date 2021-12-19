package com.p2082ss.android.ugc.aweme.p2432c;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.c.c */
public final class C35336c extends AbstractC35338e {

    /* renamed from: a */
    public final List<String> f83368a;

    static {
        Covode.recordClassIndex(42504);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C35336c) && C89219l.m154714a(this.f83368a, ((C35336c) obj).f83368a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f83368a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MVUploadFrameTaskParam(imageList=" + this.f83368a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35336c(List<String> list) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        this.f83368a = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2432c.AbstractC35338e
    /* renamed from: a */
    public final boolean mo62216a(AbstractC35338e eVar) {
        C89219l.m154721d(eVar, "");
        if (C89219l.m154714a(eVar, this)) {
            return true;
        }
        if (!(eVar instanceof C35336c)) {
            return false;
        }
        C35336c cVar = (C35336c) eVar;
        if (cVar.f83368a.size() != this.f83368a.size()) {
            return false;
        }
        return C89219l.m154714a(C89070n.m154592l(this.f83368a), C89070n.m154592l(cVar.f83368a));
    }
}
