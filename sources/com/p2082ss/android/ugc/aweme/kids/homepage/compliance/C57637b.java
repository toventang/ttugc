package com.p2082ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsSettings;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.b */
public final class C57637b {

    /* renamed from: a */
    public final ComplianceApi f131553a;

    static {
        Covode.recordClassIndex(67600);
    }

    public C57637b() {
        Object a = RetrofitFactory.m33635a().mo28817b(C57345a.f130717a).mo28832d().mo28858a(ComplianceApi.class);
        C89219l.m154716b(a, "");
        this.f131553a = (ComplianceApi) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.b$a */
    public static final class C57638a implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ long f131554a;

        static {
            Covode.recordClassIndex(67601);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C57638a(long j) {
            this.f131554a = j;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C57354e.m103957a("kids_api_check_in", -1, -1, this.f131554a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
            C57354e.m103957a("kids_api_check_in", -1, 0, this.f131554a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.b$b */
    public static final class C57639b implements AbstractC88986z<KidsSettings> {

        /* renamed from: a */
        final /* synthetic */ C57637b f131555a;

        /* renamed from: b */
        final /* synthetic */ AbstractC57642d f131556b;

        /* renamed from: c */
        final /* synthetic */ long f131557c;

        static {
            Covode.recordClassIndex(67602);
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
            if (C57635a.f131550c > 0) {
                C57635a.f131550c--;
                this.f131555a.mo94944a(this.f131556b);
            }
            C57354e.m103957a("kids_api_compliance_settings", -1, -1, this.f131557c);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(KidsSettings kidsSettings) {
            KidsSettings kidsSettings2 = kidsSettings;
            C89219l.m154721d(kidsSettings2, "");
            if (kidsSettings2.status_code == 0) {
                AbstractC57642d dVar = this.f131556b;
                if (dVar != null) {
                    dVar.mo94943a(kidsSettings2);
                }
                C57635a.f131550c = 3;
            } else if (C57635a.f131550c > 0) {
                C57635a.f131550c--;
                this.f131555a.mo94944a(this.f131556b);
            }
            C57354e.m103957a("kids_api_compliance_settings", -1, 0, this.f131557c);
        }

        C57639b(C57637b bVar, AbstractC57642d dVar, long j) {
            this.f131555a = bVar;
            this.f131556b = dVar;
            this.f131557c = j;
        }
    }

    /* renamed from: a */
    public final void mo94944a(AbstractC57642d dVar) {
        this.f131553a.getKidsSettings().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C57639b(this, dVar, System.currentTimeMillis()));
    }
}
