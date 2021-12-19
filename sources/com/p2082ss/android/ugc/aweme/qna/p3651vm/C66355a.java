package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.a */
public final class C66355a {

    /* renamed from: a */
    public final String f149220a;

    /* renamed from: b */
    public final String f149221b;

    static {
        Covode.recordClassIndex(77873);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66355a)) {
            return false;
        }
        C66355a aVar = (C66355a) obj;
        return C89219l.m154714a(this.f149220a, aVar.f149220a) && C89219l.m154714a(this.f149221b, aVar.f149221b);
    }

    public final int hashCode() {
        String str = this.f149220a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149221b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NavigateAwemeDetailData(awemeId=" + this.f149220a + ", content=" + this.f149221b + ")";
    }

    public C66355a(String str, String str2) {
        this.f149220a = str;
        this.f149221b = str2;
    }
}
