package com.bytedance.geckox.policy.p1032v4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.policy.p1032v4.model.V4RequestModel;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.geckox.policy.v4.b */
public class C15004b {

    /* renamed from: e */
    private static C15004b f36658e;

    /* renamed from: a */
    public Map<String, V4RequestModel> f36659a = new ConcurrentHashMap();

    /* renamed from: b */
    public C14905e f36660b;

    /* renamed from: c */
    public Map<AbstractC14933a, Set<String>> f36661c = new ConcurrentHashMap();

    /* renamed from: d */
    public AtomicBoolean f36662d = new AtomicBoolean(false);

    /* renamed from: f */
    private AtomicInteger f36663f = new AtomicInteger(0);

    /* renamed from: g */
    private AtomicBoolean f36664g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17146);
    }

    private C15004b() {
    }

    /* renamed from: a */
    public static C15004b m27618a() {
        MethodCollector.m26663i(4467);
        if (f36658e == null) {
            synchronized (C15004b.class) {
                try {
                    if (f36658e == null) {
                        f36658e = new C15004b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4467);
                    throw th;
                }
            }
        }
        C15004b bVar = f36658e;
        MethodCollector.m26664o(4467);
        return bVar;
    }
}
