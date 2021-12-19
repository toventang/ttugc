package com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.d */
public final class C80113d {

    /* renamed from: a */
    public final String f179510a;

    /* renamed from: b */
    public final String f179511b;

    static {
        Covode.recordClassIndex(93353);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80113d)) {
            return false;
        }
        C80113d dVar = (C80113d) obj;
        return C89219l.m154714a(this.f179510a, dVar.f179510a) && C89219l.m154714a(this.f179511b, dVar.f179511b);
    }

    public final int hashCode() {
        String str = this.f179510a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f179511b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RemoveFollowerReqParams(uid=" + this.f179510a + ", secUserId=" + this.f179511b + ")";
    }

    public C80113d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f179510a = str;
        this.f179511b = str2;
    }
}
