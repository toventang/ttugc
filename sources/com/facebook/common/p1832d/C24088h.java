package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.common.d.h */
public final class C24088h {

    /* renamed from: com.facebook.common.d.h$a */
    public static final class C24089a {

        /* renamed from: a */
        private final String f57015a;

        /* renamed from: b */
        private C24090a f57016b;

        /* renamed from: c */
        private C24090a f57017c;

        /* renamed from: d */
        private boolean f57018d;

        static {
            Covode.recordClassIndex(28217);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.common.d.h$a$a */
        public static final class C24090a {

            /* renamed from: a */
            String f57019a;

            /* renamed from: b */
            Object f57020b;

            /* renamed from: c */
            C24090a f57021c;

            static {
                Covode.recordClassIndex(28218);
            }

            private C24090a() {
            }

            /* synthetic */ C24090a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        private C24090a m45612a() {
            C24090a aVar = new C24090a((byte) 0);
            this.f57017c.f57021c = aVar;
            this.f57017c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f57018d;
            StringBuilder append = new StringBuilder(32).append(this.f57015a).append('{');
            String str = "";
            for (C24090a aVar = this.f57016b.f57021c; aVar != null; aVar = aVar.f57021c) {
                if (!z || aVar.f57020b != null) {
                    append.append(str);
                    if (aVar.f57019a != null) {
                        append.append(aVar.f57019a).append('=');
                    }
                    append.append(aVar.f57020b);
                    str = ", ";
                }
            }
            return append.append('}').toString();
        }

        private C24089a(String str) {
            C24090a aVar = new C24090a((byte) 0);
            this.f57016b = aVar;
            this.f57017c = aVar;
            this.f57018d = false;
            this.f57015a = (String) C24091i.m45617a(str);
        }

        /* synthetic */ C24089a(String str, byte b) {
            this(str);
        }

        /* renamed from: a */
        public final C24089a mo39646a(String str, int i) {
            return mo39647a(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C24089a mo39647a(String str, Object obj) {
            C24090a a = m45612a();
            a.f57020b = obj;
            a.f57019a = (String) C24091i.m45617a(str);
            return this;
        }

        /* renamed from: a */
        public final C24089a mo39648a(String str, boolean z) {
            return mo39647a(str, String.valueOf(z));
        }
    }

    static {
        Covode.recordClassIndex(28216);
    }

    /* renamed from: a */
    public static C24089a m45610a(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new C24089a(replaceAll.substring(lastIndexOf + 1), (byte) 0);
    }

    /* renamed from: a */
    public static boolean m45611a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
