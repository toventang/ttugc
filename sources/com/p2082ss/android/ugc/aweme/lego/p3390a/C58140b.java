package com.p2082ss.android.ugc.aweme.lego.p3390a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.lego.a.b */
public final class C58140b {

    /* renamed from: a */
    public static EnumC58085a f132399a = EnumC58085a.COLD_BOOT_BEGIN;

    /* renamed from: b */
    public static final C58140b f132400b = new C58140b();

    private C58140b() {
    }

    /* renamed from: a */
    public static boolean m105075a() {
        if (f132399a == EnumC58085a.COLD_BOOT_BEGIN || f132399a == EnumC58085a.COLD_BOOT_END) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m105076b() {
        if (f132399a == EnumC58085a.COLD_BOOT_END || f132399a == EnumC58085a.HOT_BOOT_END) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(68206);
    }
}
