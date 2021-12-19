package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89096c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89173c;
import p4600h.p4611f.p4612a.AbstractC89174d;
import p4600h.p4611f.p4612a.AbstractC89175e;
import p4600h.p4611f.p4612a.AbstractC89176f;
import p4600h.p4611f.p4612a.AbstractC89177g;
import p4600h.p4611f.p4612a.AbstractC89178h;
import p4600h.p4611f.p4612a.AbstractC89179i;
import p4600h.p4611f.p4612a.AbstractC89180j;
import p4600h.p4611f.p4612a.AbstractC89181k;
import p4600h.p4611f.p4612a.AbstractC89182l;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89184n;
import p4600h.p4611f.p4612a.AbstractC89185o;
import p4600h.p4611f.p4612a.AbstractC89186p;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4612a.AbstractC89190t;
import p4600h.p4611f.p4612a.AbstractC89191u;
import p4600h.p4611f.p4612a.AbstractC89192v;
import p4600h.p4611f.p4612a.AbstractC89193w;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4611f.p4613b.p4614a.AbstractC89197b;
import p4600h.p4611f.p4613b.p4614a.AbstractC89198c;
import p4600h.p4611f.p4613b.p4614a.AbstractC89200e;
import p4600h.p4611f.p4613b.p4614a.AbstractC89201f;
import p4600h.p4611f.p4613b.p4614a.AbstractC89202g;

/* renamed from: h.f.b.ad */
public class C89206ad {
    static {
        Covode.recordClassIndex(105290);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m154676a(T t) {
        return (T) C89219l.m154706a((Throwable) t, C89206ad.class.getName());
    }

    /* renamed from: c */
    public static boolean m154681c(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof AbstractC89196a) || (obj instanceof AbstractC89200e)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m154683e(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        if (!(obj instanceof AbstractC89196a) || (obj instanceof AbstractC89202g)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m154685g(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        if (!(obj instanceof AbstractC89196a) || (obj instanceof AbstractC89201f)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static Iterable m154687i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m154676a((Throwable) e);
        }
    }

    /* renamed from: j */
    private static Collection m154688j(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m154676a((Throwable) e);
        }
    }

    /* renamed from: k */
    private static List m154689k(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m154676a((Throwable) e);
        }
    }

    /* renamed from: l */
    private static Set m154690l(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m154676a((Throwable) e);
        }
    }

    /* renamed from: m */
    private static Map m154691m(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m154676a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static Iterable m154675a(Object obj) {
        if ((obj instanceof AbstractC89196a) && !(obj instanceof AbstractC89198c)) {
            m154677a(obj, "kotlin.collections.MutableIterable");
        }
        return m154687i(obj);
    }

    /* renamed from: d */
    public static List m154682d(Object obj) {
        if ((obj instanceof AbstractC89196a) && !(obj instanceof AbstractC89200e)) {
            m154677a(obj, "kotlin.collections.MutableList");
        }
        return m154689k(obj);
    }

    /* renamed from: f */
    public static Set m154684f(Object obj) {
        if ((obj instanceof AbstractC89196a) && !(obj instanceof AbstractC89202g)) {
            m154677a(obj, "kotlin.collections.MutableSet");
        }
        return m154690l(obj);
    }

    /* renamed from: h */
    public static Map m154686h(Object obj) {
        if ((obj instanceof AbstractC89196a) && !(obj instanceof AbstractC89201f)) {
            m154677a(obj, "kotlin.collections.MutableMap");
        }
        return m154691m(obj);
    }

    /* renamed from: b */
    public static Collection m154680b(Object obj) {
        if ((obj instanceof AbstractC89196a) && !(obj instanceof AbstractC89197b)) {
            m154677a(obj, "kotlin.collections.MutableCollection");
        }
        return m154688j(obj);
    }

    /* renamed from: n */
    private static int m154692n(Object obj) {
        if (obj instanceof AbstractC89215h) {
            return ((AbstractC89215h) obj).getArity();
        }
        if (obj instanceof AbstractC89171a) {
            return 0;
        }
        if (obj instanceof AbstractC89172b) {
            return 1;
        }
        if (obj instanceof AbstractC89183m) {
            return 2;
        }
        if (obj instanceof AbstractC89187q) {
            return 3;
        }
        if (obj instanceof AbstractC89188r) {
            return 4;
        }
        if (obj instanceof AbstractC89189s) {
            return 5;
        }
        if (obj instanceof AbstractC89190t) {
            return 6;
        }
        if (obj instanceof AbstractC89191u) {
            return 7;
        }
        if (obj instanceof AbstractC89192v) {
            return 8;
        }
        if (obj instanceof AbstractC89193w) {
            return 9;
        }
        if (obj instanceof AbstractC89173c) {
            return 10;
        }
        if (obj instanceof AbstractC89174d) {
            return 11;
        }
        if (obj instanceof AbstractC89175e) {
            return 12;
        }
        if (obj instanceof AbstractC89176f) {
            return 13;
        }
        if (obj instanceof AbstractC89177g) {
            return 14;
        }
        if (obj instanceof AbstractC89178h) {
            return 15;
        }
        if (obj instanceof AbstractC89179i) {
            return 16;
        }
        if (obj instanceof AbstractC89180j) {
            return 17;
        }
        if (obj instanceof AbstractC89181k) {
            return 18;
        }
        if (obj instanceof AbstractC89182l) {
            return 19;
        }
        if (obj instanceof AbstractC89184n) {
            return 20;
        }
        if (obj instanceof AbstractC89185o) {
            return 21;
        }
        if (obj instanceof AbstractC89186p) {
            return 22;
        }
        return -1;
    }

    /* renamed from: b */
    public static Object m154679b(Object obj, int i) {
        if (obj != null && !m154678a(obj, i)) {
            m154677a(obj, "kotlin.jvm.functions.Function".concat(String.valueOf(i)));
        }
        return obj;
    }

    /* renamed from: a */
    private static void m154677a(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        throw m154676a((Throwable) new ClassCastException(name + " cannot be cast to " + str));
    }

    /* renamed from: a */
    public static boolean m154678a(Object obj, int i) {
        if (!(obj instanceof AbstractC89096c) || m154692n(obj) != i) {
            return false;
        }
        return true;
    }
}
