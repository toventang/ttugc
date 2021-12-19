package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.p3646d.C66043g;
import com.p2082ss.android.ugc.aweme.question.model.C66575a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel */
public final class QnaCreationViewModel extends AssemViewModel<C66361g> {

    /* renamed from: j */
    public final C66043g f149187j = new C66043g();

    static {
        Covode.recordClassIndex(77862);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C66361g mo20674f() {
        return new C66361g();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel$a */
    public static final class C66349a extends AbstractC89220m implements AbstractC89172b<C66361g, C66361g> {

        /* renamed from: a */
        public static final C66349a f149188a = new C66349a();

        static {
            Covode.recordClassIndex(77863);
        }

        C66349a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66361g invoke(C66361g gVar) {
            C89219l.m154721d(gVar, "");
            return C66361g.m118020a(new C12791m(), EnumC66359e.PUBLISH_START);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel$b */
    public static final class C66350b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QnaCreationViewModel f149189a;

        static {
            Covode.recordClassIndex(77864);
        }

        public C66350b(QnaCreationViewModel qnaCreationViewModel) {
            this.f149189a = qnaCreationViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C66575a aVar = (C66575a) obj;
            QnaCreationViewModel qnaCreationViewModel = this.f149189a;
            C89219l.m154716b(aVar, "");
            qnaCreationViewModel.mo20662a(new C66353e(aVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel$c */
    public static final class C66351c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QnaCreationViewModel f149190a;

        static {
            Covode.recordClassIndex(77865);
        }

        public C66351c(QnaCreationViewModel qnaCreationViewModel) {
            this.f149190a = qnaCreationViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            QnaCreationViewModel qnaCreationViewModel = this.f149190a;
            C89219l.m154716b(th, "");
            qnaCreationViewModel.mo20662a(new C66352d(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel$d */
    static final class C66352d extends AbstractC89220m implements AbstractC89172b<C66361g, C66361g> {

        /* renamed from: a */
        final /* synthetic */ Throwable f149191a;

        static {
            Covode.recordClassIndex(77866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66352d(Throwable th) {
            super(1);
            this.f149191a = th;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66361g invoke(C66361g gVar) {
            C89219l.m154721d(gVar, "");
            return C66361g.m118020a(new C12785h(this.f149191a), EnumC66359e.PUBLISH_FAILED);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel$e */
    static final class C66353e extends AbstractC89220m implements AbstractC89172b<C66361g, C66361g> {

        /* renamed from: a */
        final /* synthetic */ C66575a f149192a;

        static {
            Covode.recordClassIndex(77867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66353e(C66575a aVar) {
            super(1);
            this.f149192a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C66361g invoke(C66361g gVar) {
            C89219l.m154721d(gVar, "");
            return C66361g.m118020a(new C12792n(this.f149192a), EnumC66359e.PUBLISH_SUCCEED);
        }
    }

    /* renamed from: a */
    public static String m117998a(List<? extends User> list) {
        ArrayList arrayList;
        C27910f fVar = new C27910f();
        if (list != null) {
            arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String uid = it.next().getUid();
                C89219l.m154716b(uid, "");
                arrayList.add(C89361p.m154865g(uid));
            }
        } else {
            arrayList = null;
        }
        return fVar.mo46674b(arrayList);
    }
}
