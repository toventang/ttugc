package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aq */
public final class C33917aq {

    /* renamed from: a */
    public final String f80225a;

    /* renamed from: b */
    public final String f80226b;

    static {
        Covode.recordClassIndex(40836);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33917aq)) {
            return false;
        }
        C33917aq aqVar = (C33917aq) obj;
        return C89219l.m154714a(this.f80225a, aqVar.f80225a) && C89219l.m154714a(this.f80226b, aqVar.f80226b);
    }

    public final int hashCode() {
        String str = this.f80225a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f80226b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BindMobileFinishData(phone=" + this.f80225a + ", response=" + this.f80226b + ")";
    }

    public C33917aq(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f80225a = str;
        this.f80226b = str2;
    }
}
