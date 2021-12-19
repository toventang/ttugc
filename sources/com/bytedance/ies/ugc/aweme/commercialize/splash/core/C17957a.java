package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.service.SplashAdOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.core.a */
public final class C17957a {

    /* renamed from: a */
    public static final C17957a f42775a = new C17957a();

    /* renamed from: b */
    private static final AbstractC80367dz f42776b = C80371eb.m139349a(C17958a.f42777a);

    private C17957a() {
    }

    /* renamed from: a */
    public static AbstractC17934b m33426a() {
        return (AbstractC17934b) f42776b.mo123714a();
    }

    /* renamed from: b */
    public static boolean m33428b() {
        if (m33426a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.core.a$a */
    static final class C17958a extends AbstractC89220m implements AbstractC89171a<AbstractC17934b> {

        /* renamed from: a */
        public static final C17958a f42777a = new C17958a();

        static {
            Covode.recordClassIndex(20576);
        }

        C17958a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC17934b invoke() {
            ISplashAdOutService splashAdOutService;
            Object a = C81908b.m141854a(ISplashAdOutService.class, false);
            if (a != null) {
                splashAdOutService = (ISplashAdOutService) a;
                if (splashAdOutService == null) {
                    return null;
                }
            } else {
                splashAdOutService = new SplashAdOutService();
            }
            return splashAdOutService.mo28732a();
        }
    }

    static {
        Covode.recordClassIndex(20575);
    }

    /* renamed from: a */
    public static void m33427a(AbstractC17934b bVar) {
        f42776b.mo123715a(bVar);
    }
}
