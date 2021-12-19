package com.p2082ss.android.ugc.aweme.commercialize_x.service;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.commercialize.service.CommercializeAdOutService;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39044b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdOutService;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p2082ss.android.ugc.aweme.commercialize_x.p2628a.C39050a;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl */
public final class CommercializeAdServiceImpl implements ICommercializeAdService {

    /* renamed from: a */
    private final AbstractC80367dz f92209a = C80371eb.m139349a(C39052a.f92211a);

    /* renamed from: b */
    private boolean f92210b;

    static {
        Covode.recordClassIndex(46663);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl$a */
    static final class C39052a extends AbstractC89220m implements AbstractC89171a<AbstractC39044b> {

        /* renamed from: a */
        public static final C39052a f92211a = new C39052a();

        static {
            Covode.recordClassIndex(46664);
        }

        C39052a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC39044b invoke() {
            ICommercializeAdOutService commercializeAdOutService;
            Object a = C81908b.m141854a(ICommercializeAdOutService.class, false);
            if (a != null) {
                commercializeAdOutService = (ICommercializeAdOutService) a;
                if (commercializeAdOutService == null) {
                    return null;
                }
            } else {
                commercializeAdOutService = new CommercializeAdOutService();
            }
            return commercializeAdOutService.mo67046a();
        }
    }

    /* renamed from: a */
    public static ICommercializeAdService m79243a() {
        MethodCollector.m26663i(9920);
        Object a = C81908b.m141854a(ICommercializeAdService.class, false);
        if (a != null) {
            ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) a;
            MethodCollector.m26664o(9920);
            return iCommercializeAdService;
        }
        if (C81908b.f183193aw == null) {
            synchronized (ICommercializeAdService.class) {
                try {
                    if (C81908b.f183193aw == null) {
                        C81908b.f183193aw = new CommercializeAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9920);
                    throw th;
                }
            }
        }
        CommercializeAdServiceImpl commercializeAdServiceImpl = (CommercializeAdServiceImpl) C81908b.f183193aw;
        MethodCollector.m26664o(9920);
        return commercializeAdServiceImpl;
    }

    /* renamed from: b */
    private final void m79245b() {
        MethodCollector.m26663i(9919);
        if (!this.f92210b) {
            synchronized (this) {
                try {
                    if (!this.f92210b) {
                        C39050a.m79242a();
                        this.f92210b = true;
                    }
                } finally {
                    MethodCollector.m26664o(9919);
                }
            }
            return;
        }
        MethodCollector.m26664o(9919);
    }

    /* renamed from: a */
    private final AbstractC39049b m79244a(AbstractC39045c cVar) {
        m79245b();
        return C39050a.m79241a(cVar.mo59006a());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    /* renamed from: a */
    public final AbstractC39043a mo67720a(int i) {
        SparseArray<AbstractC39043a> b;
        AbstractC39044b bVar = (AbstractC39044b) this.f92209a.mo123714a();
        if (bVar == null || (b = bVar.mo60056b()) == null) {
            return null;
        }
        return b.get(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    /* renamed from: b */
    public final Widget mo67723b(Context context, AbstractC39045c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC39049b a = m79244a(cVar);
        if (a != null) {
            return a.mo59004b(context, cVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    /* renamed from: c */
    public final AbstractC39046a mo67724c(Context context, AbstractC39045c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC39049b a = m79244a(cVar);
        if (a != null) {
            return a.mo59141c(context, cVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    /* renamed from: a */
    public final AbstractC39047b<?> mo67721a(Context context, AbstractC39045c cVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        AbstractC39049b a = m79244a(cVar);
        if (a != null) {
            return a.mo58995a(context, cVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    /* renamed from: a */
    public final void mo67722a(Application application, AbstractC39044b bVar, boolean z) {
        C89219l.m154721d(application, "");
        C89219l.m154721d(bVar, "");
        this.f92209a.mo123715a(bVar);
        if (z) {
            m79245b();
        }
    }
}
