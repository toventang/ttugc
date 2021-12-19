package com.p2082ss.android.ugc.aweme.ttep.p4153d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.beauty.C34809f;
import com.p2082ss.android.ugc.aweme.p2721cx.AbstractC40800a;
import com.p2082ss.android.ugc.aweme.p2721cx.C40801b;
import com.p2082ss.android.ugc.aweme.p2721cx.C40845e;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.d.a */
public final class C79255a implements AbstractC40800a {
    static {
        Covode.recordClassIndex(92442);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.d.a$a */
    static final class C79256a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C40801b.C40805c f178075a;

        static {
            Covode.recordClassIndex(92443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79256a(C40801b.C40805c cVar) {
            super(0);
            this.f178075a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f178075a.f95537b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2721cx.AbstractC40800a
    /* renamed from: a */
    public final C40801b.C40802a mo70035a(C21582f fVar, C40845e eVar, C40801b.C40805c cVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154716b(fVar.mo35249a(ShortVideoContext.class, (String) null), "");
        C34809f.m71120a();
        C40801b.C40802a aVar = new C40801b.C40802a();
        aVar.mo70041a(eVar.mo70043a(), C40801b.C40802a.C40803a.f95535a).mo70041a(eVar.mo70054l(), new C79256a(cVar));
        return aVar;
    }
}
