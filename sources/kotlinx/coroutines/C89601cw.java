package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.cw */
public final class C89601cw {

    /* renamed from: a */
    static final ThreadLocal<AbstractC89552bl> f203328a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C89601cw f203329b = new C89601cw();

    private C89601cw() {
    }

    /* renamed from: b */
    public static AbstractC89552bl m155535b() {
        return f203328a.get();
    }

    static {
        Covode.recordClassIndex(105692);
    }

    /* renamed from: a */
    public static AbstractC89552bl m155534a() {
        ThreadLocal<AbstractC89552bl> threadLocal = f203328a;
        AbstractC89552bl blVar = threadLocal.get();
        if (blVar != null) {
            return blVar;
        }
        AbstractC89552bl a = C89554bn.m155489a();
        threadLocal.set(a);
        return a;
    }
}
