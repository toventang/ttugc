package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.c */
public final class C32337c extends AbstractC32581c {

    /* renamed from: b */
    private final AbstractC32572b f77133b;

    /* renamed from: c */
    private final String f77134c;

    static {
        Covode.recordClassIndex(39105);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        new C79459a(C17867d.m33078a()).mo123052a(this.f77134c).mo123053a();
        this.f77133b.requireActivity().finish();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32337c(AbstractC32572b bVar, String str) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f77133b = bVar;
        this.f77134c = str;
    }
}
