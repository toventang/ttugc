package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ae */
public final class C63973ae {
    static {
        Covode.recordClassIndex(75417);
    }

    /* renamed from: b */
    public static int m115690b(User user) {
        if (user == null) {
            return 0;
        }
        if (m115689a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: a */
    public static List<FollowerDetail> m115688a(List<FollowerDetail> list) {
        ArrayList arrayList = new ArrayList();
        if (C13603b.m24435a((Collection) list)) {
            return arrayList;
        }
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FollowerDetail followerDetail = (FollowerDetail) it.next();
            if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m115689a(User user) {
        if (user == null || C13603b.m24435a((Collection) user.getFollowerDetailList())) {
            return false;
        }
        List<FollowerDetail> a = m115688a(user.getFollowerDetailList());
        if (!C13603b.m24435a((Collection) a) && a.size() > 1) {
            return true;
        }
        return false;
    }
}
