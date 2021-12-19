package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p2006h.p2007a.C27667v;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84449h;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84445d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84446e;
import com.p2082ss.android.ugc.tools.utils.C84894f;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.a.a */
public abstract class AbstractC84461a<KEY, RESULT, INFO> implements AbstractC84449h<KEY, RESULT, INFO> {

    /* renamed from: d */
    public static final C84462a f188793d = new C84462a((byte) 0);

    /* renamed from: a */
    public final AbstractC88969g<C84445d<KEY, RESULT>> f188794a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, RunnableC84474f<KEY, RESULT>> f188795b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final int f188796c;

    /* renamed from: e */
    private final AtomicInteger f188797e = new AtomicInteger(0);

    /* renamed from: f */
    private AbstractC84454k<KEY, INFO> f188798f;

    /* renamed from: g */
    private final AbstractC89244h f188799g = C89250i.m154773a((AbstractC89171a) new C84465c(this));

    static {
        Covode.recordClassIndex(98426);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo119499a(KEY key);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo119500a(KEY key, AbstractC84447f<KEY, RESULT, INFO> fVar);

    /* renamed from: com.ss.android.ugc.tools.h.b.a.a$a */
    public static final class C84462a {
        static {
            Covode.recordClassIndex(98427);
        }

        private C84462a() {
        }

        public /* synthetic */ C84462a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.a$c */
    static final class C84465c extends AbstractC89220m implements AbstractC89171a<C84894f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84461a f188804a;

        static {
            Covode.recordClassIndex(98430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84465c(AbstractC84461a aVar) {
            super(0);
            this.f188804a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84894f invoke() {
            C84894f fVar = new C84894f(Math.min((Runtime.getRuntime().availableProcessors() * 2) + 1, this.f188804a.f188796c), this.f188804a.f188796c, TimeUnit.MILLISECONDS, new PriorityBlockingQueue());
            fVar.allowCoreThreadTimeOut(true);
            return fVar;
        }
    }

    /* renamed from: a */
    public final void mo129440a(AbstractC84454k<KEY, INFO> kVar) {
        C89219l.m154721d(kVar, "");
        this.f188798f = kVar;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.a$d */
    static final class C84466d<T> implements AbstractC88433f<C84445d<KEY, RESULT>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84461a f188805a;

        static {
            Covode.recordClassIndex(98431);
        }

        C84466d(AbstractC84461a aVar) {
            this.f188805a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.m26663i(5499);
            C84445d<KEY, RESULT> dVar = (C84445d) obj;
            if (dVar.f188779a == EnumC84446e.SUCCESS || dVar.f188779a == EnumC84446e.FAILED) {
                synchronized (this.f188805a.f188795b) {
                    try {
                        this.f188805a.f188795b.remove(this.f188805a.mo119499a((Object) dVar.f188780b));
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5499);
                        throw th;
                    }
                }
            }
            this.f188805a.f188794a.onNext(dVar);
            MethodCollector.m26664o(5499);
        }
    }

    public AbstractC84461a(int i) {
        this.f188796c = i;
        AbstractC88969g<C84445d<KEY, RESULT>> j = new C88960c().mo143230j();
        C89219l.m154716b(j, "");
        this.f188794a = j;
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84449h
    /* renamed from: b */
    public final C89378p<EnumC84446e, Boolean> mo129431b(KEY key) {
        RunnableC84474f<KEY, RESULT> fVar = this.f188795b.get(mo119499a((Object) key));
        EnumC84446e eVar = null;
        if (fVar == null) {
            return null;
        }
        C84445d<KEY, RESULT> i = fVar.f188821a.mo143221i();
        if (i != null) {
            eVar = i.f188779a;
        }
        return C89387v.m154943a(eVar, Boolean.valueOf(fVar.f188824d));
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.a$b */
    static final class C84463b<T1, T2, R> implements AbstractC88430c<KEY, AbstractC89172b<? super Integer, ? extends C89391z>, RESULT> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84461a f188800a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84454k f188801b;

        static {
            Covode.recordClassIndex(98428);
        }

        C84463b(AbstractC84461a aVar, AbstractC84454k kVar) {
            this.f188800a = aVar;
            this.f188801b = kVar;
        }

        /* renamed from: com.ss.android.ugc.tools.h.b.a.a$b$a */
        public static final class C84464a implements AbstractC84447f<KEY, RESULT, INFO> {

            /* renamed from: a */
            final /* synthetic */ C27667v f188802a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89172b f188803b;

            static {
                Covode.recordClassIndex(98429);
            }

            C84464a(C27667v vVar, AbstractC89172b bVar) {
                this.f188802a = vVar;
                this.f188803b = bVar;
            }

            @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
            /* renamed from: a */
            public final void mo119502a(KEY key, int i) {
                this.f188803b.invoke(Integer.valueOf(i));
            }

            @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
            /* renamed from: a */
            public final void mo119504a(KEY key, RESULT result) {
                this.f188802a.mo46227b(new C84476g(key, result, true, null, null, null));
            }

            @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
            /* renamed from: a */
            public final void mo119503a(KEY key, Exception exc, INFO info, long j) {
                this.f188802a.mo46227b(new C84476g(key, null, false, info, Long.valueOf(j), exc));
            }

            @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
            /* renamed from: a */
            public final void mo119505a(KEY key, RESULT result, INFO info, long j) {
                this.f188802a.mo46227b(new C84476g(key, result, false, info, Long.valueOf(j), null));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo9210a(Object obj, AbstractC89172b<? super Integer, ? extends C89391z> bVar) {
            return m145290a(obj, (AbstractC89172b<? super Integer, C89391z>) bVar);
        }

        /* renamed from: a */
        private RESULT m145290a(KEY key, AbstractC89172b<? super Integer, C89391z> bVar) {
            AbstractC84454k kVar;
            AbstractC84454k kVar2;
            C89219l.m154721d(bVar, "");
            C27667v e = C27667v.m55307e();
            try {
                this.f188800a.mo119500a(key, new C84464a(e, bVar));
                C84476g gVar = (C84476g) e.get();
                KEY key2 = gVar.f188828a;
                RESULT result = gVar.f188829b;
                boolean z = gVar.f188830c;
                INFO info = gVar.f188831d;
                Long l = gVar.f188832e;
                Exception exc = gVar.f188833f;
                if (result == null) {
                    AbstractC84454k kVar3 = this.f188801b;
                    if (kVar3 != null) {
                        kVar3.mo118902a(key2, l, exc, info);
                    }
                    throw new C84473e(exc);
                }
                if (!z && (kVar2 = this.f188801b) != null) {
                    kVar2.mo118903a(key2, l, info);
                }
                return result;
            } catch (InterruptedException e2) {
                throw e2;
            } catch (Exception e3) {
                if (!(e3 instanceof C84473e) && !(e3 instanceof InterruptedException) && (kVar = this.f188801b) != null) {
                    kVar.mo118902a(key, 0L, e3, null);
                }
                throw e3;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84449h
    /* renamed from: a */
    public final AbstractC88979t<C84445d<KEY, RESULT>> mo129430a(KEY key, boolean z) {
        boolean z2;
        RunnableC84474f<KEY, RESULT> fVar;
        C84445d<KEY, RESULT> dVar;
        synchronized (this.f188795b) {
            ConcurrentHashMap<String, RunnableC84474f<KEY, RESULT>> concurrentHashMap = this.f188795b;
            String a = mo119499a((Object) key);
            RunnableC84474f<KEY, RESULT> fVar2 = concurrentHashMap.get(a);
            if (fVar2 == null) {
                fVar2 = new RunnableC84474f<>(key, this.f188797e.getAndIncrement(), new C84463b(this, this.f188798f), z, (byte) 0);
                z2 = true;
                RunnableC84474f<KEY, RESULT> putIfAbsent = concurrentHashMap.putIfAbsent(a, fVar2);
                if (putIfAbsent != null) {
                    fVar2 = putIfAbsent;
                }
            } else {
                z2 = false;
            }
            C89219l.m154716b(fVar2, "");
            fVar = fVar2;
            dVar = null;
            if (!z2) {
                if (fVar.f188821a.mo143221i() == null) {
                }
            }
            if (z) {
                fVar.f188824d = z;
                dVar = new C84445d<>(EnumC84446e.PENDING, key, null, null);
            }
        }
        if (dVar != null) {
            fVar.f188821a.onNext(dVar);
        }
        if (z2) {
            fVar.f188821a.mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C84466d(this), C84909p.f189747a);
            fVar.f188825e = ((ExecutorService) this.f188799g.getValue()).submit(fVar);
        }
        return fVar.f188821a;
    }
}
