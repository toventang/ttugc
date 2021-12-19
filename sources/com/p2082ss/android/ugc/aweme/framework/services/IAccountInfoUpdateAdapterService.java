package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService */
public interface IAccountInfoUpdateAdapterService {
    static {
        Covode.recordClassIndex(60664);
    }

    User getUser();

    int userDefaultAllowStatus();
}
