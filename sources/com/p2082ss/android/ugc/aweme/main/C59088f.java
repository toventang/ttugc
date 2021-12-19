package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.main.f */
public final class C59088f {
    static {
        Covode.recordClassIndex(69436);
    }

    /* renamed from: a */
    public static Field m108568a(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }
}
