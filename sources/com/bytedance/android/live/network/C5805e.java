package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.retrofit.ExecutorC14760a;
import com.bytedance.frameworks.baselib.network.http.retrofit.p996a.p997a.C14761a;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.p1613d.p1614a.C22042h;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.network.e */
public class C5805e {

    /* renamed from: d */
    private static volatile C5805e f14643d;

    /* renamed from: a */
    public final C22092q f14644a;

    /* renamed from: b */
    public final List<AbstractC5804d> f14645b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final ConcurrentHashMap<Class, Object> f14646c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(6405);
    }

    /* renamed from: a */
    public static C5805e m12718a() {
        MethodCollector.m26663i(13191);
        if (f14643d == null) {
            synchronized (C5805e.class) {
                try {
                    if (f14643d == null) {
                        f14643d = new C5805e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13191);
                    throw th;
                }
            }
        }
        C5805e eVar = f14643d;
        MethodCollector.m26664o(13191);
        return eVar;
    }

    private C5805e() {
        C22092q.C22094a aVar = new C22092q.C22094a();
        StringBuilder sb = new StringBuilder("https://");
        C5809h.m12739a();
        C22092q.C22094a a = aVar.mo35892a(sb.append(C5809h.m12740c()).toString()).mo35890a(new C5825o());
        C22042h hVar = new C22042h(true);
        C89219l.m154721d(hVar, "");
        this.f14644a = C5826p.m12763a(a.mo35888a(new C5812j(hVar)).mo35891a(new C5814k()).mo35891a(new C5806f(C14761a.m27086a(C5810i.m12748a()))).mo35889a(new ResponseInterceptor()).mo35893a(new ExecutorC14760a()));
    }

    /* renamed from: a */
    public final void mo11573a(AbstractC5804d dVar) {
        if (dVar != null && !this.f14645b.contains(dVar)) {
            this.f14645b.add(dVar);
        }
    }

    /* renamed from: a */
    public final <T> T mo11572a(Class<T> cls) {
        T t = (T) this.f14646c.get(cls);
        if (t == null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap = this.f14646c;
            t = (T) this.f14644a.mo35884a(cls);
            concurrentHashMap.putIfAbsent(cls, t);
        }
        for (AbstractC5804d dVar : this.f14645b) {
            if (dVar.mo11571a(cls)) {
                return (T) dVar.mo11570a(cls, t);
            }
        }
        return t;
    }
}
