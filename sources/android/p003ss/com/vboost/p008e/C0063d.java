package android.p003ss.com.vboost.p008e;

import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.e.d */
public final class C0063d {
    static {
        Covode.recordClassIndex(66);
    }

    /* renamed from: android.ss.com.vboost.e.d$a */
    public enum EnumC0064a {
        UNKNOWN("unknown", 0),
        SS("ss", 1),
        CHRY("chry", 2),
        XM("xm", 3),
        OP("op", 4),
        VO("vo", 5),
        MZ("mz", 6);
        

        /* renamed from: a */
        private String f231a;

        /* renamed from: b */
        private int f232b;

        static {
            Covode.recordClassIndex(67);
        }

        private EnumC0064a(String str, int i) {
            this.f231a = str;
            this.f232b = i;
        }
    }

    /* renamed from: a */
    public static String m102a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
