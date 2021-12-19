package com.p2082ss.android.ugc.aweme.ftc.components.effect;

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
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.AbstractC46263a;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.p2082ss.android.ugc.aweme.effect.VEEffectSeekLayout;
import com.p2082ss.android.ugc.aweme.effect.p2891c.C46337a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46346b;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
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
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.f */
public class C52125f {

    /* renamed from: a */
    public static final String f120061a = C52125f.class.getSimpleName();

    /* renamed from: A */
    public AbstractC31071f f120062A;

    /* renamed from: B */
    public AbstractC46263a f120063B;

    /* renamed from: C */
    C74297p f120064C;

    /* renamed from: D */
    AbstractC85541q f120065D;

    /* renamed from: E */
    public int f120066E;

    /* renamed from: F */
    public int f120067F;

    /* renamed from: G */
    RunnableC52133b f120068G;

    /* renamed from: H */
    RunnableC52132a f120069H;

    /* renamed from: I */
    View f120070I;

    /* renamed from: J */
    public C52123e f120071J;

    /* renamed from: K */
    boolean f120072K;

    /* renamed from: L */
    public ActivityC0945e f120073L;

    /* renamed from: M */
    public EffectPointModel f120074M;

    /* renamed from: N */
    C88300w f120075N;

    /* renamed from: O */
    public C46337a f120076O = new C46337a();

    /* renamed from: P */
    public String f120077P;

    /* renamed from: Q */
    ArrayList<EffectPointModel> f120078Q;

    /* renamed from: R */
    ArrayList<EffectPointModel> f120079R;

    /* renamed from: S */
    int f120080S = -1;

    /* renamed from: T */
    C1213t<Bitmap> f120081T;

    /* renamed from: U */
    C1213t<Boolean> f120082U;

    /* renamed from: V */
    public SafeHandler f120083V;

    /* renamed from: W */
    public EditEffectVideoModel f120084W;

    /* renamed from: X */
    public AbstractC46354a f120085X;

    /* renamed from: Y */
    AbstractC46355b f120086Y;

    /* renamed from: Z */
    ViewPager.AbstractC1579e f120087Z;

    /* renamed from: aa */
    AbstractC84919c f120088aa;

    /* renamed from: ab */
    AbstractC84917a f120089ab = new C52134g(this);

    /* renamed from: ac */
    public Runnable f120090ac = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.ftc.components.effect.C52125f.RunnableC521305 */

        static {
            Covode.recordClassIndex(61511);
        }

        public final void run() {
            if (C52125f.this.f120062A != null) {
                C52125f.this.mo87843a((int) C52125f.this.f120063B.mo78737d(), false);
                C52125f.this.f120083V.postDelayed(C52125f.this.f120090ac, 0);
            }
        }
    };

    /* renamed from: ad */
    private EffectPointModel f120091ad;

    /* renamed from: b */
    public VideoPublishEditModel f120092b;

    /* renamed from: c */
    AbstractC71531x f120093c;

    /* renamed from: d */
    C1213t<C88292p> f120094d;

    /* renamed from: e */
    public C1213t<C88296t> f120095e;

    /* renamed from: f */
    C1213t<C88300w> f120096f;

    /* renamed from: g */
    C1213t<Boolean> f120097g;

    /* renamed from: h */
    public SafeHandler f120098h;

    /* renamed from: i */
    AbstractC1204m f120099i;

    /* renamed from: j */
    public VEEffectSeekLayout f120100j;

    /* renamed from: k */
    LinearLayout f120101k;

    /* renamed from: l */
    FrameLayout f120102l;

    /* renamed from: m */
    ImageView f120103m;

    /* renamed from: n */
    RelativeLayout f120104n;

    /* renamed from: o */
    TextView f120105o;

    /* renamed from: p */
    RelativeLayout f120106p;

    /* renamed from: q */
    LinearLayout f120107q;

    /* renamed from: r */
    AVStatusView f120108r;

    /* renamed from: s */
    TextView f120109s;

    /* renamed from: t */
    TextView f120110t;

    /* renamed from: u */
    public NoScrollViewPager f120111u;

    /* renamed from: v */
    AVDmtTabLayout f120112v;

    /* renamed from: w */
    ChooseVideoCoverView f120113w;

    /* renamed from: x */
    VideoEditView f120114x;

    /* renamed from: y */
    CutMultiVideoViewModel f120115y;

    /* renamed from: z */
    AbstractC69978a f120116z;

    /* renamed from: a */
    public final boolean mo87849a(List<EffectCategoryResponse> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f120092b.isMvThemeVideoType() && !this.f120092b.isPhotoMvMode) {
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
        if (!mo87848a()) {
            return false;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setName(this.f120073L.getString(R.string.g9q));
        list.add(effectCategoryResponse);
        return true;
    }

    static {
        Covode.recordClassIndex(61506);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo87850b() {
        this.f120068G = null;
        this.f120069H = null;
        this.f120098h.removeCallbacksAndMessages(null);
        this.f120083V.removeCallbacksAndMessages(null);
    }

    /* renamed from: j */
    public final void mo87863j() {
        this.f120095e.setValue(C88296t.m153437b());
        mo87864k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo87864k() {
        C46371s.m89465a(this.f120103m, true);
        ImageView imageView = this.f120103m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.f$b */
    public class RunnableC52133b implements Runnable {

        /* renamed from: a */
        int f120126a;

        static {
            Covode.recordClassIndex(61514);
        }

        public final void run() {
            C52125f.this.f120100j.mo78715a(this.f120126a, (int) C52125f.this.f120063B.mo78737d());
            C52125f.this.f120098h.post(this);
        }

        RunnableC52133b(int i) {
            this.f120126a = i;
        }
    }

    /* renamed from: d */
    public final void mo87856d() {
        this.f120093c.mo111960a().mo5534a(new C52136i(this), C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo87858e() {
        this.f120084W.mo78628e().setValue(Float.valueOf(this.f120114x.getSelectedTime()));
        m96881h(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo87860g() {
        int height;
        if (this.f120102l.getHeight() == 0) {
            height = (int) C13628n.m24520b(this.f120073L, 276.0f);
        } else {
            height = this.f120102l.getHeight();
        }
        return height + 16;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo87862i() {
        this.f120095e.setValue(C88296t.m153435a());
        C46371s.m89465a(this.f120103m, false);
        ImageView imageView = this.f120103m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo87866m() {
        return (((C70636dh.m124836e(this.f120073L) - mo87859f()) - mo87860g()) - C70636dh.m124833c(this.f120073L)) - C70636dh.m124835d(this.f120073L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.f$a */
    public class RunnableC52132a implements Runnable {
        static {
            Covode.recordClassIndex(61513);
        }

        public final void run() {
            C52125f.this.mo87843a((int) C52125f.this.f120063B.mo78737d(), false);
            if (!C52125f.this.mo87855c()) {
                C52125f.this.f120098h.postDelayed(this, 0);
            }
        }

        RunnableC52132a() {
        }
    }

    /* renamed from: c */
    public final boolean mo87855c() {
        if (!this.f120072K) {
            return true;
        }
        if (!this.f120063B.mo78735b()) {
            return false;
        }
        this.f120095e.setValue(C88296t.m153438b(this.f120076O.mo78828a()));
        mo87843a((int) this.f120076O.f108011b, false);
        mo87863j();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo87859f() {
        if (this.f120106p.getHeight() == 0) {
            return (int) C13628n.m24520b(this.f120073L, 52.0f);
        }
        return this.f120106p.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo87865l() {
        this.f120079R = new ArrayList<>(this.f120078Q);
        EffectPointModel effectPointModel = this.f120074M;
        if (effectPointModel != null) {
            this.f120091ad = effectPointModel.clone();
        }
        if (this.f120096f.getValue() != null) {
            this.f120075N = this.f120096f.getValue().clone();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (r1.equals("3") == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        if (r1.equals("2") == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ee, code lost:
        r10.f120100j.setOverlayColor(r10.f120067F);
        mo87857d(true);
        r1 = dmt.p4542av.video.C88296t.m153438b(0);
        mo87843a(0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        if (r1 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0103, code lost:
        r10.f120095e.setValue(r1);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87861h() {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.effect.C52125f.mo87861h():void");
    }

    /* renamed from: a */
    public final boolean mo87848a() {
        if (this.f120092b.isStitchMode() || this.f120092b.isMvThemeVideoType()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m96878e(boolean z) {
        m96879f(z);
        m96880g(z);
    }

    /* renamed from: g */
    private void m96880g(boolean z) {
        this.f120114x.mo111144b(z);
    }

    /* renamed from: d */
    public final void mo87857d(boolean z) {
        this.f120114x.mo111146c(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo87854c(boolean z) {
        int i;
        VEEffectSeekLayout vEEffectSeekLayout = this.f120100j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        vEEffectSeekLayout.setVisibility(i);
    }

    /* renamed from: f */
    private void m96879f(boolean z) {
        ChooseVideoCoverView.C74231a aVar;
        if ((this.f120113w.getAdapter() instanceof ChooseVideoCoverView.C74231a) && (aVar = (ChooseVideoCoverView.C74231a) this.f120113w.getAdapter()) != null) {
            aVar.mo116716a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo87853b(boolean z) {
        int i;
        VideoEditView videoEditView = this.f120114x;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        videoEditView.setVisibility(i);
    }

    /* renamed from: h */
    private void m96881h(boolean z) {
        C46346b b;
        if (z) {
            b = C46346b.C46347a.m89401a(this.f120114x.getSelectedTime());
        } else {
            b = C46346b.C46347a.m89402b((float) this.f120062A.mo56246G());
        }
        this.f120084W.mo78629f().setValue(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87841a(int i) {
        ArrayList<EffectPointModel> effectPointModels = this.f120100j.getEffectPointModels();
        if (!C13617h.m24465a(effectPointModels)) {
            C85581w.EnumC85611j f = this.f120062A.mo56356f();
            this.f120100j.mo78714a(i);
            if (effectPointModels.isEmpty()) {
                this.f120095e.setValue(C88296t.m153438b(0));
                mo87843a((int) this.f120063B.mo78733a(0), false);
            } else {
                EffectPointModel effectPointModel = effectPointModels.get(effectPointModels.size() - 1);
                int uiEndPoint = effectPointModel.getUiEndPoint();
                if (effectPointModel.isFromEnd() ^ this.f120063B.mo78736c()) {
                    uiEndPoint = this.f120062A.mo56246G() - uiEndPoint;
                }
                mo87843a(uiEndPoint, false);
                this.f120095e.setValue(C88296t.m153438b((long) uiEndPoint));
            }
            if (f == C85581w.EnumC85611j.STARTED) {
                mo87863j();
            }
        }
    }

    /* renamed from: b */
    public final void mo87852b(List<EffectCategoryResponse> list) {
        if (!(list == null || list.isEmpty())) {
            this.f120112v.mo115533b();
            this.f120112v.setMaxTabModeForCount(list.size());
            for (int i = 0; i < list.size(); i++) {
                C77792a a = AVDmtTabLayout.C77790a.m135898a(this.f120073L);
                a.setText(list.get(i).getName());
                a.mo121365a(i, list.size());
                a.setTag(Integer.valueOf(i));
                a.setOnClickListener(new View$OnClickListenerC52150w(this));
                AVDmtTabLayout aVDmtTabLayout = this.f120112v;
                aVDmtTabLayout.mo115525a(aVDmtTabLayout.mo115519a().mo115584a(a));
            }
        }
    }

    /* renamed from: i */
    private void m96882i(boolean z) {
        if (z) {
            this.f120092b.mEffectList = new ArrayList<>(this.f120085X.mo78856g());
            this.f120092b.mTimeEffect = this.f120074M;
            if (!(this.f120092b.mTimeEffect == null || !this.f120092b.mTimeEffect.getKey().equals("1") || this.f120085X.mo78854e().getValue() == null)) {
                this.f120092b.getPreviewInfo().updateReverseVideoContent(this.f120093c.mo111962c(), this.f120093c.mo111963d(), this.f120093c.mo111964e());
            }
            if (this.f120092b.mTimeEffect != null) {
                this.f120092b.mEffectList.add(this.f120092b.mTimeEffect);
            }
            C84425b a = new C84425b().mo129406a("creation_id", this.f120092b.creationId).mo129406a("shoot_way", this.f120092b.mShootWay).mo129403a("draft_id", this.f120092b.draftId);
            if (this.f120092b.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<EffectPointModel> it = this.f120092b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (!TextUtils.isEmpty(next.getName())) {
                        sb.append(next.getName()).append(",");
                    }
                }
                if (sb.length() > 0) {
                    a.mo129406a("effect_name", sb.substring(0, sb.length() - 1));
                    return;
                }
                return;
            }
            return;
        }
        this.f120092b.mEffectList = new ArrayList<>(this.f120085X.mo78856g());
        this.f120092b.mTimeEffect = this.f120074M;
        if (this.f120092b.mTimeEffect != null) {
            this.f120092b.mEffectList.add(this.f120092b.mTimeEffect);
        }
    }

    /* renamed from: a */
    public final void mo87846a(boolean z) {
        if (z) {
            this.f120107q.setVisibility(0);
            this.f120101k.setVisibility(8);
            AVStatusView aVStatusView = this.f120108r;
            if (aVStatusView != null) {
                aVStatusView.mo129846b();
                return;
            }
            return;
        }
        AVStatusView aVStatusView2 = this.f120108r;
        if (aVStatusView2 != null) {
            aVStatusView2.mo129845a();
        }
        this.f120107q.setVisibility(8);
        this.f120101k.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87842a(int i, int i2) {
        if (i >= 0 && i2 >= 0 && !this.f120114x.mo111137a(i, i2, false)) {
            this.f120114x.postDelayed(new RunnableC52099aa(this, i, i2), 300);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87843a(int i, boolean z) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        VEEffectSeekLayout vEEffectSeekLayout = this.f120100j;
        if (vEEffectSeekLayout != null) {
            vEEffectSeekLayout.mo78722c(i);
        }
        if (this.f120114x != null && (cutMultiVideoViewModel = this.f120115y) != null && !z) {
            cutMultiVideoViewModel.f156530b.setValue(Long.valueOf((long) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87844a(long j, long j2) {
        String str;
        mo87858e();
        int currentItem = this.f120111u.getCurrentItem();
        if (currentItem < this.f120071J.getCount()) {
            str = this.f120071J.mo87840b(currentItem).getKey();
        } else {
            str = null;
        }
        if (C46344a.m89397a(this.f120111u, this.f120071J, mo87848a())) {
            C88300w value = this.f120096f.getValue();
            if (value != null) {
                this.f120074M.setStartPoint((int) j);
                this.f120074M.setEndPoint((int) j2);
                this.f120096f.setValue(C88300w.m153451a(value.f200384a, j, j2));
                this.f120095e.setValue(C88296t.m153438b(j));
                EffectPointModel effectPointModel = this.f120074M;
                if (!(effectPointModel == null || effectPointModel.getKey() == null)) {
                    String key = this.f120074M.getKey();
                    this.f120076O.f108012c.put(key, Long.valueOf(j));
                    this.f120076O.f108013d.put(key, Long.valueOf(Math.abs(j2 - j)));
                }
            } else {
                return;
            }
        } else if (C89219l.m154714a((Object) "sticker", (Object) str)) {
            C88292p a = C88292p.m153427a(this.f120063B.mo78733a(j), this.f120063B.mo78733a(j2));
            a.f200339e = j;
            a.f200340f = j2;
            a.f200342h = this.f120063B.mo78736c();
            this.f120094d.setValue(a);
        }
        mo87862i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [dmt.av.video.t] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87851b(int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.effect.C52125f.mo87851b(int, boolean):void");
    }

    /* renamed from: a */
    public final void mo87847a(boolean z, List<EffectCategoryResponse> list) {
        ViewPager.AbstractC1579e eVar;
        if (z && list != null && list.size() == 1 && (eVar = this.f120087Z) != null) {
            eVar.onPageSelected(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87845a(List<EffectPointModel> list, boolean z, boolean z2) {
        mo87853b(z);
        mo87854c(!z);
        if (!z) {
            return;
        }
        if (!C13617h.m24465a(list)) {
            mo87842a(list.get(0).getUiStartPoint(), list.get(0).getUiEndPoint());
            this.f120114x.mo111135a(true, z2, (AbstractC0688a<Void>) null);
            return;
        }
        this.f120114x.mo111135a(false, z2, (AbstractC0688a<Void>) null);
    }
}
