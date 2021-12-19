package com.bytedance.retrofit2;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.n */
public final class C22060n {

    /* renamed from: a */
    public final Method f52089a;

    /* renamed from: b */
    public final List<?> f52090b;

    static {
        Covode.recordClassIndex(25760);
    }

    public final String toString() {
        return C1764a.m5928a("%s.%s() %s", new Object[]{this.f52089a.getDeclaringClass().getName(), this.f52089a.getName(), this.f52090b});
    }

    C22060n(Method method, List<?> list) {
        this.f52089a = method;
        this.f52090b = Collections.unmodifiableList(list);
    }
}
