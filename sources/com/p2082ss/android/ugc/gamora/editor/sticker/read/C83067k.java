package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.k */
public final class C83067k {

    /* renamed from: a */
    public static final Keva f185617a;

    /* renamed from: b */
    public static final C83067k f185618b = new C83067k();

    private C83067k() {
    }

    /* renamed from: c */
    public static String m143425c() {
        String string = f185617a.getString("setCheckVoice", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: d */
    public static String m143427d() {
        String string = f185617a.getString("setCheckText", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: f */
    private static String m143430f() {
        String string = f185617a.getString("setLastVoice", "");
        C89219l.m154716b(string, "");
        return string;
    }

    static {
        Covode.recordClassIndex(96940);
        Keva repo = Keva.getRepo("text_to_speech_v2");
        C89219l.m154716b(repo, "");
        f185617a = repo;
    }

    /* renamed from: a */
    public static boolean m143422a() {
        return f185617a.contains("checkbox");
    }

    /* renamed from: b */
    public static boolean m143424b() {
        if (!C83064h.m143408a()) {
            return false;
        }
        return f185617a.getBoolean("checkbox", false);
    }

    /* renamed from: e */
    public static String m143429e() {
        if (!m143424b()) {
            return m143430f();
        }
        if (m143425c().length() > 0) {
            return m143425c();
        }
        return "";
    }

    /* renamed from: a */
    public static void m143421a(boolean z) {
        f185617a.storeBoolean("checkbox", z);
    }

    /* renamed from: a */
    public static void m143420a(String str) {
        C89219l.m154721d(str, "");
        f185617a.storeString("setCheckVoice", str);
    }

    /* renamed from: b */
    public static void m143423b(String str) {
        C89219l.m154721d(str, "");
        f185617a.storeString("setCheckText", str);
    }

    /* renamed from: c */
    public static void m143426c(String str) {
        C89219l.m154721d(str, "");
        f185617a.storeString("setLastVoice", str);
    }

    /* renamed from: d */
    public static List<String> m143428d(String str) {
        C89219l.m154721d(str, "");
        String[] stringArray = f185617a.getStringArray(C80408et.m139388a(str), new String[0]);
        C89219l.m154716b(stringArray, "");
        return C89064i.m154508i(stringArray);
    }
}
