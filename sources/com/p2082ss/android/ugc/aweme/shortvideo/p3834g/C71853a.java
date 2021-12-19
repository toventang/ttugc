package com.p2082ss.android.ugc.aweme.shortvideo.p3834g;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.g.a */
public final class C71853a {

    /* renamed from: a */
    public static final AbstractC89244h f161027a = C89250i.m154773a((AbstractC89171a) C71855b.f161030a);

    /* renamed from: b */
    public static final C71854a f161028b = new C71854a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f161029c = C89250i.m154773a((AbstractC89171a) C71856c.f161031a);

    /* renamed from: a */
    public final Keva mo113500a() {
        return (Keva) this.f161029c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.a$a */
    public static final class C71854a {
        static {
            Covode.recordClassIndex(84403);
        }

        /* renamed from: a */
        public static Map<String, Integer> m126878a() {
            return (Map) C71853a.f161027a.getValue();
        }

        private C71854a() {
        }

        public /* synthetic */ C71854a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.a$b */
    static final class C71855b extends AbstractC89220m implements AbstractC89171a<Map<String, Integer>> {

        /* renamed from: a */
        public static final C71855b f161030a = new C71855b();

        static {
            Covode.recordClassIndex(84404);
        }

        C71855b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.a$c */
    static final class C71856c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C71856c f161031a = new C71856c();

        static {
            Covode.recordClassIndex(84405);
        }

        C71856c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("publish_bubble");
        }
    }

    static {
        Covode.recordClassIndex(84402);
    }

    /* renamed from: a */
    public final int mo113499a(C71857b bVar) {
        C89219l.m154721d(bVar, "");
        if (C71854a.m126878a().get(bVar.f161033a) == null) {
            int i = mo113500a().getInt(bVar.f161033a, 0);
            C71854a.m126878a().put(bVar.f161033a, Integer.valueOf(i));
            return i;
        }
        Integer num = C71854a.m126878a().get(bVar.f161033a);
        if (num != null) {
            return num.intValue();
        }
        return bVar.f161034b;
    }
}
