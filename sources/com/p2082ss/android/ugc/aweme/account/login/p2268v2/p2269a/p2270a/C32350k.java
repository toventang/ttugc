package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.k */
public final class C32350k extends AbstractC32581c {

    /* renamed from: b */
    private final AbstractC32572b f77156b;

    /* renamed from: c */
    private final String f77157c;

    static {
        Covode.recordClassIndex(39118);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        C31940a.C31941a b = C32582d.m67066b(this.f77156b);
        C31940a.m66306a(b);
        AbstractC32572b bVar = this.f77156b;
        String a = C31940a.m66306a(b);
        C89219l.m154716b(a, "");
        C32407x.m66800a(bVar, a, this.f77157c, EnumC32592i.SIGN_UP, this.f77156b.mo58460Z_()).mo143246c();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32350k(AbstractC32572b bVar, String str) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f77156b = bVar;
        this.f77157c = str;
    }
}
