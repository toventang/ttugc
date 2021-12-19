package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.util.C33043l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.l */
public final class C32351l extends AbstractC32581c {

    /* renamed from: b */
    private final AbstractC32572b f77158b;

    /* renamed from: c */
    private final int f77159c;

    /* renamed from: d */
    private final String f77160d;

    static {
        Covode.recordClassIndex(39119);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        if (!this.f77158b.af_()) {
            return true;
        }
        AbstractC32572b bVar = this.f77158b;
        int i = this.f77159c;
        bVar.mo57442a(i, C33043l.m67678a(Integer.valueOf(i), this.f77160d));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32351l(AbstractC32572b bVar, int i, String str) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f77158b = bVar;
        this.f77159c = i;
        this.f77160d = str;
    }
}
