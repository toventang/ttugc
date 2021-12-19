package com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51755x;
import com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder */
public final class RecommendContactViewHolder extends JediSimpleViewHolder<RecommendContact> implements AbstractC33974au {

    /* renamed from: f */
    private final AbstractC89244h f118362f;

    /* renamed from: g */
    private final AbstractC51755x f118363g;

    static {
        Covode.recordClassIndex(60553);
    }

    /* renamed from: m */
    public final RecommendUserListViewModel mo63351m() {
        return (RecommendUserListViewModel) this.f118362f.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        this.f118363g.setEnterFrom((String) withState(mo63351m(), C51349c.f118368a));
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$a */
    public static final class C51347a extends AbstractC89220m implements AbstractC89171a<RecommendUserListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f118364a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f118365b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118366c;

        static {
            Covode.recordClassIndex(60554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51347a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f118364a = jediViewHolder;
            this.f118365b = cVar;
            this.f118366c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder.RecommendContactViewHolder.C51347a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_viewholder_RecommendContactViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95722x25a211ce(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$c */
    static final class C51349c extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C51349c f118368a = new C51349c();

        static {
            Covode.recordClassIndex(60556);
        }

        C51349c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return recommendUserListState2.getRecommendMobParams().f149955a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendContactViewHolder(AbstractC51755x xVar) {
        super(xVar);
        C89219l.m154721d(xVar, "");
        this.f118363g = xVar;
        AbstractC89277c a = C89204ab.m154669a(RecommendUserListViewModel.class);
        this.f118362f = C89250i.m154773a((AbstractC89171a) new C51347a(this, a, a));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(RecommendContact recommendContact) {
        RecommendContact recommendContact2 = recommendContact;
        C89219l.m154721d(recommendContact2, "");
        this.f118363g.mo87418a(recommendContact2, getAdapterPosition());
        this.f118363g.setDislikeListener(new C51348b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$b */
    static final class C51348b extends AbstractC89220m implements AbstractC89183m<RecommendContact, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendContactViewHolder f118367a;

        static {
            Covode.recordClassIndex(60555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51348b(RecommendContactViewHolder recommendContactViewHolder) {
            super(2);
            this.f118367a = recommendContactViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(RecommendContact recommendContact, Integer num) {
            RecommendContact recommendContact2 = recommendContact;
            num.intValue();
            C89219l.m154721d(recommendContact2, "");
            RecommendUserListViewModel m = this.f118367a.mo63351m();
            C89219l.m154721d(recommendContact2, "");
            if (recommendContact2 instanceof RecommendContact) {
                m.mo33689c(RecommendUserListViewModel.C66748b.f149942a);
            } else {
                AbstractC51500a aVar = m.f149941a;
                String uid = recommendContact2.getUid();
                C89219l.m154716b(uid, "");
                C89219l.m154716b(aVar.mo87014a(uid, recommendContact2.getSecUid()).mo142915a(RecommendUserListViewModel.C66749c.f149943a, RecommendUserListViewModel.C66750d.f149944a), "");
            }
            return C89391z.f203057a;
        }
    }
}
