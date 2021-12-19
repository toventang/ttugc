package com.bytedance.ext_power_list;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
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

/* renamed from: com.bytedance.ext_power_list.f */
public final class C14522f<S extends AbstractC12853j, VM extends AssemViewModel<S>> implements AbstractC89244h<VM> {

    /* renamed from: a */
    private VM f35114a;

    /* renamed from: b */
    private final AbstractC89277c<VM> f35115b;

    /* renamed from: c */
    private final AbstractC89171a<String> f35116c;

    /* renamed from: d */
    private final AbstractC89171a<AbstractC12840g<S>> f35117d;

    /* renamed from: e */
    private final AbstractC89171a<AbstractC1204m> f35118e;

    /* renamed from: f */
    private final AbstractC1204m f35119f;

    /* renamed from: g */
    private final AbstractC89171a<C1175ad.AbstractC1177b> f35120g;

    /* renamed from: h */
    private final AbstractC89172b<S, S> f35121h;

    static {
        Covode.recordClassIndex(16609);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f35114a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VM getValue() {
        C1182af afVar;
        AbstractC1174ac a;
        VM vm = this.f35114a;
        if (vm != null) {
            return vm;
        }
        C1175ad.AbstractC1177b invoke = this.f35120g.invoke();
        Fragment a2 = C12777b.m22999a(this.f35119f);
        if (a2 != null) {
            try {
                afVar = a2.getViewModelStore();
            } catch (IllegalStateException unused) {
                afVar = new C1182af();
                AbstractC0952i fragmentManager = a2.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.mo3555a((AbstractC0952i.AbstractC0954b) new C14523a(afVar), false);
                }
            }
            C1175ad adVar = new C1175ad(afVar, invoke);
            String invoke2 = this.f35116c.invoke();
            Class a3 = C89170a.m154665a(this.f35115b);
            if (a3.equals(ScopeViewModel.class)) {
                a = adVar.mo3984a(invoke2, a3);
            } else {
                a = adVar.mo3984a(invoke2, a3);
                C1171ab.m3870a(a, adVar);
            }
            VM vm2 = (VM) ((AssemViewModel) a);
            this.f35114a = vm2;
            vm2.mo20665a(new WeakReference<>(this.f35118e.invoke().getLifecycle()));
            vm2.mo20661a(this.f35117d.invoke(), this.f35121h);
            C89219l.m154709a((Object) vm2, "");
            return vm2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: com.bytedance.ext_power_list.f$a */
    public static final class C14523a extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ C1182af f35122a;

        static {
            Covode.recordClassIndex(16610);
        }

        C14523a(C1182af afVar) {
            this.f35122a = afVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            super.onFragmentDestroyed(iVar, fragment);
            this.f35122a.mo3997a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.m> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14522f(AbstractC89277c<VM> cVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends AbstractC12840g<S>> aVar2, AbstractC89171a<? extends AbstractC1204m> aVar3, AbstractC1204m mVar, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar4, AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(aVar3, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar4, "");
        C89219l.m154719c(bVar, "");
        this.f35115b = cVar;
        this.f35116c = aVar;
        this.f35117d = aVar2;
        this.f35118e = aVar3;
        this.f35119f = mVar;
        this.f35120g = aVar4;
        this.f35121h = bVar;
    }
}
