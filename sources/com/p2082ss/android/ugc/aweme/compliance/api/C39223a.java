package com.p2082ss.android.ugc.aweme.compliance.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.C39263a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.C39265a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.C39266a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.C39268a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.C39270a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.child.C39271a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.C39274b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.C39277a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.ftc.C39278a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.C39279a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.monitor.C39280a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.C39281a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.C39282a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.C39283a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.C39284a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.settings.C39285a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.C39287b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.C39288a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.C39289a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.AlgofreeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.FTCServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.GDPRServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.PrivateAccountServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceMonitorServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceSettingsServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.a */
public final class C39223a {

    /* renamed from: a */
    private static IReportService f92647a;

    /* renamed from: b */
    private static IAntiAddictionService f92648b;

    /* renamed from: c */
    private static IBanAppealService f92649c;

    /* renamed from: d */
    private static IComplianceBusinessService f92650d;

    /* renamed from: e */
    private static IVPAService f92651e;

    /* renamed from: f */
    private static IAlgofreeService f92652f;

    /* renamed from: g */
    private static IGDPRService f92653g;

    /* renamed from: h */
    private static IAgeGateService f92654h;

    /* renamed from: i */
    private static IPrivateAccountService f92655i;

    /* renamed from: j */
    private static IComplianceSettingsService f92656j;

    /* renamed from: k */
    private static ITermsConsentService f92657k;

    /* renamed from: l */
    private static IComplianceMonitorService f92658l;

    /* renamed from: m */
    private static IFTCService f92659m;

    /* renamed from: n */
    private static IPolicyNoticeService f92660n;

    /* renamed from: o */
    private static IProtectionService f92661o;

    /* renamed from: p */
    private static IFamilyPairingService f92662p;

    /* renamed from: q */
    private static IChildModeService f92663q;

    /* renamed from: r */
    private static ITpcConsentService f92664r;

    /* renamed from: s */
    private static IPrivacyService f92665s;

    static {
        Covode.recordClassIndex(46859);
    }

    /* renamed from: a */
    public static IReportService m79587a() {
        IReportService iReportService = f92647a;
        if (iReportService != null) {
            return iReportService;
        }
        IReportService a = ReportServiceImpl.m80285a();
        f92647a = a;
        if (a == null) {
            f92647a = new C39284a();
        }
        return f92647a;
    }

    /* renamed from: b */
    public static IAntiAddictionService m79588b() {
        IAntiAddictionService iAntiAddictionService = f92648b;
        if (iAntiAddictionService != null) {
            return iAntiAddictionService;
        }
        IAntiAddictionService h = AntiAddictionServiceImpl.m81090h();
        f92648b = h;
        if (h == null) {
            f92648b = new C39266a();
        }
        return f92648b;
    }

    /* renamed from: c */
    public static IBanAppealService m79589c() {
        IBanAppealService iBanAppealService = f92649c;
        if (iBanAppealService != null) {
            return iBanAppealService;
        }
        IBanAppealService f = BanAppealServiceImpl.m80219f();
        f92649c = f;
        if (f == null) {
            f92649c = new C39268a();
        }
        return f92649c;
    }

    /* renamed from: d */
    public static IComplianceBusinessService m79590d() {
        IComplianceBusinessService iComplianceBusinessService = f92650d;
        if (iComplianceBusinessService != null) {
            return iComplianceBusinessService;
        }
        IComplianceBusinessService k = ComplianceBusinessServiceImpl.m80241k();
        f92650d = k;
        if (k == null) {
            f92650d = new C39270a();
        }
        return f92650d;
    }

    /* renamed from: e */
    public static IVPAService m79591e() {
        IVPAService iVPAService = f92651e;
        if (iVPAService != null) {
            return iVPAService;
        }
        IVPAService h = VPAServiceImpl.m80316h();
        f92651e = h;
        if (h == null) {
            f92651e = new C39289a();
        }
        return f92651e;
    }

    /* renamed from: f */
    public static IAlgofreeService m79592f() {
        IAlgofreeService iAlgofreeService = f92652f;
        if (iAlgofreeService != null) {
            return iAlgofreeService;
        }
        IAlgofreeService d = AlgofreeServiceImpl.m80214d();
        f92652f = d;
        if (d == null) {
            f92652f = new C39265a();
        }
        return f92652f;
    }

    /* renamed from: g */
    public static IGDPRService m79593g() {
        IGDPRService iGDPRService = f92653g;
        if (iGDPRService != null) {
            return iGDPRService;
        }
        IGDPRService d = GDPRServiceImpl.m80263d();
        f92653g = d;
        if (d == null) {
            f92653g = new C39279a();
        }
        return f92653g;
    }

    /* renamed from: h */
    public static IAgeGateService m79594h() {
        IAgeGateService iAgeGateService = f92654h;
        if (iAgeGateService != null) {
            return iAgeGateService;
        }
        IAgeGateService e = AgeGateServiceImpl.m80208e();
        f92654h = e;
        if (e == null) {
            f92654h = new C39263a();
        }
        return f92654h;
    }

    /* renamed from: i */
    public static IPrivateAccountService m79595i() {
        IPrivateAccountService iPrivateAccountService = f92655i;
        if (iPrivateAccountService != null) {
            return iPrivateAccountService;
        }
        IPrivateAccountService e = PrivateAccountServiceImpl.m80280e();
        f92655i = e;
        if (e == null) {
            f92655i = new C39283a();
        }
        return f92655i;
    }

    /* renamed from: j */
    public static IComplianceSettingsService m79596j() {
        IComplianceSettingsService iComplianceSettingsService = f92656j;
        if (iComplianceSettingsService != null) {
            return iComplianceSettingsService;
        }
        IComplianceSettingsService b = ComplianceSettingsServiceImpl.m80477b();
        f92656j = b;
        if (b == null) {
            f92656j = new C39285a();
        }
        return f92656j;
    }

    /* renamed from: k */
    public static ITermsConsentService m79597k() {
        ITermsConsentService iTermsConsentService = f92657k;
        if (iTermsConsentService != null) {
            return iTermsConsentService;
        }
        ITermsConsentService g = TermsConsentServiceImpl.m80295g();
        f92657k = g;
        if (g == null) {
            f92657k = new C39288a();
        }
        return f92657k;
    }

    /* renamed from: l */
    public static IComplianceMonitorService m79598l() {
        IComplianceMonitorService iComplianceMonitorService = f92658l;
        if (iComplianceMonitorService != null) {
            return iComplianceMonitorService;
        }
        IComplianceMonitorService a = ComplianceMonitorServiceImpl.m80475a();
        f92658l = a;
        if (a == null) {
            f92658l = new C39280a();
        }
        return f92658l;
    }

    /* renamed from: m */
    public static IFTCService m79599m() {
        IFTCService iFTCService = f92659m;
        if (iFTCService != null) {
            return iFTCService;
        }
        IFTCService d = FTCServiceImpl.m80259d();
        f92659m = d;
        if (d == null) {
            f92659m = new C39278a();
        }
        return f92659m;
    }

    /* renamed from: n */
    public static IPolicyNoticeService m79600n() {
        IPolicyNoticeService iPolicyNoticeService = f92660n;
        if (iPolicyNoticeService != null) {
            return iPolicyNoticeService;
        }
        IPolicyNoticeService f = PolicyNoticeServiceImpl.m80269f();
        f92660n = f;
        if (f == null) {
            f92660n = new C39281a();
        }
        return f92660n;
    }

    /* renamed from: o */
    public static IProtectionService m79601o() {
        IProtectionService iProtectionService = f92661o;
        if (iProtectionService != null) {
            return iProtectionService;
        }
        IProtectionService l = ProtectionServiceImpl.m81109l();
        f92661o = l;
        if (l == null) {
            f92661o = new C39287b();
        }
        return f92661o;
    }

    /* renamed from: p */
    public static IFamilyPairingService m79602p() {
        IFamilyPairingService iFamilyPairingService = f92662p;
        if (iFamilyPairingService != null) {
            return iFamilyPairingService;
        }
        IFamilyPairingService f = FamilyPairingServiceImpl.m81100f();
        f92662p = f;
        if (f == null) {
            f92662p = new C39277a();
        }
        return f92662p;
    }

    /* renamed from: q */
    public static IChildModeService m79603q() {
        IChildModeService iChildModeService = f92663q;
        if (iChildModeService != null) {
            return iChildModeService;
        }
        IChildModeService e = ChildModeServiceImpl.m80232e();
        f92663q = e;
        if (e == null) {
            f92663q = new C39271a();
        }
        return f92663q;
    }

    /* renamed from: r */
    public static ITpcConsentService m79604r() {
        ITpcConsentService iTpcConsentService = f92664r;
        if (iTpcConsentService != null) {
            return iTpcConsentService;
        }
        ITpcConsentService j = TpcConsentServiceImpl.m80302j();
        f92664r = j;
        if (j == null) {
            f92664r = new C39274b();
        }
        return f92664r;
    }

    /* renamed from: s */
    public static IPrivacyService m79605s() {
        IPrivacyService iPrivacyService = f92665s;
        if (iPrivacyService != null) {
            return iPrivacyService;
        }
        IPrivacyService d = PrivacyServiceImpl.m80573d();
        f92665s = d;
        if (d == null) {
            f92665s = new C39282a();
        }
        return f92665s;
    }
}
