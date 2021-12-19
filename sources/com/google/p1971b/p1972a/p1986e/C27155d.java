package com.google.p1971b.p1972a.p1986e;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import com.google.p1971b.p1972a.p1993g.AbstractC27191m;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.b.a.e.d */
public final class C27155d implements AbstractC27191m {

    /* renamed from: a */
    public final AbstractC27153b f64296a;

    /* renamed from: b */
    public final Set<String> f64297b;

    static {
        Covode.recordClassIndex(32735);
    }

    /* renamed from: com.google.b.a.e.d$a */
    public static class C27156a {

        /* renamed from: a */
        public final AbstractC27153b f64298a;

        /* renamed from: b */
        public Collection<String> f64299b = new HashSet();

        static {
            Covode.recordClassIndex(32736);
        }

        /* renamed from: a */
        public final C27155d mo45214a() {
            return new C27155d(this);
        }

        public C27156a(AbstractC27153b bVar) {
            this.f64298a = (AbstractC27153b) C27159b.m53980a(bVar);
        }
    }

    protected C27155d(C27156a aVar) {
        this.f64296a = aVar.f64298a;
        this.f64297b = new HashSet(aVar.f64299b);
    }
}
