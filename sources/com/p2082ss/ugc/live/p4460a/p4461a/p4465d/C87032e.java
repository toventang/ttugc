package com.p2082ss.ugc.live.p4460a.p4461a.p4465d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.C87034e;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.AbstractC87015b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c;

/* renamed from: com.ss.ugc.live.a.a.d.e */
public final class C87032e implements AbstractC87027a<String> {

    /* renamed from: a */
    private static AbstractC87031d<String> f196209a;

    /* renamed from: b */
    private static AbstractC87031d<String> f196210b;

    /* renamed from: c */
    private AbstractC87015b f196211c = new C87017c();

    static {
        Covode.recordClassIndex(102798);
    }

    /* renamed from: a */
    private AbstractC87031d<String> m150732a(C87034e eVar) {
        return new C87028b(new C87029c(this.f196211c, eVar.f196214a));
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87027a
    /* renamed from: a */
    public final AbstractC87031d<String> mo16298a(C87020c cVar, C87034e eVar) {
        if (!cVar.f196194f) {
            AbstractC87031d<String> dVar = f196210b;
            if (dVar != null) {
                return dVar;
            }
            AbstractC87031d<String> a = m150732a(eVar);
            f196210b = a;
            return a;
        }
        AbstractC87031d<String> dVar2 = f196209a;
        if (dVar2 != null) {
            return dVar2;
        }
        C87033f fVar = new C87033f(m150732a(eVar));
        f196209a = fVar;
        return fVar;
    }
}
