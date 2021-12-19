package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.at */
public final class C80226at {
    static {
        Covode.recordClassIndex(93494);
    }

    /* renamed from: a */
    public static String m139056a(String str) {
        List<String> a;
        if (!TextUtils.isEmpty(str) && str.contains("challenge/detail") && (a = C36132v.m73606a(str)) != null && a.size() > 0) {
            return a.get(a.size() - 1);
        }
        return null;
    }
}
