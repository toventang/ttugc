package com.p2082ss.android.ugc.aweme.trending;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.a */
public final class C79040a {

    /* renamed from: a */
    public static final C79040a f177663a = new C79040a();

    private C79040a() {
    }

    static {
        Covode.recordClassIndex(92217);
    }

    /* renamed from: a */
    public static Keva m137875a() {
        Keva repo = Keva.getRepo("trending_keva");
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: b */
    public static boolean m137876b() {
        if (m137875a().getInt("ever_next", -1) == 1) {
            return true;
        }
        return false;
    }
}
