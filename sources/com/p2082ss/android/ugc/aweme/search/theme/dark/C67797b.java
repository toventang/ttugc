package com.p2082ss.android.ugc.aweme.search.theme.dark;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.theme.dark.b */
public final class C67797b {

    /* renamed from: a */
    public static final C67797b f151944a = new C67797b();

    /* renamed from: b */
    private static final AbstractC89244h f151945b = C89250i.m154773a((AbstractC89171a) C67798a.f151946a);

    /* renamed from: a */
    static ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AbstractC67459a>> m119978a() {
        return (ConcurrentHashMap) f151945b.getValue();
    }

    private C67797b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.b$a */
    static final class C67798a extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AbstractC67459a>>> {

        /* renamed from: a */
        public static final C67798a f151946a = new C67798a();

        static {
            Covode.recordClassIndex(79451);
        }

        C67798a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AbstractC67459a>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        Covode.recordClassIndex(79450);
    }

    /* renamed from: a */
    public static void m119979a(Integer num, AbstractC67459a aVar) {
        ConcurrentHashMap<Integer, AbstractC67459a> putIfAbsent;
        if (aVar != null) {
            ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, AbstractC67459a>> a = m119978a();
            ConcurrentHashMap<Integer, AbstractC67459a> concurrentHashMap = a.get(num);
            if (concurrentHashMap == null && (putIfAbsent = a.putIfAbsent(num, (concurrentHashMap = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap = putIfAbsent;
            }
            ConcurrentHashMap<Integer, AbstractC67459a> concurrentHashMap2 = concurrentHashMap;
            C89219l.m154716b(concurrentHashMap2, "");
            Integer valueOf = Integer.valueOf(aVar.hashCode());
            if (concurrentHashMap2.get(valueOf) == null) {
                aVar.hashCode();
                m119978a().size();
                concurrentHashMap2.putIfAbsent(valueOf, aVar);
            }
        }
    }
}
