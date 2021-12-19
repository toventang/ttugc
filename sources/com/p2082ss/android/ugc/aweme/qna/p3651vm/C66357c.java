package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.c */
public final class C66357c {

    /* renamed from: a */
    public final String f149227a;

    /* renamed from: b */
    public final String f149228b;

    static {
        Covode.recordClassIndex(77875);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66357c)) {
            return false;
        }
        C66357c cVar = (C66357c) obj;
        return C89219l.m154714a(this.f149227a, cVar.f149227a) && C89219l.m154714a(this.f149228b, cVar.f149228b);
    }

    public final int hashCode() {
        String str = this.f149227a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149228b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NavigateQuestionDetail(questionId=" + this.f149227a + ", enterMethod=" + this.f149228b + ")";
    }

    public C66357c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f149227a = str;
        this.f149228b = str2;
    }
}
