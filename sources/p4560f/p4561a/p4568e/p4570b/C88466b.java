package p4560f.p4561a.p4568e.p4570b;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88431d;

/* renamed from: f.a.e.b.b */
public final class C88466b {

    /* renamed from: a */
    public static final AbstractC88431d<Object, Object> f200715a = new C88467a();

    /* renamed from: f.a.e.b.b$a */
    static final class C88467a implements AbstractC88431d<Object, Object> {
        static {
            Covode.recordClassIndex(104509);
        }

        C88467a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88431d
        /* renamed from: a */
        public final boolean mo20694a(Object obj, Object obj2) {
            return C88466b.m153698a(obj, obj2);
        }
    }

    static {
        Covode.recordClassIndex(104508);
    }

    /* renamed from: a */
    public static <T> T m153697a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static boolean m153698a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m153696a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
