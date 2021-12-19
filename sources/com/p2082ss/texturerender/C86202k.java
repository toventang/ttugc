package com.p2082ss.texturerender;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.texturerender.k */
public final class C86202k {
    static {
        Covode.recordClassIndex(101345);
    }

    /* renamed from: a */
    public static Class<?> m148115a(String str) {
        ClassLoader a;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("pluginName or/and className is empty");
        } else if (C86201j.f192325a == null || (a = C86201j.f192325a.mo136511a()) == null) {
            return Class.forName(str);
        } else {
            return Class.forName(str, true, a);
        }
    }
}
