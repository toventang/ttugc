package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.d */
public final class C66358d {

    /* renamed from: a */
    public final String f149229a;

    /* renamed from: b */
    public final String f149230b;

    /* renamed from: c */
    public final Long f149231c;

    static {
        Covode.recordClassIndex(77876);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66358d)) {
            return false;
        }
        C66358d dVar = (C66358d) obj;
        return C89219l.m154714a(this.f149229a, dVar.f149229a) && C89219l.m154714a(this.f149230b, dVar.f149230b) && C89219l.m154714a(this.f149231c, dVar.f149231c);
    }

    public final int hashCode() {
        String str = this.f149229a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149230b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f149231c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "NavigateUserProfileData(userId=" + this.f149229a + ", secId=" + this.f149230b + ", questionId=" + this.f149231c + ")";
    }

    public C66358d(String str, String str2, Long l) {
        this.f149229a = str;
        this.f149230b = str2;
        this.f149231c = l;
    }
}
