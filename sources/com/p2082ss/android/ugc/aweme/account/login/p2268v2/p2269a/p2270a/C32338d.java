package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.p2276o.C32887a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.d */
public final class C32338d extends AbstractC32581c {
    static {
        Covode.recordClassIndex(39106);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        C32887a.f78270a.invoke(this.f77733a, C32582d.m67060a(this.f77733a), "user_click").mo143251d(new C32339a(this)).mo143246c();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32338d(AbstractC32572b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.d$a */
    static final class C32339a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32338d f77135a;

        static {
            Covode.recordClassIndex(39107);
        }

        C32339a(C32338d dVar) {
            this.f77135a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32582d.m67064a((Fragment) this.f77135a.f77733a, true);
            AbstractC32572b bVar = this.f77135a.f77733a;
            Bundle arguments = this.f77135a.f77733a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_VERIFY.getValue());
            C89219l.m154716b(arguments, "");
            bVar.mo58461a(arguments);
        }
    }
}
