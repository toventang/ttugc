package com.p2082ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$loadMoreList$1 */
final class MusNewNotificationModel$loadMoreList$1<V> implements Callable {
    final /* synthetic */ List $notices;

    static {
        Covode.recordClassIndex(72969);
    }

    MusNewNotificationModel$loadMoreList$1(List list) {
        this.$notices = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MusNotificationApiManager.m111989a(this.$notices);
    }
}
