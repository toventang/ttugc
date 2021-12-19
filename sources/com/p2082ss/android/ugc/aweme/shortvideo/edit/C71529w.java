package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.setting.C68112j;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.C71377c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.w */
public final class C71529w {

    /* renamed from: a */
    public static final int f160303a;

    /* renamed from: b */
    public static final int f160304b;

    /* renamed from: c */
    public static final int f160305c;

    /* renamed from: d */
    public static final int f160306d;

    /* renamed from: e */
    public static final int f160307e;

    /* renamed from: f */
    public static final int f160308f;

    /* renamed from: g */
    public static final int f160309g;

    /* renamed from: h */
    public static final int f160310h;

    /* renamed from: i */
    public static final int f160311i;

    /* renamed from: j */
    static final HashMap<String, Integer> f160312j = new HashMap<>();

    /* renamed from: k */
    static SharedPreferences f160313k = C34822d.m71158a(C63247i.f143610a, "av_settings.xml", 0);

    /* renamed from: l */
    public static boolean f160314l;

    /* renamed from: m */
    public static final C71529w f160315m = new C71529w();

    /* renamed from: n */
    private static final String[] f160316n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.w$a */
    public interface AbstractC71530a {
        static {
            Covode.recordClassIndex(84073);
        }

        /* renamed from: a */
        void mo87563a();

        /* renamed from: b */
        void mo87564b();

        /* renamed from: c */
        void mo87565c();

        /* renamed from: d */
        void mo87566d();

        /* renamed from: e */
        void mo87567e();

        /* renamed from: f */
        void mo87568f();

        /* renamed from: g */
        void mo87569g();
    }

    private C71529w() {
    }

    /* renamed from: c */
    public static final boolean m126424c() {
        if (!C71377c.m126086a() || m126421a("countdown_sticker")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static Set<String> m126418a() {
        String string = f160313k.getString("prompt_shown", "");
        HashSet hashSet = new HashSet();
        if (string == null || string.length() <= 0) {
            return hashSet;
        }
        Object a = C63244g.m114602a().mo73261G().mo46670a(string, Set.class);
        Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        return C89206ad.m154684f(a);
    }

    /* renamed from: b */
    public static final boolean m126423b() {
        if (!C68112j.m120402a() || C63244g.m114602a().mo73255A().mo93901a() || m126421a("custom_sticker")) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(84072);
        String[] strArr = {"cut_optimized", "canvas_gesture", "countdown_sticker", "custom_sticker", "music", "text", "sticker", "effect", "voice"};
        f160316n = strArr;
        f160303a = C89064i.m154493b(strArr, "custom_sticker");
        f160304b = C89064i.m154493b(strArr, "countdown_sticker");
        f160305c = C89064i.m154493b(strArr, "music");
        f160306d = C89064i.m154493b(strArr, "text");
        f160307e = C89064i.m154493b(strArr, "sticker");
        f160308f = C89064i.m154493b(strArr, "effect");
        f160309g = C89064i.m154493b(strArr, "voice");
        f160310h = C89064i.m154493b(strArr, "canvas_gesture");
        f160311i = C89064i.m154493b(strArr, "cut_optimized");
    }

    /* renamed from: a */
    public static final boolean m126421a(String str) {
        C89219l.m154721d(str, "");
        return m126418a().contains(str);
    }

    /* renamed from: b */
    public static final void m126422b(String str) {
        C89219l.m154721d(str, "");
        Set<String> a = m126418a();
        if (a.add(str)) {
            m126420a(a);
        }
    }

    /* renamed from: a */
    static void m126420a(Set<String> set) {
        C89219l.m154721d(set, "");
        if (!set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(m126418a());
            linkedHashSet.addAll(set);
            f160313k.edit().putString("prompt_shown", C63244g.m114602a().mo73261G().mo46674b(linkedHashSet)).commit();
        }
    }

    /* renamed from: a */
    public static final void m126419a(String str, int i) {
        C89219l.m154721d(str, "");
        f160312j.put(str, Integer.valueOf(i));
    }
}
