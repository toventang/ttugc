package com.p2082ss.videoarch.p4474a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.c */
public interface AbstractC87127c {

    /* renamed from: com.ss.videoarch.a.c$a */
    public static class C87128a {

        /* renamed from: a */
        public final JSONObject f196875a;

        /* renamed from: b */
        public final String f196876b;

        /* renamed from: c */
        public final String f196877c;

        /* renamed from: d */
        public final int f196878d;

        /* renamed from: e */
        public final Exception f196879e;

        static {
            Covode.recordClassIndex(102929);
        }

        /* renamed from: com.ss.videoarch.a.c$a$a */
        public static class C87129a {

            /* renamed from: a */
            public JSONObject f196880a;

            /* renamed from: b */
            public String f196881b;

            /* renamed from: c */
            public String f196882c;

            /* renamed from: d */
            public Exception f196883d;

            /* renamed from: e */
            public int f196884e;

            static {
                Covode.recordClassIndex(102930);
            }

            private C87129a() {
            }

            /* renamed from: a */
            public final C87128a mo140887a() {
                return new C87128a(this, (byte) 0);
            }

            /* synthetic */ C87129a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        public static C87129a m150943a() {
            return new C87129a((byte) 0);
        }

        private C87128a(C87129a aVar) {
            this.f196875a = aVar.f196880a;
            this.f196876b = aVar.f196881b;
            this.f196877c = aVar.f196882c;
            this.f196879e = aVar.f196883d;
            this.f196878d = aVar.f196884e;
        }

        /* synthetic */ C87128a(C87129a aVar, byte b) {
            this(aVar);
        }
    }

    static {
        Covode.recordClassIndex(102928);
    }

    /* renamed from: a */
    C87128a mo12865a(String str, String str2);

    /* renamed from: b */
    C87128a mo12866b(String str, String str2);
}
