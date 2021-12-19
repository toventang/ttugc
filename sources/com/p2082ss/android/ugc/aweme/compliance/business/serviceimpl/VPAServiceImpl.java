package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService;
import com.p2082ss.android.ugc.aweme.compliance.business.p2652e.C39408a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.api.ComplianceApi;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl */
public final class VPAServiceImpl implements IVPAService {
    static {
        Covode.recordClassIndex(47235);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: f */
    public final Object mo68731f() {
        return C39408a.f93013a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: d */
    public final int mo68729d() {
        return C39608b.f93371b.mo69035d();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: e */
    public final void mo68730e() {
        C39608b.f93371b.mo69026a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: a */
    public final boolean mo68725a() {
        Boolean enableVpa;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (enableVpa = c.getEnableVpa()) == null) {
            return false;
        }
        return enableVpa.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: b */
    public final String mo68727b() {
        String vpaInfoBarUrl;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (vpaInfoBarUrl = c.getVpaInfoBarUrl()) == null) {
            return "";
        }
        return vpaInfoBarUrl;
    }

    /* renamed from: h */
    public static IVPAService m80316h() {
        MethodCollector.m26663i(8546);
        Object a = C81908b.m141854a(IVPAService.class, false);
        if (a != null) {
            IVPAService iVPAService = (IVPAService) a;
            MethodCollector.m26664o(8546);
            return iVPAService;
        }
        if (C81908b.f183155aK == null) {
            synchronized (IVPAService.class) {
                try {
                    if (C81908b.f183155aK == null) {
                        C81908b.f183155aK = new VPAServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8546);
                    throw th;
                }
            }
        }
        VPAServiceImpl vPAServiceImpl = (VPAServiceImpl) C81908b.f183155aK;
        MethodCollector.m26664o(8546);
        return vPAServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: c */
    public final int mo68728c() {
        Integer defaultVpaContentChoice;
        if (C39608b.f93371b.mo69035d() != 0) {
            return C39608b.f93371b.mo69035d();
        }
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (defaultVpaContentChoice = c.getDefaultVpaContentChoice()) == null) {
            return 1;
        }
        return defaultVpaContentChoice.intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: g */
    public final Integer mo68732g() {
        Integer defaultVpaContentChoice;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c != null && (defaultVpaContentChoice = c.getDefaultVpaContentChoice()) != null && defaultVpaContentChoice.intValue() == 0) {
            return 1;
        }
        ComplianceSetting c2 = C39608b.f93371b.mo69034c();
        if (c2 != null) {
            return c2.getDefaultVpaContentChoice();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: a */
    public final void mo68723a(int i) {
        C39608b.f93371b.mo69026a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo68726b(int i) {
        return ComplianceApi.C39607b.m80407a(ComplianceApi.C39606a.m80406a(), i);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl$a */
    public static final class C39530a implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f93232a;

        /* renamed from: b */
        final /* synthetic */ int f93233b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f93234c;

        static {
            Covode.recordClassIndex(47236);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C39608b.f93371b.mo69026a(this.f93233b);
            C33830n.m69192a("opt_out_failed", "", (JSONObject) null);
            this.f93234c.invoke();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.error_code == 0) {
                C39608b.f93371b.mo69026a(3);
                this.f93232a.invoke();
                return;
            }
            C39608b.f93371b.mo69026a(this.f93233b);
            C33830n.m69192a("opt_out_failed", "", (JSONObject) null);
            this.f93234c.invoke();
        }

        C39530a(AbstractC89171a aVar, int i, AbstractC89171a aVar2) {
            this.f93232a = aVar;
            this.f93233b = i;
            this.f93234c = aVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    /* renamed from: a */
    public final void mo68724a(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        int d = C39608b.f93371b.mo69035d();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            C39608b.f93371b.mo69026a(3);
            aVar.invoke();
            return;
        }
        ComplianceApi.C39607b.m80407a(ComplianceApi.C39606a.m80406a(), 3).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new C39530a(aVar, d, aVar2));
    }
}
