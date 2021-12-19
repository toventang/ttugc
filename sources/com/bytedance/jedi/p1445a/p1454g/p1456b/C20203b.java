package com.bytedance.jedi.p1445a.p1454g.p1456b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20192a;
import com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20200e;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20195b;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20198c;
import com.bytedance.jedi.p1445a.p1454g.p1456b.ConcurrentMapC20207c;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.bytedance.jedi.a.g.b.b */
public final class C20203b<K, V> {

    /* renamed from: a */
    static final AbstractC20200e f47975a = new AbstractC20200e() {
        /* class com.bytedance.jedi.p1445a.p1454g.p1456b.C20203b.C202041 */

        static {
            Covode.recordClassIndex(23712);
        }

        @Override // com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20200e
        /* renamed from: a */
        public final long mo33497a() {
            return 0;
        }
    };

    /* renamed from: q */
    private static final Logger f47976q = Logger.getLogger(C20203b.class.getName());

    /* renamed from: b */
    boolean f47977b = true;

    /* renamed from: c */
    int f47978c = -1;

    /* renamed from: d */
    int f47979d = -1;

    /* renamed from: e */
    long f47980e = -1;

    /* renamed from: f */
    long f47981f = -1;

    /* renamed from: g */
    AbstractC20263h<? super K, ? super V> f47982g;

    /* renamed from: h */
    ConcurrentMapC20207c.EnumC20238n f47983h;

    /* renamed from: i */
    ConcurrentMapC20207c.EnumC20238n f47984i;

    /* renamed from: j */
    long f47985j = -1;

    /* renamed from: k */
    long f47986k = -1;

    /* renamed from: l */
    long f47987l = -1;

    /* renamed from: m */
    AbstractC20192a<Object> f47988m;

    /* renamed from: n */
    AbstractC20192a<Object> f47989n;

    /* renamed from: o */
    AbstractC20261f<? super K, ? super V> f47990o;

    /* renamed from: p */
    AbstractC20200e f47991p;

    /* renamed from: a */
    public static C20203b<Object, Object> m38204a() {
        return new C20203b<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConcurrentMapC20207c.EnumC20238n mo33504b() {
        return (ConcurrentMapC20207c.EnumC20238n) C20195b.m38184a(this.f47983h, ConcurrentMapC20207c.EnumC20238n.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ConcurrentMapC20207c.EnumC20238n mo33505c() {
        return (ConcurrentMapC20207c.EnumC20238n) C20195b.m38184a(this.f47984i, ConcurrentMapC20207c.EnumC20238n.STRONG);
    }

    /* renamed from: com.bytedance.jedi.a.g.b.b$a */
    enum EnumC20205a implements AbstractC20261f<Object, Object> {
        INSTANCE;

        static {
            Covode.recordClassIndex(23713);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.b.b$b */
    enum EnumC20206b implements AbstractC20263h<Object, Object> {
        INSTANCE;

        static {
            Covode.recordClassIndex(23714);
        }
    }

    static {
        Covode.recordClassIndex(23711);
    }

    private C20203b() {
    }

    /* renamed from: d */
    public final <K1 extends K, V1 extends V> AbstractC20202a<K1, V1> mo33506d() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f47982g == null) {
            if (this.f47981f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C20198c.m38194b(z2, "maximumWeight requires weigher");
        } else if (this.f47977b) {
            if (this.f47981f != -1) {
                z = true;
            } else {
                z = false;
            }
            C20198c.m38194b(z, "weigher requires maximumWeight");
        } else if (this.f47981f == -1) {
            f47976q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.f47987l != -1) {
            z3 = false;
        }
        C20198c.m38194b(z3, "refreshAfterWrite requires a LoadingCache");
        return new ConcurrentMapC20207c.C20234j(this);
    }

    public final String toString() {
        C20195b.C20196a aVar = new C20195b.C20196a(getClass().getSimpleName(), (byte) 0);
        int i = this.f47978c;
        if (i != -1) {
            aVar.mo33493a("initialCapacity", i);
        }
        int i2 = this.f47979d;
        if (i2 != -1) {
            aVar.mo33493a("concurrencyLevel", i2);
        }
        long j = this.f47980e;
        if (j != -1) {
            aVar.mo33494a("maximumSize", j);
        }
        long j2 = this.f47981f;
        if (j2 != -1) {
            aVar.mo33494a("maximumWeight", j2);
        }
        if (this.f47985j != -1) {
            aVar.mo33495a("expireAfterWrite", this.f47985j + "ns");
        }
        if (this.f47986k != -1) {
            aVar.mo33495a("expireAfterAccess", this.f47986k + "ns");
        }
        ConcurrentMapC20207c.EnumC20238n nVar = this.f47983h;
        if (nVar != null) {
            aVar.mo33495a("keyStrength", nVar.toString());
        }
        ConcurrentMapC20207c.EnumC20238n nVar2 = this.f47984i;
        if (nVar2 != null) {
            aVar.mo33495a("valueStrength", nVar2.toString());
        }
        if (this.f47988m != null) {
            aVar.mo33492a("keyEquivalence");
        }
        if (this.f47989n != null) {
            aVar.mo33492a("valueEquivalence");
        }
        if (this.f47990o != null) {
            aVar.mo33492a("removalListener");
        }
        return aVar.toString();
    }

    /* renamed from: a */
    public final C20203b<K, V> mo33503a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.f47980e;
        boolean z4 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C20198c.m38193a(z, "maximum size was already set to %s", j2);
        long j3 = this.f47981f;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20198c.m38193a(z2, "maximum weight was already set to %s", j3);
        if (this.f47982g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C20198c.m38194b(z3, "maximum size can not be combined with weigher");
        if (j < 0) {
            z4 = false;
        }
        C20198c.m38192a(z4, "maximum size must not be negative");
        this.f47980e = j;
        return this;
    }
}
