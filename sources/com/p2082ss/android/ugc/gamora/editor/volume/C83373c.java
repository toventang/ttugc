package com.p2082ss.android.ugc.gamora.editor.volume;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
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
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73211f;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.gamora.editor.p4279f.C82185a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e;
import com.p2082ss.android.ugc.gamora.editor.volume.EditVolumeViewModel;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.gamora.editor.volume.c */
public final class C83373c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186214a = {new C89232y(C83373c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C83373c.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};

    /* renamed from: f */
    public static final C83375b f186215f = new C83375b((byte) 0);

    /* renamed from: b */
    public EditStickerViewModel f186216b;

    /* renamed from: c */
    public C71962q f186217c;

    /* renamed from: d */
    public View f186218d;

    /* renamed from: e */
    public boolean f186219e = true;

    /* renamed from: g */
    private final AbstractC89248d f186220g = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: h */
    private EditVolumeViewModel f186221h;

    /* renamed from: i */
    private ViewGroup f186222i;

    /* renamed from: j */
    private final AbstractC89244h f186223j = C89250i.m154774a(EnumC89331m.NONE, new C83374a(this));

    /* renamed from: k */
    private final AbstractC89248d f186224k = C21572a.m40505b(getDiContainer(), AbstractC83094e.class);

    /* renamed from: l */
    private EditMusicViewModel f186225l;

    /* renamed from: t */
    private final C21582f f186226t;

    static {
        Covode.recordClassIndex(97259);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo128385a() {
        return (VideoPublishEditModel) this.f186220g.mo23374a(this, f186214a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo128387b() {
        return (AbstractC72510a) this.f186223j.getValue();
    }

    /* renamed from: d */
    public final AbstractC83094e mo128388d() {
        return (AbstractC83094e) this.f186224k.mo23374a(this, f186214a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$b */
    public static final class C83375b {
        static {
            Covode.recordClassIndex(97261);
        }

        private C83375b() {
        }

        public /* synthetic */ C83375b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186226t;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$a */
    public static final class C83374a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186227a;

        static {
            Covode.recordClassIndex(97260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83374a(AbstractC21566a aVar) {
            super(0);
            this.f186227a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186227a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.volume.C83373c.C83374a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$h */
    static final class C83381h implements C71962q.AbstractC71967b {

        /* renamed from: a */
        final /* synthetic */ C83373c f186233a;

        static {
            Covode.recordClassIndex(97267);
        }

        C83381h(C83373c cVar) {
            this.f186233a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71967b
        /* renamed from: a */
        public final void mo88209a() {
            AbstractC83094e d;
            AbstractC83094e d2;
            View view = this.f186233a.f186218d;
            if (view != null) {
                view.setVisibility(4);
            }
            C83373c.m143765a(this.f186233a).mo113612e(false);
            if (C73211f.m129264a(this.f186233a.mo128385a()) && (d = this.f186233a.mo128388d()) != null && d.mo128171h() && (d2 = this.f186233a.mo128388d()) != null) {
                d2.mo128170g();
                d2.mo128169f();
            }
            this.f186233a.mo128387b().mo114805a((AbstractC72510a) true, false, true);
            EditStickerViewModel editStickerViewModel = this.f186233a.f186216b;
            if (editStickerViewModel == null) {
                C89219l.m154710a("stickerViewModel");
            }
            editStickerViewModel.mo127684g().setValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$g */
    public static final class C83380g implements C71962q.AbstractC71966a {

        /* renamed from: a */
        final /* synthetic */ C83373c f186232a;

        static {
            Covode.recordClassIndex(97266);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83380g(C83373c cVar) {
            this.f186232a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71966a
        /* renamed from: a */
        public final void mo88207a(float f) {
            if (this.f186232a.mo128385a().isStitchMode()) {
                C82185a.m142209a(f, this.f186232a.mo128385a().musicVolume, this.f186232a.mo128385a(), this.f186232a.mo128387b());
            } else {
                AbstractC72510a b = this.f186232a.mo128387b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
                C89219l.m154716b(ofVoice, "");
                b.mo114800a(ofVoice);
            }
            this.f186232a.mo128385a().voiceVolume = f;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71966a
        /* renamed from: b */
        public final void mo88208b(float f) {
            if ((!this.f186232a.mo128385a().isFastImport && !this.f186232a.mo128385a().isCutSameVideoType() && !this.f186232a.mo128385a().hasOriginalSound()) || this.f186232a.mo128385a().isMuted) {
                AbstractC72510a b = this.f186232a.mo128387b();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                b.mo114800a(ofMusic);
            } else if (this.f186232a.mo128385a().isStitchMode()) {
                C82185a.m142209a(this.f186232a.mo128385a().voiceVolume, f, this.f186232a.mo128385a(), this.f186232a.mo128387b());
            } else if (this.f186232a.mo128385a().mMusicPath != null) {
                AbstractC72510a b2 = this.f186232a.mo128387b();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic2, "");
                b2.mo114800a(ofMusic2);
            }
            this.f186232a.mo128385a().musicVolume = f;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C71962q m143765a(C83373c cVar) {
        C71962q qVar = cVar.f186217c;
        if (qVar == null) {
            C89219l.m154710a("volumeHelper");
        }
        return qVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    public C83373c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f186226t = fVar;
    }

    /* renamed from: a */
    public final void mo128386a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C71962q qVar = this.f186217c;
        if (qVar == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar.mo113604a((int) (mo128385a().musicVolume * 100.0f));
        C71962q qVar2 = this.f186217c;
        if (qVar2 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar2.mo113608b((int) (mo128385a().voiceVolume * 100.0f));
        if ((!mo128385a().isFastImport && !mo128385a().isCutSameVideoType() && !mo128385a().hasOriginalSound()) || mo128385a().isMuted) {
            if (mo128385a().mUseMusicBeforeEdit) {
                C71962q qVar3 = this.f186217c;
                if (qVar3 == null) {
                    C89219l.m154710a("volumeHelper");
                }
                if (mo128385a().mMusicPath != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qVar3.mo113611d(z3).mo113610c(false);
            } else {
                C71962q qVar4 = this.f186217c;
                if (qVar4 == null) {
                    C89219l.m154710a("volumeHelper");
                }
                qVar4.mo113611d(true).mo113610c(false);
            }
            if (C70976bp.m125314j(mo128385a())) {
                C71962q qVar5 = this.f186217c;
                if (qVar5 == null) {
                    C89219l.m154710a("volumeHelper");
                }
                if (mo128385a().mMusicPath != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qVar5.mo113611d(z2).mo113610c(false);
            }
        } else if (mo128385a().isStitchMode()) {
            C71962q qVar6 = this.f186217c;
            if (qVar6 == null) {
                C89219l.m154710a("volumeHelper");
            }
            C71962q d = qVar6.mo113611d(true);
            StitchParams stitchParams = mo128385a().stitchParams;
            if (stitchParams != null) {
                z5 = stitchParams.getEnableMic();
            } else {
                z5 = true;
            }
            d.mo113610c(z5);
        } else {
            C71962q qVar7 = this.f186217c;
            if (qVar7 == null) {
                C89219l.m154710a("volumeHelper");
            }
            if (mo128385a().mMusicPath != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            qVar7.mo113611d(z4).mo113610c(this.f186219e);
        }
        View view = this.f186218d;
        if (view != null) {
            view.setVisibility(0);
        }
        if (z) {
            C71962q qVar8 = this.f186217c;
            if (qVar8 == null) {
                C89219l.m154710a("volumeHelper");
            }
            qVar8.mo113612e(true);
        }
        mo128387b().mo114805a((AbstractC72510a) false, false, false);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        String c_;
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditMusicViewModel.class);
        C89219l.m154716b(a, "");
        this.f186225l = (EditMusicViewModel) a;
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditVolumeViewModel.class);
        C89219l.m154716b(a2, "");
        this.f186221h = (EditVolumeViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a3, "");
        this.f186216b = (EditStickerViewModel) a3;
        this.f186217c = new C71962q(mo128385a());
        AbstractC84919c cVar = null;
        if (this.f52549m instanceof AbstractC84919c) {
            Activity activity4 = this.f52549m;
            Objects.requireNonNull(activity4, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            cVar = (AbstractC84919c) activity4;
        }
        C71962q qVar = this.f186217c;
        if (qVar == null) {
            C89219l.m154710a("volumeHelper");
        }
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        qVar.mo113606a((ActivityC0945e) activity5, cVar);
        C71962q qVar2 = this.f186217c;
        if (qVar2 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar2.f161269i = this.f186218d;
        C71962q qVar3 = this.f186217c;
        if (qVar3 == null) {
            C89219l.m154710a("volumeHelper");
        }
        ViewGroup viewGroup = this.f186222i;
        if (viewGroup == null) {
            C89219l.m154710a("volumeLayout");
        }
        qVar3.f161261a = viewGroup;
        C71962q qVar4 = this.f186217c;
        if (qVar4 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar4.mo113607a(mo128385a().isMuted);
        C71962q qVar5 = this.f186217c;
        if (qVar5 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar5.mo113609b(true);
        C71962q qVar6 = this.f186217c;
        if (qVar6 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar6.f161267g = new C83380g(this);
        C71962q qVar7 = this.f186217c;
        if (qVar7 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar7.f161268h = new C83381h(this);
        EditVolumeViewModel editVolumeViewModel = this.f186221h;
        if (editVolumeViewModel == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        selectNonNullSubscribe(editVolumeViewModel, C83382d.f186234a, new C20370ah(), new C83376c(this));
        EditVolumeViewModel editVolumeViewModel2 = this.f186221h;
        if (editVolumeViewModel2 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        selectNonNullSubscribe(editVolumeViewModel2, C83383e.f186235a, new C20370ah(), new C83377d(this));
        EditVolumeViewModel editVolumeViewModel3 = this.f186221h;
        if (editVolumeViewModel3 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        selectNonNullSubscribe(editVolumeViewModel3, C83384f.f186236a, new C20370ah(), new C83378e(this));
        EditMusicViewModel editMusicViewModel = this.f186225l;
        if (editMusicViewModel == null) {
            C89219l.m154710a("editMusicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel, C83385g.f186237a, new C20370ah(), new C83379f(this));
        EditVolumeViewModel editVolumeViewModel4 = this.f186221h;
        if (editVolumeViewModel4 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        String c_2 = mo36476c_(R.string.mo);
        C89219l.m154716b(c_2, "");
        C89219l.m154721d(c_2, "");
        editVolumeViewModel4.mo33689c(new EditVolumeViewModel.C83365a(c_2));
        EditVolumeViewModel editVolumeViewModel5 = this.f186221h;
        if (editVolumeViewModel5 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        if (mo128385a().isReaction()) {
            c_ = mo36476c_(R.string.f5t);
            C89219l.m154716b(c_, "");
        } else if (mo128385a().isStitchMode()) {
            c_ = mo36476c_(R.string.bkr);
            C89219l.m154716b(c_, "");
        } else {
            c_ = mo36476c_(R.string.d0j);
            C89219l.m154716b(c_, "");
        }
        C89219l.m154721d(c_, "");
        editVolumeViewModel5.mo33689c(new EditVolumeViewModel.C83367c(c_));
        mo128386a(false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$c */
    static final class C83376c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83373c f186228a;

        static {
            Covode.recordClassIndex(97262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83376c(C83373c cVar) {
            super(2);
            this.f186228a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            TextView textView = C83373c.m143765a(this.f186228a).f161263c;
            C89219l.m154716b(textView, "");
            textView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$d */
    static final class C83377d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83373c f186229a;

        static {
            Covode.recordClassIndex(97263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83377d(C83373c cVar) {
            super(2);
            this.f186229a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            TextView textView = C83373c.m143765a(this.f186229a).f161262b;
            C89219l.m154716b(textView, "");
            textView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$e */
    static final class C83378e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83373c f186230a;

        static {
            Covode.recordClassIndex(97264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83378e(C83373c cVar) {
            super(2);
            this.f186230a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            C83373c.m143765a(this.f186230a).mo113604a(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$f */
    static final class C83379f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83373c f186231a;

        static {
            Covode.recordClassIndex(97265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83379f(C83373c cVar) {
            super(2);
            this.f186231a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            this.f186231a.f186219e = kVar2.f48283b.booleanValue();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asn, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) a;
        this.f186218d = relativeLayout;
        if (relativeLayout == null) {
            C89219l.m154715b();
        }
        View findViewById = relativeLayout.findViewById(R.id.fh2);
        C89219l.m154716b(findViewById, "");
        this.f186222i = (ViewGroup) findViewById;
        View view = this.f186218d;
        if (view == null) {
            C89219l.m154715b();
        }
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
