package com.google.gson.internal.p2021a;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28020m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.a.c */
final class C27924c extends AbstractC27923b {

    /* renamed from: b */
    private static Class f65592b;

    /* renamed from: c */
    private final Object f65593c = m55972a();

    /* renamed from: d */
    private final Field f65594d = m55973b();

    static {
        Covode.recordClassIndex(33519);
    }

    C27924c() {
    }

    /* renamed from: b */
    private static Field m55973b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m55972a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f65592b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.internal.p2021a.AbstractC27923b
    /* renamed from: a */
    public final void mo46705a(AccessibleObject accessibleObject) {
        if (!m55974b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C28020m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* renamed from: b */
    private boolean m55974b(AccessibleObject accessibleObject) {
        if (!(this.f65593c == null || this.f65594d == null)) {
            try {
                long longValue = ((Long) f65592b.getMethod("objectFieldOffset", Field.class).invoke(this.f65593c, this.f65594d)).longValue();
                f65592b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f65593c, accessibleObject, Long.valueOf(longValue), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
