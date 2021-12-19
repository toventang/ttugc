package com.p2082ss.android.ugc.aweme.account.guestmode;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.EnumC35462cf;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IGuestModeService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl */
public final class GuestModeServiceImpl implements IGuestModeService {

    /* renamed from: a */
    private final Set<String> f75749a = C89047am.m154438a((Object[]) new String[]{"AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"});

    static {
        Covode.recordClassIndex(38406);
    }

    @Override // com.p2082ss.android.ugc.aweme.IGuestModeService
    /* renamed from: b */
    public final boolean mo57218b() {
        return AccountExperimentLayerServiceImpl.m65977b().mo57062a(EnumC35462cf.GUEST_MODE_ENABLED);
    }

    @Override // com.p2082ss.android.ugc.aweme.IGuestModeService
    /* renamed from: c */
    public final boolean mo57219c() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return false;
        }
        return AgeGateServiceImpl.m80208e().mo68585d();
    }

    /* renamed from: d */
    public static IGuestModeService m65990d() {
        MethodCollector.m26663i(11363);
        Object a = C81908b.m141854a(IGuestModeService.class, false);
        if (a != null) {
            IGuestModeService iGuestModeService = (IGuestModeService) a;
            MethodCollector.m26664o(11363);
            return iGuestModeService;
        }
        if (C81908b.f183121D == null) {
            synchronized (IGuestModeService.class) {
                try {
                    if (C81908b.f183121D == null) {
                        C81908b.f183121D = new GuestModeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11363);
                    throw th;
                }
            }
        }
        GuestModeServiceImpl guestModeServiceImpl = (GuestModeServiceImpl) C81908b.f183121D;
        MethodCollector.m26664o(11363);
        return guestModeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IGuestModeService
    /* renamed from: a */
    public final boolean mo57217a() {
        Set<String> set = this.f75749a;
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        return set.contains(upperCase);
    }

    @Override // com.p2082ss.android.ugc.aweme.IGuestModeService
    /* renamed from: a */
    public final void mo57216a(Context context, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/login/signup_or_login").withParam("current_scene", EnumC32592i.GUEST_MODE.getValue()).withParam("next_page", EnumC32594j.AGE_GATE_SIGN_UP.getValue());
        C89219l.m154716b(withParam, "");
        withParam.withParam(bundle);
        withParam.open();
    }
}
