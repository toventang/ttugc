package com.bytedance.geckox.p1017e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.p1030d.C14988c;
import com.bytedance.geckox.utils.C15068o;
import com.bytedance.p1603q.AbstractC21931b;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.geckox.e.a */
public final class C14907a implements C14988c.AbstractC14989a {

    /* renamed from: a */
    public AbstractC21931b f36435a;

    /* renamed from: b */
    private Executor f36436b;

    static {
        Covode.recordClassIndex(17020);
    }

    @Override // com.bytedance.geckox.policy.p1030d.C14988c.AbstractC14989a
    /* renamed from: a */
    public final void mo24018a() {
        if (this.f36435a != null) {
            if (this.f36436b == null) {
                this.f36436b = C15068o.m27745a().mo24343b();
            }
            this.f36436b.execute(new Runnable() {
                /* class com.bytedance.geckox.p1017e.C14907a.RunnableC149081 */

                static {
                    Covode.recordClassIndex(17021);
                }

                public final void run() {
                    try {
                        C14957a.m27543a("check request retry start");
                        C14907a.this.f36435a.mo35694a("req_type", 2);
                        C14907a.this.f36435a.mo35690a();
                    } catch (Exception unused) {
                        C14957a.m27543a("check request retry failed");
                    }
                }
            });
        }
    }

    public C14907a(Executor executor, AbstractC21931b bVar) {
        this.f36436b = executor;
        this.f36435a = bVar;
    }
}
