package com.p2082ss.android.ugc.gamora.editor.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.C63152e;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.C83254v;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.p4279f.C82185a;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
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

/* renamed from: com.ss.android.ugc.gamora.editor.music.i */
public final class C82458i extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184413a = {new C89232y(C82458i.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82458i.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0)};

    /* renamed from: k */
    public static final C82463e f184414k = new C82463e((byte) 0);

    /* renamed from: b */
    public boolean f184415b;

    /* renamed from: c */
    public boolean f184416c;

    /* renamed from: d */
    public EditMusicViewModel f184417d;

    /* renamed from: e */
    final AbstractC89244h f184418e = C89250i.m154774a(EnumC89331m.NONE, new C82459a(this));

    /* renamed from: f */
    public AbstractC63147a f184419f;

    /* renamed from: g */
    final AbstractC89244h f184420g = C89250i.m154774a(EnumC89331m.NONE, new C82461c(this));

    /* renamed from: h */
    final AbstractC89244h f184421h = C89250i.m154774a(EnumC89331m.NONE, new C82462d(this));

    /* renamed from: i */
    public final AbstractC63148b f184422i = new C82464f(this);

    /* renamed from: j */
    public final AbstractC22186b f184423j;

    /* renamed from: l */
    private final AbstractC89248d f184424l = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: t */
    private final AbstractC89244h f184425t = C89250i.m154774a(EnumC89331m.NONE, new C82460b(this));

    /* renamed from: u */
    private final AbstractC89248d f184426u = C21572a.m40504a(getDiContainer(), AbstractC82036ac.class);

    /* renamed from: v */
    private RecyclerView f184427v;

    /* renamed from: w */
    private final C21582f f184428w;

    static {
        Covode.recordClassIndex(96298);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo127552a() {
        return (VideoPublishEditModel) this.f184424l.mo23374a(this, f184413a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo127553b() {
        return (AbstractC72510a) this.f184425t.getValue();
    }

    /* renamed from: d */
    public final AbstractC82036ac mo127554d() {
        return (AbstractC82036ac) this.f184426u.mo23374a(this, f184413a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$e */
    public static final class C82463e {
        static {
            Covode.recordClassIndex(96303);
        }

        private C82463e() {
        }

        public /* synthetic */ C82463e(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184428w;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$a */
    public static final class C82459a extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184429a;

        static {
            Covode.recordClassIndex(96299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82459a(AbstractC21566a aVar) {
            super(0);
            this.f184429a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184429a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82458i.C82459a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$b */
    public static final class C82460b extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184430a;

        static {
            Covode.recordClassIndex(96300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82460b(AbstractC21566a aVar) {
            super(0);
            this.f184430a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184430a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82458i.C82460b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$c */
    public static final class C82461c extends AbstractC89220m implements AbstractC89171a<AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184431a;

        static {
            Covode.recordClassIndex(96301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82461c(AbstractC21566a aVar) {
            super(0);
            this.f184431a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184431a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82458i.C82461c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$d */
    public static final class C82462d extends AbstractC89220m implements AbstractC89171a<AbstractC83369a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184432a;

        static {
            Covode.recordClassIndex(96302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82462d(AbstractC21566a aVar) {
            super(0);
            this.f184432a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.volume.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184432a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.volume.a> r1 = com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82458i.C82462d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$f */
    public static final class C82464f implements AbstractC63148b {

        /* renamed from: a */
        final /* synthetic */ C82458i f184433a;

        static {
            Covode.recordClassIndex(96304);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: c */
        public final void mo101514c() {
            this.f184433a.f184416c = true;
            C82458i.m142523a(this.f184433a).mo127540b();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: d */
        public final boolean mo101515d() {
            return C70976bp.m125317m(this.f184433a.mo127552a());
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: a */
        public final void mo101508a() {
            if (this.f184433a.f184415b) {
                this.f184433a.f184415b = false;
                ((AbstractC82104a) this.f184433a.f184418e.getValue()).mo127330a();
            } else if (this.f184433a.f184416c) {
                this.f184433a.f184416c = false;
                ((AbstractC83369a) this.f184433a.f184421h.getValue()).mo128383a();
            } else {
                this.f184433a.mo127553b().mo114805a((AbstractC72510a) true, false, true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: b */
        public final void mo101513b() {
            this.f184433a.f184415b = true;
            C82458i.m142523a(this.f184433a).mo127540b();
            ((AbstractC82610a) this.f184433a.f184420g.getValue()).mo127684g().setValue(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: e */
        public final void mo101516e() {
            AbstractC82036ac ap;
            C82458i.m142523a(this.f184433a).mo127540b();
            this.f184433a.mo127553b().mo114833v().setValue(C88296t.m153437b());
            AbstractC22219j jVar = this.f184433a.f52551o;
            if (!(jVar instanceof C83254v)) {
                jVar = null;
            }
            AbstractC82561d dVar = (AbstractC82561d) jVar;
            if (!(dVar == null || (ap = dVar.mo127624ap()) == null)) {
                ap.mo127281h();
            }
            C70968bl.m125272f(this.f184433a.mo127552a());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82464f(C82458i iVar) {
            this.f184433a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: a */
        public final void mo101509a(float f) {
            float f2 = this.f184433a.mo127552a().musicVolume;
            if (this.f184433a.mo127552a().isStitchMode()) {
                if (this.f184433a.mo127552a().isMuted) {
                    C82185a.m142209a(0.0f, f2, this.f184433a.mo127552a(), this.f184433a.mo127553b());
                } else {
                    C82185a.m142209a(f, f2, this.f184433a.mo127552a(), this.f184433a.mo127553b());
                }
            } else if ((this.f184433a.mo127552a().isFastImport || this.f184433a.mo127552a().hasOriginalSound()) && !this.f184433a.mo127552a().isMuted) {
                if (f != -1.0f) {
                    AbstractC72510a b = this.f184433a.mo127553b();
                    VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
                    C89219l.m154716b(ofVoice, "");
                    b.mo114800a(ofVoice);
                }
                if (this.f184433a.mo127552a().mMusicPath != null && f2 != -1.0f) {
                    AbstractC72510a b2 = this.f184433a.mo127553b();
                    VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                    C89219l.m154716b(ofMusic, "");
                    b2.mo114800a(ofMusic);
                }
            } else if (f2 != -1.0f) {
                AbstractC72510a b3 = this.f184433a.mo127553b();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f2);
                C89219l.m154716b(ofMusic2, "");
                b3.mo114800a(ofMusic2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: a */
        public final void mo101512a(boolean z) {
            FlowDataMusicInfo flowDataMusicInfo = this.f184433a.mo127552a().creativeFlowData.getFlowDataMusicInfo();
            if (flowDataMusicInfo != null) {
                flowDataMusicInfo.setSelectedByAuto(z);
            } else {
                this.f184433a.mo127552a().creativeFlowData.setFlowDataMusicInfo(new FlowDataMusicInfo(z));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: a */
        public final void mo101510a(C63152e eVar, float f) {
            C89219l.m154721d(eVar, "");
            if (this.f184433a.mo127552a().veAudioRecorderParam == null) {
                this.f184433a.mo127552a().veAudioRecorderParam = new AudioRecorderParam();
            }
            this.f184433a.mo127552a().veAudioRecorderParam.setNeedOriginalSound(eVar.f143517a);
            this.f184433a.mo127552a().veAudioRecorderParam.setVoiceVolume(eVar.f143518b);
            this.f184433a.mo127552a().voiceVolume = f;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63148b
        /* renamed from: a */
        public final void mo101511a(String str, C69905c cVar, boolean z) {
            this.f184433a.mo127554d().mo127276a(str, cVar, z);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC63147a aVar = this.f184419f;
        if (aVar != null) {
            aVar.mo101506c();
        }
    }

    /* renamed from: C */
    public final C63152e mo127551C() {
        float voiceVolume;
        if (mo127552a().veAudioRecorderParam == null) {
            return new C63152e(true, mo127552a().voiceVolume);
        }
        boolean needOriginalSound = mo127552a().veAudioRecorderParam.getNeedOriginalSound();
        if (mo127552a().veAudioRecorderParam.getNeedOriginalSound()) {
            voiceVolume = mo127552a().voiceVolume;
        } else {
            voiceVolume = mo127552a().veAudioRecorderParam.getVoiceVolume();
        }
        return new C63152e(needOriginalSound, voiceVolume);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditMusicViewModel m142523a(C82458i iVar) {
        EditMusicViewModel editMusicViewModel = iVar.f184417d;
        if (editMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        return editMusicViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.i$g */
    static final class C82465g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82458i f184434a;

        static {
            Covode.recordClassIndex(96305);
        }

        C82465g(C82458i iVar) {
            this.f184434a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC63147a aVar;
            C20391d dVar = (C20391d) obj;
            if ((dVar == null || dVar.f48283b == null) && (aVar = this.f184434a.f184419f) != null) {
                aVar.mo101507d();
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditMusicViewModel.class);
        C89219l.m154716b(a, "");
        this.f184417d = (EditMusicViewModel) a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.as_, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a;
        this.f184427v = (RecyclerView) frameLayout.findViewById(R.id.doo);
        return frameLayout;
    }

    public C82458i(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184428w = fVar;
        this.f184423j = bVar;
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
