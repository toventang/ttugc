package com.p2082ss.android.ugc.aweme.commercialize.profile.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38396e;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.e */
public final class C38444e extends C39048a {
    static {
        Covode.recordClassIndex(45952);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: c */
    public final AbstractC39046a mo59141c(Context context, AbstractC39045c cVar) {
        ViewStub viewStub;
        MethodCollector.m26663i(10727);
        C89219l.m154721d(cVar, "");
        if (!(cVar instanceof C38396e) || (viewStub = ((C38396e) cVar).f90720e) == null) {
            AbstractC39046a c = super.mo59141c(context, cVar);
            MethodCollector.m26664o(10727);
            return c;
        }
        viewStub.setLayoutResource(R.layout.ame);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            C38445f fVar = new C38445f((LinearLayout) inflate);
            MethodCollector.m26664o(10727);
            return fVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(10727);
        throw nullPointerException;
    }
}
