package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37411l;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37426a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37429b;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37356c;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37358e;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37360g;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37363j;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37354a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37361h;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65412cv;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89376n;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel */
public final class CommentAndQuestionAndQuestionStickerPanelViewModel extends LifecycleAwareViewModel<CommentAndQuestionStickerPanelState> implements AbstractC37367d {

    /* renamed from: a */
    public final List<String> f88072a;

    /* renamed from: b */
    final Map<String, String> f88073b;

    /* renamed from: c */
    public EnumC37331a f88074c = EnumC37331a.SuggestTab;

    /* renamed from: d */
    public boolean f88075d;

    /* renamed from: e */
    CommentVideoModel f88076e;

    /* renamed from: f */
    public boolean f88077f;

    /* renamed from: g */
    public C1213t<Boolean> f88078g;

    /* renamed from: l */
    public final C1213t<Boolean> f88079l;

    /* renamed from: m */
    final C37429b f88080m;

    /* renamed from: n */
    public final C2564l<Object> f88081n;

    /* renamed from: o */
    public final C2564l<Object> f88082o;

    /* renamed from: p */
    public final C2564l<Object> f88083p;

    /* renamed from: q */
    public final C2564l<Object> f88084q;

    /* renamed from: r */
    public final C2564l<Object> f88085r;

    /* renamed from: s */
    public final List<AbstractC89171a<C89391z>> f88086s;

    /* renamed from: t */
    public final C1213t<Boolean> f88087t;

    /* renamed from: u */
    public final CommentVideoModel f88088u;

    /* renamed from: v */
    public final C37410k f88089v;

    /* renamed from: w */
    private final Map<EnumC37331a, List<Object>> f88090w;

    /* renamed from: x */
    private final AbstractC2565m<Boolean> f88091x;

    static {
        Covode.recordClassIndex(44708);
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: f */
    public final CommentAndQuestionAndQuestionStickerPanelViewModel mo64946f() {
        return this;
    }

    /* renamed from: a */
    public final boolean mo64943a(EnumC37331a aVar) {
        C89219l.m154721d(aVar, "");
        int i = C37366c.f88167c[aVar.ordinal()];
        if (i == 1) {
            return mo64949i();
        }
        if (i != 2) {
            return true;
        }
        return mo64948h();
    }

    /* renamed from: a */
    public final void mo64942a(String str, String str2) {
        Map<String, String> map;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String str3 = this.f88073b.get(str);
        if (str3 != null) {
            C37410k kVar = this.f88089v;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str2, "");
            C84425b a = kVar.mo65055a();
            if (a != null) {
                a.mo129406a("tab_name", str3);
                a.mo129406a("enter_method", str2);
                map = a.f188764a;
            } else {
                map = null;
            }
            C80322d.m139251a("change_reply_panel_tab", map);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: g */
    public final void mo64947g() {
        mo33689c(C37346p.f88110a);
    }

    /* renamed from: j */
    public final void mo64950j() {
        mo33689c(C37345o.f88109a);
    }

    /* renamed from: k */
    public final void mo64951k() {
        this.f88076e = null;
        this.f88077f = false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        C37426a.f88335e.mo6997a(this, this.f88091x);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new CommentAndQuestionStickerPanelState(null, null, null, null, null, 31, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        C37426a.f88335e.mo6998a(this.f88091x);
        super.onCleared();
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$a */
    public enum EnumC37331a {
        SuggestTab,
        FavoriteTab;

        static {
            Covode.recordClassIndex(44709);
        }

        public final String getTabName() {
            int i = C37365b.f88164a[ordinal()];
            if (i == 1) {
                return "recommend";
            }
            if (i == 2) {
                return "favorite";
            }
            throw new C89376n();
        }
    }

    /* renamed from: b */
    public final void mo64944b() {
        for (List<Object> list : this.f88090w.values()) {
            list.clear();
        }
        mo33689c(C37335e.f88096a);
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: h */
    public final boolean mo64948h() {
        if (!C37426a.m75470b() || !this.f88080m.mo65073b()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: i */
    public final boolean mo64949i() {
        if (!C37426a.m75469a() || !this.f88080m.mo65071a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: n */
    public final void mo64952n() {
        Map<String, String> map;
        C84425b a = this.f88089v.mo65055a();
        if (a != null) {
            map = a.f188764a;
        } else {
            map = null;
        }
        C80322d.m139251a("reply_panel_entrance_show", map);
    }

    /* renamed from: a */
    public final void mo64932a() {
        if (C63244g.m114602a().mo73255A().mo93903b()) {
            C37336f fVar = new C37336f(this);
            C89219l.m154721d(fVar, "");
            CommentStickerPanelRequestApi.m75464a(C37426a.f88331a, 0, 0, new C37426a.C37427a(fVar), EnumC37354a.Both.getValue(), 3);
            if (C65412cv.m117131e()) {
                C37429b bVar = this.f88080m;
                C37429b.C37430a aVar = new C37429b.C37430a(bVar, new C37337g(this));
                QuestionStickerPanelRequestApi questionStickerPanelRequestApi = bVar.f88342a;
                if (questionStickerPanelRequestApi != null) {
                    questionStickerPanelRequestApi.mo65068a(0, aVar, EnumC37361h.All.ordinal());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64933a(int i) {
        this.f88089v.mo65056a(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$d */
    static final class C37334d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88095a;

        static {
            Covode.recordClassIndex(44712);
        }

        C37334d(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            this.f88095a = commentAndQuestionAndQuestionStickerPanelViewModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f88095a.f88087t.setValue(true);
        }
    }

    /* renamed from: a */
    public final void mo64934a(CommentVideoModel commentVideoModel) {
        this.f88076e = commentVideoModel;
        this.f88077f = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$b */
    static final class C37332b extends AbstractC89220m implements AbstractC89172b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ CommentVideoModel f88093a;

        static {
            Covode.recordClassIndex(44710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37332b(CommentVideoModel commentVideoModel) {
            super(1);
            this.f88093a = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            C89219l.m154721d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, new C20391d(this.f88093a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$c */
    static final class C37333c extends AbstractC89220m implements AbstractC89172b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ QaStruct f88094a;

        static {
            Covode.recordClassIndex(44711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37333c(QaStruct qaStruct) {
            super(1);
            this.f88094a = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            C89219l.m154721d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, null, new C20391d(this.f88094a), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$e */
    static final class C37335e extends AbstractC89220m implements AbstractC89172b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a */
        public static final C37335e f88096a = new C37335e();

        static {
            Covode.recordClassIndex(44713);
        }

        C37335e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            C89219l.m154721d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, null, null, new AbstractC23517a.C23518a(), 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$f */
    static final /* synthetic */ class C37336f extends C89217j implements AbstractC89172b<C37358e, C89391z> {
        static {
            Covode.recordClassIndex(44714);
        }

        C37336f(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            super(1, commentAndQuestionAndQuestionStickerPanelViewModel, CommentAndQuestionAndQuestionStickerPanelViewModel.class, "commentRequestSuccessCallback", "commentRequestSuccessCallback(Lcom/ss/android/ugc/aweme/commentStickerPanel/model/CommentStickerPanelResponse;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37358e eVar) {
            C37358e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            ((CommentAndQuestionAndQuestionStickerPanelViewModel) this.receiver).mo64937a(eVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$g */
    static final /* synthetic */ class C37337g extends C89217j implements AbstractC89172b<C37363j, C89391z> {
        static {
            Covode.recordClassIndex(44715);
        }

        C37337g(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            super(1, commentAndQuestionAndQuestionStickerPanelViewModel, CommentAndQuestionAndQuestionStickerPanelViewModel.class, "questionRequestSuccessCallback", "questionRequestSuccessCallback(Lcom/ss/android/ugc/aweme/commentStickerPanel/model/QuestionStickerPanelResponseModel;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37363j jVar) {
            C37363j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            ((CommentAndQuestionAndQuestionStickerPanelViewModel) this.receiver).mo64938a(jVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$h */
    static final class C37338h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88097a;

        static {
            Covode.recordClassIndex(44716);
        }

        C37338h(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            this.f88097a = commentAndQuestionAndQuestionStickerPanelViewModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Iterator<T> it = this.f88097a.f88086s.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            this.f88097a.f88086s.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$i */
    static final class C37339i extends AbstractC89220m implements AbstractC89172b<C37363j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88098a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88099b;

        static {
            Covode.recordClassIndex(44717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37339i(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, AbstractC89171a aVar) {
            super(1);
            this.f88098a = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.f88099b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37363j jVar) {
            C37363j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f88099b.invoke();
            this.f88098a.mo64938a(jVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$j */
    static final class C37340j extends AbstractC89220m implements AbstractC89172b<C37363j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88100a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88101b;

        static {
            Covode.recordClassIndex(44718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37340j(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, AbstractC89171a aVar) {
            super(1);
            this.f88100a = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.f88101b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37363j jVar) {
            C37363j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f88101b.invoke();
            this.f88100a.mo64938a(jVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$k */
    static final class C37341k extends AbstractC89220m implements AbstractC89172b<C37363j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88102a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88103b;

        static {
            Covode.recordClassIndex(44719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37341k(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, AbstractC89171a aVar) {
            super(1);
            this.f88102a = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.f88103b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37363j jVar) {
            C37363j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f88103b.invoke();
            this.f88102a.mo64938a(jVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$l */
    static final class C37342l extends AbstractC89220m implements AbstractC89172b<C37358e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88104a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88105b;

        static {
            Covode.recordClassIndex(44720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37342l(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, AbstractC89171a aVar) {
            super(1);
            this.f88104a = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.f88105b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37358e eVar) {
            C37358e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            this.f88105b.invoke();
            this.f88104a.mo64937a(eVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$m */
    static final class C37343m extends AbstractC89220m implements AbstractC89172b<C37358e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88106a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88107b;

        static {
            Covode.recordClassIndex(44721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37343m(CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, AbstractC89171a aVar) {
            super(1);
            this.f88106a = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.f88107b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C37358e eVar) {
            C37358e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            this.f88107b.invoke();
            this.f88106a.mo64937a(eVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$n */
    public static final class C37344n extends AbstractC89220m implements AbstractC89172b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a */
        public static final C37344n f88108a = new C37344n();

        static {
            Covode.recordClassIndex(44722);
        }

        C37344n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            C89219l.m154721d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, new C20526p(), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$o */
    static final class C37345o extends AbstractC89220m implements AbstractC89172b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a */
        public static final C37345o f88109a = new C37345o();

        static {
            Covode.recordClassIndex(44723);
        }

        C37345o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            C89219l.m154721d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, new C20521k(true), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel$p */
    static final class C37346p extends AbstractC89220m implements AbstractC89172b<CommentAndQuestionStickerPanelState, CommentAndQuestionStickerPanelState> {

        /* renamed from: a */
        public static final C37346p f88110a = new C37346p();

        static {
            Covode.recordClassIndex(44724);
        }

        C37346p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CommentAndQuestionStickerPanelState invoke(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState) {
            CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState2 = commentAndQuestionStickerPanelState;
            C89219l.m154721d(commentAndQuestionStickerPanelState2, "");
            return CommentAndQuestionStickerPanelState.copy$default(commentAndQuestionStickerPanelState2, null, null, null, null, new AbstractC23517a.C23519b(), 15, null);
        }
    }

    /* renamed from: a */
    public final void mo64940a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f88086s.add(aVar);
    }

    /* renamed from: a */
    public final void mo64937a(C37358e eVar) {
        List<C37356c> list = eVar.f88148b;
        if (list != null) {
            for (C37356c cVar : list) {
                Integer num = cVar.f88143e;
                if (num != null) {
                    if (num.intValue() == 1) {
                        this.f88084q.mo7019b(cVar);
                    } else if (num.intValue() == 2) {
                        this.f88085r.mo7019b(cVar);
                    }
                }
            }
            this.f88087t.setValue(true);
        }
    }

    /* renamed from: b */
    public final void mo64945b(CommentVideoModel commentVideoModel) {
        Map<String, String> map;
        if (commentVideoModel != null) {
            C37410k kVar = this.f88089v;
            String tabName = this.f88074c.getTabName();
            C89219l.m154721d(commentVideoModel, "");
            C89219l.m154721d(tabName, "");
            C84425b a = kVar.mo65055a();
            if (a != null) {
                a.mo129406a("tab_name", tabName);
                a.mo129406a("comment_id", commentVideoModel.getCommentId());
                a.mo129406a("comment_user_id", commentVideoModel.getUserId());
                a.mo129406a("group_id", commentVideoModel.getAwemeId());
                a.mo129406a("author_id", commentVideoModel.getAwemeUserId());
                map = a.f188764a;
            } else {
                map = null;
            }
            C80322d.m139251a("reply_comment_show", map);
        }
    }

    /* renamed from: a */
    public final void mo64938a(C37363j jVar) {
        List<C37360g> list = jVar.f88160b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.f88150a == EnumC37361h.QuestionCollectionINVITATION.ordinal()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            this.f88081n.mo7019b(arrayList2.get(0));
        }
        List<C37360g> list2 = jVar.f88160b;
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : list2) {
            if (t2.f88150a == EnumC37361h.QuestionCollectionFAVORITE.ordinal()) {
                arrayList3.add(t2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            this.f88082o.mo7019b(arrayList4.get(0));
        }
        List<C37360g> list3 = jVar.f88160b;
        ArrayList arrayList5 = new ArrayList();
        for (T t3 : list3) {
            if (t3.f88150a == EnumC37361h.QuestionCollectionRECOMMEND.ordinal()) {
                arrayList5.add(t3);
            }
        }
        ArrayList arrayList6 = arrayList5;
        if (!arrayList6.isEmpty()) {
            this.f88083p.mo7019b(arrayList6.get(0));
        }
    }

    /* renamed from: a */
    public final void mo64935a(CommentVideoModel commentVideoModel, String str) {
        Map<String, String> map;
        C89219l.m154721d(commentVideoModel, "");
        C89219l.m154721d(str, "");
        String str2 = this.f88073b.get(str);
        if (str2 != null) {
            C37410k kVar = this.f88089v;
            C89219l.m154721d(commentVideoModel, "");
            C89219l.m154721d(str2, "");
            C84425b a = kVar.mo65055a();
            if (a != null) {
                a.mo129406a("tab_name", str2);
                a.mo129406a("comment_id", commentVideoModel.getCommentId());
                a.mo129406a("comment_user_id", commentVideoModel.getUserId());
                a.mo129406a("group_id", commentVideoModel.getAwemeId());
                a.mo129406a("author_id", commentVideoModel.getAwemeUserId());
                map = a.f188764a;
            } else {
                map = null;
            }
            C80322d.m139251a("replace_sticker_show", map);
        }
    }

    /* renamed from: a */
    public final void mo64939a(QaStruct qaStruct, C37411l.EnumC37412a aVar) {
        String str;
        Map<String, String> map;
        C89219l.m154721d(aVar, "");
        if (qaStruct != null) {
            int i = C37366c.f88168d[aVar.ordinal()];
            if (i == 1) {
                str = "qa_recommendation_show";
            } else if (i == 2) {
                str = "qa_invitation_show";
            } else {
                return;
            }
            C37410k kVar = this.f88089v;
            C89219l.m154721d(str, "");
            C84425b a = kVar.mo65055a();
            if (a != null) {
                a.mo129406a("question_id", String.valueOf(qaStruct.getQuestionId()));
                map = a.f188764a;
            } else {
                map = null;
            }
            C80322d.m139251a(str, map);
        }
    }

    /* renamed from: a */
    public final void mo64941a(String str, int i) {
        C89219l.m154721d(str, "");
        this.f88089v.mo65057a(str, i);
    }

    public CommentAndQuestionAndQuestionStickerPanelViewModel(Context context, CommentVideoModel commentVideoModel, C37410k kVar) {
        boolean z;
        C89219l.m154721d(context, "");
        C89219l.m154721d(kVar, "");
        this.f88088u = commentVideoModel;
        this.f88089v = kVar;
        List<String> b = C89070n.m154522b(context.getString(R.string.f3q), context.getString(R.string.f0k));
        this.f88072a = b;
        this.f88073b = C89041ag.m154421a(C89387v.m154943a(b.get(0), "recommend"), C89387v.m154943a(b.get(1), "favorite"));
        if (commentVideoModel != null) {
            z = true;
        } else {
            z = false;
        }
        this.f88077f = z;
        this.f88078g = new C1213t<>();
        this.f88079l = new C1213t<>();
        C37429b bVar = new C37429b();
        this.f88080m = bVar;
        this.f88081n = new C2564l<>(bVar.f88343b);
        this.f88082o = new C2564l<>(bVar.f88345d);
        this.f88083p = new C2564l<>(bVar.f88344c);
        this.f88084q = new C2564l<>(C37426a.f88333c);
        this.f88085r = new C2564l<>(C37426a.f88332b);
        this.f88086s = new ArrayList();
        this.f88087t = new C1213t<>();
        this.f88091x = new C37334d(this);
        this.f88076e = commentVideoModel;
        this.f88090w = C89041ag.m154427b(C89387v.m154943a(EnumC37331a.SuggestTab, new ArrayList()), C89387v.m154943a(EnumC37331a.FavoriteTab, new ArrayList()));
    }

    /* renamed from: a */
    public final void mo64936a(CommentVideoModel commentVideoModel, String str, String str2) {
        Map<String, String> map;
        C89219l.m154721d(commentVideoModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String str3 = this.f88073b.get(str);
        if (str3 != null) {
            C37410k kVar = this.f88089v;
            C89219l.m154721d(commentVideoModel, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str2, "");
            C84425b a = kVar.mo65055a();
            if (a != null) {
                a.mo129406a("target", str2);
                a.mo129406a("tab_name", str3);
                a.mo129406a("comment_id", commentVideoModel.getCommentId());
                a.mo129406a("comment_user_id", commentVideoModel.getUserId());
                a.mo129406a("group_id", commentVideoModel.getAwemeId());
                a.mo129406a("author_id", commentVideoModel.getAwemeUserId());
                map = a.f188764a;
            } else {
                map = null;
            }
            C80322d.m139251a("replace_sticker_confirm", map);
        }
    }
}
