package com.p2082ss.android.ugc.aweme.commercialize.media.impl.p2602a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService;
import com.p2082ss.android.ugc.aweme.commercialize.service.CommerceMediaOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.media.impl.a.a */
public final class C38208a {

    /* renamed from: a */
    public static final AbstractC80367dz f90252a = C80371eb.m139349a(C38209a.f90254a);

    /* renamed from: b */
    public static final C38208a f90253b = new C38208a();

    private C38208a() {
    }

    /* renamed from: a */
    public static AbstractC38207a m77568a() {
        return (AbstractC38207a) f90252a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.media.impl.a.a$a */
    static final class C38209a extends AbstractC89220m implements AbstractC89171a<AbstractC38207a> {

        /* renamed from: a */
        public static final C38209a f90254a = new C38209a();

        static {
            Covode.recordClassIndex(45690);
        }

        C38209a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC38207a invoke() {
            ICommerceMediaOutService commerceMediaOutService;
            Object a = C81908b.m141854a(ICommerceMediaOutService.class, false);
            if (a != null) {
                commerceMediaOutService = (ICommerceMediaOutService) a;
                if (commerceMediaOutService == null) {
                    return null;
                }
            } else {
                commerceMediaOutService = new CommerceMediaOutService();
            }
            return commerceMediaOutService.mo66508a();
        }
    }

    static {
        Covode.recordClassIndex(45689);
    }
}
