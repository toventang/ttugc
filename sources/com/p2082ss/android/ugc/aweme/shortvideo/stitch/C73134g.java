package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
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
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70072f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70298bt;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70302c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70181aj;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70282bm;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82005a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g */
public final class C73134g extends AbstractC82005a implements AbstractC20382b, AbstractC70098s, AbstractC70297bs {

    /* renamed from: A */
    private final AbstractC89244h f164223A = C89250i.m154773a((AbstractC89171a) new C73150m(this));

    /* renamed from: B */
    private final AbstractC89244h f164224B = C89250i.m154773a((AbstractC89171a) new C73151n(this));

    /* renamed from: f */
    CutVideoViewModel f164225f;

    /* renamed from: g */
    CutVideoPreviewViewModel f164226g;

    /* renamed from: h */
    VideoEditViewModel f164227h;

    /* renamed from: i */
    public StitchIntroduceViewModel f164228i;

    /* renamed from: j */
    public VEVideoCutterViewModel f164229j;

    /* renamed from: k */
    public String f164230k;

    /* renamed from: l */
    public ProgressDialogC84958b f164231l;

    /* renamed from: t */
    public boolean f164232t;

    /* renamed from: u */
    private CutMultiVideoViewModel f164233u;

    /* renamed from: v */
    private CutVideoTitleBarViewModel f164234v;

    /* renamed from: w */
    private CutVideoBottomBarViewModel f164235w;

    /* renamed from: x */
    private final AbstractC89244h f164236x = C89250i.m154773a((AbstractC89171a) new C73152o(this));

    /* renamed from: y */
    private final AbstractC89244h f164237y = C89250i.m154773a((AbstractC89171a) new C73154q(this));

    /* renamed from: z */
    private final AbstractC89244h f164238z = C89250i.m154773a((AbstractC89171a) new C73135a(this));

    static {
        Covode.recordClassIndex(85848);
    }

    /* renamed from: M */
    private final C70181aj m129148M() {
        return (C70181aj) this.f164236x.getValue();
    }

    /* renamed from: E */
    public final C73130f mo62771E() {
        return (C73130f) this.f164238z.getValue();
    }

    /* renamed from: F */
    public final C73122b mo115685F() {
        return (C73122b) this.f164223A.getValue();
    }

    /* renamed from: G */
    public final VECutVideoPresenter mo115686G() {
        return (VECutVideoPresenter) this.f164224B.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: a */
    public final void mo110614a(AbstractC31071f fVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: f */
    public final void mo110619f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: g */
    public final int mo110620g() {
        return 0;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: b */
    public final AbstractC1204m mo110615b() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: e */
    public final void mo110618e() {
        Activity activity = this.f52549m;
        if (activity != null) {
            activity.finish();
        }
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

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: i */
    public final void mo110622i() {
        mo62771E().mo115683F();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$m */
    static final class C73150m extends AbstractC89220m implements AbstractC89171a<C73122b> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164257a;

        static {
            Covode.recordClassIndex(85864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73150m(C73134g gVar) {
            super(0);
            this.f164257a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C73122b invoke() {
            C73122b bVar = new C73122b();
            this.f164257a.mo36387a(R.id.dpo, bVar, "StitchIntroducingScene");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$n */
    static final class C73151n extends AbstractC89220m implements AbstractC89171a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164258a;

        static {
            Covode.recordClassIndex(85865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73151n(C73134g gVar) {
            super(0);
            this.f164258a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VECutVideoPresenter invoke() {
            return new VECutVideoPresenter(C69744c.m123270b(), this.f164258a, C73125c.m129135a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$q */
    static final class C73154q extends AbstractC89220m implements AbstractC89171a<C70282bm> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164261a;

        static {
            Covode.recordClassIndex(85868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73154q(C73134g gVar) {
            super(0);
            this.f164261a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70282bm invoke() {
            C70282bm bmVar = new C70282bm();
            this.f164261a.mo36387a(R.id.dpo, bmVar, "CutVideoTitleBarScene");
            return bmVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: J */
    public final int mo110850J() {
        return m129148M().mo110842d();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: K */
    public final int mo110851K() {
        return m129148M().mo110836C();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: L */
    public final AbstractC70527h mo110852L() {
        return mo62771E().mo115684G();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: c */
    public final long mo110616c() {
        return mo62771E().mo115684G().getMaxCutDuration();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: h */
    public final SurfaceView mo110621h() {
        return m129148M().mo110840b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: j */
    public final void mo110623j() {
        mo62771E().mo115684G().mo111142b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$o */
    static final class C73152o extends AbstractC89220m implements AbstractC89171a<C70181aj> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164259a;

        static {
            Covode.recordClassIndex(85866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73152o(C73134g gVar) {
            super(0);
            this.f164259a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70181aj invoke() {
            C70181aj ajVar = new C70181aj();
            ajVar.mo110839a(this.f164259a.mo115686G());
            this.f164259a.mo36387a(R.id.dpo, ajVar, "CutVideoPreviewScene");
            return ajVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$p */
    static final class C73153p extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164260a;

        static {
            Covode.recordClassIndex(85867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73153p(C73134g gVar) {
            super(0);
            this.f164260a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            StitchIntroduceViewModel b = C73134g.m129150b(this.f164260a);
            C73125c.f164205a.edit().putBoolean("stitch_trimming_next_guide", true).apply();
            b.mo33689c(StitchIntroduceViewModel.C73116c.f164173a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: H */
    public final void mo115687H() {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f164234v;
        if (cutVideoTitleBarViewModel == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.mo110798d(true);
        C85056k.m146253b(this.f164231l);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: a */
    public final Context mo110613a() {
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70098s
    /* renamed from: d */
    public final C0692e<Long, Long> mo110617d() {
        C0692e<Long, Long> playBoundary = mo62771E().mo115684G().getPlayBoundary();
        C89219l.m154716b(playBoundary, "");
        return playBoundary;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n */
    public final void mo36480n() {
        super.mo36480n();
        VECutVideoPresenter G = mo115686G();
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G.mo110486a((ActivityC0945e) t);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        AbstractC70078j jVar;
        super.mo36492y();
        if (Build.VERSION.SDK_INT < 21 && (jVar = mo115686G().f156555f) != null) {
            jVar.mo110552b(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$a */
    static final class C73135a extends AbstractC89220m implements AbstractC89171a<C73130f> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164239a;

        static {
            Covode.recordClassIndex(85849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73135a(C73134g gVar) {
            super(0);
            this.f164239a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C73130f invoke() {
            C73130f fVar = new C73130f();
            VECutVideoPresenter G = this.f164239a.mo115686G();
            C89219l.m154721d(G, "");
            fVar.f164213f = G;
            C73134g gVar = this.f164239a;
            C89219l.m154721d(gVar, "");
            fVar.f164214g = gVar;
            this.f164239a.mo36387a(R.id.dpo, fVar, "CutVideoSingleBottomScene");
            return fVar;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (C73125c.m129135a()) {
            StitchIntroduceViewModel stitchIntroduceViewModel = this.f164228i;
            if (stitchIntroduceViewModel == null) {
                C89219l.m154710a("stitchViewModel");
            }
            stitchIntroduceViewModel.mo115607a();
            return;
        }
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.f164228i;
        if (stitchIntroduceViewModel2 == null) {
            C89219l.m154710a("stitchViewModel");
        }
        stitchIntroduceViewModel2.mo33689c(StitchIntroduceViewModel.C73115b.f164172a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$b */
    public static final class C73136b implements AbstractC70302c {

        /* renamed from: a */
        final /* synthetic */ C73134g f164240a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f164241b;

        /* renamed from: c */
        final /* synthetic */ StitchParams f164242c;

        static {
            Covode.recordClassIndex(85850);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            String musicPath;
            EditVideoSegment videoSegment;
            String audioPath;
            File a = this.f164241b.element.mo110089a();
            C89219l.m154716b(a, "");
            String path = a.getPath();
            C89219l.m154716b(path, "");
            File b = this.f164241b.element.mo110091b();
            C89219l.m154716b(b, "");
            String path2 = b.getPath();
            File a2 = this.f164241b.element.mo110089a();
            C89219l.m154716b(a2, "");
            this.f164242c.setVideoSegment(new EditVideoSegment(path, path2, C71413b.m126117a(a2.getPath())));
            StitchParams stitchParams = this.f164242c;
            File a3 = this.f164241b.element.mo110089a();
            C89219l.m154716b(a3, "");
            stitchParams.setDuration(C71413b.m126117a(a3.getPath()).getDuration());
            if (!this.f164242c.isPGCMusic() || (musicPath = this.f164242c.getMusicPath()) == null || musicPath.length() == 0) {
                this.f164242c.setMusic(null);
                this.f164240a.mo115688I();
                return;
            }
            C73134g gVar = this.f164240a;
            StitchParams stitchParams2 = this.f164242c;
            String musicPath2 = stitchParams2.getMusicPath();
            if (musicPath2 != null && (videoSegment = stitchParams2.getVideoSegment()) != null && (audioPath = videoSegment.getAudioPath()) != null) {
                gVar.mo115686G();
                C73137c cVar = new C73137c(gVar, stitchParams2);
                C89219l.m154721d(musicPath2, "");
                C89219l.m154721d(audioPath, "");
                C89219l.m154721d(cVar, "");
                AbstractC88979t.m154294a(new VECutVideoPresenter.C70022d(cVar, musicPath2, audioPath)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new VECutVideoPresenter.C70023e(cVar), new VECutVideoPresenter.C70024f(cVar));
            }
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
            ProgressDialogC84958b bVar = this.f164240a.f164231l;
            if (bVar != null && bVar.isShowing()) {
                bVar.setProgress((int) (f * 100.0f));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70302c
        /* renamed from: a */
        public final void mo110855a(boolean z) {
            this.f164240a.f164232t = z;
            if (!z) {
                C73134g gVar = this.f164240a;
                gVar.f164231l = ProgressDialogC84958b.m146021b(gVar.f52549m, this.f164240a.mo36486t().getResources().getString(R.string.fvf));
                ProgressDialogC84958b bVar = this.f164240a.f164231l;
                if (bVar != null) {
                    bVar.setIndeterminate(false);
                }
            }
        }

        C73136b(C73134g gVar, C89233z.C89238e eVar, StitchParams stitchParams) {
            this.f164240a = gVar;
            this.f164241b = eVar;
            this.f164242c = stitchParams;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            String a = this.f164240a.mo36472a(R.string.ary, Integer.valueOf(i));
            C89219l.m154716b(a, "");
            new C79459a(this.f164240a.f52549m).mo123052a(a).mo123053a();
            this.f164240a.mo115687H();
        }
    }

    /* renamed from: I */
    public final void mo115688I() {
        long j;
        boolean z;
        String str;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f164234v;
        if (cutVideoTitleBarViewModel == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.mo110798d(true);
        C85056k.m146253b(this.f164231l);
        if (C40964c.C40968c.f95804a.mo70144a()) {
            C73991bj.m130131b("stitch trim end, go to shoot fail, App in background");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("shoot_mode", 12);
        CutVideoViewModel cutVideoViewModel = this.f164225f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        StitchParams stitchParams = cutVideoViewModel.mo110802b().f156866x;
        if (stitchParams == null) {
            stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 0, 0, 131071, null);
        }
        F f = mo62771E().mo115684G().getPlayBoundary().f2750a;
        long j2 = 0;
        if (f != null) {
            j = f.longValue();
        } else {
            j = 0;
        }
        stitchParams.setStartTime(j);
        S s = mo62771E().mo115684G().getPlayBoundary().f2751b;
        if (s != null) {
            j2 = s.longValue();
        }
        stitchParams.setEndTime(j2);
        if (stitchParams.isPGCMusic()) {
            String str2 = this.f164230k;
            if (str2 == null) {
                str2 = "";
            }
            long duration = stitchParams.getDuration();
            long leftSeekingValue = mo62771E().mo115684G().getLeftSeekingValue();
            if (stitchParams.getMusicStart() >= 0) {
                z = true;
            } else {
                z = false;
            }
            C89219l.m154721d(str2, "");
            C84425b a = new C84425b().mo129406a("shoot_way", "stitch").mo129406a("enter_from", "video_stitch_page").mo129406a("creation_id", str2).mo129406a("content_source", "shoot").mo129406a("content_type", "video");
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            C39162r.m79460a("stitch_next", a.mo129406a("pgc_stitched", str).mo129404a("duration", duration).mo129404a("duration_begin_at", leftSeekingValue).f188764a);
        } else {
            String str3 = this.f164230k;
            if (str3 == null) {
                str3 = "";
            }
            long duration2 = stitchParams.getDuration();
            long leftSeekingValue2 = mo62771E().mo115684G().getLeftSeekingValue();
            C89219l.m154721d(str3, "");
            C39162r.m79460a("stitch_next", new C84425b().mo129406a("shoot_way", "stitch").mo129406a("enter_from", "video_stitch_page").mo129406a("creation_id", str3).mo129406a("content_source", "shoot").mo129406a("content_type", "video").mo129404a("duration", duration2).mo129404a("duration_begin_at", leftSeekingValue2).f188764a);
        }
        if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            C70005cr.m123611a().mo70083a((C69905c) null);
        }
        intent.putExtra("enter_from", "video_stitch_page");
        intent.putExtra("music_origin", "stitch");
        intent.putExtra("creation_id", this.f164230k);
        intent.putExtra("shoot_way", "stitch");
        intent.putExtra("content_type", "video");
        intent.putExtra("content_source", "shoot");
        Objects.requireNonNull(stitchParams, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("stitch_params", (Parcelable) stitchParams);
        Activity activity = this.f52549m;
        if (activity != null) {
            AbstractC72725b a2 = C72724a.m128203a();
            C89219l.m154716b(activity, "");
            a2.mo62203d(activity, intent);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m129149a(C73134g gVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = gVar.f164229j;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ StitchIntroduceViewModel m129150b(C73134g gVar) {
        StitchIntroduceViewModel stitchIntroduceViewModel = gVar.f164228i;
        if (stitchIntroduceViewModel == null) {
            C89219l.m154710a("stitchViewModel");
        }
        return stitchIntroduceViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$c */
    public static final class C73137c implements AbstractC70072f {

        /* renamed from: a */
        final /* synthetic */ C73134g f164243a;

        /* renamed from: b */
        final /* synthetic */ StitchParams f164244b;

        static {
            Covode.recordClassIndex(85851);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70072f
        /* renamed from: a */
        public final void mo110528a(int i) {
            boolean z;
            this.f164244b.setMusicStart(i);
            StitchParams stitchParams = this.f164244b;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            stitchParams.setMuted(z);
            if (i < 0) {
                this.f164244b.setMusic(null);
            }
            this.f164243a.mo115688I();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70072f
        /* renamed from: a */
        public final void mo110529a(Exception exc) {
            C89219l.m154721d(exc, "");
            new C79459a(this.f164243a.f52549m).mo123050a(R.string.ary).mo123053a();
            this.f164243a.mo115687H();
        }

        C73137c(C73134g gVar, StitchParams stitchParams) {
            this.f164243a = gVar;
            this.f164244b = stitchParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$g */
    static final class C73144g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C73134g f164251a;

        static {
            Covode.recordClassIndex(85858);
        }

        C73144g(C73134g gVar) {
            this.f164251a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = this.f164251a.f164230k;
            if (str == null) {
                str = "";
            }
            C73121a.m129131a(str, this.f164251a.mo62771E().mo115684G().getRightSeekingValue() - this.f164251a.mo62771E().mo115684G().getLeftSeekingValue(), this.f164251a.mo62771E().mo115684G().getLeftSeekingValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$h */
    static final class C73145h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C73134g f164252a;

        static {
            Covode.recordClassIndex(85859);
        }

        C73145h(C73134g gVar) {
            this.f164252a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = this.f164252a.f164230k;
            if (str == null) {
                str = "";
            }
            C73121a.m129131a(str, this.f164252a.mo62771E().mo115684G().getRightSeekingValue() - this.f164252a.mo62771E().mo115684G().getLeftSeekingValue(), this.f164252a.mo62771E().mo115684G().getLeftSeekingValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70297bs
    /* renamed from: a */
    public final void mo110854a(AbstractC70298bt btVar) {
        C89219l.m154721d(btVar, "");
        m129148M().f156926a = btVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f164233u = (CutMultiVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(CutVideoPreviewViewModel.class);
        C89219l.m154716b(a2, "");
        this.f164226g = (CutVideoPreviewViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoTitleBarViewModel.class);
        C89219l.m154716b(a3, "");
        this.f164234v = (CutVideoTitleBarViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoBottomBarViewModel.class);
        C89219l.m154716b(a4, "");
        this.f164235w = (CutVideoBottomBarViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a5 = C1181ae.m3881a((ActivityC0945e) activity5, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a5, "");
        VideoEditViewModel videoEditViewModel = (VideoEditViewModel) a5;
        this.f164227h = videoEditViewModel;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel.f157676a = true;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(StitchIntroduceViewModel.class);
        C89219l.m154716b(a6, "");
        this.f164228i = (StitchIntroduceViewModel) a6;
        Activity activity7 = this.f52549m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a7 = C1181ae.m3881a((ActivityC0945e) activity7, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a7, "");
        this.f164229j = (VEVideoCutterViewModel) a7;
        CutVideoViewModel cutVideoViewModel = this.f164225f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoViewModel, C73155h.f164262a, new C73146i(this));
        CutVideoViewModel cutVideoViewModel2 = this.f164225f;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoViewModel2, C73158k.f164265a, new C73147j(this));
        StitchIntroduceViewModel stitchIntroduceViewModel = this.f164228i;
        if (stitchIntroduceViewModel == null) {
            C89219l.m154710a("stitchViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, stitchIntroduceViewModel, C73159l.f164266a, new C73148k(this));
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.f164228i;
        if (stitchIntroduceViewModel2 == null) {
            C89219l.m154710a("stitchViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, stitchIntroduceViewModel2, C73160m.f164267a, new C73149l(this));
        StitchIntroduceViewModel stitchIntroduceViewModel3 = this.f164228i;
        if (stitchIntroduceViewModel3 == null) {
            C89219l.m154710a("stitchViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, stitchIntroduceViewModel3, C73161n.f164268a, new C73138d(this));
        StitchIntroduceViewModel stitchIntroduceViewModel4 = this.f164228i;
        if (stitchIntroduceViewModel4 == null) {
            C89219l.m154710a("stitchViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, stitchIntroduceViewModel4, C73156i.f164263a, new C73140e(this));
        StitchIntroduceViewModel stitchIntroduceViewModel5 = this.f164228i;
        if (stitchIntroduceViewModel5 == null) {
            C89219l.m154710a("stitchViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, stitchIntroduceViewModel5, C73157j.f164264a, new C73142f(this));
        VideoEditViewModel videoEditViewModel2 = this.f164227h;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel2.f157683h.observe(this, new C73144g(this));
        VideoEditViewModel videoEditViewModel3 = this.f164227h;
        if (videoEditViewModel3 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel3.f157686k.observe(this, new C73145h(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$d */
    static final class C73138d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164245a;

        static {
            Covode.recordClassIndex(85852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73138d(C73134g gVar) {
            super(2);
            this.f164245a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f164245a.f52550n.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.stitch.C73134g.C73138d.RunnableC731391 */

                /* renamed from: a */
                final /* synthetic */ C73138d f164246a;

                static {
                    Covode.recordClassIndex(85853);
                }

                {
                    this.f164246a = r1;
                }

                public final void run() {
                    C73134g gVar = this.f164246a.f164245a;
                    if (gVar.f52549m != null) {
                        Activity activity = gVar.f52549m;
                        if ((activity == null || !activity.isFinishing()) && gVar.f52550n != null) {
                            View c = gVar.mo36475c(R.id.fbq);
                            C89219l.m154716b(c, "");
                            Activity activity2 = gVar.f52549m;
                            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            new C23329a((ActivityC0945e) activity2).mo38023e(R.string.b0o).mo38030a(5000L).mo38036a(true).mo38035a(new C73153p(gVar)).mo38034a(EnumC23352h.TOP).mo38041b((AbstractC70516a) c).mo38012d().mo38001a();
                        }
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$e */
    static final class C73140e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164247a;

        static {
            Covode.recordClassIndex(85854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73140e(C73134g gVar) {
            super(2);
            this.f164247a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f164247a.f52550n.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.stitch.C73134g.C73140e.RunnableC731411 */

                /* renamed from: a */
                final /* synthetic */ C73140e f164248a;

                static {
                    Covode.recordClassIndex(85855);
                }

                {
                    this.f164248a = r1;
                }

                public final void run() {
                    C73134g gVar = this.f164248a.f164247a;
                    View c = gVar.mo36475c(R.id.ero);
                    C89219l.m154716b(c, "");
                    new Rect();
                    Paint paint = new Paint();
                    C89219l.m154716b(gVar.mo36486t().getResources().getString(R.string.b0n), "");
                    paint.setTextSize(C13628n.m24520b(gVar.f52549m, 13.0f));
                    Activity activity = gVar.f52549m;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    new C23329a((ActivityC0945e) activity).mo38023e(R.string.b0n).mo38030a(5000L).mo38036a(true).mo38034a(EnumC23352h.BOTTOM).mo38041b((TextView) c).mo38012d().mo38001a();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$f */
    static final class C73142f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164249a;

        static {
            Covode.recordClassIndex(85856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73142f(C73134g gVar) {
            super(2);
            this.f164249a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f164249a.f52550n.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.stitch.C73134g.C73142f.RunnableC731431 */

                /* renamed from: a */
                final /* synthetic */ C73142f f164250a;

                static {
                    Covode.recordClassIndex(85857);
                }

                {
                    this.f164250a = r1;
                }

                public final void run() {
                    Activity activity = this.f164250a.f164249a.f52549m;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$i */
    static final class C73146i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164253a;

        static {
            Covode.recordClassIndex(85860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73146i(C73134g gVar) {
            super(2);
            this.f164253a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            Activity activity = this.f164253a.f52549m;
            if (activity != null) {
                activity.finish();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ath, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$k */
    static final class C73148k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164255a;

        static {
            Covode.recordClassIndex(85862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73148k(C73134g gVar) {
            super(2);
            this.f164255a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            if (!this.f164255a.mo115685F().mo36460z()) {
                C73134g.m129149a(this.f164255a).mo111336a(new C70576a(2, false));
                C73134g gVar = this.f164255a;
                gVar.mo36417e(gVar.mo115685F());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$l */
    static final class C73149l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164256a;

        static {
            Covode.recordClassIndex(85863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73149l(C73134g gVar) {
            super(2);
            this.f164256a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f164256a.mo115686G().f156565p = true;
            C73134g.m129149a(this.f164256a).mo111336a(new C70576a(1, false));
            C73134g gVar = this.f164256a;
            gVar.mo36413d(gVar.mo115685F());
            C73134g.m129150b(this.f164256a).mo115607a();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f164225f = (CutVideoViewModel) a;
        mo36417e(m129148M());
        mo36417e((C70282bm) this.f164237y.getValue());
        mo36417e(mo62771E());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$j */
    static final class C73147j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73134g f164254a;

        static {
            Covode.recordClassIndex(85861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73147j(C73134g gVar) {
            super(2);
            this.f164254a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C73134g gVar = this.f164254a;
            Activity activity = gVar.f52549m;
            if (activity == null || !activity.isFinishing()) {
                CutVideoViewModel cutVideoViewModel = gVar.f164225f;
                if (cutVideoViewModel == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                StitchParams stitchParams = cutVideoViewModel.mo110802b().f156866x;
                if (stitchParams == null) {
                    stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 0, 0, 131071, null);
                }
                C89233z.C89238e eVar = new C89233z.C89238e();
                CutVideoViewModel cutVideoViewModel2 = gVar.f164225f;
                if (cutVideoViewModel2 == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                eVar.element = (T) cutVideoViewModel2.mo110802b().f156851i;
                if (eVar.element == null) {
                    eVar.element = (T) C69744c.m123266a();
                    CutVideoViewModel cutVideoViewModel3 = gVar.f164225f;
                    if (cutVideoViewModel3 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    cutVideoViewModel3.mo110802b().f156851i = eVar.element;
                }
                String musicPath = stitchParams.getMusicPath();
                if (musicPath != null && C80720e.m139927b(musicPath)) {
                    eVar.element.mo110090a(musicPath);
                }
                gVar.mo115686G().mo110487a((Workspace) eVar.element, (BackgroundVideoCompileConfigure) null, false, (AbstractC70302c) new C73136b(gVar, eVar, stitchParams), true);
            }
            return C89391z.f203057a;
        }
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
