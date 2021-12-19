package com.facebook.drawee.p1845a.p1846a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24085e;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.p1848b.AbstractC24175b;
import com.facebook.drawee.p1845a.p1846a.p1848b.AbstractC24179f;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1844d.AbstractC24157c;
import java.util.Set;

/* renamed from: com.facebook.drawee.a.a.e */
public class C24185e extends AbstractC24198b<C24185e, C24636b, C24117a<AbstractC24454c>, AbstractC24457f> {

    /* renamed from: n */
    private final C24413h f57240n;

    /* renamed from: o */
    private final C24188g f57241o;

    /* renamed from: p */
    private C24085e<AbstractC24450a> f57242p;

    /* renamed from: q */
    private AbstractC24175b f57243q;

    /* renamed from: r */
    private AbstractC24179f f57244r;

    static {
        Covode.recordClassIndex(28316);
    }

    /* renamed from: com.facebook.drawee.a.a.e$1 */
    static /* synthetic */ class C241861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57245a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 28317(0x6e9d, float:3.968E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.drawee.c.b$a[] r0 = com.facebook.drawee.p1851c.AbstractC24198b.EnumC24201a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.drawee.p1845a.p1846a.C24185e.C241861.f57245a = r2
                com.facebook.drawee.c.b$a r0 = com.facebook.drawee.p1851c.AbstractC24198b.EnumC24201a.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.drawee.p1845a.p1846a.C24185e.C241861.f57245a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.drawee.c.b$a r0 = com.facebook.drawee.p1851c.AbstractC24198b.EnumC24201a.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.drawee.p1845a.p1846a.C24185e.C241861.f57245a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.drawee.c.b$a r0 = com.facebook.drawee.p1851c.AbstractC24198b.EnumC24201a.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p1845a.p1846a.C24185e.C241861.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C24184d mo39798a() {
        C24184d dVar;
        C24644b.m47156a();
        try {
            AbstractC24255a aVar = this.f57309m;
            String d = m45918d();
            if (aVar instanceof C24184d) {
                dVar = (C24184d) aVar;
            } else {
                C24188g gVar = this.f57241o;
                dVar = new C24184d(gVar.f57250a, gVar.f57251b, gVar.f57252c, gVar.f57253d, gVar.f57254e, gVar.f57255f);
                if (gVar.f57256g != null) {
                    dVar.f57231d = gVar.f57256g.mo34217b().booleanValue();
                }
            }
            AbstractC24093k<AbstractC24157c<C24117a<AbstractC24454c>>> a = mo39822a(dVar, d);
            REQUEST request = this.f57299c;
            AbstractC24380f fVar = this.f57240n.f57871d;
            AbstractC24026e eVar = null;
            if (!(fVar == null || request == null)) {
                eVar = request.mPostprocessor != null ? fVar.mo40190b(request, this.f57298b) : fVar.mo40188a(request, this.f57298b);
            }
            dVar.mo39780a(a, d, eVar, this.f57298b, this.f57242p, this.f57243q);
            dVar.mo39782a(this.f57244r);
            return dVar;
        } finally {
            C24644b.m47156a();
        }
    }

    /* renamed from: a */
    public final C24185e mo39799b(Uri uri) {
        if (uri == null) {
            this.f57299c = null;
            return this;
        }
        C24639c a = C24639c.m47149a(uri);
        a.f58554e = C24364e.f57785d;
        this.f57299c = (REQUEST) a.mo40483a();
        return this;
    }

    /* renamed from: a */
    public final C24185e mo39797a(String str) {
        if (str != null && !str.isEmpty()) {
            return mo39799b(Uri.parse(str));
        }
        this.f57299c = (REQUEST) C24636b.fromUri(str);
        return this;
    }

    public C24185e(Context context, C24188g gVar, C24413h hVar, Set<AbstractC24203d> set) {
        super(context, set);
        this.f57240n = hVar;
        this.f57241o = gVar;
    }

    /* Return type fixed from 'com.facebook.d.c' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.drawee.h.a, java.lang.Object, java.lang.Object, com.facebook.drawee.c.b$a] */
    @Override // com.facebook.drawee.p1851c.AbstractC24198b
    /* renamed from: a */
    public final /* synthetic */ AbstractC24157c<C24117a<AbstractC24454c>> mo39795a(AbstractC24255a aVar, C24636b bVar, Object obj, AbstractC24198b.EnumC24201a aVar2) {
        C24636b.EnumC24638b bVar2;
        AbstractC24462c cVar;
        C24636b bVar3 = bVar;
        C24413h hVar = this.f57240n;
        int i = C241861.f57245a[aVar2.ordinal()];
        if (i == 1) {
            bVar2 = C24636b.EnumC24638b.FULL_FETCH;
        } else if (i == 2) {
            bVar2 = C24636b.EnumC24638b.DISK_CACHE;
        } else if (i == 3) {
            bVar2 = C24636b.EnumC24638b.BITMAP_MEMORY_CACHE;
        } else {
            throw new RuntimeException("Cache level" + aVar2 + "is not supported. ");
        }
        if (aVar instanceof C24184d) {
            cVar = ((C24184d) aVar).mo39778a();
        } else {
            cVar = null;
        }
        return hVar.mo40226a(bVar3, obj, bVar2, cVar);
    }
}
