package com.bytedance.common.p894a.p895a;

import com.bytedance.common.p894a.C13477a;
import com.bytedance.common.p894a.p898d.C13493a;
import com.bytedance.common.p894a.p898d.C13495b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.common.a.a.a */
public final class C13478a {
    static {
        Covode.recordClassIndex(15486);
    }

    /* renamed from: a */
    public static boolean m24240a() {
        int i = 0;
        do {
            long a = C13495b.m24269a(C13477a.m24236d());
            ArrayList arrayList = new ArrayList();
            arrayList.add("cmd");
            arrayList.add("package");
            arrayList.add("compile");
            arrayList.add("-f");
            arrayList.add("-r");
            arrayList.add("bg-dexopt");
            arrayList.add(C13477a.m24234b());
            C13493a.m24268a((String[]) arrayList.toArray(new String[arrayList.size()]));
            if (C13495b.m24269a(C13477a.m24236d()) > a) {
                C13477a.m24236d();
                return true;
            }
            i++;
        } while (i < 2);
        return false;
    }
}
