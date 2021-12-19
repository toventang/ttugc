package com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2565m;
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
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.C71265e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.QaStickerEditLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4281a.C82307a;
import com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82581b;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.VESize;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c */
public final class C82986c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC82581b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185423a = {new C89232y(C82986c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C89232y(C82986c.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82986c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new C89232y(C82986c.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C89232y(C82986c.class, "lighteningBottomComponent", "getLighteningBottomComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomComponent;", 0)};

    /* renamed from: e */
    public static final C82987a f185424e = new C82987a((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f185425b = C89250i.m154773a((AbstractC89171a) new C82989c(this));

    /* renamed from: c */
    public EditStickerViewModel f185426c;

    /* renamed from: d */
    final AbstractC89248d f185427d = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: f */
    private final AbstractC89248d f185428f = C21572a.m40504a(getDiContainer(), AbstractC14552j.class);

    /* renamed from: g */
    private EditPageQaStickerViewModel f185429g;

    /* renamed from: h */
    private final AbstractC89248d f185430h = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i */
    private final AbstractC89244h f185431i = C89250i.m154773a((AbstractC89171a) new C82998k(this));

    /* renamed from: j */
    private final AbstractC89248d f185432j = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: k */
    private final AbstractC89244h f185433k;

    /* renamed from: l */
    private final AbstractC89248d f185434l;

    /* renamed from: t */
    private final QaStickerEditLayout f185435t;

    /* renamed from: u */
    private final C21582f f185436u;

    static {
        Covode.recordClassIndex(96851);
    }

    /* renamed from: C */
    public final C82307a mo128066C() {
        return (C82307a) this.f185434l.mo23374a(this, f185423a[4]);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo128067a() {
        return (VideoPublishEditModel) this.f185430h.mo23374a(this, f185423a[1]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo128070b() {
        return (AbstractC72510a) this.f185432j.mo23374a(this, f185423a[3]);
    }

    /* renamed from: d */
    public final C71265e mo128071d() {
        return (C71265e) this.f185433k.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$a */
    public static final class C82987a {
        static {
            Covode.recordClassIndex(96852);
        }

        private C82987a() {
        }

        public /* synthetic */ C82987a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$d */
    public static final class C82990d implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C82986c f185441a;

        static {
            Covode.recordClassIndex(96855);
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
            this.f185441a.mo128070b().mo114815d(false);
            this.f185441a.mo128071d().mo112447r();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
            long j;
            if (this.f185441a.mo128071d().mo112283b()) {
                C82986c cVar = this.f185441a;
                ((C56724i) cVar.f185427d.mo23374a(cVar, C82986c.f185423a[2])).mo93672a(this.f185441a.mo128071d().f159722c);
            }
            this.f185441a.mo128067a().hasQaSticker = false;
            C82307a C = this.f185441a.mo128066C();
            if (C != null) {
                C.mo127447f();
            }
            String str = this.f185441a.mo128067a().mShootWay;
            if (!C89219l.m154714a((Object) str, (Object) "answer")) {
                str = "question";
            }
            C84425b a = new C84425b().mo129406a("shoot_way", str).mo129406a("prop_id", this.f185441a.mo128071d().f159722c);
            QaStruct qaStruct = this.f185441a.mo128071d().f159720a;
            if (qaStruct != null) {
                j = qaStruct.getQuestionId();
            } else {
                j = 0;
            }
            C80322d.m139251a("prop_delete", a.mo129406a("question_id", String.valueOf(j)).f188764a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82990d(C82986c cVar) {
            this.f185441a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f185441a.f185426c;
                if (editStickerViewModel == null) {
                    C89219l.m154710a("editStickerViewModel");
                }
                editStickerViewModel.mo127680b(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            ((EditInfoStickerViewModel) this.f185441a.f185425b.getValue()).mo127929i();
            if (z) {
                this.f185441a.mo128070b().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f185441a.mo128070b().mo114805a((AbstractC72510a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185436u;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$k */
    static final class C82998k extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185449a;

        static {
            Covode.recordClassIndex(96863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82998k(C82986c cVar) {
            super(0);
            this.f185449a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(300, this.f185449a.mo128071d().f159188r);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$c */
    static final class C82989c extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185440a;

        static {
            Covode.recordClassIndex(96854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82989c(C82986c cVar) {
            super(0);
            this.f185440a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.f185440a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$j */
    static final class C82997j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185448a;

        static {
            Covode.recordClassIndex(96862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82997j(C82986c cVar) {
            super(0);
            this.f185448a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f185448a.mo128067a().hasQaSticker = true;
            C82307a C = this.f185448a.mo128066C();
            if (C != null) {
                C.mo127447f();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$l */
    static final class C82999l extends AbstractC89220m implements AbstractC89171a<C71265e> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185450a;

        /* renamed from: b */
        final /* synthetic */ C65863a f185451b;

        static {
            Covode.recordClassIndex(96864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82999l(C82986c cVar, C65863a aVar) {
            super(0);
            this.f185450a = cVar;
            this.f185451b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71265e invoke() {
            return new C71265e(this.f185450a.mo128070b(), this.f185450a.mo128067a(), this.f185451b);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$i */
    static final class C82996i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82986c f185447a;

        static {
            Covode.recordClassIndex(96861);
        }

        C82996i(C82986c cVar) {
            this.f185447a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f185447a.mo128071d().mo112306a(fVar, this.f185447a.mo128070b());
            }
        }
    }

    /* renamed from: a */
    public final void mo128069a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo128071d().f159187q = vESize;
    }

    /* renamed from: a */
    public final void mo128068a(QaStruct qaStruct) {
        C89219l.m154721d(qaStruct, "");
        C71265e d = mo128071d();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        C89219l.m154721d(t, "");
        C89219l.m154721d(qaStruct, "");
        QaStickerView qaStickerView = new QaStickerView(t, (AttributeSet) null, 6);
        qaStickerView.mo105009a(qaStruct);
        qaStickerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        qaStickerView.mo9139b();
        d.mo112671a(qaStickerView);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$b */
    static final class C82988b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C82986c f185437a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31071f f185438b;

        /* renamed from: c */
        final /* synthetic */ AbstractC82035ab f185439c;

        static {
            Covode.recordClassIndex(96853);
        }

        C82988b(C82986c cVar, AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f185437a = cVar;
            this.f185438b = fVar;
            this.f185439c = abVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            for (C45859b bVar : (List) iVar.mo5545d()) {
                StickerItemModel stickerItemModel = new StickerItemModel(this.f185437a.mo128071d().f159722c, bVar.stickerPath, "", bVar.index, false, 0, this.f185438b.mo56368j(), 19);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = bVar.viewHash;
                this.f185439c.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditPageQaStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f185429g = (EditPageQaStickerViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f185426c = (EditStickerViewModel) a2;
        mo128071d().f159184n = new C82990d(this);
        EditPageQaStickerViewModel editPageQaStickerViewModel = this.f185429g;
        if (editPageQaStickerViewModel == null) {
            C89219l.m154710a("qaStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editPageQaStickerViewModel, C83000d.f185452a, new C82991e(this));
        EditPageQaStickerViewModel editPageQaStickerViewModel2 = this.f185429g;
        if (editPageQaStickerViewModel2 == null) {
            C89219l.m154710a("qaStickerViewModel");
        }
        AbstractC88412b unused = selectSubscribe(editPageQaStickerViewModel2, C83001e.f185453a, new C20370ah(), new C82992f(this));
        EditPageQaStickerViewModel editPageQaStickerViewModel3 = this.f185429g;
        if (editPageQaStickerViewModel3 == null) {
            C89219l.m154710a("qaStickerViewModel");
        }
        selectNonNullSubscribe(editPageQaStickerViewModel3, C83002f.f185454a, new C20370ah(), new C82993g(this));
        EditStickerViewModel editStickerViewModel = this.f185426c;
        if (editStickerViewModel == null) {
            C89219l.m154710a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, C83003g.f185455a, new C20370ah(), new C82994h(this));
        mo128070b().mo114778C().observe(this, new C82996i(this));
        IEffectPlatformFactory a3 = EffectPlatformFactory.m89604a();
        EffectPlatformBuilder context = new EffectPlatformBuilder().setContext(mo36483q());
        C89219l.m154716b(context, "");
        EffectConfiguration build = a3.createEffectConfigurationBuilder(context).build();
        C71265e d = mo128071d();
        StringBuilder sb = new StringBuilder();
        C89219l.m154716b(build, "");
        File effectDir = build.getEffectDir();
        C89219l.m154716b(effectDir, "");
        d.mo112279a(sb.append(effectDir.getAbsolutePath()).append("/qa_sticker").toString());
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$e */
    static final class C82991e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185442a;

        static {
            Covode.recordClassIndex(96856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82991e(C82986c cVar) {
            super(2);
            this.f185442a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185442a.mo128071d().mo112324n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$f */
    static final class C82992f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185443a;

        static {
            Covode.recordClassIndex(96857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82992f(C82986c cVar) {
            super(2);
            this.f185443a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(iVar, "");
            this.f185443a.mo128071d().mo112305a(floatValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$g */
    static final class C82993g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185444a;

        static {
            Covode.recordClassIndex(96858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82993g(C82986c cVar) {
            super(2);
            this.f185444a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f185444a.mo128071d().f159175e = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.c$h */
    static final class C82994h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82986c f185445a;

        static {
            Covode.recordClassIndex(96859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82994h(C82986c cVar) {
            super(2);
            this.f185445a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f185445a.mo128071d().f159194x = !booleanValue;
            if (booleanValue) {
                this.f185445a.mo128071d().mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.C82986c.C82994h.C829951 */

                    /* renamed from: a */
                    final /* synthetic */ C82994h f185446a;

                    static {
                        Covode.recordClassIndex(96860);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f185446a.f185445a.mo128071d().mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f185446a = r1;
                    }
                });
            } else {
                this.f185445a.mo128071d().mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo22702a(android.view.LayoutInflater r8, android.view.ViewGroup r9) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.C82986c.mo22702a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    public C82986c(QaStickerEditLayout qaStickerEditLayout, C21582f fVar, C65863a aVar) {
        C89219l.m154721d(qaStickerEditLayout, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f185435t = qaStickerEditLayout;
        this.f185436u = fVar;
        this.f185433k = C89250i.m154773a((AbstractC89171a) new C82999l(this, aVar));
        this.f185434l = C21572a.m40505b(getDiContainer(), C82307a.class);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82581b
    /* renamed from: a */
    public final C1731i<C89391z> mo127435a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        if (mo128071d().mo112283b()) {
            if (bVar == null || (str = bVar.invoke("qa_sticker")) == null) {
                str = mo128071d().mo112326p();
            }
            C89219l.m154716b(str, "");
            int a = abVar.mo87631T().mo112106a();
            int b = abVar.mo87631T().mo112109b();
            int i = fVar.mo56330b().width;
            int i2 = fVar.mo56330b().height;
            C71265e d = mo128071d();
            C89219l.m154721d(str, "");
            ArrayList arrayList = new ArrayList();
            C1731i<C45859b> a2 = d.mo112304a(str, a, b, i, i2);
            C89219l.m154716b(a2, "");
            arrayList.add(a2);
            C1731i a3 = C1731i.m5634a((Collection) arrayList);
            C89219l.m154716b(a3, "");
            C1731i<C89391z> c = a3.mo5543c(new C82988b(this, fVar, abVar), C1731i.f5564c);
            C89219l.m154716b(c, "");
            return c;
        }
        C1731i<C89391z> a4 = C1731i.m5633a(C89391z.f203057a);
        C89219l.m154716b(a4, "");
        return a4;
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
