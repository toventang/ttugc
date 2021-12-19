package com.p2082ss.android.ugc.aweme.p2282ad.comment.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.depend.a */
public final class C33168a {

    /* renamed from: a */
    public static final IAdCommentDepend f78817a;

    /* renamed from: b */
    public static final C33168a f78818b = new C33168a();

    private C33168a() {
    }

    static {
        AbstractC39043a aVar;
        Covode.recordClassIndex(39987);
        ICommercializeAdService a = CommercializeAdServiceImpl.m79243a();
        if (a != null) {
            aVar = a.mo67720a(5);
        } else {
            aVar = null;
        }
        f78817a = (IAdCommentDepend) aVar;
    }
}
