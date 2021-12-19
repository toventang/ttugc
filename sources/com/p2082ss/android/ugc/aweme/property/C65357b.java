package com.p2082ss.android.ugc.aweme.property;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.property.b */
public final class C65357b {

    /* renamed from: a */
    public static volatile boolean f147489a;

    /* renamed from: b */
    public static volatile boolean f147490b;

    static {
        Covode.recordClassIndex(76844);
    }

    /* renamed from: a */
    public static int m117042a(int i, int i2) {
        return (i <= 0 || i > 51) ? i2 : i;
    }

    /* renamed from: j */
    private static boolean m117054j() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public static boolean m117046b() {
        if (!m117054j() || !C65440dw.m117158a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m117043a() {
        if (!m117054j() || !C65379bs.m117075a() || f147490b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static float m117047c() {
        float a = SettingsManager.m29616a().mo25393a("video_bitrate", 1.0f);
        int a2 = C16048b.m29633a().mo25412a(true, "video_bitrate_category_index", 0);
        List<Float> a3 = C65415cy.m117134a();
        if (!C13617h.m24466b(a3) || a2 >= a3.size()) {
            return a;
        }
        float floatValue = a3.get(a2).floatValue();
        return floatValue == 0.0f ? a : floatValue;
    }

    /* renamed from: d */
    public static int m117048d() {
        int intValue;
        int a = m117042a(SettingsManager.m29616a().mo25394a("video_quality", 18), 18);
        int a2 = C16048b.m29633a().mo25412a(true, "video_quality_category_index", 0);
        List<Integer> a3 = C65420dc.m117139a();
        return (!C13617h.m24466b(a3) || a2 >= a3.size() || (intValue = a3.get(a2).intValue()) == 0) ? a : intValue;
    }

    /* renamed from: e */
    public static String m117049e() {
        int[] g = m117051g();
        if (g == null || g.length < 2) {
            return "";
        }
        return g[0] + "*" + g[1];
    }

    /* renamed from: f */
    public static String m117050f() {
        int[] h = m117052h();
        if (h == null || h.length < 2) {
            return "";
        }
        return h[0] + "*" + h[1];
    }

    /* renamed from: g */
    public static int[] m117051g() {
        int[] iArr;
        int[] a = m117045a(C65469ev.m117195a());
        int a2 = C65471ex.m117197a();
        List<String> a3 = C65470ew.m117196a();
        if (!C13617h.m24466b(a3) || a2 >= a3.size()) {
            iArr = null;
        } else {
            iArr = m117045a(a3.get(a2));
        }
        Arrays.toString(iArr);
        Arrays.toString(a);
        if (iArr != null) {
            return iArr;
        }
        return a;
    }

    /* renamed from: h */
    public static int[] m117052h() {
        int[] iArr;
        int[] a = m117045a(C65469ev.m117195a());
        int a2 = C65385by.m117082a();
        List<String> a3 = C65384bx.m117081a();
        if (!C13617h.m24466b(a3) || a2 >= a3.size()) {
            iArr = null;
        } else {
            iArr = m117045a(a3.get(a2));
        }
        Arrays.toString(iArr);
        Arrays.toString(a);
        if (iArr != null) {
            return iArr;
        }
        return a;
    }

    /* renamed from: i */
    public static boolean m117053i() {
        if (!m117054j() || !C63244g.m114602a().mo73277e().getWatermarkHardcode(false) || !C16048b.m29633a().mo25421a(true, "upload_save_local", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m117044a(int i) {
        int[] iArr;
        List<String> a = C65470ew.m117196a();
        if (!C13617h.m24466b(a) || i >= a.size()) {
            iArr = null;
        } else {
            iArr = m117045a(a.get(i));
        }
        Arrays.toString(iArr);
        return iArr;
    }

    /* renamed from: a */
    public static int[] m117045a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArr = new int[0];
        try {
            String[] split = str.split("x");
            int[] iArr2 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr2[i] = Integer.parseInt(split[i]);
            }
            iArr = iArr2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (iArr.length != 2) {
            return null;
        }
        return iArr;
    }
}
