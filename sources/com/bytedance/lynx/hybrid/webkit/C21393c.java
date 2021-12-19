package com.bytedance.lynx.hybrid.webkit;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.webkit.c */
public final class C21393c {

    /* renamed from: a */
    public String f50748a;

    /* renamed from: b */
    public Map<String, String> f50749b;

    static {
        Covode.recordClassIndex(25013);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21393c)) {
            return false;
        }
        C21393c cVar = (C21393c) obj;
        return C89219l.m154714a(this.f50748a, cVar.f50748a) && C89219l.m154714a(this.f50749b, cVar.f50749b);
    }

    public final int hashCode() {
        String str = this.f50748a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.f50749b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UrlAndHeaders(url=" + this.f50748a + ", headers=" + this.f50749b + ")";
    }

    public C21393c(String str, Map<String, String> map) {
        this.f50748a = str;
        this.f50749b = map;
    }
}
