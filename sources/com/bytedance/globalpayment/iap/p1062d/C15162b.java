package com.bytedance.globalpayment.iap.p1062d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15134c;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15152c;
import com.bytedance.globalpayment.iap.p1062d.p1063a.C15159a;
import com.bytedance.globalpayment.iap.p1062d.p1063a.C15161b;
import com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a;
import com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15164b;

/* renamed from: com.bytedance.globalpayment.iap.d.b */
public class C15162b implements AbstractC15158a {

    /* renamed from: a */
    private static volatile AbstractC15158a f36994a;

    /* renamed from: b */
    private static volatile AbstractC15164b f36995b;

    /* renamed from: c */
    private static volatile AbstractC15152c f36996c;

    /* renamed from: d */
    private static volatile AbstractC15163a f36997d;

    static {
        Covode.recordClassIndex(17342);
    }

    /* renamed from: d */
    public static AbstractC15158a m27903d() {
        MethodCollector.m26663i(10024);
        if (f36994a == null) {
            synchronized (C15162b.class) {
                try {
                    if (f36994a == null) {
                        f36994a = new C15162b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10024);
                    throw th;
                }
            }
        }
        AbstractC15158a aVar = f36994a;
        MethodCollector.m26664o(10024);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.AbstractC15158a
    /* renamed from: a */
    public final AbstractC15164b mo24492a() {
        MethodCollector.m26663i(10025);
        if (f36995b == null) {
            synchronized (this) {
                try {
                    if (f36995b == null) {
                        f36995b = new C15161b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10025);
                    throw th;
                }
            }
        }
        AbstractC15164b bVar = f36995b;
        MethodCollector.m26664o(10025);
        return bVar;
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.AbstractC15158a
    /* renamed from: b */
    public final AbstractC15152c mo24493b() {
        MethodCollector.m26663i(10026);
        if (f36996c == null) {
            synchronized (this) {
                try {
                    if (f36996c == null) {
                        f36996c = new C15134c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10026);
                    throw th;
                }
            }
        }
        AbstractC15152c cVar = f36996c;
        MethodCollector.m26664o(10026);
        return cVar;
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.AbstractC15158a
    /* renamed from: c */
    public final AbstractC15163a mo24494c() {
        MethodCollector.m26663i(10027);
        if (f36997d == null) {
            synchronized (this) {
                try {
                    if (f36997d == null) {
                        f36997d = new C15159a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10027);
                    throw th;
                }
            }
        }
        AbstractC15163a aVar = f36997d;
        MethodCollector.m26664o(10027);
        return aVar;
    }
}
