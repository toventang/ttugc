package com.bytedance.android.livesdk.feed;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.s */
public final class C8678s<T> implements AbstractC8652o<T> {
    static {
        Covode.recordClassIndex(9544);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8652o
    /* renamed from: a */
    public final boolean mo14953a(List<T> list, List<T> list2) {
        if (list == null) {
            if (list2 == null) {
                return true;
            }
        } else if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            T t2 = list2.get(i);
            if (t != null) {
                if (t2 != null && t.equals(t2)) {
                }
                return false;
            } else if (t2 != null) {
                return false;
            }
        }
        return true;
    }
}
