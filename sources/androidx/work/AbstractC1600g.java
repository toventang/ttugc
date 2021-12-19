package androidx.work;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.g */
public abstract class AbstractC1600g {

    /* renamed from: a */
    private static AbstractC1600g f5228a;

    /* renamed from: b */
    private static final int f5229b = 20;

    static {
        Covode.recordClassIndex(1753);
    }

    /* renamed from: a */
    public static synchronized AbstractC1600g m5317a() {
        AbstractC1600g gVar;
        synchronized (AbstractC1600g.class) {
            if (f5228a == null) {
                f5228a = new C1601a(3);
            }
            gVar = f5228a;
        }
        return gVar;
    }

    /* renamed from: androidx.work.g$a */
    public static class C1601a extends AbstractC1600g {

        /* renamed from: a */
        private int f5230a;

        static {
            Covode.recordClassIndex(1754);
        }

        public C1601a(int i) {
            this.f5230a = i;
        }
    }

    /* renamed from: a */
    public static synchronized void m5319a(AbstractC1600g gVar) {
        synchronized (AbstractC1600g.class) {
            f5228a = gVar;
        }
    }

    /* renamed from: a */
    public static String m5318a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f5229b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
