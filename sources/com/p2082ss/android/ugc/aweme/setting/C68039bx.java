package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.setting.bx */
public final class C68039bx {

    /* renamed from: a */
    public static final boolean f152400a;

    /* renamed from: b */
    public static final boolean f152401b;

    /* renamed from: c */
    public static final boolean f152402c;

    /* renamed from: d */
    public static final boolean f152403d;

    /* renamed from: e */
    public static final C68039bx f152404e = new C68039bx();

    /* renamed from: f */
    private static final int f152405f;

    private C68039bx() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(80235);
        boolean z4 = true;
        int a = C16048b.m29633a().mo25412a(true, "creative_restore_work", 0);
        f152405f = a;
        if (a == 0 || a == 2) {
            z = false;
        } else {
            z = true;
        }
        f152400a = z;
        if (a == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        f152401b = z2;
        if (a >= 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        f152402c = z3;
        if (a != 2) {
            z4 = false;
        }
        f152403d = z4;
    }
}
