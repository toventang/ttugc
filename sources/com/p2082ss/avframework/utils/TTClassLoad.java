package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.utils.TTClassLoad */
public class TTClassLoad {
    static {
        Covode.recordClassIndex(100748);
    }

    static Object getClassLoader() {
        return TTClassLoad.class.getClassLoader();
    }
}
