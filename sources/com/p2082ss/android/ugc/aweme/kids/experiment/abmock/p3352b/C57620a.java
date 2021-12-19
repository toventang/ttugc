package com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3352b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.b.a */
public final class C57620a {

    /* renamed from: a */
    public static Keva f131509a;

    /* renamed from: b */
    public static C27910f f131510b;

    /* renamed from: c */
    public static final C57620a f131511c = new C57620a();

    private C57620a() {
    }

    static {
        Covode.recordClassIndex(67579);
        Keva repoSync = Keva.getRepoSync("kids_ab_config_repo", 1);
        C89219l.m154716b(repoSync, "");
        f131509a = repoSync;
    }

    /* renamed from: a */
    public static int m104343a(String str, int i) {
        C89219l.m154721d(str, "");
        return f131509a.getInt(str, i);
    }

    /* renamed from: a */
    public static String m104344a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String string = f131509a.getString(str, str2);
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: a */
    public static boolean m104345a(String str, boolean z) {
        C89219l.m154721d(str, "");
        return f131509a.getBoolean(str, z);
    }
}
