package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14678b;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14682e;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.AbstractC90189o;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.i */
public class C14715i implements AbstractC90189o {

    /* renamed from: c */
    private static volatile C14715i f35786c;

    /* renamed from: a */
    ConcurrentMap<String, CopyOnWriteArrayList<C14717k>> f35787a = new ConcurrentHashMap();

    /* renamed from: b */
    private final String f35788b = C14715i.class.getSimpleName();

    static {
        Covode.recordClassIndex(16812);
    }

    /* renamed from: a */
    public static C14715i m26941a() {
        MethodCollector.m26663i(8717);
        if (f35786c == null) {
            synchronized (C14715i.class) {
                try {
                    if (f35786c == null) {
                        f35786c = new C14715i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8717);
                    throw th;
                }
            }
        }
        C14715i iVar = f35786c;
        MethodCollector.m26664o(8717);
        return iVar;
    }

    @Override // okhttp3.AbstractC90189o
    /* renamed from: a */
    public final List<InetAddress> mo23717a(String str) {
        C14678b a = C14682e.m26869a().mo23681a(str);
        if (a == null || (a.ipv4List.isEmpty() && a.ipv6List.isEmpty())) {
            return AbstractC90189o.f204843d.mo23717a(str);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : a.ipv6List) {
            arrayList.add(InetAddress.getByName(str2));
        }
        for (String str3 : a.ipv4List) {
            arrayList.add(InetAddress.getByName(str3));
        }
        if (this.f35787a.containsKey(str)) {
            Iterator<C14717k> it = this.f35787a.get(str).iterator();
            while (it.hasNext()) {
                C14717k next = it.next();
                if (next.f35812U.isEmpty() && next.f35811T == C14678b.EnumC14679a.UNKNOWN) {
                    next.f35811T = a.source;
                    next.f35812U.addAll(a.ipv6List);
                    next.f35812U.addAll(a.ipv4List);
                }
            }
        }
        return arrayList;
    }
}
