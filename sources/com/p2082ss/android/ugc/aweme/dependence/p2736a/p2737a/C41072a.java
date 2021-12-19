package com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27403ao;
import com.google.p1998c.p2001c.AbstractC27423as;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41089c;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.C41091e;
import com.p2082ss.android.ugc.tools.C84401c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a */
public final class C41072a<Param, Target> implements AbstractC41086b<Param, Target> {

    /* renamed from: h */
    public static final C41073a f96006h = new C41073a((byte) 0);

    /* renamed from: a */
    public int f96007a;

    /* renamed from: b */
    public boolean f96008b;

    /* renamed from: c */
    public boolean f96009c;

    /* renamed from: d */
    public AbstractC41090d f96010d;

    /* renamed from: e */
    public boolean f96011e;

    /* renamed from: f */
    final Queue<AbstractC41088b<Param, Target>> f96012f;

    /* renamed from: g */
    final List<Param> f96013g;

    /* renamed from: i */
    private final Queue<AbstractC41088b<Param, Target>> f96014i;

    /* renamed from: j */
    private final Queue<AbstractC41088b<Param, Target>> f96015j;

    /* renamed from: k */
    private final AbstractC89244h f96016k;

    /* renamed from: l */
    private final Handler f96017l;

    /* renamed from: m */
    private final AbstractC89244h f96018m;

    /* renamed from: n */
    private AtomicInteger f96019n;

    /* renamed from: o */
    private final int f96020o = 3;

    /* renamed from: p */
    private final AbstractC41089c<Param, Target> f96021p;

    static {
        Covode.recordClassIndex(48942);
    }

    /* renamed from: a */
    public final AbstractC27403ao<Param, AbstractC41085a<Param, Target>> mo70281a() {
        return (AbstractC27403ao) this.f96016k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$a */
    public static final class C41073a {
        static {
            Covode.recordClassIndex(48943);
        }

        private C41073a() {
        }

        public /* synthetic */ C41073a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$i */
    public static final class RunnableC41081i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C41072a f96036a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f96037b;

        static {
            Covode.recordClassIndex(48951);
        }

        RunnableC41081i(C41072a aVar, AbstractC89171a aVar2) {
            this.f96036a = aVar;
            this.f96037b = aVar2;
        }

        public final void run() {
            this.f96036a.mo70290b(this.f96037b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$j */
    public static final class C41082j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96038a;

        static {
            Covode.recordClassIndex(48952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41082j(C41072a aVar) {
            super(0);
            this.f96038a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f96038a.mo70293c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$e */
    static final class C41077e extends AbstractC89220m implements AbstractC89171a<Thread> {

        /* renamed from: a */
        public static final C41077e f96028a = new C41077e();

        static {
            Covode.recordClassIndex(48947);
        }

        C41077e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Thread invoke() {
            Looper mainLooper = Looper.getMainLooper();
            C89219l.m154716b(mainLooper, "");
            return mainLooper.getThread();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$f */
    static final class C41078f extends AbstractC89220m implements AbstractC89171a<AbstractC27403ao<Param, AbstractC41085a<Param, Target>>> {

        /* renamed from: a */
        public static final C41078f f96029a = new C41078f();

        static {
            Covode.recordClassIndex(48948);
        }

        C41078f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return AbstractC27423as.m54829a().mo45765b().mo45764b();
        }
    }

    /* renamed from: d */
    private final void m82727d() {
        mo70284a((AbstractC89171a<? extends Object>) new C41082j(this));
    }

    /* renamed from: b */
    public final void mo70288b() {
        mo70284a((AbstractC89171a<? extends Object>) new C41083k(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$b */
    static final class C41074b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96022a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41088b f96023b;

        static {
            Covode.recordClassIndex(48944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41074b(C41072a aVar, AbstractC41088b bVar) {
            super(0);
            this.f96022a = aVar;
            this.f96023b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f96022a.f96009c) {
                this.f96023b.f96046d.set(true);
                this.f96022a.mo70283a((AbstractC41088b) this.f96023b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$c */
    public static final class C41075c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96024a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41088b f96025b;

        static {
            Covode.recordClassIndex(48945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41075c(C41072a aVar, AbstractC41088b bVar) {
            super(0);
            this.f96024a = aVar;
            this.f96025b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f96024a.f96009c) {
                this.f96025b.f96046d.set(true);
                this.f96024a.mo70283a((AbstractC41088b) this.f96025b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$h */
    public static final class C41080h extends AbstractC89220m implements AbstractC89171a<Object> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96032a;

        /* renamed from: b */
        final /* synthetic */ Object f96033b;

        /* renamed from: c */
        final /* synthetic */ AbstractC41085a f96034c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f96035d;

        static {
            Covode.recordClassIndex(48950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41080h(C41072a aVar, Object obj, AbstractC41085a aVar2, AbstractC89171a aVar3) {
            super(0);
            this.f96032a = aVar;
            this.f96033b = obj;
            this.f96034c = aVar2;
            this.f96035d = aVar3;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Object invoke() {
            AbstractC41085a aVar;
            Object obj = this.f96033b;
            if (!(obj == null || (aVar = this.f96034c) == null)) {
                this.f96032a.mo70281a().put(obj, aVar);
            }
            AbstractC89171a aVar2 = this.f96035d;
            if (aVar2 == null) {
                return null;
            }
            aVar2.invoke();
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$l */
    public static final class C41084l extends AbstractC89220m implements AbstractC89171a<Object> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96040a;

        /* renamed from: b */
        final /* synthetic */ Object f96041b;

        /* renamed from: c */
        final /* synthetic */ AbstractC41085a f96042c;

        static {
            Covode.recordClassIndex(48954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41084l(C41072a aVar, Object obj, AbstractC41085a aVar2) {
            super(0);
            this.f96040a = aVar;
            this.f96041b = obj;
            this.f96042c = aVar2;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Object invoke() {
            return Boolean.valueOf(this.f96040a.mo70281a().remove(this.f96041b, this.f96042c));
        }
    }

    /* renamed from: e */
    private final boolean m82730e() {
        return C89219l.m154714a(this.f96018m.getValue(), Thread.currentThread());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$g */
    public static final class CallableC41079g<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96030a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41088b f96031b;

        static {
            Covode.recordClassIndex(48949);
        }

        CallableC41079g(C41072a aVar, AbstractC41088b bVar) {
            this.f96030a = aVar;
            this.f96031b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            try {
                this.f96031b.mo70303a(this.f96030a);
            } catch (Exception e) {
                AbstractC41090d dVar = this.f96030a.f96010d;
                if (dVar != null) {
                    dVar.mo70309a(e);
                }
                C84401c.f188722f.mo123659a(e);
                this.f96030a.mo70294c((AbstractC41088b) this.f96031b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$k */
    public static final class C41083k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96039a;

        static {
            Covode.recordClassIndex(48953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41083k(C41072a aVar) {
            super(0);
            this.f96039a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f96039a.f96011e = true;
            C41072a aVar = this.f96039a;
            aVar.f96012f.clear();
            List<Param> list = aVar.f96013g;
            C89219l.m154716b(list, "");
            for (Param param : list) {
                AbstractC41088b<Param, Target> a = aVar.mo70282a((Object) param);
                a.f96045c = false;
                aVar.f96012f.offer(a);
            }
            aVar.f96013g.clear();
            this.f96039a.mo70293c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo70293c() {
        AbstractC41088b<Param, Target> poll;
        while (this.f96011e && this.f96019n.get() > 0) {
            if (!this.f96014i.isEmpty()) {
                poll = this.f96014i.poll();
            } else if (!this.f96012f.isEmpty()) {
                poll = this.f96012f.poll();
            } else {
                return;
            }
            if (poll != null) {
                this.f96015j.offer(poll);
                C1731i.m5635a((Callable) new CallableC41079g(this, poll));
                this.f96019n.decrementAndGet();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$d */
    public static final class C41076d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41072a f96026a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41088b f96027b;

        static {
            Covode.recordClassIndex(48946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41076d(C41072a aVar, AbstractC41088b bVar) {
            super(0);
            this.f96026a = aVar;
            this.f96027b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f96027b.f96043a.get();
            if (i == 2) {
                List<AbstractC41085a<Param, Target>> list = this.f96026a.mo70281a().get(this.f96027b.f96050h);
                if (list != null) {
                    for (T t : list) {
                        if (t != null) {
                            t.mo70298a(this.f96027b.f96050h);
                        }
                    }
                }
                C41072a.m82726a("task " + this.f96027b.f96049g + " state: running, info: " + ((Object) this.f96027b.f96050h));
            } else if (i == 3) {
                List<AbstractC41085a<Param, Target>> list2 = this.f96026a.mo70281a().get(this.f96027b.f96050h);
                if (list2 != null) {
                    for (T t2 : list2) {
                        if (t2 != null) {
                            t2.mo70300b(this.f96027b.f96050h);
                        }
                    }
                }
                C41072a.m82726a("task " + this.f96027b.f96049g + " state: success, info: " + ((Object) this.f96027b.f96050h));
            } else if (i != 4) {
                C41072a.m82726a("task " + this.f96027b.f96049g + " state: unknown, info: " + ((Object) this.f96027b.f96050h));
            } else {
                List<AbstractC41085a<Param, Target>> list3 = this.f96026a.mo70281a().get(this.f96027b.f96050h);
                if (list3 != null) {
                    for (T t3 : list3) {
                        if (t3 != null) {
                            Param param = this.f96027b.f96050h;
                            C41091e eVar = this.f96027b.f96048f;
                            Exception exc = null;
                            Integer num = eVar != null ? eVar.f96052a : null;
                            C41091e eVar2 = this.f96027b.f96048f;
                            if (eVar2 != null) {
                                exc = eVar2.f96054c;
                            }
                            t3.mo70299a(param, num, exc);
                        }
                    }
                }
                C41072a.m82726a("task " + this.f96027b.f96049g + " state: failed, info: " + ((Object) this.f96027b.f96050h));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    private final void m82728d(AbstractC41088b<Param, Target> bVar) {
        this.f96015j.remove(bVar);
    }

    /* renamed from: a */
    public static void m82726a(String str) {
        C84401c.f188722f.mo123658a(str);
    }

    /* renamed from: e */
    private final void m82729e(AbstractC41088b<Param, Target> bVar) {
        mo70284a((AbstractC89171a<? extends Object>) new C41076d(this, bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b
    /* renamed from: b */
    public final void mo70289b(AbstractC41088b<Param, Target> bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo70302a(3);
        m82728d(bVar);
        m82729e(bVar);
        this.f96019n.incrementAndGet();
        m82727d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC41088b<Param, Target> mo70282a(Param param) {
        return this.f96021p.mo70307a(param);
    }

    /* renamed from: b */
    public final void mo70290b(AbstractC89171a<? extends Object> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e) {
            AbstractC41090d dVar = this.f96010d;
            if (dVar != null) {
                dVar.mo70309a(e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b
    /* renamed from: c */
    public final void mo70294c(AbstractC41088b<Param, Target> bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo70302a(4);
        m82728d(bVar);
        if (bVar.f96044b < this.f96007a) {
            bVar.f96044b++;
            this.f96012f.offer(bVar);
        }
        m82729e(bVar);
        this.f96019n.incrementAndGet();
        m82727d();
    }

    public C41072a(AbstractC41089c<Param, Target> cVar) {
        C89219l.m154721d(cVar, "");
        this.f96021p = cVar;
        this.f96008b = true;
        this.f96012f = new ConcurrentLinkedQueue();
        this.f96014i = new ConcurrentLinkedQueue();
        this.f96015j = new ConcurrentLinkedQueue();
        this.f96016k = C89250i.m154773a((AbstractC89171a) C41078f.f96029a);
        this.f96017l = new Handler(Looper.getMainLooper());
        this.f96018m = C89250i.m154773a((AbstractC89171a) C41077e.f96028a);
        this.f96019n = new AtomicInteger(3);
        this.f96013g = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b
    /* renamed from: a */
    public final void mo70283a(AbstractC41088b<Param, Target> bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        if (bVar == null || !(3 == (i = bVar.f96043a.get()) || 4 == i)) {
            bVar.mo70302a(2);
        }
        m82729e(bVar);
    }

    /* renamed from: a */
    public final void mo70284a(AbstractC89171a<? extends Object> aVar) {
        if (m82730e()) {
            mo70290b(aVar);
        } else {
            this.f96017l.post(new RunnableC41081i(this, aVar));
        }
    }

    /* renamed from: b */
    public final boolean mo70292b(Param param) {
        if (param == null) {
            return false;
        }
        Iterator<T> it = this.f96015j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Param param2 = next.f96050h;
            if (param2 != null && param2.equals(param)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo70295c(Param param) {
        if (param == null) {
            return false;
        }
        Iterator<T> it = this.f96014i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Param param2 = next.f96050h;
            if (param2 != null && param2.equals(param)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70287a(List<? extends Param> list) {
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    this.f96013g.add(t);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo70291b(Param param, AbstractC41085a<Param, Target> aVar) {
        if (param != null) {
            T t = null;
            if (!mo70295c((Object) param) && !mo70292b((Object) param)) {
                Iterator<T> it = this.f96012f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    Param param2 = next.f96050h;
                    if (param2 != null && param2.equals(param)) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    this.f96012f.remove(t2);
                } else {
                    t2 = mo70282a((Object) param);
                    if (t2 == null) {
                        return;
                    }
                }
                t2.f96045c = true;
                this.f96014i.offer(t2);
                this.f96011e = true;
                mo70286a(param, aVar, new C41075c(this, t2));
                mo70293c();
            } else if (this.f96008b) {
                m82726a("add priority task, download is already started, no reentrance, info: ".concat(String.valueOf(param)));
            } else {
                mo70286a(param, aVar, null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r6.f96008b == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        m82726a("add normal task, download is already started, no reentrance, info: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        mo70286a(r7, r8, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r1 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r1 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1 != null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70285a(Param r7, com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a<Param, Target> r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.C41072a.mo70285a(java.lang.Object, com.ss.android.ugc.aweme.dependence.a.a.a.a):void");
    }

    /* renamed from: a */
    public final void mo70286a(Param param, AbstractC41085a<Param, Target> aVar, AbstractC89171a<? extends Object> aVar2) {
        mo70284a((AbstractC89171a<? extends Object>) new C41080h(this, param, aVar, aVar2));
    }
}
