package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.c */
public final class C36674c implements AbstractC12798a {

    /* renamed from: a */
    public final String f86664a;

    /* renamed from: b */
    public final C12776a<Boolean> f86665b;

    static {
        Covode.recordClassIndex(44011);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36674c)) {
            return false;
        }
        C36674c cVar = (C36674c) obj;
        return C89219l.m154714a(this.f86664a, cVar.f86664a) && C89219l.m154714a(this.f86665b, cVar.f86665b);
    }

    public final int hashCode() {
        String str = this.f86664a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C12776a<Boolean> aVar = this.f86665b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchBarData(keyword=" + this.f86664a + ", clearEvent=" + this.f86665b + ")";
    }

    public C36674c(String str, C12776a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f86664a = str;
        this.f86665b = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C36674c m74462a(C36674c cVar, String str, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            str = cVar.f86664a;
        }
        if ((i & 2) != 0) {
            aVar = cVar.f86665b;
        }
        C89219l.m154721d(aVar, "");
        return new C36674c(str, aVar);
    }
}
