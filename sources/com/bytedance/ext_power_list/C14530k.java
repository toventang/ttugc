package com.bytedance.ext_power_list;

import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p795b.AbstractC12658i;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import java.lang.ref.WeakReference;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ext_power_list.k */
public final class C14530k {
    static {
        Covode.recordClassIndex(16617);
    }

    /* renamed from: com.bytedance.ext_power_list.k$a */
    public static final class C14531a implements AbstractC89248d<Object, VM> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f35130a;

        /* renamed from: b */
        final /* synthetic */ AbstractC12848i f35131b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f35132c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f35133d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89277c f35134e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f35135f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89171a f35136g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89171a f35137h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f35138i;

        /* renamed from: j */
        final /* synthetic */ C14519e f35139j;

        static {
            Covode.recordClassIndex(16618);
        }

        /* renamed from: com.bytedance.ext_power_list.k$a$a */
        public static final class C14532a extends AbstractC0952i.AbstractC0954b {

            /* renamed from: a */
            final /* synthetic */ C1182af f35140a;

            static {
                Covode.recordClassIndex(16619);
            }

            C14532a(C1182af afVar) {
                this.f35140a = afVar;
            }

            @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
            public final void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
                C89219l.m154719c(iVar, "");
                C89219l.m154719c(fragment, "");
                super.onFragmentDestroyed(iVar, fragment);
                this.f35140a.mo3997a();
            }
        }

        /* renamed from: a */
        private VM m26544a(AbstractC89286i<?> iVar) {
            C1182af afVar;
            C1175ad.AbstractC1177b bVar;
            C12752d dVar;
            C1175ad.AbstractC1177b bVar2;
            C12752d dVar2;
            C89219l.m154719c(iVar, "");
            AbstractC12848i iVar2 = this.f35131b;
            C12753e eVar = null;
            if (C89219l.m154714a(iVar2, AbstractC12848i.C12849a.f31275a)) {
                Context az_ = this.f35130a.az_();
                if (az_ != null) {
                    ActivityC0945e eVar2 = (ActivityC0945e) az_;
                    if (eVar2 != null) {
                        C1182af viewModelStore = eVar2.getViewModelStore();
                        C89219l.m154709a((Object) viewModelStore, "");
                        AbstractC89171a aVar = this.f35132c;
                        if (aVar == null || (bVar2 = (C1175ad.AbstractC1177b) aVar.invoke()) == null) {
                            bVar2 = this.f35130a.mo20598q();
                        }
                        VM vm = (VM) ((AssemViewModel) m26543a(new C1175ad(viewModelStore, bVar2), (String) this.f35133d.invoke(), C89170a.m154665a(this.f35134e)));
                        if (vm.f31148b) {
                            C89219l.m154709a((Object) vm, "");
                            return vm;
                        }
                        vm.mo20665a(new WeakReference<>(this.f35130a.f31000d));
                        AbstractC89171a aVar2 = this.f35135f;
                        if (aVar2 != null) {
                            dVar2 = (C12752d) aVar2.invoke();
                        } else {
                            dVar2 = null;
                        }
                        vm.f31150d = dVar2;
                        AbstractC89171a aVar3 = this.f35136g;
                        if (aVar3 != null) {
                            eVar = (C12753e) aVar3.invoke();
                        }
                        vm.f31151e = eVar;
                        vm.mo20661a((AbstractC12840g) this.f35137h.invoke(), this.f35138i);
                        C89219l.m154709a((Object) vm, "");
                        C89219l.m154709a((Object) vm, "");
                        return vm;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (C89219l.m154714a(iVar2, AbstractC12848i.C12852d.f31278a)) {
                Fragment a = C12777b.m22999a((AbstractC1204m) this.f35130a);
                if (a != null) {
                    try {
                        afVar = a.getViewModelStore();
                    } catch (IllegalStateException unused) {
                        afVar = new C1182af();
                        AbstractC0952i fragmentManager = a.getFragmentManager();
                        if (fragmentManager != null) {
                            fragmentManager.mo3555a((AbstractC0952i.AbstractC0954b) new C14532a(afVar), false);
                        }
                    }
                    AbstractC89171a aVar4 = this.f35132c;
                    if (aVar4 == null || (bVar = (C1175ad.AbstractC1177b) aVar4.invoke()) == null) {
                        bVar = this.f35130a.mo20598q();
                    }
                    VM vm2 = (VM) ((AssemViewModel) m26543a(new C1175ad(afVar, bVar), (String) this.f35133d.invoke(), C89170a.m154665a(this.f35134e)));
                    if (vm2.f31148b) {
                        C89219l.m154709a((Object) vm2, "");
                        return vm2;
                    }
                    vm2.mo20665a(new WeakReference<>(this.f35130a.f31000d));
                    AbstractC89171a aVar5 = this.f35135f;
                    if (aVar5 != null) {
                        dVar = (C12752d) aVar5.invoke();
                    } else {
                        dVar = null;
                    }
                    vm2.f31150d = dVar;
                    AbstractC89171a aVar6 = this.f35136g;
                    if (aVar6 != null) {
                        eVar = (C12753e) aVar6.invoke();
                    }
                    vm2.f31151e = eVar;
                    vm2.mo20661a((AbstractC12840g) this.f35137h.invoke(), this.f35138i);
                    C89219l.m154709a((Object) vm2, "");
                    C89219l.m154709a((Object) vm2, "");
                    return vm2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (C89219l.m154714a(iVar2, AbstractC12848i.C12851c.f31277a) || iVar2 == null) {
                return (VM) this.f35139j.mo20481a();
            } else {
                throw new IllegalArgumentException("Don't support this VMScope: " + this.f35131b + " there");
            }
        }

        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo23374a(Object obj, AbstractC89286i iVar) {
            return m26544a(iVar);
        }

        /* renamed from: a */
        private static AbstractC1174ac m26543a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }

        C14531a(T t, AbstractC12848i iVar, AbstractC89171a aVar, AbstractC89171a aVar2, AbstractC89277c cVar, AbstractC89171a aVar3, AbstractC89171a aVar4, AbstractC89171a aVar5, AbstractC89172b bVar, C14519e eVar) {
            this.f35130a = t;
            this.f35131b = iVar;
            this.f35132c = aVar;
            this.f35133d = aVar2;
            this.f35134e = cVar;
            this.f35135f = aVar3;
            this.f35136g = aVar4;
            this.f35137h = aVar5;
            this.f35138i = bVar;
            this.f35139j = eVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: T extends com.bytedance.assem.arch.b.u<? extends com.bytedance.tiktok.proxy.d> & com.bytedance.assem.arch.b.i<ITEM> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <VM extends AssemViewModel<S>, S extends AbstractC12853j, T extends AbstractC12693u<? extends AbstractC22876d> & AbstractC12658i<ITEM>, ITEM> AbstractC89248d<Object, VM> m26542a(T t, AbstractC89277c<VM> cVar, AbstractC12848i iVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends AbstractC12840g<S>> aVar2, AbstractC89171a<? extends C1175ad.AbstractC1177b> aVar3, AbstractC89172b<? super S, ? extends S> bVar, AbstractC89183m<? super S, ? super ITEM, ? extends S> mVar, AbstractC89183m<? super ITEM, ? super S, ? extends ITEM> mVar2, AbstractC89171a<C12752d> aVar4, AbstractC89171a<C12753e> aVar5) {
        C89219l.m154719c(t, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(bVar, "");
        C14519e eVar = new C14519e(t, cVar, aVar, aVar2, aVar3, bVar, mVar, mVar2, aVar4, aVar5);
        if (iVar == null || C89219l.m154714a(iVar, AbstractC12848i.C12851c.f31277a)) {
            C89219l.m154719c(eVar, "");
            t.f30895h.add(eVar);
        }
        return new C14531a(t, iVar, aVar3, aVar, cVar, aVar4, aVar5, aVar2, bVar, eVar);
    }
}
