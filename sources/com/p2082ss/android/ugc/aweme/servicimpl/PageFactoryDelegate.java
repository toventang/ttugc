package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.p2082ss.android.ugc.gamora.PageFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.PageFactoryDelegate */
public final class PageFactoryDelegate implements PageFactory {
    static {
        Covode.recordClassIndex(80049);
    }

    /* renamed from: a */
    public static PageFactory m120145a() {
        MethodCollector.m26663i(5620);
        Object a = C81908b.m141854a(PageFactory.class, false);
        if (a != null) {
            PageFactory pageFactory = (PageFactory) a;
            MethodCollector.m26664o(5620);
            return pageFactory;
        }
        if (C81908b.f183309dF == null) {
            synchronized (PageFactory.class) {
                try {
                    if (C81908b.f183309dF == null) {
                        C81908b.f183309dF = new PageFactoryDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5620);
                    throw th;
                }
            }
        }
        PageFactoryDelegate pageFactoryDelegate = (PageFactoryDelegate) C81908b.f183309dF;
        MethodCollector.m26664o(5620);
        return pageFactoryDelegate;
    }

    @Override // com.p2082ss.android.ugc.gamora.PageFactory
    /* renamed from: a */
    public final void mo88345a(AbstractC22186b bVar) {
        C67940w wVar;
        C89219l.m154721d(bVar, "");
        if (AVInitializerImpl.f100361a && (wVar = C67940w.f152202a) != null) {
            wVar.mo88345a(bVar);
        }
    }
}
