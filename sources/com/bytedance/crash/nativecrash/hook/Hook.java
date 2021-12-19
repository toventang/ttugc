package com.bytedance.crash.nativecrash.hook;

import com.bytedance.covode.number.Covode;

public class Hook {
    static {
        Covode.recordClassIndex(16037);
    }

    private static native long doGetAddr_GOTHook_refresh();

    private static native long doGetAddr_GOTHook_register();
}
