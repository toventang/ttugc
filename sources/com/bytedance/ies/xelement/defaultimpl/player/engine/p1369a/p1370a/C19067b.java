package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.b */
public final class C19067b {

    /* renamed from: a */
    public final Object f45161a;

    /* renamed from: b */
    private final boolean f45162b;

    static {
        Covode.recordClassIndex(21830);
    }

    public final int hashCode() {
        return this.f45161a.hashCode();
    }

    public final String toString() {
        return this.f45161a.toString();
    }

    private C19067b(Object obj) {
        this.f45161a = obj;
    }

    /* renamed from: a */
    public static C19067b m35456a(Object obj) {
        return new C19067b(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19067b) {
            return this.f45161a.equals(((C19067b) obj).f45161a);
        }
        return false;
    }

    /* renamed from: a */
    private static <T extends AccessibleObject> T m35457a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* renamed from: a */
    public final <T> T mo30415a(String str, Class<?>... clsArr) {
        return (T) m35458b(str, clsArr).f45161a;
    }

    /* renamed from: b */
    private C19067b m35458b(String str, Class<?>... clsArr) {
        try {
            return m35456a(m35459c(str, clsArr).get(this.f45161a));
        } catch (Exception e) {
            throw new C19068c(e);
        }
    }

    /* renamed from: c */
    private Field m35459c(String str, Class<?>... clsArr) {
        Class<?> cls;
        if (this.f45162b) {
            cls = (Class) this.f45161a;
        } else {
            cls = this.f45161a.getClass();
        }
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return cls.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) m35457a((AccessibleObject) cls.getDeclaredField(str));
                    } catch (NoSuchFieldException e2) {
                        e2.printStackTrace();
                        cls = cls.getSuperclass();
                        if (cls != null) {
                            throw new C19068c(e);
                        }
                    }
                } while (cls != null);
                throw new C19068c(e);
            }
        } else {
            do {
                try {
                    Field[] declaredFields = cls.getDeclaredFields();
                    for (Field field : declaredFields) {
                        Class<?> type = field.getType();
                        if (type != null && type.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) m35457a((AccessibleObject) field);
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                cls = cls.getSuperclass();
            } while (cls != null);
            throw new C19068c("NoSuchFieldException");
        }
    }
}
