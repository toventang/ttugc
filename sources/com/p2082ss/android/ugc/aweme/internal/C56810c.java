package com.p2082ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.internal.c */
public final class C56810c {

    /* renamed from: a */
    public static final int f129380a = 0;

    /* renamed from: b */
    public static final C56810c f129381b = new C56810c();

    /* renamed from: c */
    private static final int f129382c = 1;

    /* renamed from: d */
    private static final int f129383d = 2;

    private C56810c() {
    }

    static {
        Covode.recordClassIndex(66690);
    }

    /* renamed from: a */
    public static final boolean m103051a() {
        try {
            if (C16048b.m29633a().mo25412a(true, "cla_consumer_group", 0) != f129380a) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
