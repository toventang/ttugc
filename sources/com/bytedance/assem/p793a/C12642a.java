package com.bytedance.assem.p793a;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.SharedViewModelProvider;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.a.a */
public final class C12642a<S extends AbstractC12853j, VM extends AssemViewModel<S>> implements AbstractC89244h<VM> {

    /* renamed from: a */
    public static final C12643a f30793a = new C12643a((byte) 0);

    /* renamed from: b */
    private VM f30794b;

    /* renamed from: c */
    private final AbstractC89277c<VM> f30795c;

    /* renamed from: d */
    private final AbstractC89171a<String> f30796d;

    /* renamed from: e */
    private final AbstractC89171a<AbstractC12840g<S>> f30797e;

    /* renamed from: f */
    private final AbstractC89171a<AbstractC1204m> f30798f;

    /* renamed from: g */
    private final AbstractC89171a<C1175ad.AbstractC1177b> f30799g;

    /* renamed from: h */
    private final AbstractC89172b<S, S> f30800h;

    /* renamed from: i */
    private final AbstractC89171a<C12752d> f30801i;

    /* renamed from: j */
    private final AbstractC89171a<C12753e> f30802j;

    static {
        Covode.recordClassIndex(14462);
    }

    /* renamed from: com.bytedance.assem.a.a$a */
    public static final class C12643a {
        static {
            Covode.recordClassIndex(14463);
        }

        private C12643a() {
        }

        public /* synthetic */ C12643a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <S extends AbstractC12853j> void m22774a(AssemViewModel<S> assemViewModel, AbstractC89171a<? extends AbstractC1204m> aVar, AbstractC89171a<C12752d> aVar2, AbstractC89171a<C12753e> aVar3, AbstractC89171a<? extends AbstractC12840g<S>> aVar4, AbstractC89172b<? super S, ? extends S> bVar) {
            C12752d dVar;
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(aVar4, "");
            C89219l.m154719c(bVar, "");
            if (!assemViewModel.f31148b) {
                assemViewModel.mo20665a(new WeakReference<>(((AbstractC1204m) aVar.invoke()).getLifecycle()));
                C12753e eVar = null;
                if (aVar2 != null) {
                    dVar = aVar2.invoke();
                } else {
                    dVar = null;
                }
                assemViewModel.f31150d = dVar;
                if (aVar3 != null) {
                    eVar = aVar3.invoke();
                }
                assemViewModel.f31151e = eVar;
                assemViewModel.mo20661a((AbstractC12840g) aVar4.invoke(), bVar);
            }
        }
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f30794b != null) {
            return true;
        }
        return false;
    }

    @Override // p4600h.AbstractC89244h
    public final /* synthetic */ Object getValue() {
        VM vm = this.f30794b;
        if (vm == null) {
            C1175ad.AbstractC1177b invoke = this.f30799g.invoke();
            if (this.f30796d != null) {
                SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider(invoke);
                AbstractC1196i lifecycle = this.f30798f.invoke().getLifecycle();
                C89219l.m154709a((Object) lifecycle, "");
                vm = (VM) ((AssemViewModel) sharedViewModelProvider.mo3982a(lifecycle, this.f30796d.invoke(), C89170a.m154665a(this.f30795c)));
            } else {
                SharedViewModelProvider sharedViewModelProvider2 = new SharedViewModelProvider(invoke);
                AbstractC1196i lifecycle2 = this.f30798f.invoke().getLifecycle();
                C89219l.m154709a((Object) lifecycle2, "");
                vm = (VM) ((AssemViewModel) sharedViewModelProvider2.mo3981a(lifecycle2, C89170a.m154665a(this.f30795c)));
            }
            this.f30794b = vm;
            C12643a.m22774a(vm, this.f30798f, this.f30801i, this.f30802j, this.f30797e, this.f30800h);
        }
        return vm;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.assem.arch.viewModel.g<S extends com.bytedance.assem.arch.viewModel.j>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends androidx.lifecycle.m> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, ? extends S extends com.bytedance.assem.arch.viewModel.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12642a(AbstractC89277c<VM> cVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends AbstractC12840g<S>> aVar2, AbstractC89171a<? extends AbstractC1204m> aVar3, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar4, AbstractC89172b<? super S, ? extends S> bVar, AbstractC89171a<C12752d> aVar5, AbstractC89171a<C12753e> aVar6) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(aVar3, "");
        C89219l.m154719c(aVar4, "");
        C89219l.m154719c(bVar, "");
        this.f30795c = cVar;
        this.f30796d = aVar;
        this.f30797e = aVar2;
        this.f30798f = aVar3;
        this.f30799g = aVar4;
        this.f30800h = bVar;
        this.f30801i = aVar5;
        this.f30802j = aVar6;
    }
}
