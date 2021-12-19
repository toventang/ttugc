package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.ttep.C79203ad;
import com.p2082ss.android.ugc.gamora.TTEPPageFactory;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.TTEPPageFactoryDelegate */
public final class TTEPPageFactoryDelegate implements TTEPPageFactory {

    /* renamed from: a */
    private final AbstractC89244h f152059a = C89250i.m154773a((AbstractC89171a) C67883a.f152060a);

    static {
        Covode.recordClassIndex(80051);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.TTEPPageFactoryDelegate$a */
    static final class C67883a extends AbstractC89220m implements AbstractC89171a<C79203ad> {

        /* renamed from: a */
        public static final C67883a f152060a = new C67883a();

        static {
            Covode.recordClassIndex(80052);
        }

        C67883a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79203ad invoke() {
            if (C63244g.m114602a().mo73255A().mo93901a()) {
                return null;
            }
            return new C79203ad();
        }
    }

    /* renamed from: a */
    public static TTEPPageFactory m120148a() {
        MethodCollector.m26663i(5480);
        Object a = C81908b.m141854a(TTEPPageFactory.class, false);
        if (a != null) {
            TTEPPageFactory tTEPPageFactory = (TTEPPageFactory) a;
            MethodCollector.m26664o(5480);
            return tTEPPageFactory;
        }
        if (C81908b.f183311dH == null) {
            synchronized (TTEPPageFactory.class) {
                try {
                    if (C81908b.f183311dH == null) {
                        C81908b.f183311dH = new TTEPPageFactoryDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5480);
                    throw th;
                }
            }
        }
        TTEPPageFactoryDelegate tTEPPageFactoryDelegate = (TTEPPageFactoryDelegate) C81908b.f183311dH;
        MethodCollector.m26664o(5480);
        return tTEPPageFactoryDelegate;
    }

    @Override // com.p2082ss.android.ugc.gamora.TTEPPageFactory
    /* renamed from: a */
    public final void mo108498a(AbstractC22186b bVar) {
        TTEPPageFactory tTEPPageFactory;
        C89219l.m154721d(bVar, "");
        if (AVInitializerImpl.f100361a && (tTEPPageFactory = (TTEPPageFactory) this.f152059a.getValue()) != null) {
            tTEPPageFactory.mo108498a(bVar);
        }
    }
}
