package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.p2082ss.android.ugc.aweme.compliance.api.services.depend.C39275a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39503c;
import com.p2082ss.android.ugc.aweme.compliance.common.C39591a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl */
public final class PolicyNoticeServiceImpl implements IPolicyNoticeService {
    static {
        Covode.recordClassIndex(47228);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl$b */
    static final class C39529b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C39529b f93231a = new C39529b();

        static {
            Covode.recordClassIndex(47230);
        }

        C39529b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: a */
    public final void mo68668a() {
        if (C39456a.f93110f == 1) {
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.POLICY_NOTICE);
        } else {
            C39456a.m80151a().mo68918a(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: b */
    public final void mo68672b() {
        C39456a.f93106b = null;
        C39456a.f93105a = null;
        C39456a.f93107c = null;
        C39456a.f93108d = null;
        C39456a.f93109e = C89086z.INSTANCE;
        C39456a.m80160c();
        C39456a.m80151a().mo68918a(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: c */
    public final String mo68673c() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String title;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (legalEntityChangeInfo = c.getLegalEntityChangeInfo()) == null || (title = legalEntityChangeInfo.getTitle()) == null) {
            return "";
        }
        return title;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: d */
    public final String mo68674d() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String body;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (legalEntityChangeInfo = c.getLegalEntityChangeInfo()) == null || (body = legalEntityChangeInfo.getBody()) == null) {
            return "";
        }
        return body;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: e */
    public final List<PolicyBodyLinkList> mo68675e() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        List<PolicyBodyLinkList> bodyLinkList;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (legalEntityChangeInfo = c.getLegalEntityChangeInfo()) == null || (bodyLinkList = legalEntityChangeInfo.getBodyLinkList()) == null) {
            return C89086z.INSTANCE;
        }
        return bodyLinkList;
    }

    /* renamed from: f */
    public static IPolicyNoticeService m80269f() {
        MethodCollector.m26663i(10136);
        Object a = C81908b.m141854a(IPolicyNoticeService.class, false);
        if (a != null) {
            IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) a;
            MethodCollector.m26664o(10136);
            return iPolicyNoticeService;
        }
        if (C81908b.f183150aF == null) {
            synchronized (IPolicyNoticeService.class) {
                try {
                    if (C81908b.f183150aF == null) {
                        C81908b.f183150aF = new PolicyNoticeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10136);
                    throw th;
                }
            }
        }
        PolicyNoticeServiceImpl policyNoticeServiceImpl = (PolicyNoticeServiceImpl) C81908b.f183150aF;
        MethodCollector.m26664o(10136);
        return policyNoticeServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl$a */
    static final class C39528a extends AbstractC89220m implements AbstractC89172b<C39249j, C89391z> {

        /* renamed from: a */
        public static final C39528a f93230a = new C39528a();

        static {
            Covode.recordClassIndex(47229);
        }

        C39528a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C39249j jVar) {
            C89219l.m154721d(jVar, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: a */
    public final View mo68667a(View view) {
        C89219l.m154721d(view, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C39503c cVar = new C39503c(context, (byte) 0);
        cVar.setVisibility(8);
        cVar.setLayoutParams(layoutParams);
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: a */
    public final void mo68669a(int i) {
        String str;
        C33744d dVar = new C33744d();
        if (i == 2) {
            str = "on";
        } else {
            str = "off";
        }
        C39162r.m79460a("tns_trending_setting", dVar.mo59983a("trending", str).f79943a);
        C39456a.m80154a(new C39248i("kr_consent_market_message", "v20200629", "bottom", null, null, null, null, null, null, null, 1016, null), new C39249j(null, null, null, null, Integer.valueOf(i), null, null, null, null, 1983), 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: a */
    public final void mo68670a(Activity activity) {
        if (!C39275a.m79779a().mo68103a()) {
            if (!(activity instanceof ActivityC0945e)) {
                activity = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) activity;
            if (eVar != null) {
                eVar.runOnUiThread(new C39591a.RunnableC39599f(eVar));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: a */
    public final void mo68671a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39456a.m80154a(new C39248i(str, str2, "pop", null, null, null, null, null, null, null, 1016, null), new C39249j(null, null, null, null, 2, null, null, null, true, 959), 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    /* renamed from: a */
    public final SpannableStringBuilder mo68666a(Context context, String str, List<PolicyBodyLinkList> list) {
        C89219l.m154721d(context, "");
        return C39456a.m80150a(context, str, list, C39528a.f93230a, C39529b.f93231a);
    }
}
