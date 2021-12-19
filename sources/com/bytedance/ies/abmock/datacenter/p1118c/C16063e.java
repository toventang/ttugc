package com.bytedance.ies.abmock.datacenter.p1118c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.AbstractC16067f;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.keva.Keva;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ies.abmock.datacenter.c.e */
public class C16063e {

    /* renamed from: a */
    public static final C16063e f38688a = new C16063e();

    /* renamed from: b */
    public Keva f38689b = Keva.getRepoSync("unregistered_config", 1);

    /* renamed from: c */
    private C27910f f38690c;

    /* renamed from: d */
    private C28022o f38691d;

    static {
        Covode.recordClassIndex(18334);
    }

    /* renamed from: c */
    private C27910f m29747c() {
        if (this.f38690c == null) {
            this.f38690c = new C27910f();
        }
        return this.f38690c;
    }

    /* renamed from: b */
    public final Set<String> mo25484b() {
        C28022o a = mo25481a();
        if (a != null) {
            return a.f65804a.keySet();
        }
        return null;
    }

    private C16063e() {
        System.nanoTime();
        System.nanoTime();
    }

    /* renamed from: a */
    public final C28022o mo25481a() {
        MethodCollector.m26663i(6822);
        if (this.f38691d == null) {
            synchronized (C16063e.class) {
                try {
                    if (this.f38691d == null) {
                        try {
                            this.f38691d = (C28022o) m29747c().mo46670a(this.f38689b.getString("key_unregistered_config", "{}"), C28022o.class);
                            AbstractC16067f fVar = C16065e.m29769a().f38695b;
                            if (fVar != null && fVar.mo25501e()) {
                                for (Map.Entry<String, AbstractC28019l> entry : ((C28022o) m29747c().mo46670a(this.f38689b.getString("key_unregistered_config", "{}"), C28022o.class)).f65804a.entrySet()) {
                                    this.f38691d.mo46797a(entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6822);
                    throw th;
                }
            }
        }
        C28022o oVar = this.f38691d;
        MethodCollector.m26664o(6822);
        return oVar;
    }

    /* renamed from: a */
    public final Object mo25482a(String str) {
        C28022o a = mo25481a();
        if (a != null) {
            return a.mo46803c(str);
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo25483a(C28022o oVar) {
        MethodCollector.m26663i(6677);
        try {
            this.f38689b.storeString("key_unregistered_config", oVar.toString());
            this.f38691d = null;
            MethodCollector.m26664o(6677);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(6677);
        }
    }

    /* renamed from: b */
    public final synchronized void mo25485b(C28022o oVar) {
        MethodCollector.m26663i(6679);
        try {
            this.f38689b.storeString("key_unregistered_libra_config", oVar.toString());
            this.f38691d = null;
            MethodCollector.m26664o(6679);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(6679);
        }
    }
}
