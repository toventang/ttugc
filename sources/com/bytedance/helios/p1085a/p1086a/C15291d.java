package com.bytedance.helios.p1085a.p1086a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.a.a.d */
public final class C15291d {

    /* renamed from: a */
    public static Class<?> f37309a = C15292e.m28198a("android.os.SystemProperties");

    /* renamed from: b */
    public static Method f37310b;

    /* renamed from: c */
    public static final C15291d f37311c = new C15291d();

    private C15291d() {
    }

    static {
        Method method;
        Covode.recordClassIndex(17521);
        Class[] clsArr = {String.class, String.class};
        C89219l.m154719c("android.os.SystemProperties", "");
        C89219l.m154719c("get", "");
        C89219l.m154719c(clsArr, "");
        Class<?> a = C15292e.m28198a("android.os.SystemProperties");
        if (a != null) {
            method = C15292e.m28199a(a, "get", (Class[]) Arrays.copyOf(clsArr, 2));
        } else {
            method = null;
        }
        f37310b = method;
    }
}
