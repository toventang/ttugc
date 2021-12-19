package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.common.d.m */
public final class C24098m {
    static {
        Covode.recordClassIndex(28226);
    }

    /* renamed from: a */
    public static void m45630a(Throwable th) {
        m45631a(th, Error.class);
        m45631a(th, RuntimeException.class);
    }

    /* renamed from: b */
    public static RuntimeException m45632b(Throwable th) {
        m45630a((Throwable) C24091i.m45617a(th));
        throw new RuntimeException(th);
    }

    /* renamed from: c */
    public static String m45633c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private static <X extends Throwable> void m45631a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }
}
