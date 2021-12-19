package com.p2082ss.android.ugc.aweme.utils.p4203d;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.p3488a.C61304a;

/* renamed from: com.ss.android.ugc.aweme.utils.d.c */
public final class C80329c {

    /* renamed from: a */
    public static int f179849a = 3;

    /* renamed from: b */
    private static int f179850b = 3;

    /* renamed from: c */
    private static int f179851c = 3;

    /* renamed from: d */
    private static int f179852d = 3;

    /* renamed from: e */
    private static int f179853e = 3;

    /* renamed from: f */
    private static int f179854f = 3;

    /* renamed from: g */
    private static int f179855g = 3;

    /* renamed from: h */
    private static int f179856h = 3;

    /* renamed from: i */
    private static int f179857i = 3;

    static {
        Covode.recordClassIndex(93597);
    }

    /* renamed from: a */
    public static boolean m139263a() {
        int i;
        int i2 = f179850b;
        if (i2 == 3) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) {
                i = 2;
            } else {
                i = 1;
            }
            f179850b = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m139264b() {
        int i;
        int i2 = f179855g;
        if (i2 == 3) {
            String a = C61304a.m110982a().mo98933a("ro.vivo.os.name");
            if (TextUtils.isEmpty(a) || !a.toLowerCase().contains("funtouch")) {
                i = 2;
            } else {
                i = 1;
            }
            f179855g = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m139265c() {
        int i;
        int i2 = f179857i;
        if (i2 == 3) {
            if (!TextUtils.isEmpty(C61304a.m110982a().mo98933a("ro.smartisan.version"))) {
                i = 1;
            } else {
                i = 2;
            }
            f179857i = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
