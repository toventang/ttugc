package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.o */
public final class C53759o extends AbstractC53732a {

    /* renamed from: a */
    public final String f123299a;

    /* renamed from: b */
    public final List<C19537ah> f123300b;

    static {
        Covode.recordClassIndex(63339);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53759o)) {
            return false;
        }
        C53759o oVar = (C53759o) obj;
        return C89219l.m154714a(this.f123299a, oVar.f123299a) && C89219l.m154714a(this.f123300b, oVar.f123300b);
    }

    public final int hashCode() {
        String str = this.f123299a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C19537ah> list = this.f123300b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnLoadMemberEvent(conversationId=" + this.f123299a + ", list=" + this.f123300b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.im.core.d.ah> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53759o(String str, List<? extends C19537ah> list) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f123299a = str;
        this.f123300b = list;
    }
}
