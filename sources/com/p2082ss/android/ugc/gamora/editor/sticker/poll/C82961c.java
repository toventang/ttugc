package com.p2082ss.android.ugc.gamora.editor.sticker.poll;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.C71232b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.VESize;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c */
public final class C82961c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185378a = {new C89232y(C82961c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C89232y(C82961c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82961c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e */
    public static final C82963b f185379e = new C82963b((byte) 0);

    /* renamed from: b */
    public EditStickerViewModel f185380b;

    /* renamed from: c */
    final AbstractC89244h f185381c = C89250i.m154773a((AbstractC89171a) new C82964c(this));

    /* renamed from: d */
    final AbstractC89248d f185382d = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: f */
    private final AbstractC89248d f185383f = C21572a.m40504a(getDiContainer(), AbstractC14552j.class);

    /* renamed from: g */
    private EditPollStickerViewModel f185384g;

    /* renamed from: h */
    private final AbstractC89248d f185385h = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i */
    private final AbstractC89244h f185386i = C89250i.m154773a((AbstractC89171a) new C82972j(this));

    /* renamed from: j */
    private final AbstractC89244h f185387j = C89250i.m154774a(EnumC89331m.NONE, new C82962a(this));

    /* renamed from: k */
    private final AbstractC89244h f185388k = C89250i.m154773a((AbstractC89171a) new C82973k(this));

    /* renamed from: l */
    private final PollingStickerLayout f185389l;

    /* renamed from: t */
    private final C21582f f185390t;

    static {
        Covode.recordClassIndex(96824);
    }

    /* renamed from: C */
    private final AbstractC14552j m143252C() {
        return (AbstractC14552j) this.f185383f.mo23374a(this, f185378a[0]);
    }

    /* renamed from: D */
    private final C14544f m143253D() {
        return (C14544f) this.f185386i.getValue();
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo128033a() {
        return (VideoPublishEditModel) this.f185385h.mo23374a(this, f185378a[1]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo128035b() {
        return (AbstractC72510a) this.f185387j.getValue();
    }

    /* renamed from: d */
    public final C71232b mo128036d() {
        return (C71232b) this.f185388k.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$b */
    public static final class C82963b {
        static {
            Covode.recordClassIndex(96826);
        }

        private C82963b() {
        }

        public /* synthetic */ C82963b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$d */
    public static final class C82965d implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C82961c f185393a;

        static {
            Covode.recordClassIndex(96828);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112337a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: c */
        public final void mo112341c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: e */
        public final void mo112343e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: f */
        public final void mo112344f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112339b() {
            mo112336a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
            if (this.f185393a.mo128036d().mo112283b()) {
                C82961c cVar = this.f185393a;
                ((C56724i) cVar.f185382d.mo23374a(cVar, C82961c.f185378a[2])).mo93672a(this.f185393a.mo128036d().f159649b);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112336a() {
            this.f185393a.mo128035b().mo114815d(false);
            this.f185393a.mo128036d().mo112447r();
            C82961c cVar = this.f185393a;
            C39162r.m79460a("poll_edit", new C84425b().mo129406a("creation_id", cVar.mo128033a().creationId).mo129406a("shoot_way", cVar.mo128033a().mShootWay).mo129406a("content_type", C70968bl.m125249a(cVar.mo128033a())).mo129406a("content_source", C70968bl.m125262b(cVar.mo128033a())).mo129406a("enter_from", "video_edit_page").mo129406a("prop_id", cVar.mo128036d().f159649b).f188764a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82965d(C82961c cVar) {
            this.f185393a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f185393a.f185380b;
                if (editStickerViewModel == null) {
                    C89219l.m154710a("editStickerViewModel");
                }
                editStickerViewModel.mo127680b(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            ((EditInfoStickerViewModel) this.f185393a.f185381c.getValue()).mo127929i();
            if (z) {
                this.f185393a.mo128035b().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f185393a.mo128035b().mo114805a((AbstractC72510a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185390t;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$a */
    public static final class C82962a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185391a;

        static {
            Covode.recordClassIndex(96825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82962a(AbstractC21566a aVar) {
            super(0);
            this.f185391a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185391a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.poll.C82961c.C82962a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$j */
    static final class C82972j extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185400a;

        static {
            Covode.recordClassIndex(96835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82972j(C82961c cVar) {
            super(0);
            this.f185400a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(400, this.f185400a.mo128036d().f159188r);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C71232b d = mo128036d();
        PollingStickerLayout pollingStickerLayout = d.f159635A;
        if (pollingStickerLayout != null) {
            pollingStickerLayout.f159611p = d.f159636B;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$c */
    static final class C82964c extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185392a;

        static {
            Covode.recordClassIndex(96827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82964c(C82961c cVar) {
            super(0);
            this.f185392a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.f185392a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$k */
    static final class C82973k extends AbstractC89220m implements AbstractC89171a<C71232b> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185401a;

        static {
            Covode.recordClassIndex(96836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82973k(C82961c cVar) {
            super(0);
            this.f185401a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71232b invoke() {
            return new C71232b(this.f185401a.mo128035b(), this.f185401a.mo128033a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22713n_() {
        /*
            r4 = this;
            super.mo22713n_()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b r0 = r4.mo128036d()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout r3 = r0.f159635A
            if (r3 == 0) goto L_0x002e
            android.widget.FrameLayout r1 = r3.f159597b
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "root"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0014:
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            h.f.a.a<h.z> r1 = r3.f159598c
            if (r1 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e r0 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e
            r0.<init>(r1)
            r1 = r0
        L_0x0022:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r2.removeOnGlobalLayoutListener(r1)
            android.animation.Animator r0 = r3.f159612q
            if (r0 == 0) goto L_0x002e
            r0.cancel()
        L_0x002e:
            com.bytedance.f.a.a.j r1 = r4.m143252C()
            com.bytedance.f.a.a.f r0 = r4.m143253D()
            r1.mo23385b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.poll.C82961c.mo22713n_():void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$i */
    static final class C82971i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82961c f185399a;

        static {
            Covode.recordClassIndex(96834);
        }

        C82971i(C82961c cVar) {
            this.f185399a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f185399a.mo128036d().mo112306a(fVar, this.f185399a.mo128035b());
            }
        }
    }

    /* renamed from: a */
    public final void mo128034a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo128036d().f159187q = vESize;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditPollStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f185384g = (EditPollStickerViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f185380b = (EditStickerViewModel) a2;
        EditPollStickerViewModel editPollStickerViewModel = this.f185384g;
        if (editPollStickerViewModel == null) {
            C89219l.m154710a("pollStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editPollStickerViewModel, C82974d.f185402a, new C82966e(this));
        EditPollStickerViewModel editPollStickerViewModel2 = this.f185384g;
        if (editPollStickerViewModel2 == null) {
            C89219l.m154710a("pollStickerViewModel");
        }
        AbstractC88412b unused = selectSubscribe(editPollStickerViewModel2, C82975e.f185403a, new C20370ah(), new C82967f(this));
        EditPollStickerViewModel editPollStickerViewModel3 = this.f185384g;
        if (editPollStickerViewModel3 == null) {
            C89219l.m154710a("pollStickerViewModel");
        }
        selectNonNullSubscribe(editPollStickerViewModel3, C82976f.f185404a, new C20370ah(), new C82968g(this));
        EditStickerViewModel editStickerViewModel = this.f185380b;
        if (editStickerViewModel == null) {
            C89219l.m154710a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, C82977g.f185405a, new C20370ah(), new C82969h(this));
        mo128035b().mo114778C().observe(this, new C82971i(this));
        mo128036d().f159184n = new C82965d(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$e */
    static final class C82966e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185394a;

        static {
            Covode.recordClassIndex(96829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82966e(C82961c cVar) {
            super(2);
            this.f185394a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185394a.mo128036d().mo112324n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$f */
    static final class C82967f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185395a;

        static {
            Covode.recordClassIndex(96830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82967f(C82961c cVar) {
            super(2);
            this.f185395a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(iVar, "");
            this.f185395a.mo128036d().mo112305a(floatValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$g */
    static final class C82968g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185396a;

        static {
            Covode.recordClassIndex(96831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82968g(C82961c cVar) {
            super(2);
            this.f185396a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f185396a.mo128036d().f159175e = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.c$h */
    static final class C82969h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82961c f185397a;

        static {
            Covode.recordClassIndex(96832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82969h(C82961c cVar) {
            super(2);
            this.f185397a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f185397a.mo128036d().f159194x = !booleanValue;
            if (booleanValue) {
                this.f185397a.mo128036d().mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.poll.C82961c.C82969h.C829701 */

                    /* renamed from: a */
                    final /* synthetic */ C82969h f185398a;

                    static {
                        Covode.recordClassIndex(96833);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f185398a.f185397a.mo128036d().mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f185398a = r1;
                    }
                });
            } else {
                this.f185397a.mo128036d().mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    public C82961c(PollingStickerLayout pollingStickerLayout, C21582f fVar) {
        C89219l.m154721d(pollingStickerLayout, "");
        C89219l.m154721d(fVar, "");
        this.f185389l = pollingStickerLayout;
        this.f185390t = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo22702a(android.view.LayoutInflater r8, android.view.ViewGroup r9) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.poll.C82961c.mo22702a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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
