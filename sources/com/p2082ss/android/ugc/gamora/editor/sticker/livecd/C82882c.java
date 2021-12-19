package com.p2082ss.android.ugc.gamora.editor.sticker.livecd;

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
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.C71211a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.vesdk.VESize;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c */
public final class C82882c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185231a = {new C89232y(C82882c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82882c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e */
    public static final C82884b f185232e = new C82884b((byte) 0);

    /* renamed from: b */
    final AbstractC89248d f185233b = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: c */
    public EditStickerViewModel f185234c;

    /* renamed from: d */
    final AbstractC89244h f185235d = C89250i.m154773a((AbstractC89171a) new C82885c(this));

    /* renamed from: f */
    private final AbstractC89248d f185236f = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: g */
    private EditLiveCDStickerViewModel f185237g;

    /* renamed from: h */
    private final AbstractC89244h f185238h = C89250i.m154774a(EnumC89331m.NONE, new C82883a(this));

    /* renamed from: i */
    private final AbstractC89244h f185239i = C89250i.m154773a((AbstractC89171a) new C82895l(this));

    /* renamed from: j */
    private final AbstractC89244h f185240j = C89250i.m154773a((AbstractC89171a) new C82894k(this));

    /* renamed from: k */
    private final AbstractC14552j f185241k;

    /* renamed from: l */
    private final LiveCDEditStickerLayout f185242l;

    /* renamed from: t */
    private final C21582f f185243t;

    static {
        Covode.recordClassIndex(96740);
    }

    /* renamed from: C */
    private final C14544f m143160C() {
        return (C14544f) this.f185240j.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final VideoPublishEditModel mo127967a() {
        return (VideoPublishEditModel) this.f185236f.mo23374a(this, f185231a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo127969b() {
        return (AbstractC72510a) this.f185238h.getValue();
    }

    /* renamed from: d */
    public final C71211a mo127970d() {
        return (C71211a) this.f185239i.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$b */
    public static final class C82884b {
        static {
            Covode.recordClassIndex(96742);
        }

        private C82884b() {
        }

        public /* synthetic */ C82884b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$d */
    public static final class C82886d implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C82882c f185246a;

        static {
            Covode.recordClassIndex(96744);
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
            this.f185246a.mo127969b().mo114815d(false);
            this.f185246a.mo127970d().mo112447r();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
            if (this.f185246a.mo127970d().mo112283b()) {
                C82882c cVar = this.f185246a;
                ((C56724i) cVar.f185233b.mo23374a(cVar, C82882c.f185231a[1])).mo93672a(this.f185246a.mo127970d().f159573a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82886d(C82882c cVar) {
            this.f185246a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f185246a.f185234c;
                if (editStickerViewModel == null) {
                    C89219l.m154710a("editStickerViewModel");
                }
                editStickerViewModel.mo127680b(3);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            ((EditInfoStickerViewModel) this.f185246a.f185235d.getValue()).mo127929i();
            if (z) {
                this.f185246a.mo127969b().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f185246a.mo127969b().mo114805a((AbstractC72510a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185243t;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$a */
    public static final class C82883a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185244a;

        static {
            Covode.recordClassIndex(96741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82883a(AbstractC21566a aVar) {
            super(0);
            this.f185244a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185244a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.livecd.C82882c.C82883a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$k */
    static final class C82894k extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185254a;

        static {
            Covode.recordClassIndex(96752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82894k(C82882c cVar) {
            super(0);
            this.f185254a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(350, this.f185254a.mo127970d().f159188r);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$l */
    static final class C82895l extends AbstractC89220m implements AbstractC89171a<C71211a> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185255a;

        static {
            Covode.recordClassIndex(96753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82895l(C82882c cVar) {
            super(0);
            this.f185255a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71211a invoke() {
            return new C71211a(this.f185255a.mo127969b());
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C71211a d = mo127970d();
        LiveCDEditStickerLayout liveCDEditStickerLayout = d.f159575c;
        if (liveCDEditStickerLayout != null) {
            liveCDEditStickerLayout.f159506q = d.f159570A;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        this.f185242l.mo112529a();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$c */
    static final class C82885c extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185245a;

        static {
            Covode.recordClassIndex(96743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82885c(C82882c cVar) {
            super(0);
            this.f185245a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.f185245a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22713n_() {
        /*
            r4 = this;
            super.mo22713n_()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a r0 = r4.mo127970d()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout r3 = r0.f159575c
            if (r3 == 0) goto L_0x0032
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            android.widget.FrameLayout r1 = r3.f159490a
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "root"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0018:
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            h.f.a.a<h.z> r1 = r3.f159496g
            if (r1 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k r0 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k
            r0.<init>(r1)
            r1 = r0
        L_0x0026:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r2.removeOnGlobalLayoutListener(r1)
            android.animation.Animator r0 = r3.f159507r
            if (r0 == 0) goto L_0x0032
            r0.cancel()
        L_0x0032:
            com.bytedance.f.a.a.j r1 = r4.f185241k
            com.bytedance.f.a.a.f r0 = r4.m143160C()
            r1.mo23385b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.livecd.C82882c.mo22713n_():void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$j */
    static final class C82893j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82882c f185253a;

        static {
            Covode.recordClassIndex(96751);
        }

        C82893j(C82882c cVar) {
            this.f185253a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f185253a.mo127970d().mo112306a(fVar, this.f185253a.mo127969b());
            }
        }
    }

    /* renamed from: a */
    public final void mo127968a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo127970d().f159187q = vESize;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditLiveCDStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f185237g = (EditLiveCDStickerViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f185234c = (EditStickerViewModel) a2;
        EditLiveCDStickerViewModel editLiveCDStickerViewModel = this.f185237g;
        if (editLiveCDStickerViewModel == null) {
            C89219l.m154710a("liveCDStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editLiveCDStickerViewModel, C82896d.f185256a, new C82889f(this));
        EditLiveCDStickerViewModel editLiveCDStickerViewModel2 = this.f185237g;
        if (editLiveCDStickerViewModel2 == null) {
            C89219l.m154710a("liveCDStickerViewModel");
        }
        AbstractC88412b unused = selectSubscribe(editLiveCDStickerViewModel2, C82898f.f185258a, new C20370ah(), new C82890g(this));
        EditLiveCDStickerViewModel editLiveCDStickerViewModel3 = this.f185237g;
        if (editLiveCDStickerViewModel3 == null) {
            C89219l.m154710a("liveCDStickerViewModel");
        }
        selectNonNullSubscribe(editLiveCDStickerViewModel3, C82899g.f185259a, new C20370ah(), new C82891h(this));
        EditLiveCDStickerViewModel editLiveCDStickerViewModel4 = this.f185237g;
        if (editLiveCDStickerViewModel4 == null) {
            C89219l.m154710a("liveCDStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editLiveCDStickerViewModel4, C82900h.f185260a, new C82892i(this));
        mo127969b().mo114778C().observe(this, new C82893j(this));
        EditStickerViewModel editStickerViewModel = this.f185234c;
        if (editStickerViewModel == null) {
            C89219l.m154710a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, C82897e.f185257a, new C20370ah(), new C82887e(this));
        mo127970d().f159184n = new C82886d(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$f */
    static final class C82889f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185249a;

        static {
            Covode.recordClassIndex(96747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82889f(C82882c cVar) {
            super(2);
            this.f185249a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185249a.mo127970d().mo112324n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$g */
    static final class C82890g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185250a;

        static {
            Covode.recordClassIndex(96748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82890g(C82882c cVar) {
            super(2);
            this.f185250a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(iVar, "");
            this.f185250a.mo127970d().mo112305a(floatValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$h */
    static final class C82891h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185251a;

        static {
            Covode.recordClassIndex(96749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82891h(C82882c cVar) {
            super(2);
            this.f185251a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f185251a.mo127970d().f159175e = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$e */
    static final class C82887e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185247a;

        static {
            Covode.recordClassIndex(96745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82887e(C82882c cVar) {
            super(2);
            this.f185247a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f185247a.mo127970d().f159194x = !booleanValue;
            if (booleanValue) {
                this.f185247a.mo127970d().mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.livecd.C82882c.C82887e.C828881 */

                    /* renamed from: a */
                    final /* synthetic */ C82887e f185248a;

                    static {
                        Covode.recordClassIndex(96746);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f185248a.f185247a.mo127970d().mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f185248a = r1;
                    }
                });
            } else {
                this.f185247a.mo127970d().mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.c$i */
    static final class C82892i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82882c f185252a;

        static {
            Covode.recordClassIndex(96750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82892i(C82882c cVar) {
            super(2);
            this.f185252a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C82882c cVar = this.f185252a;
            List<InteractStickerStruct> a = C71073b.m125565a(cVar.mo127967a().getMainBusinessContext(), 10, EnumC71088d.TRACK_PAGE_EDIT);
            cVar.mo127970d().mo112306a(cVar.mo127969b().mo114778C().getValue(), cVar.mo127969b());
            if (a != null && !a.isEmpty()) {
                InteractStickerStruct interactStickerStruct = a.get(0);
                C89219l.m154716b(interactStickerStruct, "");
                if (interactStickerStruct.getCountDownStickerStruct() != null) {
                    cVar.mo127970d().mo112310a(a.get(0));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo22702a(android.view.LayoutInflater r9, android.view.ViewGroup r10) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.livecd.C82882c.mo22702a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    public C82882c(AbstractC14552j jVar, LiveCDEditStickerLayout liveCDEditStickerLayout, C21582f fVar) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(liveCDEditStickerLayout, "");
        C89219l.m154721d(fVar, "");
        this.f185241k = jVar;
        this.f185242l = liveCDEditStickerLayout;
        this.f185243t = fVar;
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
