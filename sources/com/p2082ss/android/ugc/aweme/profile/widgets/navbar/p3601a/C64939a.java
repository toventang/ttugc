package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.a */
public final class C64939a implements AbstractC12779c {

    /* renamed from: a */
    public final Map<AbstractC65076c, List<AbstractC65076c>> f146759a;

    /* renamed from: b */
    public final Map<AbstractC65076c, List<AbstractC65076c>> f146760b;

    static {
        Covode.recordClassIndex(76407);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64939a)) {
            return false;
        }
        C64939a aVar = (C64939a) obj;
        return C89219l.m154714a(this.f146759a, aVar.f146759a) && C89219l.m154714a(this.f146760b, aVar.f146760b);
    }

    public final int hashCode() {
        Map<AbstractC65076c, List<AbstractC65076c>> map = this.f146759a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<AbstractC65076c, List<AbstractC65076c>> map2 = this.f146760b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NavActionData(hideOthersMap=" + this.f146759a + ", hiddenByOthersMap=" + this.f146760b + ")";
    }

    public /* synthetic */ C64939a() {
        this(new LinkedHashMap(), new LinkedHashMap());
    }

    private C64939a(Map<AbstractC65076c, List<AbstractC65076c>> map, Map<AbstractC65076c, List<AbstractC65076c>> map2) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        this.f146759a = map;
        this.f146760b = map2;
    }
}
