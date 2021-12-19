package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53771a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.a */
public final class C54463a {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f124759a;

    /* renamed from: b */
    public final AbstractC89172b<EnumC53771a, C89391z> f124760b;

    static {
        Covode.recordClassIndex(64173);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54463a)) {
            return false;
        }
        C54463a aVar = (C54463a) obj;
        return C89219l.m154714a(this.f124759a, aVar.f124759a) && C89219l.m154714a(this.f124760b, aVar.f124760b);
    }

    public final int hashCode() {
        AbstractC89171a<C89391z> aVar = this.f124759a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        AbstractC89172b<EnumC53771a, C89391z> bVar = this.f124760b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ChatRiskHintAction(onDelete=" + this.f124759a + ", onCheckBottomType=" + this.f124760b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C54463a(AbstractC89171a<C89391z> aVar, AbstractC89172b<? super EnumC53771a, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f124759a = aVar;
        this.f124760b = bVar;
    }
}
