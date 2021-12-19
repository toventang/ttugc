package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39300c;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl */
public final class TermsConsentServiceImpl implements ITermsConsentService {
    static {
        Covode.recordClassIndex(47233);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    /* renamed from: b */
    public final String mo68718b() {
        return C39608b.m80427m();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    /* renamed from: c */
    public final String mo68719c() {
        return C39608b.m80428n();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    /* renamed from: f */
    public final boolean mo68722f() {
        return C39300c.C39301a.m79956d();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    /* renamed from: a */
    public final boolean mo68717a() {
        Boolean addTermsConsentForRegister;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (addTermsConsentForRegister = c.getAddTermsConsentForRegister()) == null) {
            return false;
        }
        return addTermsConsentForRegister.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    /* renamed from: d */
    public final String mo68720d() {
        TermsConsentInfo termsConsentInfo;
        String cbNotificationTitle;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (termsConsentInfo = c.getTermsConsentInfo()) == null || (cbNotificationTitle = termsConsentInfo.getCbNotificationTitle()) == null) {
            return "";
        }
        return cbNotificationTitle;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    /* renamed from: e */
    public final String mo68721e() {
        TermsConsentInfo termsConsentInfo;
        String cbNotificationSubTitle;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (termsConsentInfo = c.getTermsConsentInfo()) == null || (cbNotificationSubTitle = termsConsentInfo.getCbNotificationSubTitle()) == null) {
            return "";
        }
        return cbNotificationSubTitle;
    }

    /* renamed from: g */
    public static ITermsConsentService m80295g() {
        MethodCollector.m26663i(13028);
        Object a = C81908b.m141854a(ITermsConsentService.class, false);
        if (a != null) {
            ITermsConsentService iTermsConsentService = (ITermsConsentService) a;
            MethodCollector.m26664o(13028);
            return iTermsConsentService;
        }
        if (C81908b.f183153aI == null) {
            synchronized (ITermsConsentService.class) {
                try {
                    if (C81908b.f183153aI == null) {
                        C81908b.f183153aI = new TermsConsentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13028);
                    throw th;
                }
            }
        }
        TermsConsentServiceImpl termsConsentServiceImpl = (TermsConsentServiceImpl) C81908b.f183153aI;
        MethodCollector.m26664o(13028);
        return termsConsentServiceImpl;
    }
}
