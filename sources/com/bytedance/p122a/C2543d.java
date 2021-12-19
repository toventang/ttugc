package com.bytedance.p122a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* renamed from: com.bytedance.a.d */
public final class C2543d {
    static {
        Covode.recordClassIndex(2922);
    }

    /* renamed from: a */
    public static String m7441a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1005512447:
                if (!str.equals("output")) {
                    return "";
                }
                return UGCMonitor.TYPE_POST;
            case -865586570:
                if (!str.equals("trends")) {
                    return "";
                }
                return "dongtai";
            case 3321751:
                if (!str.equals("like")) {
                    return "";
                }
                return "fav";
            default:
                return "";
        }
    }
}
