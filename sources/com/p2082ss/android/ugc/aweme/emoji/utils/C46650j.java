package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.common.utility.p909d.C13608a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.j */
public final class C46650j {
    static {
        Covode.recordClassIndex(55242);
    }

    /* renamed from: a */
    private static String m90050a() {
        return C13608a.m24444a(C17867d.m33078a()) + "/im_resources/";
    }

    /* renamed from: b */
    public static String m90055b(C46516b bVar) {
        return m90056b(bVar.getType(), bVar.getId(), bVar.getVersion());
    }

    /* renamed from: a */
    public static String m90052a(C46516b bVar) {
        return m90053a(bVar.getType()) + m90051a(bVar.getId(), bVar.getVersion()) + ".zip";
    }

    /* renamed from: a */
    public static String m90053a(String str) {
        return m90050a() + str + "/";
    }

    /* renamed from: a */
    public static String m90051a(long j, String str) {
        String replace;
        StringBuilder append = new StringBuilder().append(j).append("_");
        if (str == null) {
            replace = "";
        } else {
            replace = str.replace(".", "_");
        }
        return append.append(replace).toString();
    }

    /* renamed from: b */
    public static String m90056b(String str, long j, String str2) {
        return m90054a(str, j, str2) + "/" + j;
    }

    /* renamed from: a */
    public static String m90054a(String str, long j, String str2) {
        return m90053a(str) + m90051a(j, str2);
    }
}
