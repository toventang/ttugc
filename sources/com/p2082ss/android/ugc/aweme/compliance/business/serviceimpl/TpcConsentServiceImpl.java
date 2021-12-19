package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39290a;
import com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39300c;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl */
public final class TpcConsentServiceImpl implements ITpcConsentService {
    static {
        Covode.recordClassIndex(47234);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: a */
    public final void mo68634a() {
        C39300c.f92780g = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: c */
    public final void mo68640c() {
        C39300c.C39301a.m79951a().mo68744a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: e */
    public final boolean mo68642e() {
        return C39300c.C39301a.m79954b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: f */
    public final ITpcConsentService.EnumC39272a mo68643f() {
        return C39300c.C39301a.m79955c();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: d */
    public final void mo68641d() {
        C39300c.f92779f.storeBoolean("user_logged_in_atleast_once", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: h */
    public final void mo68645h() {
        C39300c.C39301a.m79951a().mo68745a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: b */
    public final boolean mo68639b() {
        C39300c.C39301a.m79951a();
        if (((Number) C39290a.f92766b.getValue()).intValue() == C39290a.f92765a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: i */
    public final void mo68646i() {
        C39300c a = C39300c.C39301a.m79951a();
        if (a.f92788d == -1) {
            a.f92788d = System.currentTimeMillis();
        }
    }

    /* renamed from: j */
    public static ITpcConsentService m80302j() {
        MethodCollector.m26663i(9649);
        Object a = C81908b.m141854a(ITpcConsentService.class, false);
        if (a != null) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) a;
            MethodCollector.m26664o(9649);
            return iTpcConsentService;
        }
        if (C81908b.f183154aJ == null) {
            synchronized (ITpcConsentService.class) {
                try {
                    if (C81908b.f183154aJ == null) {
                        C81908b.f183154aJ = new TpcConsentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9649);
                    throw th;
                }
            }
        }
        TpcConsentServiceImpl tpcConsentServiceImpl = (TpcConsentServiceImpl) C81908b.f183154aJ;
        MethodCollector.m26664o(9649);
        return tpcConsentServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: g */
    public final void mo68644g() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return;
        }
        if (C39300c.C39301a.m79955c() == ITpcConsentService.EnumC39272a.US || C39300c.C39301a.m79955c() == ITpcConsentService.EnumC39272a.EU) {
            C39300c.f92779f.storeBoolean("have_passed_consent", false);
            C39300c.C39301a.m79953b(9);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: a */
    public final void mo68635a(int i) {
        C39300c.C39301a.m79952a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: b */
    public final void mo68638b(int i) {
        C39300c.f92779f.storeBoolean("have_passed_consent", false);
        C39300c.C39301a.m79953b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: a */
    public final boolean mo68637a(AbstractC39273a aVar) {
        C39300c.C39301a.m79951a().f92787c = aVar;
        boolean b = GuestModeServiceImpl.m65990d().mo57218b();
        if ((C39300c.C39301a.m79955c() == ITpcConsentService.EnumC39272a.ROW || C39300c.C39301a.m79955c() == ITpcConsentService.EnumC39272a.KR) && !C39300c.C39301a.m79954b()) {
            String a = C58071d.m104907a();
            C89219l.m154716b(a, "");
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a.toUpperCase();
            C89219l.m154716b(upperCase, "");
            if (!C89219l.m154714a((Object) upperCase, (Object) C39300c.f92782i) && !b) {
                return true;
            }
        }
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    /* renamed from: a */
    public final void mo68636a(Activity activity, String str) {
        int i;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C39300c a = C39300c.C39301a.m79951a();
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        a.f92786b = str;
        AbstractC39273a aVar = a.f92787c;
        if (aVar != null) {
            aVar.mo68647f();
        }
        C33744d a2 = new C33744d().mo59983a("enter_from", a.f92786b);
        if (C39300c.C39301a.m79955c() == ITpcConsentService.EnumC39272a.KR) {
            i = 1;
        } else {
            i = 0;
        }
        C39162r.m79460a("show_consent_box", a2.mo59980a("is_region_kr", i).mo59983a("consent_region", C58071d.m104907a()).f79943a);
        if (C39300c.C39301a.m79955c() != ITpcConsentService.EnumC39272a.KR) {
            C1731i.m5640b(new C39300c.CallableC39303c(a, activity), C1731i.f5564c);
        } else {
            C1731i.m5640b(new C39300c.CallableC39306d(a, activity), C1731i.f5564c);
        }
    }
}
