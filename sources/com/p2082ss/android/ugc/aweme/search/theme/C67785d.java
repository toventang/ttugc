package com.p2082ss.android.ugc.aweme.search.theme;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.CardGradientBgData;
import com.p2082ss.android.ugc.aweme.utils.C80231ay;

/* renamed from: com.ss.android.ugc.aweme.search.theme.d */
public final class C67785d {
    static {
        Covode.recordClassIndex(79436);
    }

    /* renamed from: a */
    public static final C67782c m119956a(CardGradientBgData cardGradientBgData) {
        String str;
        int i;
        Integer darkModeItemSize;
        Integer num = null;
        if (cardGradientBgData != null) {
            str = cardGradientBgData.getDarkModeBgColor();
        } else {
            str = null;
        }
        Integer a = C80231ay.m139068a(str);
        if (a == null) {
            return null;
        }
        int intValue = a.intValue();
        if (cardGradientBgData == null || (darkModeItemSize = cardGradientBgData.getDarkModeItemSize()) == null) {
            i = 0;
        } else {
            i = darkModeItemSize.intValue();
        }
        if (i > 0) {
            num = Integer.valueOf(i - 1);
        }
        return new C67782c("dark", intValue, num, 8);
    }
}
