package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.a */
public final class C66288a {

    /* renamed from: a */
    public final String f149019a;

    /* renamed from: b */
    public final boolean f149020b;

    /* renamed from: c */
    public final int f149021c;

    static {
        Covode.recordClassIndex(77797);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66288a)) {
            return false;
        }
        C66288a aVar = (C66288a) obj;
        return C89219l.m154714a(this.f149019a, aVar.f149019a) && this.f149020b == aVar.f149020b && this.f149021c == aVar.f149021c;
    }

    public final int hashCode() {
        String str = this.f149019a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f149020b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.f149021c;
    }

    public final String toString() {
        return "AnswerLaterMutableLiveData(questionId=" + this.f149019a + ", success=" + this.f149020b + ", state=" + this.f149021c + ")";
    }

    public C66288a(String str, boolean z, int i) {
        C89219l.m154721d(str, "");
        this.f149019a = str;
        this.f149020b = z;
        this.f149021c = i;
    }
}
