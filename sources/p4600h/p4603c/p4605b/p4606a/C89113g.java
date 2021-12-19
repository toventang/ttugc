package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.b.a.g */
public final class C89113g {
    static {
        Covode.recordClassIndex(105197);
    }

    /* renamed from: a */
    static final int m154617a(AbstractC89107a aVar) {
        int i;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
