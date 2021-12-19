package com.lynx.tasm.behavior.shadow;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.e */
public enum EnumC28540e {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    

    /* renamed from: a */
    private final int f67150a;

    public final int intValue() {
        return this.f67150a;
    }

    static {
        Covode.recordClassIndex(34541);
    }

    public static EnumC28540e fromInt(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown measureMode");
    }

    public static int fromMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return AT_MOST.intValue();
        }
        if (mode == 0) {
            return UNDEFINED.intValue();
        }
        if (mode == 1073741824) {
            return EXACTLY.intValue();
        }
        throw new IllegalArgumentException("Unknown measureSpec");
    }

    private EnumC28540e(int i) {
        this.f67150a = i;
    }
}
