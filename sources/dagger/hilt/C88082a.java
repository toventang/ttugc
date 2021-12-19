package dagger.hilt;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import dagger.hilt.p4536a.AbstractC88083a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: dagger.hilt.a */
public final class C88082a {
    static {
        Covode.recordClassIndex(104108);
    }

    /* renamed from: a */
    public static <T> T m153154a(Object obj, Class<T> cls) {
        if (obj instanceof AbstractC88083a) {
            return cls.cast(obj);
        }
        if (obj instanceof AbstractC88084b) {
            return cls.cast(((AbstractC88084b) obj).generatedComponent());
        }
        throw new IllegalStateException(C1764a.m5928a("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), AbstractC88083a.class, AbstractC88084b.class}));
    }
}
