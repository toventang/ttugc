package com.p2082ss.android.ugc.aweme.services.badge;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.services.badge.IBadgeService */
public interface IBadgeService {
    static {
        Covode.recordClassIndex(79746);
    }

    void showBadgeShareDialog(Activity activity, Aweme aweme);
}
