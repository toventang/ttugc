package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.app.api.C33639l;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.h */
public final class C58059h extends AbstractC58051c {
    static {
        Covode.recordClassIndex(68099);
    }

    public C58059h(AbstractC58051c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c
    /* renamed from: a */
    public final AbstractC58051c.C58052a mo95554a(C58057g gVar, Request request, C22099u uVar) {
        if (gVar.f132294b > 0) {
            C33639l.f79832a = gVar.f132294b;
            C33639l.f79833b = System.currentTimeMillis();
        }
        return C58050b.f132285a;
    }
}
