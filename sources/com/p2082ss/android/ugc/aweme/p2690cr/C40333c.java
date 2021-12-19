package com.p2082ss.android.ugc.aweme.p2690cr;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.c */
public final class C40333c {

    /* renamed from: a */
    public static final C40333c f94508a = new C40333c();

    private C40333c() {
    }

    static {
        Covode.recordClassIndex(48134);
    }

    /* renamed from: b */
    public static boolean m81489b() {
        if (m81490c() >= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m81490c() {
        return m81488a().getInt("show_storage_manager_count", 0);
    }

    /* renamed from: d */
    public static boolean m81491d() {
        if (m81492e() >= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m81492e() {
        return m81488a().getInt("show_system_clean_count", 0);
    }

    /* renamed from: a */
    public static Keva m81488a() {
        Keva repoFromSp = Keva.getRepoFromSp(C17867d.m33078a(), "DiskManager", 0);
        C89219l.m154716b(repoFromSp, "");
        return repoFromSp;
    }
}
