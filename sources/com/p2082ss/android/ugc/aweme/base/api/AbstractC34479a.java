package com.p2082ss.android.ugc.aweme.base.api;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28023p;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34483c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.base.api.a */
public abstract class AbstractC34479a {
    private static final Object sLock = new Object();
    private static final Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new C0484a());

    static {
        Covode.recordClassIndex(41434);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.ugc.aweme.base.api.a */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T checkValid() {
        Class<?> cls = getClass();
        initRequiredFieldMap(cls);
        List<Field> list = sRequiredMap.get(cls);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                Field field = list.get(i);
                if (field.get(this) == null) {
                    throw new C28027t("Unexpected null value in " + cls.getName() + ", required field: " + field.getName());
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
        return this;
    }

    public static RuntimeException getCompatibleException(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause instanceof C34485a) {
            return (RuntimeException) cause;
        }
        if (cause instanceof C28023p) {
            return new C34483c(cause);
        }
        throw cause;
    }

    public static void initRequiredFieldMap(Class<?> cls) {
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                Field[] declaredFields = cls.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.getAnnotation(AbstractC34486b.class) != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                }
                sRequiredMap.put(cls, Collections.unmodifiableList(arrayList));
            }
        }
    }
}
