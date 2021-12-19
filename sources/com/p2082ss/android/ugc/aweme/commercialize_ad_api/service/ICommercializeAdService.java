package com.p2082ss.android.ugc.aweme.commercialize_ad_api.service;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39044b;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39045c;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39047b;

/* renamed from: com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService */
public interface ICommercializeAdService {
    static {
        Covode.recordClassIndex(46651);
    }

    /* renamed from: a */
    AbstractC39043a mo67720a(int i);

    /* renamed from: a */
    AbstractC39047b<?> mo67721a(Context context, AbstractC39045c cVar);

    /* renamed from: a */
    void mo67722a(Application application, AbstractC39044b bVar, boolean z);

    /* renamed from: b */
    Widget mo67723b(Context context, AbstractC39045c cVar);

    /* renamed from: c */
    AbstractC39046a mo67724c(Context context, AbstractC39045c cVar);
}
