package com.p2082ss.ttvideoengine.p4407a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttvideoengine.a.a */
public class C86299a {

    /* renamed from: d */
    private static boolean f192759d;

    /* renamed from: e */
    private static C86299a f192760e;

    /* renamed from: a */
    public final Lock f192761a = new ReentrantLock();

    /* renamed from: b */
    public final List<String> f192762b = new ArrayList();

    /* renamed from: c */
    public final Map<String, IABRModule> f192763c = new HashMap();

    /* renamed from: f */
    private int f192764f;

    /* renamed from: g */
    private final List<IABRModule> f192765g = new ArrayList();

    static {
        Covode.recordClassIndex(101527);
    }

    private C86299a() {
    }

    /* renamed from: a */
    public static C86299a m148585a() {
        MethodCollector.m26663i(5696);
        if (f192760e == null) {
            synchronized (C86299a.class) {
                try {
                    if (f192760e == null) {
                        f192760e = new C86299a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5696);
                    throw th;
                }
            }
        }
        C86299a aVar = f192760e;
        MethodCollector.m26664o(5696);
        return aVar;
    }

    /* renamed from: b */
    public final IABRModule mo137120b() {
        IABRModule iABRModule = null;
        if (!f192759d) {
            return null;
        }
        this.f192761a.lock();
        if (this.f192765g.size() > 0) {
            iABRModule = this.f192765g.remove(0);
        } else if (this.f192764f < 8) {
            iABRModule = new DefaultABRModule();
            this.f192764f++;
        } else if (this.f192762b.size() >= 6) {
            iABRModule = this.f192763c.remove(this.f192762b.remove(0));
        }
        this.f192761a.unlock();
        return iABRModule;
    }

    /* renamed from: a */
    public final void mo137119a(IABRModule iABRModule) {
        this.f192761a.lock();
        iABRModule.stop();
        this.f192765g.add(iABRModule);
        this.f192761a.unlock();
    }

    /* renamed from: a */
    public final IABRModule mo137118a(String str) {
        if (!f192759d || TextUtils.isEmpty(str)) {
            return null;
        }
        this.f192761a.lock();
        IABRModule remove = this.f192763c.remove(str);
        this.f192762b.remove(str);
        this.f192761a.unlock();
        return remove;
    }
}
