package com.lynx.tasm.behavior.p2050c.p2051a;

import android.os.ConditionVariable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2050c.AbstractC28493k;
import com.lynx.tasm.behavior.p2050c.C28485c;
import com.lynx.tasm.behavior.p2050c.C28486d;
import com.lynx.tasm.utils.C28929m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.c.a.b */
public final class C28481b extends C28479a {

    /* renamed from: c */
    private final List<AbstractC28493k> f66993c = new ArrayList();

    /* renamed from: d */
    private final Map<AbstractC28493k.C28494a, AbstractC28493k> f66994d = new C28483a();

    /* renamed from: e */
    private final ConditionVariable f66995e = new ConditionVariable();

    /* renamed from: f */
    private final ConditionVariable f66996f = new ConditionVariable();

    /* renamed from: g */
    private int f66997g = 0;

    static {
        Covode.recordClassIndex(34479);
    }

    /* renamed from: com.lynx.tasm.behavior.c.a.b$a */
    protected static class C28483a extends LinkedHashMap<AbstractC28493k.C28494a, AbstractC28493k> {
        static {
            Covode.recordClassIndex(34481);
        }

        protected C28483a() {
        }

        public final AbstractC28493k put(AbstractC28493k.C28494a aVar, AbstractC28493k kVar) {
            AbstractC28493k kVar2 = (AbstractC28493k) super.put((Object) aVar, (Object) kVar);
            if (kVar2 != null) {
                kVar.mo49012a(kVar2);
            }
            return kVar2;
        }
    }

    @Override // com.lynx.tasm.behavior.p2050c.p2051a.C28479a
    /* renamed from: b */
    public final void mo49003b() {
        this.f66997g = 0;
        this.f66996f.close();
        this.f66995e.close();
    }

    /* renamed from: c */
    public final void mo49008c() {
        MethodCollector.m26663i(2911);
        TraceEvent.m56864a(0, "UIOperationQueueAsyncRender.flush");
        ArrayList<AbstractC28493k> arrayList = new ArrayList();
        synchronized (this.f66994d) {
            try {
                for (AbstractC28493k kVar : this.f66994d.values()) {
                    arrayList.add(kVar);
                }
                this.f66994d.clear();
            } catch (Throwable th) {
                MethodCollector.m26664o(2911);
                throw th;
            }
        }
        for (AbstractC28493k kVar2 : arrayList) {
            kVar2.mo49013b(this.f66982a);
            if (kVar2 instanceof C28485c) {
                this.f66997g = 3;
            }
        }
        TraceEvent.m56869b(0, "UIOperationQueueAsyncRender.flush");
        MethodCollector.m26664o(2911);
    }

    @Override // com.lynx.tasm.behavior.p2050c.p2051a.C28479a
    /* renamed from: a */
    public final void mo48991a() {
        MethodCollector.m26663i(2902);
        if (C28929m.m57950a()) {
            if (!this.f66983b && this.f66997g != 3) {
                long currentTimeMillis = System.currentTimeMillis();
                TraceEvent.m56864a(0, "UIOperationQueueAsyncRender.flush.waitTASM");
                if (!this.f66996f.block(100)) {
                    LLog.m56856a(6, "lynx_UIOperationQueueAsyncRender", "flush on ui thread failed, wait tasm finish timeout");
                }
                TraceEvent.m56869b(0, "UIOperationQueueAsyncRender.flush.waitTASM");
                mo49008c();
                TraceEvent.m56864a(0, "UIOperationQueueAsyncRender.flush.waitLayout");
                if (!this.f66995e.block(100)) {
                    LLog.m56856a(6, "lynx_UIOperationQueueAsyncRender", "flush on ui thread failed, wait layout finish timeout");
                }
                TraceEvent.m56869b(0, "UIOperationQueueAsyncRender.flush.waitLayout");
                mo49008c();
                mo49007a(new AbstractC28838o.C28839a(true, currentTimeMillis, System.currentTimeMillis()));
            }
            MethodCollector.m26664o(2902);
            return;
        }
        synchronized (this.f66994d) {
            try {
                for (AbstractC28493k kVar : this.f66993c) {
                    this.f66994d.put(kVar.f67006b, kVar);
                }
                this.f66993c.clear();
            } catch (Throwable th) {
                MethodCollector.m26664o(2902);
                throw th;
            }
        }
        int i = this.f66997g;
        if (i == 1) {
            this.f66996f.open();
        } else if (i == 2) {
            this.f66995e.open();
        }
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.tasm.behavior.p2050c.p2051a.C28481b.RunnableC284821 */

            static {
                Covode.recordClassIndex(34480);
            }

            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C28481b.this.mo49008c();
                C28481b.this.mo49007a(new AbstractC28838o.C28839a(false, currentTimeMillis, System.currentTimeMillis()));
            }
        });
        MethodCollector.m26664o(2902);
    }

    /* renamed from: a */
    public final void mo49007a(AbstractC28838o.C28839a aVar) {
        this.f66982a.f67111c.f67072m.mo49969a(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.p2051a.C28479a
    /* renamed from: a */
    public final void mo49002a(AbstractC28493k kVar) {
        this.f66993c.add(kVar);
        if (kVar instanceof C28486d) {
            this.f66997g = 1;
        } else if (kVar instanceof C28485c) {
            this.f66997g = 2;
        }
    }

    public C28481b(C28529q qVar) {
        super(qVar, true);
    }
}
