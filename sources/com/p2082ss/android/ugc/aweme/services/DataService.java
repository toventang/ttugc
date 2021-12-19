package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.deviceregister.p2135b.AbstractC29885d;

/* renamed from: com.ss.android.ugc.aweme.services.DataService */
public final class DataService extends BaseDataService {
    static {
        Covode.recordClassIndex(79609);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34881bk, com.p2082ss.android.ugc.aweme.services.BaseDataService
    public final void onDeviceRegistrationInfoChanged() {
        Keva repo = Keva.getRepo("did_set_time");
        if (AbstractC29885d.f71287A && repo.getLong("did_set_time", -1) == -1) {
            repo.storeLong("did_set_time", System.currentTimeMillis());
        }
    }
}
