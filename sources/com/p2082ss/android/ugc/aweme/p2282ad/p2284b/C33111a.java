package com.p2082ss.android.ugc.aweme.p2282ad.p2284b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.service.AdLandPageDependOutService;
import com.p2082ss.android.ugc.aweme.p2282ad.service.IAdLandPageDependOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.ad.b.a */
public final class C33111a {

    /* renamed from: a */
    public static final AbstractC80367dz f78701a = C80371eb.m139349a(C33112a.f78703a);

    /* renamed from: b */
    public static final C33111a f78702b = new C33111a();

    private C33111a() {
    }

    /* renamed from: a */
    public static AbstractC33116d m67825a() {
        return (AbstractC33116d) f78701a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.b.a$a */
    static final class C33112a extends AbstractC89220m implements AbstractC89171a<AbstractC33116d> {

        /* renamed from: a */
        public static final C33112a f78703a = new C33112a();

        static {
            Covode.recordClassIndex(39925);
        }

        C33112a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33116d invoke() {
            IAdLandPageDependOutService adLandPageDependOutService;
            Object a = C81908b.m141854a(IAdLandPageDependOutService.class, false);
            if (a != null) {
                adLandPageDependOutService = (IAdLandPageDependOutService) a;
                if (adLandPageDependOutService == null) {
                    return null;
                }
            } else {
                adLandPageDependOutService = new AdLandPageDependOutService();
            }
            return adLandPageDependOutService.mo59427a();
        }
    }

    static {
        Covode.recordClassIndex(39924);
    }
}
