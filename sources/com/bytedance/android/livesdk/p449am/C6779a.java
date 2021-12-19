package com.bytedance.android.livesdk.p449am;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.am.a */
public class C6779a {

    /* renamed from: b */
    private static volatile C6779a f16821b;

    /* renamed from: a */
    private final AbstractC88969g<Object> f16822a = new C88960c().mo143230j();

    static {
        Covode.recordClassIndex(7517);
    }

    private C6779a() {
    }

    /* renamed from: a */
    public static C6779a m14563a() {
        MethodCollector.m26663i(9240);
        if (f16821b == null) {
            synchronized (C6779a.class) {
                try {
                    if (f16821b == null) {
                        f16821b = new C6779a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9240);
                    throw th;
                }
            }
        }
        C6779a aVar = f16821b;
        MethodCollector.m26664o(9240);
        return aVar;
    }

    /* renamed from: a */
    public final void mo13053a(Object obj) {
        this.f16822a.onNext(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: f.a.t<U>, f.a.t<T> */
    /* renamed from: a */
    public final <T> AbstractC88979t<T> mo13052a(Class<T> cls) {
        return (AbstractC88979t<U>) this.f16822a.mo143272a(cls).mo143261a(C88391a.m153580a(C88392a.f200660a));
    }

    /* renamed from: a */
    public final <T> AbstractC11181z<T> mo13050a(AbstractC1204m mVar, Class<T> cls, DataChannel dataChannel) {
        return mo13051a(mVar, cls, new C6780b(dataChannel));
    }

    /* renamed from: a */
    public final <T> AbstractC11181z<T> mo13051a(AbstractC1204m mVar, Class<T> cls, AbstractC88438k<T> kVar) {
        return (AbstractC11181z) this.f16822a.mo143272a(cls).mo143268a(kVar).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19790a(mVar));
    }
}
