package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45896b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45842m;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.AbstractC46045a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46046b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46047c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46048d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46049e;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46115a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46123i;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.q */
public class C46239q extends FrameLayout implements AbstractC45904h<TextStickerData> {

    /* renamed from: A */
    private Vibrator f107732A;

    /* renamed from: B */
    private long f107733B;

    /* renamed from: C */
    private long f107734C;

    /* renamed from: D */
    private C45896b f107735D;

    /* renamed from: E */
    private boolean f107736E;

    /* renamed from: F */
    private boolean f107737F;

    /* renamed from: G */
    private boolean f107738G;

    /* renamed from: H */
    private boolean f107739H;

    /* renamed from: I */
    private float f107740I;

    /* renamed from: a */
    private boolean f107741a = true;

    /* renamed from: b */
    private boolean f107742b = true;

    /* renamed from: c */
    private SafeHandler f107743c;

    /* renamed from: d */
    private int f107744d;

    /* renamed from: e */
    private int f107745e;

    /* renamed from: f */
    protected float f107746f;

    /* renamed from: g */
    protected float f107747g;

    /* renamed from: h */
    protected C46046b f107748h = new C46046b((byte) 0);

    /* renamed from: i */
    protected List<TextStickerTextWrap> f107749i;

    /* renamed from: j */
    protected int f107750j = 1;

    /* renamed from: k */
    protected int f107751k = -1;

    /* renamed from: l */
    protected String f107752l = "default";

    /* renamed from: m */
    public boolean f107753m = false;

    /* renamed from: n */
    public boolean f107754n = false;

    /* renamed from: o */
    protected int f107755o;

    /* renamed from: p */
    protected int f107756p;

    /* renamed from: q */
    protected C46047c f107757q;

    /* renamed from: r */
    protected C46048d f107758r;

    /* renamed from: s */
    protected C46049e f107759s;

    /* renamed from: t */
    protected TextStickerData f107760t;

    /* renamed from: u */
    public AbstractC45824b f107761u;

    /* renamed from: v */
    public PointF f107762v = new PointF();

    /* renamed from: w */
    public AbstractC45872e f107763w;

    /* renamed from: x */
    public boolean f107764x = false;

    /* renamed from: y */
    public final int f107765y;

    /* renamed from: z */
    public boolean f107766z;

    static {
        Covode.recordClassIndex(54801);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public float getCenterX() {
        return this.f107746f;
    }

    public float getCenterY() {
        return this.f107747g;
    }

    public int getCurColor() {
        return this.f107751k;
    }

    public String getCurFontType() {
        return this.f107752l;
    }

    public int getCurMode() {
        return this.f107750j;
    }

    public TextStickerData getData() {
        return this.f107760t;
    }

    public void invalidate() {
        super.invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo78407a(List<TextStickerTextWrap> list, Object obj) {
        this.f107749i = list;
        this.f107757q.mo77726a(list);
    }

    /* renamed from: a */
    public boolean mo78409a(float f, float f2) {
        return mo78551e(f, f2 - ((float) this.f107756p));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r1 != false) goto L_0x00ed;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo78542a(com.p2082ss.android.ugc.tools.utils.p4361a.C84882b r18) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q.mo78542a(com.ss.android.ugc.tools.utils.a.b):boolean");
    }

    /* renamed from: a */
    public final boolean mo78543a(C84885c cVar) {
        if (!mo78552f()) {
            return false;
        }
        this.f107737F = mo78409a(cVar.f189714i, cVar.f189715j);
        this.f107759s.mo77731a(cVar.f189714i, cVar.f189715j);
        return m89185q();
    }

    /* renamed from: a */
    public final boolean mo78538a(float f) {
        if (!mo78552f()) {
            return false;
        }
        float degrees = (float) Math.toDegrees((double) f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if (!m89185q()) {
            return false;
        }
        C46046b bVar = this.f107748h;
        C46049e eVar = this.f107759s;
        float f2 = bVar.f107213b;
        if (-1 != eVar.f107281a.mo77564a(eVar.f107297q, false, true)) {
            degrees = eVar.f107281a.mo77563a(degrees);
        }
        float f3 = f2 - degrees;
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        eVar.mo77729a(false);
        if (eVar.f107301u != null) {
            eVar.f107301u.mo78305c();
        }
        bVar.f107213b = f3;
        invalidate();
        return true;
    }

    /* renamed from: a */
    public final boolean mo78541a(ScaleGestureDetector scaleGestureDetector) {
        if (!mo78552f()) {
            return false;
        }
        this.f107738G = mo78409a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.f107759s.mo77731a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.f107766z = true;
        return m89186r();
    }

    /* renamed from: a */
    public final boolean mo78540a(MotionEvent motionEvent) {
        if (!mo78552f()) {
            return false;
        }
        this.f107735D = new C45896b(getStickerRotate(), getStickerScale(), getCenterX(), getCenterY());
        this.f107740I = motionEvent.getY() - motionEvent.getRawY();
        boolean a = this.f107759s.mo77731a(motionEvent.getX(), motionEvent.getY());
        if (a) {
            setTouching(true);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo78539a(RectF rectF, float f, float f2) {
        return C84908o.m145920b(rectF, f, f2, this.f107748h.f107213b);
    }

    public int getCurAlignTxt() {
        return this.f107748h.f107215d;
    }

    public RectF getCurrentHelpBoxRect() {
        return this.f107757q.mo77724a();
    }

    public RectF getHelpRect() {
        return this.f107757q.f107243c;
    }

    public float getStickerRotate() {
        return this.f107748h.f107213b;
    }

    public float getStickerScale() {
        return this.f107748h.f107212a;
    }

    public String getText() {
        return C46110t.m88973i(this.f107749i);
    }

    public RectF getTextRect() {
        return this.f107757q.f107242b;
    }

    /* renamed from: h */
    public final boolean mo78573h() {
        return this.f107759s.mo77732b();
    }

    /* renamed from: i */
    public final boolean mo78574i() {
        return this.f107759s.mo77732b();
    }

    /* renamed from: j */
    public final boolean mo78576j() {
        return this.f107759s.mo77732b();
    }

    /* renamed from: m */
    public final void mo78579m() {
        this.f107759s.f107290j = 2;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.sticker.data.e' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final /* synthetic */ TextStickerData mo65021c() {
        return mo78410b().clone();
    }

    /* renamed from: e */
    public final boolean mo78550e() {
        this.f107748h.f107218g = this.f107759s.f107289i;
        return this.f107748h.f107218g;
    }

    public RectF getDeleteIconRect() {
        C46047c cVar = this.f107757q;
        if (cVar.f107255o) {
            return cVar.f107249i;
        }
        return null;
    }

    public float getGuidanceRectBottom() {
        C46047c cVar = this.f107757q;
        return cVar.f107242b.bottom + ((float) cVar.f107251k);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        List<TextStickerTextWrap> list = this.f107749i;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: n */
    public final void mo78580n() {
        if (this.f107759s.f107281a != null) {
            this.f107759s.f107281a.mo77568a(this, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC45824b bVar = this.f107761u;
        if (bVar != null) {
            bVar.mo77180f();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC45824b bVar = this.f107761u;
        if (bVar != null) {
            bVar.mo77181g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.q$a */
    class C46240a implements AbstractC45840k {
        static {
            Covode.recordClassIndex(54802);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: c */
        public final void mo77193c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: e */
        public final void mo77195e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: f */
        public final void mo77196f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: a */
        public final void mo77191a() {
            if (C46239q.this.f107759s.f107281a != null) {
                C46239q.this.f107759s.f107281a.mo77566a(C46239q.this);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: b */
        public final void mo77192b() {
            if (C46239q.this.f107759s.f107281a != null) {
                C46239q.this.f107759s.f107281a.mo77568a(C46239q.this, true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: d */
        public final void mo77194d() {
            if (C46239q.this.f107759s.f107281a != null) {
                C46239q.this.f107759s.f107281a.mo77569b(C46239q.this);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: g */
        public final void mo77197g() {
            if (C46239q.this.f107759s.f107281a != null) {
                C46239q.this.f107759s.f107281a.mo77571d(C46239q.this);
            }
        }

        private C46240a() {
        }

        /* synthetic */ C46240a(C46239q qVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private void mo78406a() {
        this.f107734C = SystemClock.elapsedRealtime();
        this.f107743c.postDelayed(new RunnableC46242r(this), 1000);
    }

    /* renamed from: p */
    private boolean m89184p() {
        if (this.f107737F || this.f107738G || this.f107736E || this.f107759s.mo77730a()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m89185q() {
        if (this.f107737F || this.f107736E || this.f107759s.mo77730a()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m89186r() {
        if (this.f107738G || this.f107736E || this.f107759s.mo77730a()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo78552f() {
        if (!this.f107742b || getVisibility() != 0) {
            return false;
        }
        if (!this.f107759s.mo77734d() || this.f107748h.f107219h) {
            return true;
        }
        return false;
    }

    public int getContentViewHeight() {
        return (int) Math.abs(getMinTextRect().bottom - getMinTextRect().top);
    }

    public int getContentViewWidth() {
        return (int) Math.abs(getMinTextRect().right - getMinTextRect().left);
    }

    private int getFontSize() {
        float fontSize;
        if (this.f107748h.f107216e < 0) {
            C46046b bVar = this.f107748h;
            Context context = getContext();
            TextStickerData textStickerData = this.f107760t;
            if (textStickerData == null) {
                fontSize = 28.0f;
            } else {
                fontSize = (float) textStickerData.getFontSize();
            }
            bVar.f107216e = (int) C30745b.m63130a(context, fontSize);
        }
        return this.f107748h.f107216e;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: d */
    public final int mo65022d() {
        if (getData() == null || !getData().hasTimeData()) {
            return 0;
        }
        return getData().getUiStartTime();
    }

    /* renamed from: g */
    public final void mo78581o() {
        if (this.f107760t != null && !mo78550e() && !this.f107739H) {
            int i = 0;
            if (SystemClock.elapsedRealtime() >= this.f107734C) {
                boolean isVisibleWhen = this.f107760t.isVisibleWhen(this.f107733B);
                if (!isVisibleWhen) {
                    i = 8;
                }
                C71827ew.m126829b(this, i);
                this.f107742b = isVisibleWhen;
            }
        }
    }

    public PointF[] getAnglePointList() {
        C46047c cVar = this.f107757q;
        int size = cVar.f107228I.size();
        PointF[] pointFArr = new PointF[size];
        float radians = (float) Math.toRadians((double) cVar.f107226G);
        for (int i = 0; i < size; i++) {
            pointFArr[i] = C84908o.m145916a(cVar.f107228I.get(i), cVar.f107243c.centerX(), cVar.f107243c.centerY(), radians);
        }
        return pointFArr;
    }

    public RectF getBubbleShowLimitRect() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        RectF currentHelpBoxRect = getCurrentHelpBoxRect();
        return new RectF(((float) iArr[0]) + currentHelpBoxRect.left, ((float) iArr[1]) + currentHelpBoxRect.top, ((float) iArr[0]) + currentHelpBoxRect.right, ((float) iArr[1]) + currentHelpBoxRect.bottom);
    }

    public RectF getMinTextRect() {
        C46047c cVar = this.f107757q;
        return new RectF(cVar.f107242b.left + ((float) cVar.f107259s), cVar.f107242b.top + ((float) cVar.f107260t), cVar.f107242b.right - ((float) cVar.f107259s), cVar.f107242b.bottom - ((float) cVar.f107260t));
    }

    /* renamed from: b */
    public TextStickerData mo78410b() {
        if (this.f107760t == null) {
            TextStickerData textStickerData = new TextStickerData("", this.f107750j, this.f107751k, this.f107748h.f107215d, this.f107752l);
            this.f107760t = textStickerData;
            textStickerData.setTextWrapList(getTextWrapList());
            if (C45866d.m88491d() != null) {
                C45866d.m88491d().mo77252a(new IllegalStateException("Why are you running here?"));
            }
        }
        this.f107760t.setX(this.f107746f);
        this.f107760t.setY(this.f107747g);
        this.f107760t.setRotation(this.f107748h.f107213b);
        this.f107760t.setScale(this.f107748h.f107212a);
        this.f107760t.setTextWrapList(getTextWrapList());
        this.f107760t.setBgMode(this.f107750j);
        this.f107760t.setColor(this.f107751k);
        this.f107760t.setAlign(this.f107748h.f107215d);
        this.f107760t.setFontType(this.f107752l);
        return this.f107760t;
    }

    public PointF[] getAnglePointListForBlock() {
        C46047c cVar = this.f107757q;
        int i = 0;
        PointF[] pointFArr = {new PointF(cVar.f107242b.left, cVar.f107242b.top), new PointF(cVar.f107242b.right, cVar.f107242b.top), new PointF(cVar.f107242b.right, cVar.f107242b.bottom), new PointF(cVar.f107242b.left, cVar.f107242b.bottom)};
        float radians = (float) Math.toRadians((double) cVar.f107226G);
        do {
            pointFArr[i] = C84908o.m145916a(pointFArr[i], cVar.f107242b.centerX(), cVar.f107242b.centerY(), radians);
            i++;
        } while (i < 4);
        return pointFArr;
    }

    /* renamed from: l */
    public final void mo78578l() {
        C46048d dVar = this.f107758r;
        float f = this.f107746f;
        float f2 = this.f107747g;
        float f3 = this.f107748h.f107212a;
        float f4 = this.f107748h.f107213b;
        dVar.f107273g = true;
        dVar.f107274h = false;
        dVar.f107275i = f;
        dVar.f107276j = f2;
        dVar.f107277k = f4;
        dVar.f107278l = f3;
        dVar.f107267a = dVar.f107278l / ((float) dVar.f107279m);
        dVar.f107268b = dVar.f107277k / ((float) dVar.f107279m);
        dVar.f107269c = (f - dVar.f107271e) / ((float) dVar.f107279m);
        dVar.f107270d = (f2 - dVar.f107272f) / ((float) dVar.f107279m);
        dVar.f107280n.invalidate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    /* renamed from: k */
    public final void mo78577k() {
        C46048d dVar = this.f107758r;
        dVar.f107274h = true;
        dVar.f107273g = false;
        dVar.f107267a = (-dVar.f107278l) / ((float) dVar.f107279m);
        dVar.f107268b = (-dVar.f107277k) / ((float) dVar.f107279m);
        dVar.f107269c = (-(dVar.f107275i - dVar.f107271e)) / ((float) dVar.f107279m);
        dVar.f107270d = (-(dVar.f107276j - dVar.f107272f)) / ((float) dVar.f107279m);
        dVar.f107280n.invalidate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        TextStickerData textStickerData = this.f107760t;
        if (textStickerData != null && !textStickerData.isVisibleWhen(this.f107733B)) {
            C46048d dVar2 = this.f107758r;
            dVar2.f107274h = false;
            dVar2.f107273g = false;
            dVar2.f107280n.mo78545b(dVar2.f107278l);
            dVar2.f107280n.mo78548c(dVar2.f107277k);
            dVar2.f107280n.setCenterX(dVar2.f107275i);
            dVar2.f107280n.setCenterY(dVar2.f107276j);
            dVar2.f107280n.invalidate();
        }
    }

    public void setCenterX(float f) {
        this.f107746f = f;
    }

    public void setCenterY(float f) {
        this.f107747g = f;
    }

    public void setEnableEdit(boolean z) {
        this.f107742b = z;
    }

    public void setIsGuidanceSticker(boolean z) {
        this.f107753m = z;
    }

    public void setPlayPosition(long j) {
        this.f107733B = j;
    }

    public void setWasGuidanceSticker(boolean z) {
        this.f107754n = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.q$b */
    public class C46241b implements AbstractC46115a {
        static {
            Covode.recordClassIndex(54803);
        }

        public C46241b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46115a
        /* renamed from: a */
        public final void mo78302a(boolean z, boolean z2, boolean z3) {
            if (z && C46239q.this.f107763w != null) {
                C46239q.this.f107763w.mo77235c();
            }
            if (C46239q.this.f107761u != null) {
                if (z) {
                    if (C46239q.this.f107761u instanceof C45842m) {
                        ((C45842m) C46239q.this.f107761u).f106796n = C46239q.this.f107764x;
                    }
                    C46239q.this.f107761u.mo77174a(C46239q.this.getBubbleShowLimitRect(), (int) C46239q.this.f107762v.x, (int) C46239q.this.f107762v.y, C46239q.this.f107748h.f107213b, z3);
                } else if (z2) {
                    C46239q.this.f107761u.mo77176b();
                } else {
                    C46239q.this.f107761u.mo77176b();
                }
            }
        }
    }

    /* renamed from: a */
    private void mo78408a(boolean z) {
        this.f107748h.f107217f = z;
    }

    /* renamed from: b */
    public final boolean mo78545b(float f) {
        this.f107748h.f107212a = f;
        return true;
    }

    public void setMotionInterceptor(AbstractC45857b bVar) {
        this.f107759s.f107302v = bVar;
    }

    public void setOnEditClickListener(AbstractC46118d dVar) {
        this.f107759s.f107281a = dVar;
    }

    public void setOnEffectTextGestureListener(AbstractC46116b bVar) {
        this.f107759s.f107301u = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        mo78534a(f, false);
    }

    public void setShowHelpBox(boolean z) {
        this.f107759s.mo77729a(z);
        if (!z) {
            mo78406a();
        }
    }

    public void setTouching(boolean z) {
        if (z != this.f107739H) {
            this.f107739H = z;
            invalidate();
            if (!z) {
                mo78406a();
            }
        }
    }

    /* renamed from: d */
    private void m89182d(int i) {
        C46047c cVar = this.f107757q;
        cVar.f107256p.setColor(i);
        cVar.f107257q = i;
        if (cVar.f107225F) {
            cVar.f107221B.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            cVar.f107221B.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: b */
    public final int mo65018b(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().getEndTime();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final int mo65020c(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().getUiEndTime();
    }

    public void setAnimXY(Point point) {
        C46048d dVar = this.f107758r;
        PointF c = dVar.f107280n.mo78413c((float) point.x, (float) point.y);
        dVar.f107271e = c.x;
        dVar.f107272f = c.y;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final int mo65014a(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().getStartTime();
    }

    /* renamed from: b */
    public void mo78411b(boolean z) {
        TextStickerData textStickerData = this.f107760t;
        if (textStickerData != null && textStickerData.hasPositionData()) {
            if (!this.f107760t.isGuidanceSticker()) {
                this.f107746f = this.f107760t.getX();
            }
            this.f107747g = this.f107760t.getY();
            this.f107748h.f107213b = this.f107760t.getRotation();
            this.f107748h.f107212a = this.f107760t.getScale();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(11951);
        super.onDraw(canvas);
        mo78537a(canvas);
        this.f107758r.mo77727a(this.f107748h.f107212a, this.f107748h.f107213b, this.f107746f, this.f107747g);
        this.f107758r.mo77728b(this.f107748h.f107212a, this.f107748h.f107213b, this.f107746f, this.f107747g);
        MethodCollector.m26664o(11951);
    }

    /* renamed from: c */
    public final void mo78548c(float f) {
        this.f107748h.f107213b = f;
        if (this.f107748h.f107213b > 180.0f) {
            this.f107748h.f107213b -= 360.0f;
        }
        if (this.f107748h.f107213b < -180.0f) {
            this.f107748h.f107213b += 360.0f;
        }
    }

    public void setFontSize(int i) {
        TextStickerData textStickerData = this.f107760t;
        if (textStickerData != null) {
            textStickerData.setFontSize(i);
        }
        this.f107748h.f107216e = (int) C30745b.m63130a(getContext(), (float) i);
        C46047c cVar = this.f107757q;
        float f = (float) this.f107748h.f107216e;
        cVar.f107258r = f;
        float a = f / C30745b.m63130a(cVar.f107224E.getContext(), 28.0f);
        cVar.f107259s = (int) (C30745b.m63132b(cVar.f107224E.getContext(), 12.0f) * a);
        cVar.f107260t = (int) (C30745b.m63132b(cVar.f107224E.getContext(), 8.0f) * a);
        cVar.f107261u = cVar.f107259s;
        cVar.f107262v = cVar.f107260t;
        cVar.f107266z = (int) (C30745b.m63132b(cVar.f107224E.getContext(), 5.0f) * a);
        cVar.f107256p.setPathEffect(new CornerPathEffect((float) cVar.f107266z));
        invalidate();
    }

    public void setTextColor(int i) {
        boolean z;
        C46047c cVar = this.f107757q;
        C45989b a = C45989b.m88764a();
        if (a.mo77600e() != null) {
            z = a.mo77600e().mo77601a();
        } else {
            z = false;
        }
        cVar.f107225F = z;
        if (cVar.f107221B.getTypeface() != C45989b.m88764a().mo77595c()) {
            cVar.f107221B.setTypeface(C45989b.m88764a().mo77595c());
        }
        if (cVar.f107225F) {
            cVar.f107221B.setColor(-1);
            cVar.f107221B.setShadowLayer(12.0f, 0.0f, 0.0f, i);
            return;
        }
        cVar.f107221B.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        cVar.f107221B.setColor(i);
    }

    /* renamed from: a */
    private void m89180a(TextStickerData textStickerData) {
        this.f107760t = textStickerData;
        if (textStickerData != null) {
            setFontSize(textStickerData.getFontSize());
            mo78536a(this.f107760t.getBgMode(), this.f107760t.getColor(), this.f107760t.getAlign(), this.f107760t.getFontType());
            mo78544b(this.f107760t.getTextWrapList(), textStickerData.getEffectTextLayoutConfig());
            setAnimXY(this.f107760t.getEditCenterPoint());
            mo78411b(false);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (r3 <= r1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        r2 = com.p2082ss.android.ugc.aweme.editSticker.C45866d.m88491d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r2 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        r2.mo77254c("TextSticker setLayerType -> viewType: ".concat(java.lang.String.valueOf(r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        setLayerType(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        if (r8 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDrawStrokeState(int r12) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q.setDrawStrokeState(int):void");
    }

    /* renamed from: b */
    public final boolean mo78546b(MotionEvent motionEvent) {
        boolean z;
        C45896b bVar;
        boolean z2;
        int i;
        this.f107762v.set(motionEvent.getRawX(), motionEvent.getRawY());
        if (!mo78552f()) {
            return false;
        }
        this.f107759s.mo77732b();
        C46049e eVar = this.f107759s;
        long currentTimeMillis = System.currentTimeMillis() - eVar.f107286f;
        if (eVar.f107281a != null && currentTimeMillis <= 200 && eVar.f107297q.m89183f(eVar.f107284d, eVar.f107285e) && eVar.f107297q.m89183f(motionEvent.getX() - ((float) eVar.f107293m), motionEvent.getY() - ((float) eVar.f107294n))) {
            eVar.f107281a.mo77570c(eVar.f107297q);
        }
        if (!this.f107759s.mo77732b() || (bVar = this.f107735D) == null) {
            z = false;
        } else {
            bVar.f106886c = getCenterX() - this.f107735D.f106886c;
            this.f107735D.f106887d = getCenterY() - this.f107735D.f106887d;
            C46049e eVar2 = this.f107759s;
            z = true;
            eVar2.f107299s = true;
            if (eVar2.f107281a == null || !eVar2.mo77730a()) {
                z2 = false;
            } else {
                RectF helpRect = eVar2.f107297q.getHelpRect();
                C84908o.m145919a(helpRect, helpRect.centerX(), helpRect.centerY(), eVar2.f107297q.getStickerRotate());
                C84908o.m145918a(helpRect, eVar2.f107297q.getStickerScale());
                eVar2.f107281a.mo77567a(eVar2.f107297q, helpRect, new C46123i(eVar2.f107293m + ((int) eVar2.f107287g), eVar2.f107294n + ((int) eVar2.f107288h), true, false, eVar2.mo77734d()));
                if (eVar2.f107298r) {
                    eVar2.mo77734d();
                    eVar2.mo77729a(false);
                    eVar2.f107298r = false;
                }
                eVar2.f107281a.mo77564a(eVar2.f107297q, true, false);
                z2 = true;
            }
            if (eVar2.f107295o) {
                long currentTimeMillis2 = System.currentTimeMillis() - eVar2.f107286f;
                int abs = (int) Math.abs(motionEvent.getX() - (eVar2.f107284d + ((float) eVar2.f107293m)));
                if (C45890g.f106878a != null) {
                    i = C45890g.f106878a.mo59453d();
                } else {
                    i = 0;
                }
                int abs2 = (int) Math.abs((motionEvent.getY() - ((float) i)) - (eVar2.f107285e + ((float) eVar2.f107294n)));
                if (currentTimeMillis2 <= 200 && (abs <= 5 || abs2 <= 5)) {
                    if (!eVar2.f107302v.mo77208a()) {
                        if (eVar2.f107289i || eVar2.mo77734d()) {
                            if (eVar2.f107281a != null) {
                                new C45902g().f106891a.storeBoolean("text_sticker_hint_set", true);
                                eVar2.f107281a.mo77568a(eVar2.f107297q, true);
                            }
                            eVar2.mo77729a(false);
                        } else {
                            if (eVar2.f107281a != null) {
                                eVar2.f107281a.mo77568a(eVar2.f107297q, eVar2.f107297q.f107753m);
                            }
                            eVar2.mo77729a(!eVar2.f107297q.f107753m);
                        }
                    }
                    if (eVar2.f107301u != null) {
                        eVar2.f107301u.mo78303a();
                    }
                }
            } else {
                z = z2;
            }
            if (eVar2.f107301u != null) {
                eVar2.f107301u.mo78306d();
            }
        }
        this.f107737F = false;
        this.f107736E = false;
        this.f107738G = false;
        C46049e eVar3 = this.f107759s;
        eVar3.f107287g = 0.0f;
        eVar3.f107288h = 0.0f;
        setTouching(false);
        return z;
    }

    /* renamed from: b */
    public final boolean mo78547b(ScaleGestureDetector scaleGestureDetector) {
        if (!mo78552f()) {
            return false;
        }
        if ((C45890g.m88534a().f106864d && scaleGestureDetector.getScaleFactor() > 1.0f && this.f107757q.f107221B.getTextSize() >= Keva.getRepo("text_max_size_repo").getFloat("max_size_key", -1.0f)) || !m89186r() || (scaleGestureDetector.getScaleFactor() > 1.0f ? this.f107748h.f107212a > 11.0f : this.f107748h.f107212a < 0.4f)) {
            return false;
        }
        this.f107748h.f107212a *= scaleGestureDetector.getScaleFactor();
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78537a(Canvas canvas) {
        boolean z;
        this.f107748h.f107214c.x = this.f107746f;
        this.f107748h.f107214c.y = this.f107747g;
        mo78550e();
        getFontSize();
        C46047c cVar = this.f107757q;
        if (!this.f107753m || this.f107739H || this.f107766z) {
            z = false;
        } else {
            z = true;
        }
        cVar.f107255o = z;
        this.f107757q.mo77725a(canvas, this.f107748h);
    }

    /* renamed from: a */
    public final void mo78534a(float f, boolean z) {
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void mo78544b(List<TextStickerTextWrap> list, Object obj) {
        TextStickerData textStickerData = this.f107760t;
        if (textStickerData != null) {
            textStickerData.setTextWrapList(list);
        }
        mo78407a(list, obj);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11777);
        super.onMeasure(i, i2);
        MethodCollector.m26664o(11777);
    }

    /* renamed from: e */
    public final boolean mo78551e(float f, float f2) {
        return mo78539a(getHelpRect(), f, f2);
    }

    /* renamed from: c */
    public PointF mo78413c(float f, float f2) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return new PointF(f - ((float) iArr[0]), f2 - ((float) iArr[1]));
    }

    /* renamed from: a */
    private static Object m89178a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11628);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11628);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: f */
    private boolean m89183f(float f, float f2) {
        RectF deleteIconRect = getDeleteIconRect();
        if (deleteIconRect == null) {
            return false;
        }
        Point point = new Point((int) deleteIconRect.centerX(), (int) deleteIconRect.centerY());
        C84908o.m145917a(point, getHelpRect().centerX(), getHelpRect().centerY(), this.f107748h.f107213b);
        if (Math.pow(Math.pow((double) (((float) point.x) - f), 2.0d) + Math.pow((double) (((float) point.y) - f2), 2.0d), 0.5d) <= ((double) (deleteIconRect.width() / 2.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo78549d(float f, float f2) {
        if (!mo78552f()) {
            return false;
        }
        this.f107736E = mo78409a(f, f2);
        this.f107759s.mo77731a(f, f2);
        return m89184p();
    }

    /* renamed from: b */
    public boolean mo78412b(float f, float f2) {
        return mo78551e(f, f2);
    }

    /* renamed from: a */
    public final void mo78535a(int i, int i2) {
        this.f107755o = i;
        this.f107756p = i2;
        C46049e eVar = this.f107759s;
        eVar.f107293m = i;
        eVar.f107294n = i2;
        TextStickerData textStickerData = this.f107760t;
        if (textStickerData != null && textStickerData.getEditCenterPoint() != null) {
            setAnimXY(this.f107760t.getEditCenterPoint());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65017a(TextStickerData textStickerData, int i, int i2) {
        m89180a(textStickerData);
    }

    /* renamed from: a */
    public final void mo78536a(int i, int i2, int i3, String str) {
        TextStickerData textStickerData = this.f107760t;
        if (textStickerData != null) {
            textStickerData.setBgMode(i);
            this.f107760t.setColor(i2);
            this.f107760t.setFontType(str);
            this.f107760t.setAlign(i3);
        }
        this.f107750j = i;
        setDrawStrokeState(i);
        this.f107751k = i2;
        this.f107752l = str;
        C45989b.m88764a().f107109d = this.f107752l;
        if (i == 1 || i == 4) {
            setTextColor(i2);
            mo78408a(false);
        } else if (i == 2) {
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            if (this.f107753m) {
                setTextColor(1461065763);
            }
            m89182d(i2);
            mo78408a(true);
        } else if (i == 3) {
            setTextColor(-1);
            m89182d(TextStickerEditText.m89132a(i2));
            mo78408a(true);
        }
        this.f107748h.f107215d = i3;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(11947);
        super.onLayout(z, i, i2, i3, i4);
        if (this.f107741a) {
            this.f107741a = false;
            this.f107746f = ((float) getMeasuredWidth()) / 2.0f;
            this.f107747g = (((float) getMeasuredHeight()) / 2.0f) - (((float) getFontSize()) / 2.0f);
            this.f107748h.f107213b = 0.0f;
            this.f107748h.f107212a = 1.0f;
            m89180a(this.f107760t);
        }
        MethodCollector.m26664o(11947);
    }

    public C46239q(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, AbstractC46045a aVar, Boolean bool) {
        super(context);
        MethodCollector.m26663i(11459);
        int i = C46110t.f107370a;
        C46110t.f107370a = i + 1;
        this.f107765y = i;
        this.f107766z = false;
        setWillNotDraw(false);
        this.f107743c = safeHandler;
        this.f107748h.f107219h = z;
        if (C45890g.m88534a().f106863c != null && bool.booleanValue()) {
            AbstractC45824b a = C45890g.m88534a().f106863c.mo77184a(this, new C46240a(this, (byte) 0));
            this.f107761u = a;
            a.f106778a = this.f107748h.f107219h;
        }
        this.f107757q = new C46047c();
        this.f107759s = new C46049e(aVar);
        this.f107758r = new C46048d();
        C46047c cVar = this.f107757q;
        cVar.f107241a = context;
        cVar.f107224E = this;
        cVar.f107224E.setLayerType(2, null);
        cVar.f107258r = C30745b.m63130a(context, 28.0f);
        cVar.f107259s = (int) C30745b.m63132b(context, 12.0f);
        cVar.f107260t = (int) C30745b.m63132b(context, 8.0f);
        cVar.f107261u = cVar.f107259s;
        cVar.f107262v = cVar.f107260t;
        cVar.f107263w = (int) C30745b.m63132b(context, 2.0f);
        cVar.f107264x = (int) C30745b.m63132b(context, 14.0f);
        cVar.f107265y = (int) C30745b.m63132b(context, 2.0f);
        cVar.f107266z = (int) C30745b.m63132b(context, 5.0f);
        cVar.f107251k = (int) C30745b.m63132b(context, 12.0f);
        cVar.f107252l = (int) C30745b.m63132b(context, 9.0f);
        cVar.f107253m = C30745b.m63132b(context, 6.0f);
        cVar.f107254n = C30745b.m63132b(context, 1.0f);
        cVar.f107220A = C46110t.m88956a(context);
        cVar.f107245e = BitmapFactory.decodeResource(context.getResources(), 2131232456);
        cVar.f107247g = BitmapFactory.decodeResource(context.getResources(), 2131232453);
        cVar.f107244d.set(0, 0, cVar.f107245e.getWidth(), cVar.f107245e.getHeight());
        cVar.f107248h.set(0, 0, cVar.f107247g.getWidth(), cVar.f107247g.getHeight());
        cVar.f107221B.setColor(-1);
        cVar.f107221B.setTypeface(Typeface.DEFAULT_BOLD);
        cVar.f107221B.setTextSize(cVar.f107258r);
        cVar.f107221B.setAntiAlias(true);
        cVar.f107227H = new Paint(cVar.f107221B);
        cVar.f107227H.setColor(-16737912);
        cVar.f107222C.setColor(-2130706433);
        cVar.f107222C.setStyle(Paint.Style.STROKE);
        cVar.f107222C.setAntiAlias(true);
        cVar.f107222C.setStrokeWidth(2.0f);
        cVar.f107256p = new Paint();
        cVar.f107256p.setStyle(Paint.Style.FILL);
        cVar.f107256p.setAntiAlias(true);
        cVar.f107256p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        cVar.f107256p.setPathEffect(new CornerPathEffect((float) cVar.f107266z));
        cVar.f107223D = new Path();
        cVar.f107250j = new Paint();
        cVar.f107250j.setPathEffect(new DashPathEffect(new float[]{cVar.f107253m, cVar.f107253m}, 0.0f));
        cVar.f107250j.setStyle(Paint.Style.STROKE);
        cVar.f107250j.setColor(-1);
        cVar.f107250j.setStrokeWidth(cVar.f107254n);
        cVar.f107250j.setAntiAlias(true);
        cVar.f107246f = new Path();
        C46049e eVar = this.f107759s;
        SafeHandler safeHandler2 = this.f107743c;
        eVar.f107297q = this;
        eVar.f107296p = safeHandler2;
        this.f107758r.f107280n = this;
        this.f107759s.f107300t = new C46241b();
        this.f107744d = C70636dh.m124831b(context) / 2;
        this.f107745e = C70636dh.m124828a(context) / 2;
        this.f107732A = (Vibrator) m89178a(context, "vibrator");
        this.f107760t = textStickerData;
        this.f107750j = textStickerData.getBgMode();
        this.f107751k = this.f107760t.getColor();
        this.f107748h.f107215d = this.f107760t.getAlign();
        this.f107752l = this.f107760t.getFontType();
        this.f107746f = this.f107760t.getX();
        this.f107747g = this.f107760t.getY();
        this.f107748h.f107213b = this.f107760t.getRotation();
        this.f107748h.f107212a = this.f107760t.getScale();
        this.f107749i = this.f107760t.getTextWrapList();
        this.f107753m = this.f107760t.isGuidanceSticker();
        MethodCollector.m26664o(11459);
    }
}
