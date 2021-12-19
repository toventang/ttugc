package com.p2082ss.android.ugc.aweme.filter.repository.internal.p2988a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50749j;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50719b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.EnumC50720c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50690b;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84459p;
import com.p2082ss.android.ugc.tools.utils.C84894f;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.a */
public final class C50711a implements AbstractC50750k {

    /* renamed from: a */
    public final AbstractC88969g<C50719b> f117059a;

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, RunnableC50717c> f117060b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public AbstractC50749j f117061c;

    /* renamed from: d */
    public final AbstractC50751l f117062d;

    /* renamed from: e */
    public final AbstractC50722e f117063e;

    /* renamed from: f */
    public final AbstractC27255q<AbstractC84455l> f117064f;

    /* renamed from: g */
    public final int f117065g;

    /* renamed from: h */
    private final AtomicInteger f117066h = new AtomicInteger(0);

    /* renamed from: i */
    private final AbstractC89244h f117067i = C89250i.m154773a((AbstractC89171a) new C50714b(this));

    static {
        Covode.recordClassIndex(59873);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k
    /* renamed from: a */
    public final AbstractC88979t<C50719b> mo86081a() {
        AbstractC88979t<C50719b> c = this.f117059a.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.a$b */
    static final class C50714b extends AbstractC89220m implements AbstractC89171a<C84894f> {

        /* renamed from: a */
        final /* synthetic */ C50711a f117071a;

        static {
            Covode.recordClassIndex(59876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50714b(C50711a aVar) {
            super(0);
            this.f117071a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84894f invoke() {
            C84894f fVar = new C84894f(0, this.f117071a.f117065g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue());
            fVar.allowCoreThreadTimeOut(true);
            return fVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k
    /* renamed from: b */
    public final void mo86084b() {
        List<RunnableC50717c> j;
        MethodCollector.m26663i(949);
        synchronized (this.f117060b) {
            try {
                Collection<RunnableC50717c> values = this.f117060b.values();
                C89219l.m154716b(values, "");
                j = C89070n.m154590j(values);
                this.f117060b.clear();
            } finally {
                MethodCollector.m26664o(949);
            }
        }
        for (RunnableC50717c cVar : j) {
            cVar.f117077c.onNext(new C50719b(EnumC50720c.FAILED, cVar.f117075a, null, null));
            cVar.f117077c.onComplete();
            Future<?> future = cVar.f117079e;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k
    /* renamed from: b */
    public final AbstractC88979t<C50719b> mo86083b(C50698f fVar) {
        C89219l.m154721d(fVar, "");
        return m95025a(fVar, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k
    /* renamed from: a */
    public final AbstractC88979t<C50719b> mo86082a(C50698f fVar) {
        C89219l.m154721d(fVar, "");
        return m95025a(fVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.a$c */
    public static final class C50715c<T> implements AbstractC88433f<C50719b> {

        /* renamed from: a */
        final /* synthetic */ C50711a f117072a;

        static {
            Covode.recordClassIndex(59877);
        }

        C50715c(C50711a aVar) {
            this.f117072a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50719b bVar) {
            MethodCollector.m26663i(711);
            C50719b bVar2 = bVar;
            if (bVar2.f117083a == EnumC50720c.SUCCESS || bVar2.f117083a == EnumC50720c.FAILED) {
                synchronized (this.f117072a.f117060b) {
                    try {
                        this.f117072a.f117060b.remove(Integer.valueOf(bVar2.f117084b.f117047a));
                    } catch (Throwable th) {
                        MethodCollector.m26664o(711);
                        throw th;
                    }
                }
            }
            this.f117072a.f117059a.onNext(bVar2);
            MethodCollector.m26664o(711);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k
    /* renamed from: c */
    public final EnumC50720c mo86085c(C50698f fVar) {
        C88958b<C50719b> bVar;
        C50719b i;
        C89219l.m154721d(fVar, "");
        RunnableC50717c cVar = this.f117060b.get(Integer.valueOf(fVar.f117047a));
        if (cVar == null || (bVar = cVar.f117077c) == null || (i = bVar.mo143221i()) == null) {
            return null;
        }
        return i.f117083a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.a$a */
    public static final class C50712a<T, R> implements AbstractC88434g<C50698f, C50721d> {

        /* renamed from: a */
        final /* synthetic */ C50711a f117068a;

        static {
            Covode.recordClassIndex(59874);
        }

        C50712a(C50711a aVar) {
            this.f117068a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C50721d apply(final C50698f fVar) {
            List<String> list;
            String str;
            Object obj;
            Exception exc;
            long j;
            Exception exc2;
            Long l;
            String str2;
            String str3 = "";
            C89219l.m154721d(fVar, str3);
            if (this.f117068a.f117063e.mo86096a(fVar)) {
                return this.f117068a.f117063e.mo86013a(fVar.f117047a);
            }
            if (this.f117068a.f117062d.mo86011a(fVar)) {
                return this.f117068a.f117062d.mo86109d(fVar.f117047a);
            }
            ToolsUrlModel toolsUrlModel = fVar.f117051e;
            if (toolsUrlModel == null || (list = toolsUrlModel.f174538b) == null || (str = (String) C89070n.m154561b((List) list, 0)) == null) {
                throw new RuntimeException("Filter url list is empty while downloading. id : " + fVar.f117047a + ", name : " + fVar.f117049c + '.');
            }
            String b = this.f117068a.f117062d.mo86053b(fVar.f117047a);
            String a = this.f117068a.f117062d.mo86052a(fVar.f117047a);
            AbstractC84455l b2 = this.f117068a.f117064f.mo5560b();
            try {
                C84902i.m145899c(this.f117068a.f117062d.mo86054c(fVar.f117047a));
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            C89379q.m157073isFailureimpl(obj);
            C84902i.m145883a(b, false);
            final C88960c cVar = new C88960c();
            C89219l.m154716b(cVar, str3);
            b2.mo121393a(str, C50690b.m94983a(b) + a, new AbstractC84459p() {
                /* class com.p2082ss.android.ugc.aweme.filter.repository.internal.p2988a.C50711a.C50712a.C507131 */

                static {
                    Covode.recordClassIndex(59875);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.c */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84459p
                /* renamed from: a */
                public final void mo86086a(String str, long j) {
                    C89219l.m154721d(str, "");
                    cVar.onNext(Long.valueOf(j));
                    cVar.onComplete();
                }

                @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84459p
                /* renamed from: a */
                public final void mo86087a(String str, long j, Exception exc, Integer num) {
                    C89219l.m154721d(str, "");
                    cVar.onError(new C50716b("Filter downloading failed, id : " + fVar.f117047a + ", name : " + fVar.f117049c + '.', exc, num, Long.valueOf(j)));
                }
            });
            try {
                Long l2 = (Long) cVar.mo143273a();
                AbstractC50749j jVar = this.f117068a.f117061c;
                if (jVar != null) {
                    C89219l.m154716b(l2, str3);
                    long longValue = l2.longValue();
                    C89219l.m154716b(b2, str3);
                    jVar.mo86026a(fVar, str, longValue, b2);
                }
                if (this.f117068a.f117062d.mo86110e(fVar.f117047a)) {
                    C89219l.m154721d(fVar, str3);
                    Keva keva = C50718d.f117081a;
                    String valueOf = String.valueOf(fVar.f117047a);
                    ToolsUrlModel toolsUrlModel2 = fVar.f117051e;
                    if (!(toolsUrlModel2 == null || (str2 = toolsUrlModel2.f174537a) == null)) {
                        str3 = str2;
                    }
                    keva.storeString(valueOf, str3);
                    return this.f117068a.f117062d.mo86109d(fVar.f117047a);
                }
                throw new RuntimeException("Filter unzip failed and causing exception is missing. id : " + fVar.f117047a + ", name : " + fVar.f117049c + '.');
            } catch (Exception e) {
                AbstractC50749j jVar2 = this.f117068a.f117061c;
                if (jVar2 != null) {
                    boolean z = e instanceof C50716b;
                    Integer num = null;
                    if (!z) {
                        exc = null;
                    } else {
                        exc = e;
                    }
                    C50716b bVar = (C50716b) exc;
                    if (bVar == null || (l = bVar.f117074b) == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    C89219l.m154716b(b2, str3);
                    if (!z) {
                        exc2 = null;
                    } else {
                        exc2 = e;
                    }
                    C50716b bVar2 = (C50716b) exc2;
                    if (bVar2 != null) {
                        num = bVar2.f117073a;
                    }
                    jVar2.mo86027a(fVar, str, j, b2, e, num);
                }
                throw e;
            }
        }
    }

    /* renamed from: a */
    private final AbstractC88979t<C50719b> m95025a(C50698f fVar, boolean z) {
        boolean z2;
        RunnableC50717c cVar;
        C50719b bVar;
        MethodCollector.m26663i(968);
        synchronized (this.f117060b) {
            try {
                ConcurrentHashMap<Integer, RunnableC50717c> concurrentHashMap = this.f117060b;
                Integer valueOf = Integer.valueOf(fVar.f117047a);
                RunnableC50717c cVar2 = concurrentHashMap.get(valueOf);
                if (cVar2 == null) {
                    C50712a aVar = new C50712a(this);
                    C88958b bVar2 = new C88958b();
                    C89219l.m154716b(bVar2, "");
                    cVar2 = new RunnableC50717c(fVar, this.f117066h.getAndIncrement(), aVar, bVar2, z, (byte) 0);
                    z2 = true;
                    RunnableC50717c putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, cVar2);
                    if (putIfAbsent != null) {
                        cVar2 = putIfAbsent;
                    }
                } else {
                    z2 = false;
                }
                C89219l.m154716b(cVar2, "");
                cVar = cVar2;
                bVar = null;
                if (!z2) {
                    if (cVar.f117077c.mo143221i() == null) {
                    }
                }
                if (z) {
                    cVar.f117078d = z;
                    bVar = new C50719b(EnumC50720c.PENDING, fVar, null, null);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(968);
                throw th;
            }
        }
        if (bVar != null) {
            cVar.f117077c.onNext(bVar);
        }
        if (z2) {
            cVar.f117077c.mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C50715c(this), C84909p.f189747a);
            cVar.f117079e = ((ExecutorService) this.f117067i.getValue()).submit(cVar);
        }
        C88958b<C50719b> bVar3 = cVar.f117077c;
        MethodCollector.m26664o(968);
        return bVar3;
    }

    public C50711a(AbstractC50751l lVar, AbstractC50722e eVar, AbstractC27255q<AbstractC84455l> qVar, int i) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(qVar, "");
        this.f117062d = lVar;
        this.f117063e = eVar;
        this.f117064f = qVar;
        this.f117065g = i;
        AbstractC88969g<C50719b> j = new C88960c().mo143230j();
        C89219l.m154716b(j, "");
        this.f117059a = j;
    }
}
