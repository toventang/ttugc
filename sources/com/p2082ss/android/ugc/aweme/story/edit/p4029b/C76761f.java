package com.p2082ss.android.ugc.aweme.story.edit.p4029b;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3849o.C72462a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.C72547d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72595ac;
import com.p2082ss.android.ugc.aweme.story.base.model.ETParams;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.base.p4022c.C76617a;
import com.p2082ss.android.ugc.aweme.story.edit.C76740a;
import com.p2082ss.android.ugc.aweme.story.edit.C76748b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77116a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77128g;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.C77118b;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77156c;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88276k;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88295s;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import dmt.p4542av.video.C88299v;
import dmt.p4542av.video.C88300w;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.p4545b.AbstractC88176f;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.b.f */
public final class C76761f extends AbstractC77116a<AbstractC76760e> implements AbstractC76760e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172283a = {new C89232y(C76761f.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new C89232y(C76761f.class, "filterService", "getFilterService()Lcom/ss/android/ugc/aweme/filter/services/IFilterComponentService;", 0), new C89232y(C76761f.class, "surfaceView", "getSurfaceView()Landroid/view/SurfaceView;", 0), new C89232y(C76761f.class, "sharedEditConfigure", "getSharedEditConfigure()Lcom/ss/android/ugc/aweme/story/edit/model/StorySharedEditConfigure;", 0), new C89232y(C76761f.class, "mPublishEditModel", "getMPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: A */
    private final AbstractC89244h f172284A = C89250i.m154773a((AbstractC89171a) new C76795j(this));

    /* renamed from: B */
    private final AbstractC89244h f172285B = C89250i.m154773a((AbstractC89171a) C76798l.f172380a);

    /* renamed from: C */
    private final AbstractC89244h f172286C = C89250i.m154773a((AbstractC89171a) C76794i.f172376a);

    /* renamed from: D */
    private final AbstractC89244h f172287D = C89250i.m154773a((AbstractC89171a) C76793h.f172375a);

    /* renamed from: E */
    private final AbstractC89244h f172288E = C89250i.m154773a((AbstractC89171a) C76786ax.f172368a);

    /* renamed from: F */
    private final AbstractC89244h f172289F = C89250i.m154773a((AbstractC89171a) C76774al.f172356a);

    /* renamed from: G */
    private final AbstractC89244h f172290G = C89250i.m154773a((AbstractC89171a) C76769ag.f172351a);

    /* renamed from: H */
    private final AbstractC89244h f172291H = C89250i.m154773a((AbstractC89171a) C76784av.f172366a);

    /* renamed from: I */
    private final AbstractC89244h f172292I = C89250i.m154773a((AbstractC89171a) C76797k.f172379a);

    /* renamed from: J */
    private final AbstractC89244h f172293J = C89250i.m154773a((AbstractC89171a) C76781as.f172363a);

    /* renamed from: K */
    private final ArrayList<EffectPointModel> f172294K = new ArrayList<>();

    /* renamed from: L */
    private final AbstractC89244h f172295L = C89250i.m154773a((AbstractC89171a) C76772aj.f172354a);

    /* renamed from: M */
    private final AbstractC89244h f172296M = C89250i.m154773a((AbstractC89171a) C76782at.f172364a);

    /* renamed from: N */
    private final AbstractC89244h f172297N = C89250i.m154773a((AbstractC89171a) C76783au.f172365a);

    /* renamed from: O */
    private final AbstractC89244h f172298O = C89250i.m154773a((AbstractC89171a) C76811x.f172395a);

    /* renamed from: P */
    private final AbstractC89244h f172299P = C89250i.m154773a((AbstractC89171a) C76767ae.f172349a);

    /* renamed from: Q */
    private final AbstractC89244h f172300Q = C89250i.m154773a((AbstractC89171a) C76768af.f172350a);

    /* renamed from: R */
    private final AbstractC89244h f172301R = C89250i.m154773a((AbstractC89171a) C76785aw.f172367a);

    /* renamed from: S */
    private final AbstractC89244h f172302S = C89250i.m154773a((AbstractC89171a) C76787b.f172369a);

    /* renamed from: T */
    private final AbstractC89244h f172303T = C89250i.m154773a((AbstractC89171a) C76765ac.f172347a);

    /* renamed from: U */
    private final AbstractC89244h f172304U = C89250i.m154773a((AbstractC89171a) C76770ah.f172352a);

    /* renamed from: V */
    private final AbstractC89244h f172305V = C89250i.m154773a((AbstractC89171a) C76788c.f172370a);

    /* renamed from: W */
    private final AbstractC89244h f172306W = C89250i.m154773a((AbstractC89171a) C76764ab.f172346a);

    /* renamed from: X */
    private final AbstractC89244h f172307X = C89250i.m154773a((AbstractC89171a) C76766ad.f172348a);

    /* renamed from: Y */
    private final AbstractC89244h f172308Y = C89250i.m154773a((AbstractC89171a) C76799m.f172381a);

    /* renamed from: Z */
    private final AbstractC89244h f172309Z = C89250i.m154773a((AbstractC89171a) C76791f.f172373a);

    /* renamed from: aa */
    private final AbstractC89244h f172310aa = C89250i.m154773a((AbstractC89171a) C76775am.f172357a);

    /* renamed from: ab */
    private final AbstractC89244h f172311ab = C89250i.m154773a((AbstractC89171a) C76763aa.f172345a);

    /* renamed from: ac */
    private final AbstractC89244h f172312ac = C89250i.m154773a((AbstractC89171a) C76813z.f172397a);

    /* renamed from: ad */
    private final AbstractC89244h f172313ad = C89250i.m154773a((AbstractC89171a) C76777ao.f172359a);

    /* renamed from: ae */
    private final AbstractC89244h f172314ae = C89250i.m154773a((AbstractC89171a) C76762a.f172344a);

    /* renamed from: af */
    private final AbstractC89244h f172315af = C89250i.m154773a((AbstractC89171a) C76802p.f172384a);

    /* renamed from: ag */
    private final AbstractC89244h f172316ag = C89250i.m154773a((AbstractC89171a) C76771ai.f172353a);

    /* renamed from: ah */
    private final AbstractC89244h f172317ah = C89250i.m154773a((AbstractC89171a) C76773ak.f172355a);

    /* renamed from: ai */
    private int f172318ai;

    /* renamed from: aj */
    private C1213t<Integer> f172319aj = new C1213t<>();

    /* renamed from: b */
    public final AtomicBoolean f172320b = new AtomicBoolean(false);

    /* renamed from: c */
    public volatile boolean f172321c;

    /* renamed from: d */
    public C72462a f172322d;

    /* renamed from: f */
    public final AbstractC76760e f172323f = this;

    /* renamed from: g */
    private boolean f172324g = true;

    /* renamed from: h */
    private FilterBean f172325h = C50687a.m94974a();

    /* renamed from: i */
    private final AbstractC89248d f172326i = C21572a.m40504a(getDiContainer(), StoryEditModel.class);

    /* renamed from: j */
    private final AbstractC89248d f172327j = C21572a.m40504a(getDiContainer(), AbstractC50651a.class);

    /* renamed from: k */
    private final AbstractC89248d f172328k = C21572a.m40504a(getDiContainer(), SurfaceView.class);

    /* renamed from: l */
    private final AbstractC89248d f172329l = C21572a.m40504a(getDiContainer(), C77156c.class);

    /* renamed from: m */
    private final AbstractC89248d f172330m = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: n */
    private C88288n f172331n;

    /* renamed from: o */
    private final C72547d f172332o = new C72547d();

    /* renamed from: p */
    private final C1213t<Boolean> f172333p = new C1213t<>();

    /* renamed from: q */
    private final AbstractC89244h f172334q = C89250i.m154773a((AbstractC89171a) C76812y.f172396a);

    /* renamed from: r */
    private final AbstractC89244h f172335r = C89250i.m154773a((AbstractC89171a) C76779aq.f172361a);

    /* renamed from: s */
    private final AbstractC89244h f172336s = C89250i.m154773a((AbstractC89171a) C76778ap.f172360a);

    /* renamed from: t */
    private final AbstractC89244h f172337t = C89250i.m154773a((AbstractC89171a) C76789d.f172371a);

    /* renamed from: u */
    private final AbstractC89244h f172338u = C89250i.m154773a((AbstractC89171a) C76790e.f172372a);

    /* renamed from: v */
    private final AbstractC89244h f172339v = C89250i.m154773a((AbstractC89171a) C76776an.f172358a);

    /* renamed from: w */
    private final AbstractC89244h f172340w = C89250i.m154773a((AbstractC89171a) C76792g.f172374a);

    /* renamed from: x */
    private final AbstractC89244h f172341x = C89250i.m154773a((AbstractC89171a) C76780ar.f172362a);

    /* renamed from: y */
    private final AbstractC89244h f172342y = C89250i.m154773a((AbstractC89171a) C76801o.f172383a);

    /* renamed from: z */
    private final AbstractC89244h f172343z = C89250i.m154773a((AbstractC89171a) C76800n.f172382a);

    static {
        Covode.recordClassIndex(89757);
    }

    /* renamed from: aa */
    private SurfaceView m134356aa() {
        return (SurfaceView) this.f172328k.mo23374a(this, f172283a[2]);
    }

    /* renamed from: ab */
    private C77156c m134357ab() {
        return (C77156c) this.f172329l.mo23374a(this, f172283a[3]);
    }

    /* renamed from: ac */
    private final VideoPublishEditModel m134358ac() {
        return (VideoPublishEditModel) this.f172330m.mo23374a(this, f172283a[4]);
    }

    /* renamed from: ad */
    private LiveData<VEVolumeChangeOp> m134359ad() {
        return (LiveData) this.f172288E.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: A */
    public final C1213t<C70936b> mo114776A() {
        return (C1213t) this.f172314ae.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: B */
    public final C1213t<Boolean> mo114777B() {
        return (C1213t) this.f172315af.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: C */
    public final LiveData<AbstractC31071f> mo114778C() {
        return (LiveData) this.f172301R.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: D */
    public final LiveData<VEEditorAutoStartStopArbiter> mo114779D() {
        return (LiveData) this.f172302S.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: E */
    public final C1213t<C88297u> mo114780E() {
        return (C1213t) this.f172303T.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: F */
    public final LiveData<C89386u<Boolean, Boolean, Boolean>> mo114781F() {
        return (LiveData) this.f172339v.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: I */
    public final LiveData<Boolean> mo114784I() {
        return (LiveData) this.f172304U.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: K */
    public final LiveData<C89391z> mo114786K() {
        return (LiveData) this.f172305V.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: L */
    public final void mo114787L() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: M */
    public final LiveData<C89391z> mo114788M() {
        return (LiveData) this.f172306W.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: O */
    public final LiveData<C89391z> mo114790O() {
        return (LiveData) this.f172309Z.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: Q */
    public final LiveData<Integer> mo114792Q() {
        return (LiveData) this.f172336s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: R */
    public final LiveData<Integer> mo114793R() {
        return (LiveData) this.f172337t.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: S */
    public final LiveData<Boolean> mo114794S() {
        return (LiveData) this.f172291H.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e
    /* renamed from: T */
    public final LiveData<C89391z> mo120447T() {
        return (LiveData) this.f172335r.getValue();
    }

    /* renamed from: W */
    public final StoryEditModel mo120448W() {
        return (StoryEditModel) this.f172326i.mo23374a(this, f172283a[0]);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c
    /* renamed from: X */
    public final LiveData<C89391z> mo120449X() {
        return (LiveData) this.f172334q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: e */
    public final LiveData<Void> mo114816e() {
        return (LiveData) this.f172287D.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: f */
    public final LiveData<Void> mo114817f() {
        return (LiveData) this.f172340w.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: g */
    public final LiveData<SurfaceView> mo114818g() {
        return (LiveData) this.f172341x.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: h */
    public final C1213t<Boolean> mo114819h() {
        return (C1213t) this.f172342y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: i */
    public final C1213t<Bitmap> mo114820i() {
        return (C1213t) this.f172343z.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: j */
    public final LiveData<C50649a> mo114821j() {
        return (LiveData) this.f172338u.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: k */
    public final LiveData<AbstractC50706n> mo114822k() {
        return (LiveData) this.f172285B.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: l */
    public final LiveData<AbstractC50703k> mo114823l() {
        return (LiveData) this.f172284A.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: p */
    public final C88271g<C88292p> mo114827p() {
        return (C88271g) this.f172292I.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: q */
    public final C88276k<C88300w> mo114828q() {
        return (C88276k) this.f172293J.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: s */
    public final LiveData<Boolean> mo114830s() {
        return (LiveData) this.f172295L.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: t */
    public final LiveData<C88300w> mo114831t() {
        return (LiveData) this.f172296M.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: u */
    public final LiveData<IAudioEffectParam> mo114832u() {
        return (LiveData) this.f172298O.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: v */
    public final C1213t<C88296t> mo114833v() {
        return (C1213t) this.f172299P.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: w */
    public final LiveData<VEPreviewMusicParams> mo114834w() {
        return (LiveData) this.f172300Q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: x */
    public final LiveData<C88295s> mo114835x() {
        return (LiveData) this.f172311ab.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: y */
    public final LiveData<Boolean> mo114836y() {
        return (LiveData) this.f172312ac.getValue();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this.f172323f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: m */
    public final int mo114824m() {
        return this.f172318ai;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: n */
    public final C1213t<Integer> mo114825n() {
        return this.f172319aj;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: r */
    public final ArrayList<EffectPointModel> mo114829r() {
        return this.f172294K;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114804a(boolean z) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        AbstractC88181j a = C77134a.m134736a(this);
        if (a != null && (vEEditorAutoStartStopArbiter = a.f200144e) != null) {
            vEEditorAutoStartStopArbiter.mo142667a(z, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final boolean mo114806a(VEPreviewMusicParams vEPreviewMusicParams) {
        AbstractC88181j b;
        VEEditClip c;
        AbstractC31071f a;
        C89219l.m154721d(vEPreviewMusicParams, "");
        C76617a.m134204a(mo114834w(), vEPreviewMusicParams);
        C72462a aVar = this.f172322d;
        if (!(aVar == null || (c = C77134a.m134738c(this)) == null || (a = C77134a.m134735a(c)) == null)) {
            a.mo56359g(aVar.f162446a);
        }
        VEEditClip c2 = C77134a.m134738c(this);
        if (c2 == null || (b = c2.mo120644b()) == null) {
            return false;
        }
        return b.mo142733a(vEPreviewMusicParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114803a(C88297u uVar) {
        C89219l.m154721d(uVar, "");
        C76617a.m134204a(mo114780E(), uVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114805a(boolean z, boolean z2, boolean z3) {
        C76617a.m134204a(mo114781F(), new C89386u(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$a */
    static final class C76762a extends AbstractC89220m implements AbstractC89171a<C1213t<C70936b>> {

        /* renamed from: a */
        public static final C76762a f172344a = new C76762a();

        static {
            Covode.recordClassIndex(89758);
        }

        C76762a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C70936b> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$aa */
    static final class C76763aa extends AbstractC89220m implements AbstractC89171a<C1213t<C88295s>> {

        /* renamed from: a */
        public static final C76763aa f172345a = new C76763aa();

        static {
            Covode.recordClassIndex(89759);
        }

        C76763aa() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88295s> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ab */
    static final class C76764ab extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76764ab f172346a = new C76764ab();

        static {
            Covode.recordClassIndex(89760);
        }

        C76764ab() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ac */
    static final class C76765ac extends AbstractC89220m implements AbstractC89171a<C1213t<C88297u>> {

        /* renamed from: a */
        public static final C76765ac f172347a = new C76765ac();

        static {
            Covode.recordClassIndex(89761);
        }

        C76765ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88297u> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ad */
    static final class C76766ad extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76766ad f172348a = new C76766ad();

        static {
            Covode.recordClassIndex(89762);
        }

        C76766ad() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ae */
    static final class C76767ae extends AbstractC89220m implements AbstractC89171a<C1213t<C88296t>> {

        /* renamed from: a */
        public static final C76767ae f172349a = new C76767ae();

        static {
            Covode.recordClassIndex(89763);
        }

        C76767ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88296t> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$af */
    static final class C76768af extends AbstractC89220m implements AbstractC89171a<C1213t<VEPreviewMusicParams>> {

        /* renamed from: a */
        public static final C76768af f172350a = new C76768af();

        static {
            Covode.recordClassIndex(89764);
        }

        C76768af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<VEPreviewMusicParams> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ag */
    static final class C76769ag extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76769ag f172351a = new C76769ag();

        static {
            Covode.recordClassIndex(89765);
        }

        C76769ag() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ah */
    static final class C76770ah extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76770ah f172352a = new C76770ah();

        static {
            Covode.recordClassIndex(89766);
        }

        C76770ah() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ai */
    static final class C76771ai extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76771ai f172353a = new C76771ai();

        static {
            Covode.recordClassIndex(89767);
        }

        C76771ai() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$aj */
    static final class C76772aj extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76772aj f172354a = new C76772aj();

        static {
            Covode.recordClassIndex(89768);
        }

        C76772aj() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ak */
    static final class C76773ak extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76773ak f172355a = new C76773ak();

        static {
            Covode.recordClassIndex(89769);
        }

        C76773ak() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$al */
    static final class C76774al extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76774al f172356a = new C76774al();

        static {
            Covode.recordClassIndex(89770);
        }

        C76774al() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$am */
    static final class C76775am extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76775am f172357a = new C76775am();

        static {
            Covode.recordClassIndex(89771);
        }

        C76775am() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$an */
    static final class C76776an extends AbstractC89220m implements AbstractC89171a<C1213t<C89386u<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C76776an f172358a = new C76776an();

        static {
            Covode.recordClassIndex(89772);
        }

        C76776an() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89386u<? extends Boolean, ? extends Boolean, ? extends Boolean>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ao */
    static final class C76777ao extends AbstractC89220m implements AbstractC89171a<C1213t<C88299v>> {

        /* renamed from: a */
        public static final C76777ao f172359a = new C76777ao();

        static {
            Covode.recordClassIndex(89773);
        }

        C76777ao() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88299v> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ap */
    static final class C76778ap extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C76778ap f172360a = new C76778ap();

        static {
            Covode.recordClassIndex(89774);
        }

        C76778ap() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$aq */
    static final class C76779aq extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76779aq f172361a = new C76779aq();

        static {
            Covode.recordClassIndex(89775);
        }

        C76779aq() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ar */
    static final class C76780ar extends AbstractC89220m implements AbstractC89171a<C1213t<SurfaceView>> {

        /* renamed from: a */
        public static final C76780ar f172362a = new C76780ar();

        static {
            Covode.recordClassIndex(89776);
        }

        C76780ar() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<SurfaceView> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$as */
    static final class C76781as extends AbstractC89220m implements AbstractC89171a<C88276k<C88300w>> {

        /* renamed from: a */
        public static final C76781as f172363a = new C76781as();

        static {
            Covode.recordClassIndex(89777);
        }

        C76781as() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88276k<C88300w> invoke() {
            return new C88276k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$at */
    static final class C76782at extends AbstractC89220m implements AbstractC89171a<C1213t<C88300w>> {

        /* renamed from: a */
        public static final C76782at f172364a = new C76782at();

        static {
            Covode.recordClassIndex(89778);
        }

        C76782at() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88300w> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$au */
    static final class C76783au extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C76783au f172365a = new C76783au();

        static {
            Covode.recordClassIndex(89779);
        }

        C76783au() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$av */
    static final class C76784av extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76784av f172366a = new C76784av();

        static {
            Covode.recordClassIndex(89780);
        }

        C76784av() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$aw */
    static final class C76785aw extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC31071f>> {

        /* renamed from: a */
        public static final C76785aw f172367a = new C76785aw();

        static {
            Covode.recordClassIndex(89781);
        }

        C76785aw() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC31071f> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$ax */
    static final class C76786ax extends AbstractC89220m implements AbstractC89171a<C1213t<VEVolumeChangeOp>> {

        /* renamed from: a */
        public static final C76786ax f172368a = new C76786ax();

        static {
            Covode.recordClassIndex(89782);
        }

        C76786ax() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<VEVolumeChangeOp> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$b */
    static final class C76787b extends AbstractC89220m implements AbstractC89171a<C1213t<VEEditorAutoStartStopArbiter>> {

        /* renamed from: a */
        public static final C76787b f172369a = new C76787b();

        static {
            Covode.recordClassIndex(89783);
        }

        C76787b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<VEEditorAutoStartStopArbiter> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$c */
    static final class C76788c extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76788c f172370a = new C76788c();

        static {
            Covode.recordClassIndex(89784);
        }

        C76788c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$d */
    static final class C76789d extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C76789d f172371a = new C76789d();

        static {
            Covode.recordClassIndex(89785);
        }

        C76789d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$e */
    static final class C76790e extends AbstractC89220m implements AbstractC89171a<C1213t<C50649a>> {

        /* renamed from: a */
        public static final C76790e f172372a = new C76790e();

        static {
            Covode.recordClassIndex(89786);
        }

        C76790e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C50649a> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$f */
    static final class C76791f extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76791f f172373a = new C76791f();

        static {
            Covode.recordClassIndex(89787);
        }

        C76791f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$g */
    static final class C76792g extends AbstractC89220m implements AbstractC89171a<C1213t<Void>> {

        /* renamed from: a */
        public static final C76792g f172374a = new C76792g();

        static {
            Covode.recordClassIndex(89788);
        }

        C76792g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Void> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$h */
    static final class C76793h extends AbstractC89220m implements AbstractC89171a<C1213t<Void>> {

        /* renamed from: a */
        public static final C76793h f172375a = new C76793h();

        static {
            Covode.recordClassIndex(89789);
        }

        C76793h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Void> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$i */
    static final class C76794i extends AbstractC89220m implements AbstractC89171a<C1213t<Void>> {

        /* renamed from: a */
        public static final C76794i f172376a = new C76794i();

        static {
            Covode.recordClassIndex(89790);
        }

        C76794i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Void> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$k */
    static final class C76797k extends AbstractC89220m implements AbstractC89171a<C88271g<C88292p>> {

        /* renamed from: a */
        public static final C76797k f172379a = new C76797k();

        static {
            Covode.recordClassIndex(89793);
        }

        C76797k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88271g<C88292p> invoke() {
            return new C88271g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$l */
    static final class C76798l extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC50706n>> {

        /* renamed from: a */
        public static final C76798l f172380a = new C76798l();

        static {
            Covode.recordClassIndex(89794);
        }

        C76798l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC50706n> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$m */
    static final class C76799m extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76799m f172381a = new C76799m();

        static {
            Covode.recordClassIndex(89795);
        }

        C76799m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$n */
    static final class C76800n extends AbstractC89220m implements AbstractC89171a<C1213t<Bitmap>> {

        /* renamed from: a */
        public static final C76800n f172382a = new C76800n();

        static {
            Covode.recordClassIndex(89796);
        }

        C76800n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Bitmap> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$o */
    static final class C76801o extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76801o f172383a = new C76801o();

        static {
            Covode.recordClassIndex(89797);
        }

        C76801o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$p */
    static final class C76802p extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76802p f172384a = new C76802p();

        static {
            Covode.recordClassIndex(89798);
        }

        C76802p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$x */
    static final class C76811x extends AbstractC89220m implements AbstractC89171a<C1213t<IAudioEffectParam>> {

        /* renamed from: a */
        public static final C76811x f172395a = new C76811x();

        static {
            Covode.recordClassIndex(89807);
        }

        C76811x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<IAudioEffectParam> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$y */
    static final class C76812y extends AbstractC89220m implements AbstractC89171a<C1213t<C89391z>> {

        /* renamed from: a */
        public static final C76812y f172396a = new C76812y();

        static {
            Covode.recordClassIndex(89808);
        }

        C76812y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89391z> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$z */
    static final class C76813z extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C76813z f172397a = new C76813z();

        static {
            Covode.recordClassIndex(89809);
        }

        C76813z() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c
    /* renamed from: Y */
    public final VideoPublishEditModel mo120450Y() {
        return m134358ac();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$j */
    static final class C76795j extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC50703k>> {

        /* renamed from: a */
        final /* synthetic */ C76761f f172377a;

        static {
            Covode.recordClassIndex(89791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76795j(C76761f fVar) {
            super(0);
            this.f172377a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC50703k> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(new C76796a(this));
            return tVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$j$a */
        public static final class C76796a implements AbstractC50703k {

            /* renamed from: a */
            final /* synthetic */ C76795j f172378a;

            static {
                Covode.recordClassIndex(89792);
            }

            C76796a(C76795j jVar) {
                this.f172378a = jVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
            /* renamed from: a */
            public final float mo23007a(FilterBean filterBean) {
                C89219l.m154721d(filterBean, "");
                float c = C50811a.m95161c(filterBean);
                if (c != 0.0f) {
                    return c;
                }
                AbstractC88181j d = this.f172378a.f172377a.mo114813d();
                String filterFolder = filterBean.getFilterFolder();
                C89219l.m154716b(filterFolder, "");
                return d.mo142719a(filterFolder);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: G */
    public final AbstractC14088a mo114782G() {
        VEEditClip c = C77134a.m134738c(this);
        if (c == null) {
            C89219l.m154715b();
        }
        return c.mo120643a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: J */
    public final void mo114785J() {
        C76617a.m134204a(mo114784I(), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: N */
    public final void mo114789N() {
        C76617a.m134204a(mo114788M(), C89391z.f203057a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: P */
    public final void mo114791P() {
        C76617a.m134204a(mo114790O(), C89391z.f203057a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final ViewGroup.MarginLayoutParams mo114795a() {
        ViewGroup.LayoutParams layoutParams = m134356aa().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: b */
    public final int mo114807b() {
        return m134356aa().getWidth();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: c */
    public final int mo114810c() {
        return m134356aa().getHeight();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: d */
    public final AbstractC88181j mo114813d() {
        VEEditClip c = C77134a.m134738c(this);
        if (c == null) {
            C89219l.m154715b();
        }
        return c.mo120644b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: o */
    public final void mo114826o() {
        AbstractC88181j a = C77134a.m134736a(this);
        if (a != null) {
            a.mo142747g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: z */
    public final void mo114837z() {
        C76617a.m134204a(mo114836y(), true);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$v */
    static final class C76808v implements AbstractC88176f.AbstractC88177a {

        /* renamed from: a */
        final /* synthetic */ C76761f f172390a;

        /* renamed from: b */
        final /* synthetic */ C76758d f172391b;

        /* renamed from: c */
        final /* synthetic */ C76756b f172392c;

        static {
            Covode.recordClassIndex(89804);
        }

        C76808v(C76761f fVar, C76758d dVar, C76756b bVar) {
            this.f172390a = fVar;
            this.f172391b = dVar;
            this.f172392c = bVar;
        }

        @Override // dmt.p4542av.video.p4545b.AbstractC88176f.AbstractC88177a
        /* renamed from: a */
        public final void mo114869a() {
            EditPreviewInfo previewMediaInfo;
            int i;
            StoryEditClipModel d = C77134a.m134739d(this.f172390a);
            if (!(d == null || (previewMediaInfo = d.getPreviewMediaInfo()) == null)) {
                AbstractC31071f b = C77134a.m134737b(this.f172390a);
                if (b != null) {
                    i = b.mo56368j();
                } else {
                    i = 0;
                }
                previewMediaInfo.setPreviewVideoLength(i);
            }
            if (!this.f172390a.f172321c) {
                this.f172390a.f172321c = true;
                C76617a.m134205b(this.f172390a.mo114816e(), null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: H */
    public final FrameLayout mo114783H() {
        MethodCollector.m26663i(6889);
        ViewParent parent = m134356aa().getParent();
        if (!(parent instanceof FrameLayout)) {
            parent = null;
        }
        FrameLayout frameLayout = (FrameLayout) parent;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(C2556g.m7473b(this));
        }
        MethodCollector.m26664o(6889);
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c
    /* renamed from: Z */
    public final void mo120451Z() {
        VEEditClip vEEditClip = (VEEditClip) C77118b.m134706a(cF_());
        if (vEEditClip != null) {
            C33398a.f79357a.mo59450a(m134356aa(), m134357ab().mo120775a(vEEditClip.f172984g).mo112106a(), m134357ab().mo120775a(vEEditClip.f172984g).mo112109b());
            C76617a.m134204a(mo120449X(), C89391z.f203057a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        C76758d dVar = new C76758d(getDiContainer(), new C76809w(this));
        C76756b bVar = new C76756b(getDiContainer());
        Iterator<T> it = mo120448W().getClips().iterator();
        while (it.hasNext()) {
            VEEditClipCluster cE_ = cF_();
            VEEditClip vEEditClip = new VEEditClip(C2556g.m7473b(this), this, dVar, bVar, mo120448W(), it.next(), m134356aa());
            vEEditClip.f172978a = new C76808v(this, dVar, bVar);
            cE_.add(vEEditClip, -1);
        }
        VEEditClipCluster cE_2 = cF_();
        C89219l.m154721d(cE_2, "");
        List clips = cE_2.mo120639a().getClips();
        if ((!clips.isEmpty()) && clips != null) {
            cE_2.mo120640a((AbstractC77128g) clips.get(0));
        }
        mo114821j().observe(this, new C76803q(this));
        mo114833v().observe(this, new C76804r(this));
        m134359ad().observe(this, new C76805s(this));
        mo114835x().observe(this, new C76806t(this));
        ((LiveData) this.f172313ad.getValue()).observe(this, new C76807u(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: b */
    public final void mo114808b(int i) {
        this.f172318ai = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$r */
    static final class C76804r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76761f f172386a;

        static {
            Covode.recordClassIndex(89800);
        }

        C76804r(C76761f fVar) {
            this.f172386a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88296t tVar = (C88296t) obj;
            AbstractC88181j d = this.f172386a.mo114813d();
            C89219l.m154716b(tVar, "");
            d.mo142736a(tVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$s */
    static final class C76805s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76761f f172387a;

        static {
            Covode.recordClassIndex(89801);
        }

        C76805s(C76761f fVar) {
            this.f172387a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            VEVolumeChangeOp vEVolumeChangeOp = (VEVolumeChangeOp) obj;
            AbstractC88181j d = this.f172387a.mo114813d();
            C89219l.m154716b(vEVolumeChangeOp, "");
            d.mo142732a(vEVolumeChangeOp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$t */
    static final class C76806t<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76761f f172388a;

        static {
            Covode.recordClassIndex(89802);
        }

        C76806t(C76761f fVar) {
            this.f172388a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88295s sVar = (C88295s) obj;
            AbstractC88181j d = this.f172388a.mo114813d();
            C89219l.m154716b(sVar, "");
            d.mo142735a(sVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$w */
    static final class C76809w extends AbstractC89220m implements AbstractC89172b<AbstractC88181j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76761f f172393a;

        static {
            Covode.recordClassIndex(89805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76809w(C76761f fVar) {
            super(1);
            this.f172393a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC88181j jVar) {
            AbstractC88181j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            jVar2.f200163x = new VEListener.AbstractC85253v(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.p4029b.C76761f.C76809w.C768101 */

                /* renamed from: a */
                final /* synthetic */ C76809w f172394a;

                static {
                    Covode.recordClassIndex(89806);
                }

                {
                    this.f172394a = r1;
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85253v
                /* renamed from: a */
                public final void mo56396a() {
                    long j;
                    long j2;
                    ETParams etParams;
                    ETParams etParams2;
                    if (this.f172394a.f172393a.f172320b.compareAndSet(false, true)) {
                        StoryEditModel W = this.f172394a.f172393a.mo120448W();
                        C89219l.m154721d(W, "");
                        EditContext editContext = W.getEditContext();
                        if (editContext == null || (etParams2 = editContext.getEtParams()) == null) {
                            j = 0;
                        } else {
                            j = etParams2.getStartTime();
                        }
                        EditContext editContext2 = W.getEditContext();
                        if (editContext2 == null || (etParams = editContext2.getEtParams()) == null) {
                            j2 = 0;
                        } else {
                            j2 = etParams.getCompileTime();
                        }
                        if (j > 0) {
                            C76748b.m134344a("first_frame_display_on_edit_page", W, new C76748b.C76751c(System.currentTimeMillis() - j, j2));
                        }
                        C63244g.m114602a().mo73287o().mo104788h().mo104819a();
                        C72595ac.m128075a();
                        C63244g.m114602a().mo73287o().mo104781a();
                        C63244g.m114602a().mo73287o().mo104797q().mo104812a();
                        C76617a.m134205b(this.f172394a.f172393a.mo114817f(), null);
                    }
                }
            };
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114796a(int i) {
        AbstractC88181j a = C77134a.m134736a(this);
        if (a != null) {
            a.f200148i = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: c */
    public final void mo114811c(int i) {
        C76617a.m134204a(mo114792Q(), Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: d */
    public final void mo114814d(int i) {
        C76617a.m134204a(mo114793R(), Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$q */
    static final class C76803q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76761f f172385a;

        static {
            Covode.recordClassIndex(89799);
        }

        C76803q(C76761f fVar) {
            this.f172385a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC88181j a;
            C50649a aVar = (C50649a) obj;
            C76761f fVar = this.f172385a;
            if (aVar != null && (a = C77134a.m134736a(fVar)) != null) {
                if (!aVar.f116986c) {
                    a.mo142731a(aVar.f116985b, false);
                } else if (aVar.f116985b != null) {
                    a.mo142721a(aVar.f116985b, aVar.f116987d);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$u */
    static final class C76807u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76761f f172389a;

        static {
            Covode.recordClassIndex(89803);
        }

        C76807u(C76761f fVar) {
            this.f172389a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f b;
            C88299v vVar = (C88299v) obj;
            if (!(this.f172389a.f172322d == null || (b = C77134a.m134737b(this.f172389a)) == null)) {
                C72462a aVar = this.f172389a.f172322d;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                b.mo56359g(aVar.f162446a);
            }
            AbstractC88181j d = this.f172389a.mo114813d();
            C89219l.m154716b(vVar, "");
            d.mo142737a(vVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: b */
    public final void mo114809b(boolean z) {
        FilterBean filterBean;
        AbstractC88181j a = C77134a.m134736a(this);
        if (a != null) {
            C50649a value = mo114821j().getValue();
            if (value != null) {
                filterBean = value.f116985b;
            } else {
                filterBean = null;
            }
            a.mo142740b(filterBean, false);
        }
        this.f172325h = C50687a.m94974a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: c */
    public final void mo114812c(boolean z) {
        C76617a.m134204a((LiveData) this.f172316ag.getValue(), Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: d */
    public final void mo114815d(boolean z) {
        C76617a.m134204a(mo114794S(), Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114799a(C50649a aVar) {
        C89219l.m154721d(aVar, "");
        C76617a.m134204a(mo114821j(), aVar);
        FilterBean filterBean = aVar.f116985b;
        if (filterBean != null) {
            this.f172325h = filterBean;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76761f(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114800a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        C76617a.m134204a(m134359ad(), vEVolumeChangeOp);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d
    /* renamed from: a */
    public final /* synthetic */ void mo120452a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120452a(vEEditClip2);
        C76740a.m134323b(vEEditClip2.f172984g, m134358ac());
        if (this.f172324g) {
            C76617a.m134204a(mo114818g(), m134356aa());
            C76617a.m134204a(mo120447T(), C89391z.f203057a);
            this.f172324g = false;
        }
        C76617a.m134205b(mo114821j(), new C50649a(true, C77148a.m134749a(vEEditClip2.f172984g, ((AbstractC50651a) this.f172327j.mo23374a(this, f172283a[1])).mo86006d())));
        C76617a.m134204a(mo114778C(), C77134a.m134735a(vEEditClip2));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114801a(C88288n nVar) {
        C89219l.m154721d(nVar, "");
        AbstractC88181j a = C77134a.m134736a(this);
        if (a != null) {
            a.mo142727a(this.f172331n, nVar, this.f172332o.f162625e.invoke());
        }
        this.f172331n = nVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114802a(C88295s sVar) {
        C89219l.m154721d(sVar, "");
        C76617a.m134204a(mo114835x(), sVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114797a(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        C89219l.m154721d(vEBaseFilterParam, "");
        AbstractC31071f b = C77134a.m134737b(this);
        if (b != null) {
            b.mo56324b(i, i2, vEBaseFilterParam);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114798a(FilterBean filterBean, FilterBean filterBean2, float f) {
        float f2;
        if (filterBean != null && filterBean2 != null) {
            if (f < 0.0f) {
                f2 = Math.abs(f);
            } else {
                f2 = 1.0f - f;
            }
            AbstractC31071f b = C77134a.m134737b(this);
            if (b != null) {
                b.mo56289a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f2);
            }
        }
    }
}
