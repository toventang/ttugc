package com.p2082ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.track.e */
public final class C45551e {

    /* renamed from: a */
    public final Map<String, Object> f106080a;

    static {
        Covode.recordClassIndex(54042);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C45551e) && C89219l.m154714a(this.f106080a, ((C45551e) obj).f106080a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, Object> map = this.f106080a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TrackParams(params=" + this.f106080a + ")";
    }

    private /* synthetic */ C45551e() {
        this(new HashMap());
    }

    public C45551e(Map<String, ? extends Object> map) {
        C89219l.m154721d(map, "");
        this.f106080a = map;
    }
}
