package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;
import com.p2082ss.android.ugc.aweme.sec.C67829f;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.j */
public final class C58062j extends AbstractC58051c {
    static {
        Covode.recordClassIndex(68102);
    }

    public C58062j() {
        super(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.j$a */
    public static final class C58063a extends C67829f<Boolean> {

        /* renamed from: g */
        private Request f132300g;

        static {
            Covode.recordClassIndex(68103);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public Boolean mo95563b() {
            if (this.f132300g.getUrl().contains("/passport/user/check_email_registered") || this.f132300g.getUrl().contains("/passport/email/register/v2/")) {
                C39162r.m79460a("slide_verification_response", new C33744d().mo59983a("enter_method", C31575b.m65860b().getLoginMobEnterMethod()).mo59983a("status", "1").f79943a);
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public Boolean mo95562a() {
            if (this.f132300g.getUrl().contains("/passport/user/check_email_registered") || this.f132300g.getUrl().contains("/passport/email/register/v2/")) {
                C39162r.m79460a("slide_verification_response", new C33744d().mo59983a("enter_method", C31575b.m65860b().getLoginMobEnterMethod()).mo59983a("status", "2").f79943a);
            }
            return false;
        }

        public C58063a(Request request) {
            this.f132300g = request;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c
    /* renamed from: a */
    public final AbstractC58051c.C58052a mo95554a(C58057g gVar, Request request, C22099u uVar) {
        C58063a aVar = new C58063a(request);
        try {
            if (aVar.mo106935a(gVar.f132293a.f132298d) && ((Boolean) aVar.mo106932c()).booleanValue()) {
                return new AbstractC58051c.C58052a(true, true);
            }
            if (aVar.mo106934a(gVar.f132293a.f132295a) && ((Boolean) aVar.mo106932c()).booleanValue()) {
                return new AbstractC58051c.C58052a(true, true);
            }
            return C58050b.f132285a;
        } catch (Throwable unused) {
        }
    }
}
