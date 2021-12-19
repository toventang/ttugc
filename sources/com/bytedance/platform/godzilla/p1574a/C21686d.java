package com.bytedance.platform.godzilla.p1574a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.a.d */
public final class C21686d {
    static {
        Covode.recordClassIndex(25327);
    }

    /* renamed from: a */
    public static Field m40632a(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }
}
