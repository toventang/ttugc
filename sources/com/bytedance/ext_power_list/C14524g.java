package com.bytedance.ext_power_list;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.ext_power_list.g */
public final class C14524g<S extends AbstractC12853j, VM extends AssemViewModel<S>> implements AbstractC89244h<VM> {

    /* renamed from: a */
    private VM f35123a;

    /* renamed from: b */
    private final AbstractC89277c<VM> f35124b;

    /* renamed from: c */
    private final AbstractC12693u<?> f35125c;

    /* renamed from: d */
    private final AbstractC89171a<AbstractC12840g<S>> f35126d;

    /* renamed from: e */
    private final AbstractC89171a<C1175ad.AbstractC1177b> f35127e;

    /* renamed from: f */
    private final AbstractC89172b<S, S> f35128f;

    static {
        Covode.recordClassIndex(16611);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f35123a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VM getValue() {
        C1182af afVar;
        AbstractC1174ac a;
        VM vm = this.f35123a;
        if (vm != null) {
            return vm;
        }
        AbstractC12748a aVar = this.f35125c;
        while (!(aVar.bE_() instanceof AbstractC12656g)) {
            AbstractC1204m bE_ = aVar.bE_();
            if (bE_ != null) {
                aVar = (AbstractC12748a) bE_;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        AbstractC1204m bE_2 = aVar.bE_();
        Fragment a2 = C12777b.m22999a(bE_2);
        if (a2 != null) {
            C1175ad.AbstractC1177b invoke = this.f35127e.invoke();
            try {
                afVar = a2.getViewModelStore();
            } catch (IllegalStateException unused) {
                afVar = new C1182af();
                AbstractC0952i fragmentManager = a2.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.mo3555a((AbstractC0952i.AbstractC0954b) new C14525a(afVar), false);
                }
            }
            C1175ad adVar = new C1175ad(afVar, invoke);
            String a3 = C89219l.m154704a(this.f35124b.mo143613b(), (Object) String.valueOf(bE_2.hashCode()));
            Class a4 = C89170a.m154665a(this.f35124b);
            if (a4.equals(ScopeViewModel.class)) {
                a = adVar.mo3984a(a3, a4);
            } else {
                a = adVar.mo3984a(a3, a4);
                C1171ab.m3870a(a, adVar);
            }
            VM vm2 = (VM) ((AssemViewModel) a);
            this.f35123a = vm2;
            vm2.mo20665a(new WeakReference<>(bE_2.getLifecycle()));
            vm2.mo20661a(this.f35126d.invoke(), this.f35128f);
            C89219l.m154709a((Object) vm2, "");
            return vm2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: com.bytedance.ext_power_list.g$a */
    public static final class C14525a extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ C1182af f35129a;

        static {
            Covode.recordClassIndex(16612);
        }

        C14525a(C1182af afVar) {
            this.f35129a = afVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            super.onFragmentDestroyed(iVar, fragment);
            this.f35129a.mo3997a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14524g(AbstractC89277c<VM> cVar, AbstractC12693u<?> uVar, AbstractC89171a<? extends AbstractC12840g<S>> aVar, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar2, AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(uVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(bVar, "");
        this.f35124b = cVar;
        this.f35125c = uVar;
        this.f35126d = aVar;
        this.f35127e = aVar2;
        this.f35128f = bVar;
    }
}
