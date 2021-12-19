package com.p2082ss.android.ugc.aweme.ftc.components.volume;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.gamora.editor.p4279f.C82185a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c */
public final class C52443c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120774a = {new C89232y(C52443c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: d */
    public static final C52445b f120775d = new C52445b((byte) 0);

    /* renamed from: b */
    public EditStickerViewModel f120776b;

    /* renamed from: c */
    public C71962q f120777c;

    /* renamed from: e */
    private final AbstractC89248d f120778e = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: f */
    private FTCEditVolumeViewModel f120779f;

    /* renamed from: g */
    private ViewGroup f120780g;

    /* renamed from: h */
    private final AbstractC89244h f120781h = C89250i.m154774a(EnumC89331m.NONE, new C52444a(this));

    /* renamed from: i */
    private FrameLayout f120782i;

    /* renamed from: j */
    private final C21582f f120783j;

    static {
        Covode.recordClassIndex(61837);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo88204a() {
        return (VideoPublishEditModel) this.f120778e.mo23374a(this, f120774a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo88206b() {
        return (AbstractC72510a) this.f120781h.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$b */
    public static final class C52445b {
        static {
            Covode.recordClassIndex(61839);
        }

        private C52445b() {
        }

        public /* synthetic */ C52445b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120783j;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$a */
    public static final class C52444a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f120784a;

        static {
            Covode.recordClassIndex(61838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52444a(AbstractC21566a aVar) {
            super(0);
            this.f120784a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f120784a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.volume.C52443c.C52444a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$g */
    static final class C52450g implements C71962q.AbstractC71967b {

        /* renamed from: a */
        final /* synthetic */ C52443c f120789a;

        static {
            Covode.recordClassIndex(61844);
        }

        C52450g(C52443c cVar) {
            this.f120789a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71967b
        /* renamed from: a */
        public final void mo88209a() {
            C52443c.m97342a(this.f120789a).mo113612e(false);
            this.f120789a.mo88206b().mo114805a((AbstractC72510a) true, false, true);
            EditStickerViewModel editStickerViewModel = this.f120789a.f120776b;
            if (editStickerViewModel == null) {
                C89219l.m154710a("stickerViewModel");
            }
            editStickerViewModel.mo127684g().setValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$f */
    public static final class C52449f implements C71962q.AbstractC71966a {

        /* renamed from: a */
        final /* synthetic */ C52443c f120788a;

        static {
            Covode.recordClassIndex(61843);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52449f(C52443c cVar) {
            this.f120788a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71966a
        /* renamed from: a */
        public final void mo88207a(float f) {
            if (this.f120788a.mo88204a().isStitchMode()) {
                C82185a.m142209a(f, this.f120788a.mo88204a().musicVolume, this.f120788a.mo88204a(), this.f120788a.mo88206b());
            } else {
                AbstractC72510a b = this.f120788a.mo88206b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
                C89219l.m154716b(ofVoice, "");
                b.mo114800a(ofVoice);
            }
            this.f120788a.mo88204a().voiceVolume = f;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71966a
        /* renamed from: b */
        public final void mo88208b(float f) {
            if ((!this.f120788a.mo88204a().isFastImport && !this.f120788a.mo88204a().isCutSameVideoType() && !this.f120788a.mo88204a().hasOriginalSound()) || this.f120788a.mo88204a().isMuted) {
                AbstractC72510a b = this.f120788a.mo88206b();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                b.mo114800a(ofMusic);
            } else if (this.f120788a.mo88204a().isStitchMode()) {
                C82185a.m142209a(this.f120788a.mo88204a().voiceVolume, f, this.f120788a.mo88204a(), this.f120788a.mo88206b());
            } else if (this.f120788a.mo88204a().mMusicPath != null) {
                AbstractC72510a b2 = this.f120788a.mo88206b();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic2, "");
                b2.mo114800a(ofMusic2);
            }
            this.f120788a.mo88204a().musicVolume = f;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C71962q m97342a(C52443c cVar) {
        C71962q qVar = cVar.f120777c;
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

    public C52443c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f120783j = fVar;
    }

    /* renamed from: a */
    public final void mo88205a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C71962q qVar = this.f120777c;
        if (qVar == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar.mo113604a((int) (mo88204a().musicVolume * 100.0f));
        C71962q qVar2 = this.f120777c;
        if (qVar2 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar2.mo113608b((int) (mo88204a().voiceVolume * 100.0f));
        if ((mo88204a().isFastImport || mo88204a().isCutSameVideoType() || mo88204a().hasOriginalSound()) && !mo88204a().isMuted) {
            if (mo88204a().isStitchMode()) {
                C71962q qVar3 = this.f120777c;
                if (qVar3 == null) {
                    C89219l.m154710a("volumeHelper");
                }
                C71962q d = qVar3.mo113611d(true);
                StitchParams stitchParams = mo88204a().stitchParams;
                if (stitchParams != null) {
                    z4 = stitchParams.getEnableMic();
                } else {
                    z4 = true;
                }
                d.mo113610c(z4);
            } else {
                C71962q qVar4 = this.f120777c;
                if (qVar4 == null) {
                    C89219l.m154710a("volumeHelper");
                }
                if (mo88204a().mMusicPath != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qVar4.mo113611d(z3).mo113610c(true);
            }
        } else if (mo88204a().mUseMusicBeforeEdit) {
            C71962q qVar5 = this.f120777c;
            if (qVar5 == null) {
                C89219l.m154710a("volumeHelper");
            }
            if (mo88204a().mMusicPath != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            qVar5.mo113611d(z2).mo113610c(false);
        } else {
            C71962q qVar6 = this.f120777c;
            if (qVar6 == null) {
                C89219l.m154710a("volumeHelper");
            }
            qVar6.mo113611d(true).mo113610c(false);
        }
        if (z) {
            C71962q qVar7 = this.f120777c;
            if (qVar7 == null) {
                C89219l.m154710a("volumeHelper");
            }
            qVar7.mo113612e(true);
        }
        mo88206b().mo114805a((AbstractC72510a) false, false, false);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        String c_;
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(FTCEditVolumeViewModel.class);
        C89219l.m154716b(a, "");
        this.f120779f = (FTCEditVolumeViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f120776b = (EditStickerViewModel) a2;
        this.f120777c = new C71962q(mo88204a());
        AbstractC84919c cVar = null;
        if (this.f52549m instanceof AbstractC84919c) {
            Activity activity3 = this.f52549m;
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            cVar = (AbstractC84919c) activity3;
        }
        C71962q qVar = this.f120777c;
        if (qVar == null) {
            C89219l.m154710a("volumeHelper");
        }
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        qVar.mo113606a((ActivityC0945e) activity4, cVar);
        C71962q qVar2 = this.f120777c;
        if (qVar2 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar2.f161269i = this.f120782i;
        C71962q qVar3 = this.f120777c;
        if (qVar3 == null) {
            C89219l.m154710a("volumeHelper");
        }
        ViewGroup viewGroup = this.f120780g;
        if (viewGroup == null) {
            C89219l.m154710a("volumeLayout");
        }
        qVar3.f161261a = viewGroup;
        C71962q qVar4 = this.f120777c;
        if (qVar4 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar4.mo113607a(mo88204a().isMuted);
        C71962q qVar5 = this.f120777c;
        if (qVar5 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar5.mo113609b(false);
        C71962q qVar6 = this.f120777c;
        if (qVar6 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar6.f161267g = new C52449f(this);
        C71962q qVar7 = this.f120777c;
        if (qVar7 == null) {
            C89219l.m154710a("volumeHelper");
        }
        qVar7.f161268h = new C52450g(this);
        FTCEditVolumeViewModel fTCEditVolumeViewModel = this.f120779f;
        if (fTCEditVolumeViewModel == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel, C52451d.f120790a, new C20370ah(), new C52446c(this));
        FTCEditVolumeViewModel fTCEditVolumeViewModel2 = this.f120779f;
        if (fTCEditVolumeViewModel2 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel2, C52452e.f120791a, new C20370ah(), new C52447d(this));
        FTCEditVolumeViewModel fTCEditVolumeViewModel3 = this.f120779f;
        if (fTCEditVolumeViewModel3 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel3, C52453f.f120792a, new C20370ah(), new C52448e(this));
        FTCEditVolumeViewModel fTCEditVolumeViewModel4 = this.f120779f;
        if (fTCEditVolumeViewModel4 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        String c_2 = mo36476c_(R.string.mo);
        C89219l.m154716b(c_2, "");
        C89219l.m154721d(c_2, "");
        fTCEditVolumeViewModel4.mo33689c(new FTCEditVolumeViewModel.C52436a(c_2));
        FTCEditVolumeViewModel fTCEditVolumeViewModel5 = this.f120779f;
        if (fTCEditVolumeViewModel5 == null) {
            C89219l.m154710a("mVolumeViewModel");
        }
        if (mo88204a().isReaction()) {
            c_ = mo36476c_(R.string.f5t);
            C89219l.m154716b(c_, "");
        } else if (mo88204a().isStitchMode()) {
            c_ = mo36476c_(R.string.bkr);
            C89219l.m154716b(c_, "");
        } else {
            c_ = mo36476c_(R.string.d0j);
            C89219l.m154716b(c_, "");
        }
        C89219l.m154721d(c_, "");
        fTCEditVolumeViewModel5.mo33689c(new FTCEditVolumeViewModel.C52437b(c_));
        mo88205a(false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$c */
    static final class C52446c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52443c f120785a;

        static {
            Covode.recordClassIndex(61840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52446c(C52443c cVar) {
            super(2);
            this.f120785a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            TextView textView = C52443c.m97342a(this.f120785a).f161263c;
            C89219l.m154716b(textView, "");
            textView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$d */
    static final class C52447d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52443c f120786a;

        static {
            Covode.recordClassIndex(61841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52447d(C52443c cVar) {
            super(2);
            this.f120786a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            TextView textView = C52443c.m97342a(this.f120786a).f161262b;
            C89219l.m154716b(textView, "");
            textView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$e */
    static final class C52448e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52443c f120787a;

        static {
            Covode.recordClassIndex(61842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52448e(C52443c cVar) {
            super(2);
            this.f120787a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            C52443c.m97342a(this.f120787a).mo113604a(intValue);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.at0, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a;
        this.f120782i = frameLayout;
        if (frameLayout == null) {
            C89219l.m154715b();
        }
        View findViewById = frameLayout.findViewById(R.id.cck);
        C89219l.m154716b(findViewById, "");
        this.f120780g = (ViewGroup) findViewById;
        FrameLayout frameLayout2 = this.f120782i;
        if (frameLayout2 == null) {
            C89219l.m154715b();
        }
        return frameLayout2;
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
