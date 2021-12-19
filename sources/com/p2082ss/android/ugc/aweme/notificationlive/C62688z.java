package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.z */
public final class C62688z implements AbstractC81914b {

    /* renamed from: a */
    public final String f142122a;

    /* renamed from: b */
    public final String f142123b;

    static {
        Covode.recordClassIndex(73491);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62688z)) {
            return false;
        }
        C62688z zVar = (C62688z) obj;
        return C89219l.m154714a(this.f142122a, zVar.f142122a) && C89219l.m154714a(this.f142123b, zVar.f142123b);
    }

    public final int hashCode() {
        String str = this.f142122a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142123b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UnBlockUser(uid=" + this.f142122a + ", secId=" + this.f142123b + ")";
    }

    public C62688z(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f142122a = str;
        this.f142123b = str2;
    }
}
