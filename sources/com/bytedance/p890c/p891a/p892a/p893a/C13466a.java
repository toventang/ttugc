package com.bytedance.p890c.p891a.p892a.p893a;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;

/* renamed from: com.bytedance.c.a.a.a.a */
public final class C13466a {

    /* renamed from: a */
    public final LinkedList<C13476h> f32801a = new LinkedList<>();

    /* renamed from: b */
    private volatile boolean f32802b = false;

    static {
        Covode.recordClassIndex(15474);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21746a() {
        if (!this.f32802b) {
            if (ApmDelegate.C12507a.f30372a.f30340h) {
                this.f32802b = true;
            }
            C12560b.C12564a.f30567a.mo20391b(new Runnable() {
                /* class com.bytedance.p890c.p891a.p892a.p893a.C13466a.RunnableC134671 */

                static {
                    Covode.recordClassIndex(15475);
                }

                public final void run() {
                    MethodCollector.m26663i(10798);
                    try {
                        if (ApmDelegate.C12507a.f30372a.f30340h) {
                            LinkedList linkedList = new LinkedList();
                            synchronized (C13466a.this.f32801a) {
                                try {
                                    linkedList.addAll(C13466a.this.f32801a);
                                    C13466a.this.f32801a.clear();
                                } finally {
                                    MethodCollector.m26664o(10798);
                                }
                            }
                            while (!linkedList.isEmpty()) {
                                C13476h hVar = (C13476h) linkedList.poll();
                                if (hVar != null) {
                                    C13469c.m24220a().mo21750a(hVar.f32817a, hVar.f32818b, null, false);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                        MethodCollector.m26664o(10798);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21747a(String str, String str2) {
        MethodCollector.m26663i(10947);
        if (this.f32802b) {
            MethodCollector.m26664o(10947);
            return;
        }
        synchronized (this.f32801a) {
            try {
                if (this.f32801a.size() > 40) {
                    this.f32801a.poll();
                }
                this.f32801a.add(new C13476h(str, str2));
            } finally {
                MethodCollector.m26664o(10947);
            }
        }
    }
}
