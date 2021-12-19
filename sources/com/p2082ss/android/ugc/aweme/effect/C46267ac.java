package com.p2082ss.android.ugc.aweme.effect;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.p2891c.C46337a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46346b;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.C77792a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.widget.AVStatusView;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88300w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.ac */
public class C46267ac {

    /* renamed from: a */
    public static final String f107839a = C46267ac.class.getSimpleName();

    /* renamed from: A */
    public AbstractC31071f f107840A;

    /* renamed from: B */
    public AbstractC46263a f107841B;

    /* renamed from: C */
    C74297p f107842C;

    /* renamed from: D */
    public AbstractC85541q f107843D;

    /* renamed from: E */
    public int f107844E;

    /* renamed from: F */
    public int f107845F;

    /* renamed from: G */
    public RunnableC46275b f107846G;

    /* renamed from: H */
    public RunnableC46274a f107847H;

    /* renamed from: I */
    public View f107848I;

    /* renamed from: J */
    public C46369r f107849J;

    /* renamed from: K */
    boolean f107850K;

    /* renamed from: L */
    public ActivityC0945e f107851L;

    /* renamed from: M */
    public EffectPointModel f107852M;

    /* renamed from: N */
    C88300w f107853N;

    /* renamed from: O */
    public C46337a f107854O = new C46337a();

    /* renamed from: P */
    public String f107855P;

    /* renamed from: Q */
    public ArrayList<EffectPointModel> f107856Q;

    /* renamed from: R */
    ArrayList<EffectPointModel> f107857R;

    /* renamed from: S */
    int f107858S = -1;

    /* renamed from: T */
    public C1213t<Bitmap> f107859T;

    /* renamed from: U */
    public C1213t<Boolean> f107860U;

    /* renamed from: V */
    public SafeHandler f107861V;

    /* renamed from: W */
    public EditEffectVideoModel f107862W;

    /* renamed from: X */
    public AbstractC46354a f107863X;

    /* renamed from: Y */
    public AbstractC46355b f107864Y;

    /* renamed from: Z */
    public ViewPager.AbstractC1579e f107865Z;

    /* renamed from: aa */
    public int f107866aa;

    /* renamed from: ab */
    public boolean f107867ab = false;

    /* renamed from: ac */
    public boolean f107868ac = false;

    /* renamed from: ad */
    public boolean f107869ad = false;

    /* renamed from: ae */
    public AbstractC84919c f107870ae;

    /* renamed from: af */
    AbstractC84917a f107871af = new C46276ad(this);

    /* renamed from: ag */
    public Runnable f107872ag = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.effect.C46267ac.RunnableC462725 */

        static {
            Covode.recordClassIndex(54849);
        }

        public final void run() {
            if (C46267ac.this.f107840A != null) {
                C46267ac.this.mo78745a((int) C46267ac.this.f107841B.mo78737d(), false);
                C46267ac.this.f107861V.postDelayed(C46267ac.this.f107872ag, 0);
            }
        }
    };

    /* renamed from: ah */
    private EffectPointModel f107873ah;

    /* renamed from: b */
    public VideoPublishEditModel f107874b;

    /* renamed from: c */
    public AbstractC71531x f107875c;

    /* renamed from: d */
    public C1213t<C88292p> f107876d;

    /* renamed from: e */
    public C1213t<C88296t> f107877e;

    /* renamed from: f */
    public C1213t<C88300w> f107878f;

    /* renamed from: g */
    public C1213t<Boolean> f107879g;

    /* renamed from: h */
    public SafeHandler f107880h;

    /* renamed from: i */
    public AbstractC1204m f107881i;

    /* renamed from: j */
    public VEEffectSeekLayout f107882j;

    /* renamed from: k */
    public LinearLayout f107883k;

    /* renamed from: l */
    public FrameLayout f107884l;

    /* renamed from: m */
    public ImageView f107885m;

    /* renamed from: n */
    public RelativeLayout f107886n;

    /* renamed from: o */
    public TextView f107887o;

    /* renamed from: p */
    public RelativeLayout f107888p;

    /* renamed from: q */
    public LinearLayout f107889q;

    /* renamed from: r */
    public AVStatusView f107890r;

    /* renamed from: s */
    public TextView f107891s;

    /* renamed from: t */
    public TextView f107892t;

    /* renamed from: u */
    public NoScrollViewPager f107893u;

    /* renamed from: v */
    public AVDmtTabLayout f107894v;

    /* renamed from: w */
    public ChooseVideoCoverView f107895w;

    /* renamed from: x */
    public VideoEditView f107896x;

    /* renamed from: y */
    CutMultiVideoViewModel f107897y;

    /* renamed from: z */
    AbstractC69978a f107898z;

    /* renamed from: a */
    public final boolean mo78751a() {
        if (this.f107874b.canvasVideoData == null && !this.f107874b.isStitchMode() && !this.f107874b.isMvThemeVideoType()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo78752a(List<EffectCategoryResponse> list) {
        boolean z;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!this.f107874b.isMvThemeVideoType() || this.f107874b.isPhotoMvMode) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i) == null || !C89219l.m154714a((Object) "sticker", (Object) list.get(i).getKey())) {
                    i++;
                } else if (i != -1) {
                    list.remove(i);
                }
            }
        }
        if (!mo78772p().booleanValue()) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (list.get(i2) == null || !C89219l.m154714a((Object) "motion", (Object) list.get(i2).getKey())) {
                    i2++;
                } else if (i2 != -1) {
                    list.remove(i2);
                }
            }
        }
        if (!mo78751a()) {
            return false;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setName(this.f107851L.getString(R.string.g9q));
        list.add(effectCategoryResponse);
        return true;
    }

    static {
        Covode.recordClassIndex(54844);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo78756c() {
        this.f107846G = null;
        this.f107847H = null;
        this.f107880h.removeCallbacksAndMessages(null);
        this.f107861V.removeCallbacksAndMessages(null);
    }

    /* renamed from: l */
    public final void mo78768l() {
        this.f107877e.setValue(C88296t.m153437b());
        mo78769m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo78769m() {
        C46371s.m89465a(this.f107885m, true);
        ImageView imageView = this.f107885m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: p */
    public final Boolean mo78772p() {
        boolean z;
        if (this.f107866aa > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.effect.ac$b */
    public class RunnableC46275b implements Runnable {

        /* renamed from: a */
        int f107908a;

        static {
            Covode.recordClassIndex(54852);
        }

        public final void run() {
            C46267ac.this.f107882j.mo78715a(this.f107908a, (int) C46267ac.this.f107841B.mo78737d());
            C46267ac.this.f107880h.post(this);
        }

        RunnableC46275b(int i) {
            this.f107908a = i;
        }
    }

    /* renamed from: q */
    private void m89283q() {
        if (this.f107849J.f108067a != null && (this.f107849J.f108067a instanceof AbstractC46380u)) {
            ((AbstractC46380u) this.f107849J.f108067a).mo78874g();
        }
    }

    /* renamed from: e */
    public final void mo78761e() {
        mo78745a(0, false);
        int G = this.f107840A.mo56246G();
        this.f107882j.setVideoDuration(G);
        this.f107896x.mo111131a(G);
        this.f107854O.mo78829a(G);
    }

    /* renamed from: f */
    public final void mo78762f() {
        this.f107875c.mo111960a().mo5534a(new C46279ag(this), C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo78764h() {
        if (this.f107888p.getHeight() == 0) {
            return (int) C13628n.m24520b(this.f107851L, 52.0f);
        }
        return this.f107888p.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo78765i() {
        int height;
        if (this.f107884l.getHeight() == 0) {
            height = (int) C13628n.m24520b(this.f107851L, 276.0f);
        } else {
            height = this.f107884l.getHeight();
        }
        return height + 16;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo78767k() {
        this.f107877e.setValue(C88296t.m153435a());
        C46371s.m89465a(this.f107885m, false);
        ImageView imageView = this.f107885m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo78771o() {
        return (((C70636dh.m124836e(this.f107851L) - mo78764h()) - mo78765i()) - C70636dh.m124833c(this.f107851L)) - C70636dh.m124835d(this.f107851L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.effect.ac$a */
    public class RunnableC46274a implements Runnable {
        static {
            Covode.recordClassIndex(54851);
        }

        public final void run() {
            C46267ac.this.mo78745a((int) C46267ac.this.f107841B.mo78737d(), false);
            if (!C46267ac.this.mo78759d()) {
                C46267ac.this.f107880h.postDelayed(this, 0);
            }
        }

        RunnableC46274a() {
        }
    }

    /* renamed from: d */
    public final boolean mo78759d() {
        if (!this.f107850K) {
            return true;
        }
        if (!this.f107841B.mo78735b()) {
            return false;
        }
        this.f107877e.setValue(C88296t.m153438b(this.f107854O.mo78828a()));
        mo78745a((int) this.f107854O.f108011b, false);
        mo78768l();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo78763g() {
        this.f107862W.mo78628e().setValue(Float.valueOf(this.f107896x.getSelectedTime()));
        m89281i(true);
    }

    /* renamed from: b */
    public final void mo78753b() {
        EffectPointModel effectPointModel = this.f107852M;
        if (effectPointModel == null || "0".equals(effectPointModel.getKey())) {
            this.f107882j.mo78720a(true, this.f107845F);
            mo78748a((List<EffectPointModel>) null, false, false);
        } else if (!"1".equals(this.f107852M.getKey())) {
            mo78758d(true);
            ArrayList arrayList = new ArrayList();
            EffectPointModel effectPointModel2 = new EffectPointModel();
            int startPoint = this.f107852M.getStartPoint();
            int endPoint = this.f107852M.getEndPoint();
            effectPointModel2.setUiStartPoint(startPoint);
            effectPointModel2.setUiEndPoint(endPoint);
            arrayList.add(effectPointModel2);
            mo78748a((List<EffectPointModel>) arrayList, true, false);
        } else {
            this.f107882j.mo78720a(true, this.f107844E);
            mo78748a((List<EffectPointModel>) null, false, false);
        }
    }

    /* renamed from: n */
    public final void mo78770n() {
        this.f107857R = new ArrayList<>(this.f107856Q);
        EffectPointModel effectPointModel = this.f107852M;
        if (effectPointModel != null) {
            this.f107873ah = effectPointModel.clone();
        }
        if (this.f107878f.getValue() != null) {
            this.f107853N = this.f107878f.getValue().clone();
        }
        EffectPointModel effectPointModel2 = this.f107873ah;
        if (effectPointModel2 == null || !effectPointModel2.getKey().equals("1")) {
            this.f107862W.mo78635l().setValue(false);
        } else {
            this.f107862W.mo78635l().setValue(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e5, code lost:
        if (r1.equals("3") == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
        if (r1.equals("2") == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r10.f107882j.setOverlayColor(r10.f107845F);
        mo78758d(true);
        r1 = dmt.p4542av.video.C88296t.m153438b(0);
        mo78745a(0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        if (r1 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        r10.f107877e.setValue(r1);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78766j() {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effect.C46267ac.mo78766j():void");
    }

    /* renamed from: f */
    private void m89278f(boolean z) {
        m89279g(z);
        m89280h(z);
    }

    /* renamed from: h */
    private void m89280h(boolean z) {
        this.f107896x.mo111144b(z);
    }

    /* renamed from: d */
    public final void mo78758d(boolean z) {
        this.f107896x.mo111146c(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo78755b(boolean z) {
        int i;
        VideoEditView videoEditView = this.f107896x;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        videoEditView.setVisibility(i);
    }

    /* renamed from: g */
    private void m89279g(boolean z) {
        ChooseVideoCoverView.C74231a aVar;
        if ((this.f107895w.getAdapter() instanceof ChooseVideoCoverView.C74231a) && (aVar = (ChooseVideoCoverView.C74231a) this.f107895w.getAdapter()) != null) {
            aVar.mo116716a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo78757c(boolean z) {
        int i;
        VEEffectSeekLayout vEEffectSeekLayout = this.f107882j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        vEEffectSeekLayout.setVisibility(i);
    }

    /* renamed from: i */
    private void m89281i(boolean z) {
        C46346b b;
        if (z) {
            b = C46346b.C46347a.m89401a(this.f107896x.getSelectedTime());
        } else {
            b = C46346b.C46347a.m89402b((float) this.f107840A.mo56246G());
        }
        this.f107862W.mo78629f().setValue(b);
    }

    /* renamed from: e */
    public final Boolean mo78760e(boolean z) {
        Keva repo = Keva.getRepo("add_motion_tab");
        boolean z2 = true;
        if (this.f107866aa != 2 || !repo.getBoolean("is_first_click_motion_tab", true)) {
            z2 = false;
        } else if (z) {
            repo.storeBoolean("is_first_click_motion_tab", false);
        }
        return Boolean.valueOf(z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78743a(int i) {
        ArrayList<EffectPointModel> effectPointModels = this.f107882j.getEffectPointModels();
        if (!C13617h.m24465a(effectPointModels)) {
            C85581w.EnumC85611j f = this.f107840A.mo56356f();
            this.f107882j.mo78714a(i);
            if (effectPointModels.isEmpty()) {
                this.f107877e.setValue(C88296t.m153438b(0));
                mo78745a((int) this.f107841B.mo78733a(0), false);
            } else {
                EffectPointModel effectPointModel = effectPointModels.get(effectPointModels.size() - 1);
                int uiEndPoint = effectPointModel.getUiEndPoint();
                if (effectPointModel.isFromEnd() ^ this.f107841B.mo78736c()) {
                    uiEndPoint = this.f107840A.mo56246G() - uiEndPoint;
                }
                mo78745a(uiEndPoint, false);
                this.f107877e.setValue(C88296t.m153438b((long) uiEndPoint));
            }
            if (f == C85581w.EnumC85611j.STARTED) {
                mo78768l();
            }
        }
    }

    /* renamed from: b */
    public final void mo78754b(List<EffectCategoryResponse> list) {
        if (!(list == null || list.isEmpty())) {
            this.f107894v.mo115533b();
            this.f107894v.setMaxTabModeForCount(list.size());
            for (int i = 0; i < list.size(); i++) {
                C77792a a = AVDmtTabLayout.C77790a.m135898a(this.f107851L);
                a.setText(list.get(i).getName());
                a.mo121365a(i, list.size());
                a.setTag(Integer.valueOf(i));
                a.setOnClickListener(new View$OnClickListenerC46293au(this, list, a));
                if (C89219l.m154714a((Object) "motion", (Object) list.get(i).getKey()) && mo78760e(false).booleanValue()) {
                    a.mo121366a(true);
                    this.f107867ab = true;
                }
                AVDmtTabLayout aVDmtTabLayout = this.f107894v;
                aVDmtTabLayout.mo115525a(aVDmtTabLayout.mo115519a().mo115584a(a));
            }
        }
    }

    /* renamed from: j */
    private void m89282j(boolean z) {
        if (z) {
            this.f107874b.mEffectList = new ArrayList<>(this.f107863X.mo78856g());
            this.f107874b.mTimeEffect = this.f107852M;
            if (!(this.f107874b.mTimeEffect == null || !this.f107874b.mTimeEffect.getKey().equals("1") || this.f107863X.mo78854e().getValue() == null)) {
                this.f107874b.getPreviewInfo().updateReverseVideoContent(this.f107875c.mo111962c(), this.f107875c.mo111963d(), this.f107875c.mo111964e());
            }
            if (this.f107874b.mTimeEffect != null) {
                this.f107874b.mEffectList.add(this.f107874b.mTimeEffect);
            }
            C84425b a = new C84425b().mo129406a("creation_id", this.f107874b.creationId).mo129406a("shoot_way", this.f107874b.mShootWay);
            if (this.f107874b.draftId != 0) {
                a.mo129403a("draft_id", this.f107874b.draftId);
            }
            if (!TextUtils.isEmpty(this.f107874b.newDraftId)) {
                a.mo129406a("new_draft_id", this.f107874b.newDraftId);
            }
            if (this.f107874b.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<EffectPointModel> it = this.f107874b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (!TextUtils.isEmpty(next.getName())) {
                        sb.append(next.getName()).append(",");
                    }
                }
                if (sb.length() > 0) {
                    a.mo129406a("effect_name", sb.substring(0, sb.length() - 1));
                }
            }
            C63244g.m114602a().mo73263I().mo101634a("effect_confirm", a.f188764a);
            return;
        }
        this.f107874b.mEffectList = new ArrayList<>(this.f107863X.mo78856g());
        this.f107874b.mTimeEffect = this.f107852M;
        if (this.f107874b.mTimeEffect != null) {
            this.f107874b.mEffectList.add(this.f107874b.mTimeEffect);
        }
    }

    /* renamed from: a */
    public final void mo78749a(boolean z) {
        if (z) {
            this.f107889q.setVisibility(0);
            this.f107883k.setVisibility(8);
            AVStatusView aVStatusView = this.f107890r;
            if (aVStatusView != null) {
                aVStatusView.mo129846b();
                return;
            }
            return;
        }
        AVStatusView aVStatusView2 = this.f107890r;
        if (aVStatusView2 != null) {
            aVStatusView2.mo129845a();
        }
        this.f107889q.setVisibility(8);
        this.f107883k.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78744a(int i, int i2) {
        if (i >= 0 && i2 >= 0 && !this.f107896x.mo111137a(i, i2, false)) {
            this.f107896x.postDelayed(new RunnableC46297ay(this, i, i2), 300);
        }
    }

    /* renamed from: a */
    public final void mo78745a(int i, boolean z) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        VEEffectSeekLayout vEEffectSeekLayout = this.f107882j;
        if (vEEffectSeekLayout != null) {
            vEEffectSeekLayout.mo78722c(i);
        }
        if (this.f107896x != null && (cutMultiVideoViewModel = this.f107897y) != null && !z) {
            cutMultiVideoViewModel.f156530b.setValue(Long.valueOf((long) i));
        }
    }

    /* renamed from: a */
    public final void mo78750a(boolean z, List<EffectCategoryResponse> list) {
        ViewPager.AbstractC1579e eVar;
        if (z && list != null && list.size() == 1 && (eVar = this.f107865Z) != null) {
            eVar.onPageSelected(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78748a(List<EffectPointModel> list, boolean z, boolean z2) {
        mo78755b(z);
        mo78757c(!z);
        if (!z) {
            return;
        }
        if (!C13617h.m24465a(list)) {
            mo78744a(list.get(0).getUiStartPoint(), list.get(0).getUiEndPoint());
            this.f107896x.mo111135a(true, z2, (AbstractC0688a<Void>) null);
            return;
        }
        this.f107896x.mo111135a(false, z2, (AbstractC0688a<Void>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78746a(int r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effect.C46267ac.mo78746a(int, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78747a(long j, long j2, boolean z) {
        String str;
        EffectPointModel effectPointModel;
        String str2;
        mo78763g();
        long j3 = j2 - j;
        int currentItem = this.f107893u.getCurrentItem();
        if (currentItem < this.f107849J.getCount()) {
            str = this.f107849J.mo78868b(currentItem).getKey();
        } else {
            str = null;
        }
        if (C46344a.m89397a(this.f107893u, this.f107849J, mo78751a())) {
            C88300w value = this.f107878f.getValue();
            if (value != null) {
                int i = (int) j;
                this.f107852M.setStartPoint(i);
                int i2 = (int) j2;
                this.f107852M.setEndPoint(i2);
                this.f107852M.setUiStartPoint(i);
                this.f107852M.setUiEndPoint(i2);
                this.f107878f.setValue(C88300w.m153451a(value.f200384a, j, j2));
                this.f107877e.setValue(C88296t.m153438b(j));
                EffectPointModel effectPointModel2 = this.f107852M;
                if (!(effectPointModel2 == null || effectPointModel2.getKey() == null)) {
                    String key = this.f107852M.getKey();
                    this.f107854O.f108012c.put(key, Long.valueOf(j));
                    this.f107854O.f108013d.put(key, Long.valueOf(Math.abs(j3)));
                }
            } else {
                return;
            }
        } else if (C89219l.m154714a((Object) "sticker", (Object) str)) {
            C88292p a = C88292p.m153427a(this.f107841B.mo78733a(j), this.f107841B.mo78733a(j2));
            a.f200339e = j;
            a.f200340f = j2;
            a.f200342h = this.f107841B.mo78736c();
            this.f107876d.setValue(a);
        }
        mo78767k();
        if (!z) {
            NoScrollViewPager noScrollViewPager = this.f107893u;
            C46369r rVar = this.f107849J;
            VideoPublishEditModel videoPublishEditModel = this.f107874b;
            EffectPointModel effectPointModel3 = this.f107852M;
            String str3 = this.f107855P;
            boolean a2 = mo78751a();
            if (noScrollViewPager != null && rVar != null && videoPublishEditModel != null) {
                String str4 = "";
                if (C46344a.m89397a(noScrollViewPager, rVar, a2)) {
                    if (effectPointModel3 != null) {
                        C84425b a3 = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "edit_effect_page").mo129406a("content_source", C71817eu.m126790a(videoPublishEditModel)).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel)).mo129406a("effect_name", effectPointModel3.getName()).mo129406a("effect_id", effectPointModel3.getKey());
                        if (str3 == null) {
                            str2 = str4;
                        } else {
                            str2 = str3;
                        }
                        C80322d.m139251a("duration_adjust_complete", a3.mo129406a("tab_name", str2).mo129404a("duration", j3).f188764a);
                    } else {
                        return;
                    }
                }
                EffectCategoryResponse b = rVar.mo78868b(noScrollViewPager.getCurrentItem());
                if (b != null && C89219l.m154714a((Object) "sticker", (Object) b.getKey())) {
                    Fragment fragment = rVar.f108067a;
                    if ((fragment instanceof AbstractC46380u) && (effectPointModel = (EffectPointModel) C89070n.m154583g((List) ((AbstractC46380u) fragment).mo78825d())) != null) {
                        C84425b a4 = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "edit_effect_page").mo129406a("content_source", C71817eu.m126790a(videoPublishEditModel)).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel)).mo129406a("effect_name", effectPointModel.getName()).mo129406a("effect_id", effectPointModel.getKey());
                        if (str3 != null) {
                            str4 = str3;
                        }
                        C80322d.m139251a("duration_adjust_complete", a4.mo129406a("tab_name", str4).mo129404a("duration", j3).f188764a);
                    }
                }
            }
        }
    }
}
