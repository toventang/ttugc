package com.p2082ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.i */
public final class C85145i {

    /* renamed from: a */
    static final Keva f190498a = Keva.getRepo("auto_translation_settings_cache");

    /* renamed from: b */
    static final Set<String> f190499b = new LinkedHashSet();

    /* renamed from: c */
    public static final C85145i f190500c = new C85145i();

    private C85145i() {
    }

    /* renamed from: b */
    public static boolean m146400b() {
        return f190498a.getBoolean("enable_caption_tts", true);
    }

    /* renamed from: c */
    public static String m146401c() {
        String string = f190498a.getString("caption_voice_type", "2");
        C89219l.m154716b(string, "");
        return string;
    }

    static {
        Covode.recordClassIndex(99185);
    }

    /* renamed from: a */
    public static boolean m146399a() {
        return f190498a.getBoolean("enable_translation", true);
    }

    /* renamed from: a */
    public static void m146398a(String str) {
        C89219l.m154721d(str, "");
        f190498a.storeString("caption_voice_type", str);
    }
}
