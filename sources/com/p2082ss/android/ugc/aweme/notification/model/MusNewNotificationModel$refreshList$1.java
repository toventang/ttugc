package com.p2082ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61804f;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$refreshList$1 */
final class MusNewNotificationModel$refreshList$1<V> implements Callable {
    final /* synthetic */ int $noticeGroup;
    final /* synthetic */ List $notices;
    final /* synthetic */ MusNewNotificationModel this$0;

    static {
        Covode.recordClassIndex(72970);
    }

    MusNewNotificationModel$refreshList$1(MusNewNotificationModel musNewNotificationModel, int i, List list) {
        this.this$0 = musNewNotificationModel;
        this.$noticeGroup = i;
        this.$notices = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if ((C61804f.m111867a() && this.$noticeGroup == 37) || this.$noticeGroup == 599) {
            return MusNotificationApiManager.m111990a(this.$notices, this.$noticeGroup);
        }
        if (this.$noticeGroup == C61530a.C61532b.m111445a()) {
            return MusNotificationApiManager.m111991a(this.$notices, this.this$0.liveData);
        }
        return MusNotificationApiManager.m111989a(this.$notices);
    }
}
