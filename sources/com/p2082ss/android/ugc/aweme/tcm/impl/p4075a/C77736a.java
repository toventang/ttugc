package com.p2082ss.android.ugc.aweme.tcm.impl.p4075a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.service.TcmOutService;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.a.a */
public final class C77736a {

    /* renamed from: a */
    public static final AbstractC80367dz f174317a = C80371eb.m139349a(C77737a.f174319a);

    /* renamed from: b */
    public static final C77736a f174318b = new C77736a();

    private C77736a() {
    }

    /* renamed from: a */
    public static AbstractC77727a m135835a() {
        return (AbstractC77727a) f174317a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.a.a$a */
    static final class C77737a extends AbstractC89220m implements AbstractC89171a<AbstractC77727a> {

        /* renamed from: a */
        public static final C77737a f174319a = new C77737a();

        static {
            Covode.recordClassIndex(90794);
        }

        C77737a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC77727a invoke() {
            ITcmOutService tcmOutService;
            Object a = C81908b.m141854a(ITcmOutService.class, false);
            if (a != null) {
                tcmOutService = (ITcmOutService) a;
                if (tcmOutService == null) {
                    return null;
                }
            } else {
                tcmOutService = new TcmOutService();
            }
            return tcmOutService.mo67048a();
        }
    }

    static {
        Covode.recordClassIndex(90793);
    }
}
