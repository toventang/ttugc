package com.bytedance.ies.bullet.p1129c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16197b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16205f;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16206g;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16207h;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16215n;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r;
import com.bytedance.ies.bullet.p1129c.p1132c.C16157a;
import com.bytedance.ies.bullet.p1129c.p1132c.C16202c;
import com.bytedance.ies.bullet.p1129c.p1132c.C16220p;
import com.bytedance.ies.bullet.p1129c.p1132c.C16233u;
import com.bytedance.ies.bullet.p1129c.p1132c.C16234v;
import com.bytedance.ies.bullet.p1129c.p1132c.C16235w;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16186l;
import com.bytedance.ies.bullet.p1129c.p1135d.AbstractC16243b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16659b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1174a.C16720b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.a */
public final class C16139a implements AbstractC16239d, AbstractC16576j {

    /* renamed from: a */
    public Map<String, Object> f38829a;

    /* renamed from: b */
    public Object f38830b;

    /* renamed from: c */
    public final C16248b f38831c;

    /* renamed from: d */
    public final C16148a f38832d;

    /* renamed from: e */
    public final AbstractC16243b f38833e;

    /* renamed from: f */
    public final List<AbstractC16203d<?, ?, ?, ?>> f38834f;

    /* renamed from: g */
    public final Map<Class<AbstractC16203d<?, ?, ?, ?>>, AbstractC16207h<?>> f38835g;

    /* renamed from: h */
    public final AbstractC16255g f38836h;

    /* renamed from: i */
    public final Map<String, AbstractC16255g> f38837i;

    /* renamed from: j */
    public final AbstractC16205f f38838j;

    /* renamed from: k */
    public final List<C16233u> f38839k;

    /* renamed from: l */
    private final AbstractC89244h f38840l;

    /* renamed from: m */
    private final Set<AbstractC16212k> f38841m;

    static {
        Covode.recordClassIndex(18432);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.f38840l.getValue();
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d
    /* renamed from: b */
    public final C16248b mo25688b() {
        return this.f38831c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final AbstractC16208i mo25683a(String str) {
        C89219l.m154719c(str, "");
        Iterator<T> it = this.f38841m.iterator();
        while (it.hasNext()) {
            AbstractC16208i a = it.next().mo25683a(str);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d
    /* renamed from: a */
    public final void mo25686a(AbstractC16215n nVar, C16238z zVar, Uri uri, List<String> list, C16248b bVar, AbstractC89187q<? super AbstractC16208i, ? super Uri, ? super Boolean, C89391z> qVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(qVar, "");
        C89219l.m154719c(bVar2, "");
        m29976c();
        if (!this.f38839k.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f38839k) {
                m29974a(t, new C16147g(t, this, arrayList));
            }
            this.f38839k.removeAll(arrayList);
        }
        if (this.f38834f.size() == 0) {
            bVar2.invoke(new IllegalStateException("No kitApi found for uri ".concat(String.valueOf(uri))));
        } else {
            m29975b(nVar, zVar, uri, list, bVar, qVar, bVar2);
        }
    }

    /* renamed from: a */
    public final void mo25687a(Throwable th, Uri uri, C16248b bVar, AbstractC16215n nVar, C16238z zVar, List<String> list, AbstractC89187q<? super AbstractC16208i, ? super Uri, ? super Boolean, C89391z> qVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C16257i iVar = (C16257i) bVar.mo25832c(C16257i.class);
        if (iVar != null) {
            iVar.f39055h = th.getMessage();
        }
        Uri a = m29969a(uri, bVar);
        if (a != null) {
            AbstractC16576j.C16578b.m30778a(this, "Fallback now, from " + uri + " to " + a, null, null, 6);
            m29972a(uri, a, bVar, th.toString());
            if (bVar.mo25832c(AbstractC16197b.class) != null) {
                AbstractC16197b.m30079a(uri, a);
            }
            m29975b(nVar, zVar, a, list, bVar, qVar, bVar2);
            return;
        }
        bVar2.invoke(th);
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d
    /* renamed from: a */
    public final List<AbstractC16203d<?, ?, ?, ?>> mo25684a() {
        return C89070n.m154590j(this.f38834f);
    }

    /* renamed from: com.bytedance.ies.bullet.c.a$f */
    static final class C16146f extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C16139a f38887a;

        static {
            Covode.recordClassIndex(18439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16146f(C16139a aVar) {
            super(0);
            this.f38887a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) this.f38887a.f38831c.mo25832c(AbstractC16652m.class), "Core");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.a$a */
    public static final class C16140a {

        /* renamed from: a */
        public C16248b f38842a = new C16248b();

        /* renamed from: b */
        public C16148a f38843b;

        /* renamed from: c */
        public final Map<Class<AbstractC16203d<?, ?, ?, ?>>, AbstractC16207h<?>> f38844c = new LinkedHashMap();

        /* renamed from: d */
        public AbstractC16205f f38845d;

        /* renamed from: e */
        public final List<C16233u> f38846e = new ArrayList();

        /* renamed from: f */
        private AbstractC16243b f38847f;

        /* renamed from: g */
        private final List<AbstractC16203d<?, ?, ?, ?>> f38848g = new ArrayList();

        /* renamed from: h */
        private AbstractC16255g f38849h;

        /* renamed from: i */
        private final Map<String, AbstractC16255g> f38850i = new LinkedHashMap();

        static {
            Covode.recordClassIndex(18433);
        }

        /* renamed from: a */
        public final C16139a mo25696a() {
            return new C16139a(this.f38842a, this.f38843b, this.f38847f, this.f38848g, this.f38844c, this.f38849h, this.f38850i, this.f38845d, this.f38846e, (byte) 0);
        }

        /* renamed from: a */
        public final C16140a mo25694a(AbstractC16255g gVar) {
            C89219l.m154719c(gVar, "");
            this.f38849h = gVar;
            return this;
        }

        /* renamed from: a */
        public final <U extends AbstractC16214m, V extends AbstractC16204e, W extends AbstractC16208i, X extends AbstractC16206g> C16140a mo25693a(AbstractC16203d<U, V, W, X> dVar) {
            C89219l.m154719c(dVar, "");
            this.f38848g.add(dVar);
            return this;
        }

        /* renamed from: a */
        public final C16140a mo25695a(String str, AbstractC16255g gVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(gVar, "");
            this.f38850i.put(str, gVar);
            return this;
        }
    }

    /* renamed from: c */
    private final void m29976c() {
        AbstractC16205f fVar = this.f38838j;
        if (fVar != null && !fVar.mo25760b()) {
            this.f38838j.mo25758a();
        }
        AbstractC16205f fVar2 = this.f38838j;
        if (fVar2 != null) {
            Iterator<T> it = this.f38839k.iterator();
            while (it.hasNext()) {
                fVar2.mo25759a(it.next().f39025a);
                fVar2.mo25758a();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d
    /* renamed from: a */
    public final void mo25685a(AbstractC16212k kVar) {
        C89219l.m154719c(kVar, "");
        this.f38841m.add(kVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d
    /* renamed from: b */
    public final void mo25689b(AbstractC16212k kVar) {
        C89219l.m154719c(kVar, "");
        this.f38841m.remove(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.a$c */
    public static final class C16142c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16208i f38860a;

        /* renamed from: b */
        final /* synthetic */ C16139a f38861b;

        /* renamed from: c */
        final /* synthetic */ C16235w f38862c;

        /* renamed from: d */
        final /* synthetic */ boolean f38863d;

        /* renamed from: e */
        final /* synthetic */ AbstractC16215n f38864e;

        /* renamed from: f */
        final /* synthetic */ AbstractC16203d f38865f;

        /* renamed from: g */
        final /* synthetic */ List f38866g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f38867h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f38868i;

        static {
            Covode.recordClassIndex(18435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16142c(AbstractC16208i iVar, C16139a aVar, C16235w wVar, boolean z, AbstractC16215n nVar, AbstractC16203d dVar, List list, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f38860a = iVar;
            this.f38861b = aVar;
            this.f38862c = wVar;
            this.f38863d = z;
            this.f38864e = nVar;
            this.f38865f = dVar;
            this.f38866g = list;
            this.f38867h = bVar;
            this.f38868i = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f38860a.mo25766a(th2);
            this.f38868i.invoke(th2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.a$e */
    public static final class C16145e extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16139a f38879a;

        /* renamed from: b */
        final /* synthetic */ Uri f38880b;

        /* renamed from: c */
        final /* synthetic */ C16248b f38881c;

        /* renamed from: d */
        final /* synthetic */ AbstractC16215n f38882d;

        /* renamed from: e */
        final /* synthetic */ C16238z f38883e;

        /* renamed from: f */
        final /* synthetic */ List f38884f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89187q f38885g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f38886h;

        static {
            Covode.recordClassIndex(18438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16145e(C16139a aVar, Uri uri, C16248b bVar, AbstractC16215n nVar, C16238z zVar, List list, AbstractC89187q qVar, AbstractC89172b bVar2) {
            super(1);
            this.f38879a = aVar;
            this.f38880b = uri;
            this.f38881c = bVar;
            this.f38882d = nVar;
            this.f38883e = zVar;
            this.f38884f = list;
            this.f38885g = qVar;
            this.f38886h = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            this.f38879a.mo25687a(th2, this.f38880b, this.f38881c, this.f38882d, this.f38883e, this.f38884f, this.f38885g, this.f38886h);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.a$d */
    public static final class C16143d extends AbstractC89220m implements AbstractC89172b<C16235w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16139a f38869a;

        /* renamed from: b */
        final /* synthetic */ Uri f38870b;

        /* renamed from: c */
        final /* synthetic */ C16248b f38871c;

        /* renamed from: d */
        final /* synthetic */ AbstractC16215n f38872d;

        /* renamed from: e */
        final /* synthetic */ C16238z f38873e;

        /* renamed from: f */
        final /* synthetic */ List f38874f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89187q f38875g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f38876h;

        static {
            Covode.recordClassIndex(18436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16143d(C16139a aVar, Uri uri, C16248b bVar, AbstractC16215n nVar, C16238z zVar, List list, AbstractC89187q qVar, AbstractC89172b bVar2) {
            super(1);
            this.f38869a = aVar;
            this.f38870b = uri;
            this.f38871c = bVar;
            this.f38872d = nVar;
            this.f38873e = zVar;
            this.f38874f = list;
            this.f38875g = qVar;
            this.f38876h = bVar2;
        }

        /* renamed from: com.bytedance.ies.bullet.c.a$d$a */
        static final class C16144a extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C16143d f38877a;

            /* renamed from: b */
            final /* synthetic */ C16235w f38878b;

            static {
                Covode.recordClassIndex(18437);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16144a(C16143d dVar, C16235w wVar) {
                super(1);
                this.f38877a = dVar;
                this.f38878b = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Throwable th) {
                Throwable th2 = th;
                C16139a aVar = this.f38877a.f38869a;
                if (th2 == null) {
                    th2 = new Throwable("Bullet load failed!");
                }
                aVar.mo25687a(th2, this.f38877a.f38870b, this.f38877a.f38871c, this.f38877a.f38872d, this.f38877a.f38873e, this.f38877a.f38874f, this.f38877a.f38875g, this.f38877a.f38876h);
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16235w wVar) {
            AbstractC16222r rVar;
            C16235w wVar2 = wVar;
            C89219l.m154719c(wVar2, "");
            C16234v vVar = (C16234v) wVar2.f39032b.mo25832c(C16234v.class);
            if (vVar != null) {
                AbstractC16208i iVar = vVar.f39029a;
                if (!(!(iVar instanceof AbstractC16222r) || iVar == null || (rVar = (AbstractC16222r) iVar) == null)) {
                    C16144a aVar = new C16144a(this, wVar2);
                    C89219l.m154719c(aVar, "");
                    rVar.f38990e.add(aVar);
                }
                this.f38875g.invoke(vVar.f39029a, wVar2.f39031a, Boolean.valueOf(vVar.f39030b));
            } else {
                this.f38876h.invoke(new IllegalStateException("No result resolved for uri " + this.f38870b));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.a$b */
    public static final class C16141b extends AbstractC89220m implements AbstractC89172b<Uri, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16208i f38851a;

        /* renamed from: b */
        final /* synthetic */ C16139a f38852b;

        /* renamed from: c */
        final /* synthetic */ C16235w f38853c;

        /* renamed from: d */
        final /* synthetic */ boolean f38854d;

        /* renamed from: e */
        final /* synthetic */ AbstractC16215n f38855e;

        /* renamed from: f */
        final /* synthetic */ AbstractC16203d f38856f;

        /* renamed from: g */
        final /* synthetic */ List f38857g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f38858h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f38859i;

        static {
            Covode.recordClassIndex(18434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16141b(AbstractC16208i iVar, C16139a aVar, C16235w wVar, boolean z, AbstractC16215n nVar, AbstractC16203d dVar, List list, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f38851a = iVar;
            this.f38852b = aVar;
            this.f38853c = wVar;
            this.f38854d = z;
            this.f38855e = nVar;
            this.f38856f = dVar;
            this.f38857g = list;
            this.f38858h = bVar;
            this.f38859i = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Uri uri) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            C16248b bVar = this.f38853c.f39032b;
            bVar.mo25828a(C16234v.class, new C16234v(this.f38851a, this.f38854d));
            this.f38858h.invoke(new C16235w(uri2, bVar));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d
    /* renamed from: a */
    public final AbstractC16203d<?, ?, ?, ?> mo25681a(EnumC16723b bVar) {
        T t;
        C89219l.m154719c(bVar, "");
        Iterator<T> it = mo25684a().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.mo25707a() == bVar) {
                break;
            }
        }
        return t;
    }

    /* renamed from: com.bytedance.ies.bullet.c.a$g */
    static final class C16147g extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16233u f38888a;

        /* renamed from: b */
        final /* synthetic */ C16139a f38889b;

        /* renamed from: c */
        final /* synthetic */ List f38890c;

        static {
            Covode.recordClassIndex(18440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16147g(C16233u uVar, C16139a aVar, List list) {
            super(1);
            this.f38888a = uVar;
            this.f38889b = aVar;
            this.f38890c = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            if (num.intValue() == 1) {
                AbstractC16576j.C16578b.m30778a(this.f38889b, "load dynamic feature [" + this.f38888a.f39025a + "] success with [" + this.f38888a.f39028d + ']', null, null, 6);
                this.f38890c.add(this.f38888a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static EnumC16723b m29971a(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            switch (scheme.hashCode()) {
                case -1772600516:
                    if (scheme.equals("lynxview")) {
                        return EnumC16723b.LYNX;
                    }
                    break;
                case 3213448:
                    if (scheme.equals("http")) {
                        return EnumC16723b.WEB;
                    }
                    break;
                case 99617003:
                    if (scheme.equals("https")) {
                        return EnumC16723b.WEB;
                    }
                    break;
                case 828638245:
                    if (scheme.equals("react-native")) {
                        return EnumC16723b.RN;
                    }
                    break;
            }
        }
        return EnumC16723b.NONE;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> AbstractC16208i mo25682a(Class<? extends T> cls) {
        C89219l.m154719c(cls, "");
        Iterator<T> it = this.f38841m.iterator();
        while (it.hasNext()) {
            AbstractC16208i a = it.next().mo25682a(cls);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    /* renamed from: a */
    private static Uri m29969a(Uri uri, C16248b bVar) {
        boolean z;
        EnumC16723b bVar2;
        AbstractC16208i iVar;
        if (m29971a(uri) != EnumC16723b.WEB) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C16778c cVar = new C16778c();
            cVar.mo26572a(Uri.class, uri, null);
            Uri b = cVar.f39997P.mo26550b();
            if (b != null) {
                if (bVar == null || (iVar = (AbstractC16208i) bVar.mo25832c(AbstractC16208i.class)) == null || (bVar2 = iVar.mo25769b()) == null) {
                    bVar2 = EnumC16723b.NONE;
                }
                Uri.Builder buildUpon = b.buildUpon();
                C89219l.m154709a((Object) buildUpon, "");
                C16720b bVar3 = new C16720b(buildUpon);
                Uri build = uri.buildUpon().clearQuery().build();
                C89219l.m154709a((Object) build, "");
                return bVar3.mo26544a(build).mo26545a(bVar2).mo26658b().build();
            }
        }
        return null;
    }

    /* renamed from: a */
    private final AbstractC16253f m29970a(AbstractC16203d<?, ?, ?, ?> dVar, List<String> list) {
        AbstractC16186l lVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AbstractC16255g gVar = this.f38836h;
        AbstractC16213l lVar2 = null;
        if (gVar != null) {
            lVar2 = gVar.mo25841a(dVar.getClass());
            lVar = gVar.mo25840a();
            arrayList3.add(gVar.mo25843b());
        } else {
            lVar = null;
        }
        ArrayList<AbstractC16255g> arrayList4 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList4.add(this.f38837i.get(it.next()));
        }
        for (AbstractC16255g gVar2 : arrayList4) {
            if (gVar2 != null) {
                AbstractC16213l a = gVar2.mo25841a(dVar.getClass());
                if (a != null) {
                    arrayList.add(a);
                }
                arrayList2.add(gVar2.mo25840a());
                arrayList3.add(gVar2.mo25843b());
            }
        }
        if (dVar != null) {
            return new C16256h(dVar, lVar2, arrayList, lVar, arrayList2, arrayList3);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: java.util.Map<java.lang.Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, com.bytedance.ies.bullet.c.c.h<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m29974a(C16233u uVar, AbstractC89172b<? super Integer, C89391z> bVar) {
        T t;
        T t2;
        AbstractC16203d<AbstractC16214m, AbstractC16204e, AbstractC16208i, AbstractC16206g> a;
        AbstractC16207h<AbstractC16206g> b;
        EnumC16723b bVar2 = uVar.f39025a;
        Class<? extends C16157a> cls = uVar.f39026b;
        String str = uVar.f39027c;
        String str2 = uVar.f39028d;
        Iterator<T> it = this.f38834f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.getClass().getName(), (Object) str2)) {
                break;
            }
        }
        Iterator<T> it2 = this.f38834f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (cls.isInstance(t2)) {
                break;
            }
        }
        if (t == null && t2 == null) {
            bVar.invoke(-1);
            return;
        }
        try {
            AbstractC16205f fVar = this.f38838j;
            if (fVar != null) {
                fVar.mo25759a(bVar2);
                if (fVar.mo25760b() && t == null && (a = C16220p.m30143a(str)) != null) {
                    Object obj = this.f38830b;
                    if (!(obj == null || (b = a.mo25710b(obj)) == null)) {
                        a.mo25708a(b.mo25761a(this.f38831c), this.f38831c);
                        Map<Class<AbstractC16203d<?, ?, ?, ?>>, AbstractC16207h<?>> map = this.f38835g;
                        Class<?> cls2 = a.getClass();
                        if (cls2 != null) {
                            map.put(cls2, b);
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                    Map<String, Object> map2 = this.f38829a;
                    if (map2 != null) {
                        for (Map.Entry<String, Object> entry : map2.entrySet()) {
                            AbstractC16213l<AbstractC16214m, AbstractC16204e> a2 = a.mo25706a(entry.getValue());
                            if (a2 != null) {
                                if (C89219l.m154714a((Object) entry.getKey(), (Object) "defaultPackageBundle")) {
                                    AbstractC16255g gVar = this.f38836h;
                                    if (gVar != null) {
                                        gVar.mo25842a(a.getClass(), a2);
                                    }
                                } else {
                                    AbstractC16255g gVar2 = this.f38837i.get(entry.getKey());
                                    if (gVar2 != null) {
                                        gVar2.mo25842a(a.getClass(), a2);
                                    }
                                }
                            }
                        }
                    }
                    if (t2 != null) {
                        this.f38834f.remove(t2);
                    }
                    this.f38834f.add(0, a);
                    bVar.invoke(1);
                }
            }
        } catch (Throwable th) {
            AbstractC16576j.C16578b.m30778a(this, "replaceMockToRnKitApi failed, error: " + th.getMessage(), null, null, 6);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    /* renamed from: a */
    private static void m29972a(Uri uri, Uri uri2, C16248b bVar, String str) {
        C16257i iVar;
        if (bVar != null && (iVar = (C16257i) bVar.mo25832c(C16257i.class)) != null) {
            C16202c cVar = new C16202c();
            cVar.f38975a = uri;
            cVar.f38976b = uri2;
            cVar.f38977c = str;
            iVar.f39050c = cVar;
        }
    }

    /* renamed from: b */
    private final void m29975b(AbstractC16215n nVar, C16238z zVar, Uri uri, List<String> list, C16248b bVar, AbstractC89187q<? super AbstractC16208i, ? super Uri, ? super Boolean, C89391z> qVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        EnumC16723b a = m29971a(uri);
        if (a == EnumC16723b.NONE) {
            bVar2.invoke(new IllegalStateException("No kitApi matches the uri ".concat(String.valueOf(uri))));
            return;
        }
        AbstractC16203d<?, ?, ?, ?> a2 = mo25681a(a);
        if (a2 != null && !(a2 instanceof C16157a)) {
            AbstractC16576j.C16578b.m30778a(this, "Found KitType(" + a + ") and KitApi(" + a2 + ") for the uri " + uri, null, null, 6);
            bVar.mo25825a(this.f38831c);
            m29973a(nVar, a2, zVar, list, new C16235w(uri, bVar), new C16143d(this, uri, bVar, nVar, zVar, list, qVar, bVar2), new C16145e(this, uri, bVar, nVar, zVar, list, qVar, bVar2));
        } else if (C16151b.f38897a[a.ordinal()] != 1) {
            mo25687a(new Throwable("KitType " + a + " is disable for the uri " + uri), uri, bVar, nVar, zVar, list, qVar, bVar2);
        } else {
            bVar2.invoke(new IllegalStateException("KitType " + a + " not found for the uri " + uri));
        }
    }

    /* renamed from: a */
    private final void m29973a(AbstractC16215n nVar, AbstractC16203d<?, ?, ?, ?> dVar, C16238z zVar, List<String> list, C16235w wVar, AbstractC89172b<? super C16235w, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        boolean z;
        AbstractC16222r rVar;
        AbstractC16584o oVar;
        String queryParameter;
        AbstractC16208i a = nVar.mo25682a(dVar.getClass());
        if (!dVar.mo25714e() && a != null && a.mo25773h() && !a.mo25773h()) {
            z = false;
        } else {
            z = true;
        }
        AbstractC16576j.C16578b.m30778a(this, "create new instance api, isNewInstance: ".concat(String.valueOf(z)), null, null, 6);
        if (z) {
            C16248b bVar3 = wVar.f39032b;
            AbstractC16253f a2 = m29970a(dVar, list);
            if (dVar != null) {
                a = dVar.mo25705a(zVar, list, a2, bVar3);
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        if (a != null) {
            if ((a instanceof AbstractC16584o) && (oVar = (AbstractC16584o) a) != null) {
                Uri uri = wVar.f39031a;
                if (uri.isHierarchical() && (queryParameter = uri.getQueryParameter("prefix")) != null && (!TextUtils.isEmpty(queryParameter))) {
                    AbstractC16582m g = oVar.mo25792g();
                    C89219l.m154709a((Object) queryParameter, "");
                    g.mo26326a(C16659b.class, new C16659b(queryParameter));
                }
            }
            if (z) {
                nVar.mo25721a();
                nVar.mo25788a(dVar.getClass(), a);
                if (dVar != null) {
                    dVar.mo25709a((Object) a);
                    a.mo25774i();
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                a.mo25770c().mo25825a(wVar.f39032b);
                if ((a instanceof AbstractC16222r) && (rVar = (AbstractC16222r) a) != null) {
                    rVar.f38990e.clear();
                }
                if (!C89219l.m154714a(a.mo25771d(), list)) {
                    a.mo25767a(list, m29970a(dVar, list));
                }
            }
            a.mo25764a(wVar.f39031a, new C16141b(a, this, wVar, z, nVar, dVar, list, bVar, bVar2), new C16142c(a, this, wVar, z, nVar, dVar, list, bVar, bVar2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.Map<java.lang.String, ? extends com.bytedance.ies.bullet.c.g> */
    /* JADX WARN: Multi-variable type inference failed */
    private C16139a(C16248b bVar, C16148a aVar, AbstractC16243b bVar2, List<AbstractC16203d<?, ?, ?, ?>> list, Map<Class<AbstractC16203d<?, ?, ?, ?>>, AbstractC16207h<?>> map, AbstractC16255g gVar, Map<String, ? extends AbstractC16255g> map2, AbstractC16205f fVar, List<C16233u> list2) {
        String str;
        this.f38831c = bVar;
        this.f38832d = aVar;
        this.f38833e = bVar2;
        this.f38834f = list;
        this.f38835g = map;
        this.f38836h = gVar;
        this.f38837i = map2;
        this.f38838j = fVar;
        this.f38839k = list2;
        bVar.mo25828a(AbstractC16239d.class, this);
        bVar.mo25828a(C16148a.class, aVar);
        bVar.mo25828a(AbstractC16243b.class, bVar2);
        AbstractC16568c a = C16622e.C16623a.m30858a().mo26347a((aVar == null || (str = aVar.f38891a) == null) ? "default_bid" : str, AbstractC16652m.class);
        if (a != null) {
            bVar.mo25831b(AbstractC16652m.class, a);
        }
        m29976c();
        for (T t : list) {
            if (t != null) {
                try {
                    AbstractC16207h<?> hVar = this.f38835g.get(t.getClass());
                    t.mo25708a(hVar != null ? hVar.mo25761a(this.f38831c) : null, this.f38831c);
                } catch (Throwable th) {
                    AbstractC16576j.C16578b.m30778a(this, "RNKit Error: " + th.getMessage(), null, null, 6);
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        this.f38840l = C89250i.m154773a((AbstractC89171a) new C16146f(this));
        this.f38841m = new LinkedHashSet();
    }

    public /* synthetic */ C16139a(C16248b bVar, C16148a aVar, AbstractC16243b bVar2, List list, Map map, AbstractC16255g gVar, Map map2, AbstractC16205f fVar, List list2, byte b) {
        this(bVar, aVar, bVar2, list, map, gVar, map2, fVar, list2);
    }
}
