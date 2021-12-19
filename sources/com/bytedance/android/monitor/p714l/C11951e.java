package com.bytedance.android.monitor.p714l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.l.e */
public final class C11951e {

    /* renamed from: a */
    public static final C11951e f28580a = new C11951e();

    private C11951e() {
    }

    static {
        Covode.recordClassIndex(13677);
    }

    /* renamed from: a */
    public static final String m21107a(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (str3 == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    return "tt" + str3 + "_webview_timing_monitor_custom_service";
                }
                break;
            case -136676079:
                if (str.equals("newcustom")) {
                    return "bd" + str3 + "_hybrid_monitor_custom_service";
                }
                break;
            case 571840923:
                if (str.equals("samplecustom")) {
                    return "bd" + str3 + "_hybrid_monitor_custom_sample_service";
                }
                break;
            case 831602183:
                if (str.equals("containerError")) {
                    return "bd_hybrid_monitor_service_containerError_".concat(String.valueOf(str3));
                }
                break;
        }
        return "bd_hybrid_monitor_service_" + str + '_' + str2 + '_' + str3;
    }
}
