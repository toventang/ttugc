package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2559c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2553b.AbstractC37785b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggOutService;
import com.p2082ss.android.ugc.aweme.commercialize.service.CommerceEggOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.c.a */
public final class C37818a {

    /* renamed from: a */
    public static final AbstractC80367dz f89298a = C80371eb.m139349a(C37819a.f89300a);

    /* renamed from: b */
    public static final C37818a f89299b = new C37818a();

    private C37818a() {
    }

    /* renamed from: a */
    public static AbstractC37785b m76472a() {
        return (AbstractC37785b) f89298a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.c.a$a */
    static final class C37819a extends AbstractC89220m implements AbstractC89171a<AbstractC37785b> {

        /* renamed from: a */
        public static final C37819a f89300a = new C37819a();

        static {
            Covode.recordClassIndex(45266);
        }

        C37819a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC37785b invoke() {
            ICommerceEggOutService commerceEggOutService;
            Object a = C81908b.m141854a(ICommerceEggOutService.class, false);
            if (a != null) {
                commerceEggOutService = (ICommerceEggOutService) a;
                if (commerceEggOutService == null) {
                    return null;
                }
            } else {
                commerceEggOutService = new CommerceEggOutService();
            }
            return commerceEggOutService.mo65840a();
        }
    }

    static {
        Covode.recordClassIndex(45265);
    }
}
