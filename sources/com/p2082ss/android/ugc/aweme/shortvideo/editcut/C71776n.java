package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70095p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71415d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71558b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72449g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73962ap;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.n */
public final class C71776n implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f160827a = {new C89232y(C71776n.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C71776n.class, "editAdjustModel", "getEditAdjustModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new C89232y(C71776n.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new C89232y(C71776n.class, "musicSyncController", "getMusicSyncController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditMusicSyncController;", 0), new C89232y(C71776n.class, "videoImageMixedPresenter", "getVideoImageMixedPresenter()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/videoimagemixed/VideoImageMixedPresenter;", 0), new C89232y(C71776n.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new C89232y(C71776n.class, "cutVideoSpeedViewModel", "getCutVideoSpeedViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSpeedViewModel;", 0), new C89232y(C71776n.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0)};

    /* renamed from: A */
    private final AbstractC89248d f160828A = C21572a.m40504a(getDiContainer(), CutVideoSpeedViewModel.class);

    /* renamed from: B */
    private final AbstractC89248d f160829B = C21572a.m40504a(getDiContainer(), AbstractC71793q.class);

    /* renamed from: C */
    private int f160830C;

    /* renamed from: D */
    private final C21582f f160831D;

    /* renamed from: b */
    public boolean f160832b;

    /* renamed from: c */
    public float f160833c = 1.0f;

    /* renamed from: d */
    public float f160834d = -1.0f;

    /* renamed from: e */
    boolean f160835e;

    /* renamed from: f */
    AbstractC31071f f160836f;

    /* renamed from: g */
    public AbstractC70076i f160837g;

    /* renamed from: h */
    C89378p<Integer, Integer> f160838h;

    /* renamed from: i */
    MultiEditVideoRecordData f160839i;

    /* renamed from: j */
    MultiEditVideoRecordData f160840j;

    /* renamed from: k */
    MultiEditVideoRecordData f160841k;

    /* renamed from: l */
    ArrayList<TimeSpeedModelExtension> f160842l;

    /* renamed from: m */
    ArrayList<TimeSpeedModelExtension> f160843m;

    /* renamed from: n */
    ArrayList<TimeSpeedModelExtension> f160844n;

    /* renamed from: o */
    ArrayList<TimeSpeedModelExtension> f160845o;

    /* renamed from: p */
    final AbstractC89248d f160846p = C21572a.m40504a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: q */
    float f160847q = 1.0f;

    /* renamed from: r */
    C89378p<Long, Long> f160848r;

    /* renamed from: s */
    C89378p<Long, Long> f160849s;

    /* renamed from: t */
    boolean f160850t;

    /* renamed from: u */
    private final AbstractC89244h f160851u = C89250i.m154773a((AbstractC89171a) new C71777a(this));

    /* renamed from: v */
    private final AbstractC89248d f160852v = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: w */
    private final AbstractC89248d f160853w = C21572a.m40504a(getDiContainer(), C71557a.class);

    /* renamed from: x */
    private final AbstractC89248d f160854x = C21572a.m40504a(getDiContainer(), C71780o.class);

    /* renamed from: y */
    private final AbstractC89248d f160855y = C21572a.m40504a(getDiContainer(), C72449g.class);

    /* renamed from: z */
    private final AbstractC89248d f160856z = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    static {
        Covode.recordClassIndex(84321);
    }

    /* renamed from: n */
    private final CutVideoSpeedViewModel m126701n() {
        return (CutVideoSpeedViewModel) this.f160828A.mo23374a(this, f160827a[6]);
    }

    /* renamed from: c */
    public final List<VideoSegment> mo113428c() {
        return (List) this.f160851u.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final VideoPublishEditModel mo113430e() {
        return (VideoPublishEditModel) this.f160852v.mo23374a(this, f160827a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C71557a mo113431f() {
        return (C71557a) this.f160853w.mo23374a(this, f160827a[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C71780o mo113432g() {
        return (C71780o) this.f160854x.mo23374a(this, f160827a[3]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C72449g mo113433h() {
        return (C72449g) this.f160855y.mo23374a(this, f160827a[4]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final EditAdjustClipsBottomViewModel mo113434i() {
        return (EditAdjustClipsBottomViewModel) this.f160856z.mo23374a(this, f160827a[5]);
    }

    /* renamed from: j */
    public final AbstractC71793q mo113435j() {
        return (AbstractC71793q) this.f160829B.mo23374a(this, f160827a[7]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f160831D;
    }

    /* renamed from: a */
    public final void mo113425a(boolean z, boolean z2) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        AbstractC31071f fVar;
        ArrayList<TimeSpeedModelExtension> arrayList;
        this.f160850t = false;
        if ((!z || (multiEditVideoRecordData = this.f160841k) == null) && (multiEditVideoRecordData = this.f160839i) == null) {
            C89219l.m154710a("restoreRecordData");
        }
        ArrayList<TimeSpeedModelExtension> arrayList2 = (!z || (arrayList = this.f160844n) == null || arrayList.isEmpty()) ? this.f160843m : this.f160844n;
        boolean z3 = mo113429d().hasRetake;
        mo113430e().multiEditVideoRecordData.curMultiEditVideoRecordData = C71429d.m126153a(multiEditVideoRecordData, mo113429d());
        mo113430e().multiEditVideoRecordData.isMultiEditRetake = false;
        mo113429d().hasRetake = z3;
        List g = arrayList2 != null ? C89070n.m154585g((Collection) arrayList2) : null;
        if (!(g instanceof ArrayList)) {
            g = null;
        }
        this.f160845o = (ArrayList) g;
        List<VideoSegment> c = mo113428c();
        if (C89206ad.m154681c(c) && c != null) {
            c.clear();
            c.addAll(C71493a.m126280c(mo113429d()));
        }
        if (!mo113431f().f160355b) {
            CutVideoSpeedViewModel n = m126701n();
            List<MultiEditVideoSegmentRecordData> list = mo113429d().segmentDataList;
            C89219l.m154716b(list, "");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list, 0);
            EnumC78601i fromValue = EnumC78601i.fromValue(multiEditVideoSegmentRecordData != null ? multiEditVideoSegmentRecordData.getVideoSpeed() : 1.0f);
            C89219l.m154716b(fromValue, "");
            n.mo110750a(fromValue);
        }
        if (z2) {
            AbstractC70076i iVar = this.f160837g;
            if (!(iVar instanceof C71688d)) {
                iVar = null;
            }
            C71688d dVar = (C71688d) iVar;
            if (dVar != null) {
                AbstractC70076i.C70077a.m123718a(dVar, true, null, 2);
            }
            if (this.f160835e && (fVar = this.f160836f) != null) {
                fVar.mo56247H();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.n$a */
    static final class C71777a extends AbstractC89220m implements AbstractC89171a<List<VideoSegment>> {

        /* renamed from: a */
        final /* synthetic */ C71776n f160857a;

        static {
            Covode.recordClassIndex(84322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71777a(C71776n nVar) {
            super(0);
            this.f160857a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<VideoSegment> invoke() {
            return C89070n.m154585g((Collection) C71493a.m126280c(this.f160857a.mo113429d()));
        }
    }

    /* renamed from: d */
    public final MultiEditVideoRecordData mo113429d() {
        MultiEditVideoRecordData multiEditVideoRecordData = mo113431f().f160357d.curMultiEditVideoRecordData;
        C89219l.m154716b(multiEditVideoRecordData, "");
        return multiEditVideoRecordData;
    }

    /* renamed from: a */
    public final long mo113418a() {
        return Math.min(m126700m(), C70095p.m123775a());
    }

    /* renamed from: b */
    public final long mo113426b() {
        Iterator<T> it = mo113428c().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().f156710b;
        }
        return j;
    }

    /* renamed from: l */
    public final void mo113437l() {
        EffectPointModel effectPointModel;
        if (C70976bp.m125322r(mo113430e()) && (effectPointModel = mo113430e().mTimeEffect) != null) {
            int index = effectPointModel.getIndex();
            AbstractC31071f fVar = this.f160836f;
            if (fVar != null) {
                fVar.mo56389t(index);
            }
        }
    }

    /* renamed from: m */
    private final long m126700m() {
        List<MultiEditVideoSegmentRecordData> list = mo113429d().segmentDataList;
        C89219l.m154716b(list, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        long j = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList) {
            C89219l.m154716b(multiEditVideoSegmentRecordData, "");
            j += (long) ((int) (((float) (multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime())) / multiEditVideoSegmentRecordData.getVideoSpeed()));
        }
        return j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.vesdk.filterparam.VERepeatFilterParam */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void mo113436k() {
        EffectPointModel effectPointModel;
        AbstractC31071f fVar;
        AbstractC31071f fVar2;
        if (C70976bp.m125322r(mo113430e()) && (effectPointModel = mo113430e().mTimeEffect) != null) {
            VESlowMotionFilterParam vESlowMotionFilterParam = null;
            int startPoint = effectPointModel.getStartPoint();
            int endPoint = effectPointModel.getEndPoint() - effectPointModel.getStartPoint();
            if (C89219l.m154714a((Object) effectPointModel.getKey(), (Object) "2")) {
                VERepeatFilterParam vERepeatFilterParam = new VERepeatFilterParam();
                vERepeatFilterParam.seqIn = startPoint;
                vERepeatFilterParam.repeatDuration = endPoint;
                vERepeatFilterParam.repeatTime = 3;
                vERepeatFilterParam.timeMode = C85581w.EnumC85609h.EDITOR_SLOMO_MODE.ordinal();
                vESlowMotionFilterParam = vERepeatFilterParam;
            } else if (C89219l.m154714a((Object) effectPointModel.getKey(), (Object) "3")) {
                VESlowMotionFilterParam vESlowMotionFilterParam2 = new VESlowMotionFilterParam();
                vESlowMotionFilterParam2.seqIn = startPoint;
                vESlowMotionFilterParam2.slowMotionDuration = endPoint;
                vESlowMotionFilterParam2.slowMotionSpeed = 0.5f;
                vESlowMotionFilterParam2.timeMode = C85581w.EnumC85609h.EDITOR_SLOMO_MODE.ordinal();
                vESlowMotionFilterParam = vESlowMotionFilterParam2;
            }
            int i = -1;
            if (!(vESlowMotionFilterParam == null || (fVar = this.f160836f) == null)) {
                i = fVar.mo56279a(vESlowMotionFilterParam);
            }
            effectPointModel.setIndex(i);
            if (this.f160835e && (fVar2 = this.f160836f) != null) {
                fVar2.mo56247H();
            }
        }
    }

    /* renamed from: o */
    private final void m126702o() {
        long j;
        long j2;
        boolean z;
        List list;
        C89378p<Long, Long> pVar = this.f160848r;
        C89378p<Long, Long> pVar2 = this.f160849s;
        List list2 = null;
        if (!this.f160835e) {
            if (mo113431f().f160355b) {
                C71493a.m126276a(mo113429d(), mo113428c());
            } else {
                List<MultiEditVideoSegmentRecordData> list3 = mo113429d().segmentDataList;
                C89219l.m154716b(list3, "");
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list3, 0);
                if (multiEditVideoSegmentRecordData != null) {
                    multiEditVideoSegmentRecordData.setStartTime(0);
                    multiEditVideoSegmentRecordData.setEndTime(multiEditVideoSegmentRecordData.videoLength / 1000);
                }
            }
            AbstractC70076i iVar = this.f160837g;
            if (!(iVar instanceof C71688d)) {
                iVar = null;
            }
            C71688d dVar = (C71688d) iVar;
            if (dVar != null) {
                dVar.mo110541a(true, pVar);
            }
        }
        if (!this.f160850t) {
            MultiEditVideoRecordData d = mo113429d();
            MultiEditVideoRecordData multiEditVideoRecordData = this.f160839i;
            if (multiEditVideoRecordData == null) {
                C89219l.m154710a("restoreRecordData");
            }
            C71429d.m126153a(d, multiEditVideoRecordData);
            ArrayList<TimeSpeedModelExtension> arrayList = this.f160845o;
            if (arrayList != null) {
                list = C89070n.m154585g((Collection) arrayList);
            } else {
                list = null;
            }
            this.f160843m = (ArrayList) list;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = mo113430e().multiEditVideoRecordData;
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.f160845o;
            if (arrayList2 != null) {
                list2 = C89070n.m154585g((Collection) arrayList2);
            }
            multiEditVideoStatusRecordData.editSegments = (ArrayList) list2;
        }
        if (this.f160835e || pVar2 == null) {
            j = 0;
        } else {
            j = pVar2.getFirst().longValue();
        }
        if (this.f160835e || pVar2 == null) {
            j2 = 0;
        } else {
            j2 = pVar2.getSecond().longValue() - pVar2.getFirst().longValue();
        }
        EditAdjustClipsBottomViewModel i = mo113434i();
        if (mo113428c().size() > 1) {
            z = true;
        } else {
            z = false;
        }
        i.mo113267a(new C71796s(z, j, j2));
        if (pVar != null) {
            mo113427b(pVar);
        }
        AbstractC71793q.C71794a.m126761a(mo113435j(), -1, null, false, 6);
    }

    /* renamed from: p */
    private final void m126703p() {
        boolean z;
        int i = 0;
        if (!mo113430e().mIsFromDraft || mo113430e().mFromCut) {
            z = false;
        } else {
            z = true;
        }
        mo113430e().setPreviewInfo(new C71415d(mo113430e().getPreviewInfo().getPreviewWidth(), mo113430e().getPreviewInfo().getPreviewHeight(), true, mo113430e().getPreviewInfo().getReverseAudioArray(), mo113430e().getPreviewInfo().getReverseVideoArray(), z, null, 268).mo113020a(mo113429d()));
        if (mo113430e().mFromCut) {
            VideoPublishEditModel e = mo113430e();
            List<EditVideoSegment> videoList = mo113430e().getPreviewInfo().getVideoList();
            if (!(videoList instanceof Collection) || !videoList.isEmpty()) {
                Iterator<T> it = videoList.iterator();
                while (it.hasNext()) {
                    if (C84896h.m145866a(it.next().getVideoPath(), true) && (i = i + 1) < 0) {
                        C89070n.m154523b();
                    }
                }
            }
            e.photoCount = i;
            mo113430e().videoCount = mo113430e().getPreviewInfo().getVideoList().size() - mo113430e().photoCount;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.n$b */
    static final class C71778b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C71776n f160858a;

        /* renamed from: b */
        final /* synthetic */ int f160859b = 0;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f160860c;

        /* renamed from: d */
        final /* synthetic */ float f160861d;

        /* renamed from: e */
        final /* synthetic */ int f160862e;

        /* renamed from: f */
        final /* synthetic */ int f160863f;

        /* renamed from: g */
        final /* synthetic */ int f160864g;

        /* renamed from: h */
        final /* synthetic */ float f160865h;

        /* renamed from: i */
        final /* synthetic */ int f160866i;

        /* renamed from: j */
        final /* synthetic */ C89378p f160867j;

        static {
            Covode.recordClassIndex(84323);
        }

        C71778b(C71776n nVar, C89233z.C89235b bVar, float f, int i, int i2, float f2, int i3, C89378p pVar) {
            this.f160858a = nVar;
            this.f160860c = bVar;
            this.f160861d = f;
            this.f160862e = 0;
            this.f160863f = i;
            this.f160864g = i2;
            this.f160865h = f2;
            this.f160866i = i3;
            this.f160867j = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            AbstractC70076i iVar = this.f160858a.f160837g;
            if (iVar != null) {
                iVar.mo110543a((90.0f * animatedFraction) + ((float) this.f160859b), (this.f160861d * animatedFraction) + this.f160860c.element, this.f160860c.element + (this.f160861d * animatedFraction), this.f160862e, this.f160863f);
            }
        }
    }

    public C71776n(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f160831D = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.n$c */
    public static final class C71779c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C71776n f160868a;

        /* renamed from: b */
        final /* synthetic */ int f160869b = 0;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f160870c;

        /* renamed from: d */
        final /* synthetic */ float f160871d;

        /* renamed from: e */
        final /* synthetic */ int f160872e;

        /* renamed from: f */
        final /* synthetic */ int f160873f;

        /* renamed from: g */
        final /* synthetic */ int f160874g;

        /* renamed from: h */
        final /* synthetic */ float f160875h;

        /* renamed from: i */
        final /* synthetic */ int f160876i;

        /* renamed from: j */
        final /* synthetic */ C89378p f160877j;

        static {
            Covode.recordClassIndex(84324);
        }

        public final void onAnimationEnd(Animator animator) {
            float f;
            AbstractC31071f fVar;
            super.onAnimationEnd(animator);
            long a = this.f160868a.mo113435j().mo113312a();
            C71776n nVar = this.f160868a;
            ((CutMultiVideoViewModel) nVar.f160846p.mo23374a(nVar, C71776n.f160827a[2])).mo110478b();
            AbstractC31071f fVar2 = this.f160868a.f160836f;
            if (fVar2 != null) {
                f = ((float) C71494b.f160201c) / ((float) fVar2.mo56330b().width);
            } else {
                f = 1.0f;
            }
            if (!C73962ap.m130083a(-1.0f, this.f160868a.f160834d, 1.0E-5f) && !C73962ap.m130083a(this.f160868a.f160834d, f, 1.0E-5f)) {
                C71776n nVar2 = this.f160868a;
                nVar2.mo113419a(this.f160874g, (this.f160875h * f) / nVar2.f160834d);
                this.f160868a.f160834d = f;
            }
            int i = (this.f160876i + 90) % 360;
            AbstractC70076i iVar = this.f160868a.f160837g;
            if (iVar != null) {
                iVar.mo110546b(this.f160874g, i);
            }
            C71776n nVar3 = this.f160868a;
            if (C71494b.f160202d > 0 && C71494b.f160201c > 0 && C71494b.f160199a >= 0 && C71494b.f160200b >= 0 && (fVar = nVar3.f160836f) != null) {
                fVar.mo56303a(C71494b.f160199a, C71494b.f160200b, C71494b.f160201c, C71494b.f160202d);
            }
            AbstractC70076i iVar2 = this.f160868a.f160837g;
            if (iVar2 != null) {
                iVar2.mo110547c((int) ((Number) this.f160877j.getFirst()).longValue(), (int) ((Number) this.f160877j.getSecond()).longValue());
            }
            AbstractC71793q.C71794a.m126761a(this.f160868a.mo113435j(), a, null, false, 6);
        }

        C71779c(C71776n nVar, C89233z.C89235b bVar, float f, int i, int i2, float f2, int i3, C89378p pVar) {
            this.f160868a = nVar;
            this.f160870c = bVar;
            this.f160871d = f;
            this.f160872e = 0;
            this.f160873f = i;
            this.f160874g = i2;
            this.f160875h = f2;
            this.f160876i = i3;
            this.f160877j = pVar;
        }
    }

    /* renamed from: b */
    public final void mo113427b(C89378p<Long, Long> pVar) {
        float videoSpeed;
        C89219l.m154721d(pVar, "");
        if (!this.f160835e) {
            Integer editState = mo113434i().mo113264a().getEditState();
            if (editState == null || editState.intValue() != 2) {
                if (mo113431f().f160355b) {
                    videoSpeed = 1.0f;
                } else {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = mo113429d().segmentDataList.get(0);
                    C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                    videoSpeed = multiEditVideoSegmentRecordData.getVideoSpeed();
                }
                m126698a((int) (pVar.getFirst().floatValue() / videoSpeed), (int) (pVar.getSecond().floatValue() / videoSpeed));
            } else if (!C71558b.m126458a(mo113431f())) {
                mo113420a(this.f160830C, (int) pVar.getFirst().longValue(), (int) (pVar.getSecond().longValue() - pVar.getFirst().longValue()));
            }
        }
    }

    /* renamed from: a */
    public final void mo113421a(C89378p<Long, Long> pVar) {
        C89378p<Long, Long> pVar2 = pVar;
        if (pVar2 == null) {
            pVar2 = this.f160848r;
        }
        long j = 0;
        if (pVar2 != null) {
            if (!this.f160835e) {
                long m = m126700m();
                if (pVar2.getFirst().longValue() == 0 && pVar2.getSecond().longValue() == m) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = mo113430e().multiEditVideoRecordData;
                    if (!(multiEditVideoStatusRecordData == null || multiEditVideoStatusRecordData.editSegments == null)) {
                        multiEditVideoStatusRecordData.editCutSegments = new ArrayList<>(multiEditVideoStatusRecordData.editSegments);
                    }
                } else {
                    C71493a.m126275a(mo113429d(), pVar2.getFirst().longValue(), pVar2.getSecond().longValue());
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = mo113430e().multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData2 != null) {
                        C71493a.m126278a(multiEditVideoStatusRecordData2, pVar2.getFirst().longValue(), pVar2.getSecond().longValue());
                    }
                }
                AbstractC70076i iVar = this.f160837g;
                if (!(iVar instanceof C71688d)) {
                    iVar = null;
                }
                C71688d dVar = (C71688d) iVar;
                if (dVar != null) {
                    AbstractC70076i.C70077a.m123718a(dVar, false, null, 2);
                }
            } else {
                List<MultiEditVideoSegmentRecordData> list = mo113429d().segmentDataList;
                C89219l.m154716b(list, "");
                for (T t : list) {
                    MultiEditTrimState multiEditTrimState = t.multiEditTrimState;
                    t.multiEditTrimState = multiEditTrimState != null ? MultiEditTrimState.copy$default(multiEditTrimState, t.enable, 0, 0, 6, null) : null;
                }
            }
        }
        mo113429d().startTime = 0;
        List<MultiEditVideoSegmentRecordData> list2 = mo113429d().segmentDataList;
        C89219l.m154716b(list2, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (T t2 : list2) {
            if (t2.enable) {
                arrayList.add(t2);
            }
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList) {
            C89219l.m154716b(multiEditVideoSegmentRecordData, "");
            j += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
        }
        mo113429d().endTime = j;
    }

    /* renamed from: a */
    public final void mo113419a(int i, float f) {
        List<MultiEditVideoSegmentRecordData> list = mo113429d().segmentDataList;
        C89219l.m154716b(list, "");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list, i);
        if (multiEditVideoSegmentRecordData != null) {
            multiEditVideoSegmentRecordData.scale = f;
        }
    }

    /* renamed from: a */
    private void m126698a(int i, int i2) {
        int i3;
        if (mo113429d().musicIndex != -1) {
            if (i2 <= 0) {
                i3 = (int) mo113418a();
            } else {
                i3 = i2;
            }
            AbstractC31071f fVar = this.f160836f;
            if (fVar != null && i2 > fVar.mo56368j()) {
                i3 = fVar.mo56368j();
            }
            int i4 = i3 - i;
            if (i4 > mo113429d().musicDuration) {
                i4 = mo113429d().musicDuration;
            }
            AbstractC31071f fVar2 = this.f160836f;
            if (fVar2 != null) {
                fVar2.mo56256a(mo113429d().musicIndex, mo113429d().musicTrimIn, mo113429d().musicTrimIn + i4, i, i + i4, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo113422a(C89378p<Long, Long> pVar, C89378p<Long, Long> pVar2) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(pVar2, "");
        this.f160850t = false;
        this.f160848r = pVar;
        this.f160849s = pVar2;
        mo113421a(pVar);
        mo113430e().multiEditVideoRecordData.isMultiEditRetake = false;
        mo113430e().multiEditVideoRecordData.adjustClipsState = new EditAdjustClipsState(this.f160848r, pVar2);
        m126703p();
    }

    /* renamed from: a */
    public final void mo113423a(boolean z, AbstractC89171a<C89378p<Long, Long>> aVar) {
        C89378p<Long, Long> pVar;
        if (z) {
            if (this.f160848r == null) {
                if (aVar != null) {
                    pVar = aVar.invoke();
                } else {
                    pVar = null;
                }
                this.f160848r = pVar;
            }
            m126702o();
        }
    }

    /* renamed from: a */
    public final void mo113424a(boolean z, C89378p<Long, Long> pVar) {
        this.f160835e = z;
        Iterator<T> it = mo113428c().iterator();
        while (it.hasNext()) {
            it.next().f156723o = this.f160835e;
        }
        C71493a.m126276a(mo113429d(), mo113428c());
        mo113433h().f162428b = z;
        mo113433h().mo114724a(mo113428c());
        C71688d dVar = null;
        if (z) {
            AbstractC70076i iVar = this.f160837g;
            if (!(iVar instanceof C71688d)) {
                iVar = null;
            }
            C71688d dVar2 = (C71688d) iVar;
            if (dVar2 != null) {
                AbstractC70076i.C70077a.m123718a(dVar2, false, null, 3);
            }
            AbstractC71793q.C71794a.m126761a(mo113435j(), 0, null, false, 6);
            return;
        }
        AbstractC70076i iVar2 = this.f160837g;
        if (iVar2 instanceof C71688d) {
            dVar = iVar2;
        }
        C71688d dVar3 = dVar;
        if (dVar3 != null) {
            AbstractC70076i.C70077a.m123718a(dVar3, false, pVar, 1);
        }
        AbstractC71793q.C71794a.m126761a(mo113435j(), -1, null, false, 6);
    }

    /* renamed from: a */
    public static /* synthetic */ void m126699a(C71776n nVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        nVar.m126698a(0, i);
    }

    /* renamed from: a */
    public final void mo113420a(int i, int i2, int i3) {
        if (mo113429d().musicIndex != -1) {
            this.f160830C = i;
            int i4 = i + mo113429d().musicTrimIn;
            if (i4 > mo113429d().musicDuration) {
                i4 %= mo113429d().musicDuration;
            }
            AbstractC31071f fVar = this.f160836f;
            if (fVar != null) {
                fVar.mo56256a(mo113429d().musicIndex, i4, i4 + i3, i2, i2 + i3, false);
            }
        }
    }
}
