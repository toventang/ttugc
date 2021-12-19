package com.p2082ss.android.ugc.aweme.port.p3561in;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.port.in.g */
public final class C63244g {

    /* renamed from: a */
    public static volatile AbstractC89171a<? extends AbstractC63263u> f143604a;

    /* renamed from: b */
    public static final C63244g f143605b = new C63244g();

    /* renamed from: c */
    private static final AbstractC89244h f143606c = C89250i.m154773a((AbstractC89171a) C63245a.f143607a);

    /* renamed from: a */
    public static AbstractC63263u m114602a() {
        return (AbstractC63263u) f143606c.getValue();
    }

    private C63244g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.g$a */
    static final class C63245a extends AbstractC89220m implements AbstractC89171a<AbstractC63263u> {

        /* renamed from: a */
        public static final C63245a f143607a = new C63245a();

        static {
            Covode.recordClassIndex(74518);
        }

        C63245a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC63263u invoke() {
            AbstractC89171a<? extends AbstractC63263u> aVar = C63244g.f143604a;
            if (aVar == null) {
                C89219l.m154710a("block");
            }
            return aVar.invoke();
        }
    }

    static {
        Covode.recordClassIndex(74517);
    }
}
