package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.c */
public final class C50394c {

    /* renamed from: a */
    public final String f116348a;

    /* renamed from: b */
    public final String f116349b;

    static {
        Covode.recordClassIndex(59526);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50394c)) {
            return false;
        }
        C50394c cVar = (C50394c) obj;
        return C89219l.m154714a(this.f116348a, cVar.f116348a) && C89219l.m154714a(this.f116349b, cVar.f116349b);
    }

    public final int hashCode() {
        String str = this.f116348a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f116349b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DislikeReasonVO(id=" + this.f116348a + ", reason=" + this.f116349b + ")";
    }

    public C50394c(String str, String str2) {
        this.f116348a = str;
        this.f116349b = str2;
    }
}
