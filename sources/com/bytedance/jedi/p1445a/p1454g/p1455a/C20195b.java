package com.bytedance.jedi.p1445a.p1454g.p1455a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.bytedance.jedi.a.g.a.b */
public final class C20195b {

    /* renamed from: com.bytedance.jedi.a.g.a.b$a */
    public static final class C20196a {

        /* renamed from: a */
        private final String f47967a;

        /* renamed from: b */
        private final C20197a f47968b;

        /* renamed from: c */
        private C20197a f47969c;

        /* renamed from: d */
        private boolean f47970d;

        static {
            Covode.recordClassIndex(23704);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.a.g.a.b$a$a */
        public static final class C20197a {

            /* renamed from: a */
            String f47971a;

            /* renamed from: b */
            Object f47972b;

            /* renamed from: c */
            C20197a f47973c;

            static {
                Covode.recordClassIndex(23705);
            }

            private C20197a() {
            }

            /* synthetic */ C20197a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        private C20197a m38185a() {
            C20197a aVar = new C20197a((byte) 0);
            this.f47969c.f47973c = aVar;
            this.f47969c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f47970d;
            StringBuilder append = new StringBuilder(32).append(this.f47967a).append('{');
            String str = "";
            for (C20197a aVar = this.f47968b.f47973c; aVar != null; aVar = aVar.f47973c) {
                Object obj = aVar.f47972b;
                if (!z || obj != null) {
                    append.append(str);
                    if (aVar.f47971a != null) {
                        append.append(aVar.f47971a).append('=');
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
        public final C20196a mo33492a(Object obj) {
            m38185a().f47972b = obj;
            return this;
        }

        private C20196a(String str) {
            C20197a aVar = new C20197a((byte) 0);
            this.f47968b = aVar;
            this.f47969c = aVar;
            this.f47970d = false;
            this.f47967a = (String) C20198c.m38190a(str);
        }

        public /* synthetic */ C20196a(String str, byte b) {
            this(str);
        }

        /* renamed from: a */
        public final C20196a mo33493a(String str, int i) {
            return mo33495a(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C20196a mo33494a(String str, long j) {
            return mo33495a(str, String.valueOf(j));
        }

        /* renamed from: a */
        public final C20196a mo33495a(String str, Object obj) {
            C20197a a = m38185a();
            a.f47972b = obj;
            a.f47971a = (String) C20198c.m38190a(str);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23703);
    }

    /* renamed from: a */
    public static <T> T m38184a(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }
}
