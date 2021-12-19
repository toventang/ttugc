package com.p2082ss.android.ugc.p4315i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.p4315i.p4316a.AbstractC84121a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.i.a */
public class C84120a {

    /* renamed from: c */
    private static volatile C84120a f187725c;

    /* renamed from: a */
    public AbstractC84121a f187726a;

    /* renamed from: b */
    public AtomicBoolean f187727b = new AtomicBoolean(true);

    static {
        Covode.recordClassIndex(98016);
    }

    private C84120a() {
    }

    /* renamed from: a */
    public static C84120a m144656a() {
        MethodCollector.m26663i(9497);
        if (f187725c == null) {
            synchronized (C84120a.class) {
                try {
                    if (f187725c == null) {
                        f187725c = new C84120a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9497);
                    throw th;
                }
            }
        }
        C84120a aVar = f187725c;
        MethodCollector.m26664o(9497);
        return aVar;
    }

    /* renamed from: a */
    public final void mo128938a(int i) {
        if (!this.f187727b.get()) {
            this.f187726a.mo95786a(i);
        }
    }
}
