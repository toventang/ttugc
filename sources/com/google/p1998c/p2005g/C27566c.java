package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: com.google.c.g.c */
public final class C27566c {
    static {
        Covode.recordClassIndex(33146);
    }

    /* renamed from: a */
    public static <T> T m55105a(Class<T> cls, InvocationHandler invocationHandler) {
        C27245k.m54229a(invocationHandler);
        C27245k.m54240a(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
