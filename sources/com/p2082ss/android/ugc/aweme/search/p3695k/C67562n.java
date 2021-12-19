package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.k.n */
public final class C67562n extends C67540c<C67562n> {

    /* renamed from: a */
    public static long f151292a;

    /* renamed from: b */
    public static long f151293b;

    /* renamed from: e */
    public static final C67563a f151294e = new C67563a((byte) 0);

    static {
        Covode.recordClassIndex(79199);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.k.n$a */
    public static final class C67563a {
        static {
            Covode.recordClassIndex(79200);
        }

        private C67563a() {
        }

        /* renamed from: a */
        private static void m119641a() {
            C67562n.f151292a = 0;
            C67562n.f151293b = 0;
        }

        public /* synthetic */ C67563a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m119642a(int i) {
            if (i == 0) {
                C67562n.f151292a = System.currentTimeMillis();
            } else {
                C67562n.f151293b = System.currentTimeMillis();
            }
        }

        /* renamed from: a */
        public static void m119643a(String str) {
            C89219l.m154721d(str, "");
            C67562n r = new C67562n().mo106504r(str);
            long j = C67562n.f151293b - C67562n.f151292a;
            if (j > 0) {
                r.mo106452c("suggest_words_loadtime", String.valueOf(j));
                r.mo96792f();
                m119641a();
            }
        }
    }

    public C67562n() {
        super("history_sug_words_loadtime");
    }

    /* renamed from: r */
    public final C67562n mo106504r(String str) {
        C89219l.m154721d(str, "");
        mo106452c("load_type", str);
        return this;
    }
}
