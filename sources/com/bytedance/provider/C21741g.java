package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21735d;
import com.bytedance.provider.C21733c;
import com.bytedance.provider.impl.C21752c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4621l.C89309k;

/* renamed from: com.bytedance.provider.g */
public class C21741g {

    /* renamed from: d */
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<AbstractC21732b<?>>> f51510d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final C21742a f51511e = new C21742a((byte) 0);

    /* renamed from: a */
    public final Map<C21731a<?>, AbstractC21732b<?>> f51512a = new LinkedHashMap();

    /* renamed from: b */
    public final List<AbstractC21735d> f51513b = new ArrayList();

    /* renamed from: c */
    public AbstractC21735d f51514c = C21752c.f51535b;

    /* renamed from: f */
    private final AbstractC21735d f51515f;

    /* renamed from: com.bytedance.provider.g$a */
    public static final class C21742a {
        static {
            Covode.recordClassIndex(25386);
        }

        private C21742a() {
        }

        public /* synthetic */ C21742a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public AbstractC21735d mo35382a() {
        AbstractC21735d dVar = this.f51514c;
        C89219l.m154719c(dVar, "");
        this.f51514c = C21752c.f51535b;
        return dVar;
    }

    static {
        Covode.recordClassIndex(25385);
    }

    /* renamed from: b */
    public void mo35385b() {
        String str;
        this.f51513b.clear();
        for (Map.Entry<C21731a<?>, AbstractC21732b<?>> entry : this.f51512a.entrySet()) {
            AbstractC21732b<?> value = entry.getValue();
            AbstractC21747h a = value.mo35378a();
            if (a != null) {
                str = a.mo35386a();
            } else {
                str = null;
            }
            m40710a(str, value);
        }
        this.f51512a.clear();
    }

    /* renamed from: com.bytedance.provider.g$b */
    static final class C21743b extends AbstractC89220m implements AbstractC89172b<T, T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21747h f51516a;

        static {
            Covode.recordClassIndex(25387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21743b(AbstractC21747h hVar) {
            super(1);
            this.f51516a = hVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return this.f51516a;
        }
    }

    /* renamed from: com.bytedance.provider.g$c */
    static final class C21744c extends AbstractC89220m implements AbstractC89172b<T, T> {

        /* renamed from: a */
        final /* synthetic */ C21741g f51517a;

        /* renamed from: b */
        final /* synthetic */ AbstractC21747h f51518b;

        /* renamed from: c */
        final /* synthetic */ C21731a f51519c;

        static {
            Covode.recordClassIndex(25388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21744c(C21741g gVar, AbstractC21747h hVar, C21731a aVar) {
            super(1);
            this.f51517a = gVar;
            this.f51518b = hVar;
            this.f51519c = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return this.f51518b;
        }
    }

    public C21741g(AbstractC21735d dVar) {
        C89219l.m154719c(dVar, "");
        this.f51515f = dVar;
    }

    /* renamed from: com.bytedance.provider.g$d */
    static final class C21745d<T> implements AbstractC88433f<T> {

        /* renamed from: a */
        final /* synthetic */ C21733c f51520a;

        /* renamed from: b */
        final /* synthetic */ C21741g f51521b;

        /* renamed from: c */
        final /* synthetic */ AbstractC21747h f51522c;

        /* renamed from: d */
        final /* synthetic */ C21731a f51523d;

        static {
            Covode.recordClassIndex(25389);
        }

        C21745d(C21733c cVar, C21741g gVar, AbstractC21747h hVar, C21731a aVar) {
            this.f51520a = cVar;
            this.f51521b = gVar;
            this.f51522c = hVar;
            this.f51523d = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC21747h hVar = (AbstractC21747h) obj;
            C21741g.m40710a(this.f51520a.f51502b, this.f51520a);
            if (hVar != null) {
                CopyOnWriteArraySet<AbstractC21732b<?>> copyOnWriteArraySet = C21741g.f51510d.get(hVar.mo35386a());
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                }
                copyOnWriteArraySet.add(this.f51520a);
                C21741g.f51510d.put(hVar.mo35386a(), copyOnWriteArraySet);
            }
        }
    }

    /* renamed from: com.bytedance.provider.g$e */
    static final class C21746e extends AbstractC89220m implements AbstractC89172b<AbstractC21735d, AbstractC21735d> {

        /* renamed from: a */
        final /* synthetic */ C21741g f51524a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f51525b;

        /* renamed from: c */
        final /* synthetic */ AbstractC21735d f51526c;

        static {
            Covode.recordClassIndex(25390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21746e(C21741g gVar, C89233z.C89238e eVar, AbstractC21735d dVar) {
            super(1);
            this.f51524a = gVar;
            this.f51525b = eVar;
            this.f51526c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC21735d invoke(AbstractC21735d dVar) {
            AbstractC21735d dVar2 = dVar;
            C89219l.m154719c(dVar2, "");
            T t = (T) dVar2.mo35380a();
            if (!C89219l.m154714a((Object) t, (Object) this.f51524a)) {
                this.f51525b.element = t;
                return this.f51526c.mo35380a().f51514c;
            }
            throw new IllegalStateException(("encounter circular scope attachment : " + this.f51524a + " => " + ((Object) this.f51525b.element) + " => " + this.f51524a).toString());
        }
    }

    /* renamed from: b */
    private static <T extends AbstractC21747h> C21731a<T> m40711b(String str, Class<T> cls) {
        return new C21731a<>(str, cls);
    }

    /* renamed from: a */
    public static void m40710a(String str, AbstractC21732b<?> bVar) {
        if (str != null) {
            ConcurrentHashMap<String, CopyOnWriteArraySet<AbstractC21732b<?>>> concurrentHashMap = f51510d;
            CopyOnWriteArraySet<AbstractC21732b<?>> copyOnWriteArraySet = concurrentHashMap.get(str);
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.remove(bVar);
                if (!copyOnWriteArraySet.isEmpty()) {
                    return;
                }
            }
            concurrentHashMap.remove(str);
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC21747h> AbstractC21732b<T> mo35381a(String str, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        C21731a b = m40711b(str, cls);
        C21741g gVar = this;
        while (!gVar.f51512a.containsKey(b) && (!C89219l.m154714a(gVar, C21752c.C21754b.f51538f))) {
            gVar = gVar.f51514c.mo35380a();
        }
        Object obj = gVar.f51512a.get(b);
        if (!(obj instanceof AbstractC21732b)) {
            obj = null;
        }
        return (AbstractC21732b) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.provider.g */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo35383a(AbstractC21735d dVar, AbstractC21735d.C21736a aVar) {
        C21741g a;
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        AbstractC21735d dVar2 = this.f51514c;
        if (dVar2 != null && (!C89219l.m154714a(dVar2, dVar))) {
            if ((!C89219l.m154714a(dVar2, C21752c.f51535b)) && (a = dVar2.mo35380a()) != null) {
                a.mo35382a();
            }
            this.f51514c = dVar;
            C89219l.m154719c(dVar, "");
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = this;
            C89309k.m154794a(dVar, new C21746e(this, eVar, dVar));
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC21747h> void mo35384a(String str, T t, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(t, "");
        C89219l.m154719c(cls, "");
        C21731a<?> b = m40711b(str, cls);
        AbstractC21732b<?> bVar = this.f51512a.get(b);
        if (!(bVar instanceof AbstractC21732b)) {
            bVar = null;
        }
        AbstractC21732b<?> bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.mo35379a(new C21743b(t));
            return;
        }
        C21733c cVar = new C21733c(t);
        this.f51512a.put(b, cVar);
        cVar.mo35379a(new C21744c(this, t, b));
        C21745d dVar = new C21745d(cVar, this, t, b);
        C89219l.m154719c(dVar, "");
        cVar.f51501a.mo143289d(new C21733c.C21734a(dVar));
    }
}
