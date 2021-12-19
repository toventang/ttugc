package com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2654a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a.a */
public final class C39465a {

    /* renamed from: a */
    private final AbstractC89244h f93129a = C89250i.m154773a((AbstractC89171a) C39468b.f93133a);

    static {
        Covode.recordClassIndex(47154);
    }

    /* renamed from: a */
    public final PolicyNoticeApi.API mo68917a() {
        return (PolicyNoticeApi.API) this.f93129a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a.a$b */
    static final class C39468b extends AbstractC89220m implements AbstractC89171a<PolicyNoticeApi.API> {

        /* renamed from: a */
        public static final C39468b f93133a = new C39468b();

        static {
            Covode.recordClassIndex(47157);
        }

        C39468b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ PolicyNoticeApi.API invoke() {
            return PolicyNoticeApi.f93135a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a.a$a */
    public static final class CallableC39466a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C39465a f93130a;

        /* renamed from: b */
        final /* synthetic */ int f93131b;

        static {
            Covode.recordClassIndex(47155);
        }

        CallableC39466a(C39465a aVar, int i) {
            this.f93130a = aVar;
            this.f93131b = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C39456a.f93110f = this.f93131b;
            return this.f93130a.mo68917a().getPolicyNotice(this.f93131b).mo5532a(C394671.f93132a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a.a$c */
    public static final class C39469c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f93134a;

        static {
            Covode.recordClassIndex(47158);
        }

        C39469c(AbstractC89171a aVar) {
            this.f93134a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f93134a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo68918a(int i) {
        C1731i.m5640b(new CallableC39466a(this, i), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo68919a(String str, String str2, String str3, String str4, Integer num, Integer num2, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        mo68917a().policyNoticeApprove(str, str2, str3, str4, num, num2).mo5534a(new C39469c(aVar), C1731i.f5564c, null);
    }
}
