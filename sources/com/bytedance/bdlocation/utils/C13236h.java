package com.bytedance.bdlocation.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC27894b;
import com.google.gson.C27896c;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.bdlocation.utils.h */
public final class C13236h implements AbstractC27894b {
    static {
        Covode.recordClassIndex(15197);
    }

    @Override // com.google.gson.AbstractC27894b
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.AbstractC27894b
    public final boolean shouldSkipField(C27896c cVar) {
        String name = cVar.f65504a.getName();
        for (Class<? super Object> superclass = cVar.f65504a.getDeclaringClass().getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (m23793a(superclass, name) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Field m23793a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
