package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.os.Build;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.util.C63086d;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.d */
public final class C62965d {
    static {
        Covode.recordClassIndex(73802);
    }

    /* renamed from: a */
    static boolean m113419a(SparseIntArray sparseIntArray, Map<String, Object> map) {
        boolean z;
        boolean z2;
        if (!(sparseIntArray == null || map == null || sparseIntArray.get(54, 0) == 0 || Build.VERSION.SDK_INT < 21)) {
            String a = C63086d.m114019a();
            if (!TextUtils.isEmpty(a) && a.toLowerCase(Locale.US).startsWith("mt67")) {
                boolean booleanValue = ((Boolean) map.get("bytevc1")).booleanValue();
                if (1 == sparseIntArray.get(72, 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!booleanValue || z) {
                    if (1 == sparseIntArray.get(73, 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (booleanValue || z2) {
                        int intValue = ((Integer) map.get("header_video_height")).intValue();
                        int i = sparseIntArray.get(54, 0);
                        int i2 = -1;
                        if (i == 1) {
                            if (((Boolean) map.get("bytevc1")).booleanValue()) {
                                i2 = C63086d.m114021c();
                            } else {
                                i2 = C63086d.m114020b();
                            }
                        } else if (i == 2) {
                            i2 = sparseIntArray.get(53, -1);
                        }
                        C1764a.m5928a("isHeightExceed --> videoHeight:%s, heightUpperLimit:%s", new Object[]{Integer.valueOf(intValue), Integer.valueOf(i2)});
                        if (i2 <= 0 || intValue <= i2) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
