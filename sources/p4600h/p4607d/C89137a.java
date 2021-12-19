package p4600h.p4607d;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4617i.C89253b;

/* renamed from: h.d.a */
public class C89137a {
    static {
        Covode.recordClassIndex(105221);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.d.a$a */
    public static final class C89138a {

        /* renamed from: a */
        public static final Method f202847a;

        /* renamed from: b */
        public static final Method f202848b;

        /* renamed from: c */
        public static final C89138a f202849c = new C89138a();

        private C89138a() {
        }

        static {
            Method method;
            Method method2;
            Class<?> cls;
            Covode.recordClassIndex(105222);
            Method[] methods = Throwable.class.getMethods();
            C89219l.m154716b(methods, "");
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                C89219l.m154716b(method2, "");
                if (C89219l.m154714a((Object) method2.getName(), (Object) "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C89219l.m154716b(parameterTypes, "");
                    C89219l.m154721d(parameterTypes, "");
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (C89219l.m154714a(cls, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            f202847a = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                C89219l.m154716b(method3, "");
                if (C89219l.m154714a((Object) method3.getName(), (Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f202848b = method;
        }
    }

    /* renamed from: a */
    public AbstractC89255c mo143579a() {
        return new C89253b();
    }

    /* renamed from: a */
    public void mo143580a(Throwable th, Throwable th2) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th2, "");
        Method method = C89138a.f202847a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
