package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.l */
public abstract class AbstractC28012l {
    static {
        Covode.recordClassIndex(33625);
    }

    /* renamed from: a */
    public abstract <T> T mo46788a(Class<T> cls);

    /* renamed from: a */
    public static AbstractC28012l m56102a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new AbstractC28012l() {
                /* class com.google.gson.internal.AbstractC28012l.C280131 */

                static {
                    Covode.recordClassIndex(33626);
                }

                @Override // com.google.gson.internal.AbstractC28012l
                /* renamed from: a */
                public final <T> T mo46788a(Class<T> cls) {
                    m56103b(cls);
                    return (T) method.invoke(obj, cls);
                }
            };
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new AbstractC28012l() {
                    /* class com.google.gson.internal.AbstractC28012l.C280142 */

                    static {
                        Covode.recordClassIndex(33627);
                    }

                    @Override // com.google.gson.internal.AbstractC28012l
                    /* renamed from: a */
                    public final <T> T mo46788a(Class<T> cls) {
                        m56103b(cls);
                        return (T) declaredMethod2.invoke(null, cls, Integer.valueOf(intValue));
                    }
                };
            } catch (Exception unused2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new AbstractC28012l() {
                        /* class com.google.gson.internal.AbstractC28012l.C280153 */

                        static {
                            Covode.recordClassIndex(33628);
                        }

                        @Override // com.google.gson.internal.AbstractC28012l
                        /* renamed from: a */
                        public final <T> T mo46788a(Class<T> cls) {
                            m56103b(cls);
                            return (T) declaredMethod3.invoke(null, cls, Object.class);
                        }
                    };
                } catch (Exception unused3) {
                    return new AbstractC28012l() {
                        /* class com.google.gson.internal.AbstractC28012l.C280164 */

                        static {
                            Covode.recordClassIndex(33629);
                        }

                        @Override // com.google.gson.internal.AbstractC28012l
                        /* renamed from: a */
                        public final <T> T mo46788a(Class<T> cls) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls)));
                        }
                    };
                }
            }
        }
    }

    /* renamed from: b */
    static void m56103b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }
}
