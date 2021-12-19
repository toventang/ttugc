package com.p2082ss.android.ugc.aweme.compliance.common.serviceimpl;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39234e;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39238i;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.C39618a;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceSettingsServiceImpl */
public final class ComplianceSettingsServiceImpl implements IComplianceSettingsService {
    static {
        Covode.recordClassIndex(47347);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /* renamed from: a */
    public final void mo68695a() {
        C39608b.f93371b.mo69027a((ComplianceSetting) null);
        C39608b.f93378i = null;
        C39608b.f93377h = true;
        C39608b.m80411a((AbstractC39264b) null);
    }

    /* renamed from: b */
    public static IComplianceSettingsService m80477b() {
        MethodCollector.m26663i(5801);
        Object a = C81908b.m141854a(IComplianceSettingsService.class, false);
        if (a != null) {
            IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) a;
            MethodCollector.m26664o(5801);
            return iComplianceSettingsService;
        }
        if (C81908b.f183157aM == null) {
            synchronized (IComplianceSettingsService.class) {
                try {
                    if (C81908b.f183157aM == null) {
                        C81908b.f183157aM = new ComplianceSettingsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5801);
                    throw th;
                }
            }
        }
        ComplianceSettingsServiceImpl complianceSettingsServiceImpl = (ComplianceSettingsServiceImpl) C81908b.f183157aM;
        MethodCollector.m26664o(5801);
        return complianceSettingsServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /* renamed from: a */
    public final void mo68700a(AbstractC39264b bVar) {
        C39608b.m80411a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /* renamed from: a */
    public final void mo68697a(AbstractC39234e eVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar, "");
        C39608b.f93379j.add(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /* renamed from: a */
    public final void mo68696a(int i) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_1p_mode").put("value", String.valueOf(i)));
        String jSONArray2 = jSONArray.toString();
        C89219l.m154716b(jSONArray2, "");
        C39608b.m80413a(jSONArray2, new C39608b.C39612d(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /* renamed from: a */
    public final void mo68698a(AbstractC39238i iVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(iVar, "");
        C39618a aVar = C39608b.f93370a;
        C89219l.m154721d(iVar, "");
        aVar.f93402a.getUltimateComplianceSettings().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C39618a.C39621c(iVar), new C39618a.C39622d(iVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /* renamed from: a */
    public final void mo68699a(ComplianceSetting complianceSetting) {
        C89219l.m154721d(complianceSetting, "");
        C89219l.m154721d(complianceSetting, "");
        if (complianceSetting.getAgeGateInfo() != null) {
            C39608b.m80410a(complianceSetting);
            C39608b.m80419e();
            if (C39608b.m80418d()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            Activity j = C17873f.m33102j();
            if (j != null && (j instanceof ActivityC0945e)) {
                j.runOnUiThread(new C39608b.RunnableC39609a(j));
            }
        }
    }
}
