package com.p2082ss.ugc.live.sdk.msg.p4471b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.b.b */
public final class C87078b {

    /* renamed from: a */
    public final String f196298a;

    /* renamed from: b */
    public final String f196299b;

    static {
        Covode.recordClassIndex(102874);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87078b)) {
            return false;
        }
        C87078b bVar = (C87078b) obj;
        return C89219l.m154714a(this.f196298a, bVar.f196298a) && C89219l.m154714a(this.f196299b, bVar.f196299b);
    }

    public final int hashCode() {
        String str = this.f196298a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f196299b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Header(key=" + this.f196298a + ", value=" + this.f196299b + ")";
    }

    public C87078b(String str, String str2) {
        this.f196298a = str;
        this.f196299b = str2;
    }
}
