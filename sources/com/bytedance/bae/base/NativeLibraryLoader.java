package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;

public interface NativeLibraryLoader {
    static {
        Covode.recordClassIndex(15014);
    }

    boolean load(String str);
}
