package com.p2082ss.android.ugc.gamora.editor.sticker.duet;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71128c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c */
public final class C82818c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185119a = {new C89232y(C82818c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C89232y(C82818c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82818c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e */
    public static final C82820b f185120e = new C82820b((byte) 0);

    /* renamed from: b */
    public EditStickerViewModel f185121b;

    /* renamed from: c */
    final AbstractC89244h f185122c = C89250i.m154773a((AbstractC89171a) new C82821c(this));

    /* renamed from: d */
    final AbstractC89248d f185123d = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: f */
    private final AbstractC89248d f185124f = C21572a.m40504a(getDiContainer(), AbstractC14552j.class);

    /* renamed from: g */
    private EditDuetStickerViewModel f185125g;

    /* renamed from: h */
    private final AbstractC89248d f185126h = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i */
    private final AbstractC89244h f185127i = C89250i.m154774a(EnumC89331m.NONE, new C82819a(this));

    /* renamed from: j */
    private final AbstractC89244h f185128j = C89250i.m154773a((AbstractC89171a) new C82827i(this));

    /* renamed from: k */
    private final DuetEditStickerLayout f185129k;

    /* renamed from: l */
    private final C21582f f185130l;

    static {
        Covode.recordClassIndex(96672);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo127892a() {
        return (VideoPublishEditModel) this.f185126h.mo23374a(this, f185119a[1]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo127894b() {
        return (AbstractC72510a) this.f185127i.getValue();
    }

    /* renamed from: d */
    public final C71128c mo127895d() {
        return (C71128c) this.f185128j.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$b */
    public static final class C82820b {
        static {
            Covode.recordClassIndex(96674);
        }

        private C82820b() {
        }

        public /* synthetic */ C82820b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$d */
    public static final class C82822d implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C82818c f185133a;

        static {
            Covode.recordClassIndex(96676);
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
        /* renamed from: a */
        public final void mo112336a() {
            this.f185133a.mo127894b().mo114815d(false);
            this.f185133a.mo127895d().mo112447r();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
            if (this.f185133a.mo127895d().mo112283b()) {
                C82818c cVar = this.f185133a;
                ((C56724i) cVar.f185123d.mo23374a(cVar, C82818c.f185119a[2])).mo93672a(this.f185133a.mo127895d().f159339b);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82822d(C82818c cVar) {
            this.f185133a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            ((EditInfoStickerViewModel) this.f185133a.f185122c.getValue()).mo127929i();
            if (z) {
                this.f185133a.mo127894b().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f185133a.mo127894b().mo114805a((AbstractC72510a) false, true, false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            String str;
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f185133a.f185121b;
                if (editStickerViewModel == null) {
                    C89219l.m154710a("editStickerViewModel");
                }
                editStickerViewModel.mo127680b(8);
                C82818c cVar = this.f185133a;
                C84425b a = new C84425b().mo129406a("group_id", "");
                AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
                if (e != null) {
                    str = e.mo58660c();
                } else {
                    str = null;
                }
                C39162r.m79460a("click_duet_sticker_popup", a.mo129406a("user_id", str).mo129406a("creation_id", cVar.mo127892a().creationId).mo129406a("enter_from", "video_edit_page").mo129406a("content", "set duration or settings").f188764a);
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185130l;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$a */
    public static final class C82819a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185131a;

        static {
            Covode.recordClassIndex(96673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82819a(AbstractC21566a aVar) {
            super(0);
            this.f185131a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185131a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.duet.C82818c.C82819a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$c */
    static final class C82821c extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82818c f185132a;

        static {
            Covode.recordClassIndex(96675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82821c(C82818c cVar) {
            super(0);
            this.f185132a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.f185132a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$i */
    static final class C82827i extends AbstractC89220m implements AbstractC89171a<C71128c> {

        /* renamed from: a */
        final /* synthetic */ C82818c f185138a;

        static {
            Covode.recordClassIndex(96681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82827i(C82818c cVar) {
            super(0);
            this.f185138a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71128c invoke() {
            return new C71128c(this.f185138a.mo127894b(), this.f185138a.mo127892a());
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        Animator animator;
        super.mo22713n_();
        DuetEditStickerLayout duetEditStickerLayout = mo127895d().f159329A;
        if (duetEditStickerLayout != null && (animator = duetEditStickerLayout.f159262i) != null) {
            animator.cancel();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$h */
    static final class C82826h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82818c f185137a;

        static {
            Covode.recordClassIndex(96680);
        }

        C82826h(C82818c cVar) {
            this.f185137a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f185137a.mo127895d().mo112306a(fVar, this.f185137a.mo127894b());
            }
        }
    }

    /* renamed from: a */
    public final void mo127893a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo127895d().f159187q = vESize;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditDuetStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f185125g = (EditDuetStickerViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f185121b = (EditStickerViewModel) a2;
        EditDuetStickerViewModel editDuetStickerViewModel = this.f185125g;
        if (editDuetStickerViewModel == null) {
            C89219l.m154710a("duetStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editDuetStickerViewModel, C82828d.f185139a, new C82823e(this));
        EditDuetStickerViewModel editDuetStickerViewModel2 = this.f185125g;
        if (editDuetStickerViewModel2 == null) {
            C89219l.m154710a("duetStickerViewModel");
        }
        AbstractC88412b unused = selectSubscribe(editDuetStickerViewModel2, C82829e.f185140a, new C20370ah(), new C82824f(this));
        EditDuetStickerViewModel editDuetStickerViewModel3 = this.f185125g;
        if (editDuetStickerViewModel3 == null) {
            C89219l.m154710a("duetStickerViewModel");
        }
        selectNonNullSubscribe(editDuetStickerViewModel3, C82830f.f185141a, new C20370ah(), new C82825g(this));
        mo127894b().mo114778C().observe(this, new C82826h(this));
        mo127895d().f159184n = new C82822d(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$e */
    static final class C82823e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82818c f185134a;

        static {
            Covode.recordClassIndex(96677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82823e(C82818c cVar) {
            super(2);
            this.f185134a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185134a.mo127895d().mo112324n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$f */
    static final class C82824f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82818c f185135a;

        static {
            Covode.recordClassIndex(96678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82824f(C82818c cVar) {
            super(2);
            this.f185135a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(iVar, "");
            this.f185135a.mo127895d().mo112305a(floatValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.c$g */
    static final class C82825g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82818c f185136a;

        static {
            Covode.recordClassIndex(96679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82825g(C82818c cVar) {
            super(2);
            this.f185136a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f185136a.mo127895d().f159175e = booleanValue;
            return C89391z.f203057a;
        }
    }

    public C82818c(DuetEditStickerLayout duetEditStickerLayout, C21582f fVar) {
        C89219l.m154721d(duetEditStickerLayout, "");
        C89219l.m154721d(fVar, "");
        this.f185129k = duetEditStickerLayout;
        this.f185130l = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(8548);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        AbstractC31071f value = mo127894b().mo114778C().getValue();
        if (value != null) {
            mo127893a(value.mo56330b());
            mo127895d().mo112314b(this.f52549m, frameLayout);
            ((AbstractC14552j) this.f185124f.mo23374a(this, f185119a[0])).mo23383a(new C14544f(300, mo127895d().f159188r));
        }
        C71128c d = mo127895d();
        Activity activity = this.f52549m;
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        DuetEditStickerLayout duetEditStickerLayout = this.f185129k;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(duetEditStickerLayout, "");
        d.f159329A = duetEditStickerLayout;
        DuetEditStickerLayout duetEditStickerLayout2 = d.f159329A;
        if (duetEditStickerLayout2 != null) {
            duetEditStickerLayout2.setEditModel(d.f159332D);
        }
        DuetEditStickerLayout duetEditStickerLayout3 = d.f159329A;
        if (duetEditStickerLayout3 != null) {
            duetEditStickerLayout3.setOnCompleteListener(new C71128c.C71130b(d));
        }
        mo127895d().mo112306a(mo127894b().mo114778C().getValue(), mo127894b());
        mo127895d().f159189s = false;
        View view = new View(frameLayout.getContext());
        MethodCollector.m26664o(8548);
        return view;
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
