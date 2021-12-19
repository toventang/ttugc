package com.bytedance.assem.arch.p794a;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.a.c */
public final class C12646c {
    static {
        Covode.recordClassIndex(14466);
    }

    /* renamed from: com.bytedance.assem.arch.a.c$a */
    public static final class C12647a implements AbstractC89244h<AbstractC12644a<OPT>> {

        /* renamed from: a */
        public AbstractC12644a<OPT> f30804a;

        /* renamed from: b */
        final /* synthetic */ AssemViewModel f30805b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f30806c;

        static {
            Covode.recordClassIndex(14467);
        }

        @Override // p4600h.AbstractC89244h
        public final boolean isInitialized() {
            return true;
        }

        @Override // p4600h.AbstractC89244h
        public final /* synthetic */ Object getValue() {
            AbstractC12644a<OPT> aVar = this.f30804a;
            if (aVar != null) {
                return aVar;
            }
            AbstractC12644a<OPT> a = C12645b.m22776a(this.f30806c);
            this.f30804a = a;
            this.f30805b.mo20660a(a);
            return a;
        }

        C12647a(AssemViewModel<S> assemViewModel, AbstractC89277c cVar) {
            this.f30805b = assemViewModel;
            this.f30806c = cVar;
        }
    }

    /* renamed from: com.bytedance.assem.arch.a.c$b */
    public static final class C12648b implements AbstractC89244h<AbstractC12644a<OPT>> {

        /* renamed from: a */
        public AbstractC12644a<OPT> f30807a;

        /* renamed from: b */
        final /* synthetic */ AssemViewModel f30808b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f30809c;

        static {
            Covode.recordClassIndex(14468);
        }

        @Override // p4600h.AbstractC89244h
        public final boolean isInitialized() {
            return true;
        }

        @Override // p4600h.AbstractC89244h
        public final /* synthetic */ Object getValue() {
            AbstractC12644a<OPT> aVar = this.f30807a;
            if (aVar != null) {
                return aVar;
            }
            AbstractC12644a<OPT> aVar2 = (AbstractC12644a) this.f30809c.invoke();
            this.f30807a = aVar2;
            this.f30808b.mo20660a(aVar2);
            return aVar2;
        }

        C12648b(AssemViewModel<S> assemViewModel, AbstractC89171a aVar) {
            this.f30808b = assemViewModel;
            this.f30809c = aVar;
        }
    }

    /* renamed from: a */
    public static final <S extends AbstractC12853j, OPT extends AbstractC12649d> AbstractC89244h<AbstractC12644a<OPT>> m22777a(AssemViewModel<S> assemViewModel, AbstractC89171a<? extends AbstractC12644a<OPT>> aVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(aVar, "");
        return new C12648b(assemViewModel, aVar);
    }

    /* renamed from: a */
    public static final <S extends AbstractC12853j, OPT extends AbstractC12649d> AbstractC89244h<AbstractC12644a<OPT>> m22778a(AssemViewModel<S> assemViewModel, AbstractC89277c<? extends AbstractC12644a<OPT>> cVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(cVar, "");
        return new C12647a(assemViewModel, cVar);
    }
}
