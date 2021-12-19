package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.bh */
public class C6907bh implements AbstractC11660n {

    /* renamed from: a */
    private static volatile C6907bh f17295a;

    /* renamed from: b */
    private final Map<String, AbstractC6908a> f17296b;

    /* renamed from: com.bytedance.android.livesdk.bh$a */
    interface AbstractC6908a {
        static {
            Covode.recordClassIndex(7646);
        }

        /* renamed from: a */
        String mo13180a();

        /* renamed from: a */
        boolean mo13181a(Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(7645);
    }

    private C6907bh() {
        HashMap hashMap = new HashMap();
        this.f17296b = hashMap;
        C6882at atVar = new C6882at();
        hashMap.put(atVar.mo13180a(), atVar);
    }

    /* renamed from: a */
    public static C6907bh m14783a() {
        MethodCollector.m26663i(2669);
        if (f17295a == null) {
            synchronized (C6907bh.class) {
                try {
                    if (f17295a == null) {
                        f17295a = new C6907bh();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2669);
                    throw th;
                }
            }
        }
        C6907bh bhVar = f17295a;
        MethodCollector.m26664o(2669);
        return bhVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n
    /* renamed from: a */
    public final boolean mo13211a(Map<String, String> map) {
        Set<String> keySet = this.f17296b.keySet();
        if (C13603b.m24435a((Collection) keySet)) {
            return false;
        }
        String remove = map.remove("intercept");
        if (C13627m.m24498a(remove) || !keySet.contains(remove) || this.f17296b.get(remove) == null) {
            return false;
        }
        return this.f17296b.get(remove).mo13181a(map);
    }
}
