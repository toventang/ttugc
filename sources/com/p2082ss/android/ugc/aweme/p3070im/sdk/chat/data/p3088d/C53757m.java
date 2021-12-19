package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.m */
public final class C53757m extends AbstractC53746c {

    /* renamed from: a */
    public final C19538ai f123295a;

    /* renamed from: b */
    public final Map<String, List<C19536ag>> f123296b;

    /* renamed from: c */
    public final Map<String, List<C19536ag>> f123297c;

    static {
        Covode.recordClassIndex(63337);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53757m)) {
            return false;
        }
        C53757m mVar = (C53757m) obj;
        return C89219l.m154714a(this.f123295a, mVar.f123295a) && C89219l.m154714a(this.f123296b, mVar.f123296b) && C89219l.m154714a(this.f123297c, mVar.f123297c);
    }

    public final int hashCode() {
        C19538ai aiVar = this.f123295a;
        int i = 0;
        int hashCode = (aiVar != null ? aiVar.hashCode() : 0) * 31;
        Map<String, List<C19536ag>> map = this.f123296b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, List<C19536ag>> map2 = this.f123297c;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "OnGetModifyPropertyMsgEvent(msg=" + this.f123295a + ", oldMessageProperties=" + this.f123296b + ", newMessageProperties=" + this.f123297c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.im.core.d.ag>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.im.core.d.ag>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53757m(C19538ai aiVar, Map<String, ? extends List<? extends C19536ag>> map, Map<String, ? extends List<? extends C19536ag>> map2) {
        super((byte) 0);
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        this.f123295a = aiVar;
        this.f123296b = map;
        this.f123297c = map2;
    }
}
