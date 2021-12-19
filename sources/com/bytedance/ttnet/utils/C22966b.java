package com.bytedance.ttnet.utils;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.ttnet.utils.b */
public final class C22966b {
    static {
        Covode.recordClassIndex(26883);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static String m43297a(Context context, int i) {
        String a;
        switch (i) {
            case 1:
                a = TTNetInit.getTTNetDepend().mo37260a(context, "ssids", "");
                break;
            case 2:
                a = TTNetInit.getTTNetDepend().mo37260a(context, "dns", "");
                break;
            case 3:
                a = TTNetInit.getTTNetDepend().mo37260a(context, "https_dns", "");
                break;
            case 4:
                a = TTNetInit.getTTNetDepend().mo37260a(context, "tnc_config", "");
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                try {
                    a = TTNetInit.getTTNetDepend().mo37260a(context, "tnc_etag", "");
                    break;
                } catch (Exception unused) {
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                a = TTNetInit.getTTNetDepend().mo37260a(context, "tnc_abtest", "");
                break;
            default:
                a = "";
                break;
        }
        if (a instanceof String) {
            return String.valueOf(a);
        }
        return "";
    }

    /* renamed from: a */
    public static void m43298a(Context context, int i, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    linkedHashMap.put("tnc_etag", str);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    linkedHashMap.put("tnc_abtest", str);
                    break;
            }
            Logger.debug();
            TTNetInit.getTTNetDepend().mo37261a(context, linkedHashMap);
        } catch (Exception unused) {
        }
    }
}
