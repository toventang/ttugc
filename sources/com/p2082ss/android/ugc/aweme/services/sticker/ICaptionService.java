package com.p2082ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.ICaptionService */
public interface ICaptionService {
    static {
        Covode.recordClassIndex(79967);
    }

    boolean getAlwaysShowCaptionStatus();

    String getCaptionCacheDir();

    boolean isConsumptionEnableAutoCaption();

    void setAlwaysShowCaptionStatus(boolean z);
}
