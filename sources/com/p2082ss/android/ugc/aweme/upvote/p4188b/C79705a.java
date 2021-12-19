package com.p2082ss.android.ugc.aweme.upvote.p4188b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;

/* renamed from: com.ss.android.ugc.aweme.upvote.b.a */
public final class C79705a {

    /* renamed from: a */
    public static final C79705a f178839a = new C79705a();

    /* renamed from: b */
    private static final int f178840b = 1;

    /* renamed from: c */
    private static final int f178841c = 2;

    private C79705a() {
    }

    /* renamed from: b */
    public static boolean m138534b() {
        if (m138536d() == f178840b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m138535c() {
        if (m138536d() == f178841c) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m138536d() {
        return C16048b.m29633a().mo25412a(true, "tt_upvote_experiment", 0);
    }

    static {
        Covode.recordClassIndex(92926);
    }

    /* renamed from: a */
    public static boolean m138533a() {
        int i = f178840b;
        int i2 = f178841c;
        int d = m138536d();
        if (i <= d && i2 >= d && !C56216k.m102133c()) {
            return true;
        }
        return false;
    }
}
