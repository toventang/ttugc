package com.tencent.wcdb.support;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.tencent.wcdb.support.a */
public final class C87272a {

    /* renamed from: a */
    private boolean f197777a;

    /* renamed from: b */
    private AbstractC87273a f197778b;

    /* renamed from: c */
    private boolean f197779c;

    /* renamed from: com.tencent.wcdb.support.a$a */
    public interface AbstractC87273a {
        static {
            Covode.recordClassIndex(103169);
        }

        /* renamed from: b */
        void mo141178b();
    }

    static {
        Covode.recordClassIndex(103168);
    }

    /* renamed from: a */
    public final void mo141281a() {
        if (m151460b()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: b */
    private boolean m151460b() {
        boolean z;
        MethodCollector.m26663i(4487);
        synchronized (this) {
            try {
                z = this.f197777a;
            } finally {
                MethodCollector.m26664o(4487);
            }
        }
        return z;
    }

    /* renamed from: c */
    private void m151461c() {
        MethodCollector.m26663i(4490);
        while (this.f197779c) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        MethodCollector.m26664o(4490);
    }

    /* renamed from: a */
    public final void mo141282a(AbstractC87273a aVar) {
        MethodCollector.m26663i(4488);
        synchronized (this) {
            try {
                m151461c();
                if (this.f197778b != aVar) {
                    this.f197778b = aVar;
                    if (!this.f197777a || aVar == null) {
                        MethodCollector.m26664o(4488);
                        return;
                    }
                    aVar.mo141178b();
                    MethodCollector.m26664o(4488);
                }
            } finally {
                MethodCollector.m26664o(4488);
            }
        }
    }
}
