package com.p2082ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.i */
public final class C36892i {

    /* renamed from: a */
    public final String f86888a;

    /* renamed from: b */
    public final C67679e f86889b;

    static {
        Covode.recordClassIndex(44230);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36892i)) {
            return false;
        }
        C36892i iVar = (C36892i) obj;
        return C89219l.m154714a(this.f86888a, iVar.f86888a) && C89219l.m154714a(this.f86889b, iVar.f86889b);
    }

    public final int hashCode() {
        String str = this.f86888a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C67679e eVar = this.f86889b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchMobParam(requestId=" + this.f86888a + ", searchSugEntity=" + this.f86889b + ")";
    }

    public C36892i(String str, C67679e eVar) {
        C89219l.m154721d(eVar, "");
        this.f86888a = str;
        this.f86889b = eVar;
    }
}
