package com.p2082ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.u */
public final class C49656u {
    static {
        Covode.recordClassIndex(58503);
    }

    /* renamed from: a */
    public static AbstractC80747i m93101a(Activity activity) {
        if (activity instanceof ActivityC0945e) {
            return FeedSharePlayerViewModel.getPlayerManager((ActivityC0945e) activity);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m93102b(Activity activity) {
        if (m93101a(activity) != null) {
            return true;
        }
        return false;
    }
}
