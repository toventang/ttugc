package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65406cr;
import java.util.Map;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.services.IVEABService */
public interface IVEABService {
    static {
        Covode.recordClassIndex(79647);
    }

    void clearPanel();

    C89378p<Object, Integer> getABValue(C65406cr.AbstractC65407a aVar);

    Map<String, C65406cr.AbstractC65407a> getVESDKABPropertyMap();

    void setABPanelValue(C65406cr.AbstractC65407a aVar, String str);
}
