package com.p2082ss.android.ugc.aweme.editSticker.interact.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45896b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45837j;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.g */
public class C45922g extends FrameLayout {

    /* renamed from: A */
    private boolean f106944A;

    /* renamed from: B */
    private boolean f106945B;

    /* renamed from: C */
    private boolean f106946C;

    /* renamed from: D */
    private C45896b f106947D;

    /* renamed from: E */
    private AbstractC45857b f106948E;

    /* renamed from: a */
    protected Context f106949a;

    /* renamed from: b */
    protected float f106950b;

    /* renamed from: c */
    protected float f106951c;

    /* renamed from: d */
    protected int f106952d;

    /* renamed from: e */
    protected int f106953e;

    /* renamed from: f */
    protected StickerHelpBoxView f106954f;

    /* renamed from: g */
    protected View f106955g;

    /* renamed from: h */
    public AbstractC45894a f106956h;

    /* renamed from: i */
    public boolean f106957i;

    /* renamed from: j */
    protected long f106958j;

    /* renamed from: k */
    public boolean f106959k;

    /* renamed from: l */
    protected boolean f106960l;

    /* renamed from: m */
    protected float f106961m;

    /* renamed from: n */
    protected float f106962n;

    /* renamed from: o */
    public long f106963o;

    /* renamed from: p */
    public AbstractC45824b f106964p;

    /* renamed from: q */
    private boolean f106965q;

    /* renamed from: r */
    private boolean f106966r;

    /* renamed from: s */
    private PointF f106967s;

    /* renamed from: t */
    private PointF f106968t;

    /* renamed from: u */
    private Runnable f106969u;

    /* renamed from: v */
    private boolean f106970v;

    /* renamed from: w */
    private int f106971w;

    /* renamed from: x */
    private boolean f106972x;

    /* renamed from: y */
    private boolean f106973y;

    /* renamed from: z */
    private int f106974z;

    static {
        Covode.recordClassIndex(54448);
    }

    /* renamed from: d */
    public boolean mo77350d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo77353g() {
        return true;
    }

    public View getDrawView() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo77365h() {
        return true;
    }

    /* renamed from: i */
    public boolean mo77366i() {
        return false;
    }

    /* renamed from: o */
    public boolean mo77372o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo77376p() {
        return false;
    }

    public View getContentView() {
        return this.f106955g;
    }

    public boolean getLockMode() {
        return this.f106960l;
    }

    public float getRotateAngle() {
        return this.f106951c;
    }

    public float getScale() {
        return this.f106950b;
    }

    /* renamed from: a */
    public final boolean mo77344a(C84885c cVar) {
        if (!mo77353g()) {
            return false;
        }
        boolean a = m88643a(cVar.f189714i, cVar.f189715j);
        this.f106965q = a;
        return a;
    }

    public PointF[] getFourAnglePoint() {
        return this.f106954f.getFourAnglePoint();
    }

    public RectF getViewPositionRect() {
        return this.f106954f.getViewBoxRect();
    }

    /* renamed from: l */
    public final void mo77369l() {
        m88642a(false);
    }

    /* renamed from: n */
    public final boolean mo77371n() {
        return this.f106954f.f106909a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo77377q() {
        m88642a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.g$a */
    public class C45923a implements AbstractC45840k {
        static {
            Covode.recordClassIndex(54449);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: c */
        public final void mo77193c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: d */
        public final void mo77194d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: f */
        public void mo77196f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: g */
        public final void mo77197g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: a */
        public final void mo77191a() {
            if (C45922g.this.f106956h != null) {
                C45922g.this.f106956h.mo77266c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: b */
        public final void mo77192b() {
            if (C45922g.this.f106956h != null) {
                C45922g.this.f106956h.mo77260a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: e */
        public final void mo77195e() {
            if (C45922g.this.f106956h != null) {
                C45922g.this.f106956h.mo77268d();
            }
        }

        public C45923a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC45824b mo77336a() {
        return new C45837j(this, new C45923a());
    }

    /* renamed from: f */
    public final boolean mo77352f() {
        if (this.f106957i || this.f106965q || this.f106966r) {
            return true;
        }
        return false;
    }

    public int getContentViewHeight() {
        return (int) (((float) this.f106955g.getMeasuredHeight()) * this.f106950b);
    }

    public int getContentViewWidth() {
        return (int) (((float) this.f106955g.getMeasuredWidth()) * this.f106950b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f106964p.mo77180f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f106964p.mo77181g();
    }

    /* renamed from: c */
    public void mo77349c() {
        this.f106964p.mo77174a(this.f106954f.getRectOnWindow(), (int) this.f106968t.x, (int) this.f106968t.y, this.f106954f.getRotateAngle(), false);
    }

    public PointF getCenterViewPoint() {
        Rect rect = new Rect();
        this.f106955g.getHitRect(rect);
        rect.centerX();
        return new PointF(rect.exactCenterX(), rect.exactCenterY());
    }

    public PointF getContentViewPoint() {
        return new PointF(this.f106955g.getX(), this.f106955g.getY());
    }

    /* renamed from: k */
    public final boolean mo77368k() {
        boolean z = this.f106954f.f106909a;
        if (z && this.f106945B) {
            m88642a(false);
        }
        this.f106945B = false;
        this.f106959k = false;
        if (z || this.f106946C) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo77370m() {
        if (mo77350d()) {
            this.f106954f.mo77296b();
            Runnable runnable = this.f106969u;
            if (runnable != null) {
                this.f106954f.removeCallbacks(runnable);
            }
            this.f106954f.postDelayed(this.f106969u, 3000);
        }
    }

    /* renamed from: j */
    public void mo77367j() {
        if (this.f106954f.f106909a || (this.f106944A && this.f106974z < 2)) {
            if (this.f106956h != null && this.f106972x) {
                new C45902g().f106891a.storeBoolean("interact_sticker_hint_set", true);
                this.f106956h.mo77263b();
            }
            m88642a(false);
            return;
        }
        mo77370m();
    }

    /* renamed from: b */
    public void mo77345b() {
        Rect rect = new Rect();
        int measuredWidth = this.f106955g.getMeasuredWidth();
        int measuredHeight = this.f106955g.getMeasuredHeight();
        int x = (int) this.f106955g.getX();
        int y = (int) this.f106955g.getY();
        rect.set(x, y, measuredWidth + x, measuredHeight + y);
        this.f106954f.mo77294a(rect);
        int[] iArr = new int[2];
        this.f106955g.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - x;
        iArr[1] = iArr[1] - y;
        this.f106954f.setmWindowPadding(iArr);
        this.f106954f.mo77293a(this.f106950b, this.f106951c);
        this.f106954f.setStickerShowHelpboxCallback(new C45926j(this));
    }

    /* renamed from: e */
    public final void mo77351e() {
        float f;
        mo77345b();
        this.f106954f.mo77292a();
        AbstractC45894a aVar = this.f106956h;
        float f2 = 0.0f;
        if (aVar != null) {
            PointF e = aVar.mo77269e();
            f2 = e.x;
            f = e.y;
        } else {
            f = 0.0f;
        }
        float x = this.f106955g.getX() + f2;
        float y = this.f106955g.getY() + f;
        AbstractC45894a aVar2 = this.f106956h;
        if (aVar2 == null || !this.f106960l || aVar2.mo77265b(f2, f)) {
            this.f106955g.setX(x);
            this.f106955g.setY(y);
            this.f106954f.mo77297b(f2, f);
        }
    }

    public void setLockMode(boolean z) {
        this.f106960l = z;
    }

    public void setMotionInterceptor(AbstractC45857b bVar) {
        this.f106948E = bVar;
    }

    public void setStickerEditListener(AbstractC45894a aVar) {
        this.f106956h = aVar;
    }

    public C45922g(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m88642a(boolean z) {
        this.f106954f.mo77295a(z);
    }

    /* renamed from: a */
    public final void mo77337a(float f) {
        AbstractC45894a aVar = this.f106956h;
        if (aVar == null || !this.f106960l || aVar.mo77267c(f)) {
            float f2 = this.f106950b * f;
            this.f106950b = f2;
            float f3 = this.f106961m;
            if (f2 > f3) {
                this.f106950b = f3;
                return;
            }
            float f4 = this.f106962n;
            if (f2 < f4) {
                this.f106950b = f4;
                return;
            }
            this.f106955g.setScaleX(f2);
            this.f106955g.setScaleY(this.f106950b);
            this.f106954f.mo77293a(this.f106950b, this.f106951c);
        }
    }

    /* renamed from: b */
    public final boolean mo77346b(float f) {
        if (!mo77353g() || !this.f106965q) {
            return false;
        }
        mo77339a((float) Math.toDegrees((double) f), (Boolean) true);
        return true;
    }

    /* renamed from: b */
    public final boolean mo77348b(ScaleGestureDetector scaleGestureDetector) {
        if (!mo77365h() || !this.f106966r) {
            return false;
        }
        mo77337a(scaleGestureDetector.getScaleFactor());
        return true;
    }

    /* renamed from: b */
    public boolean mo77347b(MotionEvent motionEvent) {
        boolean z;
        if (!mo77350d()) {
            return false;
        }
        m88644b(motionEvent.getX(), motionEvent.getY());
        this.f106968t.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f106972x = this.f106954f.mo77298c(this.f106967s.x, this.f106967s.y);
        m88644b(this.f106955g.getX() + ((float) (this.f106955g.getWidth() / 2)), this.f106955g.getY() + ((float) (this.f106955g.getHeight() / 2)));
        this.f106967s.x += (float) this.f106952d;
        if (this.f106971w != -1) {
            if (this.f106956h != null && !mo77366i()) {
                new RectF(this.f106954f.getHelpBoxRect());
                PointF centerViewPoint = getCenterViewPoint();
                C45896b bVar = this.f106947D;
                if (bVar != null) {
                    bVar.f106886c = centerViewPoint.x - this.f106947D.f106886c;
                    this.f106947D.f106887d = centerViewPoint.y - this.f106947D.f106887d;
                }
                AbstractC45894a aVar = this.f106956h;
                float f = this.f106967s.x;
                float f2 = this.f106967s.y;
                aVar.mo77261a(this, true);
            }
            if (System.currentTimeMillis() - this.f106958j > 300 && !mo77366i() && this.f106970v) {
                mo77370m();
                this.f106970v = false;
            }
            if (System.currentTimeMillis() - this.f106958j <= 300 && !mo77366i()) {
                if (!this.f106948E.mo77208a()) {
                    mo77367j();
                } else {
                    this.f106946C = true;
                }
            }
            AbstractC45894a aVar2 = this.f106956h;
            if (aVar2 != null) {
                aVar2.mo77257a(true, false, mo77372o(), false);
            }
            z = true;
        } else {
            if (this.f106965q && this.f106956h != null && !mo77366i()) {
                new RectF(this.f106954f.getHelpBoxRect());
                PointF centerViewPoint2 = getCenterViewPoint();
                C45896b bVar2 = this.f106947D;
                if (bVar2 != null) {
                    bVar2.f106886c = centerViewPoint2.x - this.f106947D.f106886c;
                    this.f106947D.f106887d = centerViewPoint2.y - this.f106947D.f106887d;
                }
                AbstractC45894a aVar3 = this.f106956h;
                float f3 = this.f106967s.x;
                float f4 = this.f106967s.y;
                aVar3.mo77261a(this, true);
                this.f106956h.mo77257a(true, true, mo77372o(), false);
            }
            z = false;
        }
        if (this.f106957i) {
            this.f106963o = System.currentTimeMillis();
        }
        this.f106945B = true ^ this.f106959k;
        this.f106957i = false;
        this.f106966r = false;
        this.f106965q = false;
        this.f106959k = false;
        this.f106971w = -1;
        return z;
    }

    /* renamed from: a */
    public boolean mo77341a(MotionEvent motionEvent) {
        if (!mo77350d()) {
            return false;
        }
        PointF centerViewPoint = getCenterViewPoint();
        this.f106947D = new C45896b(this.f106951c, this.f106950b, Float.valueOf(centerViewPoint.x).floatValue(), Float.valueOf(centerViewPoint.y).floatValue());
        this.f106946C = false;
        this.f106944A = false;
        this.f106959k = false;
        boolean a = m88643a(motionEvent.getX(), motionEvent.getY());
        this.f106957i = a;
        if (a) {
            this.f106971w = 3;
        } else {
            this.f106971w = -1;
        }
        if (this.f106971w != -1) {
            this.f106959k = true;
        }
        if (!this.f106959k) {
            m88642a(false);
        }
        m88644b(motionEvent.getX(), motionEvent.getY());
        this.f106958j = System.currentTimeMillis();
        return this.f106959k;
    }

    /* renamed from: a */
    public final boolean mo77342a(ScaleGestureDetector scaleGestureDetector) {
        boolean z = false;
        if (!mo77365h()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f106963o;
        if (currentTimeMillis < 300) {
            this.f106963o = System.currentTimeMillis();
        }
        if (m88643a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) && currentTimeMillis > 300) {
            z = true;
        }
        this.f106966r = z;
        return z;
    }

    /* renamed from: a */
    public final boolean mo77343a(C84882b bVar) {
        if (!mo77350d() || !mo77352f()) {
            return false;
        }
        if (Math.abs(bVar.f189709i.x) + Math.abs(bVar.f189709i.y) < 1.0f) {
            return true;
        }
        if (this.f106954f.f106909a) {
            this.f106944A = true;
        }
        this.f106974z = (int) (Math.abs(bVar.f189709i.x) + Math.abs(bVar.f189709i.y));
        mo77338a(bVar.f189709i.x, bVar.f189709i.y, true);
        m88644b(this.f106955g.getX() + ((float) (this.f106955g.getWidth() / 2)), this.f106955g.getY() + ((float) (this.f106955g.getHeight() / 2)));
        this.f106967s.x += (float) this.f106952d;
        if (mo77352f() && this.f106956h != null) {
            new RectF(this.f106954f.getHelpBoxRect());
            AbstractC45894a aVar = this.f106956h;
            float f = this.f106967s.x;
            float f2 = this.f106967s.y;
            aVar.mo77261a(this, false);
        }
        if (!this.f106970v) {
            this.f106970v = this.f106954f.f106909a;
        }
        m88642a(false);
        return true;
    }

    /* renamed from: a */
    private boolean m88643a(float f, float f2) {
        m88644b(f, f2);
        return this.f106954f.mo77298c(this.f106967s.x, this.f106967s.y);
    }

    /* renamed from: b */
    private void m88644b(float f, float f2) {
        this.f106967s.set(f, f2);
        this.f106967s.offset((float) (-this.f106952d), (float) (-this.f106953e));
    }

    public C45922g(Context context, AttributeSet attributeSet) {
        super(context, null);
        MethodCollector.m26663i(10833);
        this.f106950b = 1.0f;
        this.f106967s = new PointF();
        this.f106968t = new PointF();
        this.f106969u = new RunnableC45924h(this);
        this.f106971w = -1;
        this.f106972x = false;
        this.f106960l = false;
        this.f106961m = 100.0f;
        this.f106962n = 0.01f;
        this.f106973y = false;
        this.f106963o = 0;
        this.f106974z = 0;
        this.f106944A = false;
        this.f106945B = false;
        this.f106946C = false;
        this.f106948E = C45856a.f106824a;
        this.f106964p = mo77336a();
        MethodCollector.m26664o(10833);
    }

    /* renamed from: a */
    public final void mo77339a(float f, Boolean bool) {
        if (this.f106956h != null) {
            int i = -1;
            if (bool.booleanValue()) {
                i = this.f106956h.mo77257a(false, true, mo77372o(), false);
            }
            if (this.f106960l && !this.f106956h.mo77264b(f)) {
                return;
            }
            if (4 == i) {
                f = this.f106956h.mo77259a(f).floatValue();
            }
        }
        float f2 = this.f106951c - f;
        this.f106951c = f2;
        this.f106955g.setRotation(f2);
        this.f106954f.mo77293a(this.f106950b, this.f106951c);
    }

    /* renamed from: a */
    public void mo77340a(int i, int i2) {
        this.f106952d = i;
        this.f106953e = i2;
    }

    /* renamed from: a */
    public void mo77338a(float f, float f2, Boolean bool) {
        int a;
        if (!(this.f106956h == null || !bool.booleanValue() || -1 == (a = this.f106956h.mo77257a(false, false, mo77372o(), mo77376p())))) {
            PointF a2 = this.f106956h.mo77258a(f, f2);
            if (3 == a) {
                f = a2.x;
                f2 = a2.y;
            }
        }
        float x = this.f106955g.getX() + f;
        float y = this.f106955g.getY() + f2;
        AbstractC45894a aVar = this.f106956h;
        if (aVar == null || !this.f106960l || aVar.mo77265b(f, f2)) {
            this.f106955g.setX(x);
            this.f106955g.setY(y);
            this.f106954f.mo77297b(f, f2);
        }
    }

    public C45922g(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        MethodCollector.m26663i(10975);
        this.f106950b = 1.0f;
        this.f106967s = new PointF();
        this.f106968t = new PointF();
        this.f106969u = new RunnableC45925i(this);
        this.f106971w = -1;
        this.f106972x = false;
        this.f106960l = false;
        this.f106961m = 100.0f;
        this.f106962n = 0.01f;
        this.f106973y = false;
        this.f106963o = 0;
        this.f106974z = 0;
        this.f106944A = false;
        this.f106945B = false;
        this.f106946C = false;
        this.f106948E = C45856a.f106824a;
        this.f106964p = mo77336a();
        MethodCollector.m26664o(10975);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(11113);
        super.onLayout(z, i, i2, i3, i4);
        if (this.f106973y != z) {
            this.f106973y = z;
            mo77345b();
        }
        MethodCollector.m26664o(11113);
    }
}
