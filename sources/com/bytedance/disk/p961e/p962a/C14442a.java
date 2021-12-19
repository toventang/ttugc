package com.bytedance.disk.p961e.p962a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.disk.e.a.a */
public final class C14442a {
    static {
        Covode.recordClassIndex(16521);
    }

    /* renamed from: b */
    public static boolean m26375b(int i) {
        return i > 0 && i <= 6;
    }

    /* renamed from: a */
    public static String m26374a(int i) {
        switch (i) {
            case 0:
                return "\"wait register\"";
            case 1:
                return "\"registered\"";
            case 2:
                return "\"migrating\"";
            case 3:
                return "\"canceled\"";
            case 4:
                return "\"suspend\"";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "\"success\"";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "\"failed\"";
            default:
                return "\"unknown event:" + i + "\"";
        }
    }
}
