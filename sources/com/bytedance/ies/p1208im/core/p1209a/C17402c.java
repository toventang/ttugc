package com.bytedance.ies.p1208im.core.p1209a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.p1399im.core.internal.utils.C20009m;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19541aj;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.c */
public final class C17402c extends AbstractC17432d {

    /* renamed from: b */
    public final String f41748b;

    /* renamed from: c */
    public final int[] f41749c;

    /* renamed from: d */
    public final int f41750d = 7;

    /* renamed from: e */
    private final AbstractC89244h f41751e = C89250i.m154773a((AbstractC89171a) new C17403a(this));

    static {
        Covode.recordClassIndex(19889);
    }

    /* renamed from: d */
    private final C19541aj m32215d() {
        return (C19541aj) this.f41751e.getValue();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d
    /* renamed from: b */
    public final void mo27755b() {
        m32215d().mo31304a();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d
    /* renamed from: c */
    public final List<C19538ai> mo27756c() {
        C20009m mVar = m32215d().f46387d;
        C89219l.m154716b(mVar, "");
        return mVar;
    }

    /* renamed from: com.bytedance.ies.im.core.a.c$a */
    static final class C17403a extends AbstractC89220m implements AbstractC89171a<C19541aj> {

        /* renamed from: a */
        final /* synthetic */ C17402c f41752a;

        static {
            Covode.recordClassIndex(19890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17403a(C17402c cVar) {
            super(0);
            this.f41752a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19541aj invoke() {
            return new C19541aj(this.f41752a.f41748b, this.f41752a.f41749c, this.f41752a.f41750d);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d
    /* renamed from: a */
    public final void mo27753a() {
        C19541aj d = m32215d();
        d.f46388e = null;
        d.f46387d.clear();
        C20014q.m37816a().mo31906b(d.f46384a, d);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17432d
    /* renamed from: a */
    public final void mo27754a(AbstractC17425d dVar) {
        C89219l.m154721d(dVar, "");
        C19541aj d = m32215d();
        d.f46388e = dVar;
        C20014q.m37816a().mo31897a(d.f46384a, d);
    }

    public C17402c(String str, int[] iArr, int i) {
        C89219l.m154721d(str, "");
        this.f41748b = str;
        this.f41749c = iArr;
    }
}
