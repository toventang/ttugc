package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27231d;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.google.p1998c.p1999a.AbstractC27259t;
import com.google.p1998c.p1999a.C27230c;
import com.google.p1998c.p1999a.C27238h;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27256r;
import com.google.p1998c.p2000b.AbstractC27261a;
import com.google.p1998c.p2000b.ConcurrentMapC27275g;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.c.b.c */
public final class C27265c<K, V> {

    /* renamed from: a */
    static final AbstractC27255q<? extends AbstractC27261a.AbstractC27263b> f64429a = new C27256r.C27257a(new AbstractC27261a.AbstractC27263b() {
        /* class com.google.p1998c.p2000b.C27265c.C272661 */

        static {
            Covode.recordClassIndex(32846);
        }

        @Override // com.google.p1998c.p2000b.AbstractC27261a.AbstractC27263b
        /* renamed from: a */
        public final void mo45348a() {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27261a.AbstractC27263b
        /* renamed from: a */
        public final void mo45349a(long j) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27261a.AbstractC27263b
        /* renamed from: b */
        public final void mo45350b() {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27261a.AbstractC27263b
        /* renamed from: b */
        public final void mo45351b(long j) {
        }

        @Override // com.google.p1998c.p2000b.AbstractC27261a.AbstractC27263b
        /* renamed from: c */
        public final void mo45352c() {
        }
    });

    /* renamed from: b */
    static final C27273e f64430b = new C27273e();

    /* renamed from: c */
    static final AbstractC27255q<AbstractC27261a.AbstractC27263b> f64431c = new AbstractC27255q<AbstractC27261a.AbstractC27263b>() {
        /* class com.google.p1998c.p2000b.C27265c.C272672 */

        static {
            Covode.recordClassIndex(32847);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ AbstractC27261a.AbstractC27263b mo5560b() {
            return new AbstractC27261a.C27262a();
        }
    };

    /* renamed from: d */
    static final AbstractC27259t f64432d = new AbstractC27259t() {
        /* class com.google.p1998c.p2000b.C27265c.C272683 */

        static {
            Covode.recordClassIndex(32848);
        }

        @Override // com.google.p1998c.p1999a.AbstractC27259t
        /* renamed from: a */
        public final long mo45347a() {
            return 0;
        }
    };

    /* renamed from: u */
    private static final Logger f64433u = Logger.getLogger(C27265c.class.getName());

    /* renamed from: e */
    boolean f64434e = true;

    /* renamed from: f */
    int f64435f = -1;

    /* renamed from: g */
    int f64436g = -1;

    /* renamed from: h */
    long f64437h = -1;

    /* renamed from: i */
    long f64438i = -1;

    /* renamed from: j */
    AbstractC27345p<? super K, ? super V> f64439j;

    /* renamed from: k */
    ConcurrentMapC27275g.EnumC27313p f64440k;

    /* renamed from: l */
    ConcurrentMapC27275g.EnumC27313p f64441l;

    /* renamed from: m */
    long f64442m = -1;

    /* renamed from: n */
    long f64443n = -1;

    /* renamed from: o */
    long f64444o = -1;

    /* renamed from: p */
    AbstractC27231d<Object> f64445p;

    /* renamed from: q */
    AbstractC27231d<Object> f64446q;

    /* renamed from: r */
    AbstractC27340m<? super K, ? super V> f64447r;

    /* renamed from: s */
    AbstractC27259t f64448s;

    /* renamed from: t */
    public AbstractC27255q<? extends AbstractC27261a.AbstractC27263b> f64449t = f64429a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ConcurrentMapC27275g.EnumC27313p mo45361a() {
        return (ConcurrentMapC27275g.EnumC27313p) C27238h.m54216a(this.f64440k, ConcurrentMapC27275g.EnumC27313p.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConcurrentMapC27275g.EnumC27313p mo45362b() {
        return (ConcurrentMapC27275g.EnumC27313p) C27238h.m54216a(this.f64441l, ConcurrentMapC27275g.EnumC27313p.STRONG);
    }

    /* renamed from: com.google.c.b.c$a */
    enum EnumC27269a implements AbstractC27340m<Object, Object> {
        INSTANCE;

        @Override // com.google.p1998c.p2000b.AbstractC27340m
        /* renamed from: a */
        public final void mo45365a(C27341n<Object, Object> nVar) {
        }

        static {
            Covode.recordClassIndex(32849);
        }
    }

    /* renamed from: com.google.c.b.c$b */
    enum EnumC27270b implements AbstractC27345p<Object, Object> {
        INSTANCE;

        static {
            Covode.recordClassIndex(32850);
        }
    }

    static {
        Covode.recordClassIndex(32845);
    }

    /* renamed from: c */
    public final <K1 extends K, V1 extends V> AbstractC27264b<K1, V1> mo45363c() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f64439j == null) {
            if (this.f64438i == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C27245k.m54244b(z2, "maximumWeight requires weigher");
        } else if (this.f64434e) {
            if (this.f64438i != -1) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54244b(z, "weigher requires maximumWeight");
        } else if (this.f64438i == -1) {
            f64433u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.f64444o != -1) {
            z3 = false;
        }
        C27245k.m54244b(z3, "refreshAfterWrite requires a LoadingCache");
        return new ConcurrentMapC27275g.C27306k(this);
    }

    public final String toString() {
        C27238h.C27239a a = C27238h.m54215a(this);
        int i = this.f64435f;
        if (i != -1) {
            a.mo45326a("initialCapacity", i);
        }
        int i2 = this.f64436g;
        if (i2 != -1) {
            a.mo45326a("concurrencyLevel", i2);
        }
        long j = this.f64437h;
        if (j != -1) {
            a.mo45327a("maximumSize", j);
        }
        long j2 = this.f64438i;
        if (j2 != -1) {
            a.mo45327a("maximumWeight", j2);
        }
        if (this.f64442m != -1) {
            a.mo45328a("expireAfterWrite", this.f64442m + "ns");
        }
        if (this.f64443n != -1) {
            a.mo45328a("expireAfterAccess", this.f64443n + "ns");
        }
        ConcurrentMapC27275g.EnumC27313p pVar = this.f64440k;
        if (pVar != null) {
            a.mo45328a("keyStrength", C27230c.m54196a(pVar.toString()));
        }
        ConcurrentMapC27275g.EnumC27313p pVar2 = this.f64441l;
        if (pVar2 != null) {
            a.mo45328a("valueStrength", C27230c.m54196a(pVar2.toString()));
        }
        if (this.f64445p != null) {
            a.mo45325a("keyEquivalence");
        }
        if (this.f64446q != null) {
            a.mo45325a("valueEquivalence");
        }
        if (this.f64447r != null) {
            a.mo45325a("removalListener");
        }
        return a.toString();
    }

    /* renamed from: a */
    public final C27265c<K, V> mo45359a(ConcurrentMapC27275g.EnumC27313p pVar) {
        boolean z;
        ConcurrentMapC27275g.EnumC27313p pVar2 = this.f64441l;
        if (pVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54245b(z, "Value strength was already set to %s", pVar2);
        this.f64441l = (ConcurrentMapC27275g.EnumC27313p) C27245k.m54229a(pVar);
        return this;
    }

    /* renamed from: a */
    public final C27265c<K, V> mo45358a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.f64437h;
        boolean z4 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54238a(z, "maximum size was already set to %s", j2);
        long j3 = this.f64438i;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C27245k.m54238a(z2, "maximum weight was already set to %s", j3);
        if (this.f64439j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C27245k.m54244b(z3, "maximum size can not be combined with weigher");
        if (j < 0) {
            z4 = false;
        }
        C27245k.m54236a(z4, "maximum size must not be negative");
        this.f64437h = j;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.b.c<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <K1 extends K, V1 extends V> C27265c<K1, V1> mo45360a(AbstractC27340m<? super K1, ? super V1> mVar) {
        boolean z;
        if (this.f64447r == null) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54243b(z);
        this.f64447r = (AbstractC27340m) C27245k.m54229a(mVar);
        return this;
    }
}
