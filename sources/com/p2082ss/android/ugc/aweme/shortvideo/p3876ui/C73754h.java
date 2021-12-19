package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.h */
public final class C73754h {

    /* renamed from: a */
    public static final C73754h f165610a = new C73754h();

    /* renamed from: b */
    private static HashMap<String, AbstractC75370g> f165611b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, String> f165612c = new HashMap<>();

    private C73754h() {
    }

    /* renamed from: a */
    public static void m129790a() {
        f165611b.clear();
        f165612c.clear();
    }

    static {
        Covode.recordClassIndex(86492);
    }

    /* renamed from: b */
    public static AbstractC75370g m129793b(String str) {
        C89219l.m154721d(str, "");
        return f165611b.get(str);
    }

    /* renamed from: c */
    public static String m129794c(String str) {
        C89219l.m154721d(str, "");
        return f165612c.get(str);
    }

    /* renamed from: d */
    public static boolean m129795d(String str) {
        C89219l.m154721d(str, "");
        return f165611b.containsKey(str);
    }

    /* renamed from: a */
    public static void m129791a(String str) {
        C89219l.m154721d(str, "");
        f165611b.put(str, null);
    }

    /* renamed from: a */
    public static void m129792a(String str, AbstractC75370g gVar, String str2) {
        C89219l.m154721d(str, "");
        if (gVar != null) {
            gVar.setMusicPriority(-1);
        }
        f165611b.put(str, gVar);
        f165612c.put(str, str2);
    }
}
