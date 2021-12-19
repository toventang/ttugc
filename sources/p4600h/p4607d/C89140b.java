package p4600h.p4607d;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: h.d.b */
public final class C89140b {

    /* renamed from: a */
    public static final C89137a f202850a;

    /* renamed from: a */
    private static final int m154630a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int a = C89361p.m154882a((CharSequence) property, '.', 0, false, 6);
        if (a < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = a + 1;
            int a2 = C89361p.m154882a((CharSequence) property, '.', i, false, 4);
            if (a2 < 0) {
                a2 = property.length();
            }
            Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
            String substring = property.substring(0, a);
            C89219l.m154716b(substring, "");
            Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
            String substring2 = property.substring(i, a2);
            C89219l.m154716b(substring2, "");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }

    static {
        C89137a aVar;
        Object newInstance;
        Object newInstance2;
        Covode.recordClassIndex(105224);
        int a = m154630a();
        if (a >= 65544) {
            try {
                Object newInstance3 = Class.forName("h.d.b.a").newInstance();
                C89219l.m154716b(newInstance3, "");
                if (newInstance3 != null) {
                    try {
                        aVar = (C89137a) newInstance3;
                        f202850a = aVar;
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                        Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + C89137a.class.getClassLoader()).initCause(e);
                        C89219l.m154716b(initCause, "");
                        throw initCause;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused) {
                try {
                    newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C89219l.m154716b(newInstance2, "");
                    if (newInstance2 != null) {
                        aVar = (C89137a) newInstance2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassCastException e2) {
                ClassLoader classLoader2 = newInstance2.getClass().getClassLoader();
                Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader2 + ", base type classloader: " + C89137a.class.getClassLoader()).initCause(e2);
                C89219l.m154716b(initCause2, "");
                throw initCause2;
            }
        }
        if (a >= 65543) {
            try {
                Object newInstance4 = Class.forName("h.d.a.a").newInstance();
                C89219l.m154716b(newInstance4, "");
                if (newInstance4 != null) {
                    try {
                        aVar = (C89137a) newInstance4;
                        f202850a = aVar;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader3 = newInstance4.getClass().getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + C89137a.class.getClassLoader()).initCause(e3);
                        C89219l.m154716b(initCause3, "");
                        throw initCause3;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused3) {
                try {
                    newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C89219l.m154716b(newInstance, "");
                    if (newInstance != null) {
                        aVar = (C89137a) newInstance;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            } catch (ClassCastException e4) {
                ClassLoader classLoader4 = newInstance.getClass().getClassLoader();
                Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader4 + ", base type classloader: " + C89137a.class.getClassLoader()).initCause(e4);
                C89219l.m154716b(initCause4, "");
                throw initCause4;
            }
        }
        aVar = new C89137a();
        f202850a = aVar;
    }
}
