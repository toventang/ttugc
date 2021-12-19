package com.p2082ss.android.ugc.aweme.commerce.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.ICommerceService */
public interface ICommerceService {
    static {
        Covode.recordClassIndex(44924);
    }

    Aweme getAwemeById(String str);

    void logCommerceEvents(String str, C37534a aVar);
}
