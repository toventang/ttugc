package com.p2082ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.apm.C12290b;
import com.bytedance.apm.config.C12422d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.C16083j;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C67967a;
import com.p2082ss.android.ugc.aweme.setting.api.ABApi;
import com.p2082ss.android.ugc.aweme.share.C68846a;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.a */
public final class C68769a {
    static {
        Covode.recordClassIndex(81046);
    }

    /* renamed from: a */
    public static void m121238a() {
        if (C16083j.m29874a().mo25538c()) {
            C12422d.C12423a a = C12422d.m22362a();
            a.f30138a = "settings_v3_fallback_to_v1";
            C12290b.m22059a(a.mo20217a());
        }
        ABApi.C67985a.m120300a().querySettings().mo5532a(C68771b.f153824a).mo5534a(C68772c.f153825a, C1731i.f5564c, null);
    }

    /* renamed from: a */
    public static void m121239a(C28022o oVar) {
        AVExternalServiceImpl.m113114a().configService().avsettingsConfig().updateABTestModel(oVar);
        C68846a.C68847a.m121491a(oVar);
        SettingsRequestServiceImpl.m65417i().mo57277a(oVar);
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m121240b(C1731i iVar) {
        try {
            if (iVar.mo5539b()) {
                return false;
            }
            if (iVar.mo5544c()) {
                iVar.mo5546e();
                return false;
            }
            m121239a((C28022o) iVar.mo5545d());
            C28022o f = ((C28022o) iVar.mo5545d()).mo46789j().mo46807f("data");
            if (f != null) {
                C58945a.C58947b.f134185a.mo96425a("method_save_abtest_keva", false);
                C16048b.m29633a().mo25419a(f);
                C58945a.C58947b.f134185a.mo96429b("method_save_abtest_keva", false);
                C67967a.f152285a.mo108584a();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } catch (IncompatibleClassChangeError unused) {
        }
    }
}
