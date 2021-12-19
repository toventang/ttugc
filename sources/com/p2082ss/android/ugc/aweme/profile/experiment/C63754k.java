package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.k */
public final class C63754k {

    /* renamed from: a */
    public static final int f144518a = 0;

    /* renamed from: b */
    public static boolean f144519b;

    /* renamed from: c */
    public static boolean f144520c;

    /* renamed from: d */
    public static boolean f144521d;

    /* renamed from: e */
    public static final C63754k f144522e = new C63754k();

    /* renamed from: f */
    private static final int f144523f = 1;

    /* renamed from: g */
    private static final int f144524g = 2;

    private C63754k() {
    }

    /* renamed from: a */
    private static int m115283a() {
        return C16048b.m29633a().mo25412a(false, "use_popup_for_settings", 0);
    }

    static {
        boolean z;
        boolean z2;
        Covode.recordClassIndex(75082);
        boolean z3 = true;
        if (m115283a() == f144518a) {
            z = true;
        } else {
            z = false;
        }
        f144519b = z;
        if (m115283a() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        f144520c = z2;
        if (m115283a() != 2) {
            z3 = false;
        }
        f144521d = z3;
    }
}
