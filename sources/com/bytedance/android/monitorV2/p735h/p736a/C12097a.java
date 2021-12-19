package com.bytedance.android.monitorV2.p735h.p736a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.monitorV2.h.a.a */
public final class C12097a {

    /* renamed from: a */
    public static String f29029a = "__hybrid_default";

    /* renamed from: b */
    public Map<String, C12098a> f29030b = new HashMap();

    /* renamed from: c */
    public List<C12099b> f29031c = new ArrayList();

    static {
        Covode.recordClassIndex(13826);
    }

    public final String toString() {
        return "BidInfo{bidInfoMap=" + this.f29030b + ", regexList=" + this.f29031c + '}';
    }

    /* renamed from: com.bytedance.android.monitorV2.h.a.a$a */
    public static class C12098a {

        /* renamed from: A */
        public boolean f29032A = false;

        /* renamed from: B */
        public boolean f29033B = false;

        /* renamed from: C */
        public boolean f29034C = false;

        /* renamed from: D */
        public boolean f29035D = false;

        /* renamed from: E */
        public boolean f29036E = false;

        /* renamed from: F */
        public boolean f29037F = false;

        /* renamed from: G */
        public boolean f29038G = false;

        /* renamed from: H */
        public boolean f29039H = false;

        /* renamed from: I */
        public boolean f29040I = false;

        /* renamed from: J */
        public boolean f29041J = false;

        /* renamed from: K */
        public boolean f29042K = false;

        /* renamed from: L */
        public boolean f29043L = false;

        /* renamed from: M */
        public boolean f29044M = false;

        /* renamed from: N */
        public boolean f29045N = false;

        /* renamed from: O */
        public boolean f29046O = false;

        /* renamed from: a */
        public String f29047a = C12097a.f29029a;

        /* renamed from: b */
        public long f29048b;

        /* renamed from: c */
        public long f29049c;

        /* renamed from: d */
        public Map<String, Integer> f29050d = new HashMap();

        /* renamed from: e */
        public boolean f29051e = false;

        /* renamed from: f */
        public boolean f29052f = false;

        /* renamed from: g */
        public boolean f29053g = false;

        /* renamed from: h */
        public boolean f29054h = false;

        /* renamed from: i */
        public boolean f29055i = false;

        /* renamed from: j */
        public boolean f29056j = false;

        /* renamed from: k */
        public boolean f29057k = false;

        /* renamed from: l */
        public boolean f29058l = false;

        /* renamed from: m */
        public boolean f29059m = false;

        /* renamed from: n */
        public boolean f29060n = false;

        /* renamed from: o */
        public boolean f29061o = false;

        /* renamed from: p */
        public boolean f29062p = false;

        /* renamed from: q */
        public boolean f29063q = false;

        /* renamed from: r */
        public boolean f29064r = false;

        /* renamed from: s */
        public boolean f29065s = false;

        /* renamed from: t */
        public boolean f29066t = false;

        /* renamed from: u */
        public boolean f29067u = false;

        /* renamed from: v */
        public boolean f29068v = false;

        /* renamed from: w */
        public boolean f29069w = false;

        /* renamed from: x */
        public boolean f29070x = false;

        /* renamed from: y */
        public boolean f29071y = false;

        /* renamed from: z */
        public boolean f29072z = false;

        static {
            Covode.recordClassIndex(13827);
        }

        public C12098a() {
        }

        public final String toString() {
            return "BidConfig{bid='" + this.f29047a + '\n' + ", hitSample=" + this.f29048b + ", settingId=" + this.f29049c + ", custom_p0=" + this.f29051e + ", custom_p1=" + this.f29052f + ", custom_p2=" + this.f29053g + ", custom_p3=" + this.f29054h + ", custom_p4=" + this.f29055i + ", custom_p5=" + this.f29056j + ", custom_p6=" + this.f29057k + ", custom_p7=" + this.f29058l + ", custom_p8=" + this.f29059m + '\n' + ", perf_web=" + this.f29060n + ", ajax_web=" + this.f29061o + ", static_perf_web=" + this.f29062p + ", static_error_web=" + this.f29063q + ", js_exception_web=" + this.f29064r + ", blank_web=" + this.f29065s + ", fetch_error_web=" + this.f29066t + ", jsb_error_web=" + this.f29067u + ", jsb_perf_web=" + this.f29068v + ", falcon_perf_web=" + this.f29069w + ", native_error_web=" + this.f29070x + ", navigation_start_web=" + this.f29071y + ", static_sri_web=" + this.f29072z + '\n' + ", performance_lynx=" + this.f29032A + ", blank_lynx=" + this.f29033B + ", fetch_error_lynx=" + this.f29034C + ", jsb_error_lynx=" + this.f29035D + ", jsb_perf_lynx=" + this.f29036E + ", native_error_lynx=" + this.f29037F + ", navigation_start_lynx=" + this.f29038G + '\n' + ", performance_reactnative=" + this.f29039H + ", blank_reactnative=" + this.f29040I + ", fetch_error_reactnative=" + this.f29041J + ", jsb_error_reactnative=" + this.f29042K + ", native_error_reactnative=" + this.f29043L + ", container_error=" + this.f29044M + ", js_exception_lynx=" + this.f29045N + ", static_error_lynx=" + this.f29046O + '}' + '\n';
        }

        public C12098a(String str) {
            if (!str.isEmpty()) {
                this.f29047a = str;
            }
        }
    }

    /* renamed from: b */
    public final Map<String, Integer> mo19450b(String str) {
        return mo19449a(str).f29050d;
    }

    /* renamed from: a */
    public final C12098a mo19449a(String str) {
        if (this.f29030b.containsKey(str)) {
            return this.f29030b.get(str);
        }
        if (this.f29030b.containsKey(f29029a)) {
            return this.f29030b.get(f29029a);
        }
        return new C12098a(f29029a);
    }
}
