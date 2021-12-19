package com.bytedance.ttnet.p1700a;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ttnet.a.e */
public class C22907e {

    /* renamed from: a */
    private static volatile C22907e f54110a;

    static {
        Covode.recordClassIndex(26815);
    }

    /* renamed from: a */
    public static C22907e m43179a() {
        MethodCollector.m26663i(4259);
        if (f54110a == null) {
            synchronized (C22907e.class) {
                try {
                    if (f54110a == null) {
                        f54110a = new C22907e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4259);
                    throw th;
                }
            }
        }
        C22907e eVar = f54110a;
        MethodCollector.m26664o(4259);
        return eVar;
    }

    /* renamed from: a */
    static List<String> m43180a(String str) {
        ArrayList arrayList = new ArrayList();
        if (C13627m.m24498a(str)) {
            return arrayList;
        }
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!C13627m.m24498a(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static List<String> m43181a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String[] split = str.split(";");
            for (String str2 : split) {
                if (!C13627m.m24498a(str2)) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }
}
