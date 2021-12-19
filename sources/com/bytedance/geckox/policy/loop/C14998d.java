package com.bytedance.geckox.policy.loop;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14948g;
import com.bytedance.geckox.p1017e.C14914e;
import com.bytedance.geckox.p1017e.C14919h;
import com.bytedance.geckox.p1017e.C14920i;
import com.bytedance.geckox.p1017e.C14922k;
import com.bytedance.geckox.p1019f.C14934b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.loop.C14995c;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.utils.C15068o;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.C21934c;
import com.bytedance.p1603q.C21940h;
import com.bytedance.p1603q.p1605b.C21933b;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.policy.loop.d */
public final class C14998d implements C14995c.AbstractC14997a {

    /* renamed from: a */
    public C14905e f36640a;

    /* renamed from: b */
    public LoopInterval.EnumC15000a f36641b;

    static {
        Covode.recordClassIndex(17135);
    }

    @Override // com.bytedance.geckox.policy.loop.C14995c.AbstractC14997a
    /* renamed from: a */
    public final void mo24219a(final Map<String, LoopRequestModel> map) {
        C15068o.m27745a().mo24343b().execute(new Runnable() {
            /* class com.bytedance.geckox.policy.loop.C14998d.RunnableC149991 */

            static {
                Covode.recordClassIndex(17136);
            }

            public final void run() {
                try {
                    C14957a.m27543a("[loop]loop start checkUpdate");
                    C14905e eVar = C14998d.this.f36640a;
                    Map map = map;
                    LoopInterval.EnumC15000a aVar = C14998d.this.f36641b;
                    C14993a aVar2 = new C14993a();
                    List<C21940h> a = C14948g.m27526a();
                    C21940h.C21941a a2 = new C21940h.C21941a().mo35698a(C14920i.class);
                    a2.f51929c = new Object[]{false};
                    a.add(a2.mo35699a());
                    C21940h.C21941a a3 = new C21940h.C21941a().mo35698a(C14914e.class);
                    a3.f51929c = new Object[]{eVar, map, aVar, null, aVar2};
                    a3.f51928b = new C21933b(C14934b.m27505a(C14914e.class));
                    a.add(a3.mo35699a());
                    a.add(new C21940h.C21941a().mo35698a(C14919h.class).mo35699a());
                    a.add(new C21940h.C21941a().mo35698a(C14922k.class).mo35699a());
                    a.addAll(C14948g.m27530b(eVar, null));
                    AbstractC21931b a4 = C21934c.m41249a(a);
                    a4.mo35694a("req_type", 3);
                    a4.mo35692a((Object) null);
                    C14957a.m27543a("[loop] checkUpdate success");
                } catch (Exception unused) {
                    C14957a.m27542a();
                }
            }
        });
    }

    public C14998d(C14905e eVar, LoopInterval.EnumC15000a aVar) {
        this.f36640a = eVar;
        this.f36641b = aVar;
    }
}
