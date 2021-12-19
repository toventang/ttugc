package com.facebook.imagepipeline.p1880e;

import com.bytedance.covode.number.Covode;
import com.facebook.p1826c.p1828b.AbstractC24045d;
import com.facebook.p1826c.p1828b.AbstractC24056i;
import com.facebook.p1826c.p1828b.C24042c;
import com.facebook.p1826c.p1828b.C24048e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.imagepipeline.e.b */
public final class C24407b implements AbstractC24411f {

    /* renamed from: a */
    private AbstractC24408c f57866a;

    static {
        Covode.recordClassIndex(28550);
    }

    public C24407b(AbstractC24408c cVar) {
        this.f57866a = cVar;
    }

    @Override // com.facebook.imagepipeline.p1880e.AbstractC24411f
    /* renamed from: a */
    public final AbstractC24056i mo40221a(C24042c cVar) {
        AbstractC24045d a = this.f57866a.mo40222a(cVar);
        C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.FIXED);
        a2.f95505c = 1;
        ExecutorService a3 = C40780g.m82242a(a2.mo70028a());
        return new C24048e(a, cVar.f56922g, new C24048e.C24051b(cVar.f56921f, cVar.f56920e, cVar.f56919d), cVar.f56924i, cVar.f56923h, a3, cVar.f56927l);
    }
}
