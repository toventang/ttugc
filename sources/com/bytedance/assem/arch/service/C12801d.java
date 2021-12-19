package com.bytedance.assem.arch.service;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.assem.arch.service.d */
public final class C12801d {
    static {
        Covode.recordClassIndex(14632);
    }

    /* renamed from: com.bytedance.assem.arch.service.d$a */
    static final class C12802a extends AbstractC89220m implements AbstractC89172b<DATA, C12793o<A>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31137a;

        static {
            Covode.recordClassIndex(14633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12802a(AbstractC89290k kVar) {
            super(1);
            this.f31137a = kVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12793o(this.f31137a.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.arch.service.d$c */
    static final class C12804c extends AbstractC89220m implements AbstractC89172b<DATA, C12794p<A, B>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31140a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89290k f31141b;

        static {
            Covode.recordClassIndex(14635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12804c(AbstractC89290k kVar, AbstractC89290k kVar2) {
            super(1);
            this.f31140a = kVar;
            this.f31141b = kVar2;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12794p(this.f31140a.get(obj), this.f31141b.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.arch.service.d$b */
    static final class C12803b extends AbstractC89220m implements AbstractC89172b<C12793o<A>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f31138a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f31139b;

        static {
            Covode.recordClassIndex(14634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12803b(C89233z.C89238e eVar, AbstractC89172b bVar) {
            super(1);
            this.f31138a = eVar;
            this.f31139b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            T t = (T) ((C12793o) obj);
            C89219l.m154719c(t, "");
            if (!C89219l.m154714a((Object) t, (Object) this.f31138a.element)) {
                AbstractC89172b bVar = this.f31139b;
                if (bVar != null) {
                    bVar.invoke(t.f31117a);
                }
                this.f31138a.element = t;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.service.d$d */
    static final class C12805d extends AbstractC89220m implements AbstractC89172b<C12794p<A, B>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f31142a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f31143b;

        static {
            Covode.recordClassIndex(14636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12805d(C89233z.C89238e eVar, AbstractC89183m mVar) {
            super(1);
            this.f31142a = eVar;
            this.f31143b = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            T t = (T) ((C12794p) obj);
            C89219l.m154719c(t, "");
            if (!C89219l.m154714a((Object) t, (Object) this.f31142a.element)) {
                AbstractC89183m mVar = this.f31143b;
                if (mVar != null) {
                    mVar.invoke(t.f31118a, t.f31119b);
                }
                this.f31142a.element = t;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public static final <SERVICE extends AbstractC12799b<DATA>, DATA extends AbstractC12798a> SERVICE m23025c(AbstractC12748a aVar, AbstractC89277c<SERVICE> cVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        return (SERVICE) aVar.bD_().f30985g.mo20614b(C89170a.m154665a(cVar), (String) null);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC12800c m23028e(AbstractC12748a aVar, AbstractC89277c cVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        return aVar.bD_().f30985g.mo20608a(C89170a.m154665a(cVar), (String) null);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC12798a m23029f(AbstractC12748a aVar, AbstractC89277c cVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        if (m23025c(aVar, cVar) != null) {
            return aVar.bD_().f30985g.mo20607a(C89170a.m154665a(cVar));
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC12798a m23016a(AssemViewModel assemViewModel, AbstractC89277c cVar) {
        C12753e eVar;
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(cVar, "");
        C12753e eVar2 = assemViewModel.f31151e;
        if (eVar2 == null || eVar2.mo20614b(C89170a.m154665a(cVar), (String) null) == null || (eVar = assemViewModel.f31151e) == null) {
            return null;
        }
        return eVar.mo20607a(C89170a.m154665a(cVar));
    }

    /* renamed from: b */
    public static final <SERVICE extends AbstractC12800c> SERVICE m23023b(AbstractC12748a aVar, AbstractC89277c<SERVICE> cVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        SERVICE service = (SERVICE) aVar.bD_().f30985g.mo20608a(C89170a.m154665a(cVar), (String) null);
        if (service != null) {
            return service;
        }
        throw new IllegalArgumentException("No such service or has not been registered.".toString());
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC12799b m23017a(Fragment fragment, AbstractC89277c cVar) {
        AbstractC12799b b;
        C89219l.m154719c(fragment, "");
        C89219l.m154719c(cVar, "");
        AbstractC1174ac a = C1181ae.m3881a(fragment.requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        C12753e c = ((Assembler) a).mo20584c(fragment);
        if (c != null && (b = c.mo20614b(C89170a.m154665a(cVar), (String) null)) != null) {
            return b;
        }
        throw new IllegalArgumentException("No such service or has not been registered.".toString());
    }

    /* renamed from: b */
    public static final <SERVICE extends AbstractC12799b<DATA>, DATA extends AbstractC12798a> SERVICE m23022b(Fragment fragment, AbstractC89277c<SERVICE> cVar) {
        ActivityC0945e activity;
        C89219l.m154719c(fragment, "");
        C89219l.m154719c(cVar, "");
        if (fragment.isAdded() && fragment.getActivity() != null && ((activity = fragment.getActivity()) == null || !activity.isFinishing())) {
            ActivityC0945e activity2 = fragment.getActivity();
            if (activity2 == null) {
                C89219l.m154707a();
            }
            AbstractC1174ac a = C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
            C89219l.m154709a((Object) a, "");
            C12753e c = ((Assembler) a).mo20584c(fragment);
            if (c != null) {
                return (SERVICE) c.mo20614b(C89170a.m154665a(cVar), (String) null);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC12800c m23027d(Fragment fragment, AbstractC89277c cVar) {
        ActivityC0945e activity;
        C89219l.m154719c(fragment, "");
        C89219l.m154719c(cVar, "");
        if (fragment.isAdded() && fragment.getActivity() != null && ((activity = fragment.getActivity()) == null || !activity.isFinishing())) {
            ActivityC0945e activity2 = fragment.getActivity();
            if (activity2 == null) {
                C89219l.m154707a();
            }
            AbstractC1174ac a = C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
            C89219l.m154709a((Object) a, "");
            C12753e c = ((Assembler) a).mo20584c(fragment);
            if (c != null) {
                return c.mo20608a(C89170a.m154665a(cVar), (String) null);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final <SERVICE extends AbstractC12799b<DATA>, DATA extends AbstractC12798a> SERVICE m23018a(AbstractC12748a aVar, AbstractC89277c<SERVICE> cVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        SERVICE service = (SERVICE) aVar.bD_().f30985g.mo20614b(C89170a.m154665a(cVar), (String) null);
        if (service != null) {
            return service;
        }
        throw new IllegalArgumentException("No such service or has not been registered.".toString());
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC12800c m23019a(ActivityC0945e eVar, AbstractC89277c cVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(cVar, "");
        if (eVar.isFinishing()) {
            return null;
        }
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
        C89219l.m154709a((Object) a, "");
        C12753e c = ((Assembler) a).mo20584c(eVar);
        if (c != null) {
            return c.mo20608a(C89170a.m154665a(cVar), (String) null);
        }
        return null;
    }

    /* renamed from: a */
    public static final <DATA extends AbstractC12798a, A> void m23020a(AbstractC12748a aVar, AbstractC89277c<? extends AbstractC12799b<DATA>> cVar, AbstractC89290k<DATA, ? extends A> kVar, AbstractC89172b<? super A, C89391z> bVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(kVar, "");
        C12753e eVar = aVar.bD_().f30985g;
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        eVar.mo20610a(aVar, C89170a.m154665a(cVar), new C12802a(kVar), new C12803b(eVar2, bVar));
    }

    /* renamed from: a */
    public static final <DATA extends AbstractC12798a, A, B> void m23021a(AbstractC12748a aVar, AbstractC89277c<? extends AbstractC12799b<DATA>> cVar, AbstractC89290k<DATA, ? extends A> kVar, AbstractC89290k<DATA, ? extends B> kVar2, AbstractC89183m<? super A, ? super B, C89391z> mVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C12753e eVar = aVar.bD_().f30985g;
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        eVar.mo20610a(aVar, C89170a.m154665a(cVar), new C12804c(kVar, kVar2), new C12805d(eVar2, mVar));
    }
}
