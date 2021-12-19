package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.IInternalAVService */
public interface IInternalAVService extends IFoundationAVService {
    static {
        Covode.recordClassIndex(79630);
    }

    boolean isPublishing(Context context);
}
