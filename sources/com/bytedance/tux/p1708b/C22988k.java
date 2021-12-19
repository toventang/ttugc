package com.bytedance.tux.p1708b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.p1709a.AbstractC22974b;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.k */
public final class C22988k<T extends View> {

    /* renamed from: a */
    public AbstractC22990b f54377a;

    /* renamed from: b */
    private final Map<Integer, C22989a> f54378b = new LinkedHashMap();

    /* renamed from: c */
    private final AbstractC22974b<T> f54379c;

    /* renamed from: com.bytedance.tux.b.k$b */
    public interface AbstractC22990b {
        static {
            Covode.recordClassIndex(26907);
        }

        /* renamed from: a */
        void mo37308a(Map<Integer, ? extends Object> map);
    }

    static {
        Covode.recordClassIndex(26905);
    }

    public C22988k(AbstractC22974b<T> bVar) {
        C89219l.m154719c(bVar, "");
        this.f54379c = bVar;
    }

    /* renamed from: a */
    public final void mo37302a(T t) {
        Map<Integer, Object> a;
        C89219l.m154719c(t, "");
        for (Map.Entry<Integer, C22989a> entry : this.f54378b.entrySet()) {
            int intValue = entry.getKey().intValue();
            int i = entry.getValue().f54380a;
            C22978b a2 = C22982f.m43324a(intValue, i);
            if (!(a2 == null || (a = a2.mo37292a(t)) == null || !(!C89219l.m154714a(a, entry.getValue().f54381b)))) {
                this.f54378b.put(Integer.valueOf(intValue), new C22989a(i, a));
                m43359a(t, a);
            }
        }
    }

    /* renamed from: com.bytedance.tux.b.k$a */
    public static final class C22989a {

        /* renamed from: a */
        public final int f54380a;

        /* renamed from: b */
        public final Map<Integer, Object> f54381b;

        static {
            Covode.recordClassIndex(26906);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22989a)) {
                return false;
            }
            C22989a aVar = (C22989a) obj;
            return this.f54380a == aVar.f54380a && C89219l.m154714a(this.f54381b, aVar.f54381b);
        }

        public final int hashCode() {
            int i = this.f54380a * 31;
            Map<Integer, Object> map = this.f54381b;
            return i + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            return "ParseParams(variant=" + this.f54380a + ", attrs=" + this.f54381b + ")";
        }

        public C22989a(int i, Map<Integer, ? extends Object> map) {
            C89219l.m154719c(map, "");
            this.f54380a = i;
            this.f54381b = map;
        }
    }

    /* renamed from: a */
    public final void mo37303a(T t, int i) {
        C89219l.m154719c(t, "");
        mo37304a(t, i, -1);
    }

    /* renamed from: a */
    private final void m43359a(T t, Map<Integer, ? extends Object> map) {
        AbstractC22990b bVar;
        Map<Integer, ? extends Object> a = this.f54379c.mo37289a(t, map);
        if ((!a.isEmpty()) && (bVar = this.f54377a) != null) {
            bVar.mo37308a(a);
        }
    }

    /* renamed from: a */
    public final void mo37304a(T t, int i, int i2) {
        C89219l.m154719c(t, "");
        C22978b a = C22982f.m43324a(i, i2);
        if (a != null) {
            Map<Integer, Object> a2 = a.mo37292a(t);
            this.f54378b.put(Integer.valueOf(i), new C22989a(i2, a2));
            m43359a(t, a2);
        }
    }
}
