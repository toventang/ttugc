package com.p2082ss.android.ugc.aweme.shortvideo.p3834g;

import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.g.c */
public final class C71859c {

    /* renamed from: a */
    public final C2564l<Boolean> f161037a;

    /* renamed from: b */
    private final AbstractC89244h f161038b = C89250i.m154773a((AbstractC89171a) C71861b.f161041a);

    /* renamed from: c */
    private final AbstractC89244h f161039c = C89250i.m154773a((AbstractC89171a) C71860a.f161040a);

    static {
        Covode.recordClassIndex(84408);
    }

    /* renamed from: a */
    public final C71853a mo113504a() {
        return (C71853a) this.f161038b.getValue();
    }

    /* renamed from: b */
    public final List<C71857b> mo113506b() {
        return (List) this.f161039c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.c$a */
    static final class C71860a extends AbstractC89220m implements AbstractC89171a<ArrayList<C71857b>> {

        /* renamed from: a */
        public static final C71860a f161040a = new C71860a();

        static {
            Covode.recordClassIndex(84409);
        }

        C71860a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<C71857b> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.c$b */
    static final class C71861b extends AbstractC89220m implements AbstractC89171a<C71853a> {

        /* renamed from: a */
        public static final C71861b f161041a = new C71861b();

        static {
            Covode.recordClassIndex(84410);
        }

        C71861b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71853a invoke() {
            return new C71853a();
        }
    }

    public C71859c(C2564l<Boolean> lVar) {
        C89219l.m154721d(lVar, "");
        this.f161037a = lVar;
    }

    /* renamed from: a */
    public final void mo113505a(C71857b bVar) {
        C89219l.m154721d(bVar, "");
        C71853a a = mo113504a();
        C89219l.m154721d(bVar, "");
        if (a.mo113499a(bVar) < bVar.f161034b) {
            mo113506b().add(bVar);
        }
    }
}
