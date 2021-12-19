package com.p2082ss.android.ugc.aweme.p2282ad.comment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2288c.C33146a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33151b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.a */
public final class C33135a extends C39048a {
    static {
        Covode.recordClassIndex(39951);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: a */
    public final AbstractC39047b<?> mo58995a(Context context, AbstractC39045c cVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        if (!(cVar instanceof C33148d)) {
            return super.mo58995a(context, cVar);
        }
        C33148d dVar = (C33148d) cVar;
        C33146a aVar = new C33146a(new C33151b(context), dVar.f78746i);
        aVar.f78735a.setEventType(dVar.f78744g);
        return aVar;
    }
}
