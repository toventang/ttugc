package com.p2082ss.android.ugc.aweme.p4244z;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.AbstractC37367d;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.z.d */
public final class C81788d extends AbstractC2562j<AbstractC81785a> implements AbstractC20382b, AbstractC21566a, AbstractC81785a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f182896a = {new C89232y(C81788d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C81788d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C81788d.class, "commentAndQuestionStickerPanelApi", "getCommentAndQuestionStickerPanelApi()Lcom/ss/android/ugc/aweme/commentStickerPanel/CommentAndQuestionStickerPanelApi;", 0)};

    /* renamed from: b */
    public final AbstractC81785a f182897b = this;

    /* renamed from: c */
    public final AbstractC22186b f182898c;

    /* renamed from: d */
    private final C2564l<Boolean> f182899d = new C2564l<>(false);

    /* renamed from: e */
    private final AbstractC89248d f182900e = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: f */
    private final AbstractC89248d f182901f = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: g */
    private final AbstractC89248d f182902g = C21572a.m40504a(getDiContainer(), AbstractC37367d.class);

    /* renamed from: h */
    private C81794f f182903h;

    /* renamed from: i */
    private final C21582f f182904i;

    /* renamed from: j */
    private final CommentVideoModel f182905j;

    static {
        Covode.recordClassIndex(95195);
    }

    /* renamed from: b */
    private final AbstractC37367d m141661b() {
        return (AbstractC37367d) this.f182902g.mo23374a(this, f182896a[2]);
    }

    /* renamed from: a */
    public final ShortVideoContext mo125492a() {
        return (ShortVideoContext) this.f182901f.mo23374a(this, f182896a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC81785a getApiComponent() {
        return this.f182897b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f182904i;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (CommentUtils.isDataValid(this.f182905j)) {
            C81794f fVar = new C81794f(this.f182905j);
            this.f182903h = fVar;
            this.f182898c.mo36387a(R.id.dg9, fVar, "RecordCommentStickerScene");
            mo125490a(true);
        }
        this.f182899d.mo7036a(this, new C81789a(this));
        ((AbstractC14193m) this.f182900e.mo23374a(this, f182896a[0])).mo22908o().mo7036a(this, new C81790b(this));
        CommentAndQuestionAndQuestionStickerPanelViewModel f = m141661b().mo64946f();
        f.f88079l.observe(this, new C81791c(this, f));
        AbstractC88412b unused = selectSubscribe(m141661b().mo64946f(), C81793e.f182911a, new C20370ah(), new C81792d(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.z.d$a */
    static final class C81789a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C81788d f182906a;

        static {
            Covode.recordClassIndex(95196);
        }

        C81789a(C81788d dVar) {
            this.f182906a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C22226a.m41823a(this.f182906a.f182898c, "RecordCommentStickerScene");
            } else {
                C22226a.m41824b(this.f182906a.f182898c, "RecordCommentStickerScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.z.d$c */
    static final class C81791c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C81788d f182908a;

        /* renamed from: b */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f182909b;

        static {
            Covode.recordClassIndex(95198);
        }

        C81791c(C81788d dVar, CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            this.f182908a = dVar;
            this.f182909b = commentAndQuestionAndQuestionStickerPanelViewModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f182909b.mo64944b();
            C81788d dVar = this.f182908a;
            dVar.mo125493a(dVar.mo125492a().f155825j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a
    /* renamed from: a */
    public final void mo125490a(boolean z) {
        this.f182899d.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.z.d$b */
    static final class C81790b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C81788d f182907a;

        static {
            Covode.recordClassIndex(95197);
        }

        C81790b(C81788d dVar) {
            this.f182907a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14201t tVar = (C14201t) obj;
            if (tVar != null && tVar.f34476a.isEmpty() && tVar.f34477b == 0 && !this.f182907a.mo125492a().f155817b.f155653i && tVar.f34479d) {
                this.f182907a.mo125490a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo125493a(CommentVideoModel commentVideoModel) {
        if (this.f182903h == null) {
            this.f182903h = new C81794f(commentVideoModel);
        }
        C81794f fVar = this.f182903h;
        if (fVar != null) {
            if (this.f182898c.mo36421f(fVar)) {
                AbstractC22186b bVar = this.f182898c;
                C81794f fVar2 = this.f182903h;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                bVar.mo36400c(fVar2);
            }
            C81794f fVar3 = new C81794f(commentVideoModel);
            this.f182903h = fVar3;
            this.f182898c.mo36387a(R.id.dg9, fVar3, "RecordCommentStickerScene");
            mo125490a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.z.d$d */
    static final class C81792d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81788d f182910a;

        static {
            Covode.recordClassIndex(95199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81792d(C81788d dVar) {
            super(2);
            this.f182910a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20526p pVar) {
            C89219l.m154721d(iVar, "");
            if (pVar != null) {
                this.f182910a.mo125493a((CommentVideoModel) null);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    public C81788d(AbstractC22186b bVar, C21582f fVar, CommentVideoModel commentVideoModel) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f182898c = bVar;
        this.f182904i = fVar;
        this.f182905j = commentVideoModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
