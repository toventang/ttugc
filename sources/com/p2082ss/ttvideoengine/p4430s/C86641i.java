package com.p2082ss.ttvideoengine.p4430s;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4425o.C86594a;

/* renamed from: com.ss.ttvideoengine.s.i */
public final class C86641i {

    /* renamed from: a */
    public static int f195274a = 112;

    /* renamed from: b */
    public static AbstractC86642j f195275b;

    /* renamed from: c */
    public static int f195276c = 116;

    static {
        Covode.recordClassIndex(101869);
    }

    /* renamed from: a */
    public static boolean m150111a() {
        if (((f195274a >> 1) & 1) == 1 || ((f195276c >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m150114b() {
        if (((f195274a >> 6) & 1) == 1 || ((f195276c >> 6) & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m150112b(int i) {
        int i2 = f195276c & -5;
        f195276c = i2;
        f195276c = (i << 2) | i2;
    }

    /* renamed from: a */
    public static void m150109a(int i) {
        int i2 = f195274a & -3;
        f195274a = i2;
        int i3 = i2 | (i << 1);
        f195274a = i3;
        if (i == 1) {
            int i4 = i3 & -5;
            f195274a = i4;
            f195274a = i4 | 4;
            ABRConfig.setLoglevel(1);
            C86594a.m149985a().f195114k = true;
        } else {
            C86594a.m149985a().f195114k = false;
            if (i <= 0) {
                C86385d.m148977e(6);
                return;
            }
        }
        C86385d.m148977e(1);
    }

    /* renamed from: a */
    public static void m150110a(String str, String str2) {
        if (((f195276c >> 2) & 1) == 1) {
            m150118f(str, str2);
        }
        if (((f195274a >> 2) & 1) == 1) {
            C1764a.m5928a("<%s>%s", new Object[]{str, str2});
        }
    }

    /* renamed from: b */
    public static void m150113b(String str, String str2) {
        if (((f195276c >> 1) & 1) == 1) {
            m150118f(str, str2);
        }
        if (((f195274a >> 1) & 1) == 1) {
            C1764a.m5928a("<%s>%s", new Object[]{str, str2});
        }
    }

    /* renamed from: c */
    public static void m150115c(String str, String str2) {
        if (((f195276c >> 5) & 1) == 1) {
            m150118f(str, str2);
        }
        if (((f195274a >> 5) & 1) == 1) {
            C1764a.m5928a("<%s>%s", new Object[]{str, str2});
        }
    }

    /* renamed from: d */
    public static void m150116d(String str, String str2) {
        if (((f195276c >> 3) & 1) == 1) {
            m150118f(str, str2);
        }
        if (((f195274a >> 3) & 1) == 1) {
            C1764a.m5928a("<%s>%s", new Object[]{str, str2});
        }
    }

    /* renamed from: e */
    public static void m150117e(String str, String str2) {
        if (((f195276c >> 6) & 1) == 1) {
            m150118f(str, str2);
        }
        if (((f195274a >> 6) & 1) == 1) {
            C1764a.m5928a("<%s>%s", new Object[]{str, str2});
        }
    }

    /* renamed from: f */
    private static void m150118f(String str, String str2) {
        if (f195275b != null && !TextUtils.isEmpty(str2)) {
            AbstractC86642j jVar = f195275b;
            if (!TextUtils.isEmpty(str)) {
                str2 = "TTVideoEngine: tag = " + str + ";  " + str2 + "\n";
            }
            jVar.mo124485a(str2);
        }
    }
}
