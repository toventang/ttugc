package com.facebook.drawee.p1845a.p1846a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24085e;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.p1845a.p1846a.p1847a.C24169a;
import com.facebook.drawee.p1845a.p1846a.p1848b.AbstractC24175b;
import com.facebook.drawee.p1845a.p1846a.p1848b.AbstractC24179f;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24171a;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24176c;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24177d;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24180g;
import com.facebook.drawee.p1845a.p1846a.p1848b.C24181h;
import com.facebook.drawee.p1850b.C24189a;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1852d.C24207a;
import com.facebook.drawee.p1852d.p1853a.C24208a;
import com.facebook.drawee.p1854e.C24228p;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1857h.AbstractC24256b;
import com.facebook.drawee.p1857h.AbstractC24257c;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1883h.AbstractC24450a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1886k.C24461b;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1860f.p1861a.AbstractC24269a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.a.a.d */
public class C24184d extends AbstractC24195a<C24117a<AbstractC24454c>, AbstractC24457f> {

    /* renamed from: q */
    private static final Class<?> f57227q = C24184d.class;

    /* renamed from: a */
    public final Resources f57228a;

    /* renamed from: b */
    public AbstractC24026e f57229b;

    /* renamed from: c */
    public AbstractC24093k<AbstractC24157c<C24117a<AbstractC24454c>>> f57230c;

    /* renamed from: d */
    public boolean f57231d;

    /* renamed from: e */
    public C24085e<AbstractC24450a> f57232e;

    /* renamed from: r */
    private final AbstractC24450a f57233r;

    /* renamed from: s */
    private final C24085e<AbstractC24450a> f57234s;

    /* renamed from: t */
    private final AbstractC24397p<AbstractC24026e, AbstractC24454c> f57235t;

    /* renamed from: u */
    private C24180g f57236u;

    /* renamed from: v */
    private Set<AbstractC24462c> f57237v;

    /* renamed from: w */
    private AbstractC24175b f57238w;

    /* renamed from: x */
    private C24169a f57239x;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    /* renamed from: a */
    public final /* synthetic */ void mo39785a(C24117a<AbstractC24454c> aVar) {
        C24117a.m45712c(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo39782a(AbstractC24179f fVar) {
        MethodCollector.m26663i(7631);
        C24180g gVar = this.f57236u;
        if (gVar != null) {
            if (gVar.f57190b != null) {
                gVar.f57190b.clear();
            }
            gVar.mo39774a(false);
            C24181h hVar = gVar.f57189a;
            hVar.f57200b = null;
            hVar.f57201c = null;
            hVar.f57202d = null;
            hVar.f57203e = null;
            hVar.f57204f = -1;
            hVar.f57206h = -1;
            hVar.f57207i = -1;
            hVar.f57208j = -1;
            hVar.f57209k = -1;
            hVar.f57210l = -1;
            hVar.f57211m = 1;
            hVar.f57212n = false;
            hVar.f57213o = -1;
            hVar.f57214p = -1;
            hVar.f57215q = -1;
            hVar.f57216r = -1;
            hVar.f57217s = -1;
            hVar.f57218t = -1;
        }
        if (fVar != null) {
            if (this.f57236u == null) {
                this.f57236u = new C24180g(AwakeTimeSinceBootClock.get(), this);
            }
            C24180g gVar2 = this.f57236u;
            if (gVar2.f57190b == null) {
                gVar2.f57190b = new LinkedList();
            }
            gVar2.f57190b.add(fVar);
            this.f57236u.mo39774a(true);
        }
        MethodCollector.m26664o(7631);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39786a(String str, C24117a<AbstractC24454c> aVar) {
        MethodCollector.m26663i(7930);
        super.mo39786a(str, aVar);
        synchronized (this) {
            try {
                AbstractC24175b bVar = this.f57238w;
                if (bVar != null) {
                    bVar.mo39769a(str, 5, true);
                }
            } finally {
                MethodCollector.m26664o(7930);
            }
        }
    }

    static {
        Covode.recordClassIndex(28315);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    public String toString() {
        return C24088h.m45610a(this).mo39647a("super", super.toString()).mo39647a("dataSourceSupplier", this.f57230c).toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C24117a<AbstractC24454c> mo39791c() {
        C24644b.m47156a();
        try {
            AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar = this.f57235t;
            if (pVar != null) {
                AbstractC24026e eVar = this.f57229b;
                if (eVar != null) {
                    C24117a<AbstractC24454c> a = pVar.mo40201a(eVar);
                    if (a == null || a.mo39695a().mo40297e().mo40314c()) {
                        C24644b.m47156a();
                        return a;
                    }
                    a.close();
                    C24644b.m47156a();
                    return null;
                }
            }
            return null;
        } finally {
            C24644b.m47156a();
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    /* renamed from: b */
    public final AbstractC24157c<C24117a<AbstractC24454c>> mo39788b() {
        C24644b.m47156a();
        if (C24099a.m45645a(2)) {
            C24099a.m45635a(f57227q, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        AbstractC24157c<C24117a<AbstractC24454c>> b = this.f57230c.mo34217b();
        C24644b.m47156a();
        return b;
    }

    /* renamed from: a */
    public final synchronized AbstractC24462c mo39778a() {
        MethodCollector.m26663i(7636);
        C24176c cVar = null;
        if (this.f57238w != null) {
            cVar = new C24176c(this.f57279k, this.f57238w);
        }
        if (this.f57237v != null) {
            C24461b bVar = new C24461b(this.f57237v);
            if (cVar != null) {
                bVar.f58109a.add(cVar);
            }
            MethodCollector.m26664o(7636);
            return bVar;
        }
        MethodCollector.m26664o(7636);
        return cVar;
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24195a, com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: a */
    public final void mo39783a(AbstractC24256b bVar) {
        super.mo39783a(bVar);
        m45850a((AbstractC24454c) null);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    /* renamed from: a */
    public final void mo39779a(Drawable drawable) {
        if (drawable instanceof AbstractC24269a) {
            ((AbstractC24269a) drawable).mo40040a();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    /* renamed from: c */
    public final /* synthetic */ AbstractC24457f mo39792c(C24117a<AbstractC24454c> aVar) {
        C24117a<AbstractC24454c> aVar2 = aVar;
        C24091i.m45622b(C24117a.m45710a((C24117a<?>) aVar2));
        return aVar2.mo39695a();
    }

    /* renamed from: a */
    public final synchronized void mo39784a(AbstractC24462c cVar) {
        MethodCollector.m26663i(7632);
        if (this.f57237v == null) {
            this.f57237v = new HashSet();
        }
        this.f57237v.add(cVar);
        MethodCollector.m26664o(7632);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24195a
    /* renamed from: b */
    public final /* synthetic */ int mo39787b(C24117a<AbstractC24454c> aVar) {
        C24117a<AbstractC24454c> aVar2 = aVar;
        if (aVar2 == null || !aVar2.mo39700d()) {
            return 0;
        }
        return System.identityHashCode(aVar2.f57049a.mo39702a());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable mo39793d(C24117a<AbstractC24454c> aVar) {
        try {
            C24644b.m47156a();
            C24091i.m45622b(C24117a.m45710a((C24117a<?>) aVar));
            AbstractC24454c a = aVar.mo39695a();
            m45850a(a);
            Drawable a2 = m45848a(this.f57232e, a);
            if (a2 != null) {
                C24644b.m47156a();
                return a2;
            }
            Drawable a3 = m45848a(this.f57234s, a);
            if (a3 != null) {
                C24644b.m47156a();
                return a3;
            }
            Drawable b = this.f57233r.mo39768b(a);
            if (b != null) {
                C24644b.m47156a();
                return b;
            }
            throw new UnsupportedOperationException("Unrecognized image class: ".concat(String.valueOf(a)));
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void mo39789b(AbstractC24175b bVar) {
        MethodCollector.m26663i(7635);
        AbstractC24175b bVar2 = this.f57238w;
        if (bVar2 instanceof C24171a) {
            ((C24171a) bVar2).mo39771b(bVar);
            MethodCollector.m26664o(7635);
        } else if (bVar2 != null) {
            this.f57238w = new C24171a(this.f57238w, bVar);
            MethodCollector.m26664o(7635);
        } else {
            this.f57238w = bVar;
            MethodCollector.m26664o(7635);
        }
    }

    /* renamed from: a */
    private void m45850a(AbstractC24454c cVar) {
        C24228p a;
        if (this.f57231d) {
            if (this.f57278j == null) {
                C24207a aVar = new C24207a();
                C24208a aVar2 = new C24208a(aVar);
                this.f57239x = new C24169a();
                mo39808a((AbstractC24203d) aVar2);
                mo39814b((Drawable) aVar);
            }
            if (this.f57238w == null) {
                mo39781a(this.f57239x);
            }
            if (this.f57278j instanceof C24207a) {
                C24207a aVar3 = (C24207a) this.f57278j;
                aVar3.mo39835a(this.f57279k);
                AbstractC24257c cVar2 = this.f57277i;
                C24229q.AbstractC24231b bVar = null;
                if (!(cVar2 == null || (a = C24229q.m45994a(cVar2.mo39950a())) == null)) {
                    bVar = a.f57445a;
                }
                aVar3.f57322c = bVar;
                aVar3.mo39836b(C24177d.m45832a(this.f57239x.f57156a));
                if (cVar != null) {
                    aVar3.mo39833a(cVar.getWidth(), cVar.getHeight());
                    aVar3.f57320a = cVar.mo40290b();
                    return;
                }
                aVar3.mo39832a();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo39790b(AbstractC24462c cVar) {
        MethodCollector.m26663i(7633);
        Set<AbstractC24462c> set = this.f57237v;
        if (set == null) {
            MethodCollector.m26664o(7633);
            return;
        }
        set.remove(cVar);
        MethodCollector.m26664o(7633);
    }

    /* renamed from: a */
    public final synchronized void mo39781a(AbstractC24175b bVar) {
        MethodCollector.m26663i(7634);
        AbstractC24175b bVar2 = this.f57238w;
        if (bVar2 instanceof C24171a) {
            ((C24171a) bVar2).mo39770a(bVar);
            MethodCollector.m26664o(7634);
        } else if (bVar2 != null) {
            this.f57238w = new C24171a(this.f57238w, bVar);
            MethodCollector.m26664o(7634);
        } else {
            this.f57238w = bVar;
            MethodCollector.m26664o(7634);
        }
    }

    /* renamed from: a */
    private static Drawable m45848a(C24085e<AbstractC24450a> eVar, AbstractC24454c cVar) {
        Drawable b;
        if (eVar == null) {
            return null;
        }
        Iterator<AbstractC24450a> it = eVar.iterator();
        while (it.hasNext()) {
            AbstractC24450a next = it.next();
            if (next.mo39767a(cVar) && (b = next.mo39768b(cVar)) != null) {
                return b;
            }
        }
        return null;
    }

    public C24184d(Resources resources, C24189a aVar, AbstractC24450a aVar2, Executor executor, AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar, C24085e<AbstractC24450a> eVar) {
        super(aVar, executor);
        this.f57228a = resources;
        this.f57233r = new C24168a(resources, aVar2);
        this.f57234s = eVar;
        this.f57235t = pVar;
    }

    /* renamed from: a */
    public final void mo39780a(AbstractC24093k<AbstractC24157c<C24117a<AbstractC24454c>>> kVar, String str, AbstractC24026e eVar, Object obj, C24085e<AbstractC24450a> eVar2, AbstractC24175b bVar) {
        MethodCollector.m26663i(7469);
        C24644b.m47156a();
        super.mo39816b(str, obj);
        this.f57230c = kVar;
        m45850a((AbstractC24454c) null);
        this.f57229b = eVar;
        this.f57232e = eVar2;
        synchronized (this) {
            try {
                this.f57238w = null;
            } catch (Throwable th) {
                MethodCollector.m26664o(7469);
                throw th;
            }
        }
        m45850a((AbstractC24454c) null);
        mo39781a(bVar);
        C24644b.m47156a();
        MethodCollector.m26664o(7469);
    }
}
