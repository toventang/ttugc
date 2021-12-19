package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardOutService;
import com.p2082ss.android.ugc.aweme.commercialize.service.AdCardOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.b */
public final class C37663b {

    /* renamed from: b */
    public static final C37663b f89031b = C37665b.f89034a;

    /* renamed from: c */
    public static final C37664a f89032c = new C37664a((byte) 0);

    /* renamed from: a */
    public final AbstractC80367dz f89033a = C80371eb.m139349a(C37666c.f89036a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.b$a */
    public static final class C37664a {
        static {
            Covode.recordClassIndex(45097);
        }

        private C37664a() {
        }

        public /* synthetic */ C37664a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.b$b */
    static final class C37665b {

        /* renamed from: a */
        static final C37663b f89034a = new C37663b();

        /* renamed from: b */
        public static final C37665b f89035b = new C37665b();

        private C37665b() {
        }

        static {
            Covode.recordClassIndex(45098);
        }
    }

    /* renamed from: a */
    public final AbstractC37687t mo65688a() {
        return (AbstractC37687t) this.f89033a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.b$c */
    static final class C37666c extends AbstractC89220m implements AbstractC89171a<AbstractC37687t> {

        /* renamed from: a */
        public static final C37666c f89036a = new C37666c();

        static {
            Covode.recordClassIndex(45099);
        }

        C37666c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC37687t invoke() {
            IAdCardOutService adCardOutService;
            Object a = C81908b.m141854a(IAdCardOutService.class, false);
            if (a != null) {
                adCardOutService = (IAdCardOutService) a;
                if (adCardOutService == null) {
                    return null;
                }
            } else {
                adCardOutService = new AdCardOutService();
            }
            return adCardOutService.mo65446a();
        }
    }

    static {
        Covode.recordClassIndex(45096);
    }
}
