package com.p2082ss.android.ugc.aweme.setting.p3726n;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.n.a */
public final class C68192a {

    /* renamed from: a */
    public static final C68192a f152683a = new C68192a();

    private C68192a() {
    }

    static {
        Covode.recordClassIndex(80391);
    }

    /* renamed from: a */
    public static Keva m120443a() {
        Keva repoFromSp = Keva.getRepoFromSp(C17867d.m33078a(), "DiskManager", 0);
        C89219l.m154716b(repoFromSp, "");
        return repoFromSp;
    }

    /* renamed from: a */
    public static boolean m120444a(boolean z) {
        return m120443a().getBoolean("has_show_disk_manager_dot", z);
    }
}
