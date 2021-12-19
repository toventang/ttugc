package com.p2082ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.app.services.C33844a;
import com.p2082ss.android.ugc.aweme.framework.services.IWebViewTweaker;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p2082ss.android.ugc.aweme.main.service.II18nService;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.services.AccountHelperService;
import com.p2082ss.android.ugc.aweme.services.IAccountHelperService;
import com.p2082ss.android.ugc.aweme.services.WebViewTweakerService;
import com.p2082ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.p2082ss.android.ugc.aweme.setting.services.I18nService;
import com.p2082ss.android.ugc.aweme.setting.services.IAppUpdateService;
import com.p2082ss.android.ugc.aweme.setting.services.LanguageService;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl */
public final class AccountInitServiceImpl implements IAccountInitService {
    static {
        Covode.recordClassIndex(38069);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl$a */
    static final class C31367a<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C31367a f75143a = new C31367a();

        static {
            Covode.recordClassIndex(38070);
        }

        C31367a() {
        }

        /* renamed from: a */
        private static ILanguageService m65575a() {
            MethodCollector.m26663i(6178);
            if (C81908b.f183315dL == null) {
                synchronized (ILanguageService.class) {
                    try {
                        if (C81908b.f183315dL == null) {
                            C81908b.f183315dL = new LanguageService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6178);
                        throw th;
                    }
                }
            }
            LanguageService languageService = (LanguageService) C81908b.f183315dL;
            MethodCollector.m26664o(6178);
            return languageService;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return m65575a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl$b */
    static final class C31368b<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C31368b f75144a = new C31368b();

        static {
            Covode.recordClassIndex(38071);
        }

        C31368b() {
        }

        /* renamed from: a */
        private static IAccountHelperService m65576a() {
            MethodCollector.m26663i(5528);
            if (C81908b.f183340dk == null) {
                synchronized (IAccountHelperService.class) {
                    try {
                        if (C81908b.f183340dk == null) {
                            C81908b.f183340dk = new AccountHelperService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5528);
                        throw th;
                    }
                }
            }
            AccountHelperService accountHelperService = (AccountHelperService) C81908b.f183340dk;
            MethodCollector.m26664o(5528);
            return accountHelperService;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return m65576a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl$c */
    static final class C31369c<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C31369c f75145a = new C31369c();

        static {
            Covode.recordClassIndex(38072);
        }

        C31369c() {
        }

        /* renamed from: a */
        private static IWebViewTweaker m65577a() {
            MethodCollector.m26663i(6022);
            if (C81908b.f183304dA == null) {
                synchronized (IWebViewTweaker.class) {
                    try {
                        if (C81908b.f183304dA == null) {
                            C81908b.f183304dA = new WebViewTweakerService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6022);
                        throw th;
                    }
                }
            }
            WebViewTweakerService webViewTweakerService = (WebViewTweakerService) C81908b.f183304dA;
            MethodCollector.m26664o(6022);
            return webViewTweakerService;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return m65577a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl$d */
    static final class C31370d<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C31370d f75146a = new C31370d();

        static {
            Covode.recordClassIndex(38073);
        }

        C31370d() {
        }

        /* renamed from: a */
        private static IAppUpdateService m65578a() {
            MethodCollector.m26663i(6849);
            if (C81908b.f183313dJ == null) {
                synchronized (IAppUpdateService.class) {
                    try {
                        if (C81908b.f183313dJ == null) {
                            C81908b.f183313dJ = new AppUpdateService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6849);
                        throw th;
                    }
                }
            }
            AppUpdateService appUpdateService = (AppUpdateService) C81908b.f183313dJ;
            MethodCollector.m26664o(6849);
            return appUpdateService;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return m65578a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl$e */
    static final class C31371e<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C31371e f75147a = new C31371e();

        static {
            Covode.recordClassIndex(38074);
        }

        C31371e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new C33844a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.AccountInitServiceImpl$f */
    static final class C31372f<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C31372f f75148a = new C31372f();

        static {
            Covode.recordClassIndex(38075);
        }

        C31372f() {
        }

        /* renamed from: a */
        private static II18nService m65579a() {
            MethodCollector.m26663i(7455);
            if (C81908b.f183314dK == null) {
                synchronized (II18nService.class) {
                    try {
                        if (C81908b.f183314dK == null) {
                            C81908b.f183314dK = new I18nService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7455);
                        throw th;
                    }
                }
            }
            I18nService i18nService = (I18nService) C81908b.f183314dK;
            MethodCollector.m26664o(7455);
            return i18nService;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return m65579a();
        }
    }

    /* renamed from: a */
    public static IAccountInitService m65573a() {
        MethodCollector.m26663i(5772);
        Object a = C81908b.m141854a(IAccountInitService.class, false);
        if (a != null) {
            IAccountInitService iAccountInitService = (IAccountInitService) a;
            MethodCollector.m26664o(5772);
            return iAccountInitService;
        }
        if (C81908b.f183415x == null) {
            synchronized (IAccountInitService.class) {
                try {
                    if (C81908b.f183415x == null) {
                        C81908b.f183415x = new AccountInitServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5772);
                    throw th;
                }
            }
        }
        AccountInitServiceImpl accountInitServiceImpl = (AccountInitServiceImpl) C81908b.f183415x;
        MethodCollector.m26664o(5772);
        return accountInitServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.IAccountInitService
    /* renamed from: a */
    public final <T> ServiceProvider<T> mo57393a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (C89219l.m154714a(cls, ILanguageService.class)) {
            C31367a aVar = C31367a.f75143a;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return aVar;
        } else if (C89219l.m154714a(cls, IAccountHelperService.class)) {
            C31368b bVar = C31368b.f75144a;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return bVar;
        } else if (C89219l.m154714a(cls, IWebViewTweaker.class)) {
            C31369c cVar = C31369c.f75145a;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return cVar;
        } else if (C89219l.m154714a(cls, IAppUpdateService.class)) {
            C31370d dVar = C31370d.f75146a;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return dVar;
        } else if (C89219l.m154714a(cls, AbstractC34817bf.class)) {
            C31371e eVar = C31371e.f75147a;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return eVar;
        } else if (!C89219l.m154714a(cls, II18nService.class)) {
            return null;
        } else {
            C31372f fVar = C31372f.f75148a;
            Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return fVar;
        }
    }
}
