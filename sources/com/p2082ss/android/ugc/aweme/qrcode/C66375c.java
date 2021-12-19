package com.p2082ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c */
public final class C66375c {
    static {
        Covode.recordClassIndex(77907);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m118064a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qrcode.C66375c.m118064a(java.lang.String):int");
    }

    /* renamed from: a */
    public static int m118063a(int i, String str) {
        if (i == 4 && TextUtils.equals(C31575b.m65865g().getCurUserId(), str)) {
            return R.string.dc6;
        }
        return R.string.f4f;
    }

    /* renamed from: b */
    public static String m118065b(int i, String str) {
        if (i == 1) {
            return "video";
        }
        if (i == 2) {
            return "challenge";
        }
        if (i == 3) {
            return "music";
        }
        if (i != 4) {
            if (i == 5) {
                return "live";
            }
            if (i == 8) {
                return "bodydance_detail";
            }
            if (i == 9) {
                return "shoot";
            }
            if (i == 17) {
                return "sticker_detail";
            }
            if (i == 23) {
                return "challenge";
            }
            if (i != 31) {
                return "text";
            }
            return "live";
        } else if (TextUtils.equals(C31575b.m65865g().getCurUserId(), str)) {
            return "personal_homepage";
        } else {
            return "others_homepage";
        }
    }
}
