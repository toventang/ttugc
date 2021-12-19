package com.p2082ss.android.ugc.aweme.discover.lynx.p2782d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.d.c */
public final class C42213c extends C67511b<C42213c> {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, Integer> f98382a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C42214a f98383b = new C42214a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.d.c$a */
    public static final class C42214a {
        static {
            Covode.recordClassIndex(50154);
        }

        private C42214a() {
        }

        public /* synthetic */ C42214a(byte b) {
            this();
        }

        /* renamed from: b */
        public static void m84502b(String str) {
            if (str != null && !C89361p.m154870a((CharSequence) str)) {
                C42213c.f98382a.remove(str);
            }
        }

        /* renamed from: a */
        public static int m84500a(String str) {
            if (str == null || C89361p.m154870a((CharSequence) str)) {
                return 3;
            }
            Integer num = C42213c.f98382a.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }

        /* renamed from: a */
        public static void m84501a(String str, int i) {
            C89219l.m154721d(str, "");
            C42213c.f98382a.put(str, Integer.valueOf(i));
        }
    }

    public C42213c() {
        super("search_lynx_load_event");
    }

    static {
        Covode.recordClassIndex(50153);
    }

    /* renamed from: a */
    public final C42213c mo71412a(String str) {
        mo106452c(StringSet.type, str);
        return this;
    }

    /* renamed from: b */
    public final C42213c mo71415b(String str) {
        mo106452c("schema", str);
        return this;
    }

    /* renamed from: c */
    public final C42213c mo71416c(String str) {
        mo106452c("error", str);
        return this;
    }

    /* renamed from: d */
    public final C42213c mo71417d(String str) {
        mo106452c("rank", str);
        return this;
    }

    /* renamed from: e */
    public final C42213c mo71418e(String str) {
        mo106452c("prerender", str);
        return this;
    }

    /* renamed from: f */
    public final C42213c mo71419f(String str) {
        mo106452c("load_time", str);
        return this;
    }

    /* renamed from: g */
    public final C42213c mo71420g(String str) {
        mo106452c("is_built_in", str);
        return this;
    }

    /* renamed from: a */
    public final C42213c mo71411a(int i) {
        mo106452c("load_stage", String.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public final C42213c mo71414b(int i) {
        mo106452c("container_type", String.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public final C42213c mo71413a(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        mo106452c("continue_render", str);
        return this;
    }
}
