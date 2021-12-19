package com.lynx.tasm.behavior.p2052ui.p2053a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.a.h */
public enum EnumC28596h {
    REPEAT,
    NO_REPEAT,
    REPEAT_X,
    REPEAT_Y,
    ROUND,
    SPACE;

    static {
        Covode.recordClassIndex(34631);
    }

    public static EnumC28596h valueOf(int i) {
        if (i == 0) {
            return REPEAT;
        }
        if (i == 1) {
            return NO_REPEAT;
        }
        if (i == 2) {
            return REPEAT_X;
        }
        if (i == 3) {
            return REPEAT_Y;
        }
        if (i == 4) {
            return ROUND;
        }
        if (i != 5) {
            return REPEAT;
        }
        return SPACE;
    }
}
