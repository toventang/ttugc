package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70075h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70095p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70089d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70528i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70983b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74286i;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.List;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.l */
public abstract class AbstractView$OnTouchListenerC70571l extends AbstractC70516a implements View.OnTouchListener {

    /* renamed from: A */
    protected long f157841A;

    /* renamed from: B */
    protected long f157842B;

    /* renamed from: C */
    protected long f157843C;

    /* renamed from: D */
    protected long f157844D;

    /* renamed from: E */
    protected long f157845E;

    /* renamed from: F */
    protected boolean f157846F;

    /* renamed from: G */
    protected boolean f157847G;

    /* renamed from: H */
    protected boolean f157848H;

    /* renamed from: I */
    protected long f157849I;

    /* renamed from: J */
    protected Boolean f157850J;

    /* renamed from: K */
    protected float f157851K;

    /* renamed from: L */
    protected VEMediaParserProviderV2 f157852L;

    /* renamed from: M */
    public AbstractC70075h f157853M;

    /* renamed from: N */
    private DecelerateInterpolator f157854N = new DecelerateInterpolator();

    /* renamed from: O */
    private View f157855O;

    /* renamed from: P */
    private View f157856P;

    /* renamed from: Q */
    private View f157857Q;

    /* renamed from: R */
    private View f157858R;

    /* renamed from: S */
    private boolean f157859S;

    /* renamed from: T */
    private SpeedyLinearLayoutManager f157860T;

    /* renamed from: U */
    private SpeedyLinearLayoutManager f157861U;

    /* renamed from: V */
    private int f157862V;

    /* renamed from: W */
    private int f157863W;

    /* renamed from: aa */
    private int f157864aa;

    /* renamed from: ab */
    private int f157865ab;

    /* renamed from: ac */
    private int f157866ac;

    /* renamed from: ad */
    private int f157867ad;

    /* renamed from: ae */
    private int f157868ae;

    /* renamed from: af */
    private int f157869af;

    /* renamed from: ag */
    private int f157870ag;

    /* renamed from: ah */
    private int f157871ah;

    /* renamed from: ai */
    private int f157872ai;

    /* renamed from: aj */
    private int f157873aj;

    /* renamed from: ak */
    private long f157874ak;

    /* renamed from: al */
    private RecyclerView.AbstractC1371n f157875al;

    /* renamed from: am */
    private float f157876am;

    /* renamed from: an */
    private float f157877an;

    /* renamed from: ao */
    private float f157878ao;

    /* renamed from: b */
    protected ImageView f157879b;

    /* renamed from: c */
    protected RTLImageView f157880c;

    /* renamed from: d */
    protected RTLImageView f157881d;

    /* renamed from: e */
    protected RTLLinearLayout f157882e;

    /* renamed from: f */
    protected AutoPollRecyclerView f157883f;

    /* renamed from: g */
    protected AutoPollRecyclerView f157884g;

    /* renamed from: h */
    protected InterceptFrameLayout f157885h;

    /* renamed from: i */
    protected int f157886i = 0;

    /* renamed from: j */
    float f157887j = C30745b.m63132b(getContext(), 12.0f);

    /* renamed from: k */
    protected long f157888k = C70637di.m124840a();

    /* renamed from: l */
    protected long f157889l;

    /* renamed from: m */
    protected ActivityC0945e f157890m;

    /* renamed from: n */
    protected VideoEditViewModel f157891n;

    /* renamed from: o */
    protected CutMultiVideoViewModel f157892o;

    /* renamed from: p */
    protected boolean f157893p;

    /* renamed from: q */
    protected C70558b f157894q;

    /* renamed from: r */
    protected C70560c f157895r;

    /* renamed from: s */
    protected C70560c f157896s;

    /* renamed from: t */
    protected float f157897t;

    /* renamed from: u */
    protected int f157898u;

    /* renamed from: v */
    protected int f157899v;

    /* renamed from: w */
    protected C70089d f157900w;

    /* renamed from: x */
    protected boolean f157901x;

    /* renamed from: y */
    protected int f157902y;

    /* renamed from: z */
    protected long f157903z;

    static {
        Covode.recordClassIndex(83034);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public View getEndSlide() {
        return this.f157880c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public View getStartSlide() {
        return this.f157881d;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final boolean mo111140a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.f157892o = cutMultiVideoViewModel;
        MediaModel a = C70563d.m124625a(str, cutMultiVideoViewModel);
        if (a == null) {
            return false;
        }
        return mo111141a(eVar, cutMultiVideoViewModel, Collections.singletonList(a));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final boolean mo111141a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        return mo111138a(eVar, cutMultiVideoViewModel, null, C70528i.m124562a(list), list.size() > 1 ? 1 : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final boolean mo111138a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List<VideoSegment> list, int i) {
        this.f157890m = eVar;
        this.f157892o = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.f157891n = (VideoEditViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        } else {
            this.f157891n = videoEditViewModel;
        }
        this.f157898u = i;
        m124633a(cutMultiVideoViewModel, list);
        mo111297h();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111317a(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            m124635b(floatValue);
        } else {
            m124638c(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo111328p() {
        mo111298i();
        mo111299j();
    }

    /* renamed from: r */
    private void m124643r() {
        if (!this.f157859S) {
            this.f157859S = true;
            C70563d.m124628a(this.f157890m);
        }
    }

    public C70560c getFrameAdapter() {
        if (this.f157898u == 1) {
            return this.f157895r;
        }
        return this.f157896s;
    }

    public SpeedyLinearLayoutManager getLayoutManager() {
        if (this.f157898u == 1) {
            return this.f157860T;
        }
        return this.f157861U;
    }

    /* access modifiers changed from: protected */
    public AutoPollRecyclerView getRecyclerView() {
        if (this.f157898u == 1) {
            return this.f157883f;
        }
        return this.f157884g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo111325n() {
        postDelayed(new RunnableC70574n(this), 100);
    }

    private long getSelectedTimeV2() {
        return (long) Math.round(((this.f157880c.getStartX() - this.f157881d.getStartX()) - ((float) C70563d.f157831c)) * this.f157894q.f157808a);
    }

    /* renamed from: i */
    private void mo111298i() {
        int i;
        View view = this.f157857Q;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            float startX = this.f157881d.getStartX() + (((float) C70563d.f157831c) / 2.0f);
            if (!this.f157893p) {
                startX += this.f157887j;
            }
            int i2 = 0;
            View c = getLayoutManager().mo4358c(0);
            if (c != null) {
                i = (int) (startX - c.getX());
            } else {
                i = (int) startX;
            }
            if (i > 0) {
                i2 = i + 1;
            }
            this.f157857Q.setX(startX - ((float) i2));
            layoutParams.width = i2;
            layoutParams.height = this.f157867ad;
            layoutParams.topMargin = this.f157870ag;
            this.f157857Q.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    private void mo111299j() {
        int i;
        int i2;
        View view = this.f157858R;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            float startX = this.f157880c.getStartX() + (((float) C70563d.f157831c) / 2.0f);
            if (!this.f157893p) {
                startX -= this.f157887j;
            }
            View c = getLayoutManager().mo4358c(getLayoutManager().mo4685A() - 1);
            if (c != null) {
                i = (int) ((c.getX() + ((float) c.getWidth())) - startX);
            } else {
                i = (int) (((float) this.f157886i) - startX);
            }
            if (i <= 0) {
                i2 = 0;
            } else {
                i2 = i + 1;
            }
            this.f157858R.setX(startX);
            layoutParams.width = i2;
            layoutParams.height = this.f157867ad;
            layoutParams.topMargin = this.f157870ag;
            this.f157858R.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: q */
    private void m124642q() {
        this.f157857Q = new View(this.f157890m);
        this.f157858R = new View(this.f157890m);
        int a = C77795c.m135910a(false, false, true, false);
        this.f157857Q.setBackgroundColor(a);
        this.f157858R.setBackgroundColor(a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, this.f157867ad);
        layoutParams.topMargin = this.f157870ag;
        this.f157857Q.setLayoutParams(layoutParams);
        int startX = (int) (this.f157880c.getStartX() + ((float) (C70563d.f157831c / 2)));
        int i = ((int) (((float) (this.f157903z - this.f157842B)) / this.f157894q.f157808a)) - (C70563d.f157831c / 2);
        int i2 = this.f157886i;
        if (i > i2 - startX) {
            i = i2 - startX;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i + 2, this.f157867ad);
        layoutParams2.topMargin = this.f157870ag;
        this.f157858R.setX((float) startX);
        this.f157858R.setLayoutParams(layoutParams2);
        addView(this.f157857Q);
        addView(this.f157858R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo111324m() {
        if (this.f157843C != 0 && (this.f157880c.getStartX() - this.f157881d.getStartX()) - ((float) C70563d.f157831c) != this.f157897t) {
            long j = this.f157843C / 6;
            if (this.f157898u == 1) {
                C89378p<Integer, Float> a = C70558b.m124609a(this.f157841A, (float) j, this.f157866ac, this.f157891n.mo111232k());
                this.f157883f.mo111273g(a.component1().intValue(), -Math.round(a.component2().floatValue()));
            } else {
                long j2 = this.f157841A;
                int i = (int) (j2 / j);
                this.f157884g.mo111273g(i, -Math.round((((float) (j2 - (((long) i) * j))) / ((float) j)) * ((float) this.f157866ac)));
            }
            mo111325n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo111326o() {
        this.f157882e.setOnTouchListener(this);
        getRecyclerView().mo5599q();
        if (this.f157898u == 1) {
            if (this.f157843C != this.f157894q.f157809b) {
                this.f157894q.f157809b = this.f157843C;
                C70558b bVar = this.f157894q;
                long j = this.f157903z;
                this.f157891n.mo111233l();
                bVar.mo111305b(j);
                this.f157895r.mo111312b(this.f157894q.f157808a, 0.0f);
            }
        } else if (this.f157843C != this.f157894q.f157809b) {
            this.f157894q.f157809b = this.f157843C;
            this.f157894q.mo111303a(this.f157903z);
            this.f157896s.mo111312b(this.f157894q.f157808a, this.f157900w.f156750d);
        }
        mo111324m();
        m124634a(this.f157880c, (float) ((this.f157886i - this.f157902y) - C70563d.f157831c), false);
        m124634a(this.f157881d, (float) this.f157902y, true);
    }

    /* renamed from: s */
    private void m124644s() {
        this.f157882e.setOnTouchListener(this);
        if (this.f157850J.booleanValue()) {
            long j = this.f157874ak;
            if (j < 0) {
                long j2 = this.f157841A + j;
                this.f157841A = j2;
                if (j2 <= 0) {
                    this.f157841A = 0;
                }
                this.f157842B = this.f157841A + this.f157849I;
            } else {
                long j3 = this.f157842B + j;
                this.f157842B = j3;
                long j4 = this.f157903z;
                if (j3 >= j4) {
                    this.f157842B = j4;
                }
                this.f157841A = this.f157842B - this.f157849I;
            }
            this.f157891n.mo111228g();
            return;
        }
        getRecyclerView().mo5599q();
        if (this.f157898u == 1) {
            if (this.f157843C != this.f157894q.f157809b) {
                this.f157894q.f157809b = this.f157843C;
                C70558b bVar = this.f157894q;
                long j5 = this.f157903z;
                this.f157891n.mo111233l();
                bVar.mo111305b(j5);
                this.f157895r.mo111312b(this.f157894q.f157808a, 0.0f);
            }
        } else if (this.f157843C != this.f157894q.f157809b) {
            this.f157894q.f157809b = this.f157843C;
            this.f157894q.mo111303a(this.f157903z);
            this.f157896s.mo111312b(this.f157894q.f157808a, this.f157900w.f156750d);
        }
        mo111324m();
        m124634a(this.f157880c, (float) ((this.f157886i - this.f157902y) - C70563d.f157831c), false);
        m124634a(this.f157881d, (float) this.f157902y, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo111323l() {
        long j = this.f157843C;
        if (j != 0) {
            long j2 = j / 6;
            if (this.f157898u == 1) {
                C89378p<Integer, Float> a = C70558b.m124609a(this.f157841A, (float) j2, this.f157866ac, this.f157891n.mo111232k());
                this.f157883f.mo111273g(a.component1().intValue(), -Math.round(a.component2().floatValue()));
            } else {
                long j3 = this.f157841A;
                int i = (int) (j3 / j2);
                this.f157884g.mo111273g(i, -Math.round((((float) (j3 - (((long) i) * j2))) / ((float) j2)) * ((float) this.f157866ac)));
            }
            if (this.f157850J.booleanValue() && this.f157898u == 0 && this.f157849I < 1000) {
                VideoSegment videoSegment = this.f157891n.mo111232k().get(this.f157899v);
                if (this.f157841A > videoSegment.f156710b - this.f157843C) {
                    float f = ((float) (this.f157841A - (videoSegment.f156710b - this.f157843C))) / this.f157894q.f157808a;
                    RTLImageView rTLImageView = this.f157881d;
                    rTLImageView.setStartX(rTLImageView.getStartX() + f);
                    RTLImageView rTLImageView2 = this.f157880c;
                    rTLImageView2.setStartX(rTLImageView2.getStartX() + f);
                    mo111315a((int) this.f157881d.getStartX(), (int) this.f157880c.getStartX());
                }
            }
            mo111325n();
        }
    }

    /* renamed from: k */
    private void mo111300k() {
        RTLImageView rTLImageView = new RTLImageView(this.f157890m);
        this.f157881d = rTLImageView;
        rTLImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f157881d.setPadding(C70563d.f157831c / 2, 0, 0, 0);
        this.f157881d.setImageResource(2131235015);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70563d.f157831c, this.f157869af);
        layoutParams.topMargin = this.f157871ah;
        this.f157881d.setLayoutParams(layoutParams);
        this.f157881d.setOnTouchListener(this);
        this.f157881d.setTag("startSlide");
        this.f157881d.setStartX((float) this.f157902y);
        addView(this.f157881d);
        RTLImageView rTLImageView2 = new RTLImageView(this.f157890m);
        this.f157880c = rTLImageView2;
        rTLImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f157880c.setPadding(0, 0, C70563d.f157831c / 2, 0);
        this.f157880c.setImageResource(2131235014);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C70563d.f157831c, this.f157869af);
        layoutParams2.topMargin = this.f157871ah;
        this.f157880c.setLayoutParams(layoutParams2);
        this.f157880c.setOnTouchListener(this);
        this.f157880c.setTag("endSlide");
        this.f157880c.setStartX((float) ((this.f157886i - this.f157902y) - C70563d.f157831c));
        addView(this.f157880c);
        this.f157855O = new View(this.f157890m);
        this.f157856P = new View(this.f157890m);
        setBorderColor(R.color.bh);
        addView(this.f157855O);
        addView(this.f157856P);
        mo111315a((int) this.f157881d.getStartX(), (int) this.f157880c.getStartX());
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f157882e.getLayoutParams();
        layoutParams3.leftMargin = this.f157902y + C70563d.f157831c;
        layoutParams3.height = this.f157863W;
        layoutParams3.topMargin = this.f157865ab;
        this.f157882e.setLayoutParams(layoutParams3);
        this.f157882e.setTag("curPoint");
        this.f157882e.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f157879b.getLayoutParams();
        layoutParams4.width = this.f157862V;
        this.f157879b.setLayoutParams(layoutParams4);
        this.f157879b.setImageDrawable(C84916a.m145947a(0, -1, 1, this.f157862V / 2));
        if (C68062ck.m120368a()) {
            this.f157879b.setImageDrawable(null);
            int a = C71812ep.m126783a(0.5d, C63247i.f143610a);
            C74286i.C74288b.m130698a(this.f157879b, -1, C71812ep.m126783a((double) (((float) this.f157862V) / 2.0f), C63247i.f143610a), C0643b.m2378c(getContext(), R.color.bo), a, a, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: b */
    public final void mo111142b() {
        C70089d dVar = this.f157900w;
        if (dVar != null) {
            if (this.f157898u != 1) {
                dVar.f156747a = (long) (((float) this.f157841A) * dVar.f156750d);
                C70089d dVar2 = this.f157900w;
                dVar2.f156748b = (long) (((float) this.f157842B) * dVar2.f156750d);
            }
            if (this.f157898u == 0) {
                this.f157891n.mo111213a(this.f157900w, this.f157899v);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo111297h() {
        this.f157899v = 0;
        View inflate = View.inflate(this.f157890m, R.layout.bhm, this);
        this.f157879b = (ImageView) inflate.findViewById(R.id.agr);
        this.f157882e = (RTLLinearLayout) inflate.findViewById(R.id.ags);
        this.f157883f = (AutoPollRecyclerView) inflate.findViewById(R.id.b8o);
        this.f157884g = (AutoPollRecyclerView) inflate.findViewById(R.id.e1d);
        this.f157885h = (InterceptFrameLayout) inflate.findViewById(R.id.dgq);
        VideoSegment videoSegment = this.f157891n.mo111232k().get(this.f157899v);
        if (this.f157898u != 1) {
            C73991bj.m130128a("init EditState");
            VideoSegment videoSegment2 = this.f157891n.mo111232k().get(0);
            this.f157900w = new C70089d(videoSegment2);
            this.f157903z = (long) (((float) videoSegment2.f156710b) / videoSegment2.mo110582f());
        } else {
            this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
        }
        this.f157843C = m124630a(this.f157903z, true);
        C70558b bVar = new C70558b(this.f157897t);
        this.f157894q = bVar;
        bVar.f157810c = this.f157889l;
        this.f157894q.f157811d = this.f157888k;
        this.f157894q.f157809b = this.f157843C;
        this.f157841A = 0;
        this.f157842B = 0 + this.f157843C;
        this.f157891n.mo111207a(this.f157897t);
        if (this.f157898u == 1) {
            C70558b bVar2 = this.f157894q;
            long j = this.f157903z;
            this.f157891n.mo111233l();
            bVar2.mo111305b(j);
        } else {
            this.f157894q.mo111304a(videoSegment.f156710b, videoSegment.mo110582f());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f157884g.getLayoutParams();
        layoutParams.topMargin = this.f157870ag;
        this.f157884g.setLayoutParams(layoutParams);
        this.f157884g.setPadding(this.f157902y + C70563d.f157831c, 0, this.f157902y + C70563d.f157831c, 0);
        C70560c cVar = new C70560c(this.f157890m, new int[]{this.f157866ac, this.f157867ad}, this.f157894q.f157808a, this.f157852L, 0);
        this.f157896s = cVar;
        cVar.mo111311a(this.f157846F);
        this.f157884g.setAdapter(this.f157896s);
        SpeedyLinearLayoutManager speedyLinearLayoutManager = new SpeedyLinearLayoutManager(this.f157890m);
        this.f157861U = speedyLinearLayoutManager;
        this.f157884g.setLayoutManager(speedyLinearLayoutManager);
        this.f157884g.mo4405a(this.f157875al);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f157883f.getLayoutParams();
        layoutParams2.topMargin = this.f157870ag;
        this.f157883f.setLayoutParams(layoutParams2);
        this.f157883f.setPadding(this.f157902y + C70563d.f157831c, 0, this.f157902y + C70563d.f157831c, 0);
        C70560c cVar2 = new C70560c(this.f157890m, new int[]{this.f157866ac, this.f157867ad}, this.f157894q.f157808a, this.f157852L, 1);
        this.f157895r = cVar2;
        cVar2.mo111311a(this.f157846F);
        this.f157883f.setAdapter(this.f157895r);
        SpeedyLinearLayoutManager speedyLinearLayoutManager2 = new SpeedyLinearLayoutManager(this.f157890m);
        this.f157860T = speedyLinearLayoutManager2;
        this.f157883f.setLayoutManager(speedyLinearLayoutManager2);
        this.f157883f.mo4405a(this.f157875al);
        if (this.f157898u == 0) {
            this.f157884g.setVisibility(0);
            this.f157883f.setVisibility(8);
        } else {
            this.f157884g.setVisibility(8);
            this.f157883f.setVisibility(0);
        }
        if (this.f157901x) {
            mo111127a();
        }
        mo111300k();
        m124642q();
        this.f157881d.bringToFront();
        this.f157880c.bringToFront();
        this.f157882e.bringToFront();
    }

    public void setSelfAdaptiontoastAnimListener(AbstractC70075h hVar) {
        this.f157853M = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo111318b(long j) {
        return m124630a(j, false);
    }

    /* renamed from: a */
    private static Context m124631a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    public void setFocusOnMode(boolean z) {
        this.f157891n.f157694s.setValue(Boolean.valueOf(z));
    }

    public void setBorderColor(int i) {
        this.f157855O.setBackgroundColor(this.f157890m.getResources().getColor(i));
        this.f157856P.setBackgroundColor(this.f157890m.getResources().getColor(i));
    }

    /* renamed from: a */
    private void mo111291a(float f) {
        float f2 = this.f157877an;
        if (f2 == 0.0f) {
            this.f157877an = f;
        } else if (Math.abs(f2 - f) > 3.0f) {
            this.f157877an = f;
            this.f157891n.mo111227f();
        }
    }

    /* renamed from: b */
    private void m124635b(float f) {
        if (this.f157843C < this.f157888k) {
            m124637b(false);
            long j = this.f157888k;
            this.f157843C = j;
            this.f157841A = this.f157842B - j;
        } else {
            m124636b(f, true);
        }
        mo111142b();
        if (this.f157873aj == 1) {
            this.f157891n.mo111206a();
        }
    }

    /* renamed from: c */
    private void m124638c(float f) {
        if (this.f157843C < this.f157888k) {
            m124637b(false);
            long j = this.f157888k;
            this.f157843C = j;
            this.f157842B = this.f157841A + j;
        } else {
            m124636b(f, false);
        }
        mo111142b();
        if (this.f157873aj == 2) {
            this.f157891n.mo111217b();
        }
    }

    public void setEnabled(boolean z) {
        this.f157885h.setIntercept(!z);
        if (z) {
            this.f157881d.setEnabled(true);
            this.f157880c.setEnabled(true);
            this.f157882e.setEnabled(true);
        } else if (this.f157873aj == 0) {
            this.f157881d.setEnabled(false);
            this.f157880c.setEnabled(false);
            this.f157882e.setEnabled(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public void setEditViewHeight(boolean z) {
        if (z) {
            this.f157863W = this.f157864aa;
            this.f157867ad = C70563d.f157829a;
            this.f157865ab = 0;
        } else {
            this.f157863W = (int) C13628n.m24520b(getContext(), 44.0f);
            this.f157867ad = this.f157868ae;
            this.f157865ab = (int) C13628n.m24520b(getContext(), 2.0f);
        }
        int i = this.f157867ad;
        this.f157869af = (this.f157872ai * 2) + i;
        this.f157895r.mo111308a(i);
        this.f157896s.mo111308a(this.f157867ad);
        removeView(this.f157881d);
        removeView(this.f157880c);
        removeView(this.f157855O);
        removeView(this.f157856P);
        removeView(this.f157857Q);
        removeView(this.f157858R);
        mo111300k();
        m124642q();
        this.f157881d.bringToFront();
        this.f157880c.bringToFront();
        this.f157882e.bringToFront();
    }

    /* renamed from: b */
    private void m124637b(boolean z) {
        String string;
        if (!this.f157859S) {
            this.f157859S = true;
            C70563d.m124628a(this.f157890m);
            if (!z) {
                string = getResources().getString(R.string.h3q, Float.valueOf(((float) this.f157888k) / 1000.0f));
            } else if (!this.f157702a || !C70983b.m125339a()) {
                string = getResources().getString(R.string.h3p, Long.valueOf(this.f157889l / 1000));
            } else {
                string = C70983b.m125337a(m124631a(getContext()));
            }
            new C79459a(this.f157890m).mo123052a(string).mo123053a();
        }
    }

    /* renamed from: a */
    public final void mo111314a(int i) {
        float abs = ((float) Math.abs(i)) * this.f157894q.f157808a;
        if (i > 0) {
            long j = (long) (((float) this.f157842B) + abs);
            this.f157842B = j;
            long j2 = this.f157903z;
            if (j >= j2) {
                this.f157842B = j2;
            }
            this.f157841A = this.f157842B - this.f157849I;
        } else {
            long j3 = (long) (((float) this.f157841A) - abs);
            this.f157841A = j3;
            if (j3 <= 0) {
                this.f157841A = 0;
            }
            this.f157842B = this.f157841A + this.f157849I;
        }
        mo111298i();
        mo111299j();
        mo111142b();
    }

    /* renamed from: b */
    public final void mo111319b(int i) {
        if (this.f157873aj != 0) {
            if (i < 0) {
                RTLImageView rTLImageView = this.f157880c;
                rTLImageView.setStartX(rTLImageView.getStartX() - ((float) i));
            } else {
                RTLImageView rTLImageView2 = this.f157881d;
                rTLImageView2.setStartX(rTLImageView2.getStartX() - ((float) i));
            }
            mo111298i();
            mo111299j();
            mo111315a((int) this.f157881d.getStartX(), (int) this.f157880c.getStartX());
            long selectedTimeV2 = getSelectedTimeV2();
            this.f157843C = selectedTimeV2;
            int i2 = this.f157873aj;
            if (i2 == 1) {
                long j = this.f157842B - selectedTimeV2;
                this.f157841A = j;
                if (j <= 0) {
                    this.f157841A = 0;
                }
            } else if (i2 == 2) {
                long j2 = this.f157841A + selectedTimeV2;
                this.f157842B = j2;
                long j3 = this.f157903z;
                if (j2 >= j3) {
                    this.f157842B = j3;
                }
            }
            long j4 = this.f157842B - this.f157841A;
            this.f157843C = j4;
            long j5 = this.f157889l;
            if (j4 > j5) {
                this.f157843C = j5;
                m124637b(true);
                getRecyclerView().mo5599q();
            }
        } else {
            if (i > 0) {
                long abs = (long) (((float) this.f157842B) + (((float) Math.abs(i)) * this.f157894q.f157808a));
                this.f157842B = abs;
                long j6 = this.f157903z;
                if (abs >= j6) {
                    this.f157842B = j6;
                }
                this.f157841A = this.f157842B - this.f157843C;
            } else {
                long abs2 = (long) (((float) this.f157841A) - (((float) Math.abs(i)) * this.f157894q.f157808a));
                this.f157841A = abs2;
                if (abs2 <= 0) {
                    this.f157841A = 0;
                }
                this.f157842B = this.f157841A + this.f157843C;
            }
            mo111298i();
            mo111299j();
        }
        mo111142b();
    }

    /* renamed from: a */
    private long m124630a(long j, boolean z) {
        long min = Math.min(j, this.f157889l);
        if (!z || !C70983b.m125339a()) {
            return min;
        }
        return Math.min(min, C70095p.m123775a());
    }

    /* renamed from: a */
    private void m124633a(CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        if (cutMultiVideoViewModel.f156539k) {
            for (VideoSegment videoSegment : list) {
                videoSegment.f156710b = (long) cutMultiVideoViewModel.f156540l;
                videoSegment.f156714f = 720;
                videoSegment.f156715g = 1280;
            }
        }
        this.f157891n.mo111220b(list);
    }

    /* renamed from: b */
    private void m124636b(float f, boolean z) {
        if (z) {
            this.f157881d.setStartX(f);
        } else {
            this.f157880c.setStartX(f);
        }
        mo111315a((int) this.f157881d.getStartX(), (int) this.f157880c.getStartX());
        if (z) {
            mo111298i();
        } else {
            mo111299j();
        }
    }

    public AbstractView$OnTouchListenerC70571l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C63244g.m114602a().mo73256B();
        this.f157889l = C70563d.m124624a();
        this.f157893p = true;
        this.f157901x = true;
        this.f157867ad = C70563d.f157829a;
        this.f157868ae = C71812ep.m126783a(32.0d, C63247i.f143610a);
        this.f157873aj = 0;
        this.f157902y = C70563d.f157832d;
        this.f157903z = 0;
        this.f157841A = 0;
        this.f157842B = 0;
        this.f157843C = 0;
        this.f157844D = 0;
        this.f157845E = 0;
        this.f157847G = false;
        this.f157848H = false;
        this.f157849I = 0;
        this.f157850J = false;
        this.f157851K = 0.0f;
        this.f157875al = new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AbstractView$OnTouchListenerC70571l.C705721 */

            static {
                Covode.recordClassIndex(83035);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AbstractView$OnTouchListenerC70571l lVar = AbstractView$OnTouchListenerC70571l.this;
                    lVar.mo111313a(lVar.f157881d.getStartX() + ((float) C70563d.f157831c), false);
                    AbstractView$OnTouchListenerC70571l.this.f157848H = true;
                    AbstractView$OnTouchListenerC70571l.this.f157881d.setEnabled(false);
                    AbstractView$OnTouchListenerC70571l.this.f157880c.setEnabled(false);
                } else if (i == 0) {
                    AbstractView$OnTouchListenerC70571l.this.setFocusOnMode(false);
                    AbstractView$OnTouchListenerC70571l.this.f157881d.setEnabled(true);
                    AbstractView$OnTouchListenerC70571l.this.f157880c.setEnabled(true);
                    if (AbstractView$OnTouchListenerC70571l.this.f157848H) {
                        AbstractView$OnTouchListenerC70571l.this.f157891n.mo111228g();
                        AbstractView$OnTouchListenerC70571l.this.f157848H = false;
                        if (AbstractView$OnTouchListenerC70571l.this.f157891n.mo111232k().size() > 8) {
                            AbstractView$OnTouchListenerC70571l.this.f157852L.mo111281c();
                        }
                    } else {
                        if (AbstractView$OnTouchListenerC70571l.this.getLayoutManager().mo4372l() == 0) {
                            AbstractView$OnTouchListenerC70571l.this.f157841A = 0;
                            AbstractView$OnTouchListenerC70571l lVar2 = AbstractView$OnTouchListenerC70571l.this;
                            lVar2.f157843C = lVar2.f157842B - AbstractView$OnTouchListenerC70571l.this.f157841A;
                            AbstractView$OnTouchListenerC70571l.this.f157891n.mo111207a(0.0f);
                        }
                        if (AbstractView$OnTouchListenerC70571l.this.getLayoutManager().mo4374n() == AbstractView$OnTouchListenerC70571l.this.getFrameAdapter().getItemCount() - 1) {
                            AbstractView$OnTouchListenerC70571l lVar3 = AbstractView$OnTouchListenerC70571l.this;
                            lVar3.f157842B = lVar3.f157903z;
                            AbstractView$OnTouchListenerC70571l lVar4 = AbstractView$OnTouchListenerC70571l.this;
                            lVar4.f157843C = lVar4.f157842B - AbstractView$OnTouchListenerC70571l.this.f157841A;
                            AbstractView$OnTouchListenerC70571l.this.f157891n.mo111207a(0.0f);
                        }
                    }
                }
                super.mo4753a(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                if (i != 0) {
                    if (AbstractView$OnTouchListenerC70571l.this.f157850J.booleanValue()) {
                        AbstractView$OnTouchListenerC70571l.this.mo111314a(i);
                    } else {
                        AbstractView$OnTouchListenerC70571l.this.mo111319b(i);
                    }
                    if (!AbstractView$OnTouchListenerC70571l.this.f157848H) {
                        AbstractView$OnTouchListenerC70571l.this.f157891n.mo111207a(AbstractView$OnTouchListenerC70571l.this.f157897t);
                        if (AbstractView$OnTouchListenerC70571l.this.f157853M != null) {
                            AbstractView$OnTouchListenerC70571l.this.f157853M.mo110533b(AbstractView$OnTouchListenerC70571l.this.getSelectedTime());
                        }
                    }
                }
            }
        };
        this.f157877an = 0.0f;
        this.f157886i = C40979n.m82507b(context);
        this.f157872ai = (int) C13628n.m24520b(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q9, R.attr.qp, R.attr.qq, R.attr.ux, R.attr.uy, R.attr.a1t, R.attr.a5e, R.attr.a5f, R.attr.a69, R.attr.a7h, R.attr.abt, R.attr.act, R.attr.af6});
            this.f157862V = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            int round = Math.round(obtainStyledAttributes.getDimension(1, 0.0f));
            this.f157864aa = round;
            this.f157863W = round;
            this.f157869af = this.f157867ad + (this.f157872ai * 2);
            float f = (float) ((this.f157886i - (C70563d.f157831c * 2)) - (this.f157902y * 2));
            this.f157897t = f;
            this.f157866ac = Math.round(f / 6.0f);
            this.f157871ah = (this.f157863W - C70563d.f157830b) / 2;
            this.f157870ag = (this.f157863W - this.f157867ad) / 2;
            obtainStyledAttributes.recycle();
        }
        setLoadThumbnailDirectly(true);
        this.f157852L = new VEMediaParserProviderV2(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111313a(float f, boolean z) {
        if (f < this.f157881d.getStartX() + ((float) C70563d.f157831c)) {
            f = this.f157881d.getStartX() + ((float) C70563d.f157831c);
        }
        if (f > this.f157880c.getStartX() - ((float) this.f157879b.getWidth())) {
            f = this.f157880c.getStartX() - ((float) this.f157879b.getWidth());
        }
        this.f157882e.setStartX(f);
        if (!z) {
            return;
        }
        if (this.f157898u == 2) {
            this.f157891n.mo111210a(getSinglePlayingPosition());
        } else {
            this.f157891n.mo111210a(getMultiPlayingPosition());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r13.equals("endSlide") == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r13.equals("curPoint") == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 882
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AbstractView$OnTouchListenerC70571l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111315a(int i, int i2) {
        if (this.f157855O != null && this.f157856P != null && i <= i2) {
            int i3 = C70563d.f157831c + i;
            int i4 = ((i2 - i) - C70563d.f157831c) + 1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f157855O.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = i4;
            layoutParams.height = this.f157872ai;
            layoutParams.leftMargin = i3;
            layoutParams.topMargin = this.f157871ah;
            this.f157855O.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f157856P.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams2.width = i4;
            layoutParams2.height = this.f157872ai;
            layoutParams2.leftMargin = i3;
            layoutParams2.topMargin = (this.f157871ah + this.f157869af) - this.f157872ai;
            this.f157856P.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a */
    private void m124634a(RTLImageView rTLImageView, float f, boolean z) {
        if (rTLImageView != null && Math.abs(rTLImageView.getStartX() - f) > 1.0f) {
            if (!z) {
                float startX = rTLImageView.getStartX();
                int i = this.f157886i;
                if (startX > ((float) (i + 1))) {
                    rTLImageView.setStartX((float) (i + 1));
                }
            } else if (rTLImageView.getStartX() < ((float) (-C70563d.f157831c))) {
                rTLImageView.setStartX((float) (-C70563d.f157831c));
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rTLImageView.getStartX(), f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(this.f157854N);
            ofFloat.addUpdateListener(new C70573m(this, z));
            ofFloat.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111316a(long j, long j2, long j3) {
        long j4 = j2 - j;
        this.f157843C = j4;
        this.f157843C = Math.min(j3, j4);
        this.f157841A = j;
        this.f157842B = j2;
    }
}
