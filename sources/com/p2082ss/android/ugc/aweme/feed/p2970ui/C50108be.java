package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.be */
public final class C50108be {

    /* renamed from: a */
    static final HashSet<String> f115668a = new HashSet<>();

    /* renamed from: b */
    public static final C50108be f115669b = new C50108be();

    /* renamed from: c */
    private static final HashSet<String> f115670c = new HashSet<>();

    private C50108be() {
    }

    static {
        Covode.recordClassIndex(59234);
    }

    /* renamed from: a */
    public static void m94061a(String str) {
        C89219l.m154721d(str, "");
        f115670c.add(str);
    }

    /* renamed from: b */
    public static boolean m94062b(String str) {
        C89219l.m154721d(str, "");
        return f115670c.contains(str);
    }

    /* renamed from: c */
    public static boolean m94063c(String str) {
        C89219l.m154721d(str, "");
        return f115668a.contains(str);
    }
}
