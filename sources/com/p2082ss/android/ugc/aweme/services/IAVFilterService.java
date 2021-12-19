package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;

/* renamed from: com.ss.android.ugc.aweme.services.IAVFilterService */
public interface IAVFilterService {
    static {
        Covode.recordClassIndex(79613);
    }

    String getFilterFolder(FilterBean filterBean);

    void setFilterFolder(FilterBean filterBean, String str);
}
