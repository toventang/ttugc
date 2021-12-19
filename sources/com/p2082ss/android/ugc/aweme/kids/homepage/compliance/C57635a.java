package com.p2082ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsSettings;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.C57611a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57657b;
import com.p2082ss.android.ugc.aweme.kids.setting.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.a */
public final class C57635a {

    /* renamed from: a */
    public static final C57640c f131548a = new C57640c();

    /* renamed from: b */
    public static final C57637b f131549b = new C57637b();

    /* renamed from: c */
    static int f131550c = 3;

    /* renamed from: d */
    public static boolean f131551d;

    /* renamed from: e */
    public static final C57635a f131552e = new C57635a();

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.a$a */
    public static final class C57636a implements AbstractC57642d {
        static {
            Covode.recordClassIndex(67599);
        }

        C57636a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.homepage.compliance.AbstractC57642d
        /* renamed from: a */
        public final void mo94943a(KidsSettings kidsSettings) {
            C89219l.m154721d(kidsSettings, "");
            if (kidsSettings.getAbTestParamStruct() instanceof C28022o) {
                AbstractC28019l abTestParamStruct = kidsSettings.getAbTestParamStruct();
                Objects.requireNonNull(abTestParamStruct, "null cannot be cast to non-null type com.google.gson.JsonObject");
                C28022o j = abTestParamStruct.mo46789j();
                C89219l.m154716b(j, "");
                C57611a.m104323a(j);
            }
            KidsComplianceSettings complianceSettings = kidsSettings.getComplianceSettings();
            if (complianceSettings != null) {
                C89219l.m154721d(complianceSettings, "");
                C57640c cVar = C57635a.f131548a;
                cVar.f131561c = complianceSettings;
                cVar.f131559a = complianceSettings;
                cVar.f131560b.storeString("cached_setting", new C27910f().mo46674b(complianceSettings));
                AbstractC81915c.m141875b(new C57657b());
                SettingServiceImpl.m104509a().mo95125a(complianceSettings);
                String complianceEncrypt = complianceSettings.getComplianceEncrypt();
                C57640c cVar2 = C57635a.f131548a;
                cVar2.f131562d = complianceEncrypt;
                cVar2.f131560b.storeString("cmpl_enc", complianceEncrypt);
                KidsWellbeingSetting wellbeingSetting = complianceSettings.getWellbeingSetting();
                if (wellbeingSetting != null) {
                    KidsWellbeingServiceImpl.m104800c().mo95132a(wellbeingSetting);
                }
            }
        }
    }

    private C57635a() {
    }

    /* renamed from: a */
    public static void m104363a() {
        f131549b.mo94944a(new C57636a());
    }

    static {
        Covode.recordClassIndex(67598);
    }

    /* renamed from: b */
    public static KMReportReason m104364b() {
        String str;
        C57640c cVar = f131548a;
        KidsComplianceSettings a = cVar.mo94945a();
        if (a == null || a.getKmReportReasons() == null) {
            return null;
        }
        C27910f fVar = new C27910f();
        try {
            KidsComplianceSettings a2 = cVar.mo94945a();
            if (a2 != null) {
                str = a2.getKmReportReasons();
            } else {
                str = null;
            }
            Object a3 = fVar.mo46670a(str, KMReportReason.class);
            C89219l.m154716b(a3, "");
            return (KMReportReason) a3;
        } catch (C28027t unused) {
            return null;
        }
    }
}
