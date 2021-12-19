package com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.p1582b;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.b.a.b.b.a */
public final class C21703a implements AbstractC21698a {

    /* renamed from: a */
    private static List<String> f51481a;

    static {
        Covode.recordClassIndex(25344);
        ArrayList arrayList = new ArrayList();
        f51481a = arrayList;
        arrayList.add("FILE_PROVIDER_PATHS");
        f51481a.add("NullPointerException");
        f51481a.add("Failed to resolve canonical path");
        f51481a.add("android.os.DeadSystemException");
        f51481a.add("Package manager has died");
    }

    @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a
    /* renamed from: a */
    public final boolean mo35356a(Object obj, Throwable th) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getMethodName().contains("installProvider") && th != null) {
                String th2 = th.toString();
                for (String str : f51481a) {
                    if (th2.contains(str)) {
                        "Hint the crash ".concat(String.valueOf(str));
                        C21689g.m40635a(C21689g.EnumC21691a.DEBUG);
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
