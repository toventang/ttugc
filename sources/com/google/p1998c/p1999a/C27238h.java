package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.c.a.h */
public final class C27238h {

    /* renamed from: com.google.c.a.h$a */
    public static final class C27239a {

        /* renamed from: a */
        private final String f64399a;

        /* renamed from: b */
        private final C27240a f64400b;

        /* renamed from: c */
        private C27240a f64401c;

        /* renamed from: d */
        private boolean f64402d;

        static {
            Covode.recordClassIndex(32819);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.c.a.h$a$a */
        public static final class C27240a {

            /* renamed from: a */
            String f64403a;

            /* renamed from: b */
            Object f64404b;

            /* renamed from: c */
            C27240a f64405c;

            static {
                Covode.recordClassIndex(32820);
            }

            private C27240a() {
            }

            /* synthetic */ C27240a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        private C27240a m54217a() {
            C27240a aVar = new C27240a((byte) 0);
            this.f64401c.f64405c = aVar;
            this.f64401c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f64402d;
            StringBuilder append = new StringBuilder(32).append(this.f64399a).append('{');
            String str = "";
            for (C27240a aVar = this.f64400b.f64405c; aVar != null; aVar = aVar.f64405c) {
                Object obj = aVar.f64404b;
                if (!z || obj != null) {
                    append.append(str);
                    if (aVar.f64403a != null) {
                        append.append(aVar.f64403a).append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        append.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        append.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            return append.append('}').toString();
        }

        /* renamed from: a */
        public final C27239a mo45325a(Object obj) {
            m54217a().f64404b = obj;
            return this;
        }

        private C27239a(String str) {
            C27240a aVar = new C27240a((byte) 0);
            this.f64400b = aVar;
            this.f64401c = aVar;
            this.f64402d = false;
            this.f64399a = (String) C27245k.m54229a(str);
        }

        /* synthetic */ C27239a(String str, byte b) {
            this(str);
        }

        /* renamed from: a */
        public final C27239a mo45326a(String str, int i) {
            return mo45328a(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C27239a mo45327a(String str, long j) {
            return mo45328a(str, String.valueOf(j));
        }

        /* renamed from: a */
        public final C27239a mo45328a(String str, Object obj) {
            C27240a a = m54217a();
            a.f64404b = obj;
            a.f64403a = (String) C27245k.m54229a(str);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(32818);
    }

    /* renamed from: a */
    public static C27239a m54215a(Object obj) {
        return new C27239a(obj.getClass().getSimpleName(), (byte) 0);
    }

    /* renamed from: a */
    public static <T> T m54216a(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }
}
