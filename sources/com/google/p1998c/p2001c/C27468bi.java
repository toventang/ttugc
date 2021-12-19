package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.c.c.bi */
final class C27468bi {
    static {
        Covode.recordClassIndex(33048);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.bi$a */
    public static final class C27469a<T> {

        /* renamed from: a */
        private final Field f64800a;

        static {
            Covode.recordClassIndex(33049);
        }

        private C27469a(Field field) {
            this.f64800a = field;
            field.setAccessible(true);
        }

        /* synthetic */ C27469a(Field field, byte b) {
            this(field);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo45837a(T t, Object obj) {
            try {
                this.f64800a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo45836a(T t, int i) {
            try {
                this.f64800a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    static <T> C27469a<T> m54924a(Class<T> cls, String str) {
        try {
            return new C27469a<>(cls.getDeclaredField(str), (byte) 0);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static <K, V> void m54925a(AbstractC27422ar<K, V> arVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(arVar.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : arVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }
}
