package com.bytedance.ies.ugc.statisticlogger.p1277a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.a.a */
public final class C18209a implements AbstractC17362a {

    /* renamed from: a */
    public final String f43391a;

    static {
        Covode.recordClassIndex(20866);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C18209a) && C89219l.m154714a(this.f43391a, ((C18209a) obj).f43391a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f43391a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ActivityBTMConfig(pageName=" + this.f43391a + ")";
    }
}
