package com.bytedance.android.live.design.widget.tintable;

import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.live.design.widget.tintable.g */
public final class C4138g {
    static {
        Covode.recordClassIndex(4705);
    }

    /* renamed from: a */
    public static PorterDuff.Mode m10090a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
