package com.lynx.tasm.p2043a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.lynx.tasm.a.d */
public final class C28437d {
    static {
        Covode.recordClassIndex(34427);
    }

    /* renamed from: a */
    public static final String m56839a(int i) {
        if (i == 1) {
            return "opacity";
        }
        if (i == 2) {
            return "scaleX";
        }
        switch (i) {
            case 4:
                return "scaleY";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "scaleXY";
            case 16:
                return "width";
            case 32:
                return "height";
            case 64:
                return "background-color";
            case 128:
                return "visibility";
            case 256:
                return "left";
            case 512:
                return "top";
            case 1024:
                return "right";
            case 2048:
                return "bottom";
            case 4096:
                return "transform";
            default:
                new IllegalArgumentException("Unsupported animated property: ".concat(String.valueOf(i)));
                return "none";
        }
    }
}
