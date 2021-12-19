package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel */
public final class QnaSelectedPageViewModel extends AssemViewModel<C66362h> {
    static {
        Covode.recordClassIndex(77869);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C66362h mo20674f() {
        return new C66362h();
    }

    /* renamed from: a */
    public final void mo105258a(AbstractC66098a aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a(new C66354a(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel$a */
    static final class C66354a extends AbstractC89220m implements AbstractC89172b<C66362h, C66362h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC66098a f149203a;

        static {
            Covode.recordClassIndex(77870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66354a(AbstractC66098a aVar) {
            super(1);
            this.f149203a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66362h invoke(C66362h hVar) {
            C89219l.m154721d(hVar, "");
            return new C66362h(new C12776a(this.f149203a));
        }
    }
}
