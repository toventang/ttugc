package com.p2082ss.android.ugc.aweme.commercialize.profile.impl.p2614a;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38394c;
import com.p2082ss.android.ugc.aweme.commercialize.profile.impl.C38437d;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.a.a */
public final class C38431a extends C39048a {
    static {
        Covode.recordClassIndex(45939);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: c */
    public final AbstractC39046a mo59141c(Context context, AbstractC39045c cVar) {
        ViewStub viewStub;
        MethodCollector.m26663i(13300);
        C89219l.m154721d(cVar, "");
        if (!(cVar instanceof C38394c) || (viewStub = ((C38394c) cVar).f90715a) == null) {
            AbstractC39046a c = super.mo59141c(context, cVar);
            MethodCollector.m26664o(13300);
            return c;
        }
        viewStub.setLayoutResource(R.layout.am3);
        View inflate = viewStub.inflate();
        if (inflate != null) {
            C38437d dVar = new C38437d((LinearLayout) inflate);
            MethodCollector.m26664o(13300);
            return dVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(13300);
        throw nullPointerException;
    }
}
