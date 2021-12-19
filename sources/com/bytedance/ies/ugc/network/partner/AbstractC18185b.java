package com.bytedance.ies.ugc.network.partner;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.bytedance.ies.ugc.network.partner.p1276b.C18201g;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.b */
public interface AbstractC18185b {

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$a */
    public interface AbstractC18186a extends AbstractC18185b {
        static {
            Covode.recordClassIndex(20842);
        }

        /* renamed from: a */
        C22099u<?> mo29035a(C18199f fVar, C18182a aVar);

        /* renamed from: b */
        C22099u<?> mo29036b(C18199f fVar, C18182a aVar);
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$b */
    public interface AbstractC18187b extends AbstractC18185b {
        static {
            Covode.recordClassIndex(20843);
        }

        /* renamed from: a */
        void mo29037a(Request request);

        /* renamed from: a */
        void mo29038a(C22099u<?> uVar);

        /* renamed from: a */
        void mo29039a(Throwable th);

        /* renamed from: b */
        void mo29040b(Request request);

        /* renamed from: c */
        void mo29041c(Request request);
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$d */
    public interface AbstractC18189d extends AbstractC18185b {
        static {
            Covode.recordClassIndex(20845);
        }

        /* renamed from: a */
        boolean mo29042a(C18199f fVar, C18182a aVar, Throwable th, boolean z);
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$e */
    public interface AbstractC18190e extends AbstractC18185b {

        /* renamed from: com.bytedance.ies.ugc.network.partner.b$e$a */
        public static final class C18191a {
            static {
                Covode.recordClassIndex(20847);
            }

            /* renamed from: a */
            public static Object m33840a(AbstractC18190e eVar, C18182a aVar) {
                C89219l.m154721d(aVar, "");
                return C18188c.m33835a(eVar, aVar);
            }
        }

        static {
            Covode.recordClassIndex(20846);
        }

        /* renamed from: a */
        void mo29043a(C18199f fVar, C18182a aVar);
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$f */
    public interface AbstractC18192f extends AbstractC18185b {

        /* renamed from: com.bytedance.ies.ugc.network.partner.b$f$a */
        public static final class C18193a {
            static {
                Covode.recordClassIndex(20849);
            }

            /* renamed from: a */
            public static Object m33842a(AbstractC18192f fVar, C18182a aVar) {
                C89219l.m154721d(aVar, "");
                return C18188c.m33835a(fVar, aVar);
            }
        }

        static {
            Covode.recordClassIndex(20848);
        }

        /* renamed from: a */
        void mo29044a(C18201g<?> gVar, C18182a aVar);
    }

    static {
        Covode.recordClassIndex(20841);
    }

    /* renamed from: a */
    String mo29034a();

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$c */
    public static final class C18188c {
        static {
            Covode.recordClassIndex(20844);
        }

        /* renamed from: a */
        public static String m33836a(AbstractC18185b bVar) {
            String simpleName = bVar.getClass().getSimpleName();
            C89219l.m154716b(simpleName, "");
            return simpleName;
        }

        /* renamed from: a */
        public static Object m33835a(AbstractC18185b bVar, C18182a aVar) {
            C89219l.m154721d(aVar, "");
            return aVar.mo29031a(bVar);
        }

        /* renamed from: a */
        public static void m33837a(AbstractC18185b bVar, C18182a aVar, Object obj) {
            C89219l.m154721d(aVar, "");
            aVar.mo29032a(bVar, obj);
        }
    }
}
