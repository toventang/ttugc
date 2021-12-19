package com.p2082ss.android.ugc.aweme.services.superentrance;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService */
public interface ISuperEntrancePrivacyService {
    static {
        Covode.recordClassIndex(79995);
    }

    boolean hasPrivacyPermission(Context context);
}
