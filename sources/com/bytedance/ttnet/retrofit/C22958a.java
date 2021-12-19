package com.bytedance.ttnet.retrofit;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.retrofit.a */
public final class C22958a {
    static {
        Covode.recordClassIndex(26872);
    }

    /* renamed from: a */
    public static boolean m43273a(String str, Set<String> set) {
        if (!C13627m.m24498a(str) && set != null) {
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    Logger.debug();
                    return true;
                }
            }
        }
        return false;
    }
}
