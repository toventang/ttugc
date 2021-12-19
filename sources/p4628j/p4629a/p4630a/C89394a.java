package p4628j.p4629a.p4630a;

import com.bytedance.covode.number.Covode;

/* renamed from: j.a.a.a */
final class C89394a extends RuntimeException {
    static {
        Covode.recordClassIndex(105478);
    }

    C89394a(Class<?> cls) {
        super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
