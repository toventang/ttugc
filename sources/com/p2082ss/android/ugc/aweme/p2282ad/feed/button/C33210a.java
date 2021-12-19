package com.p2082ss.android.ugc.aweme.p2282ad.feed.button;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.button.a */
public final class C33210a extends C39048a {
    static {
        Covode.recordClassIndex(40033);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: c */
    public final AbstractC39046a mo59141c(Context context, AbstractC39045c cVar) {
        ViewStub viewStub;
        MethodCollector.m26663i(6663);
        C89219l.m154721d(cVar, "");
        if (!(cVar instanceof C33211b) || (viewStub = ((C33211b) cVar).f78907a) == null) {
            AbstractC39046a c = super.mo59141c(context, cVar);
            MethodCollector.m26664o(6663);
            return c;
        }
        viewStub.setLayoutResource(R.layout.aey);
        View findViewById = viewStub.inflate().findViewById(R.id.azs);
        if (findViewById != null) {
            AbstractC39046a aVar = (AbstractC39046a) findViewById;
            MethodCollector.m26664o(6663);
            return aVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize_ad_api.view.IAdView");
        MethodCollector.m26664o(6663);
        throw nullPointerException;
    }
}
