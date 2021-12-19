package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bf */
public final class C38679bf {
    static {
        Covode.recordClassIndex(46220);
    }

    /* renamed from: a */
    public static void m78484a(Intent intent, Intent intent2) {
        if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!C13603b.m24435a((Collection) categories)) {
                for (String str : categories) {
                    intent2.addCategory(str);
                }
            }
        }
    }
}
