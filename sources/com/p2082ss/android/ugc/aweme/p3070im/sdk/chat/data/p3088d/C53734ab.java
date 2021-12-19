package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ab */
public final class C53734ab extends AbstractC53746c {

    /* renamed from: a */
    public final List<C19538ai> f123264a;

    /* renamed from: b */
    public final Map<String, Map<String, String>> f123265b;

    static {
        Covode.recordClassIndex(63314);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53734ab)) {
            return false;
        }
        C53734ab abVar = (C53734ab) obj;
        return C89219l.m154714a(this.f123264a, abVar.f123264a) && C89219l.m154714a(this.f123265b, abVar.f123265b);
    }

    public final int hashCode() {
        List<C19538ai> list = this.f123264a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Map<String, Map<String, String>> map = this.f123265b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnUpdateMessageEvent(list=" + this.f123264a + ", oldMsgExtMap=" + this.f123265b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53734ab(List<C19538ai> list, Map<String, ? extends Map<String, String>> map) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        C89219l.m154721d(map, "");
        this.f123264a = list;
        this.f123265b = map;
    }
}
