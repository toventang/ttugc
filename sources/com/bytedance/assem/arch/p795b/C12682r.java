package com.bytedance.assem.arch.p795b;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlinx.coroutines.AbstractC89516am;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.b.r */
public final class C12682r implements AbstractC12659j, AbstractC22873a<AbstractC22876d, Object>, AbstractC22876d {

    /* renamed from: a */
    public AbstractC12693u<? extends AbstractC22876d> f30860a;

    /* renamed from: b */
    public AbstractC89277c<? extends AbstractC12693u<? extends AbstractC22876d>> f30861b;

    /* renamed from: c */
    public int f30862c = -1;

    /* renamed from: d */
    public final C1205n f30863d = new C1205n(this);

    /* renamed from: e */
    public boolean f30864e;

    /* renamed from: f */
    public final List<C12682r> f30865f = new ArrayList();

    /* renamed from: g */
    public Object f30866g;

    /* renamed from: h */
    public final Queue<AbstractC89171a<C89391z>> f30867h = new LinkedList();

    /* renamed from: i */
    private boolean f30868i = true;

    /* renamed from: j */
    private C1175ad f30869j;

    /* renamed from: k */
    private final C1182af f30870k = new C1182af();

    /* renamed from: l */
    private final AbstractC89244h f30871l = C89250i.m154773a((AbstractC89171a) C12688d.f30888a);

    /* renamed from: m */
    private Object f30872m;

    /* renamed from: n */
    private AbstractC89171a<Integer> f30873n;

    /* renamed from: o */
    private final Map<AbstractC89277c<?>, Object> f30874o = new LinkedHashMap();

    /* renamed from: p */
    private final Map<AbstractC89277c<?>, AssemViewModel<?>> f30875p = new LinkedHashMap();

    /* renamed from: q */
    private final C88958b<C12651b> f30876q;

    static {
        Covode.recordClassIndex(14502);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: f */
    public final void mo20479f() {
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: g */
    public final void mo20480g() {
    }

    /* renamed from: i */
    public final Handler mo20499i() {
        return (Handler) this.f30871l.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final Object mo20471a() {
        return this.f30866g;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: b */
    public final C88958b<C12651b> mo20475b() {
        return this.f30876q;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: c */
    public final AbstractC89171a<Integer> mo20476c() {
        return this.f30873n;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: d */
    public final Object mo20477d() {
        return this.f30872m;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: e */
    public final C1175ad mo20478e() {
        return this.f30869j;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this.f30860a;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final /* bridge */ /* synthetic */ AbstractC1196i getLifecycle() {
        return this.f30863d;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        return this.f30870k;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22879g
    /* renamed from: h */
    public final boolean mo20487h() {
        return this.f30868i;
    }

    /* renamed from: a */
    public final void mo20498a(List<? extends Object> list) {
        AbstractC1196i.EnumC1199b bVar;
        C1205n nVar;
        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30860a;
        if (uVar == null || (nVar = uVar.f31000d) == null || (bVar = nVar.mo4011a()) == null) {
            bVar = AbstractC1196i.EnumC1199b.RESUMED;
        }
        if (bVar.compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) >= 0 && this.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) >= 0) {
            AbstractC12693u<? extends AbstractC22876d> uVar2 = this.f30860a;
            AbstractC12658i iVar = null;
            if (!(uVar2 instanceof AbstractC12658i)) {
                uVar2 = null;
            }
            AbstractC12658i iVar2 = (AbstractC12658i) uVar2;
            if (iVar2 != null) {
                iVar2.mo20469b(this.f30866g);
            }
            if (list != null && !list.isEmpty()) {
                list = new ArrayList<>();
                list.addAll(list);
            }
            Map<AbstractC89277c<?>, Object> map = this.f30874o;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<AbstractC89277c<?>, Object> entry : this.f30874o.entrySet()) {
                    AssemViewModel<?> assemViewModel = this.f30875p.get(entry.getKey());
                    if (assemViewModel != null) {
                        assemViewModel.mo20664a(this.f30866g, list, entry.getValue(), new C12683a(assemViewModel, this, list));
                    }
                }
            } else if (this.f30860a instanceof AbstractC12658i) {
                if (!C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                    mo20499i().post(new RunnableC12685b(this, list));
                } else if (list == null || list.isEmpty()) {
                    AbstractC12693u<? extends AbstractC22876d> uVar3 = this.f30860a;
                    if (uVar3 instanceof AbstractC12658i) {
                        iVar = uVar3;
                    }
                    AbstractC12658i iVar3 = iVar;
                    if (iVar3 != null) {
                        iVar3.mo20467a(this.f30866g);
                    }
                } else {
                    AbstractC12693u<? extends AbstractC22876d> uVar4 = this.f30860a;
                    if (uVar4 instanceof AbstractC12658i) {
                        iVar = uVar4;
                    }
                    AbstractC12658i iVar4 = (AbstractC12658i) iVar;
                    if (iVar4 != null) {
                        iVar4.mo20468a(this.f30866g, list);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private final void m22828k() {
        this.f30863d.mo4017a(AbstractC1196i.EnumC1199b.INITIALIZED);
    }

    /* renamed from: com.bytedance.assem.arch.b.r$d */
    static final class C12688d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C12688d f30888a = new C12688d();

        static {
            Covode.recordClassIndex(14508);
        }

        C12688d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.r$b */
    public static final class RunnableC12685b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12682r f30884a;

        /* renamed from: b */
        final /* synthetic */ List f30885b;

        static {
            Covode.recordClassIndex(14505);
        }

        RunnableC12685b(C12682r rVar, List list) {
            this.f30884a = rVar;
            this.f30885b = list;
        }

        public final void run() {
            boolean z;
            List list = this.f30885b;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            AbstractC12658i iVar = null;
            if (z) {
                AbstractC12693u<? extends AbstractC22876d> uVar = this.f30884a.f30860a;
                if (uVar instanceof AbstractC12658i) {
                    iVar = uVar;
                }
                AbstractC12658i iVar2 = (AbstractC12658i) iVar;
                if (iVar2 != null) {
                    iVar2.mo20467a(this.f30884a.f30866g);
                    return;
                }
                return;
            }
            AbstractC12693u<? extends AbstractC22876d> uVar2 = this.f30884a.f30860a;
            if (uVar2 instanceof AbstractC12658i) {
                iVar = uVar2;
            }
            AbstractC12658i iVar3 = iVar;
            if (iVar3 != null) {
                iVar3.mo20468a(this.f30884a.f30866g, this.f30885b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.r$c */
    public static final class RunnableC12686c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12682r f30886a;

        static {
            Covode.recordClassIndex(14506);
        }

        RunnableC12686c(C12682r rVar) {
            this.f30886a = rVar;
        }

        public final void run() {
            AbstractC12693u<? extends AbstractC22876d> uVar = this.f30886a.f30860a;
            if (uVar != null) {
                uVar.mo20533y();
            }
            AbstractC12693u<? extends AbstractC22876d> uVar2 = this.f30886a.f30860a;
            if (uVar2 != null) {
                uVar2.f30900m = true;
            }
            this.f30886a.mo20499i().post(new Runnable(this) {
                /* class com.bytedance.assem.arch.p795b.C12682r.RunnableC12686c.RunnableC126871 */

                /* renamed from: a */
                final /* synthetic */ RunnableC12686c f30887a;

                static {
                    Covode.recordClassIndex(14507);
                }

                {
                    this.f30887a = r1;
                }

                public final void run() {
                    this.f30887a.f30886a.mo20498a((List<? extends Object>) null);
                }
            });
            this.f30886a.f30864e = true;
        }
    }

    /* renamed from: j */
    public final void mo20500j() {
        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30860a;
        if (!(uVar instanceof AbstractC12658i)) {
            uVar = null;
        }
        AbstractC12658i iVar = (AbstractC12658i) uVar;
        if (iVar != null) {
            iVar.mo20466a();
        }
        this.f30860a = null;
        Iterator<T> it = this.f30865f.iterator();
        while (it.hasNext()) {
            it.next().mo20500j();
        }
    }

    /* renamed from: l */
    private final void m22829l() {
        this.f30863d.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
        if (!this.f30864e) {
            AbstractC12693u<? extends AbstractC22876d> uVar = this.f30860a;
            if (uVar != null && uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                m22822a(AbstractC1196i.EnumC1199b.CREATED, uVar);
            }
            C12787j.m23009a().execute(new RunnableC12686c(this));
        }
        if (!this.f30865f.isEmpty()) {
            Iterator<T> it = this.f30865f.iterator();
            while (it.hasNext()) {
                m22821a(AbstractC1196i.EnumC1199b.CREATED, it.next(), false);
            }
        }
    }

    /* renamed from: m */
    private final void m22830m() {
        if (!this.f30865f.isEmpty()) {
            Iterator<T> it = this.f30865f.iterator();
            while (it.hasNext()) {
                m22821a(AbstractC1196i.EnumC1199b.DESTROYED, it.next(), false);
            }
        }
        this.f30863d.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        this.f30867h.clear();
        this.f30874o.clear();
        this.f30875p.clear();
        this.f30870k.mo3997a();
        mo20499i().removeCallbacksAndMessages(null);
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("Position=");
        AbstractC89171a<Integer> aVar = this.f30873n;
        String str = null;
        if (aVar != null) {
            num = aVar.invoke();
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(", Proxy@").append(Integer.toHexString(hashCode())).append('(').append("host@");
        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30860a;
        if (uVar != null) {
            str = Integer.toHexString(uVar.hashCode());
        }
        return append.append(str).append(",state:").append(this.f30863d.mo4011a()).append(')').toString();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final void mo20472a(C1175ad adVar) {
        this.f30869j = adVar;
    }

    /* renamed from: a */
    private final void m22824a(boolean z) {
        this.f30868i = z;
        this.f30863d.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
        if (!this.f30865f.isEmpty()) {
            Iterator<T> it = this.f30865f.iterator();
            while (it.hasNext()) {
                m22821a(AbstractC1196i.EnumC1199b.STARTED, it.next(), z);
            }
        }
    }

    /* renamed from: b */
    private final void m22825b(boolean z) {
        this.f30868i = z;
        this.f30863d.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        if (!this.f30865f.isEmpty()) {
            Iterator<T> it = this.f30865f.iterator();
            while (it.hasNext()) {
                m22821a(AbstractC1196i.EnumC1199b.RESUMED, it.next(), z);
            }
        }
    }

    /* renamed from: c */
    private final void m22826c(boolean z) {
        this.f30868i = z;
        if (!this.f30865f.isEmpty()) {
            Iterator<T> it = this.f30865f.iterator();
            while (it.hasNext()) {
                m22821a(AbstractC1196i.EnumC1199b.STARTED, it.next(), z);
            }
        }
        this.f30863d.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    /* renamed from: d */
    private final void m22827d(boolean z) {
        this.f30868i = z;
        if (!this.f30865f.isEmpty()) {
            Iterator<T> it = this.f30865f.iterator();
            while (it.hasNext()) {
                m22821a(AbstractC1196i.EnumC1199b.CREATED, it.next(), z);
            }
        }
        this.f30863d.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final void mo20473a(AbstractC12693u<? extends AbstractC22876d> uVar) {
        T t;
        T t2;
        C89219l.m154719c(uVar, "");
        uVar.mo20534z();
        List<C12682r> list = this.f30865f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (C89219l.m154714a(t2.f30861b, C89204ab.m154669a(uVar.getClass()))) {
                    break;
                }
            }
            t = t2;
            if (t != null) {
                C1205n nVar = this.f30863d;
                if (nVar == null || (r0 = nVar.mo4011a()) == null) {
                    AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.INITIALIZED;
                }
                m22821a(bVar, t, true);
            }
        }
        t = new C12682r();
        C89219l.m154719c(t, "");
        this.f30865f.add(t);
        t.mo20497a(uVar, this.f30866g, null, (AbstractC89172b) C89206ad.m154679b(this.f30872m, 1), this.f30873n);
        C1205n nVar2 = this.f30863d;
        AbstractC1196i.EnumC1199b bVar2 = AbstractC1196i.EnumC1199b.INITIALIZED;
        m22821a(bVar2, t, true);
    }

    /* renamed from: a */
    public final void mo20496a(int i, Object obj) {
        C89219l.m154719c(obj, "");
        this.f30866g = obj;
        Iterator<T> it = this.f30865f.iterator();
        while (it.hasNext()) {
            it.next().mo20496a(i, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.b.r$a */
    public static final class C12683a extends AbstractC89220m implements AbstractC89183m<Object, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f30877a;

        /* renamed from: b */
        final /* synthetic */ C12682r f30878b;

        /* renamed from: c */
        final /* synthetic */ List f30879c;

        static {
            Covode.recordClassIndex(14503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12683a(AssemViewModel assemViewModel, C12682r rVar, List list) {
            super(2);
            this.f30877a = assemViewModel;
            this.f30878b = rVar;
            this.f30879c = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(final Object obj, List<? extends Object> list) {
            final List<? extends Object> list2 = list;
            final AbstractC12693u<? extends AbstractC22876d> uVar = this.f30878b.f30860a;
            if (uVar != null) {
                if (uVar instanceof AbstractC12657h) {
                    if (list2 != null) {
                        list2.isEmpty();
                    }
                } else if (uVar instanceof AbstractC12658i) {
                    this.f30877a.mo20672d(new AbstractC89172b<AbstractC89516am, C89391z>() {
                        /* class com.bytedance.assem.arch.p795b.C12682r.C12683a.C126841 */

                        static {
                            Covode.recordClassIndex(14504);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(AbstractC89516am amVar) {
                            boolean z;
                            C89219l.m154719c(amVar, "");
                            List list = list2;
                            if (list == null || list.isEmpty()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                AbstractC12693u uVar = uVar;
                                if (uVar != null) {
                                    ((AbstractC12658i) uVar).mo20467a(obj);
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            } else {
                                AbstractC12693u uVar2 = uVar;
                                if (uVar2 != null) {
                                    ((AbstractC12658i) uVar2).mo20468a(obj, list2);
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            }
                            return C89391z.f203057a;
                        }
                    });
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m22822a(AbstractC1196i.EnumC1199b bVar, AbstractC12693u<?> uVar) {
        int i = C12689s.f30889a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) >= 0) {
                            uVar.mo20595k();
                        }
                        if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) >= 0) {
                            uVar.mo20596m();
                        }
                        if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) >= 0) {
                            uVar.mo20597o();
                        }
                    }
                } else if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                    if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        uVar.aA_();
                    }
                    if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                        uVar.mo20594g();
                    }
                    uVar.bV_();
                }
            } else if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                    uVar.aA_();
                }
                uVar.mo20594g();
            } else if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                uVar.mo20595k();
            }
        } else if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
            uVar.aA_();
        } else {
            if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                uVar.mo20595k();
            }
            if (uVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) > 0) {
                uVar.mo20596m();
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12659j
    /* renamed from: a */
    public final <VM extends AssemViewModel<S>, S extends AbstractC12853j, ITEM> void mo20474a(VM vm, AbstractC89183m<? super S, ? super ITEM, ? extends S> mVar) {
        C89219l.m154719c(vm, "");
        C89219l.m154719c(mVar, "");
        AbstractC89277c<?> a = C89204ab.m154669a(vm.getClass());
        if (!this.f30874o.containsKey(a)) {
            this.f30874o.put(a, mVar);
            this.f30875p.put(a, vm);
        }
    }

    /* renamed from: a */
    public static void m22821a(AbstractC1196i.EnumC1199b bVar, C12682r rVar, boolean z) {
        AbstractC12693u<? extends AbstractC22876d> uVar;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(rVar, "");
        int i = C12689s.f30890b[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) >= 0) {
                            rVar.m22826c(z);
                        }
                        if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) >= 0) {
                            rVar.m22827d(z);
                        }
                        if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) >= 0) {
                            rVar.m22830m();
                        }
                    } else if (i == 5) {
                        rVar.m22828k();
                    }
                } else if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                    if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        rVar.m22829l();
                    }
                    if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0 && (uVar = rVar.f30860a) != null) {
                        uVar.f31000d.mo4011a();
                        rVar.m22824a(z);
                    }
                    AbstractC12693u<? extends AbstractC22876d> uVar2 = rVar.f30860a;
                    if (uVar2 != null) {
                        uVar2.f31000d.mo4011a();
                        rVar.m22825b(z);
                    }
                }
            } else if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                    rVar.m22829l();
                }
                if (rVar.f30860a != null) {
                    rVar.m22824a(z);
                }
            } else if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                rVar.m22826c(z);
            }
        } else if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
            rVar.m22829l();
        } else {
            if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                rVar.m22826c(z);
            }
            if (rVar.f30863d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) > 0) {
                rVar.m22827d(z);
            }
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC12693u<? extends AbstractC22876d>, ITEM> void mo20497a(T t, ITEM item, List<? extends Object> list, AbstractC89172b<? super ITEM, C89391z> bVar, AbstractC89171a<Integer> aVar) {
        C89219l.m154719c(t, "");
        this.f30866g = item;
        this.f30860a = null;
        if (this.f30861b == null) {
            this.f30861b = C89204ab.m154669a(t.getClass());
        }
        t.f30901n = this;
        this.f30860a = t;
        if (t.f31000d.mo4011a().compareTo((Enum) this.f30863d.mo4011a()) < 0) {
            AbstractC1196i.EnumC1199b a = this.f30863d.mo4011a();
            C89219l.m154709a((Object) a, "");
            AbstractC12693u<? extends AbstractC22876d> uVar = this.f30860a;
            if (uVar == null) {
                C89219l.m154707a();
            }
            m22822a(a, uVar);
        }
        this.f30872m = bVar;
        this.f30873n = aVar;
        mo20498a(list);
        m22823a(t, this, item, list, bVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.assem.arch.b.r */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final <T extends AbstractC12693u<? extends AbstractC22876d>, ITEM> void m22823a(T t, C12682r rVar, ITEM item, List<? extends Object> list, AbstractC89172b<? super ITEM, C89391z> bVar, AbstractC89171a<Integer> aVar) {
        C12682r rVar2;
        List<AbstractC12748a> u = t.mo20529u();
        if (u != null) {
            int i = 0;
            for (T t2 : u) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t3 = t2;
                if (t3 != null) {
                    T t4 = t3;
                    List<C12682r> list2 = rVar.f30865f;
                    if (list2 == null || list2.isEmpty() || rVar.f30865f.size() <= i) {
                        rVar2 = new C12682r();
                        if (rVar2.f30861b == null) {
                            rVar2.f30861b = C89204ab.m154669a(t4.getClass());
                        }
                        t4.f30901n = rVar2;
                        rVar2.f30860a = t4;
                        rVar.f30865f.add(i, rVar2);
                    } else {
                        rVar2 = rVar.f30865f.get(i);
                        if (rVar2.f30861b == null) {
                            rVar2.f30861b = C89204ab.m154669a(t4.getClass());
                        }
                        t4.f30901n = rVar2;
                        rVar2.f30860a = t4;
                    }
                    t4.mo20534z();
                    rVar2.f30866g = item;
                    rVar2.f30872m = this.f30872m;
                    rVar2.f30873n = aVar;
                    if (t4.f31000d.mo4011a().compareTo((Enum) rVar2.f30863d.mo4011a()) < 0) {
                        AbstractC1196i.EnumC1199b a = rVar2.f30863d.mo4011a();
                        C89219l.m154709a((Object) a, "");
                        m22822a(a, t4);
                    }
                    rVar2.mo20498a(list);
                    if (t4.mo20530v()) {
                        m22823a(t4, rVar2, item, list, bVar, aVar);
                    }
                    i = i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
