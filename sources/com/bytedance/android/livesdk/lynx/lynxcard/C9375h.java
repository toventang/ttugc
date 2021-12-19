package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.h */
public final class C9375h {

    /* renamed from: a */
    public final String f22866a;

    /* renamed from: b */
    public final Map<String, Object> f22867b;

    static {
        Covode.recordClassIndex(10882);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9375h)) {
            return false;
        }
        C9375h hVar = (C9375h) obj;
        return C89219l.m154714a(this.f22866a, hVar.f22866a) && C89219l.m154714a(this.f22867b, hVar.f22867b);
    }

    public final int hashCode() {
        String str = this.f22866a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f22867b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UpdateLynxCardData(containerId=" + this.f22866a + ", data=" + this.f22867b + ")";
    }

    public C9375h(String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        this.f22866a = str;
        this.f22867b = map;
    }
}
