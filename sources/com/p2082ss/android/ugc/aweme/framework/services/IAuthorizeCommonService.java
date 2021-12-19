package com.p2082ss.android.ugc.aweme.framework.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService */
public interface IAuthorizeCommonService {
    static {
        Covode.recordClassIndex(60666);
    }

    boolean isActivityAwemeAuthorize(Activity activity);
}
