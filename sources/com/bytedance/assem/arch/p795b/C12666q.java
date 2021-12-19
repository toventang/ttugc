package com.bytedance.assem.arch.p795b;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.b.q */
public final class C12666q implements AbstractC12659j, AbstractC22873a<AbstractC22876d, Object>, AbstractC22876d {

    /* renamed from: a */
    public AbstractC12693u<? extends AbstractC22876d> f30820a;

    /* renamed from: b */
    public AbstractC89277c<? extends AbstractC12693u<? extends AbstractC22876d>> f30821b;

    /* renamed from: c */
    boolean f30822c = true;

    /* renamed from: d */
    public int f30823d = -1;

    /* renamed from: e */
    public final C1205n f30824e = new C1205n(this);

    /* renamed from: f */
    public boolean f30825f;

    /* renamed from: g */
    public Object f30826g;

    /* renamed from: h */
    AbstractC12663n f30827h = C12734y.f30958a;

    /* renamed from: i */
    EnumC12662m f30828i = EnumC12662m.Silent;

    /* renamed from: j */
    private C1175ad f30829j;

    /* renamed from: k */
    private final C1182af f30830k = new C1182af();

    /* renamed from: l */
    private final AbstractC89244h f30831l = C89250i.m154773a((AbstractC89171a) C12679i.f30857a);

    /* renamed from: m */
    private final CopyOnWriteArrayList<C12666q> f30832m = new CopyOnWriteArrayList<>();

    /* renamed from: n */
    private Object f30833n;

    /* renamed from: o */
    private AbstractC89171a<Integer> f30834o;

    /* renamed from: p */
    private final Queue<AbstractC89171a<C89391z>> f30835p = new LinkedList();

    /* renamed from: q */
    private volatile boolean f30836q;

    /* renamed from: r */
    private final C88958b<C12651b> f30837r;

    /* renamed from: s */
    private final ConcurrentHashMap<AbstractC89277c<?>, Object> f30838s;

    /* renamed from: t */
    private final ConcurrentHashMap<AbstractC89277c<?>, AssemViewModel<?>> f30839t;

    static {
        Covode.recordClassIndex(14486);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Handler mo20488i() {
        return (Handler) this.f30831l.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final Object mo20471a() {
        return this.f30826g;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: b */
    public final C88958b<C12651b> mo20475b() {
        return this.f30837r;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: c */
    public final AbstractC89171a<Integer> mo20476c() {
        return this.f30834o;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: d */
    public final Object mo20477d() {
        return this.f30833n;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: e */
    public final C1175ad mo20478e() {
        return this.f30829j;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this.f30820a;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final /* bridge */ /* synthetic */ AbstractC1196i getLifecycle() {
        return this.f30824e;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        return this.f30830k;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22879g
    /* renamed from: h */
    public final boolean mo20487h() {
        return this.f30822c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.q$j */
    public static final class RunnableC12680j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12666q f30858a;

        static {
            Covode.recordClassIndex(14500);
        }

        RunnableC12680j(C12666q qVar) {
            this.f30858a = qVar;
        }

        public final void run() {
            this.f30858a.mo20479f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.q$k */
    public static final class RunnableC12681k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f30859a;

        static {
            Covode.recordClassIndex(14501);
        }

        RunnableC12681k(AbstractC89171a aVar) {
            this.f30859a = aVar;
        }

        public final void run() {
            this.f30859a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.q$b */
    public static final class C12670b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12666q f30844a;

        static {
            Covode.recordClassIndex(14490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12670b(C12666q qVar) {
            super(0);
            this.f30844a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30844a.f30824e.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.q$d */
    public static final class C12672d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12666q f30846a;

        static {
            Covode.recordClassIndex(14492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12672d(C12666q qVar) {
            super(0);
            this.f30846a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30846a.f30824e.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.q$e */
    static final class C12673e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12658i f30847a;

        /* renamed from: b */
        final /* synthetic */ C12666q f30848b;

        /* renamed from: c */
        final /* synthetic */ AbstractC12693u f30849c;

        static {
            Covode.recordClassIndex(14493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12673e(AbstractC12658i iVar, C12666q qVar, AbstractC12693u uVar) {
            super(0);
            this.f30847a = iVar;
            this.f30848b = qVar;
            this.f30849c = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C12690t.m22849a(this.f30849c, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.assem.arch.p795b.C12666q.C12673e.C126741 */

                /* renamed from: a */
                final /* synthetic */ C12673e f30850a;

                static {
                    Covode.recordClassIndex(14494);
                }

                {
                    this.f30850a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f30850a.f30847a.mo20467a(this.f30850a.f30848b.f30826g);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.q$f */
    static final class RunnableC12675f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC12658i f30851a;

        /* renamed from: b */
        final /* synthetic */ C12666q f30852b;

        /* renamed from: c */
        final /* synthetic */ AbstractC12693u f30853c;

        static {
            Covode.recordClassIndex(14495);
        }

        RunnableC12675f(AbstractC12658i iVar, C12666q qVar, AbstractC12693u uVar) {
            this.f30851a = iVar;
            this.f30852b = qVar;
            this.f30853c = uVar;
        }

        public final void run() {
            C12690t.m22849a(this.f30853c, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.assem.arch.p795b.C12666q.RunnableC12675f.C126761 */

                /* renamed from: a */
                final /* synthetic */ RunnableC12675f f30854a;

                static {
                    Covode.recordClassIndex(14496);
                }

                {
                    this.f30854a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f30854a.f30851a.mo20467a(this.f30854a.f30852b.f30826g);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.q$g */
    static final class C12677g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12666q f30855a;

        static {
            Covode.recordClassIndex(14497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12677g(C12666q qVar) {
            super(0);
            this.f30855a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30855a.f30824e.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.q$h */
    static final class C12678h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12666q f30856a;

        static {
            Covode.recordClassIndex(14498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12678h(C12666q qVar) {
            super(0);
            this.f30856a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30856a.f30824e.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.b.q$i */
    static final class C12679i extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C12679i f30857a = new C12679i();

        static {
            Covode.recordClassIndex(14499);
        }

        C12679i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.q$a */
    public static final class C12668a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12666q f30841a;

        /* renamed from: b */
        final /* synthetic */ AbstractC12693u f30842b;

        static {
            Covode.recordClassIndex(14488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12668a(C12666q qVar, AbstractC12693u uVar) {
            super(0);
            this.f30841a = qVar;
            this.f30842b = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!this.f30842b.f30898k) {
                this.f30841a.mo20484a(new AbstractC89171a<C89391z>(this) {
                    /* class com.bytedance.assem.arch.p795b.C12666q.C12668a.C126691 */

                    /* renamed from: a */
                    final /* synthetic */ C12668a f30843a;

                    static {
                        Covode.recordClassIndex(14489);
                    }

                    {
                        this.f30843a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f30843a.f30842b.mo20506A();
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.q$c */
    public static final class RunnableC12671c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12666q f30845a;

        static {
            Covode.recordClassIndex(14491);
        }

        RunnableC12671c(C12666q qVar) {
            this.f30845a = qVar;
        }

        public final void run() {
            AbstractC12693u<? extends AbstractC22876d> uVar = this.f30845a.f30820a;
            if (uVar != null) {
                if (uVar.mo20599s() || !C12787j.f31109c) {
                    uVar.mo20533y();
                }
                uVar.f30900m = true;
            }
            this.f30845a.f30825f = true;
        }
    }

    /* renamed from: j */
    public final void mo20489j() {
        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30820a;
        if (!(uVar instanceof AbstractC12658i)) {
            uVar = null;
        }
        AbstractC12658i iVar = (AbstractC12658i) uVar;
        if (iVar != null) {
            iVar.mo20466a();
        }
        this.f30820a = null;
        Iterator<T> it = this.f30832m.iterator();
        while (it.hasNext()) {
            it.next().mo20489j();
        }
    }

    public C12666q() {
        C88958b<C12651b> a = C88958b.m154214a(new C12651b(EnumC12650a.Default, null));
        C89219l.m154709a((Object) a, "");
        this.f30837r = a;
        a.mo143283c().mo143289d(new AbstractC88433f<C12651b>(this) {
            /* class com.bytedance.assem.arch.p795b.C12666q.C126671 */

            /* renamed from: a */
            final /* synthetic */ C12666q f30840a;

            static {
                Covode.recordClassIndex(14487);
            }

            {
                this.f30840a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C12651b bVar) {
                boolean z;
                AbstractC1196i.EnumC1199b bVar2;
                boolean z2;
                EnumC12662m mVar;
                boolean z3;
                AbstractC12693u<? extends AbstractC22876d> uVar;
                AbstractC12789k kVar;
                AbstractC12693u<? extends AbstractC22876d> uVar2;
                AbstractC12693u<? extends AbstractC22876d> uVar3;
                C1205n nVar;
                AbstractC12789k kVar2;
                Boolean bool;
                Boolean bool2;
                AbstractC1196i.EnumC1199b bVar3;
                C1205n nVar2;
                C12651b bVar4 = bVar;
                C12666q qVar = this.f30840a;
                C89219l.m154709a((Object) bVar4, "");
                AbstractC12658i iVar = null;
                if (C89219l.m154714a(qVar.f30821b, C12787j.f31111e) && (kVar2 = C12787j.f31108b) != null) {
                    StringBuilder append = new StringBuilder("fireData, state: ").append(qVar.f30827h).append(", fireReason: ").append(bVar4).append(", hostInternal: ").append(qVar.f30820a).append(", isViewCreated: ");
                    AbstractC12693u<? extends AbstractC22876d> uVar4 = qVar.f30820a;
                    if (uVar4 != null) {
                        bool = Boolean.valueOf(uVar4.f30897j);
                    } else {
                        bool = null;
                    }
                    StringBuilder append2 = append.append(bool).append(", isFirstReused: ");
                    AbstractC12693u<? extends AbstractC22876d> uVar5 = qVar.f30820a;
                    if (uVar5 != null) {
                        bool2 = Boolean.valueOf(uVar5.f30899l);
                    } else {
                        bool2 = null;
                    }
                    StringBuilder append3 = append2.append(bool2).append(",  lifecycle: ");
                    AbstractC12693u<? extends AbstractC22876d> uVar6 = qVar.f30820a;
                    if (uVar6 == null || (nVar2 = uVar6.f31000d) == null) {
                        bVar3 = null;
                    } else {
                        bVar3 = nVar2.mo4011a();
                    }
                    kVar2.mo20640a("AssemList", append3.append(bVar3).toString());
                }
                EnumC12650a aVar = bVar4.f30811a;
                if (aVar == EnumC12650a.HostBind || aVar == EnumC12650a.HostDetach) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!C89219l.m154714a(bVar4.f30812b, qVar.f30820a)) || z) {
                    AbstractC12693u<? extends AbstractC22876d> uVar7 = qVar.f30820a;
                    if (uVar7 == null || (nVar = uVar7.f31000d) == null) {
                        bVar2 = null;
                    } else {
                        bVar2 = nVar.mo4011a();
                    }
                    if (bVar2 == AbstractC1196i.EnumC1199b.RESUMED && (uVar3 = qVar.f30820a) != null && uVar3.f30897j) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (aVar == EnumC12650a.HostBind) {
                        if (z2) {
                            aVar = EnumC12650a.HostResume;
                        } else {
                            aVar = EnumC12650a.HostStop;
                        }
                    }
                    qVar.f30827h = qVar.f30827h.mo20462a(aVar);
                    EnumC12662m mVar2 = qVar.f30828i;
                    if (!C89219l.m154714a(qVar.f30827h, C12664o.f30818a) || (uVar2 = qVar.f30820a) == null || !uVar2.f30898k) {
                        mVar = EnumC12662m.Silent;
                    } else {
                        mVar = EnumC12662m.Active;
                    }
                    if (mVar2 != mVar || mVar == EnumC12662m.Active) {
                        qVar.f30828i = mVar;
                        if (qVar.f30828i == EnumC12662m.Active) {
                            if (C89219l.m154714a(qVar.f30821b, C12787j.f31111e) && (kVar = C12787j.f31108b) != null) {
                                kVar.mo20640a("AssemList", "fireData onResume, proxy: ".concat(String.valueOf(qVar)));
                            }
                            if (bVar4.f30811a != EnumC12650a.HostResume || ((uVar = qVar.f30820a) != null && uVar.f30899l)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            qVar.f30822c = z3;
                            AbstractC12693u<? extends AbstractC22876d> uVar8 = qVar.f30820a;
                            if (uVar8 != null) {
                                uVar8.f30899l = false;
                            }
                            AbstractC12693u<? extends AbstractC22876d> uVar9 = qVar.f30820a;
                            if (uVar9 != null) {
                                if (uVar9 instanceof AbstractC12658i) {
                                    iVar = uVar9;
                                }
                                AbstractC12658i iVar2 = iVar;
                                if (iVar2 != null && (!z3) && !(iVar2 instanceof AbstractC12657h)) {
                                    if (C12787j.f31109c) {
                                        qVar.mo20484a(new C12673e(iVar2, qVar, uVar9));
                                    } else {
                                        qVar.mo20488i().post(new RunnableC12675f(iVar2, qVar, uVar9));
                                    }
                                }
                                qVar.mo20484a(new C12677g(qVar));
                            }
                        } else if (qVar.f30828i == EnumC12662m.Silent && mVar2 == EnumC12662m.Active) {
                            qVar.mo20484a(new C12678h(qVar));
                        }
                    }
                }
            }
        });
        this.f30838s = new ConcurrentHashMap<>();
        this.f30839t = new ConcurrentHashMap<>();
    }

    /* renamed from: l */
    private final void m22803l() {
        if (this.f30824e.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
            if (!C12787j.f31109c || this.f30824e.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.DESTROYED) > 0) {
                mo20484a(new C12670b(this));
                if (!this.f30825f) {
                    if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                        C12787j.m23009a().execute(new RunnableC12671c(this));
                    } else {
                        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30820a;
                        if (uVar != null) {
                            if (uVar.mo20599s() || !C12787j.f31109c) {
                                uVar.mo20533y();
                            }
                            uVar.f30900m = true;
                        }
                        this.f30825f = true;
                    }
                }
                if (!this.f30832m.isEmpty()) {
                    Iterator<T> it = this.f30832m.iterator();
                    while (it.hasNext()) {
                        it.next().m22803l();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: f */
    public final void mo20479f() {
        AbstractC12789k kVar;
        this.f30836q = true;
        if (C89219l.m154714a(this.f30821b, C12787j.f31111e) && (kVar = C12787j.f31108b) != null) {
            kVar.mo20640a("AssemList", "onHostAttached, proxy: ".concat(String.valueOf(this)));
        }
        this.f30837r.onNext(new C12651b(EnumC12650a.HostAttach, this.f30820a));
        for (T t : this.f30832m) {
            if (C12787j.f31110d) {
                mo20488i().post(new RunnableC12680j(t));
            } else {
                t.mo20479f();
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: g */
    public final void mo20480g() {
        AbstractC12789k kVar;
        this.f30836q = false;
        if (C89219l.m154714a(this.f30821b, C12787j.f31111e) && (kVar = C12787j.f31108b) != null) {
            kVar.mo20640a("AssemList", "onHostDetached, proxy: ".concat(String.valueOf(this)));
        }
        this.f30837r.onNext(new C12651b(EnumC12650a.HostDetach, null));
        Iterator<T> it = this.f30832m.iterator();
        while (it.hasNext()) {
            it.next().mo20480g();
        }
    }

    /* renamed from: k */
    public final void mo20490k() {
        if (!this.f30832m.isEmpty()) {
            Iterator<T> it = this.f30832m.iterator();
            while (it.hasNext()) {
                it.next().mo20490k();
            }
        }
        mo20484a(new C12672d(this));
        this.f30835p.clear();
        this.f30838s.clear();
        this.f30839t.clear();
        this.f30830k.mo3997a();
        mo20488i().removeCallbacksAndMessages(null);
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("Position=");
        AbstractC89171a<Integer> aVar = this.f30834o;
        String str = null;
        if (aVar != null) {
            num = aVar.invoke();
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(", Proxy@").append(Integer.toHexString(hashCode())).append('(').append("host@");
        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30820a;
        if (uVar != null) {
            str = Integer.toHexString(uVar.hashCode());
        }
        return append.append(str).append(",state:").append(this.f30824e.mo4011a()).append(')').toString();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final void mo20472a(C1175ad adVar) {
        this.f30829j = adVar;
    }

    /* renamed from: a */
    private void m22802a(List<? extends Object> list) {
        AbstractC12693u<? extends AbstractC22876d> uVar;
        AbstractC12789k kVar;
        AbstractC12693u<? extends AbstractC22876d> uVar2 = this.f30820a;
        if (uVar2 != null) {
            if (!(uVar2 instanceof AbstractC12658i)) {
                uVar = null;
            } else {
                uVar = uVar2;
            }
            AbstractC12658i iVar = (AbstractC12658i) uVar;
            m22803l();
            uVar2.mo20534z();
            if (iVar != null) {
                iVar.mo20469b(this.f30826g);
            }
            if (list != null && !list.isEmpty()) {
                list = new ArrayList<>();
                list.addAll(list);
            }
            for (Map.Entry<AbstractC89277c<?>, Object> entry : this.f30838s.entrySet()) {
                AssemViewModel<?> assemViewModel = this.f30839t.get(entry.getKey());
                if (assemViewModel != null) {
                    assemViewModel.mo20664a((AssemViewModel) this.f30826g, (Object) list, (List) entry.getValue(), (Object) ((AbstractC89183m<Object, ? super List<? extends Object>, C89391z>) null));
                }
            }
            if (iVar != null) {
                uVar2.f30898k = iVar.mo20470c(this.f30826g);
                if (!uVar2.f30898k) {
                    uVar2.mo20513a(new C12668a(this, uVar2));
                }
            }
            this.f30837r.onNext(new C12651b(EnumC12650a.HostBind, uVar2));
            if (C89219l.m154714a(this.f30821b, C12787j.f31111e) && (kVar = C12787j.f31108b) != null) {
                kVar.mo20640a("AssemList", "onHostBind, proxy: ".concat(String.valueOf(this)));
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final void mo20473a(AbstractC12693u<? extends AbstractC22876d> uVar) {
        T t;
        C89219l.m154719c(uVar, "");
        Iterator<T> it = this.f30832m.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a(t.f30821b, C89204ab.m154669a(uVar.getClass()))) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            t2 = new C12666q();
            this.f30832m.add(t2);
        }
        t2.mo20483a(uVar, this.f30826g, null, (AbstractC89172b) C89206ad.m154679b(this.f30833n, 1), this.f30834o);
        if (C12787j.f31109c && this.f30836q) {
            t2.mo20479f();
        }
    }

    /* renamed from: a */
    public final void mo20484a(AbstractC89171a<C89391z> aVar) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154709a((Object) mainLooper, "");
        if (C89219l.m154714a(currentThread, mainLooper.getThread())) {
            aVar.invoke();
        } else {
            mo20488i().post(new RunnableC12681k(aVar));
        }
    }

    /* renamed from: a */
    public final void mo20482a(int i, Object obj) {
        C89219l.m154719c(obj, "");
        this.f30826g = obj;
        Iterator<T> it = this.f30832m.iterator();
        while (it.hasNext()) {
            it.next().mo20482a(i, obj);
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final <VM extends AssemViewModel<S>, S extends AbstractC12853j, ITEM> void mo20474a(VM vm, AbstractC89183m<? super S, ? super ITEM, ? extends S> mVar) {
        C89219l.m154719c(vm, "");
        C89219l.m154719c(mVar, "");
        AbstractC89277c<?> a = C89204ab.m154669a(vm.getClass());
        if (!this.f30838s.containsKey(a)) {
            this.f30838s.put(a, mVar);
            this.f30839t.put(a, vm);
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC12693u<? extends AbstractC22876d>, ITEM> void mo20483a(T t, ITEM item, List<? extends Object> list, AbstractC89172b<? super ITEM, C89391z> bVar, AbstractC89171a<Integer> aVar) {
        C89219l.m154719c(t, "");
        this.f30826g = item;
        this.f30820a = null;
        if (this.f30821b == null) {
            this.f30821b = C89204ab.m154669a(t.getClass());
        }
        t.f30901n = this;
        this.f30820a = t;
        this.f30833n = bVar;
        this.f30834o = aVar;
        m22802a(list);
        m22801a(t, this, item, list, bVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.assem.arch.b.q */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final <T extends AbstractC12693u<? extends AbstractC22876d>, ITEM> void m22801a(T t, C12666q qVar, ITEM item, List<? extends Object> list, AbstractC89172b<? super ITEM, C89391z> bVar, AbstractC89171a<Integer> aVar) {
        T t2;
        List<AbstractC12748a> u = t.mo20529u();
        if (u != null) {
            for (T t3 : u) {
                if (t3 != null) {
                    T t4 = t3;
                    Iterator<T> it = qVar.f30832m.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (C89219l.m154714a(t2.f30821b, C89204ab.m154669a(t4.getClass()))) {
                            break;
                        }
                    }
                    T t5 = t2;
                    if (t5 == null) {
                        t5 = new C12666q();
                        t5.f30821b = C89204ab.m154669a(t4.getClass());
                        qVar.f30832m.add(t5);
                    }
                    t4.f30901n = t5;
                    t5.f30820a = t4;
                    t5.f30826g = item;
                    t5.f30833n = this.f30833n;
                    t5.f30834o = aVar;
                    t5.m22802a(list);
                    if (t4.mo20530v()) {
                        m22801a(t4, t5, item, list, bVar, aVar);
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
