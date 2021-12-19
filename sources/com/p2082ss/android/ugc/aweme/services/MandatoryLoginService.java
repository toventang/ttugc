package com.p2082ss.android.ugc.aweme.services;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IMandatoryLoginService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.experiment.C31653j;
import com.p2082ss.android.ugc.aweme.account.experiment.C31658m;
import com.p2082ss.android.ugc.aweme.account.experiment.SEANonPersonalizedExperiencePopupSettings;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.MandatoryLoginService */
public final class MandatoryLoginService implements IMandatoryLoginService {
    public static final Companion Companion = new Companion(null);
    private boolean hasRequestComplianceApi;
    private final Keva keva = Keva.getRepo("mandatory_login_repo");
    private final String regionIT = "IT";
    private final String regionUS = "US";
    private final Set<String> regionsEU = C89047am.m154438a((Object[]) new String[]{"AL", "AX", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB"});

    static {
        Covode.recordClassIndex(79691);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.MandatoryLoginService$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79692);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IMandatoryLoginService
    public final boolean getHasRequestComplianceApi() {
        return this.hasRequestComplianceApi;
    }

    @Override // com.p2082ss.android.ugc.aweme.IMandatoryLoginService
    public final boolean shouldShowLoginTabFirst() {
        return C31653j.m65964a();
    }

    @Override // com.p2082ss.android.ugc.aweme.IMandatoryLoginService
    public final boolean shouldShowForcedLogin() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin() || !enableForcedLogin()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.IMandatoryLoginService
    public final Bundle getLoginActivityBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fullscreen_dialog", true);
        bundle.putString("enter_from", "cold_launch");
        bundle.putString("enter_method", "reopen");
        bundle.putBoolean("is_skippable_dialog", !enableForcedLogin());
        return bundle;
    }

    public final boolean enableForcedLogin() {
        SEANonPersonalizedExperiencePopupSettings.C31636a popupSettings;
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        if (C89219l.m154714a((Object) upperCase, (Object) this.regionIT) || C89219l.m154714a((Object) upperCase, (Object) this.regionUS)) {
            return true;
        }
        if (GuestModeServiceImpl.m65990d().mo57219c()) {
            return false;
        }
        if (GuestModeServiceImpl.m65990d().mo57218b() || this.regionsEU.contains(upperCase)) {
            return true;
        }
        if (!C31658m.m65970c() || (C31658m.m65969b() != 3 && (C31658m.m65969b() != 2 || (popupSettings = SEANonPersonalizedExperiencePopupSettings.getPopupSettings()) == null || System.currentTimeMillis() - C31658m.m65968a() <= ((long) popupSettings.f75676b) * 86400000))) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.IMandatoryLoginService
    public final void setHasRequestComplianceApi(boolean z) {
        this.hasRequestComplianceApi = z;
    }

    public static IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(13103);
        Object a = C81908b.m141854a(IMandatoryLoginService.class, z);
        if (a != null) {
            IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) a;
            MethodCollector.m26664o(13103);
            return iMandatoryLoginService;
        }
        if (C81908b.f183350du == null) {
            synchronized (IMandatoryLoginService.class) {
                try {
                    if (C81908b.f183350du == null) {
                        C81908b.f183350du = new MandatoryLoginService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13103);
                    throw th;
                }
            }
        }
        MandatoryLoginService mandatoryLoginService = (MandatoryLoginService) C81908b.f183350du;
        MethodCollector.m26664o(13103);
        return mandatoryLoginService;
    }
}
