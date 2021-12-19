package com.p2082ss.android.ugc.aweme.compliance.common;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.Strategy;
import com.p2082ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39228b;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39234e;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b;
import com.p2082ss.android.ugc.aweme.compliance.common.C39591a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2661b.C39614a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39625b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.C39618a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.b */
public final class C39608b {

    /* renamed from: a */
    public static final C39618a f93370a = new C39618a();

    /* renamed from: b */
    public static final C39614a f93371b = new C39614a();

    /* renamed from: c */
    public static int f93372c = 3;

    /* renamed from: d */
    static boolean f93373d;

    /* renamed from: e */
    public static boolean f93374e;

    /* renamed from: f */
    public static final Set<String> f93375f = C89047am.m154438a((Object[]) new String[]{"uoo", "idfa", "webcast_language", "webcast_locale", "content_language", "allow_sell_data", "longitude", "webcast_sdk_version", "gaid", "gps_access", "address_book_access", "city", "city_name", "latitude", "ad_personality_mode", "search_source", "show_location", "mac_address", "google_aid", "android_id", "bid_ad_params", "ad_user_agent", "ssid", "openudid", "idfv", "vid"});

    /* renamed from: g */
    public static volatile HashMap<String, Strategy> f93376g;

    /* renamed from: h */
    public static volatile boolean f93377h = true;

    /* renamed from: i */
    public static volatile InterfaceControlSettings f93378i;

    /* renamed from: j */
    public static final List<AbstractC39234e> f93379j = new ArrayList();

    /* renamed from: k */
    public static final C39608b f93380k = new C39608b();

    /* renamed from: l */
    private static final Object f93381l = new Object();

    /* renamed from: m */
    private static final Object f93382m = new Object();

    private C39608b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b$b */
    public static final class C39610b implements AbstractC39625b {

        /* renamed from: a */
        final /* synthetic */ AbstractC39264b f93384a;

        static {
            Covode.recordClassIndex(47324);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39625b
        /* renamed from: a */
        public final void mo69023a() {
            AbstractC39264b bVar = this.f93384a;
            if (bVar != null) {
                bVar.mo68586a();
            }
        }

        C39610b(AbstractC39264b bVar) {
            this.f93384a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39625b
        /* renamed from: a */
        public final void mo69024a(ComplianceSetting complianceSetting) {
            C89219l.m154721d(complianceSetting, "");
            C39608b.m80419e();
            if (C39608b.m80418d()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            AbstractC39264b bVar = this.f93384a;
            if (bVar != null) {
                bVar.mo68586a();
            }
        }
    }

    /* renamed from: c */
    public static int m80417c() {
        Integer b = f93371b.mo69032b();
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m80418d() {
        Boolean e = f93371b.mo69036e();
        if (e != null) {
            return e.booleanValue();
        }
        return false;
    }

    /* renamed from: i */
    public static AdPersonalitySettings m80423i() {
        ComplianceSetting c = f93371b.mo69034c();
        if (c != null) {
            return c.getAdPersonalitySettings();
        }
        return null;
    }

    /* renamed from: o */
    public static TermsConsentInfo m80429o() {
        ComplianceSetting c = f93371b.mo69034c();
        if (c != null) {
            return c.getTermsConsentInfo();
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b$c */
    public static final class C39611c implements AbstractC39626c {

        /* renamed from: a */
        final /* synthetic */ int f93385a;

        static {
            Covode.recordClassIndex(47325);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: b */
        public final void mo68909b() {
            new C79459a(C17873f.m33102j()).mo123050a(R.string.bqr).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: a */
        public final void mo68908a() {
            ComplianceSetting complianceSetting;
            Boolean bool;
            Integer num;
            Boolean bool2;
            AdPersonalitySettings i = C39608b.m80423i();
            AdPersonalitySettings adPersonalitySettings = null;
            Integer num2 = null;
            if (i != null) {
                Integer valueOf = Integer.valueOf(this.f93385a);
                AdPersonalitySettings i2 = C39608b.m80423i();
                if (i2 != null) {
                    bool = i2.getShowThirdAd();
                } else {
                    bool = null;
                }
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    num = Integer.valueOf(this.f93385a);
                } else {
                    num = null;
                }
                AdPersonalitySettings i3 = C39608b.m80423i();
                if (i3 != null) {
                    bool2 = i3.getShowPartnerAd();
                } else {
                    bool2 = null;
                }
                if (C89219l.m154714a((Object) bool2, (Object) true)) {
                    num2 = Integer.valueOf(this.f93385a);
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i, valueOf, null, null, null, null, null, null, num, num2, null, null, null, null, null, null, null, null, null, null, 523902, null);
            }
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            C39608b.m80415b(complianceSetting);
            if (C17873f.m33102j() instanceof AbstractC59103j) {
                new C79459a(C17873f.m33102j()).mo123050a(R.string.eqs).mo123053a();
            }
        }

        C39611c(int i) {
            this.f93385a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b$d */
    public static final class C39612d implements AbstractC39626c {

        /* renamed from: a */
        final /* synthetic */ int f93386a;

        static {
            Covode.recordClassIndex(47326);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: b */
        public final void mo68909b() {
            new C79459a(C17873f.m33102j()).mo123050a(R.string.bqr).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: a */
        public final void mo68908a() {
            NewPersAdSettings newPersAdSettings;
            ComplianceSetting complianceSetting;
            NewPersAdSettings g = C39608b.m80421g();
            NewPersAdSettings g2 = C39608b.m80421g();
            AdPersonalitySettings adPersonalitySettings = null;
            if (g2 != null) {
                newPersAdSettings = NewPersAdSettings.copy$default(g2, Integer.valueOf(this.f93386a), null, null, null, null, null, null, null, 254, null);
            } else {
                newPersAdSettings = null;
            }
            AdPersonalitySettings i = C39608b.m80423i();
            if (i != null) {
                if (newPersAdSettings != null) {
                    g = newPersAdSettings;
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, g, null, 393215, null);
            }
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            C39608b.m80415b(complianceSetting);
            if (C17873f.m33102j() instanceof AbstractC59103j) {
                new C79459a(C17873f.m33102j()).mo123050a(R.string.eqs).mo123053a();
            }
        }

        public C39612d(int i) {
            this.f93386a = i;
        }
    }

    /* renamed from: b */
    public static boolean m80416b() {
        Boolean isFollowSystemConfig;
        AdPersonalitySettings i = m80423i();
        if (i == null || (isFollowSystemConfig = i.isFollowSystemConfig()) == null) {
            return false;
        }
        return isFollowSystemConfig.booleanValue();
    }

    /* renamed from: f */
    public static int m80420f() {
        AdPersonalitySettings adPersonalitySettings;
        Integer mode;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null || (mode = adPersonalitySettings.getMode()) == null) {
            return 0;
        }
        return mode.intValue();
    }

    /* renamed from: g */
    public static NewPersAdSettings m80421g() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null) {
            return null;
        }
        return adPersonalitySettings.getNewPersAdSettings();
    }

    /* renamed from: h */
    public static int m80422h() {
        AdPersonalitySettings adPersonalitySettings;
        Integer settingType;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (adPersonalitySettings = c.getAdPersonalitySettings()) == null || (settingType = adPersonalitySettings.getSettingType()) == null) {
            return 0;
        }
        return settingType.intValue();
    }

    /* renamed from: j */
    public static List<String> m80424j() {
        List<String> blackSetting;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (blackSetting = c.getBlackSetting()) == null) {
            return new ArrayList();
        }
        return blackSetting;
    }

    /* renamed from: k */
    public static String m80425k() {
        String impressumUrl;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (impressumUrl = c.getImpressumUrl()) == null) {
            return "";
        }
        return impressumUrl;
    }

    /* renamed from: l */
    public static boolean m80426l() {
        Boolean enableTermsConsentPopup;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (enableTermsConsentPopup = c.getEnableTermsConsentPopup()) == null) {
            return false;
        }
        return enableTermsConsentPopup.booleanValue();
    }

    /* renamed from: m */
    public static String m80427m() {
        TermsConsentInfo termsConsentInfo;
        String termsOfUseUrl;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (termsConsentInfo = c.getTermsConsentInfo()) == null || (termsOfUseUrl = termsConsentInfo.getTermsOfUseUrl()) == null) {
            return "";
        }
        return termsOfUseUrl;
    }

    /* renamed from: n */
    public static String m80428n() {
        TermsConsentInfo termsConsentInfo;
        String privacyPolicyUrl;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (termsConsentInfo = c.getTermsConsentInfo()) == null || (privacyPolicyUrl = termsConsentInfo.getPrivacyPolicyUrl()) == null) {
            return "";
        }
        return privacyPolicyUrl;
    }

    /* renamed from: p */
    public static List<String> m80430p() {
        List<String> kidsEvents;
        ComplianceSetting c = f93371b.mo69034c();
        if (c == null || (kidsEvents = c.getKidsEvents()) == null) {
            return m80431q();
        }
        return kidsEvents;
    }

    /* renamed from: q */
    private static List<String> m80431q() {
        String[] stringArray = C17867d.m33078a().getResources().getStringArray(R.array.a3);
        C89219l.m154716b(stringArray, "");
        return C89064i.m154508i(stringArray);
    }

    /* renamed from: e */
    public static void m80419e() {
        if (m80416b()) {
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Boolean> n = sVar.mo60070n();
            C89219l.m154716b(n, "");
            Boolean c = n.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue() && m80420f() == 1) {
                m80414a(false, "", "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b$a */
    public static final class RunnableC39609a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f93383a;

        static {
            Covode.recordClassIndex(47323);
        }

        public RunnableC39609a(Activity activity) {
            this.f93383a = activity;
        }

        public final void run() {
            C39223a.m79593g().mo68661a(this.f93383a, null);
            Activity activity = this.f93383a;
            C89219l.m154721d(activity, "");
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a((ActivityC0945e) activity);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.AGE_GATE;
            aVar2.f41110e = AbstractC17207b.EnumC17212d.AGE_GATE;
            aVar.mo27209a(aVar2.mo27207a(new C39591a.C39592a(activity)));
            C17205a aVar3 = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar4 = new DialogContext.C17204a((AbstractC1204m) activity);
            aVar4.f41106a = AbstractC17207b.EnumC17208a.POLICY_NOTICE;
            aVar4.f41110e = AbstractC17207b.EnumC17212d.POLICY_NOTICE;
            aVar3.mo27209a(aVar4.mo27207a(new C39591a.C39594b()));
            AbstractC81915c.m141875b(new C39228b());
        }
    }

    static {
        Covode.recordClassIndex(47322);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b$e */
    public static final class C39613e implements AbstractC39626c {

        /* renamed from: a */
        final /* synthetic */ boolean f93387a;

        static {
            Covode.recordClassIndex(47327);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: b */
        public final void mo68909b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39626c
        /* renamed from: a */
        public final void mo68908a() {
            AdPersonalitySettings adPersonalitySettings;
            ComplianceSetting complianceSetting;
            AdPersonalitySettings i = C39608b.m80423i();
            if (i != null) {
                adPersonalitySettings = AdPersonalitySettings.copy$default(i, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f93387a), null, null, null, null, null, 516095, null);
            } else {
                adPersonalitySettings = null;
            }
            ComplianceSetting c = C39608b.f93371b.mo69034c();
            if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            C39608b.m80415b(complianceSetting);
        }

        public C39613e(boolean z) {
            this.f93387a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings m80408a() {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.common.C39608b.m80408a():com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings");
    }

    /* renamed from: a */
    public static void m80409a(int i) {
        f93371b.mo69029a(Integer.valueOf(i));
    }

    /* renamed from: b */
    public static void m80415b(ComplianceSetting complianceSetting) {
        C89219l.m154721d(complianceSetting, "");
        f93371b.mo69027a(complianceSetting);
    }

    /* renamed from: a */
    public static void m80411a(AbstractC39264b bVar) {
        f93370a.mo69037a(new C39610b(bVar));
    }

    /* renamed from: a */
    public static void m80410a(ComplianceSetting complianceSetting) {
        int i;
        C89219l.m154721d(complianceSetting, "");
        C39614a aVar = f93371b;
        aVar.mo69028a(complianceSetting.getAfSharingBlock());
        aVar.mo69030a(complianceSetting.getDeviceLimitRegisterExpiredTime());
        AgeGateInfo ageGateInfo = complianceSetting.getAgeGateInfo();
        if (ageGateInfo != null) {
            i = ageGateInfo.getRegisterAgeGateAction();
        } else {
            i = 0;
        }
        aVar.mo69033b(Integer.valueOf(i));
        aVar.mo69027a(complianceSetting);
        m80412a(complianceSetting.getComplianceEncrypt());
    }

    /* renamed from: a */
    public static void m80412a(String str) {
        C39614a aVar = f93371b;
        aVar.f93393e = str;
        aVar.f93389a.storeString("cmpl_enc", str);
    }

    /* renamed from: a */
    public static void m80413a(String str, AbstractC39626c cVar) {
        C89219l.m154721d(str, "");
        f93370a.mo69039a(str, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m80414a(boolean z, String str, String str2) {
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        C89219l.m154721d(str2, "");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(z ? 1 : 0)));
        C33744d dVar = new C33744d();
        String str8 = "on";
        if (z == 0) {
            str3 = str8;
        } else {
            str3 = "off";
        }
        C33744d a = dVar.mo59983a("initial_status", str3);
        if (z != 0) {
            str4 = str8;
        } else {
            str4 = "off";
        }
        C39162r.m79460a("change_personalization_status", a.mo59983a("final_status", str4).f79943a);
        AdPersonalitySettings i = m80423i();
        Boolean bool2 = null;
        if (i != null) {
            bool = i.getShowThirdAd();
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_third_party_networks_mode").put("value", String.valueOf((int) z)));
            C33744d dVar2 = new C33744d();
            if (z == 0) {
                str6 = str8;
            } else {
                str6 = "off";
            }
            C33744d a2 = dVar2.mo59983a("initial_status", str6);
            if (z != 0) {
                str7 = str8;
            } else {
                str7 = "off";
            }
            C39162r.m79460a("change_ad_third_party_network_status", a2.mo59983a("final_status", str7).f79943a);
        }
        AdPersonalitySettings i2 = m80423i();
        if (i2 != null) {
            bool2 = i2.getShowPartnerAd();
        }
        if (C89219l.m154714a((Object) bool2, (Object) true)) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_data_received_partner_mode").put("value", String.valueOf((int) z)));
            C33744d dVar3 = new C33744d();
            if (z == 0) {
                str5 = str8;
            } else {
                str5 = "off";
            }
            C33744d a3 = dVar3.mo59983a("initial_status", str5);
            if (z == 0) {
                str8 = "off";
            }
            C39162r.m79460a("change_ad_data_from_partner_status", a3.mo59983a("final_status", str8).f79943a);
        }
        if (!C89219l.m154714a((Object) str, (Object) "")) {
            jSONArray.put(new JSONObject().put("field", str).put("value", str2));
        }
        String jSONArray2 = jSONArray.toString();
        C89219l.m154716b(jSONArray2, "");
        m80413a(jSONArray2, new C39611c(z));
    }
}
