package com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.p1582b;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a;

/* renamed from: com.bytedance.platform.godzilla.b.a.b.b.b */
public final class C21704b implements AbstractC21698a {
    static {
        Covode.recordClassIndex(25345);
    }

    @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a
    /* renamed from: a */
    public final boolean mo35356a(Object obj, Throwable th) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (th instanceof ClassNotFoundException) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getMethodName().contains("installProvider")) {
                    return true;
                }
            }
        }
        return false;
    }
}
