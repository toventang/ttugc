package com.p2082ss.android.ugc.aweme.p3382l;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.l.a */
public final class C58000a {
    static {
        Covode.recordClassIndex(68033);
    }

    /* renamed from: a */
    public static <T extends User> void m104814a(List<User> list, List<T> list2) {
        if (!C13603b.m24435a((Collection) list2)) {
            for (T t : list2) {
                if (!list.isEmpty()) {
                    Iterator<User> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        User next = it.next();
                        if (!(next == null || t == null || !TextUtils.equals(next.getUid(), t.getUid()))) {
                            break;
                        }
                    }
                }
                list.add(t);
            }
        }
    }
}
