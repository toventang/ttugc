package com.facebook.imagepipeline.p1880e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24092j;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1881f.C24437d;
import com.facebook.imagepipeline.p1881f.C24438e;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1886k.C24461b;
import com.facebook.imagepipeline.p1889n.AbstractC24544ak;
import com.facebook.imagepipeline.p1889n.C24561au;
import com.facebook.imagepipeline.p1889n.C24573az;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.C24158d;
import com.facebook.p1844d.C24167h;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.facebook.imagepipeline.e.h */
public final class C24413h {

    /* renamed from: g */
    private static final CancellationException f57867g = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    public final AbstractC24397p<AbstractC24026e, AbstractC24454c> f57868a;

    /* renamed from: b */
    public final C24373e f57869b;

    /* renamed from: c */
    public final C24373e f57870c;

    /* renamed from: d */
    public final AbstractC24380f f57871d;

    /* renamed from: e */
    public final C24573az f57872e;

    /* renamed from: f */
    public final AbstractC24093k<Boolean> f57873f;

    /* renamed from: h */
    private final C24432n f57874h;

    /* renamed from: i */
    private final AbstractC24462c f57875i;

    /* renamed from: j */
    private final AbstractC24093k<Boolean> f57876j;

    /* renamed from: k */
    private final AbstractC24397p<AbstractC24026e, AbstractC24111h> f57877k;

    /* renamed from: l */
    private final AbstractC24093k<Boolean> f57878l;

    /* renamed from: m */
    private AtomicLong f57879m = new AtomicLong();

    /* renamed from: a */
    public final AbstractC24157c<C24117a<AbstractC24454c>> mo40226a(C24636b bVar, Object obj, C24636b.EnumC24638b bVar2, AbstractC24462c cVar) {
        try {
            C24432n nVar = this.f57874h;
            C24644b.m47156a();
            AbstractC24544ak<C24117a<AbstractC24454c>> c = nVar.mo40273c(bVar);
            if (bVar.mPostprocessor != null) {
                c = nVar.mo40268a(c);
            }
            if (nVar.f58037a) {
                c = nVar.mo40272c(c);
            }
            C24644b.m47156a();
            return m46513a(c, bVar, bVar2, obj, cVar);
        } catch (Exception e) {
            return C24158d.m45792a(e);
        }
    }

    /* renamed from: a */
    public final void mo40227a() {
        C244163 r1 = new AbstractC24092j<AbstractC24026e>() {
            /* class com.facebook.imagepipeline.p1880e.C24413h.C244163 */

            static {
                Covode.recordClassIndex(28559);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1832d.AbstractC24092j
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo39650a(AbstractC24026e eVar) {
                return true;
            }
        };
        this.f57868a.mo40200a(r1);
        this.f57877k.mo40200a(r1);
    }

    /* renamed from: a */
    public final void mo40228a(Uri uri) {
        C24636b fromUri = C24636b.fromUri(uri);
        if (fromUri != null) {
            final Uri parse = Uri.parse(C24389j.m46446a().mo40188a(fromUri, null).mo39543a());
            C244152 r1 = new AbstractC24092j<AbstractC24026e>() {
                /* class com.facebook.imagepipeline.p1880e.C24413h.C244152 */

                static {
                    Covode.recordClassIndex(28558);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.facebook.common.p1832d.AbstractC24092j
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ boolean mo39650a(AbstractC24026e eVar) {
                    return eVar.mo39544a(parse);
                }
            };
            this.f57868a.mo40200a(r1);
            this.f57877k.mo40200a(r1);
        }
        AbstractC24026e a = this.f57871d.mo40187a(C24636b.fromUri(uri));
        this.f57869b.mo40180g(a);
        this.f57870c.mo40180g(a);
    }

    /* renamed from: b */
    public final void mo40230b() {
        this.f57872e.mo40427a();
    }

    /* renamed from: c */
    public final void mo40233c() {
        this.f57872e.mo40429b();
    }

    static {
        Covode.recordClassIndex(28556);
    }

    /* renamed from: e */
    private String m46520e() {
        return String.valueOf(this.f57879m.getAndIncrement());
    }

    /* renamed from: d */
    public final boolean mo40237d() {
        return this.f57872e.mo40431c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.e.h$6 */
    public static /* synthetic */ class C244196 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57891a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 28562(0x6f92, float:4.0024E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.imagepipeline.o.b$a[] r0 = com.facebook.imagepipeline.p1890o.C24636b.EnumC24637a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.p1880e.C24413h.C244196.f57891a = r2
                com.facebook.imagepipeline.o.b$a r0 = com.facebook.imagepipeline.p1890o.C24636b.EnumC24637a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.p1880e.C24413h.C244196.f57891a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.imagepipeline.o.b$a r0 = com.facebook.imagepipeline.p1890o.C24636b.EnumC24637a.SMALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1880e.C24413h.C244196.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final boolean mo40231b(Uri uri) {
        if (uri == null) {
            return false;
        }
        return m46517a(C24636b.fromUri(uri));
    }

    /* renamed from: d */
    public final AbstractC24157c<Boolean> mo40235d(Uri uri) {
        return m46519c(C24636b.fromUri(uri));
    }

    /* renamed from: a */
    private boolean m46517a(C24636b bVar) {
        if (bVar == null) {
            return false;
        }
        C24117a<AbstractC24454c> a = this.f57868a.mo40201a(this.f57871d.mo40188a(bVar, null));
        try {
            return C24117a.m45710a((C24117a<?>) a);
        } finally {
            C24117a.m45712c(a);
        }
    }

    /* renamed from: c */
    public final boolean mo40234c(Uri uri) {
        if (m46516a(uri, C24636b.EnumC24637a.SMALL) || m46516a(uri, C24636b.EnumC24637a.DEFAULT)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m46518b(C24636b bVar) {
        AbstractC24026e a = this.f57871d.mo40187a(bVar);
        int i = C244196.f57891a[bVar.mCacheChoice.ordinal()];
        if (i == 1) {
            return this.f57869b.mo40178e(a);
        }
        if (i != 2) {
            return false;
        }
        return this.f57870c.mo40178e(a);
    }

    /* renamed from: c */
    private AbstractC24157c<Boolean> m46519c(C24636b bVar) {
        final AbstractC24026e a = this.f57871d.mo40187a(bVar);
        final C24167h hVar = new C24167h();
        this.f57869b.mo40177d(a).mo5537b(new AbstractC1729g<Boolean, C1731i<Boolean>>() {
            /* class com.facebook.imagepipeline.p1880e.C24413h.C244185 */

            static {
                Covode.recordClassIndex(28561);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ C1731i<Boolean> then(C1731i<Boolean> iVar) {
                if (iVar.mo5539b() || iVar.mo5544c() || !iVar.mo5545d().booleanValue()) {
                    return C24413h.this.f57870c.mo40177d(a);
                }
                return C1731i.m5633a((Object) true);
            }
        }).mo5532a(new AbstractC1729g<Boolean, Void>() {
            /* class com.facebook.imagepipeline.p1880e.C24413h.C244174 */

            static {
                Covode.recordClassIndex(28560);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Void then(C1731i<Boolean> iVar) {
                boolean z;
                C24167h hVar = hVar;
                if (iVar.mo5539b() || iVar.mo5544c() || !iVar.mo5545d().booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                hVar.mo39766b(Boolean.valueOf(z));
                return null;
            }
        });
        return hVar;
    }

    /* renamed from: a */
    public final AbstractC24093k<AbstractC24157c<C24117a<AbstractC24454c>>> mo40223a(C24636b bVar, C24636b.EnumC24638b bVar2) {
        return new AbstractC24093k<AbstractC24157c<C24117a<AbstractC24454c>>>(bVar, null, bVar2) {
            /* class com.facebook.imagepipeline.p1880e.C24413h.C244141 */

            /* renamed from: a */
            final /* synthetic */ C24636b f57880a;

            /* renamed from: b */
            final /* synthetic */ Object f57881b = null;

            /* renamed from: c */
            final /* synthetic */ C24636b.EnumC24638b f57882c;

            static {
                Covode.recordClassIndex(28557);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.facebook.common.p1832d.AbstractC24093k
            /* renamed from: b */
            public final /* synthetic */ AbstractC24157c<C24117a<AbstractC24454c>> mo34217b() {
                return C24413h.this.mo40225a(this.f57880a, this.f57881b, this.f57882c);
            }

            public final String toString() {
                return C24088h.m45610a(this).mo39647a("uri", this.f57880a.mSourceUri).toString();
            }

            {
                this.f57880a = r3;
                this.f57882c = r5;
            }
        };
    }

    /* renamed from: d */
    public final AbstractC24157c<Void> mo40236d(C24636b bVar, Object obj) {
        return m46514a(bVar, obj, EnumC24362c.MEDIUM);
    }

    /* renamed from: a */
    private boolean m46516a(Uri uri, C24636b.EnumC24637a aVar) {
        C24639c a = C24639c.m47149a(uri);
        a.f58556g = aVar;
        return m46518b(a.mo40483a());
    }

    /* renamed from: b */
    public final AbstractC24157c<C24117a<AbstractC24111h>> mo40229b(C24636b bVar, Object obj) {
        C24636b bVar2 = bVar;
        C24091i.m45617a(bVar2.mSourceUri);
        try {
            AbstractC24544ak<C24117a<AbstractC24111h>> a = this.f57874h.mo40269a(bVar2);
            if (bVar2.mResizeOptions != null) {
                C24639c a2 = C24639c.m47150a(bVar2);
                a2.f58553d = null;
                bVar2 = a2.mo40483a();
            }
            return m46513a(a, bVar2, C24636b.EnumC24638b.FULL_FETCH, obj, (AbstractC24462c) null);
        } catch (Exception e) {
            return C24158d.m45792a(e);
        }
    }

    /* renamed from: c */
    public final AbstractC24157c<Void> mo40232c(C24636b bVar, Object obj) {
        AbstractC24544ak<Void> b;
        if (!this.f57876j.mo34217b().booleanValue()) {
            return C24158d.m45792a(f57867g);
        }
        try {
            if (this.f57878l.mo34217b().booleanValue()) {
                b = this.f57874h.mo40271b(bVar);
            } else {
                C24432n nVar = this.f57874h;
                AbstractC24544ak<C24117a<AbstractC24454c>> c = nVar.mo40273c(bVar);
                if (nVar.f58037a) {
                    c = nVar.mo40272c(c);
                }
                b = nVar.mo40270b(c);
            }
            return m46512a(b, bVar, C24636b.EnumC24638b.FULL_FETCH, obj, EnumC24362c.MEDIUM);
        } catch (Exception e) {
            return C24158d.m45792a(e);
        }
    }

    /* renamed from: a */
    private AbstractC24462c m46515a(C24636b bVar, AbstractC24462c cVar) {
        if (cVar == null) {
            if (bVar.mRequestListener == null) {
                return this.f57875i;
            }
            return new C24461b(this.f57875i, bVar.mRequestListener);
        } else if (bVar.mRequestListener == null) {
            return new C24461b(this.f57875i, cVar);
        } else {
            return new C24461b(this.f57875i, cVar, bVar.mRequestListener);
        }
    }

    /* renamed from: a */
    public final AbstractC24157c<C24117a<AbstractC24454c>> mo40224a(C24636b bVar, Object obj) {
        return mo40225a(bVar, obj, C24636b.EnumC24638b.FULL_FETCH);
    }

    /* renamed from: a */
    private AbstractC24157c<Void> m46514a(C24636b bVar, Object obj, EnumC24362c cVar) {
        if (!this.f57876j.mo34217b().booleanValue()) {
            return C24158d.m45792a(f57867g);
        }
        try {
            return m46512a(this.f57874h.mo40271b(bVar), bVar, C24636b.EnumC24638b.FULL_FETCH, obj, cVar);
        } catch (Exception e) {
            return C24158d.m45792a(e);
        }
    }

    /* renamed from: a */
    public final AbstractC24157c<C24117a<AbstractC24454c>> mo40225a(C24636b bVar, Object obj, C24636b.EnumC24638b bVar2) {
        return mo40226a(bVar, obj, bVar2, null);
    }

    /* renamed from: a */
    private AbstractC24157c<Void> m46512a(AbstractC24544ak<Void> akVar, C24636b bVar, C24636b.EnumC24638b bVar2, Object obj, EnumC24362c cVar) {
        AbstractC24462c a = m46515a(bVar, (AbstractC24462c) null);
        try {
            return new C24438e(akVar, new C24561au(bVar, m46520e(), a, obj, C24636b.EnumC24638b.getMax(bVar.mLowestPermittedRequestLevel, bVar2), true, false, cVar), a);
        } catch (Exception e) {
            return C24158d.m45792a(e);
        }
    }

    /* renamed from: a */
    private <T> AbstractC24157c<C24117a<T>> m46513a(AbstractC24544ak<C24117a<T>> akVar, C24636b bVar, C24636b.EnumC24638b bVar2, Object obj, AbstractC24462c cVar) {
        boolean z;
        C24644b.m47156a();
        AbstractC24462c a = m46515a(bVar, cVar);
        try {
            C24636b.EnumC24638b max = C24636b.EnumC24638b.getMax(bVar.mLowestPermittedRequestLevel, bVar2);
            String e = m46520e();
            if (!bVar.mProgressiveRenderingEnabled) {
                if (C24134g.m45737b(bVar.mSourceUri)) {
                    z = false;
                    C24561au auVar = new C24561au(bVar, e, a, obj, max, false, z, bVar.mRequestPriority);
                    C24644b.m47156a();
                    C24437d dVar = new C24437d(akVar, auVar, a);
                    C24644b.m47156a();
                    return dVar;
                }
            }
            z = true;
            C24561au auVar2 = new C24561au(bVar, e, a, obj, max, false, z, bVar.mRequestPriority);
            C24644b.m47156a();
            C24437d dVar2 = new C24437d(akVar, auVar2, a);
            C24644b.m47156a();
            return dVar2;
        } catch (Exception e2) {
            return C24158d.m45792a(e2);
        } finally {
            C24644b.m47156a();
        }
    }

    public C24413h(C24432n nVar, Set<AbstractC24462c> set, AbstractC24093k<Boolean> kVar, AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar, AbstractC24397p<AbstractC24026e, AbstractC24111h> pVar2, C24373e eVar, C24373e eVar2, AbstractC24380f fVar, C24573az azVar, AbstractC24093k<Boolean> kVar2, AbstractC24093k<Boolean> kVar3) {
        this.f57874h = nVar;
        this.f57875i = new C24461b(set);
        this.f57876j = kVar;
        this.f57868a = pVar;
        this.f57877k = pVar2;
        this.f57869b = eVar;
        this.f57870c = eVar2;
        this.f57871d = fVar;
        this.f57872e = azVar;
        this.f57878l = kVar2;
        this.f57873f = kVar3;
    }
}
