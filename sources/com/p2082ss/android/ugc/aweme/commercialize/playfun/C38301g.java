package com.p2082ss.android.ugc.aweme.commercialize.playfun;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.g */
public final class C38301g extends C39048a {
    static {
        Covode.recordClassIndex(45788);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b, com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.C39048a
    /* renamed from: b */
    public final Widget mo59004b(Context context, AbstractC39045c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar instanceof C38302h) {
            return new AdPlayFunWidget();
        }
        return super.mo59004b(context, cVar);
    }
}
