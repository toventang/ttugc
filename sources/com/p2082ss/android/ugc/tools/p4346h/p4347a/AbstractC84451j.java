package com.p2082ss.android.ugc.tools.p4346h.p4347a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.j */
public interface AbstractC84451j<DATA, EXTRA> {
    static {
        Covode.recordClassIndex(98416);
    }

    /* renamed from: a */
    AbstractC88403ab<C89378p<List<DATA>, EXTRA>> mo129432a();

    /* renamed from: b */
    AbstractC88403ab<List<DATA>> mo129433b();

    /* renamed from: com.ss.android.ugc.tools.h.a.j$a */
    public static final class C84452a {
        static {
            Covode.recordClassIndex(98417);
        }

        /* renamed from: com.ss.android.ugc.tools.h.a.j$a$a */
        static final class C84453a<T, R> implements AbstractC88434g<C89378p<? extends List<? extends DATA>, ? extends EXTRA>, List<? extends DATA>> {

            /* renamed from: a */
            public static final C84453a f188785a = new C84453a();

            static {
                Covode.recordClassIndex(98418);
            }

            C84453a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89378p pVar = (C89378p) obj;
                C89219l.m154721d(pVar, "");
                return pVar.component1();
            }
        }

        /* renamed from: a */
        public static <DATA, EXTRA> AbstractC88403ab<List<DATA>> m145274a(AbstractC84451j<DATA, EXTRA> jVar) {
            AbstractC88403ab<R> c = jVar.mo129432a().mo142925c(C84453a.f188785a);
            C89219l.m154716b(c, "");
            return c;
        }
    }
}
