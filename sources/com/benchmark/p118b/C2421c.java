package com.benchmark.p118b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.benchmark.b.c */
public final class C2421c {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public String f7275a;
    @AbstractC27891c(mo46611a = "configs")

    /* renamed from: b */
    public List<C2424c> f7276b = new ArrayList();

    static {
        Covode.recordClassIndex(2772);
    }

    /* renamed from: com.benchmark.b.c$a */
    public class C2422a {
        @AbstractC27891c(mo46611a = "min_value")

        /* renamed from: a */
        public float f7277a = -1.0f;
        @AbstractC27891c(mo46611a = "max_value")

        /* renamed from: b */
        public float f7278b = -1.0f;
        @AbstractC27891c(mo46611a = "operator")

        /* renamed from: c */
        public int f7279c;

        static {
            Covode.recordClassIndex(2773);
        }

        public C2422a() {
        }
    }

    /* renamed from: com.benchmark.b.c$b */
    public class C2423b {
        @AbstractC27891c(mo46611a = "temp")

        /* renamed from: a */
        public C2422a f7281a;
        @AbstractC27891c(mo46611a = "battery")

        /* renamed from: b */
        public C2422a f7282b;
        @AbstractC27891c(mo46611a = "memory")

        /* renamed from: c */
        public C2422a f7283c;

        static {
            Covode.recordClassIndex(2774);
        }

        public C2423b() {
            this.f7281a = new C2422a();
            this.f7282b = new C2422a();
            this.f7283c = new C2422a();
        }
    }

    /* renamed from: com.benchmark.b.c$c */
    public class C2424c {
        @AbstractC27891c(mo46611a = "config_type")

        /* renamed from: a */
        public int f7285a;
        @AbstractC27891c(mo46611a = "config")

        /* renamed from: b */
        public String f7286b = "";
        @AbstractC27891c(mo46611a = "matched")

        /* renamed from: c */
        public int f7287c;
        @AbstractC27891c(mo46611a = "cond_list")

        /* renamed from: d */
        public List<C2423b> f7288d = new ArrayList();

        static {
            Covode.recordClassIndex(2775);
        }

        public C2424c() {
        }
    }

    /* renamed from: a */
    public static void m7263a(C2422a aVar, String str) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(str.length() - 1);
            String[] split = str.split(",");
            String substring = split[0].substring(1);
            String substring2 = split[1].substring(0, split[1].length() - 1);
            aVar.f7277a = Float.parseFloat(substring);
            aVar.f7278b = Float.parseFloat(substring2);
            if (aVar.f7278b <= 0.0f) {
                aVar.f7278b = Float.MAX_VALUE;
            }
            if (charAt == '(') {
                if (charAt2 == ')') {
                    aVar.f7279c = EnumC2428g.ON_ON.ordinal();
                    return;
                }
            } else if (charAt != '(') {
                if (charAt == '[' && charAt2 == ')') {
                    aVar.f7279c = EnumC2428g.OFF_ON.ordinal();
                    return;
                }
                aVar.f7279c = EnumC2428g.OFF_OFF.ordinal();
            }
            if (charAt2 == ']') {
                aVar.f7279c = EnumC2428g.ON_OFF.ordinal();
                return;
            }
            aVar.f7279c = EnumC2428g.OFF_OFF.ordinal();
        }
    }
}
