package com.p2082ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Comparator;
import p4600h.p4602b.C89090a;

/* renamed from: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1 */
public final class MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1<T> implements Comparator {
    static {
        Covode.recordClassIndex(72973);
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C89090a.m154604a(Integer.valueOf(((MusNotice) t).lowestPosition), Integer.valueOf(((MusNotice) t2).lowestPosition));
    }
}
