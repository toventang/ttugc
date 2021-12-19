package com.bytedance.globalpayment.iap.google.helper;

import android.text.TextUtils;
import com.android.billingclient.api.C2242h;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.globalpayment.iap.google.helper.c */
public final class C15199c {
    static {
        Covode.recordClassIndex(17380);
    }

    /* renamed from: a */
    public static C15126d m28008a(C2242h hVar) {
        String str;
        C15126d dVar = new C15126d();
        int b = m28010b(hVar);
        dVar.withErrorCode(b);
        if (TextUtils.isEmpty(hVar.f6733b)) {
            str = m28009a(b);
        } else {
            str = hVar.f6733b;
        }
        dVar.withMessage(str);
        return dVar;
    }

    /* renamed from: a */
    private static String m28009a(int i) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        if (i < 0 || i > split.length - 1) {
            return "Unknown.";
        }
        return split[i];
    }

    /* renamed from: b */
    private static int m28010b(C2242h hVar) {
        int i = hVar.f6732a;
        if (i == Integer.MIN_VALUE) {
            return -4;
        }
        switch (i) {
            case -3:
                return -3;
            case -2:
                return -2;
            case -1:
                return -1;
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return 5;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return 6;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return 7;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return 8;
            default:
                return Integer.MIN_VALUE;
        }
    }
}
