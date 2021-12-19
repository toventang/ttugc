package com.bytedance.assem.arch.viewModel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.viewModel.b */
public final class C12814b<S extends AbstractC12853j, VM extends AssemViewModel<S>> implements AbstractC89244h<VM> {

    /* renamed from: a */
    private VM f31174a;

    /* renamed from: b */
    private final AbstractC89277c<VM> f31175b;

    /* renamed from: c */
    private final AbstractC89171a<String> f31176c;

    /* renamed from: d */
    private final AbstractC89171a<AbstractC12840g<S>> f31177d;

    /* renamed from: e */
    private final AbstractC89171a<AbstractC1204m> f31178e;

    /* renamed from: f */
    private final AbstractC89171a<C1182af> f31179f;

    /* renamed from: g */
    private final AbstractC89171a<C1175ad.AbstractC1177b> f31180g;

    /* renamed from: h */
    private final AbstractC89172b<S, S> f31181h;

    /* renamed from: i */
    private final AbstractC89171a<C12752d> f31182i;

    /* renamed from: j */
    private final AbstractC89171a<C12753e> f31183j;

    static {
        Covode.recordClassIndex(14646);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f31174a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final VM getValue() {
        AbstractC1174ac a;
        C12752d dVar;
        VM vm = this.f31174a;
        if (vm == null) {
            C1175ad adVar = new C1175ad(this.f31179f.invoke(), this.f31180g.invoke());
            String invoke = this.f31176c.invoke();
            Class a2 = C89170a.m154665a(this.f31175b);
            if (a2.equals(ScopeViewModel.class)) {
                a = adVar.mo3984a(invoke, a2);
            } else {
                a = adVar.mo3984a(invoke, a2);
                C1171ab.m3870a(a, adVar);
            }
            vm = (VM) ((AssemViewModel) a);
            this.f31174a = vm;
            vm.mo20665a(new WeakReference<>(this.f31178e.invoke().getLifecycle()));
            AbstractC89171a<C12752d> aVar = this.f31182i;
            C12753e eVar = null;
            if (aVar != null) {
                dVar = aVar.invoke();
            } else {
                dVar = null;
            }
            vm.f31150d = dVar;
            AbstractC89171a<C12753e> aVar2 = this.f31183j;
            if (aVar2 != null) {
                eVar = aVar2.invoke();
            }
            vm.f31151e = eVar;
            vm.mo20661a(this.f31177d.invoke(), this.f31181h);
            C89219l.m154709a((Object) vm, "");
        }
        return vm;
    }

    public /* synthetic */ C12814b(AbstractC89277c cVar, AbstractC89171a aVar, AbstractC89171a aVar2, AbstractC89171a aVar3, AbstractC89171a aVar4, AbstractC89171a aVar5, AbstractC89172b bVar) {
        this(cVar, aVar, aVar2, aVar3, aVar4, aVar5, bVar, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.m> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends androidx.lifecycle.af> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12814b(AbstractC89277c<VM> cVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends AbstractC12840g<S>> aVar2, AbstractC89171a<? extends AbstractC1204m> aVar3, AbstractC89171a<? extends C1182af> aVar4, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar5, AbstractC89172b<? super S, ? extends S> bVar, AbstractC89171a<C12752d> aVar6, AbstractC89171a<C12753e> aVar7) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(aVar3, "");
        C89219l.m154719c(aVar4, "");
        C89219l.m154719c(aVar5, "");
        C89219l.m154719c(bVar, "");
        this.f31175b = cVar;
        this.f31176c = aVar;
        this.f31177d = aVar2;
        this.f31178e = aVar3;
        this.f31179f = aVar4;
        this.f31180g = aVar5;
        this.f31181h = bVar;
        this.f31182i = aVar6;
        this.f31183j = aVar7;
    }
}
