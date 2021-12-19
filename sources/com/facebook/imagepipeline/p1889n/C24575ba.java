package com.facebook.imagepipeline.p1889n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ba */
public final class C24575ba<T> implements AbstractC24544ak<T> {

    /* renamed from: a */
    public int f58391a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<Pair<AbstractC24596k<T>, AbstractC24545al>> f58392b;

    /* renamed from: c */
    public final Executor f58393c;

    /* renamed from: d */
    private final AbstractC24544ak<T> f58394d;

    /* renamed from: e */
    private final int f58395e = 5;

    static {
        Covode.recordClassIndex(28719);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.ba$a */
    public class C24576a extends AbstractC24604n<T, T> {
        static {
            Covode.recordClassIndex(28720);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40276a() {
            this.f58467e.mo40432b();
            m47006c();
        }

        /* renamed from: c */
        private void m47006c() {
            final Pair<AbstractC24596k<T>, AbstractC24545al> poll;
            MethodCollector.m26663i(3691);
            synchronized (C24575ba.this) {
                try {
                    poll = C24575ba.this.f58392b.poll();
                    if (poll == null) {
                        C24575ba baVar = C24575ba.this;
                        baVar.f58391a--;
                    }
                } finally {
                    MethodCollector.m26664o(3691);
                }
            }
            if (poll != null) {
                C24575ba.this.f58393c.execute(new Runnable() {
                    /* class com.facebook.imagepipeline.p1889n.C24575ba.C24576a.RunnableC245771 */

                    static {
                        Covode.recordClassIndex(28721);
                    }

                    public final void run() {
                        C24575ba.this.mo40436b((AbstractC24596k) poll.first, (AbstractC24545al) poll.second);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40279a(Throwable th) {
            this.f58467e.mo40435b(th);
            m47006c();
        }

        private C24576a(AbstractC24596k<T> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40278a(T t, int i) {
            this.f58467e.mo40434b(t, i);
            if (m46992a(i)) {
                m47006c();
            }
        }

        /* synthetic */ C24576a(C24575ba baVar, AbstractC24596k kVar, byte b) {
            this(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40436b(AbstractC24596k<T> kVar, AbstractC24545al alVar) {
        alVar.mo40416c().onProducerFinishWithSuccess(alVar.mo40415b(), "ThrottlingProducer", null);
        this.f58394d.mo40379a(new C24576a(this, kVar, (byte) 0), alVar);
    }

    public C24575ba(Executor executor, AbstractC24544ak<T> akVar) {
        this.f58393c = (Executor) C24091i.m45617a(executor);
        this.f58394d = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58392b = new ConcurrentLinkedQueue<>();
        this.f58391a = 0;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<T> kVar, AbstractC24545al alVar) {
        boolean z;
        MethodCollector.m26663i(3696);
        alVar.mo40416c().onProducerStart(alVar.mo40415b(), "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.f58391a;
                z = true;
                if (i >= this.f58395e) {
                    this.f58392b.add(Pair.create(kVar, alVar));
                } else {
                    this.f58391a = i + 1;
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(3696);
            }
        }
        if (!z) {
            mo40436b(kVar, alVar);
        }
    }
}
