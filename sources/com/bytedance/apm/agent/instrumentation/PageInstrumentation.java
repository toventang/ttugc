package com.bytedance.apm.agent.instrumentation;

import com.bytedance.covode.number.Covode;

public class PageInstrumentation {
    static {
        Covode.recordClassIndex(14032);
    }

    public static void onAction(String str, String str2) {
    }

    public static void onPageShowHideAction(Object obj, boolean z) {
    }
}
