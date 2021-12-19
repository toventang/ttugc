package com.google.firebase.installations.p2017b;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2017b.C27830b;

/* renamed from: com.google.firebase.installations.b.e */
public abstract class AbstractC27836e {

    /* renamed from: com.google.firebase.installations.b.e$a */
    public static abstract class AbstractC27837a {
        static {
            Covode.recordClassIndex(33426);
        }

        /* renamed from: a */
        public abstract AbstractC27837a mo46533a(long j);

        /* renamed from: a */
        public abstract AbstractC27837a mo46534a(EnumC27838b bVar);

        /* renamed from: a */
        public abstract AbstractC27837a mo46535a(String str);

        /* renamed from: a */
        public abstract AbstractC27836e mo46536a();
    }

    static {
        Covode.recordClassIndex(33425);
    }

    /* renamed from: a */
    public abstract String mo46527a();

    /* renamed from: b */
    public abstract long mo46528b();

    /* renamed from: c */
    public abstract EnumC27838b mo46529c();

    /* renamed from: d */
    public static AbstractC27837a m55717d() {
        return new C27830b.C27831a().mo46533a(0);
    }

    /* renamed from: com.google.firebase.installations.b.e$b */
    public enum EnumC27838b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR;

        static {
            Covode.recordClassIndex(33427);
        }
    }
}
