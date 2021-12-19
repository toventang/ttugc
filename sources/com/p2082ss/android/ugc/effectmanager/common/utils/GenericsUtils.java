package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.GenericsUtils */
public class GenericsUtils {
    static {
        Covode.recordClassIndex(95520);
    }

    public static Class getSuperClassGenericType(Class cls) {
        return getSuperClassGenericType(cls, 0);
    }

    public static Class getSuperClassGenericType(Class cls, int i) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        if (i >= actualTypeArguments.length || i < 0 || !(actualTypeArguments[i] instanceof Class)) {
            return Object.class;
        }
        return (Class) actualTypeArguments[i];
    }
}
