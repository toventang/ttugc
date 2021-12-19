package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37407j;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a */
public class C37347a extends AbstractC23520b<CommentAndQuestionAndQuestionStickerPanelViewModel> implements AbstractC20382b, AbstractC21566a, AbstractC37367d {

    /* renamed from: a */
    public final CommentVideoModel f88113a;

    /* renamed from: b */
    public final C37410k f88114b;

    /* renamed from: c */
    private final AbstractC89244h f88115c = C89250i.m154773a((AbstractC89171a) new C37352c(this));

    /* renamed from: d */
    private final AbstractC89244h f88116d = C89250i.m154773a((AbstractC89171a) new C37351b(this));

    /* renamed from: e */
    private final AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> f88117e = new C37353d(this);

    /* renamed from: f */
    private final C21582f f88118f;

    /* renamed from: k */
    private final AbstractC22186b f88119k;

    /* renamed from: l */
    private final int f88120l;

    static {
        Covode.recordClassIndex(44727);
    }

    /* renamed from: o */
    private final CommentAndQuestionAndQuestionStickerPanelViewModel mo128484o() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f88116d.getValue();
    }

    /* renamed from: a */
    public final C37375g mo64974a() {
        return (C37375g) this.f88115c.getValue();
    }

    /* renamed from: a */
    public void mo64976a(QaStruct qaStruct) {
        C89219l.m154721d(qaStruct, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: n */
    public final void mo64952n() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> mo23031b() {
        return this.f88117e;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public AbstractC22186b mo23034e() {
        return this.f88119k;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: g */
    public final void mo64947g() {
        mo23032c();
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f88118f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo64977m() {
        return this.f88120l;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a$c */
    static final class C37352c extends AbstractC89220m implements AbstractC89171a<C37375g> {

        /* renamed from: a */
        final /* synthetic */ C37347a f88128a;

        static {
            Covode.recordClassIndex(44732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37352c(C37347a aVar) {
            super(0);
            this.f88128a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C37375g invoke() {
            return new C37375g(this.f88128a.getDiContainer());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public void mo23033d() {
        mo64974a().mo65008a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: f */
    public final CommentAndQuestionAndQuestionStickerPanelViewModel mo64946f() {
        CommentAndQuestionAndQuestionStickerPanelViewModel o = mo128484o();
        C89219l.m154716b(o, "");
        return o;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: h */
    public final boolean mo64948h() {
        return mo128484o().mo64948h();
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d
    /* renamed from: i */
    public final boolean mo64949i() {
        return mo128484o().mo64949i();
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a$b */
    static final class C37351b extends AbstractC89220m implements AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C37347a f88127a;

        static {
            Covode.recordClassIndex(44731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37351b(C37347a aVar) {
            super(0);
            this.f88127a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            return C20531t.m38716a(C22228c.m41832b(this.f88127a.mo23034e())).mo33800a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a$d */
    static final class C37353d extends AbstractC89220m implements AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C37347a f88129a;

        static {
            Covode.recordClassIndex(44733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37353d(C37347a aVar) {
            super(0);
            this.f88129a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            return new CommentAndQuestionAndQuestionStickerPanelViewModel(C2556g.m7474c(this.f88129a), this.f88129a.f88113a, this.f88129a.f88114b);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public void mo23032c() {
        if (!mo23034e().mo36421f(mo64974a())) {
            mo23034e().mo36387a(mo64977m(), mo64974a(), "CommentStickerPanelScene");
        }
        mo64974a().mo65008a(true);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a$a */
    static final class C37348a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f88121a;

        /* renamed from: b */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f88122b;

        /* renamed from: c */
        final /* synthetic */ CommentVideoModel f88123c;

        /* renamed from: d */
        final /* synthetic */ int f88124d = 4;

        static {
            Covode.recordClassIndex(44728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37348a(Context context, CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, CommentVideoModel commentVideoModel) {
            super(1);
            this.f88121a = context;
            this.f88122b = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.f88123c = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f88121a.getString(R.string.f0x);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a.C37348a.C373491 */

                /* renamed from: a */
                final /* synthetic */ C37348a f88125a;

                static {
                    Covode.recordClassIndex(44729);
                }

                {
                    this.f88125a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88125a.f88122b;
                    commentAndQuestionAndQuestionStickerPanelViewModel.mo64934a(this.f88125a.f88123c);
                    commentAndQuestionAndQuestionStickerPanelViewModel.mo64950j();
                    commentAndQuestionAndQuestionStickerPanelViewModel.mo64941a("replace", this.f88125a.f88124d);
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f88121a.getString(R.string.f0y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a.C37348a.C373502 */

                /* renamed from: a */
                final /* synthetic */ C37348a f88126a;

                static {
                    Covode.recordClassIndex(44730);
                }

                {
                    this.f88126a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f88126a.f88122b.mo64941a("cancel", this.f88126a.f88124d);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public void mo64975a(CommentVideoModel commentVideoModel) {
        C89219l.m154721d(commentVideoModel, "");
        CommentAndQuestionAndQuestionStickerPanelViewModel a = mo64974a().mo65007a();
        if (!a.f88077f || !C37407j.C37408a.m75450a().getBoolean("comment_panel_first_replace", true)) {
            a.mo64934a(commentVideoModel);
            a.mo64950j();
            return;
        }
        C37407j.C37408a.m75450a().storeBoolean("comment_panel_first_replace", false);
        Context c = C2556g.m7474c(this);
        a.mo64933a(4);
        C23028c.m43435a(new C23023b(C2556g.m7474c(this)).mo37411b(c.getString(R.string.f11)).mo37413d(c.getString(R.string.f0z)), new C37348a(c, a, commentVideoModel)).mo37405a().mo37396b().show();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public C37347a(C21582f fVar, AbstractC22186b bVar, int i, CommentVideoModel commentVideoModel, C37410k kVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(kVar, "");
        this.f88118f = fVar;
        this.f88119k = bVar;
        this.f88120l = i;
        this.f88113a = commentVideoModel;
        this.f88114b = kVar;
    }
}
