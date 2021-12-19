package com.p2082ss.ugc.effectplatform.p4440a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4448e.C86769d;
import com.p2082ss.ugc.effectplatform.p4448e.C86774g;
import com.p2082ss.ugc.effectplatform.p4448e.C86775h;
import com.p2082ss.ugc.effectplatform.p4448e.EnumC86773f;
import com.p2082ss.ugc.effectplatform.task.C86880aj;
import com.p2082ss.ugc.effectplatform.task.C86933k;
import com.p2082ss.ugc.effectplatform.task.p4459c.C86904a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.a.c */
public final class C86696c implements AbstractC86691a {

    /* renamed from: a */
    public final C86687a f195509a;

    static {
        Covode.recordClassIndex(102394);
    }

    public C86696c(C86687a aVar) {
        C89219l.m154719c(aVar, "");
        this.f195509a = aVar;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.AbstractC86691a
    /* renamed from: a */
    public final C86880aj<C86904a> mo78960a(C86693b bVar) {
        C89219l.m154719c(bVar, "");
        C86769d.C86770a aVar = new C86769d.C86770a();
        V v = this.f195509a.f195462r.f199870a;
        if (v == null) {
            C89219l.m154707a();
        }
        return new C86933k(bVar, aVar.mo140024a((AbstractC86700d) v).mo140026a(new C86774g(bVar, this.f195509a)).mo140027a(new C86775h(bVar.f195505a)).mo140025a(EnumC86773f.EFFECT).mo140028a(), this.f195509a);
    }
}
