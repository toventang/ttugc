package com.p2082ss.android.ugc.aweme.compliance.common.p2663d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33748g;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AlgoFreeSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39262u;
import com.p2082ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39238i;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.api.ComplianceApi;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import java.util.Objects;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a */
public final class C39618a {

    /* renamed from: a */
    public final ComplianceApi f93402a = ComplianceApi.C39606a.m80406a();

    static {
        Covode.recordClassIndex(47332);
    }

    /* renamed from: a */
    private static int m80459a() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null) {
            return 0;
        }
        return currentUser.getUserMode();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$a */
    public static final class C39619a implements AbstractC88986z<AlgoFreeSettings> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39230a f93403a;

        static {
            Covode.recordClassIndex(47333);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C39619a(AbstractC39230a aVar) {
            this.f93403a = aVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            int i;
            C89219l.m154721d(th, "");
            AbstractC39230a aVar = this.f93403a;
            if (th instanceof C34480a) {
                i = ((C34480a) th).getErrorCode();
            } else {
                i = -1;
            }
            aVar.mo68109a(i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
            if (r2 == null) goto L_0x006d;
         */
        @Override // p4560f.p4561a.AbstractC88986z
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(com.p2082ss.android.ugc.aweme.compliance.api.model.AlgoFreeSettings r33) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.common.p2663d.C39618a.C39619a.onNext(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$d */
    public static final class C39622d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC39238i f93407a;

        static {
            Covode.recordClassIndex(47336);
        }

        public C39622d(AbstractC39238i iVar) {
            this.f93407a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f93407a.mo68128a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$e */
    public static final class C39623e implements AbstractC88986z<CmplRespForEncrypt> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39626c f93408a;

        static {
            Covode.recordClassIndex(47337);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C39623e(AbstractC39626c cVar) {
            this.f93408a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(CmplRespForEncrypt cmplRespForEncrypt) {
            String imprId;
            CmplRespForEncrypt cmplRespForEncrypt2 = cmplRespForEncrypt;
            String str = "";
            C89219l.m154721d(cmplRespForEncrypt2, str);
            if (cmplRespForEncrypt2.status_code == 0) {
                C39608b.m80412a(cmplRespForEncrypt2.getComplianceEncrypt());
                AbstractC39626c cVar = this.f93408a;
                if (cVar != null) {
                    cVar.mo68908a();
                }
                C39617a.m80456a("/aweme/v1/cmpl/set/settings/", 0);
                return;
            }
            LogPbBean logPb = cmplRespForEncrypt2.getLogPb();
            if (!(logPb == null || (imprId = logPb.getImprId()) == null)) {
                str = imprId;
            }
            C39617a.m80457a("/aweme/v1/cmpl/set/settings/", str, String.valueOf(cmplRespForEncrypt2.status_code));
            AbstractC39626c cVar2 = this.f93408a;
            if (cVar2 != null) {
                cVar2.mo68909b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            int i;
            String imprId;
            String str = "";
            C89219l.m154721d(th, str);
            StackTraceElement[] stackTrace = th.getStackTrace();
            C89219l.m154716b(stackTrace, str);
            String str2 = str;
            for (int i2 = 0; i2 < stackTrace.length; i2++) {
                str2 = str2 + stackTrace[i2].toString() + "\n";
            }
            if (th instanceof C34485a) {
                Object rawResponse = ((C34485a) th).getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt");
                LogPbBean logPb = ((CmplRespForEncrypt) rawResponse).getLogPb();
                if (!(logPb == null || (imprId = logPb.getImprId()) == null)) {
                    str = imprId;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (th instanceof C34480a) {
                i = ((C34480a) th).getErrorCode();
            } else {
                i = -1;
            }
            C39617a.m80457a("/aweme/v1/cmpl/set/settings/", str, sb.append(String.valueOf(i)).append("\n").append(th.getMessage()).append("\n").append(str2).toString());
            AbstractC39626c cVar = this.f93408a;
            if (cVar != null) {
                cVar.mo68909b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$f */
    public static final class C39624f implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39627d f93409a;

        static {
            Covode.recordClassIndex(47338);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C39624f(AbstractC39627d dVar) {
            this.f93409a = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            String str;
            C89219l.m154721d(th, "");
            AbstractC39627d dVar = this.f93409a;
            if (th instanceof C34485a) {
                str = ((C34485a) th).getErrorMsg();
            } else {
                str = "";
            }
            C89219l.m154716b(str, "");
            dVar.mo68841a(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.status_code != 0) {
                AbstractC39627d dVar = this.f93409a;
                String str = baseResponse2.status_msg;
                C89219l.m154716b(str, "");
                dVar.mo68841a(str);
                return;
            }
            this.f93409a.mo68840a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$c */
    public static final class C39621c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC39238i f93406a;

        static {
            Covode.recordClassIndex(47335);
        }

        public C39621c(AbstractC39238i iVar) {
            this.f93406a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39262u uVar = (C39262u) obj;
            if (uVar.status_code == 0) {
                AbstractC39238i iVar = this.f93406a;
                C89219l.m154716b(uVar, "");
                iVar.mo68129a(uVar);
                return;
            }
            this.f93406a.mo68128a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$b */
    public static final class C39620b implements AbstractC88986z<ComplianceSetting> {

        /* renamed from: a */
        final /* synthetic */ C39618a f93404a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39625b f93405b;

        static {
            Covode.recordClassIndex(47334);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(ComplianceSetting complianceSetting) {
            ComplianceSetting complianceSetting2 = complianceSetting;
            C89219l.m154721d(complianceSetting2, "");
            if (complianceSetting2.status_code == 0) {
                C39608b.m80410a(complianceSetting2);
                AbstractC39625b bVar = this.f93405b;
                if (bVar != null) {
                    bVar.mo69024a(complianceSetting2);
                }
                C39617a.m80456a("/aweme/v1/compliance/settings/", 0);
                C39608b.f93372c = 3;
                return;
            }
            AbstractC39625b bVar2 = this.f93405b;
            if (bVar2 != null) {
                bVar2.mo69023a();
            }
            if (C39608b.f93372c > 0) {
                C39608b.f93372c--;
                this.f93404a.mo69037a(this.f93405b);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            int i;
            String imprId;
            String str = "";
            C89219l.m154721d(th, str);
            AbstractC39625b bVar = this.f93405b;
            if (bVar != null) {
                bVar.mo69023a();
            }
            boolean z = th instanceof C34485a;
            if (z) {
                Object rawResponse = ((C34485a) th).getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting");
                LogPbBean logPb = ((ComplianceSetting) rawResponse).getLogPb();
                if (!(logPb == null || (imprId = logPb.getImprId()) == null)) {
                    str = imprId;
                }
            }
            if (z) {
                i = ((C34480a) th).getErrorCode();
            } else {
                i = 1;
            }
            C39617a.m80457a("/aweme/v1/compliance/settings/", str, String.valueOf(i));
            if (C39608b.f93372c > 0) {
                C39608b.f93372c--;
                this.f93404a.mo69037a(this.f93405b);
            }
        }

        C39620b(C39618a aVar, AbstractC39625b bVar) {
            this.f93404a = aVar;
            this.f93405b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo69037a(AbstractC39625b bVar) {
        if (!C33748g.m69093a()) {
            this.f93402a.getComplianceSetting(C39223a.m79601o().mo68711h(), m80459a()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C39620b(this, bVar));
        }
    }

    /* renamed from: a */
    public final void mo69039a(String str, AbstractC39626c cVar) {
        C89219l.m154721d(str, "");
        this.f93402a.setComplianceSettings(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C39623e(cVar));
    }

    /* renamed from: a */
    public final void mo69038a(String str, int i, AbstractC39627d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f93402a.setUserSetting(str, i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C39624f(dVar));
    }
}
