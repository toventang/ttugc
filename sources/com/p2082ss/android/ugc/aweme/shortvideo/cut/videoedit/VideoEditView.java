package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.C0699a;
import androidx.core.p036g.AbstractC0688a;
import androidx.core.p036g.C0692e;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.p2217f.C31096d;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70503u;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70087b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70088c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70089d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.C70517a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.tools.view.style.C84980f;
import com.p2082ss.android.ugc.tools.view.style.EnumC84965a;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView */
public class VideoEditView extends AbstractC70516a implements View.OnTouchListener {

    /* renamed from: A */
    public AudioTrackView f157585A;

    /* renamed from: B */
    View f157586B;

    /* renamed from: C */
    View f157587C;

    /* renamed from: D */
    C70520b f157588D;

    /* renamed from: E */
    C70520b f157589E;

    /* renamed from: F */
    C74297p f157590F;

    /* renamed from: G */
    protected float f157591G;

    /* renamed from: H */
    protected float f157592H;

    /* renamed from: I */
    protected int f157593I;

    /* renamed from: J */
    protected int f157594J;

    /* renamed from: K */
    protected int f157595K;

    /* renamed from: L */
    protected int f157596L;

    /* renamed from: M */
    protected boolean f157597M;

    /* renamed from: N */
    protected C70088c f157598N;

    /* renamed from: O */
    protected C70089d f157599O;

    /* renamed from: P */
    protected int f157600P;

    /* renamed from: Q */
    protected int f157601Q;

    /* renamed from: R */
    protected int f157602R;

    /* renamed from: S */
    protected int f157603S;

    /* renamed from: T */
    protected int f157604T;

    /* renamed from: U */
    private long f157605U;

    /* renamed from: V */
    private float f157606V;

    /* renamed from: W */
    private float f157607W;

    /* renamed from: aA */
    private boolean f157608aA;

    /* renamed from: aB */
    private boolean f157609aB;

    /* renamed from: aC */
    private long f157610aC;

    /* renamed from: aD */
    private float f157611aD;

    /* renamed from: aE */
    private RecyclerView.AbstractC1371n f157612aE;

    /* renamed from: aF */
    private boolean f157613aF;

    /* renamed from: aG */
    private boolean f157614aG;

    /* renamed from: aa */
    private float f157615aa;

    /* renamed from: ab */
    private boolean f157616ab;

    /* renamed from: ac */
    private boolean f157617ac;

    /* renamed from: ad */
    private C70542w f157618ad;

    /* renamed from: ae */
    private PopupWindow f157619ae;

    /* renamed from: af */
    private long f157620af;

    /* renamed from: ag */
    private int f157621ag;

    /* renamed from: ah */
    private int f157622ah;

    /* renamed from: ai */
    private int f157623ai;

    /* renamed from: aj */
    private boolean f157624aj;

    /* renamed from: ak */
    private boolean f157625ak;

    /* renamed from: al */
    private boolean f157626al;

    /* renamed from: am */
    private AbstractC31071f f157627am;

    /* renamed from: an */
    private C1213t<Bitmap> f157628an;

    /* renamed from: ao */
    private C1213t<Boolean> f157629ao;

    /* renamed from: ap */
    private boolean f157630ap;

    /* renamed from: aq */
    private boolean f157631aq;

    /* renamed from: ar */
    private int f157632ar;

    /* renamed from: as */
    private int f157633as;

    /* renamed from: at */
    private int f157634at;

    /* renamed from: au */
    private int f157635au;

    /* renamed from: av */
    private int f157636av;

    /* renamed from: aw */
    private int f157637aw;

    /* renamed from: ax */
    private int f157638ax;

    /* renamed from: ay */
    private int f157639ay;

    /* renamed from: az */
    private int f157640az;

    /* renamed from: b */
    private long f157641b;

    /* renamed from: c */
    protected int f157642c;

    /* renamed from: d */
    ActivityC0945e f157643d;

    /* renamed from: e */
    VideoEditViewModel f157644e;

    /* renamed from: f */
    CutMultiVideoViewModel f157645f;

    /* renamed from: g */
    protected RTLImageView f157646g;

    /* renamed from: h */
    protected RTLImageView f157647h;

    /* renamed from: i */
    protected TextView f157648i;

    /* renamed from: j */
    protected TextView f157649j;

    /* renamed from: k */
    protected FrameLayout.LayoutParams f157650k;

    /* renamed from: l */
    protected FrameLayout.LayoutParams f157651l;

    /* renamed from: m */
    protected View f157652m;

    /* renamed from: n */
    protected View f157653n;

    /* renamed from: o */
    protected View f157654o;

    /* renamed from: p */
    protected View f157655p;

    /* renamed from: q */
    protected View f157656q;

    /* renamed from: r */
    RTLLinearLayout f157657r;

    /* renamed from: s */
    ImageView f157658s;

    /* renamed from: t */
    protected boolean f157659t;

    /* renamed from: u */
    protected boolean f157660u;

    /* renamed from: v */
    protected boolean f157661v;

    /* renamed from: w */
    protected C70087b f157662w;

    /* renamed from: x */
    FrameLayout f157663x;

    /* renamed from: y */
    MVRecycleView f157664y;

    /* renamed from: z */
    MVRecycleView f157665z;

    static {
        Covode.recordClassIndex(82964);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public void mo111104a(List<VideoSegment> list) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public void mo111105a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: e */
    public void mo111108e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: f */
    public void mo111109f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getLeftSeekingValue() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getPlayingPosition() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getRightSeekingValue() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setDefaultMode(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setMultiEditEnableForStickPointMode(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: d */
    public boolean mo111107d() {
        return this.f157661v;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public int getEditState() {
        return this.f157594J;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public View getEndSlide() {
        return this.f157646g;
    }

    public int getFrameHeight() {
        return this.f157600P;
    }

    public int getFrameWidth() {
        return this.f157636av;
    }

    public int getLeftRightMargin() {
        return this.f157602R;
    }

    public long getMaxVideoLength() {
        return this.f157605U;
    }

    public long getMinVideoLength() {
        return this.f157641b;
    }

    public int getOverXScroll() {
        return this.f157593I;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public View getStartSlide() {
        return this.f157647h;
    }

    public AbstractC31071f getVeEditor() {
        return this.f157627am;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.f157644e;
    }

    public C70542w getViewConfig() {
        return this.f157618ad;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final boolean mo111140a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        MediaModel mediaModel;
        this.f157645f = cutMultiVideoViewModel;
        if (cutMultiVideoViewModel.f156539k) {
            mediaModel = new MediaModel(-1);
            mediaModel.f134662b = str;
            mediaModel.f134672l = 720;
            mediaModel.f134673m = 1280;
            mediaModel.f134668h = (long) cutMultiVideoViewModel.f156540l;
        } else {
            VEUtils.VEVideoFileInfo a = C70503u.m124367a(str);
            if (a == null) {
                return false;
            }
            mediaModel = new MediaModel(-1);
            mediaModel.f134662b = str;
            mediaModel.f134672l = a.width;
            mediaModel.f134673m = a.height;
            mediaModel.f134668h = (long) a.duration;
        }
        return mo111141a(eVar, cutMultiVideoViewModel, Collections.singletonList(mediaModel));
    }

    /* renamed from: a */
    public final boolean mo111139a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, C74297p pVar, List<MediaModel> list) {
        this.f157590F = pVar;
        return mo111141a(eVar, cutMultiVideoViewModel, list);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final boolean mo111141a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        return mo111138a(eVar, cutMultiVideoViewModel, null, C70528i.m124562a(list), list.size() > 1 ? 1 : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final boolean mo111138a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List<VideoSegment> list, int i) {
        this.f157594J = i;
        this.f157643d = eVar;
        this.f157645f = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.f157644e = (VideoEditViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        } else {
            this.f157644e = videoEditViewModel;
        }
        m124422a(cutMultiVideoViewModel, list);
        m124427s();
        this.f157625ak = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111134a(Long l) {
        float d;
        float f;
        float f2;
        if (l != null) {
            this.f157620af = l.longValue();
            C84401c.f188722f.mo123658a(C1764a.m5929a(Locale.getDefault(), "VEEffectSeekLayout->getOriginVideoPlayProgress: duration: %d", new Object[]{Long.valueOf(this.f157620af)}));
            int i = this.f157594J;
            long j = this.f157620af;
            if (!this.f157660u) {
                C84401c.f188722f.mo123658a(C1764a.m5929a(Locale.getDefault(), "VEEffectSeekLayout->updateCurPointerLocation: editState: %d, currentOriginProgress: %d", new Object[]{Integer.valueOf(i), Long.valueOf(j)}));
                if (!(j == -1 || j == 1)) {
                    float f3 = 0.0f;
                    if (i == 1) {
                        C70087b bVar = this.f157662w;
                        List<VideoSegment> k = this.f157644e.mo111232k();
                        float l2 = this.f157644e.mo111233l();
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < k.size(); i2++) {
                            if (!k.get(i2).f156717i) {
                                arrayList.add(k.get(i2));
                            }
                        }
                        long j2 = j;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                i3 = 0;
                                break;
                            }
                            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
                            long e = (long) (((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * l2));
                            if (j2 <= e) {
                                break;
                            }
                            f3 += ((float) e) / bVar.f156738e;
                            j2 -= e;
                            i3++;
                        }
                        if (!arrayList.isEmpty()) {
                            if (i3 != 0 || ((VideoSegment) arrayList.get(i3)).mo110578d() == 0) {
                                d = (float) (j2 - ((VideoSegment) arrayList.get(i3)).mo110578d());
                                f = l2 * ((VideoSegment) arrayList.get(i3)).mo110582f();
                                f2 = bVar.f156738e;
                            } else {
                                d = (float) j2;
                                f = l2 * ((VideoSegment) arrayList.get(i3)).mo110582f();
                                f2 = bVar.f156738e;
                            }
                            f3 += d / (f * f2);
                        }
                        f3 -= this.f157591G;
                    } else if (i == 2 || i == 0) {
                        f3 = ((((float) j) * 1.0f) / (this.f157599O.f156750d * this.f157662w.f156738e)) - this.f157591G;
                    }
                    this.f157647h.getStartX();
                    C84401c.f188722f.mo123658a("VEEffectSeekLayout->updateCurPointerLocation2: width = " + f3 + ";time = " + j + " startSlideX = " + this.f157647h.getStartX() + " startToZero = " + this.f157591G);
                    mo111130a(this.f157647h.getStartX() + f3, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo111102a(VideoSegment videoSegment) {
        this.f157594J = 1;
        this.f157644e.mo111208a(1);
        C70089d dVar = this.f157599O;
        if (dVar != null) {
            dVar.mo110593a();
        }
        C70088c cVar = this.f157598N;
        if (cVar != null) {
            cVar.mo110591a();
        }
        this.f157644e.mo111219b(videoSegment.mo110571a(true));
        this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
        int i = this.f157604T;
        mo111129a((float) i, (float) ((this.f157642c - i) - C70082m.f156702d), 0);
        mo111103a(videoSegment, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111133a(C0692e<Float, Float> eVar, boolean z) {
        if (z) {
            if (eVar.f2750a != null) {
                this.f157598N.f156744a = eVar.f2750a.floatValue();
            }
            if (eVar.f2751b != null) {
                this.f157598N.f156745b = eVar.f2751b.floatValue();
            }
            this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
            mo111129a(this.f157598N.f156744a, this.f157598N.f156745b, this.f157598N.f156746c);
            return;
        }
        mo111129a(eVar.f2750a.floatValue(), eVar.f2751b.floatValue(), 0);
        this.f157665z.postDelayed(new RunnableC70537r(this), 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111103a(VideoSegment videoSegment, int i) {
        this.f157664y.setVisibility(0);
        this.f157665z.setVisibility(8);
        this.f157589E.mo111240a();
        if (i == 2) {
            this.f157664y.mo4413b(0);
            this.f157588D.mo111243a(this.f157662w.f156735b);
            this.f157644e.mo111230i();
        } else if (i == 3) {
            this.f157664y.mo4413b(0);
            this.f157588D.mo111242a(videoSegment, this.f157662w.f156735b);
            this.f157644e.mo111212a(videoSegment);
        } else if (i == 1) {
            this.f157644e.mo111229h();
        }
    }

    /* renamed from: a */
    public void mo111101a(C0692e<Integer, Integer> eVar) {
        this.f157594J = 2;
        this.f157644e.mo111208a(2);
        this.f157596L = eVar.f2750a.intValue();
        this.f157595K = eVar.f2751b.intValue();
        VideoSegment videoSegment = this.f157644e.mo111232k().get(this.f157595K);
        C70089d dVar = this.f157599O;
        if (dVar == null) {
            this.f157599O = new C70089d(videoSegment);
        } else {
            dVar.mo110594a(videoSegment);
        }
        this.f157662w.mo110588a(videoSegment.f156710b, videoSegment.mo110571a(true), this.f157644e.mo111221c(this.f157595K).mo110582f(), this.f157594J);
        this.f157664y.setVisibility(8);
        this.f157588D.mo111240a();
        this.f157665z.setVisibility(0);
        this.f157665z.mo4413b(0);
        this.f157589E.mo111244a(this.f157662w.f156735b, videoSegment);
        this.f157665z.mo4395a(this.f157644e.mo111216b(this.f157595K), 0);
        this.f157598N.mo110592a(getStartSlideX(), getEndSlideX(), getOverXScroll());
        float a = C70082m.m123737a(this.f157662w, this.f157644e.mo111221c(this.f157595K), this.f157644e.mo111216b(this.f157595K), this.f157604T);
        mo111129a(a, C70082m.m123736a(this.f157643d, this.f157662w, a, this.f157644e.mo111221c(this.f157595K), this.f157604T), 0);
        this.f157644e.mo111211a(eVar);
    }

    /* renamed from: a */
    public final boolean mo111136a(int i, int i2) {
        return mo111137a(i, i2, true);
    }

    /* renamed from: a */
    public final boolean mo111137a(int i, int i2, boolean z) {
        float f;
        if (this.f157647h == null) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (!this.f157647h.isLaidOut() || this.f157647h.getLeft() == 0) {
            return false;
        }
        if (this.f157594J == 1) {
            this.f157664y.mo4413b(0);
            this.f157664y.mo4395a(0, 0);
        } else {
            this.f157644e.mo111209a(this.f157595K, 0);
            this.f157665z.mo4413b(0);
            this.f157665z.mo4395a(0, 0);
        }
        float f2 = (((((float) i) * 1.0f) / this.f157662w.f156738e) + ((float) this.f157604T)) - 0.0f;
        if (((long) i2) >= this.f157662w.f156739f) {
            f = (float) ((C70636dh.m124831b(this.f157643d) - this.f157604T) - C70082m.f156702d);
            f2 = Math.max((f - ((float) C70082m.f156702d)) - (((float) (i2 - i)) / this.f157662w.f156738e), (float) (this.f157604T - 0));
        } else {
            f = (((float) (i2 - i)) / this.f157662w.f156738e) + ((float) C70082m.f156702d) + f2;
        }
        m124421a(f2, f, 0, z);
        if (z) {
            setCurPointerContainerStartX((float) (this.f157604T + C70082m.f156702d));
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo111106a(String str) {
        if (str.equals("curPoint") || ((int) ((this.f157646g.getStartX() - this.f157647h.getStartX()) - ((float) C70082m.f156702d))) >= ((int) this.f157662w.f156740g) - 2) {
            return true;
        }
        m124416D();
        C70082m.m123741a(this.f157643d);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 <= 0.0f) goto L_0x0026;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111132a(androidx.core.p036g.C0692e<java.lang.Float, java.lang.Float> r8, java.util.List<com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r9) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.mo111132a(androidx.core.g.e, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo111135a(final boolean z, boolean z2, final AbstractC0688a<Void> aVar) {
        AlphaAnimation alphaAnimation;
        if (z2) {
            if (!z) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(200);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.animationAnimation$AnimationListenerC705145 */

                static {
                    Covode.recordClassIndex(82969);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    if (z) {
                        VideoEditView.this.mo111146c(true);
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!z) {
                        VideoEditView.this.mo111146c(false);
                    }
                    AbstractC0688a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo2720a(null);
                    }
                }
            });
            RTLImageView rTLImageView = this.f157647h;
            if (rTLImageView != null) {
                rTLImageView.startAnimation(alphaAnimation);
            }
            RTLImageView rTLImageView2 = this.f157646g;
            if (rTLImageView2 != null) {
                rTLImageView2.startAnimation(alphaAnimation);
            }
            View view = this.f157652m;
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
            View view2 = this.f157653n;
            if (view2 != null) {
                view2.startAnimation(alphaAnimation);
            }
            View view3 = this.f157656q;
            if (view3 != null) {
                view3.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        mo111146c(z);
    }

    /* renamed from: A */
    private void m124413A() {
        m124414B();
        m124415C();
    }

    public float getEndSlideX() {
        return this.f157646g.getStartX();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getMaxCutDuration() {
        return this.f157662w.f156739f;
    }

    public float getSelectedTimeInMillis() {
        return this.f157592H * this.f157662w.f156738e;
    }

    public float getStartSlideX() {
        return this.f157647h.getStartX();
    }

    /* renamed from: E */
    private void m124417E() {
        if (!this.f157617ac) {
            this.f157617ac = true;
            C70082m.m123741a(this.f157643d);
        }
    }

    /* renamed from: z */
    private void m124434z() {
        PopupWindow popupWindow = this.f157619ae;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f157619ae = null;
        }
    }

    public float getAudioStartTranslationX() {
        RTLImageView rTLImageView = this.f157647h;
        if (rTLImageView != null) {
            return rTLImageView.getTranslationX();
        }
        return 0.0f;
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        if (this.f157594J == 0) {
            return this.f157665z;
        }
        return this.f157664y;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public int getCurrentRotate() {
        int i = this.f157594J;
        if (i == 2 || i == 0) {
            return this.f157599O.f156749c;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public C0692e<Long, Long> getPlayBoundary() {
        if (this.f157594J == 1) {
            return getMultiVideoPlayBoundary();
        }
        return getSingleVideoPlayBoundary();
    }

    public long getSeekTime() {
        if (this.f157594J == 1) {
            return getMultiSeekTime();
        }
        return getSingleSeekTime();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public float getSelectedTime() {
        return (this.f157592H * this.f157662w.f156738e) / 1000.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getSingleSeekTime() {
        return (long) ((this.f157591G + ((float) C70082m.f156702d)) * this.f157662w.f156738e);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public float getCurrentSpeed() {
        int i = this.f157594J;
        if (i == 2 || i == 0) {
            return this.f157599O.f156750d;
        }
        return this.f157644e.mo111233l();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getMultiSeekTime() {
        return C70087b.m123760a(this.f157644e.mo111232k(), (this.f157591G + ((float) C70082m.f156702d)) * this.f157662w.f156738e, this.f157644e.mo111233l());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getSinglePlayingPosition() {
        return (long) (((this.f157591G + this.f157657r.getStartX()) - this.f157647h.getStartX()) * this.f157662w.f156738e * this.f157599O.f156750d);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public C0692e<Float, Float> getSlideX() {
        return new C0692e<>(Float.valueOf(getStartSlideX()), Float.valueOf(getEndSlideX()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo111123n() {
        RTLImageView rTLImageView = this.f157647h;
        if (rTLImageView != null) {
            rTLImageView.setImageResource(2131235015);
        }
        RTLImageView rTLImageView2 = this.f157646g;
        if (rTLImageView2 != null) {
            rTLImageView2.setImageResource(2131235014);
        }
    }

    /* renamed from: q */
    public final void mo111178q() {
        View view = this.f157586B;
        if (view != null) {
            view.setVisibility(4);
        }
        AudioTrackView audioTrackView = this.f157585A;
        if (audioTrackView != null) {
            audioTrackView.setVisibility(4);
        }
        m124434z();
    }

    /* renamed from: s */
    private void m124427s() {
        this.f157642c = C70636dh.m124831b(this.f157643d);
        this.f157596L = 0;
        this.f157595K = 0;
        C70087b bVar = new C70087b(this.f157644e.mo111232k(), C70082m.m123744b(this.f157643d, this.f157604T));
        this.f157662w = bVar;
        bVar.f156741h = this.f157605U;
        this.f157662w.f156742i = this.f157641b;
        m124428t();
        m124429u();
        m124433y();
        m124432x();
        mo111117h();
    }

    /* renamed from: w */
    private void m124431w() {
        if (this.f157656q != null) {
            int startX = (int) (this.f157647h.getStartX() + ((float) C70082m.f156702d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Double.valueOf(Math.ceil((double) this.f157592H)).intValue(), this.f157600P);
            layoutParams.topMargin = this.f157603S;
            layoutParams.leftMargin = startX;
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(startX);
            this.f157656q.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getMultiPlayingPosition() {
        return C70087b.m123760a(this.f157644e.mo111232k(), ((this.f157591G + this.f157657r.getStartX()) - this.f157647h.getStartX()) * this.f157662w.f156738e, this.f157644e.mo111233l());
    }

    public C0692e<Long, Long> getSingleVideoPlayBoundary() {
        return C0692e.m2449a(Long.valueOf((long) ((this.f157591G + ((float) C70082m.f156702d)) * this.f157662w.f156738e * this.f157599O.f156750d)), Long.valueOf((long) ((this.f157591G + ((float) C70082m.f156702d) + this.f157592H) * this.f157662w.f156738e * this.f157599O.f156750d)));
    }

    /* renamed from: i */
    public void mo111118i() {
        if (this.f157654o != null) {
            float startX = this.f157647h.getStartX();
            int max = Math.max((this.f157604T + C70082m.f156702d) - this.f157593I, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.max((int) (startX - ((float) max)), 0), this.f157600P);
            layoutParams.topMargin = this.f157603S;
            layoutParams.leftMargin = max;
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(max);
            layoutParams.gravity = 8388611;
            this.f157654o.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: k */
    public void mo111120k() {
        this.f157594J = 1;
        this.f157644e.mo111208a(1);
        C70089d dVar = this.f157599O;
        if (dVar != null) {
            dVar.mo110593a();
        }
        this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
        mo111129a(this.f157598N.f156744a, this.f157598N.f156745b, this.f157598N.f156746c);
        mo111103a((VideoSegment) null, 1);
    }

    /* renamed from: l */
    public void mo111121l() {
        this.f157594J = 1;
        this.f157644e.mo111208a(1);
        mo111122m();
        C70088c cVar = this.f157598N;
        if (cVar != null) {
            cVar.mo110591a();
        }
        this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
        int i = this.f157604T;
        mo111129a((float) i, (float) ((this.f157642c - i) - C70082m.f156702d), 0);
        mo111103a((VideoSegment) null, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo111179r() {
        this.f157599O.f156749c += 90;
        if (this.f157599O.f156749c >= 360) {
            this.f157599O.f156749c = 0;
        }
        if (this.f157594J == 0) {
            this.f157644e.mo111213a(this.f157599O, 0);
        }
    }

    /* renamed from: C */
    private void m124415C() {
        MethodCollector.m26663i(12353);
        View view = new View(this.f157643d);
        this.f157656q = view;
        view.setTag("block");
        this.f157656q.setOnTouchListener(this);
        this.f157656q.setBackgroundColor(this.f157622ah);
        this.f157656q.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.f157592H, this.f157600P);
        layoutParams.topMargin = (int) C84912r.m145930a(this.f157643d, 7.0f);
        layoutParams.leftMargin = this.f157604T + C70082m.f156702d;
        int i = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(this.f157604T + C70082m.f156702d);
        this.f157656q.setLayoutParams(layoutParams);
        this.f157663x.addView(this.f157656q);
        this.f157657r.bringToFront();
        MethodCollector.m26664o(12353);
    }

    /* renamed from: D */
    private void m124416D() {
        if (System.currentTimeMillis() - this.f157610aC >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            if (this.f157594J == 2) {
                C85052j.m146242a(this.f157643d, getResources().getString(R.string.h3q, Float.valueOf(0.5f))).mo129996a();
                this.f157610aC = System.currentTimeMillis();
                return;
            }
            C85052j.m146242a(this.f157643d, getResources().getString(R.string.h3q, Float.valueOf(1.0f))).mo129996a();
            this.f157610aC = System.currentTimeMillis();
        }
    }

    /* renamed from: F */
    private void m124418F() {
        String a = C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.f157592H * this.f157662w.f156738e) / 1000.0f)});
        if (!(this.f157657r == null || this.f157647h == null || this.f157645f.f156530b.getValue() == null)) {
            C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) this.f157645f.f156530b.getValue().longValue()) / 1000.0f)});
        }
        if (this.f157645f.f156529a.getValue() != null) {
            this.f157645f.f156529a.getValue();
        }
        getResources().getString(R.string.d5c, a);
        this.f157644e.mo111233l();
    }

    /* renamed from: t */
    private void m124428t() {
        MethodCollector.m26663i(14121);
        View inflate = View.inflate(this.f157643d, R.layout.bhl, this);
        this.f157657r = (RTLLinearLayout) inflate.findViewById(R.id.ags);
        this.f157658s = (ImageView) inflate.findViewById(R.id.agr);
        this.f157663x = (FrameLayout) inflate.findViewById(R.id.b8j);
        this.f157664y = (MVRecycleView) inflate.findViewById(R.id.b8o);
        this.f157665z = (MVRecycleView) inflate.findViewById(R.id.e1d);
        this.f157585A = (AudioTrackView) inflate.findViewById(R.id.mq);
        this.f157586B = inflate.findViewById(R.id.dx3);
        this.f157587C = inflate.findViewById(R.id.ade);
        MethodCollector.m26664o(14121);
    }

    /* renamed from: u */
    private void m124429u() {
        if (this.f157594J == 1) {
            this.f157598N = new C70088c();
            this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
        } else {
            VideoSegment videoSegment = this.f157644e.mo111232k().get(0);
            this.f157599O = new C70089d(videoSegment);
            this.f157662w.mo110588a(videoSegment.f156710b, videoSegment.mo110571a(true), videoSegment.mo110582f(), this.f157594J);
        }
        this.f157592H = (float) ((this.f157642c - (this.f157604T * 2)) - (C70082m.f156702d * 2));
        this.f157591G = (float) (-C70082m.f156702d);
    }

    /* renamed from: v */
    private void m124430v() {
        if (this.f157630ap) {
            C0692e<Long, Long> playBoundary = getPlayBoundary();
            F f = playBoundary.f2750a;
            S s = playBoundary.f2751b;
            if (!(f == null || s == null)) {
                long max = Math.max(0L, f.longValue());
                String a = C1764a.m5929a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) max) / 1000.0f)});
                String a2 = C1764a.m5929a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) s.longValue()) / 1000.0f)});
                C71827ew.m126827a(this.f157649j, a);
                C71827ew.m126827a(this.f157648i, a2);
            }
            mo111177p();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: b */
    public final void mo111142b() {
        this.f157592H = (this.f157646g.getStartX() - this.f157647h.getStartX()) - ((float) C70082m.f156702d);
        this.f157591G = (((float) (this.f157593I - C70082m.f156702d)) + this.f157647h.getStartX()) - ((float) this.f157604T);
        if (!(1 == this.f157594J || this.f157599O == null)) {
            C0692e<Long, Long> singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.f157599O.f156747a = singleVideoPlayBoundary.f2750a.longValue();
            this.f157599O.f156748b = singleVideoPlayBoundary.f2751b.longValue();
            if (this.f157621ag != 2 && this.f157594J == 0) {
                this.f157644e.mo111213a(this.f157599O, 0);
            }
        }
        m124418F();
        m124430v();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: g */
    public final boolean mo111148g() {
        VideoSegment videoSegment = this.f157644e.mo111232k().get(this.f157596L);
        boolean z = false;
        if (videoSegment == null || this.f157599O == null) {
            return false;
        }
        if (Math.abs(videoSegment.mo110578d() - this.f157599O.f156747a) > 100 || Math.abs(videoSegment.mo110580e() - this.f157599O.f156748b) > 100) {
            return true;
        }
        if (videoSegment.mo110582f() != this.f157599O.f156750d) {
            z = true;
        }
        if (videoSegment.f156718j != this.f157599O.f156749c) {
            return true;
        }
        return z;
    }

    public C0692e<Long, Long> getMultiVideoPlayBoundary() {
        return C0692e.m2449a(Long.valueOf(C70087b.m123760a(this.f157644e.mo111232k(), (this.f157591G + ((float) C70082m.f156702d)) * this.f157662w.f156738e, this.f157644e.mo111233l())), Long.valueOf(C70087b.m123760a(this.f157644e.mo111232k(), (this.f157591G + ((float) C70082m.f156702d) + this.f157592H) * this.f157662w.f156738e, this.f157644e.mo111233l())));
    }

    /* renamed from: h */
    public void mo111117h() {
        this.f157645f.f156530b.observe(this.f157643d, new C70530k(this));
        if (this.f157609aB) {
            this.f157645f.f156532d.observe(this.f157643d, new C70531l(this));
            this.f157645f.f156533e.observe(this.f157643d, new C70532m(this));
            this.f157645f.f156534f.observe(this.f157643d, new C70533n(this));
            this.f157645f.f156535g.observe(this.f157643d, new C70534o(this));
            this.f157645f.f156536h.observe(this.f157643d, new C70535p(this));
            this.f157645f.f156537i.observe(this.f157643d, new C70536q(this));
        }
    }

    /* renamed from: j */
    public void mo111119j() {
        if (this.f157655p != null) {
            float startX = this.f157646g.getStartX();
            int i = (int) ((((((float) this.f157662w.f156739f) / this.f157662w.f156738e) - this.f157591G) - ((float) (C70082m.f156702d * 2))) - this.f157592H);
            int i2 = (int) ((((float) this.f157642c) - startX) - ((float) C70082m.f156702d));
            int max = Math.max(Math.min(i, i2), 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max, this.f157600P);
            int i3 = i2 - max;
            layoutParams.rightMargin = i3;
            int i4 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd(i3);
            layoutParams.topMargin = this.f157603S;
            layoutParams.gravity = 8388613;
            this.f157655p.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo111122m() {
        this.f157644e.mo111213a(this.f157599O, this.f157595K);
        this.f157644e.mo111209a(this.f157595K, getOverXScroll());
        this.f157662w.mo110589a(this.f157644e.mo111232k().get(this.f157595K).mo110571a(true), this.f157599O.f156750d);
        this.f157645f.mo110477a(this.f157644e.mo111232k().get(this.f157595K).mo110571a(true));
    }

    /* renamed from: o */
    public final void mo111175o() {
        VideoEditViewModel videoEditViewModel;
        if (this.f157662w != null && (videoEditViewModel = this.f157644e) != null && !C84904k.m145909a(videoEditViewModel.mo111232k())) {
            if (this.f157594J == 1) {
                this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
                return;
            }
            VideoSegment videoSegment = this.f157644e.mo111232k().get(0);
            this.f157662w.mo110588a(videoSegment.f156710b, videoSegment.mo110571a(true), videoSegment.mo110582f(), this.f157594J);
        }
    }

    /* renamed from: p */
    public final void mo111177p() {
        if (this.f157630ap) {
            TextView textView = this.f157649j;
            textView.setX(m124419a(this.f157647h, textView));
            TextView textView2 = this.f157648i;
            textView2.setX(m124419a(this.f157646g, textView2));
            float f = 0.0f;
            if (Math.abs(this.f157649j.getX() - this.f157648i.getX()) - (((float) (this.f157649j.getWidth() + this.f157648i.getWidth())) / 2.0f) > 0.0f) {
                f = 1.0f;
            }
            if (this.f157649j.getAlpha() != f) {
                this.f157649j.animate().alpha(f).setDuration(150).start();
                this.f157648i.animate().alpha(f).setDuration(150).start();
            }
        }
    }

    /* renamed from: B */
    private void m124414B() {
        MethodCollector.m26663i(12212);
        this.f157654o = new View(this.f157643d);
        this.f157655p = new View(this.f157643d);
        this.f157654o.setBackgroundColor(this.f157623ai);
        this.f157655p.setBackgroundColor(this.f157623ai);
        int max = Math.max(this.f157593I - C70082m.f156702d, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max, this.f157600P);
        layoutParams.topMargin = (int) C84912r.m145930a(this.f157643d, 7.0f);
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = this.f157604T - max;
        int i = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(this.f157604T - max);
        this.f157654o.setLayoutParams(layoutParams);
        int max2 = Math.max((int) ((((((float) this.f157662w.f156739f) / this.f157662w.f156738e) - ((float) this.f157593I)) - this.f157592H) - ((float) C70082m.f156702d)), 0);
        int i2 = this.f157604T;
        int min = Math.min(max2, i2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(min, this.f157600P);
        layoutParams2.topMargin = (int) C84912r.m145930a(this.f157643d, 7.0f);
        int i3 = i2 - min;
        layoutParams2.rightMargin = i3;
        int i4 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginEnd(i3);
        layoutParams2.gravity = 8388613;
        this.f157655p.setLayoutParams(layoutParams2);
        this.f157663x.addView(this.f157654o);
        this.f157663x.addView(this.f157655p);
        MethodCollector.m26664o(12212);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: c */
    public final void mo111145c() {
        this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
        int i = this.f157604T;
        mo111129a((float) i, (float) ((this.f157642c - i) - C70082m.f156702d), 0);
        this.f157664y.mo4413b(0);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f157644e.mo111232k()) {
            if (!videoSegment.f156717i) {
                arrayList.add(videoSegment);
            }
        }
        this.f157588D.mo111245a(arrayList);
    }

    /* renamed from: y */
    private void m124433y() {
        int i;
        View view = this.f157587C;
        if (this.f157608aA) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        int i2 = this.f157604T + C70082m.f156702d;
        this.f157587C.setBackground(C84916a.m145947a(getResources().getColor(R.color.ub), 0, (int) C84912r.m145930a(getContext(), 1.0f), 0));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f157587C.getLayoutParams();
        layoutParams.topMargin = this.f157603S;
        int i3 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(i2);
        this.f157587C.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f157665z.getLayoutParams();
        layoutParams2.topMargin = this.f157603S;
        this.f157665z.setLayoutParams(layoutParams2);
        this.f157665z.setPadding(this.f157604T + C70082m.f156702d, 0, this.f157604T + C70082m.f156702d, 0);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f157664y.getLayoutParams();
        layoutParams3.topMargin = this.f157603S;
        this.f157664y.setLayoutParams(layoutParams3);
        this.f157664y.setPadding(this.f157604T + C70082m.f156702d, 0, this.f157604T + C70082m.f156702d, 0);
        int a = C84912r.m145931a(getContext()) - ((this.f157604T + C70082m.f156702d) * 2);
        C70526g a2 = new C70526g().mo111254a(new int[]{this.f157636av, this.f157600P, a});
        a2.f157741b = this.f157644e.mo111232k();
        a2.f157742c = this.f157662w.f156735b;
        a2.f157743d = 2;
        a2.f157744e = this.f157590F;
        this.f157589E = new C70520b(this.f157643d, a2.mo111253a());
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f157585A.getLayoutParams();
        layoutParams4.height = this.f157600P;
        layoutParams4.topMargin = this.f157603S;
        this.f157585A.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f157586B.getLayoutParams();
        layoutParams5.height = this.f157600P;
        layoutParams5.topMargin = this.f157603S;
        this.f157586B.setLayoutParams(layoutParams5);
        this.f157586B.setPadding(this.f157604T + C70082m.f156702d, 0, this.f157604T + C70082m.f156702d, 0);
        if (this.f157590F != null) {
            this.f157589E.mo111247a(this.f157618ad.f157762b);
        }
        this.f157589E.mo111248b(this.f157631aq);
        this.f157665z.setAdapter(this.f157589E);
        this.f157665z.setLayoutManager(new MVLinearLayoutManager());
        this.f157665z.mo4405a(this.f157612aE);
        this.f157665z.setflingScale(0.12d);
        C70526g a3 = new C70526g().mo111254a(new int[]{this.f157636av, this.f157600P, a});
        a3.f157741b = this.f157644e.mo111232k();
        a3.f157742c = this.f157662w.f156735b;
        a3.f157743d = 1;
        a3.f157744e = this.f157590F;
        C70520b bVar = new C70520b(this.f157643d, a3.mo111253a());
        this.f157588D = bVar;
        if (this.f157590F != null) {
            bVar.mo111247a(this.f157618ad.f157762b);
        }
        this.f157588D.mo111248b(this.f157631aq);
        this.f157664y.setAdapter(this.f157588D);
        this.f157664y.setLayoutManager(new ScrollInterceptedLayoutManager());
        this.f157664y.setflingScale(0.12d);
        this.f157664y.mo4405a(this.f157612aE);
        if (this.f157594J == 0) {
            this.f157665z.setVisibility(0);
            this.f157664y.setVisibility(8);
            if (this.f157645f.f156539k) {
                this.f157589E.f157720o = true;
                this.f157589E.f157721p = this.f157627am;
            }
            this.f157589E.f157714i = this.f157629ao;
            this.f157589E.f157713h = this.f157628an;
        } else {
            this.f157665z.setVisibility(8);
            this.f157664y.setVisibility(0);
        }
        if (this.f157626al) {
            mo111127a();
        }
        this.f157658s.setImageDrawable(C84916a.m145947a(0, -1, 1, this.f157632ar / 2));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111127a() {
        VideoEditViewModel videoEditViewModel = this.f157644e;
        if (videoEditViewModel != null) {
            if (this.f157594J != 0) {
                C70520b bVar = this.f157588D;
                if (bVar != null) {
                    bVar.mo111245a(videoEditViewModel.mo111232k());
                }
            } else if (this.f157589E != null) {
                C1213t<Boolean> tVar = this.f157629ao;
                if (tVar != null) {
                    tVar.setValue(true);
                }
                this.f157589E.mo111245a(this.f157644e.mo111232k());
            }
        }
    }

    /* renamed from: x */
    private void m124432x() {
        MethodCollector.m26663i(11619);
        RTLImageView rTLImageView = new RTLImageView(this.f157643d);
        this.f157647h = rTLImageView;
        rTLImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70082m.f156702d, this.f157601Q);
        this.f157650k = layoutParams;
        layoutParams.topMargin = this.f157639ay;
        this.f157650k.leftMargin = this.f157604T;
        int i = Build.VERSION.SDK_INT;
        this.f157650k.setMarginStart(this.f157604T);
        this.f157647h.setLayoutParams(this.f157650k);
        if (C31096d.m64298a(this.f157643d)) {
            this.f157647h.setLeft(this.f157642c - this.f157604T);
            C0792v.m2759b((View) this.f157647h, 1);
        } else {
            this.f157647h.setLeft(this.f157650k.leftMargin);
        }
        if (!this.f157659t) {
            this.f157647h.setOnTouchListener(null);
        } else {
            this.f157647h.setOnTouchListener(this);
        }
        this.f157647h.setTag("startSlide");
        this.f157663x.addView(this.f157647h);
        this.f157649j = m124420a(this.f157643d);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) (((float) (this.f157650k.topMargin + this.f157650k.height)) + C84912r.m145930a(this.f157643d, 4.0f));
        layoutParams2.leftMargin = this.f157604T;
        int i2 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart(this.f157604T);
        this.f157649j.setLayoutParams(layoutParams2);
        this.f157649j.setTag("startSlideTime");
        this.f157663x.addView(this.f157649j);
        this.f157649j.addTextChangedListener(new C70529j() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.C705101 */

            static {
                Covode.recordClassIndex(82965);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70529j
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f157649j.post(new RunnableC70539t(this));
            }
        });
        RTLImageView rTLImageView2 = new RTLImageView(this.f157643d);
        this.f157646g = rTLImageView2;
        rTLImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C70082m.f156702d + C70082m.f156706h, this.f157601Q);
        this.f157651l = layoutParams3;
        layoutParams3.topMargin = this.f157639ay;
        this.f157651l.leftMargin = (this.f157642c - this.f157604T) - C70082m.f156702d;
        int i3 = Build.VERSION.SDK_INT;
        this.f157651l.setMarginStart((this.f157642c - this.f157604T) - C70082m.f156702d);
        this.f157646g.setLayoutParams(this.f157651l);
        if (C31096d.m64298a(this.f157643d)) {
            this.f157646g.setLeft(this.f157604T);
            C0792v.m2759b((View) this.f157646g, 1);
        } else {
            this.f157646g.setLeft(this.f157651l.leftMargin);
        }
        if (!this.f157659t) {
            this.f157646g.setOnTouchListener(null);
        } else {
            this.f157646g.setOnTouchListener(this);
        }
        this.f157646g.setPadding(0, 0, C70082m.f156706h, 0);
        int i4 = Build.VERSION.SDK_INT;
        this.f157646g.setPaddingRelative(0, 0, C70082m.f156706h, 0);
        this.f157646g.setTag("endSlide");
        this.f157663x.addView(this.f157646g);
        this.f157648i = m124420a(this.f157643d);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = (int) (((float) (this.f157651l.topMargin + this.f157651l.height)) + C84912r.m145930a(this.f157643d, 4.0f));
        layoutParams4.leftMargin = (this.f157642c - this.f157604T) - C70082m.f156702d;
        int i5 = Build.VERSION.SDK_INT;
        layoutParams4.setMarginStart(this.f157604T);
        this.f157648i.setLayoutParams(layoutParams4);
        this.f157648i.setTag("endSlideTime");
        this.f157663x.addView(this.f157648i);
        this.f157648i.addTextChangedListener(new C70529j() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.C705112 */

            static {
                Covode.recordClassIndex(82966);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70529j
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f157648i.post(new RunnableC70540u(this));
            }
        });
        mo111123n();
        this.f157652m = new View(this.f157643d);
        this.f157653n = new View(this.f157643d);
        setBorderColor(R.color.a2g);
        this.f157663x.addView(this.f157652m);
        this.f157663x.addView(this.f157653n);
        int i6 = this.f157604T;
        m124425c(i6, (this.f157642c - i6) - C70082m.f156702d);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f157657r.getLayoutParams();
        layoutParams5.leftMargin = this.f157604T + C70082m.f156702d;
        layoutParams5.height = this.f157633as;
        layoutParams5.topMargin = this.f157635au;
        int i7 = Build.VERSION.SDK_INT;
        layoutParams5.setMarginStart(this.f157604T + C70082m.f156702d);
        this.f157657r.setLayoutParams(layoutParams5);
        this.f157657r.setTag("curPoint");
        this.f157657r.setOnTouchListener(this);
        RTLLinearLayout rTLLinearLayout = this.f157657r;
        if (rTLLinearLayout != null) {
            this.f157663x.removeView(rTLLinearLayout);
            this.f157663x.addView(this.f157657r);
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f157658s.getLayoutParams();
        layoutParams6.width = this.f157632ar;
        this.f157658s.setLayoutParams(layoutParams6);
        m124426e(this.f157630ap);
        m124413A();
        MethodCollector.m26664o(11619);
    }

    public void setCanEdit(boolean z) {
        this.f157609aB = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setExtractFramesInRoughMode(boolean z) {
        this.f157631aq = z;
    }

    public void setFirstFrameBitmapLiveData(C1213t<Bitmap> tVar) {
        this.f157628an = tVar;
    }

    public void setFirstFrameVisibleLiveData(C1213t<Boolean> tVar) {
        this.f157629ao = tVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setLoadThumbnailDirectly(boolean z) {
        this.f157626al = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setMaxVideoLength(long j) {
        this.f157605U = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setMinVideoLength(long j) {
        this.f157641b = j;
    }

    public void setPointerType(int i) {
        this.f157621ag = i;
    }

    public void setVeEditor(AbstractC31071f fVar) {
        this.f157627am = fVar;
    }

    public void setViewConfig(C70542w wVar) {
        this.f157618ad = wVar;
    }

    private void setVideoSegmentData(List<VideoSegment> list) {
        this.f157644e.mo111220b(list);
    }

    /* renamed from: b */
    public final void mo111144b(boolean z) {
        C70520b bVar = this.f157589E;
        if (bVar != null) {
            bVar.mo111249c(z);
        }
    }

    public void setHitTest(Boolean bool) {
        this.f157613aF = bool.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setCurrentRotate(int i) {
        int i2 = this.f157594J;
        if (i2 == 2 || i2 == 0) {
            this.f157599O.f156749c = i;
        }
    }

    public void setEnableBoundaryText(boolean z) {
        if (z != this.f157630ap) {
            m124426e(z);
        }
        this.f157630ap = z;
    }

    public void setEndCoverColor(int i) {
        View view = this.f157655p;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: e */
    private void m124426e(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f157649j.setVisibility(i);
        this.f157648i.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo111147d(boolean z) {
        if (z) {
            setCurPointerContainerStartX(this.f157647h.getStartX() + ((float) C70082m.f156702d));
        }
        mo111118i();
        m124431w();
        mo111119j();
    }

    public void setBorderColor(int i) {
        this.f157652m.setBackgroundColor(this.f157643d.getResources().getColor(i));
        this.f157653n.setBackgroundColor(this.f157643d.getResources().getColor(i));
    }

    public void setEnabled(boolean z) {
        this.f157624aj = z;
        if (this.f157664y.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.f157664y.getLayoutManager()).f156708a = z;
        }
    }

    /* renamed from: a */
    private TextView m124420a(Context context) {
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setTextColor(context.getResources().getColor(R.color.rb));
        styleTextView.setTextSize(11.0f);
        styleTextView.setClickable(true);
        styleTextView.setTypeface(C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME()), 1);
        styleTextView.setOnTouchListener(this);
        return styleTextView;
    }

    private void setCurPointerContainerStartX(float f) {
        float f2;
        int i;
        RTLLinearLayout rTLLinearLayout = this.f157657r;
        if (f <= ((float) (this.f157604T + C70082m.f156702d))) {
            i = (this.f157604T + C70082m.f156702d) - C70082m.f156705g;
        } else if (f >= ((float) (((this.f157642c - this.f157604T) - C70082m.f156702d) - C70082m.f156703e))) {
            i = (((this.f157642c - this.f157604T) - C70082m.f156702d) - C70082m.f156703e) + C70082m.f156705g;
        } else {
            f2 = f + (((float) C70082m.f156705g) * (((2.0f * f) / ((float) ((this.f157642c - this.f157604T) - C70082m.f156702d))) - 4.0f));
            rTLLinearLayout.setStartX(f2);
        }
        f2 = (float) i;
        rTLLinearLayout.setStartX(f2);
    }

    /* renamed from: b */
    private void m124423b(float f) {
        Iterator<AbstractC70519b> it = this.f157618ad.f157761a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC70519b next = it.next();
            C70517a<Float> a = next.mo78843a(f, C70082m.f156702d, this.f157647h.getStartX(), this.f157662w.f156738e);
            if (!a.mo111236a()) {
                if (!a.mo111237b()) {
                    if (a.mo111238c()) {
                        f = a.f157704a.floatValue();
                    } else {
                        throw new IllegalStateException("illegal intercept result, result = " + a.toString() + ", interceptor = " + next.mo78844a());
                    }
                }
            } else {
                return;
            }
        }
        if (f > ((float) ((this.f157642c - this.f157604T) - C70082m.f156702d))) {
            f = (float) ((this.f157642c - this.f157604T) - C70082m.f156702d);
            if (this.f157647h.getStartX() == ((float) this.f157604T)) {
                m124417E();
            }
        }
        if ((f - this.f157647h.getStartX()) - ((float) C70082m.f156702d) < this.f157662w.f156740g) {
            m124416D();
            m124417E();
            f = this.f157647h.getStartX() + this.f157662w.f156740g + ((float) C70082m.f156702d);
        }
        this.f157646g.setStartX(f);
        setCurPointerContainerStartX(this.f157646g.getStartX() - ((float) this.f157658s.getWidth()));
        m124425c((int) this.f157647h.getStartX(), (int) this.f157646g.getStartX());
        mo111142b();
        this.f157644e.mo111217b();
        mo111119j();
        m124431w();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public void setEditViewHeight(boolean z) {
        MethodCollector.m26663i(14166);
        if (z) {
            this.f157633as = this.f157634at;
            this.f157600P = this.f157637aw;
            this.f157635au = 0;
        } else {
            this.f157633as = (int) C84912r.m145930a(getContext(), 44.0f);
            this.f157600P = this.f157638ax;
            this.f157635au = (int) C84912r.m145930a(getContext(), 2.0f);
        }
        int i = this.f157600P;
        this.f157601Q = (this.f157640az * 2) + i;
        this.f157588D.mo111241a(i);
        this.f157589E.mo111241a(this.f157600P);
        this.f157663x.removeView(this.f157647h);
        this.f157663x.removeView(this.f157649j);
        this.f157663x.removeView(this.f157646g);
        this.f157663x.removeView(this.f157648i);
        this.f157663x.removeView(this.f157652m);
        this.f157663x.removeView(this.f157653n);
        this.f157663x.removeView(this.f157657r);
        this.f157663x.removeView(this.f157654o);
        this.f157663x.removeView(this.f157655p);
        this.f157663x.removeView(this.f157656q);
        m124432x();
        MethodCollector.m26664o(14166);
    }

    /* renamed from: c */
    public final void mo111146c(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        RTLImageView rTLImageView = this.f157647h;
        int i9 = 0;
        if (rTLImageView != null) {
            if (z) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            rTLImageView.setVisibility(i8);
        }
        TextView textView = this.f157649j;
        if (textView != null && this.f157630ap) {
            if (z) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            textView.setVisibility(i7);
        }
        RTLImageView rTLImageView2 = this.f157646g;
        if (rTLImageView2 != null) {
            if (z) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            rTLImageView2.setVisibility(i6);
        }
        TextView textView2 = this.f157648i;
        if (textView2 != null && this.f157630ap) {
            if (z) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            textView2.setVisibility(i5);
        }
        View view = this.f157652m;
        if (view != null) {
            if (z) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        View view2 = this.f157653n;
        if (view2 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
        View view3 = this.f157654o;
        if (view3 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
        View view4 = this.f157655p;
        if (view4 != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view4.setVisibility(i);
        }
        View view5 = this.f157656q;
        if (view5 != null) {
            if (!z) {
                i9 = 4;
            }
            view5.setVisibility(i9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111128a(float f) {
        if (this.f157594J == 1) {
            this.f157644e.mo111223c(f);
        } else {
            this.f157599O.f156750d = f;
            if (this.f157594J == 0) {
                this.f157644e.mo111213a(this.f157599O, 0);
            }
        }
        if (this.f157594J == 1) {
            this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
            this.f157588D.mo111243a(this.f157662w.f156735b);
            this.f157664y.mo4413b(0);
        } else {
            this.f157662w.mo110588a(this.f157644e.mo111232k().get(this.f157595K).f156710b, this.f157644e.mo111232k().get(this.f157595K).mo110571a(true), this.f157599O.f156750d, this.f157594J);
            this.f157589E.mo111244a(this.f157662w.f156735b, this.f157644e.mo111232k().get(this.f157595K));
            this.f157665z.mo4413b(0);
        }
        int i = this.f157604T;
        mo111129a((float) i, (float) ((this.f157642c - i) - C70082m.f156702d), 0);
        m124418F();
        if (this.f157594J == 0) {
            this.f157662w.mo110589a(this.f157644e.mo111232k().get(this.f157595K).mo110571a(true), this.f157599O.f156750d);
        }
        this.f157644e.mo111218b(f);
    }

    /* renamed from: a */
    public final void mo111131a(int i) {
        if (this.f157625ak) {
            long j = (long) i;
            setMaxVideoLength(j);
            List<VideoSegment> k = this.f157644e.mo111232k();
            this.f157662w.f156741h = j;
            if (this.f157594J == 1) {
                this.f157662w.mo110590a(this.f157644e.mo111232k(), this.f157644e.mo111233l());
            } else if (!C84892d.m145850a(k)) {
                VideoSegment videoSegment = k.get(0);
                videoSegment.f156710b = j;
                videoSegment.mo110576b(j);
                this.f157662w.mo110588a(videoSegment.f156710b, videoSegment.mo110571a(true), videoSegment.mo110582f(), this.f157594J);
            }
        }
    }

    public VideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final float mo111126a(float f, float f2) {
        if (f >= f2) {
            return f2 / this.f157662w.f156738e;
        }
        return f / this.f157662w.f156738e;
    }

    /* renamed from: a */
    private static float m124419a(View view, View view2) {
        return (view.getX() + (((float) (view.getMeasuredWidth() - view.getPaddingRight())) / 2.0f)) - (((float) view2.getMeasuredWidth()) / 2.0f);
    }

    /* renamed from: b */
    public final void mo111143b(int i, int i2) {
        this.f157586B.setVisibility(0);
        this.f157585A.setVisibility(0);
        this.f157585A.mo111089a(getAudioStartTranslationX(), mo111126a((float) i, (float) i2), (long) i);
    }

    /* renamed from: c */
    private void m124425c(int i, int i2) {
        if (this.f157652m != null && this.f157653n != null) {
            int i3 = C70082m.f156702d + i;
            int a = ((i2 - i) - C70082m.f156702d) + ((int) C84912r.m145930a(this.f157643d, 1.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, this.f157640az);
            layoutParams.leftMargin = i3;
            int i4 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(i3);
            layoutParams.topMargin = this.f157639ay;
            this.f157652m.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a, this.f157640az);
            layoutParams2.leftMargin = i3;
            int i5 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart(i3);
            layoutParams2.topMargin = (this.f157639ay + this.f157601Q) - this.f157640az;
            this.f157653n.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a */
    private void m124422a(CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        if (cutMultiVideoViewModel.f156539k) {
            for (VideoSegment videoSegment : list) {
                videoSegment.f156710b = (long) cutMultiVideoViewModel.f156540l;
                videoSegment.f156714f = 720;
                videoSegment.f156715g = 1280;
            }
        }
        this.f157644e.mo111220b(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (r7 != false) goto L_0x0067;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m124424b(float r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.m124424b(float, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0269, code lost:
        r13.f157644e.mo111222c();
        r13.f157644e.mo111226e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x028f, code lost:
        if (r12.equals("endSlide") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02cc, code lost:
        if (r12.equals("startSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02d4, code lost:
        if (r12.equals("endSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d8, code lost:
        r13.f157607W = r13.f157646g.getLeftX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e6, code lost:
        if (r12.equals("startSlide") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ea, code lost:
        r13.f157607W = r13.f157647h.getLeftX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x031a, code lost:
        throw new java.lang.IllegalStateException("illegal intercept result, result = " + r5.toString() + ", interceptor = " + r6.mo78844a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r12.equals("endSlide") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r12.equals("startSlideTime") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r12.equals("endSlideTime") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r13.f157613aF == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r13.f157624aj == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r13.f157614aG == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r13.f157585A.getVisibility() != 0) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        if (java.lang.Math.abs((getSelectedTime() * 1000.0f) - ((float) r13.f157585A.getDuraion())) > 300.0f) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r7 = (r13.f157647h.getStartX() + ((float) com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.f156702d)) + (((float) r13.f157585A.getDuraion()) / r13.f157662w.f156738e);
        m124423b(r7);
        r13.f157611aD = r7;
        m124417E();
        setEnabled(false);
        r13.f157644e.mo111225d();
        r13.f157614aG = false;
        r13.f157660u = false;
        r13.f157617ac = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        if (java.lang.Math.abs((getSelectedTime() * 1000.0f) - ((float) r13.f157585A.getDuraion())) <= 300.0f) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        r13.f157614aG = true;
        r13.f157617ac = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        m124423b(r1);
        m124434z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        m124423b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0153, code lost:
        if (r12.equals("startSlide") == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r8 = r13.f157618ad.f157761a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        if (r8.hasNext() == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        r6 = r8.next();
        r5 = r6.mo78846b(r1, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.f156702d, r13.f157646g.getStartX(), r13.f157662w.f156738e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        if (r5.mo111236a() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0185, code lost:
        if (r5.mo111237b() != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
        if (r5.mo111238c() == false) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018d, code lost:
        r1 = r5.f157704a.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a6, code lost:
        if (((r13.f157646g.getStartX() - r1) - ((float) com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.f156702d)) >= r13.f157662w.f156740g) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a8, code lost:
        m124416D();
        m124417E();
        r1 = (r13.f157646g.getStartX() - ((float) com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.f156702d)) - r13.f157662w.f156740g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c2, code lost:
        if (r1 >= ((float) r13.f157604T)) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d5, code lost:
        if (r13.f157646g.getStartX() != ((float) ((r13.f157642c - r13.f157604T) - com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.f156702d))) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d7, code lost:
        m124417E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01da, code lost:
        r1 = (float) r13.f157604T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01dd, code lost:
        r13.f157647h.setStartX(r1);
        setCurPointerContainerStartX(r1 + ((float) com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m.f156702d));
        m124425c((int) r13.f157647h.getStartX(), (int) r13.f157646g.getStartX());
        mo111142b();
        r13.f157644e.mo111206a();
        mo111118i();
        m124431w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021e, code lost:
        if (r12.equals("endSlide") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0249, code lost:
        if (r12.equals("startSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0251, code lost:
        if (r12.equals("endSlideTime") == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0255, code lost:
        r13.f157644e.mo111225d();
        r13.f157644e.mo111226e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0265, code lost:
        if (r12.equals("startSlide") == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 874
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111130a(float f, boolean z) {
        C84401c.f188722f.mo123658a(C1764a.m5929a(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide0: targetX: %f, isTouch: %b", new Object[]{Float.valueOf(f), Boolean.valueOf(z)}));
        if (this.f157621ag == 2) {
            f = Math.min(Math.max((float) (this.f157604T + C70082m.f156702d), f), (float) (((this.f157642c - this.f157604T) - C70082m.f156702d) - C70082m.f156703e));
        } else {
            if (f < this.f157647h.getStartX() + ((float) C70082m.f156702d)) {
                f = this.f157647h.getStartX() + ((float) C70082m.f156702d);
            }
            if (f > this.f157646g.getStartX() - ((float) this.f157658s.getWidth())) {
                f = this.f157646g.getStartX() - ((float) this.f157658s.getWidth());
            }
        }
        C84401c.f188722f.mo123658a(C1764a.m5929a(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide1: targetX: %f", new Object[]{Float.valueOf(f)}));
        setCurPointerContainerStartX(f);
        this.f157644e.mo111207a(this.f157592H);
        if (!z) {
            return;
        }
        if (this.f157594J == 2) {
            this.f157644e.mo111210a(getSinglePlayingPosition());
        } else {
            this.f157644e.mo111210a(getMultiPlayingPosition());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111129a(float f, float f2, int i) {
        m124421a(f, f2, i, true);
    }

    public VideoEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f157659t = true;
        this.f157618ad = new C70542w();
        this.f157597M = true;
        this.f157621ag = 1;
        this.f157624aj = true;
        this.f157625ak = false;
        this.f157626al = true;
        this.f157630ap = false;
        this.f157636av = C70082m.f156700b;
        this.f157600P = C70082m.f156699a;
        this.f157638ax = (int) C84912r.m145930a(getContext(), 32.0f);
        this.f157604T = (int) C84912r.m145930a(getContext(), 36.0f);
        this.f157609aB = true;
        this.f157611aD = -1.0f;
        this.f157612aE = new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.C705134 */

            /* renamed from: b */
            private boolean f157672b;

            static {
                Covode.recordClassIndex(82968);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final /* synthetic */ void mo111201a() {
                VideoEditView.this.f157660u = false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    if (this.f157672b) {
                        VideoEditView.this.f157644e.mo111228g();
                        this.f157672b = false;
                    }
                    recyclerView.postDelayed(new RunnableC70541v(this), 100);
                } else {
                    VideoEditView.this.f157660u = true;
                }
                super.mo4753a(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                if (i != 0) {
                    this.f157672b = true;
                    VideoEditView videoEditView = VideoEditView.this;
                    int i3 = videoEditView.f157593I;
                    if (C31096d.m64298a(recyclerView.getContext())) {
                        i = -i;
                    }
                    videoEditView.f157593I = i3 + i;
                    VideoEditView.this.mo111142b();
                    VideoEditView.this.mo111118i();
                    VideoEditView.this.mo111119j();
                    VideoEditView.this.f157644e.mo111227f();
                }
            }
        };
        this.f157613aF = false;
        this.f157614aG = true;
        this.f157640az = (int) C84912r.m145930a(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q9, R.attr.qp, R.attr.qq, R.attr.ux, R.attr.uy, R.attr.a1t, R.attr.a5e, R.attr.a5f, R.attr.a69, R.attr.a7h, R.attr.abt, R.attr.act, R.attr.af6});
            this.f157622ah = obtainStyledAttributes.getColor(6, 0);
            this.f157622ah = C0699a.m2464b(this.f157622ah, (int) (obtainStyledAttributes.getFloat(7, 1.0f) * 255.0f));
            this.f157623ai = obtainStyledAttributes.getColor(12, getResources().getColor(R.color.u4));
            this.f157621ag = obtainStyledAttributes.getInt(9, 1);
            this.f157636av = Math.round(obtainStyledAttributes.getDimension(4, (float) C70082m.f156700b));
            int round = Math.round(obtainStyledAttributes.getDimension(3, (float) C70082m.f156699a));
            this.f157637aw = round;
            this.f157600P = round;
            this.f157632ar = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            int round2 = Math.round(obtainStyledAttributes.getDimension(1, 0.0f));
            this.f157634at = round2;
            this.f157633as = round2;
            this.f157602R = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            this.f157608aA = obtainStyledAttributes.getBoolean(10, false);
            this.f157601Q = this.f157600P + (this.f157640az * 2);
            this.f157604T = Math.round(obtainStyledAttributes.getDimension(11, (float) (this.f157602R - C70082m.f156702d)));
            int i2 = this.f157633as;
            this.f157639ay = (i2 - this.f157601Q) / 2;
            this.f157603S = (i2 - this.f157600P) / 2;
            this.f157597M = obtainStyledAttributes.getBoolean(8, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m124421a(float f, float f2, int i, boolean z) {
        this.f157647h.setStartX(f);
        this.f157585A.mo111088a(getAudioStartTranslationX());
        this.f157646g.setStartX(f2);
        m124425c((int) this.f157647h.getStartX(), (int) this.f157646g.getStartX());
        this.f157593I = i;
        mo111142b();
        post(new RunnableC70538s(this, z));
    }
}
