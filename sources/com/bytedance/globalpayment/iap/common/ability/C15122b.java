package com.bytedance.globalpayment.iap.common.ability;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15132a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15133b;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15139d;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15150a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15151b;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15154e;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.b */
public class C15122b implements AbstractC15120a {

    /* renamed from: a */
    private static volatile AbstractC15120a f36911a;

    /* renamed from: b */
    private static volatile AbstractC15155f f36912b;

    /* renamed from: c */
    private static volatile AbstractC15154e f36913c;

    /* renamed from: d */
    private static volatile AbstractC15150a f36914d;

    /* renamed from: e */
    private static volatile AbstractC15151b f36915e;

    static {
        Covode.recordClassIndex(17290);
    }

    private C15122b() {
    }

    /* renamed from: e */
    public static AbstractC15120a m27797e() {
        MethodCollector.m26663i(13517);
        if (f36911a == null) {
            synchronized (C15122b.class) {
                try {
                    if (f36911a == null) {
                        f36911a = new C15122b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13517);
                    throw th;
                }
            }
        }
        AbstractC15120a aVar = f36911a;
        MethodCollector.m26664o(13517);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.AbstractC15120a
    /* renamed from: a */
    public final AbstractC15155f mo24381a() {
        MethodCollector.m26663i(13518);
        if (f36912b == null) {
            synchronized (this) {
                try {
                    if (f36912b == null) {
                        f36912b = new C15140e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13518);
                    throw th;
                }
            }
        }
        AbstractC15155f fVar = f36912b;
        MethodCollector.m26664o(13518);
        return fVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.AbstractC15120a
    /* renamed from: b */
    public final AbstractC15154e mo24382b() {
        MethodCollector.m26663i(13519);
        if (f36913c == null) {
            synchronized (this) {
                try {
                    if (f36913c == null) {
                        f36913c = new C15139d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13519);
                    throw th;
                }
            }
        }
        AbstractC15154e eVar = f36913c;
        MethodCollector.m26664o(13519);
        return eVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.AbstractC15120a
    /* renamed from: c */
    public final AbstractC15150a mo24383c() {
        MethodCollector.m26663i(13520);
        if (f36914d == null) {
            synchronized (this) {
                try {
                    if (f36914d == null) {
                        f36914d = new C15132a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13520);
                    throw th;
                }
            }
        }
        AbstractC15150a aVar = f36914d;
        MethodCollector.m26664o(13520);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.AbstractC15120a
    /* renamed from: d */
    public final AbstractC15151b mo24384d() {
        MethodCollector.m26663i(13575);
        if (f36915e == null) {
            synchronized (this) {
                try {
                    if (f36915e == null) {
                        f36915e = new C15133b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13575);
                    throw th;
                }
            }
        }
        AbstractC15151b bVar = f36915e;
        MethodCollector.m26664o(13575);
        return bVar;
    }
}
