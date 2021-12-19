package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ies.d.a.v */
public final class C17136v {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f40747a = {new C89232y(C89204ab.m154669a(C17136v.class), "configMap", "getConfigMap()Ljava/util/concurrent/ConcurrentHashMap;"), new C89232y(C89204ab.m154669a(C17136v.class), "cacheMap", "getCacheMap()Ljava/util/concurrent/ConcurrentHashMap;")};

    /* renamed from: b */
    static final AbstractC89244h f40748b = C89250i.m154773a((AbstractC89171a) C17137a.f40751a);

    /* renamed from: c */
    public static final C17136v f40749c = new C17136v();

    /* renamed from: d */
    private static final AbstractC89244h f40750d = C89250i.m154773a((AbstractC89171a) C17138b.f40752a);

    /* renamed from: a */
    static ConcurrentHashMap<String, ArrayList<C17090ac>> m31660a() {
        return (ConcurrentHashMap) f40750d.getValue();
    }

    private C17136v() {
    }

    /* renamed from: com.bytedance.ies.d.a.v$a */
    static final class C17137a extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, C17098ah<String, C17144y>>> {

        /* renamed from: a */
        public static final C17137a f40751a = new C17137a();

        static {
            Covode.recordClassIndex(19594);
        }

        C17137a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, C17098ah<String, C17144y>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.bytedance.ies.d.a.v$b */
    static final class C17138b extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, ArrayList<C17090ac>>> {

        /* renamed from: a */
        public static final C17138b f40752a = new C17138b();

        static {
            Covode.recordClassIndex(19595);
        }

        C17138b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, ArrayList<C17090ac>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        Covode.recordClassIndex(19593);
    }
}
