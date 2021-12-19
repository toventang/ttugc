package com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.b.d */
public final class C41385d {
    static {
        Covode.recordClassIndex(49280);
    }

    /* renamed from: a */
    public static final int m83274a(List<? extends Aweme> list, int i) {
        HashSet hashSet = new HashSet();
        int min = Math.min(i, list.size() - 1);
        int i2 = 0;
        if (min >= 0) {
            int i3 = 0;
            while (true) {
                if (!hashSet.contains(((Aweme) list.get(i2)).getAid())) {
                    hashSet.add(((Aweme) list.get(i2)).getAid());
                } else {
                    i3++;
                }
                if (i2 == min) {
                    break;
                }
                i2++;
            }
            i2 = i3;
        }
        return i - i2;
    }
}
