package com.p2082ss.android.ugc.aweme.upvote.event;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.event.b */
public final class C79899b {

    /* renamed from: a */
    public final String f179145a;

    /* renamed from: b */
    public final String f179146b;

    /* renamed from: c */
    public final String f179147c;

    /* renamed from: d */
    public final String f179148d;

    /* renamed from: e */
    public final String f179149e;

    static {
        Covode.recordClassIndex(93125);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79899b)) {
            return false;
        }
        C79899b bVar = (C79899b) obj;
        return C89219l.m154714a(this.f179145a, bVar.f179145a) && C89219l.m154714a(this.f179146b, bVar.f179146b) && C89219l.m154714a(this.f179147c, bVar.f179147c) && C89219l.m154714a(this.f179148d, bVar.f179148d) && C89219l.m154714a(this.f179149e, bVar.f179149e);
    }

    public final int hashCode() {
        String str = this.f179145a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f179146b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f179147c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f179148d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f179149e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "UpvoteDetailMobParam(enterFrom=" + this.f179145a + ", groupId=" + this.f179146b + ", authorId=" + this.f179147c + ", requestId=" + this.f179148d + ", followStatus=" + this.f179149e + ")";
    }

    public C79899b(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f179145a = str;
        this.f179146b = str2;
        this.f179147c = str3;
        this.f179148d = str4;
        this.f179149e = str5;
    }
}
