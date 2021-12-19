package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c */
public final class C53998c {

    /* renamed from: a */
    public final String f123823a;

    /* renamed from: b */
    public final String f123824b;

    /* renamed from: c */
    public final String f123825c;

    static {
        Covode.recordClassIndex(63667);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53998c)) {
            return false;
        }
        C53998c cVar = (C53998c) obj;
        return C89219l.m154714a(this.f123823a, cVar.f123823a) && C89219l.m154714a(this.f123824b, cVar.f123824b) && C89219l.m154714a(this.f123825c, cVar.f123825c);
    }

    public final int hashCode() {
        String str = this.f123823a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f123824b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f123825c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MemberFetchParam(conversationId=" + this.f123823a + ", sender=" + this.f123824b + ", secSender=" + this.f123825c + ")";
    }

    public C53998c(String str, String str2, String str3) {
        C89219l.m154721d(str2, "");
        this.f123823a = str;
        this.f123824b = str2;
        this.f123825c = str3;
    }
}
