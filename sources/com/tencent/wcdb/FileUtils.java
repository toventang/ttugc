package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;

public class FileUtils {
    static {
        Covode.recordClassIndex(103088);
    }

    public static native int setPermissions(String str, int i, int i2, int i3);
}
