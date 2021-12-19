package com.bytedance.ies.xbridge.p1301e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.b */
public final class C18494b {

    /* renamed from: a */
    public static final C18494b f44144a = new C18494b();

    /* renamed from: b */
    private static long f44145b = 300000;

    /* renamed from: c */
    private static final AbstractC89244h f44146c = C89250i.m154773a((AbstractC89171a) C18495a.f44149a);

    /* renamed from: d */
    private static final AbstractC89244h f44147d = C89250i.m154773a((AbstractC89171a) C18496b.f44150a);

    /* renamed from: e */
    private static final AbstractC89244h f44148e = C89250i.m154773a((AbstractC89171a) C18497c.f44151a);

    /* renamed from: a */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<C18512e>> m34414a() {
        return (ConcurrentHashMap) f44147d.getValue();
    }

    /* renamed from: b */
    private static CopyOnWriteArrayList<C18484a> m34420b() {
        return (CopyOnWriteArrayList) f44146c.getValue();
    }

    /* renamed from: c */
    private static ConcurrentHashMap<AbstractC18511d, ConcurrentHashMap<String, C18512e>> m34423c() {
        return (ConcurrentHashMap) f44148e.getValue();
    }

    private C18494b() {
    }

    /* renamed from: com.bytedance.ies.xbridge.e.b$a */
    static final class C18495a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<C18484a>> {

        /* renamed from: a */
        public static final C18495a f44149a = new C18495a();

        static {
            Covode.recordClassIndex(21189);
        }

        C18495a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<C18484a> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.e.b$b */
    static final class C18496b extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, CopyOnWriteArrayList<C18512e>>> {

        /* renamed from: a */
        public static final C18496b f44150a = new C18496b();

        static {
            Covode.recordClassIndex(21190);
        }

        C18496b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, CopyOnWriteArrayList<C18512e>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.e.b$c */
    static final class C18497c extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<AbstractC18511d, ConcurrentHashMap<String, C18512e>>> {

        /* renamed from: a */
        public static final C18497c f44151a = new C18497c();

        static {
            Covode.recordClassIndex(21191);
        }

        C18497c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<AbstractC18511d, ConcurrentHashMap<String, C18512e>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        Covode.recordClassIndex(21188);
    }

    /* renamed from: com.bytedance.ies.xbridge.e.b$d */
    public static final class C18498d implements AbstractC18400b.AbstractC18404d {

        /* renamed from: a */
        final /* synthetic */ AbstractC18511d f44152a;

        static {
            Covode.recordClassIndex(21192);
        }

        C18498d(AbstractC18511d dVar) {
            this.f44152a = dVar;
        }

        @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18404d
        /* renamed from: a */
        public final void mo13406a(String str, AbstractC18754n nVar) {
            C89219l.m154719c(str, "");
            this.f44152a.mo8791a(new C18502c(str, nVar));
        }
    }

    /* renamed from: a */
    public static final void m34415a(C18484a aVar) {
        if (aVar.f44129b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ConcurrentSkipListSet<Object> concurrentSkipListSet = new ConcurrentSkipListSet();
            Iterator<C18484a> it = m34420b().iterator();
            C89219l.m154709a((Object) it, "");
            while (it.hasNext()) {
                C18484a next = it.next();
                if (Math.abs(currentTimeMillis - next.f44130c) > f44145b) {
                    concurrentSkipListSet.add(next);
                }
            }
            for (Object obj : concurrentSkipListSet) {
                m34420b().remove(obj);
            }
            m34420b().add(aVar);
            CopyOnWriteArrayList<C18512e> copyOnWriteArrayList = m34414a().get(aVar.f44129b);
            if (copyOnWriteArrayList != null) {
                Iterator<T> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC18400b.AbstractC18404d dVar = it2.next().f44168c;
                    if (dVar != null) {
                        dVar.mo13406a(aVar.f44129b, aVar.f44131d);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m34417a(String str, AbstractC18511d dVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(dVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        C89219l.m154709a((Object) uuid, "");
        m34418a(str, dVar, currentTimeMillis, uuid);
    }

    /* renamed from: b */
    public static final void m34421b(C18512e eVar, String str) {
        CopyOnWriteArrayList<C18512e> copyOnWriteArrayList;
        if (eVar != null && str != null && (copyOnWriteArrayList = m34414a().get(str)) != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    /* renamed from: b */
    public static final void m34422b(String str, AbstractC18511d dVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(dVar, "");
        ConcurrentHashMap<String, C18512e> concurrentHashMap = m34423c().get(dVar);
        if (concurrentHashMap != null) {
            C18512e eVar = concurrentHashMap.get(str);
            if (eVar != null) {
                m34421b(eVar, str);
                concurrentHashMap.remove(str);
            }
            if (concurrentHashMap.isEmpty()) {
                m34423c().remove(dVar);
            }
        }
    }

    /* renamed from: a */
    public static final void m34416a(C18512e eVar, String str) {
        AbstractC18400b.AbstractC18404d dVar;
        if (str != null) {
            CopyOnWriteArrayList<C18512e> copyOnWriteArrayList = m34414a().get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                m34414a().put(str, copyOnWriteArrayList);
            } else if (copyOnWriteArrayList.contains(eVar)) {
                return;
            }
            copyOnWriteArrayList.add(eVar);
            m34414a().put(str, copyOnWriteArrayList);
            for (T t : m34420b()) {
                if (C89219l.m154714a((Object) t.f44129b, (Object) str) && eVar.f44167b <= t.f44130c && (dVar = eVar.f44168c) != null) {
                    dVar.mo13406a(str, t.f44131d);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m34419a(String str, AbstractC18511d dVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(str2, "");
        m34418a(str, dVar, System.currentTimeMillis(), str2);
    }

    /* renamed from: a */
    private static void m34418a(String str, AbstractC18511d dVar, long j, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(str2, "");
        C18512e eVar = new C18512e(str2, j, new C18498d(dVar), null);
        if (m34423c().get(dVar) == null) {
            m34423c().put(dVar, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, C18512e> concurrentHashMap = m34423c().get(dVar);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, eVar);
        }
        m34416a(eVar, str);
    }
}
