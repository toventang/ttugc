package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAvSearchUserService;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.AvSearchUserServiceImpl */
public final class AvSearchUserServiceImpl implements IAvSearchUserService {

    /* renamed from: a */
    private final AbstractC89244h f152057a = C89250i.m154773a((AbstractC89171a) C67882a.f152058a);

    static {
        Covode.recordClassIndex(80045);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.AvSearchUserServiceImpl$a */
    static final class C67882a extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C67882a f152058a = new C67882a();

        static {
            Covode.recordClassIndex(80046);
        }

        C67882a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* renamed from: a */
    public static IAvSearchUserService m120137a() {
        MethodCollector.m26663i(5867);
        Object a = C81908b.m141854a(IAvSearchUserService.class, false);
        if (a != null) {
            IAvSearchUserService iAvSearchUserService = (IAvSearchUserService) a;
            MethodCollector.m26664o(5867);
            return iAvSearchUserService;
        }
        if (C81908b.f183306dC == null) {
            synchronized (IAvSearchUserService.class) {
                try {
                    if (C81908b.f183306dC == null) {
                        C81908b.f183306dC = new AvSearchUserServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5867);
                    throw th;
                }
            }
        }
        AvSearchUserServiceImpl avSearchUserServiceImpl = (AvSearchUserServiceImpl) C81908b.f183306dC;
        MethodCollector.m26664o(5867);
        return avSearchUserServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAvSearchUserService
    /* renamed from: a */
    public final C67683h mo101498a(C67681g gVar) {
        C89219l.m154721d(gVar, "");
        return ((ISearchUserService) this.f152057a.getValue()).mo106818b(gVar);
    }
}
