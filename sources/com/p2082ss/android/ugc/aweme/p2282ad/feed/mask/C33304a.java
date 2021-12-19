package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.a */
public final class C33304a extends C39048a {
    static {
        Covode.recordClassIndex(40137);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: c */
    public final AbstractC39046a mo59141c(Context context, AbstractC39045c cVar) {
        ViewStub viewStub;
        MethodCollector.m26663i(7917);
        C89219l.m154721d(cVar, "");
        if (!(cVar instanceof C33313c) || (viewStub = ((C33313c) cVar).f79147f) == null) {
            AbstractC39046a c = super.mo59141c(context, cVar);
            MethodCollector.m26664o(7917);
            return c;
        }
        viewStub.setLayoutResource(R.layout.a_7);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            C33308b bVar = new C33308b((LinearLayout) inflate);
            MethodCollector.m26664o(7917);
            return bVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(7917);
        throw nullPointerException;
    }
}
