package com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3352b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.b.b */
public final class C57621b {

    /* renamed from: a */
    public static final C57621b f131512a = new C57621b();

    /* renamed from: b */
    private static Keva f131513b;

    private C57621b() {
    }

    static {
        Covode.recordClassIndex(67580);
        Keva repoSync = Keva.getRepoSync("kids_ab_mock_config_repo", 1);
        C89219l.m154716b(repoSync, "");
        f131513b = repoSync;
    }

    /* renamed from: b */
    public static String m104349b(String str) {
        C89219l.m154721d(str, "");
        return f131513b.getString(str, null);
    }

    /* renamed from: a */
    public static boolean m104347a(String str) {
        C89219l.m154721d(str, "");
        return f131513b.getBoolean("mock_enable_status".concat(String.valueOf(str)), false);
    }

    /* renamed from: a */
    public static int m104346a(String str, int i) {
        C89219l.m154721d(str, "");
        return f131513b.getInt(str, i);
    }

    /* renamed from: a */
    public static boolean m104348a(String str, boolean z) {
        C89219l.m154721d(str, "");
        return f131513b.getBoolean(str, z);
    }
}
