package com.p2082ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34501a;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.AbstractC53450j;
import com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.main.C59050ba;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67129a;
import com.p2082ss.android.ugc.aweme.requesttask.p3681b.C67179a;
import com.p2082ss.android.ugc.aweme.requesttask.p3681b.C67180b;
import com.p2082ss.android.ugc.aweme.splash.SplashActivity;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.services.NewUserMainModuleService */
public final class NewUserMainModuleService implements INewUserMainModuleService {

    /* renamed from: a */
    public final C59050ba f80134a = new C59050ba();

    static {
        Covode.recordClassIndex(40753);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final Class<? extends Activity> mo60090a() {
        return AppLinkHandlerV2.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: b */
    public final Class<? extends Activity> mo60093b() {
        return DeepLinkActivityV2.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: f */
    public final Class<? extends Activity> mo60097f() {
        return SplashActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: d */
    public final AbstractC58259r mo60095d() {
        return new C67179a();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: e */
    public final AbstractC58259r mo60096e() {
        return new C67180b();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: g */
    public final void mo60098g() {
        C40203j.C40204a.m81323a().mo69409c();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: c */
    public final boolean mo60094c() {
        return C40203j.C40204a.m81323a().mo69408b();
    }

    /* renamed from: h */
    public static INewUserMainModuleService m69256h() {
        MethodCollector.m26663i(5828);
        Object a = C81908b.m141854a(INewUserMainModuleService.class, false);
        if (a != null) {
            INewUserMainModuleService iNewUserMainModuleService = (INewUserMainModuleService) a;
            MethodCollector.m26664o(5828);
            return iNewUserMainModuleService;
        }
        if (C81908b.f183131N == null) {
            synchronized (INewUserMainModuleService.class) {
                try {
                    if (C81908b.f183131N == null) {
                        C81908b.f183131N = new NewUserMainModuleService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5828);
                    throw th;
                }
            }
        }
        NewUserMainModuleService newUserMainModuleService = (NewUserMainModuleService) C81908b.f183131N;
        MethodCollector.m26664o(5828);
        return newUserMainModuleService;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final AbstractC58259r mo60089a(EnumC58147aa aaVar) {
        C89219l.m154721d(aaVar, "");
        return new C67129a(aaVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final void mo60092a(String str) {
        C89219l.m154721d(str, "");
        C40203j a = C40203j.C40204a.m81323a();
        C89219l.m154721d(str, "");
        if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            a.mo69405a().setContentLanguage("content_language", str, 1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40203j.C40207d());
        } else {
            a.f94395a.mo69423a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final void mo60091a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        ((AbstractC53450j) C34501a.m70486a(context, AbstractC53450j.class)).mo60947a();
    }
}
