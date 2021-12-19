package com.bytedance.globalpayment.p1036a.p1037a.p1038a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15093a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15096b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15100a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15101b;

/* renamed from: com.bytedance.globalpayment.a.a.a.a */
public class C15074a implements AbstractC15079b {

    /* renamed from: a */
    private static volatile AbstractC15079b f36794a;

    /* renamed from: b */
    private static volatile AbstractC15100a f36795b;

    /* renamed from: c */
    private static volatile AbstractC15101b f36796c;

    static {
        Covode.recordClassIndex(17242);
    }

    private C15074a() {
    }

    /* renamed from: a */
    public static AbstractC15079b m27751a() {
        MethodCollector.m26663i(11083);
        if (f36794a == null) {
            synchronized (C15074a.class) {
                try {
                    if (f36794a == null) {
                        f36794a = new C15074a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11083);
                    throw th;
                }
            }
        }
        AbstractC15079b bVar = f36794a;
        MethodCollector.m26664o(11083);
        return bVar;
    }

    @Override // com.bytedance.globalpayment.p1036a.p1037a.p1038a.AbstractC15079b
    /* renamed from: b */
    public final AbstractC15100a mo24346b() {
        MethodCollector.m26663i(11549);
        if (f36795b == null) {
            synchronized (this) {
                try {
                    if (f36795b == null) {
                        f36795b = new C15093a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11549);
                    throw th;
                }
            }
        }
        AbstractC15100a aVar = f36795b;
        MethodCollector.m26664o(11549);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.p1036a.p1037a.p1038a.AbstractC15079b
    /* renamed from: c */
    public final AbstractC15101b mo24347c() {
        MethodCollector.m26663i(11701);
        if (f36796c == null) {
            synchronized (this) {
                try {
                    if (f36796c == null) {
                        f36796c = new C15096b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11701);
                    throw th;
                }
            }
        }
        AbstractC15101b bVar = f36796c;
        MethodCollector.m26664o(11701);
        return bVar;
    }
}
