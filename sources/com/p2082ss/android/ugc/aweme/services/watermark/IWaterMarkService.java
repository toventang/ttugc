package com.p2082ss.android.ugc.aweme.services.watermark;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.watermark.C81506p;

/* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService */
public interface IWaterMarkService {
    static {
        Covode.recordClassIndex(80044);
    }

    void cancelWaterMark();

    void prepareDataForI18n(C81506p pVar);

    void waterMark(C81506p pVar);
}
