package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel */
public final class UpvoteDetailPanelViewModel extends AssemViewModel<C79884l> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    private final AbstractC89244h f179013j = C89250i.m154773a((AbstractC89171a) C79800e.f179026a);

    /* renamed from: k */
    private final AbstractC89244h f179014k = C89250i.m154773a((AbstractC89171a) C79806k.f179035a);

    /* renamed from: l */
    private final AbstractC89244h f179015l = C89250i.m154773a((AbstractC89171a) C79799d.f179025a);

    static {
        Covode.recordClassIndex(93020);
    }

    /* renamed from: g */
    public final C88411a mo23342g() {
        return (C88411a) this.f179013j.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(142, new RunnableC90250g(UpvoteDetailPanelViewModel.class, "onUserBlocked", C63494a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: h */
    public final HashMap<String, C79796a> mo23343h() {
        return (HashMap) this.f179014k.getValue();
    }

    /* renamed from: i */
    public final HashSet<String> mo123375i() {
        return (HashSet) this.f179015l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$d */
    static final class C79799d extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C79799d f179025a = new C79799d();

        static {
            Covode.recordClassIndex(93024);
        }

        C79799d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$e */
    static final class C79800e extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C79800e f179026a = new C79800e();

        static {
            Covode.recordClassIndex(93025);
        }

        C79800e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$k */
    static final class C79806k extends AbstractC89220m implements AbstractC89171a<HashMap<String, C79796a>> {

        /* renamed from: a */
        public static final C79806k f179035a = new C79806k();

        static {
            Covode.recordClassIndex(93031);
        }

        C79806k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, C79796a> invoke() {
            return new HashMap();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: c */
    public final void mo20669c() {
        super.mo20669c();
        C80298cg.m139204a(this);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C79884l mo20674f() {
        return new C79884l(EnumC79894q.LOADING, true, 0.0f, new C12776a(false));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        mo23342g().mo142944a();
        mo23343h().clear();
        mo123375i().clear();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$a */
    public static final class C79796a {

        /* renamed from: a */
        public boolean f179016a = true;

        /* renamed from: b */
        public final C79030c f179017b;

        static {
            Covode.recordClassIndex(93021);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C79796a)) {
                return false;
            }
            C79796a aVar = (C79796a) obj;
            return this.f179016a == aVar.f179016a && C89219l.m154714a(this.f179017b, aVar.f179017b);
        }

        public final int hashCode() {
            boolean z = this.f179016a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            C79030c cVar = this.f179017b;
            return i4 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "TranslationStatus(isShowTranslation=" + this.f179016a + ", translationResult=" + this.f179017b + ")";
        }

        public C79796a(C79030c cVar) {
            C89219l.m154721d(cVar, "");
            this.f179017b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$j */
    public static final class C79805j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC79038a f179034a;

        static {
            Covode.recordClassIndex(93030);
        }

        public C79805j(AbstractC79038a aVar) {
            this.f179034a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC79038a aVar = this.f179034a;
            new Exception((Throwable) obj);
            aVar.mo85292a();
        }
    }

    @AbstractC90264r
    public final void onUserBlocked(C63494a aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a(C79802g.f179029a);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$c */
    public static final class C79798c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelViewModel f179022a;

        /* renamed from: b */
        final /* synthetic */ String f179023b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f179024c;

        static {
            Covode.recordClassIndex(93023);
        }

        public C79798c(UpvoteDetailPanelViewModel upvoteDetailPanelViewModel, String str, AbstractC89171a aVar) {
            this.f179022a = upvoteDetailPanelViewModel;
            this.f179023b = str;
            this.f179024c = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f179022a.mo123375i().remove(this.f179023b);
            this.f179024c.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$f */
    static final class C79801f extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {

        /* renamed from: a */
        final /* synthetic */ EnumC79894q f179027a;

        /* renamed from: b */
        final /* synthetic */ boolean f179028b;

        static {
            Covode.recordClassIndex(93026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79801f(EnumC79894q qVar, boolean z) {
            super(1);
            this.f179027a = qVar;
            this.f179028b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C79884l invoke(C79884l lVar) {
            C79884l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C79884l.m138655a(lVar2, this.f179027a, this.f179028b, 0.0f, null, 12);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$g */
    static final class C79802g extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {

        /* renamed from: a */
        public static final C79802g f179029a = new C79802g();

        static {
            Covode.recordClassIndex(93027);
        }

        C79802g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C79884l invoke(C79884l lVar) {
            C79884l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C79884l.m138655a(lVar2, null, false, 0.0f, new C12776a(true), 7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$h */
    static final class C79803h extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {

        /* renamed from: a */
        public static final C79803h f179030a = new C79803h();

        static {
            Covode.recordClassIndex(93028);
        }

        C79803h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C79884l invoke(C79884l lVar) {
            C79884l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C79884l.m138655a(lVar2, EnumC79894q.LOADING, true, 0.0f, new C12776a(true), 4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$l */
    static final class C79807l extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {

        /* renamed from: a */
        final /* synthetic */ float f179036a;

        static {
            Covode.recordClassIndex(93032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79807l(float f) {
            super(1);
            this.f179036a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C79884l invoke(C79884l lVar) {
            C79884l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C79884l.m138655a(lVar2, null, false, this.f179036a, null, 11);
        }
    }

    /* renamed from: a */
    public final boolean mo123374a(String str) {
        C89219l.m154721d(str, "");
        C79796a aVar = mo23343h().get(str);
        if (aVar == null || !aVar.f179016a) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$b */
    public static final class C79797b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelViewModel f179018a;

        /* renamed from: b */
        final /* synthetic */ String f179019b;

        /* renamed from: c */
        final /* synthetic */ C79714h f179020c;

        /* renamed from: d */
        final /* synthetic */ boolean f179021d;

        static {
            Covode.recordClassIndex(93022);
        }

        public C79797b(UpvoteDetailPanelViewModel upvoteDetailPanelViewModel, String str, C79714h hVar, boolean z) {
            this.f179018a = upvoteDetailPanelViewModel;
            this.f179019b = str;
            this.f179020c = hVar;
            this.f179021d = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            this.f179018a.mo123375i().remove(this.f179019b);
            this.f179020c.setUserLiked(this.f179021d);
            C79714h hVar = this.f179020c;
            int likeCount = hVar.getLikeCount();
            if (this.f179021d) {
                i = 1;
            } else {
                i = -1;
            }
            hVar.setLikeCount(likeCount + i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel$i */
    public static final class C79804i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelViewModel f179031a;

        /* renamed from: b */
        final /* synthetic */ String f179032b;

        /* renamed from: c */
        final /* synthetic */ AbstractC79038a f179033c;

        static {
            Covode.recordClassIndex(93029);
        }

        public C79804i(UpvoteDetailPanelViewModel upvoteDetailPanelViewModel, String str, AbstractC79038a aVar) {
            this.f179031a = upvoteDetailPanelViewModel;
            this.f179032b = str;
            this.f179033c = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79027a aVar = (C79027a) obj;
            C89219l.m154716b(aVar, "");
            List<C79030c> list = aVar.f177634a;
            if (list != null && !list.isEmpty()) {
                List<C79030c> list2 = aVar.f177634a;
                C89219l.m154716b(list2, "");
                C79030c cVar = (C79030c) C89070n.m154579f((List) list2);
                HashMap<String, C79796a> h = this.f179031a.mo23343h();
                String str = this.f179032b;
                C89219l.m154716b(cVar, "");
                h.put(str, new C79796a(cVar));
                this.f179033c.mo85296a(cVar);
            }
        }
    }
}
