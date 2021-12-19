package com.bytedance.ext_power_list;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.p795b.AbstractC12659j;
import com.bytedance.assem.arch.p795b.AbstractC12660k;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import java.lang.ref.WeakReference;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.ext_power_list.e */
public final class C14519e<S extends AbstractC12853j, VM extends AssemViewModel<S>, T extends AbstractC12693u<? extends AbstractC22876d>, ITEM> implements AbstractC12660k<S, VM> {

    /* renamed from: a */
    public final T f35102a;

    /* renamed from: b */
    public final AbstractC89277c<VM> f35103b;

    /* renamed from: c */
    public final AbstractC89171a<String> f35104c;

    /* renamed from: d */
    public final AbstractC89171a<AbstractC12840g<S>> f35105d;

    /* renamed from: e */
    public final AbstractC89171a<C1175ad.AbstractC1177b> f35106e;

    /* renamed from: f */
    public final AbstractC89172b<S, S> f35107f;

    /* renamed from: g */
    public final AbstractC89183m<S, ITEM, S> f35108g;

    /* renamed from: h */
    public final AbstractC89183m<ITEM, S, ITEM> f35109h;

    /* renamed from: i */
    public final AbstractC89171a<C12752d> f35110i;

    /* renamed from: j */
    public final AbstractC89171a<C12753e> f35111j;

    static {
        Covode.recordClassIndex(16606);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14519e)) {
            return false;
        }
        C14519e eVar = (C14519e) obj;
        return C89219l.m154714a(this.f35102a, eVar.f35102a) && C89219l.m154714a(this.f35103b, eVar.f35103b) && C89219l.m154714a(this.f35104c, eVar.f35104c) && C89219l.m154714a(this.f35105d, eVar.f35105d) && C89219l.m154714a(this.f35106e, eVar.f35106e) && C89219l.m154714a(this.f35107f, eVar.f35107f) && C89219l.m154714a(this.f35108g, eVar.f35108g) && C89219l.m154714a(this.f35109h, eVar.f35109h) && C89219l.m154714a(this.f35110i, eVar.f35110i) && C89219l.m154714a(this.f35111j, eVar.f35111j);
    }

    public final int hashCode() {
        T t = this.f35102a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        AbstractC89277c<VM> cVar = this.f35103b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        AbstractC89171a<String> aVar = this.f35104c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC89171a<AbstractC12840g<S>> aVar2 = this.f35105d;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        AbstractC89171a<C1175ad.AbstractC1177b> aVar3 = this.f35106e;
        int hashCode5 = (hashCode4 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        AbstractC89172b<S, S> bVar = this.f35107f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89183m<S, ITEM, S> mVar = this.f35108g;
        int hashCode7 = (hashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        AbstractC89183m<ITEM, S, ITEM> mVar2 = this.f35109h;
        int hashCode8 = (hashCode7 + (mVar2 != null ? mVar2.hashCode() : 0)) * 31;
        AbstractC89171a<C12752d> aVar4 = this.f35110i;
        int hashCode9 = (hashCode8 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        AbstractC89171a<C12753e> aVar5 = this.f35111j;
        if (aVar5 != null) {
            i = aVar5.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "CellScopeViewModelProvideData(host=" + this.f35102a + ", viewModelClass=" + this.f35103b + ", keyFactory=" + this.f35104c + ", dispatcherFactory=" + this.f35105d + ", factoryProducer=" + this.f35106e + ", argumentsAcceptor=" + this.f35107f + ", itemSync2StateAcceptor=" + this.f35108g + ", state2ItemAcceptor=" + this.f35109h + ", hierarchyDataStore=" + this.f35110i + ", hierarchyServiceStore=" + this.f35111j + ")";
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12660k
    /* renamed from: a */
    public final VM mo20481a() {
        AbstractC1204m mVar;
        AbstractC1204m mVar2;
        AbstractC1174ac a;
        VM vm;
        VM vm2;
        C12752d dVar;
        C12753e eVar;
        C1175ad.AbstractC1177b bVar;
        MethodCollector.m26663i(2635);
        AbstractC12693u uVar = this.f35102a;
        while (true) {
            mVar = null;
            if (uVar != null) {
                mVar2 = uVar.bE_();
            } else {
                mVar2 = null;
            }
            if (mVar2 instanceof AbstractC12656g) {
                break;
            }
            if (uVar != null) {
                mVar = uVar.bE_();
            }
            uVar = (AbstractC12693u) mVar;
        }
        AbstractC12659j jVar = uVar.f30901n;
        if (jVar != null) {
            AbstractC12659j jVar2 = this.f35102a.f30901n;
            if (jVar.mo20478e() == null) {
                C1182af viewModelStore = jVar.getViewModelStore();
                AbstractC89171a<C1175ad.AbstractC1177b> aVar = this.f35106e;
                if (aVar == null || (bVar = aVar.invoke()) == null) {
                    bVar = new C1175ad.C1179d();
                }
                jVar.mo20472a(new C1175ad(viewModelStore, bVar));
            }
            C1182af viewModelStore2 = jVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore2, "");
            synchronized (viewModelStore2) {
                try {
                    C1175ad e = jVar.mo20478e();
                    if (e != null) {
                        String invoke = this.f35104c.invoke();
                        Class a2 = C89170a.m154665a(this.f35103b);
                        if (a2.equals(ScopeViewModel.class)) {
                            a = e.mo3984a(invoke, a2);
                        } else {
                            a = e.mo3984a(invoke, a2);
                            C1171ab.m3870a(a, e);
                        }
                        C89219l.m154709a((Object) a, "");
                        vm = (VM) ((AssemViewModel) a);
                        if (!vm.f31148b) {
                            vm.f31149c = true;
                            vm.mo20665a(new WeakReference<>(jVar.getLifecycle()));
                            AbstractC89171a<C12752d> aVar2 = this.f35110i;
                            if (aVar2 != null) {
                                dVar = aVar2.invoke();
                            } else {
                                dVar = null;
                            }
                            vm.f31150d = dVar;
                            AbstractC89171a<C12753e> aVar3 = this.f35111j;
                            if (aVar3 != null) {
                                eVar = aVar3.invoke();
                            } else {
                                eVar = null;
                            }
                            vm.f31151e = eVar;
                            vm.mo20661a(this.f35105d.invoke(), this.f35107f);
                        }
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.".toString());
                        MethodCollector.m26664o(2635);
                        throw illegalArgumentException;
                    }
                } finally {
                    MethodCollector.m26664o(2635);
                }
            }
            Object obj = this.f35108g;
            Object obj2 = this.f35109h;
            if (!(vm instanceof AbstractC14529j)) {
                vm2 = null;
            } else {
                vm2 = vm;
            }
            AbstractC14529j jVar3 = (AbstractC14529j) vm2;
            if (jVar3 != null) {
                obj = new C14520a(jVar3);
                obj2 = new C14521b(jVar3);
            }
            if (vm instanceof AssemViewModelWithItem) {
                mVar = vm;
            }
            AssemViewModelWithItem assemViewModelWithItem = (AssemViewModelWithItem) mVar;
            if (assemViewModelWithItem != null) {
                assemViewModelWithItem.f35095j = jVar;
            }
            if (!(obj == null || jVar2 == null)) {
                jVar2.mo20474a(vm, (AbstractC89183m) C89206ad.m154679b(obj, 2));
            }
            if (!(obj2 == null || jVar.mo20477d() == null)) {
                Object a3 = jVar.mo20471a();
                Object b = C89206ad.m154679b(obj2, 2);
                Object d = jVar.mo20477d();
                if (d == null) {
                    C89219l.m154707a();
                }
                C89219l.m154719c(b, "");
                C89219l.m154719c(d, "");
                vm.f31153g = (AbstractC89183m) C89206ad.m154679b(b, 2);
                vm.f31154h = a3;
                vm.f31155i = d;
            }
            return vm;
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("proxy not bound to Assem yet".toString());
        MethodCollector.m26664o(2635);
        throw illegalArgumentException2;
    }

    /* renamed from: com.bytedance.ext_power_list.e$a */
    static final class C14520a extends AbstractC89220m implements AbstractC89183m<S, ITEM, S> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14529j f35112a;

        static {
            Covode.recordClassIndex(16607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14520a(AbstractC14529j jVar) {
            super(2);
            this.f35112a = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.ext_power_list.j */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            AbstractC12853j jVar = (AbstractC12853j) obj;
            C89219l.m154719c(jVar, "");
            return this.f35112a.mo23372a(jVar, obj2);
        }
    }

    /* renamed from: com.bytedance.ext_power_list.e$b */
    static final class C14521b extends AbstractC89220m implements AbstractC89183m<ITEM, S, ITEM> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14529j f35113a;

        static {
            Covode.recordClassIndex(16608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14521b(AbstractC14529j jVar) {
            super(2);
            this.f35113a = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.ext_power_list.j */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            AbstractC12853j jVar = (AbstractC12853j) obj2;
            C89219l.m154719c(jVar, "");
            return this.f35113a.mo23373b(jVar, obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.m<? super S extends com.bytedance.assem.arch.viewModel.j, ? super ITEM, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.m<? super ITEM, ? super S extends com.bytedance.assem.arch.viewModel.j, ? extends ITEM> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14519e(T t, AbstractC89277c<VM> cVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends AbstractC12840g<S>> aVar2, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar3, AbstractC89172b<? super S, ? extends S> bVar, AbstractC89183m<? super S, ? super ITEM, ? extends S> mVar, AbstractC89183m<? super ITEM, ? super S, ? extends ITEM> mVar2, AbstractC89171a<C12752d> aVar4, AbstractC89171a<C12753e> aVar5) {
        C89219l.m154719c(t, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(bVar, "");
        this.f35102a = t;
        this.f35103b = cVar;
        this.f35104c = aVar;
        this.f35105d = aVar2;
        this.f35106e = aVar3;
        this.f35107f = bVar;
        this.f35108g = mVar;
        this.f35109h = mVar2;
        this.f35110i = aVar4;
        this.f35111j = aVar5;
    }
}
