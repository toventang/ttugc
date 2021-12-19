package com.p2082ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.EnumC31926c;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.f */
public final class C31563f {

    /* renamed from: a */
    public static final C31563f f75499a = new C31563f();

    private C31563f() {
    }

    static {
        Covode.recordClassIndex(38282);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.f$a */
    public static final class C31564a extends AbstractC89220m implements AbstractC89171a<C31376a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31549a f75500a;

        static {
            Covode.recordClassIndex(38283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31564a(AbstractC31549a aVar) {
            super(0);
            this.f75500a = aVar;
        }

        /* renamed from: a */
        public final C31376a invoke() {
            C31376a a = new C31376a().mo57399a("user_type", C31563f.m65841a(this.f75500a.mo57555a())).mo57399a("enter_from", this.f75500a.mo57557c()).mo57397a("is_success", C31563f.m65840a(this.f75500a.mo57556b())).mo57397a("error_code", this.f75500a.mo57556b().getStatus_code()).mo57399a("enter_method", this.f75500a.mo57558d());
            String str = "existing";
            if (!C89219l.m154714a((Object) C31563f.m65841a(this.f75500a.mo57555a()), (Object) str)) {
                str = this.f75500a.mo57559e();
            }
            C31376a a2 = a.mo57399a("platform", str).mo57398a("page_stay_time", this.f75500a.mo57560f()).mo57397a("is_reg_name", this.f75500a.mo57561g() ? 1 : 0);
            C89219l.m154716b(a2, "");
            return a2;
        }
    }

    /* renamed from: a */
    public static int m65840a(AgeGateResponse ageGateResponse) {
        if (ageGateResponse.getStatus_code() == 0 && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m65841a(EnumC31926c cVar) {
        int i = C31565g.f75501a[cVar.ordinal()];
        if (i == 1) {
            return "existing";
        }
        if (i == 2) {
            return "new";
        }
        throw new C89376n();
    }

    /* renamed from: a */
    public static void m65842a(AbstractC31549a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof AbstractC31549a.C31553d)) {
            C31376a a = new C31564a(aVar).invoke();
            if (aVar instanceof AbstractC31549a.C31551b) {
                a.mo57397a("user_age_status", ((AbstractC31549a.C31551b) aVar).f75470b);
                a.mo57397a("has_delete_content", aVar.mo57556b().is_prompt() ? 1 : 0);
            }
            C39162r.m79460a(aVar.f75455a, a.f75156a);
        }
    }

    /* renamed from: a */
    public static final void m65843a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("age_gate_info_popup_show", new C31376a().mo57399a("enter_method", str).f75156a);
    }

    /* renamed from: a */
    public static void m65845a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("reg_name_page_error", new C31376a().mo57399a("enter_from", str).mo57399a("enter_method", str2).f75156a);
    }

    /* renamed from: a */
    public static final void m65844a(String str, int i, long j) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("reg_name_page_response", new C31376a().mo57399a("enter_from", str).mo57399a("platform", "phone_or_email").mo57399a("user_type", "new").mo57397a("is_success", i).mo57398a("page_stay_time", j).f75156a);
    }
}
