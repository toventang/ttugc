package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.y */
public final class C53769y extends AbstractC53732a {

    /* renamed from: a */
    public final String f123319a;

    /* renamed from: b */
    public final int f123320b;

    /* renamed from: c */
    public final List<Long> f123321c;

    static {
        Covode.recordClassIndex(63349);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53769y)) {
            return false;
        }
        C53769y yVar = (C53769y) obj;
        return C89219l.m154714a(this.f123319a, yVar.f123319a) && this.f123320b == yVar.f123320b && C89219l.m154714a(this.f123321c, yVar.f123321c);
    }

    public final int hashCode() {
        String str = this.f123319a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f123320b) * 31;
        List<Long> list = this.f123321c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnSilentMemberEvent(conversationId=" + this.f123319a + ", status=" + this.f123320b + ", silentMembers=" + this.f123321c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53769y(String str, int i, List<Long> list) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f123319a = str;
        this.f123320b = i;
        this.f123321c = list;
    }
}
