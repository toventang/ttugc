package com.bytedance.helios.p1085a.p1086a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.a.a.e */
public final class C15292e {

    /* renamed from: a */
    public static final C15292e f37312a = new C15292e();

    private C15292e() {
    }

    static {
        Covode.recordClassIndex(17522);
    }

    /* renamed from: a */
    public static Class<?> m28198a(String str) {
        C89219l.m154719c(str, "");
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m28199a(Class<?> cls, String str, Class<?>... clsArr) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(clsArr, "");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception unused) {
            return null;
        }
    }
}
