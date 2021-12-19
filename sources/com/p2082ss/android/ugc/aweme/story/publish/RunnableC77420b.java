package com.p2082ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import p077b.C1743j;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.b */
public final class RunnableC77420b implements Runnable {

    /* renamed from: a */
    private final AbstractC89244h f173710a = C89250i.m154773a((AbstractC89171a) C77421a.f173712a);

    /* renamed from: b */
    private final AbstractC89171a<C89391z> f173711b;

    static {
        Covode.recordClassIndex(90451);
    }

    /* renamed from: b */
    private final C1743j<C89391z> m135360b() {
        return (C1743j) this.f173710a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.b$a */
    static final class C77421a extends AbstractC89220m implements AbstractC89171a<C1743j<C89391z>> {

        /* renamed from: a */
        public static final C77421a f173712a = new C77421a();

        static {
            Covode.recordClassIndex(90452);
        }

        C77421a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1743j<C89391z> invoke() {
            return new C1743j();
        }
    }

    /* renamed from: a */
    public final void mo121049a() {
        m135360b().mo5555a(C89391z.f203057a);
    }

    public final void run() {
        this.f173711b.invoke();
        m135360b().f5610a.mo5547f();
    }

    public RunnableC77420b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f173711b = aVar;
    }
}
