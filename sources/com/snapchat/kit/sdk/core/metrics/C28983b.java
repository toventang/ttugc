package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b */
public final class C28983b<T> implements MetricQueue<T> {

    /* renamed from: a */
    final MetricPublisher<T> f68469a;

    /* renamed from: b */
    final ScheduledExecutorService f68470b;

    /* renamed from: c */
    final LinkedHashSet<C29005d<T>> f68471c = new LinkedHashSet<>();

    /* renamed from: d */
    final LinkedHashSet<C29005d<T>> f68472d = new LinkedHashSet<>();

    /* renamed from: e */
    final AtomicReference<Future<?>> f68473e = new AtomicReference<>();

    /* renamed from: f */
    final int f68474f;

    /* renamed from: g */
    public final Runnable f68475g = new Runnable() {
        /* class com.snapchat.kit.sdk.core.metrics.C28983b.RunnableC289841 */

        static {
            Covode.recordClassIndex(35181);
        }

        public final void run() {
            C28983b.this.mo50355b();
        }
    };

    /* renamed from: h */
    private final C28994c f68476h;

    static {
        Covode.recordClassIndex(35180);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50355b() {
        Future<?> andSet = this.f68473e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
        if (!this.f68471c.isEmpty()) {
            final ArrayList arrayList = new ArrayList(this.f68471c);
            this.f68471c.clear();
            this.f68472d.addAll(arrayList);
            this.f68469a.publishMetrics(m57995a(arrayList), new MetricPublisher.PublishCallback() {
                /* class com.snapchat.kit.sdk.core.metrics.C28983b.C289874 */

                static {
                    Covode.recordClassIndex(35184);
                }

                @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback
                public final void onNetworkError() {
                    C28983b.this.f68470b.execute(new Runnable() {
                        /* class com.snapchat.kit.sdk.core.metrics.C28983b.C289874.RunnableC289892 */

                        static {
                            Covode.recordClassIndex(35186);
                        }

                        public final void run() {
                            C28983b.this.f68472d.removeAll(arrayList);
                            C28983b.this.f68471c.addAll(arrayList);
                        }
                    });
                }

                @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback
                public final void onSuccess() {
                    C28983b.this.f68470b.execute(new Runnable() {
                        /* class com.snapchat.kit.sdk.core.metrics.C28983b.C289874.RunnableC289881 */

                        static {
                            Covode.recordClassIndex(35185);
                        }

                        public final void run() {
                            C28983b.this.f68472d.removeAll(arrayList);
                            C28983b.m57996a(C28983b.this);
                        }
                    });
                }

                @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback
                public final void onServerError(final Error error) {
                    C28983b.this.f68470b.execute(new Runnable() {
                        /* class com.snapchat.kit.sdk.core.metrics.C28983b.C289874.RunnableC289903 */

                        static {
                            Covode.recordClassIndex(35187);
                        }

                        public final void run() {
                            C28983b.this.f68472d.removeAll(arrayList);
                            for (C29005d<T> dVar : arrayList) {
                                if (dVar.f68518a <= 0) {
                                    dVar.f68518a++;
                                    C28983b.this.f68471c.add(dVar);
                                }
                            }
                            C28983b.m57996a(C28983b.this);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo50354a() {
        this.f68470b.execute(new Runnable() {
            /* class com.snapchat.kit.sdk.core.metrics.C28983b.RunnableC289852 */

            static {
                Covode.recordClassIndex(35182);
            }

            public final void run() {
                List<C29005d<T>> persistedEvents = C28983b.this.f68469a.getPersistedEvents();
                if (persistedEvents != null && !persistedEvents.isEmpty()) {
                    C28983b.this.f68471c.addAll(persistedEvents);
                    C28983b.this.f68473e.set(C28983b.this.f68470b.schedule(C28983b.this.f68475g, 1000, TimeUnit.MILLISECONDS));
                }
            }
        });
        this.f68476h.f68490a.add(this);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricQueue
    public final void push(final T t) {
        this.f68470b.execute(new Runnable() {
            /* class com.snapchat.kit.sdk.core.metrics.C28983b.RunnableC289863 */

            static {
                Covode.recordClassIndex(35183);
            }

            public final void run() {
                C28983b.this.f68471c.add(new C29005d<>(t));
                C28983b.m57996a(C28983b.this);
                if (C28983b.this.f68471c.size() >= C28983b.this.f68474f) {
                    C28983b.this.mo50355b();
                } else if (C28983b.this.f68473e.get() == null) {
                    C28983b.this.f68473e.set(C28983b.this.f68470b.schedule(C28983b.this.f68475g, 30000, TimeUnit.MILLISECONDS));
                }
            }
        });
    }

    /* renamed from: a */
    private static <T> List<T> m57995a(Collection<C29005d<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C29005d<T> dVar : collection) {
            arrayList.add(dVar.f68519b);
        }
        return arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ void m57996a(C28983b bVar) {
        ArrayList arrayList = new ArrayList(bVar.f68471c);
        arrayList.addAll(bVar.f68472d);
        bVar.f68469a.persistMetrics(arrayList);
    }

    public C28983b(MetricPublisher<T> metricPublisher, ScheduledExecutorService scheduledExecutorService, C28994c cVar, int i) {
        this.f68469a = metricPublisher;
        this.f68470b = scheduledExecutorService;
        this.f68474f = i;
        this.f68476h = cVar;
    }
}
