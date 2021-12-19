package com.bytedance.geckox.p1019f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.f.c */
public class C14935c {

    /* renamed from: a */
    private static Map<String, Map<String, List<AbstractC14933a>>> f36489a;

    /* renamed from: b */
    private static C14935c f36490b;

    static {
        Covode.recordClassIndex(17048);
    }

    private C14935c() {
        f36489a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static C14935c m27507a() {
        MethodCollector.m26663i(4849);
        if (f36490b == null) {
            synchronized (C14935c.class) {
                try {
                    if (f36490b == null) {
                        f36490b = new C14935c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4849);
                    throw th;
                }
            }
        }
        C14935c cVar = f36490b;
        MethodCollector.m26664o(4849);
        return cVar;
    }

    /* renamed from: a */
    public static List<AbstractC14933a> m27508a(String str, String str2) {
        Map<String, List<AbstractC14933a>> map = f36489a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized List<AbstractC14933a> mo24059b(String str, String str2) {
        MethodCollector.m26663i(4909);
        Map<String, List<AbstractC14933a>> map = f36489a.get(str);
        if (map != null) {
            List<AbstractC14933a> remove = map.remove(str2);
            MethodCollector.m26664o(4909);
            return remove;
        }
        MethodCollector.m26664o(4909);
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo24058a(String str, String str2, AbstractC14933a aVar) {
        List<AbstractC14933a> synchronizedList;
        MethodCollector.m26663i(4904);
        Map<String, List<AbstractC14933a>> map = f36489a.get(str);
        if (map != null) {
            synchronizedList = map.get(str2);
            if (synchronizedList == null) {
                synchronizedList = Collections.synchronizedList(new ArrayList());
            }
        } else {
            map = new ConcurrentHashMap<>();
            synchronizedList = Collections.synchronizedList(new ArrayList());
        }
        synchronizedList.add(aVar);
        map.put(str2, synchronizedList);
        f36489a.put(str, map);
        MethodCollector.m26664o(4904);
    }
}
