package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71049b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.sticker.data.AbstractC75310e;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.i */
public final class C52264i implements AbstractC45898d, AbstractC71049b {

    /* renamed from: O */
    public static int f120409O = 1;

    /* renamed from: A */
    public C1213t<Bitmap> f120410A;

    /* renamed from: B */
    public C1213t<Boolean> f120411B;

    /* renamed from: C */
    public int f120412C;

    /* renamed from: D */
    int f120413D;

    /* renamed from: E */
    public Rect f120414E;

    /* renamed from: F */
    public AbstractC45920e f120415F;

    /* renamed from: G */
    public Runnable f120416G = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.RunnableC522651 */

        static {
            Covode.recordClassIndex(61653);
        }

        public final void run() {
            if (C52264i.this.f120447r != null) {
                C52264i.this.f120441l.f156530b.setValue(Long.valueOf((long) C52264i.this.f120447r.mo56384r((int) ((long) C52264i.this.f120447r.mo56370k()))));
                C52264i.this.f120453x.postDelayed(C52264i.this.f120416G, 30);
            }
        }
    };

    /* renamed from: H */
    public AbstractC52270b f120417H;

    /* renamed from: I */
    public AbstractC52269a f120418I;

    /* renamed from: J */
    public AbstractC45897c f120419J;

    /* renamed from: K */
    public Map<AbstractC45904h, AbstractC75310e> f120420K = new C0484a();

    /* renamed from: L */
    boolean f120421L;

    /* renamed from: M */
    boolean f120422M;

    /* renamed from: N */
    public C52155a f120423N;

    /* renamed from: P */
    FTCEditCornerViewModel f120424P;

    /* renamed from: Q */
    AbstractC72510a f120425Q;

    /* renamed from: R */
    private boolean f120426R;

    /* renamed from: S */
    private boolean f120427S;

    /* renamed from: T */
    private boolean f120428T;

    /* renamed from: U */
    private int f120429U;

    /* renamed from: a */
    public boolean f120430a;

    /* renamed from: b */
    public boolean f120431b;

    /* renamed from: c */
    public ActivityC0945e f120432c;

    /* renamed from: d */
    public FTCInfoStickerEditView f120433d;

    /* renamed from: e */
    public View f120434e;

    /* renamed from: f */
    View f120435f;

    /* renamed from: g */
    AVDmtTextView f120436g;

    /* renamed from: h */
    VideoEditView f120437h;

    /* renamed from: i */
    ImageView f120438i;

    /* renamed from: j */
    ImageView f120439j;

    /* renamed from: k */
    ImageView f120440k;

    /* renamed from: l */
    public CutMultiVideoViewModel f120441l;

    /* renamed from: m */
    public View f120442m;

    /* renamed from: n */
    TextView f120443n;

    /* renamed from: o */
    TextView f120444o;

    /* renamed from: p */
    SeekBar f120445p;

    /* renamed from: q */
    ViewGroup f120446q;

    /* renamed from: r */
    public AbstractC31071f f120447r;

    /* renamed from: s */
    public FTCInfoStickerViewModel f120448s;

    /* renamed from: t */
    public VideoPublishEditModel f120449t;

    /* renamed from: u */
    View f120450u;

    /* renamed from: v */
    boolean f120451v;

    /* renamed from: w */
    public List<MediaModel> f120452w;

    /* renamed from: x */
    public SafeHandler f120453x;

    /* renamed from: y */
    public AbstractC45899e f120454y;

    /* renamed from: z */
    FrameLayout f120455z;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.i$a */
    public interface AbstractC52269a {
        static {
            Covode.recordClassIndex(61657);
        }

        /* renamed from: a */
        void mo87998a(boolean z);

        /* renamed from: b */
        void mo87999b(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.i$b */
    public interface AbstractC52270b {
        static {
            Covode.recordClassIndex(61658);
        }

        /* renamed from: a */
        int mo87994a(C52154a aVar, boolean z, boolean z2);

        /* renamed from: a */
        PointF mo87995a(C52154a aVar, float f, float f2);

        /* renamed from: a */
        Float mo87996a(float f);

        /* renamed from: a */
        void mo87997a(C52154a aVar, int i, int i2, boolean z, boolean z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo88020a(int i, int i2, AbstractC45904h hVar) {
        boolean a = this.f120437h.mo111136a(i, i2);
        if (a && hVar != null) {
            this.f120441l.f156530b.setValue(Long.valueOf((long) hVar.mo65014a(0)));
            this.f120448s.mo87976a().setValue(C88296t.m153438b((long) hVar.mo65014a(0)));
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo77274a(android.graphics.RectF r11) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.mo77274a(android.graphics.RectF):boolean");
    }

    /* renamed from: f */
    public final void mo88025f() {
        if (this.f120428T) {
            mo88024e();
        }
    }

    static {
        Covode.recordClassIndex(61652);
    }

    /* renamed from: k */
    private boolean m97115k() {
        AbstractC45897c cVar = this.f120419J;
        if (cVar instanceof C52154a) {
            return true;
        }
        if ((cVar instanceof C46239q) || (cVar instanceof CommentStickerView) || (cVar instanceof AbstractC71109e)) {
            return false;
        }
        C63244g.m114602a();
        return false;
    }

    /* renamed from: l */
    private int m97116l() {
        return ((C70636dh.m124836e(this.f120432c) - this.f120429U) - C70636dh.m124833c(this.f120432c)) - C70636dh.m124835d(this.f120432c);
    }

    /* renamed from: m */
    private int m97117m() {
        return (C70636dh.m124836e(this.f120432c) - this.f120429U) - C70636dh.m124835d(this.f120432c);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71049b
    /* renamed from: b */
    public final boolean mo88021b() {
        C1213t<Boolean> tVar = this.f120448s.f120341d;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo88023d() {
        if (this.f120421L) {
            mo88025f();
            mo88014a(0, this.f120447r.mo56368j());
            this.f120448s.mo87976a().setValue(C88296t.m153436a((long) this.f120447r.mo56386s(((Long) Objects.requireNonNull(this.f120437h.getPlayBoundary().f2750a)).intValue())));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo88022c() {
        if (this.f120421L) {
            C0692e<Long, Long> playBoundary = this.f120437h.getPlayBoundary();
            this.f120448s.mo87976a().setValue(C88296t.m153436a((long) this.f120447r.mo56386s(((Long) Objects.requireNonNull(playBoundary.f2750a)).intValue())));
            mo88014a(Math.max(playBoundary.f2750a.intValue() - 30, 0), Math.min(((Long) Objects.requireNonNull(playBoundary.f2751b)).intValue() + 150, this.f120447r.mo56368j()));
        }
    }

    /* renamed from: h */
    public final boolean mo88027h() {
        this.f120433d.f120298D.mo77176b();
        FTCInfoStickerEditView fTCInfoStickerEditView = this.f120433d;
        if (fTCInfoStickerEditView == null || fTCInfoStickerEditView.f120313g == null || this.f120433d.f120313g.f120398a == null || this.f120433d.f120313g.f120398a.size() <= 0) {
            return false;
        }
        boolean z = false;
        for (C52154a aVar : this.f120433d.f120313g.f120398a) {
            if (aVar.f120152c) {
                aVar.f120152c = false;
                z = true;
            }
        }
        if (z) {
            this.f120433d.f120295A = false;
            this.f120433d.invalidate();
        }
        return z;
    }

    /* renamed from: i */
    private void m97113i() {
        C85581w.EnumC85602a aVar;
        C74297p pVar;
        if (!this.f120427S) {
            this.f120427S = true;
            int j = this.f120447r.mo56368j();
            this.f120441l = (CutMultiVideoViewModel) C1181ae.m3881a(this.f120432c, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
            this.f120437h.setCanEdit(false);
            this.f120437h.setMinVideoLength(1000);
            this.f120437h.setMaxVideoLength((long) j);
            this.f120441l.f156539k = this.f120449t.isMvThemeVideoType();
            this.f120441l.f156540l = j;
            this.f120437h.setFirstFrameVisibleLiveData(this.f120411B);
            this.f120437h.setFirstFrameBitmapLiveData(this.f120410A);
            this.f120437h.setVeEditor(this.f120447r);
            int frameWidth = this.f120437h.getFrameWidth();
            int frameHeight = this.f120437h.getFrameHeight();
            int ceil = (int) Math.ceil((double) (((float) (C13628n.m24504a(this.f120432c) - (this.f120437h.getLeftRightMargin() * 2))) / (((float) frameWidth) * 1.0f)));
            if (C65374bn.m117070a()) {
                aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL;
            } else {
                aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT;
            }
            if (this.f120449t.isMultiVideoEdit()) {
                pVar = new C74297p(new VEMultiEditVideoCoverGeneratorImpl(this.f120447r, this.f120432c, ceil, this.f120447r.mo56368j(), (int) this.f120449t.getMultiEditVideoStartTime(), aVar), frameWidth, frameHeight, ceil);
            } else {
                pVar = new C74297p(new VEVideoCoverGeneratorImpl(this.f120447r, this.f120432c, ceil, aVar, "sticker_select_time"), frameWidth, frameHeight, ceil);
            }
            this.f120437h.mo111139a(this.f120432c, this.f120441l, pVar, this.f120452w);
            this.f120437h.setEnableBoundaryText(true);
            this.f120437h.setPointerType(2);
        }
    }

    /* renamed from: j */
    private void m97114j() {
        if (!this.f120451v) {
            this.f120451v = true;
            this.f120438i.setOnClickListener(new View$OnClickListenerC52238ag(this));
            this.f120439j.setOnClickListener(new View$OnClickListenerC52273l(this));
            this.f120440k.setOnClickListener(new View$OnClickListenerC52274m(this));
            m97113i();
            VideoEditViewModel videoEditViewModel = this.f120437h.getVideoEditViewModel();
            videoEditViewModel.f157678c.observe(this.f120432c, new C52275n(this));
            videoEditViewModel.f157681f.observe(this.f120432c, new C52276o(this));
            videoEditViewModel.f157686k.observe(this.f120432c, new C52277p(this));
            videoEditViewModel.f157684i.observe(this.f120432c, new C52278q(this));
            videoEditViewModel.f157685j.observe(this.f120432c, new C52279r(this));
            videoEditViewModel.f157682g.observe(this.f120432c, new C52280s(this));
            videoEditViewModel.f157683h.observe(this.f120432c, new C52281t(this));
            videoEditViewModel.f157680e.observe(this.f120432c, new C52282u(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo88024e() {
        boolean z = !this.f120428T;
        this.f120428T = z;
        mo88016a(z);
        mo88026g();
        AbstractC52269a aVar = this.f120418I;
        if (aVar != null) {
            aVar.mo87999b(this.f120428T);
        }
        if (!this.f120428T) {
            this.f120440k.setImageDrawable(this.f120432c.getResources().getDrawable(2131231564));
            this.f120448s.mo87976a().setValue(C88296t.m153436a((long) this.f120447r.mo56370k()));
            this.f120448s.mo87976a().setValue(C88296t.m153437b());
            this.f120453x.removeCallbacks(this.f120416G);
            AbstractC45897c cVar = this.f120419J;
            if (cVar != null) {
                cVar.setAlpha(true);
            }
        } else {
            this.f120440k.setImageDrawable(this.f120432c.getResources().getDrawable(2131231563));
            this.f120453x.post(this.f120416G);
            this.f120448s.mo87976a().setValue(C88296t.m153435a());
        }
        this.f120437h.mo111146c(true ^ this.f120428T);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x007a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.themechange.base.AVDmtTextView] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88026g() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.mo88026g():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71049b
    /* renamed from: a */
    public final boolean mo88019a() {
        C1213t<Boolean> tVar = this.f120448s.f120340c;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    /* renamed from: b */
    private void m97112b(boolean z) {
        FTCEditCornerViewModel fTCEditCornerViewModel = this.f120424P;
        if (fTCEditCornerViewModel != null) {
            fTCEditCornerViewModel.mo87793a(z);
        }
    }

    public C52264i(AbstractC72510a aVar) {
        this.f120425Q = aVar;
    }

    /* renamed from: a */
    public final void mo88016a(boolean z) {
        this.f120433d.mo87955a(z);
        if (this.f120419J != null && m97115k()) {
            this.f120419J.setAlpha(true);
        }
    }

    /* renamed from: a */
    private void m97109a(AbstractC45904h hVar) {
        this.f120445p.setProgress((int) ((((float) (this.f120447r.mo56370k() - hVar.mo65014a(0))) / ((float) (hVar.mo65018b(this.f120447r.mo56368j()) - hVar.mo65014a(0)))) * 100.0f));
    }

    /* renamed from: b */
    private void m97111b(AbstractC45904h hVar) {
        int d = hVar.mo65022d();
        int c = hVar.mo65020c(this.f120447r.mo56246G());
        if (d >= 0 && c >= 0 && !mo88020a(d, c, hVar)) {
            this.f120453x.postDelayed(new RunnableC52286y(this, d, c, hVar), 300);
        }
        mo88026g();
    }

    /* renamed from: a */
    private void m97110a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
        try {
            C40982q.m82522a("info_sticker_string_format_event", new C69840ar().mo110189a("exception", C24098m.m45633c(formatFlagsConversionMismatchException)).mo110189a("event", "normal_str=" + str + ", error_str=" + this.f120436g.getContext().getResources().getString(R.string.cmb)).mo110191a());
        } catch (Exception e) {
            C73991bj.m130131b(e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88014a(int i, int i2) {
        mo88026g();
        if (this.f120419J != null) {
            int s = this.f120447r.mo56386s(i);
            int s2 = this.f120447r.mo56386s(i2);
            if (m97115k()) {
                this.f120433d.mo87954a((C52154a) this.f120419J, s, s2);
                return;
            }
            AbstractC45897c cVar = this.f120419J;
            if (cVar instanceof C46239q) {
                TextStickerData data = ((C46239q) cVar).getData();
                if (data != null) {
                    data.setStartTime(s);
                    data.setEndTime(s2);
                    data.setUiStartTime(i);
                    data.setUiEndTime(i2);
                }
            } else if (cVar instanceof CommentStickerView) {
                CommentVideoModel data2 = ((CommentStickerView) cVar).getData();
                if (data2 != null) {
                    data2.setStartTime(s);
                    data2.setEndTime(s2);
                }
            } else if (cVar instanceof AbstractC71109e) {
                ((AbstractC71109e) cVar).setStartTime(s);
                ((AbstractC71109e) this.f120419J).setEndTime(s2);
            }
        }
    }

    /* renamed from: a */
    public final void mo88015a(AbstractC45904h hVar, int i) {
        if (hVar != this.f120419J) {
            if (hVar != null) {
                if (!this.f120420K.containsKey(hVar)) {
                    this.f120420K.put(hVar, hVar.mo65021c());
                }
                hVar.setAlpha(true);
                if (hVar instanceof C52154a) {
                    this.f120453x.post(new RunnableC52234ac(this));
                }
                if (this.f120451v && i == 0) {
                    m97111b(hVar);
                }
                AbstractC45897c cVar = this.f120419J;
                if (cVar != null) {
                    if (i != 0) {
                        if (i == 1 && this.f120426R) {
                            cVar.setAlpha(false);
                        }
                    } else if (this.f120451v) {
                        cVar.setAlpha(false);
                    }
                    if (this.f120419J instanceof C52154a) {
                        this.f120447r.mo56392w();
                    }
                }
                if (i == 1) {
                    m97109a(hVar);
                }
            } else {
                for (Map.Entry<AbstractC45904h, AbstractC75310e> entry : this.f120420K.entrySet()) {
                    AbstractC45904h key = entry.getKey();
                    AbstractC75310e value = entry.getValue();
                    if (!(key == null || value == null)) {
                        key.mo65017a(value, this.f120433d.f120309c, this.f120433d.f120310d);
                    }
                }
                this.f120420K.clear();
            }
            this.f120419J = hVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88017a(boolean z, AbstractC45904h hVar) {
        this.f120421L = z;
        m97112b(!z);
        m97114j();
        mo88016a(!z);
        mo88015a(hVar, 0);
        int height = this.f120435f.getHeight();
        this.f120429U = height;
        if (height == 0) {
            this.f120429U = (int) C13628n.m24520b(this.f120432c, 208.0f);
        }
        int b = this.f120429U + ((int) C13628n.m24520b(this.f120432c, 16.0f));
        this.f120429U = b;
        View view = this.f120435f;
        C46371s.m89467a(view, z, b, view, new C52285x(this, z));
        AbstractC52269a aVar = this.f120418I;
        if (aVar != null) {
            aVar.mo87998a(z);
        }
        if (z) {
            this.f120448s.mo87977b().setValue(C88297u.m153440a(C77795c.m135910a(true, false, false, false), C70636dh.m124833c(this.f120432c), this.f120429U, m97116l(), C33398a.f79357a.mo59453d()));
            ImageView imageView = this.f120440k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231564));
            this.f120440k.setEnabled(true);
            this.f120437h.setEnabled(true);
            this.f120437h.mo111146c(true);
            this.f120448s.mo87976a().setValue(C88296t.m153438b(0));
            return;
        }
        this.f120440k.setEnabled(false);
        this.f120437h.setEnabled(false);
        this.f120453x.removeCallbacks(this.f120416G);
        this.f120448s.mo87976a().setValue(C88296t.m153437b());
        this.f120448s.mo87977b().setValue(C88297u.m153443b(this.f120433d.getResources().getColor(R.color.a2), C70636dh.m124833c(this.f120432c), this.f120429U, m97116l(), C33398a.f79357a.mo59453d()));
        this.f120428T = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88018a(boolean z, AbstractC45904h hVar, boolean z2) {
        this.f120422M = z;
        m97112b(!z);
        if (!this.f120426R) {
            this.f120426R = true;
            this.f120444o.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            this.f120443n.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            this.f120443n.setOnClickListener(new View$OnClickListenerC52236ae(this));
            this.f120444o.setOnClickListener(new View$OnClickListenerC52237af(this));
            m97113i();
            this.f120445p.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.C522673 */

                static {
                    Covode.recordClassIndex(61655);
                }

                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    long d;
                    if (z) {
                        C52264i iVar = C52264i.this;
                        if (iVar.f120422M && iVar.f120419J != null && (iVar.f120419J instanceof AbstractC45904h)) {
                            int i2 = 0;
                            float a = ((float) ((AbstractC45904h) iVar.f120419J).mo65014a(0)) + (((float) ((((AbstractC45904h) iVar.f120419J).mo65018b(iVar.f120447r.mo56368j()) - ((AbstractC45904h) iVar.f120419J).mo65014a(0)) * i)) / 100.0f);
                            C1213t<C88296t> a2 = iVar.f120448s.mo87976a();
                            List<VideoSegment> k = iVar.f120437h.getVideoEditViewModel().mo111232k();
                            float l = iVar.f120437h.getVideoEditViewModel().mo111233l();
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < k.size(); i3++) {
                                if (!k.get(i3).f156717i) {
                                    arrayList.add(k.get(i3));
                                }
                            }
                            long j = 0;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= arrayList.size()) {
                                    break;
                                }
                                VideoSegment videoSegment = (VideoSegment) arrayList.get(i4);
                                j += videoSegment.f156710b;
                                if (a <= ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * l)) {
                                    i2 = i4;
                                    break;
                                } else {
                                    a -= ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * l);
                                    i4++;
                                }
                            }
                            if (i4 == arrayList.size()) {
                                d = (j - ((VideoSegment) arrayList.get(i2)).f156710b) + ((VideoSegment) arrayList.get(i2)).mo110580e();
                            } else {
                                d = (long) (((float) ((j - ((VideoSegment) arrayList.get(i2)).f156710b) + ((VideoSegment) arrayList.get(i2)).mo110578d())) + (a * ((VideoSegment) arrayList.get(i2)).mo110582f() * l));
                            }
                            a2.setValue(C88296t.m153436a(d));
                        }
                    }
                }
            });
        }
        mo88016a(!z);
        mo88015a(hVar, 1);
        int height = this.f120442m.getHeight();
        this.f120429U = height;
        if (height == 0) {
            this.f120429U = (int) C13628n.m24520b(this.f120432c, 120.0f);
        }
        this.f120445p.setProgress((int) ((((float) this.f120447r.mo56370k()) * 100.0f) / ((float) this.f120447r.mo56368j())));
        View view = this.f120442m;
        C46371s.m89467a(view, z, this.f120429U, view, new C52284w(this, z, z2));
        AbstractC52269a aVar = this.f120418I;
        if (aVar != null) {
            aVar.mo87998a(z);
        }
        if (z) {
            this.f120448s.mo87977b().setValue(C88297u.m153442a(C77795c.m135910a(true, false, false, false), this.f120429U, m97117m(), C33398a.f79357a.mo59453d(), z2));
            ImageView imageView = this.f120440k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231564));
            this.f120440k.setEnabled(true);
            return;
        }
        this.f120440k.setEnabled(false);
        this.f120453x.removeCallbacks(this.f120416G);
        this.f120448s.mo87976a().setValue(C88296t.m153437b());
        this.f120448s.mo87977b().setValue(C88297u.m153441a(this.f120433d.getResources().getColor(R.color.a2), C70636dh.m124833c(this.f120432c), this.f120429U, m97117m(), C33398a.f79357a.mo59453d(), z2));
        this.f120428T = false;
    }
}
