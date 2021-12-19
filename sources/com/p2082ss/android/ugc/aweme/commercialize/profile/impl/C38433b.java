package com.p2082ss.android.ugc.aweme.commercialize.profile.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38393b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.b */
public final class C38433b extends C39048a {
    static {
        Covode.recordClassIndex(45941);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: c */
    public final AbstractC39046a mo59141c(Context context, AbstractC39045c cVar) {
        ViewStub viewStub;
        MethodCollector.m26663i(11016);
        C89219l.m154721d(cVar, "");
        if (!(cVar instanceof C38393b) || (viewStub = ((C38393b) cVar).f90714a) == null) {
            AbstractC39046a c = super.mo59141c(context, cVar);
            MethodCollector.m26664o(11016);
            return c;
        }
        viewStub.setLayoutResource(R.layout.alh);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            C38434c cVar2 = new C38434c((LinearLayout) inflate);
            MethodCollector.m26664o(11016);
            return cVar2;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(11016);
        throw nullPointerException;
    }
}
