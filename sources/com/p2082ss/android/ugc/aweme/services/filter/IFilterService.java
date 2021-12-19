package com.p2082ss.android.ugc.aweme.services.filter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;

/* renamed from: com.ss.android.ugc.aweme.services.filter.IFilterService */
public interface IFilterService {
    static {
        Covode.recordClassIndex(79885);
    }

    FilterBean getFilter(int i);

    String getFilterEnName(int i);

    void refreshData();
}
