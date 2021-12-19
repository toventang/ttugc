package com.bytedance.apm.agent.p757v2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.agent.v2.InstructOperationSwitch */
public class InstructOperationSwitch {
    public static boolean sPageLoadSwitch = true;
    public static boolean sUiSwitch = true;

    static {
        Covode.recordClassIndex(14082);
    }
}
