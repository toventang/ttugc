package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.i */
public final class C66297i {

    /* renamed from: a */
    public final String f149067a;

    /* renamed from: b */
    public final boolean f149068b;

    static {
        Covode.recordClassIndex(77806);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66297i)) {
            return false;
        }
        C66297i iVar = (C66297i) obj;
        return C89219l.m154714a(this.f149067a, iVar.f149067a) && this.f149068b == iVar.f149068b;
    }

    public final int hashCode() {
        String str = this.f149067a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f149068b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "QuestionIdNetworkResultData(questionId=" + this.f149067a + ", success=" + this.f149068b + ")";
    }
}
