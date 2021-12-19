package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.p1481d.C20744c;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68090d;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80339de;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout */
public class LighteningRecordLayout extends FrameLayout implements View.OnTouchListener {

    /* renamed from: A */
    protected ScaleGestureDetector f166789A;

    /* renamed from: B */
    protected VideoRecordGestureLayout.AbstractC14312a f166790B;

    /* renamed from: C */
    protected AbstractC74254c f166791C;

    /* renamed from: D */
    public boolean f166792D;

    /* renamed from: E */
    private boolean f166793E;

    /* renamed from: F */
    private long f166794F;

    /* renamed from: G */
    private float f166795G;

    /* renamed from: H */
    private float f166796H;

    /* renamed from: I */
    private int f166797I;

    /* renamed from: J */
    private int f166798J;

    /* renamed from: K */
    private int f166799K;

    /* renamed from: L */
    private int f166800L;

    /* renamed from: M */
    private int f166801M;

    /* renamed from: N */
    private int f166802N;

    /* renamed from: O */
    private int f166803O;

    /* renamed from: P */
    private int f166804P;

    /* renamed from: Q */
    private int f166805Q;

    /* renamed from: R */
    private int f166806R;

    /* renamed from: S */
    private int f166807S;

    /* renamed from: T */
    private int f166808T;

    /* renamed from: U */
    private int f166809U;

    /* renamed from: V */
    private int f166810V;

    /* renamed from: W */
    private int f166811W;

    /* renamed from: a */
    public boolean f166812a;

    /* renamed from: aa */
    private int f166813aa;

    /* renamed from: ab */
    private int f166814ab;

    /* renamed from: ac */
    private int f166815ac;

    /* renamed from: ad */
    private long f166816ad;

    /* renamed from: ae */
    private int f166817ae;

    /* renamed from: af */
    private final int f166818af;

    /* renamed from: ag */
    private long f166819ag;

    /* renamed from: ah */
    private long f166820ah;

    /* renamed from: ai */
    private int[] f166821ai;

    /* renamed from: aj */
    private C74291l f166822aj;

    /* renamed from: ak */
    private Activity f166823ak;

    /* renamed from: al */
    private boolean f166824al;

    /* renamed from: am */
    private ArgbEvaluator f166825am;

    /* renamed from: an */
    private DashPathEffect f166826an;

    /* renamed from: ao */
    private final boolean f166827ao;

    /* renamed from: ap */
    private AbstractC74253b f166828ap;

    /* renamed from: aq */
    private View.OnClickListener f166829aq;

    /* renamed from: b */
    protected float f166830b;

    /* renamed from: c */
    protected float f166831c;

    /* renamed from: d */
    protected float f166832d;

    /* renamed from: e */
    protected int f166833e;

    /* renamed from: f */
    protected int f166834f;

    /* renamed from: g */
    protected int f166835g;

    /* renamed from: h */
    protected int f166836h;

    /* renamed from: i */
    protected Paint f166837i;

    /* renamed from: j */
    protected Paint f166838j;

    /* renamed from: k */
    protected Paint f166839k;

    /* renamed from: l */
    protected Paint f166840l;

    /* renamed from: m */
    protected float f166841m;

    /* renamed from: n */
    protected float f166842n;

    /* renamed from: o */
    protected long f166843o;

    /* renamed from: p */
    protected final RectF f166844p;

    /* renamed from: q */
    public boolean f166845q;

    /* renamed from: r */
    protected boolean f166846r;

    /* renamed from: s */
    protected boolean f166847s;

    /* renamed from: t */
    protected long f166848t;

    /* renamed from: u */
    protected boolean f166849u;

    /* renamed from: v */
    protected boolean f166850v;

    /* renamed from: w */
    protected boolean f166851w;

    /* renamed from: x */
    public EnumC74252a f166852x;

    /* renamed from: y */
    public ImageView f166853y;

    /* renamed from: z */
    public FrameLayout f166854z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$b */
    public interface AbstractC74253b {
        static {
            Covode.recordClassIndex(87017);
        }

        /* renamed from: a */
        void mo116778a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$c */
    public interface AbstractC74254c {
        static {
            Covode.recordClassIndex(87018);
        }

        /* renamed from: a */
        void mo110226a(float f);

        /* renamed from: a */
        void mo110227a(int i);

        /* renamed from: a */
        void mo110228a(boolean z);

        /* renamed from: a */
        boolean mo110229a();

        /* renamed from: b */
        void mo110230b();

        /* renamed from: c */
        void mo110231c();

        /* renamed from: d */
        void mo110232d();

        /* renamed from: e */
        boolean mo110233e();
    }

    static {
        Covode.recordClassIndex(87009);
    }

    /* renamed from: a */
    private static double m130525a(double d) {
        double d2 = 1.0d - d;
        double d3 = d * d;
        double d4 = d2 * d2;
        return (d4 * d2 * 0.0d) + (d4 * 3.0d * d * 0.0d) + (d2 * 3.0d * d3 * 1.0d) + (d3 * d * 1.0d);
    }

    public int getCurrentScaleMode() {
        return this.f166835g;
    }

    public int getMode() {
        return this.f166834f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$d */
    class C74255d implements AbstractC74254c {

        /* renamed from: b */
        private final AbstractC74254c f166863b;

        static {
            Covode.recordClassIndex(87019);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: c */
        public final void mo110231c() {
            this.f166863b.mo110231c();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: d */
        public final void mo110232d() {
            this.f166863b.mo110232d();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: e */
        public final boolean mo110233e() {
            return this.f166863b.mo110233e();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: a */
        public final boolean mo110229a() {
            return this.f166863b.mo110229a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: b */
        public final void mo110230b() {
            C73991bj.m130133d("RecordLayout onRecordStart isRecording: " + LighteningRecordLayout.this.f166792D);
            if (!LighteningRecordLayout.this.f166792D) {
                this.f166863b.mo110230b();
                LighteningRecordLayout.this.f166792D = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: a */
        public final void mo110226a(float f) {
            this.f166863b.mo110226a(f);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: a */
        public final void mo110227a(int i) {
            this.f166863b.mo110227a(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
        /* renamed from: a */
        public final void mo110228a(boolean z) {
            C73991bj.m130133d("RecordLayout onRecordEnd isRecording: " + LighteningRecordLayout.this.f166792D);
            if (LighteningRecordLayout.this.f166792D) {
                this.f166863b.mo110228a(z);
                LighteningRecordLayout.this.f166792D = false;
            }
        }

        public C74255d(AbstractC74254c cVar) {
            this.f166863b = cVar;
        }
    }

    /* renamed from: q */
    private void m130543q() {
        int i = this.f166817ae;
        if (i != -1) {
            this.f166834f = i;
            this.f166817ae = -1;
            invalidate();
        }
    }

    /* renamed from: g */
    public final void mo116756g() {
        mo116748a(10);
        invalidate();
    }

    private boolean getShouldDrawBorderInner() {
        int i;
        if (!this.f166793E || (i = this.f166833e) == 3 || i == 2 || i == 4) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m130534h() {
        if (this.f166854z == null) {
            return;
        }
        if (this.f166852x == EnumC74252a.PLAN_B || this.f166852x == EnumC74252a.PLAN_C) {
            this.f166854z.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m130535i() {
        if (this.f166854z == null) {
            return;
        }
        if (this.f166852x == EnumC74252a.PLAN_B || this.f166852x == EnumC74252a.PLAN_C) {
            this.f166854z.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m130537k() {
        if (this.f166853y != null && this.f166852x == EnumC74252a.PLAN_C) {
            this.f166853y.setVisibility(0);
        }
    }

    /* renamed from: m */
    private void m130539m() {
        if (this.f166853y != null && this.f166852x == EnumC74252a.PLAN_C) {
            this.f166853y.setVisibility(8);
        }
    }

    /* renamed from: p */
    private int m130542p() {
        int i;
        if (this.f166850v) {
            i = this.f166798J;
        } else {
            i = this.f166800L;
        }
        int i2 = ((SystemClock.uptimeMillis() - this.f166843o) > 350 ? 1 : ((SystemClock.uptimeMillis() - this.f166843o) == 350 ? 0 : -1));
        return i;
    }

    /* renamed from: r */
    private boolean m130544r() {
        if (System.currentTimeMillis() - this.f166819ag < 300) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo116750b() {
        super.setOnClickListener(this.f166829aq);
        this.f166817ae = this.f166834f;
        this.f166834f = 1;
    }

    /* renamed from: f */
    public final void mo116755f() {
        int i = this.f166833e;
        if (i == 10 || i == 9 || i == 3) {
            mo116748a(12);
            invalidate();
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.f166826an == null) {
            this.f166826an = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.f166826an;
    }

    /* renamed from: l */
    private void m130538l() {
        if (this.f166853y != null && this.f166852x == EnumC74252a.PLAN_C) {
            int i = this.f166834f;
            if (i == 3) {
                this.f166853y.setImageResource(R.drawable.gv);
            } else if (i == 1) {
                this.f166853y.setImageResource(R.drawable.gu);
            }
        }
    }

    /* renamed from: n */
    private void m130540n() {
        Paint paint = this.f166837i;
        if (paint != null && this.f166838j != null && this.f166840l != null && this.f166839k != null) {
            paint.setColor(this.f166800L);
            this.f166838j.setColor(this.f166801M);
            this.f166840l.setColor(this.f166803O);
            this.f166839k.setColor(this.f166802N);
        }
    }

    /* renamed from: o */
    private void m130541o() {
        Paint paint = this.f166837i;
        if (paint != null && this.f166838j != null) {
            paint.setColor(C0643b.m2378c(getContext(), R.color.bh));
            this.f166838j.setColor(C0643b.m2378c(getContext(), R.color.oa));
        }
    }

    /* renamed from: c */
    public final void mo116751c() {
        int i = this.f166833e;
        if (i == 1 || i == 4 || i == 12) {
            mo116748a(2);
            invalidate();
        } else if (i == 10 || i == 9) {
            mo116748a(11);
            invalidate();
        } else if (i == 3 || i == 2) {
            mo116748a(4);
        }
    }

    /* renamed from: d */
    public final void mo116752d() {
        m130543q();
        int i = this.f166833e;
        if (i == 3 || i == 2 || i == 11 || i == 13 || i == 14) {
            if (this.f166794F <= 0 || i == 13 || i == 14) {
                mo116748a(4);
            } else {
                mo116748a(9);
            }
            this.f166792D = false;
            if (this.f166827ao) {
                invalidate();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$4 */
    static /* synthetic */ class C742514 {

        /* renamed from: a */
        static final /* synthetic */ int[] f166860a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 87015(0x153e7, float:1.21934E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a[] r0 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.EnumC74252a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742514.f166860a = r2
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.EnumC74252a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742514.f166860a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.EnumC74252a.PLAN_A     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742514.f166860a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.EnumC74252a.PLAN_B     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742514.f166860a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.EnumC74252a.PLAN_C     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742514.f166860a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.EnumC74252a.PLAN_LIGHTENING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742514.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout$a */
    public enum EnumC74252a {
        DEFAULT,
        PLAN_A,
        PLAN_B,
        PLAN_C,
        PLAN_LIGHTENING;

        static {
            Covode.recordClassIndex(87016);
        }
    }

    /* renamed from: j */
    private void m130536j() {
        if (this.f166854z == null) {
            return;
        }
        if (this.f166852x == EnumC74252a.PLAN_B) {
            int i = this.f166834f;
            if (i == 3) {
                this.f166854z.setBackground(C84916a.m145946a(this.f166801M, 0, (int) C20744c.m39047a(getContext(), 8.0f)));
            } else if (i == 1) {
                this.f166854z.setBackground(C84916a.m145946a(0, this.f166798J, 0));
            }
        } else if (this.f166852x == EnumC74252a.PLAN_C) {
            int i2 = this.f166834f;
            if (i2 == 3) {
                this.f166854z.setBackground(C84916a.m145946a(0, this.f166800L, 0));
            } else if (i2 == 1) {
                this.f166854z.setBackground(C84916a.m145946a(0, this.f166798J, 0));
            }
        }
    }

    /* renamed from: a */
    public final void mo116747a() {
        Paint paint = this.f166837i;
        if (paint != null && this.f166838j != null) {
            paint.setColor(this.f166798J);
            this.f166838j.setColor(this.f166799K);
        }
    }

    /* renamed from: e */
    public final void mo116754e() {
        m130543q();
        setHasBeenMoveScaled(false);
        this.f166791C.mo110232d();
        int i = this.f166833e;
        if (i == 3 || i == 2 || i == 11 || i == 13 || i == 14) {
            if (this.f166794F <= 0 || i == 13 || i == 14) {
                mo116748a(4);
            } else {
                mo116748a(9);
            }
        }
        this.f166791C.mo110228a(true);
        this.f166848t = System.currentTimeMillis();
        invalidate();
    }

    public void setActivity(Activity activity) {
        this.f166823ak = activity;
    }

    public void setCurrentScaleMode(int i) {
        this.f166835g = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setOnGestureListener(VideoRecordGestureLayout.AbstractC14312a aVar) {
        this.f166790B = aVar;
    }

    public void setRecordLayoutUIChangedListener(AbstractC74253b bVar) {
        this.f166828ap = bVar;
    }

    public void setRecordingTime(long j) {
        this.f166794F = j;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.f166789A = scaleGestureDetector;
    }

    public void setCanTouch(Boolean bool) {
        this.f166824al = bool.booleanValue();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private int m130530b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return this.f166818af;
    }

    /* renamed from: c */
    private void m130533c(int i) {
        this.f166836h = i;
        this.f166816ad = SystemClock.uptimeMillis();
    }

    public void setColorSchemeBackground(FrameLayout frameLayout) {
        this.f166854z = frameLayout;
        m130536j();
        m130534h();
    }

    public void setColorSchemeIcon(ImageView imageView) {
        this.f166853y = imageView;
        m130538l();
        m130537k();
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.f166845q = z;
        this.f166819ag = System.currentTimeMillis();
    }

    public void setRecordListener(AbstractC74254c cVar) {
        if (cVar != null) {
            this.f166791C = new C74255d(cVar);
        } else {
            this.f166791C = null;
        }
    }

    public void setShouldDrawBorder(boolean z) {
        boolean z2 = this.f166793E;
        this.f166793E = z;
        if (z2 != z) {
            invalidate();
        }
    }

    /* renamed from: a */
    private int m130529a(long j) {
        int i;
        if (this.f166850v) {
            i = this.f166799K;
        } else {
            i = this.f166801M;
        }
        int i2 = ((SystemClock.uptimeMillis() - j) > 350 ? 1 : ((SystemClock.uptimeMillis() - j) == 350 ? 0 : -1));
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo116748a(int i) {
        this.f166833e = i;
        this.f166843o = SystemClock.uptimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r8 == 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        if (r13.f166836h == 0) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 660
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
        // Method dump skipped, instructions count: 1450
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public LighteningRecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(8204);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(m130530b(i), 1073741824), View.MeasureSpec.makeMeasureSpec(m130530b(i2), 1073741824));
        MethodCollector.m26664o(8204);
    }

    /* renamed from: b */
    private int m130531b(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.f166809U - this.f166810V;
        float f = ((float) (uptimeMillis - j)) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8) {
            return i2;
        }
        if (i == 2) {
            return m130526a(i2, 0, f);
        }
        if (i == 12) {
            return m130526a(0, i2, f);
        }
        if (i == 4) {
            return m130526a(0, i2, f);
        }
        return 0;
    }

    /* renamed from: c */
    private int m130532c(int i, long j) {
        float uptimeMillis = (((float) (SystemClock.uptimeMillis() - j)) * 1.0f) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8 || i == 10 || i == 12) {
            return this.f166814ab;
        }
        if (i == 2 || i == 11) {
            return m130526a(this.f166814ab, this.f166815ac, uptimeMillis);
        }
        if (i == 3) {
            return this.f166815ac;
        }
        if (i == 4 || i == 9) {
            return m130526a(this.f166815ac, this.f166814ab, uptimeMillis);
        }
        return 0;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f166824al || this.f166790B == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            this.f166790B.mo23041a(motionEvent, this.f166821ai);
        } else if (action == 5) {
            this.f166790B.mo23063d(motionEvent, this.f166821ai);
            this.f166790B.mo23052b(motionEvent, this.f166821ai);
        } else if (action == 6) {
            this.f166790B.mo23066e(motionEvent, this.f166821ai);
            this.f166790B.mo23060c(motionEvent, this.f166821ai);
        }
        return false;
    }

    /* renamed from: a */
    private int m130528a(int i, long j) {
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - j)) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8) {
            int i2 = this.f166809U;
            this.f166828ap.mo116778a((float) i2);
            return i2;
        } else if (i == 2) {
            int a = m130526a(this.f166809U, this.f166807S, uptimeMillis);
            this.f166828ap.mo116778a((float) a);
            return a;
        } else if (i == 3) {
            int i3 = this.f166807S;
            this.f166828ap.mo116778a((float) i3);
            return i3;
        } else if (i == 9) {
            int a2 = m130526a(this.f166807S, this.f166808T, uptimeMillis);
            this.f166828ap.mo116778a((float) a2);
            return a2;
        } else if (i == 10) {
            int i4 = this.f166808T;
            this.f166828ap.mo116778a((float) i4);
            return i4;
        } else if (i == 11) {
            int a3 = m130526a(this.f166808T, this.f166807S, uptimeMillis);
            this.f166828ap.mo116778a((float) a3);
            return a3;
        } else if (i == 12) {
            int a4 = m130526a(this.f166808T, this.f166809U, uptimeMillis);
            this.f166828ap.mo116778a((float) a4);
            return a4;
        } else if (i != 4) {
            return 0;
        } else {
            int a5 = m130526a(this.f166807S, this.f166808T, uptimeMillis);
            this.f166828ap.mo116778a((float) a5);
            return a5;
        }
    }

    /* renamed from: a */
    public final void mo116749a(int i, boolean z) {
        this.f166849u = this.f166850v;
        int i2 = this.f166834f;
        this.f166797I = i2;
        this.f166834f = i;
        this.f166850v = z;
        this.f166851w = true;
        if (!this.f166846r) {
            invalidate();
            super.setOnClickListener(this.f166829aq);
            this.f166846r = !this.f166846r;
        } else if (i != i2) {
            m130538l();
            m130537k();
            m130536j();
            m130534h();
            if (i == 1) {
                mo116747a();
                super.setOnClickListener(this.f166829aq);
                mo116748a(6);
            } else if (i == 0) {
                this.f166837i.setColor(this.f166800L);
                this.f166838j.setColor(this.f166801M);
                super.setOnClickListener(null);
                mo116748a(8);
            } else if (i == 3) {
                m130540n();
                super.setOnClickListener(this.f166829aq);
                mo116748a(7);
            }
            invalidate();
        }
    }

    /* renamed from: a */
    private static int m130526a(int i, int i2, float f) {
        double d = (double) (i2 - i);
        double a = m130525a((double) f);
        Double.isNaN(d);
        return i + ((int) (d * a));
    }

    private LighteningRecordLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        boolean z;
        MethodCollector.m26663i(8066);
        this.f166812a = true;
        this.f166793E = true;
        this.f166834f = 3;
        this.f166797I = -1;
        this.f166817ae = -1;
        this.f166818af = (int) C13628n.m24520b(getContext(), 100.0f);
        this.f166844p = new RectF();
        this.f166819ag = 0;
        this.f166846r = false;
        this.f166847s = false;
        this.f166821ai = new int[]{0, 0};
        this.f166824al = true;
        this.f166851w = true;
        this.f166825am = new ArgbEvaluator();
        this.f166852x = EnumC74252a.DEFAULT;
        if (C68090d.m120392a() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f166827ao = z;
        this.f166828ap = new AbstractC74253b() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742461 */

            static {
                Covode.recordClassIndex(87010);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74253b
            /* renamed from: a */
            public final void mo116778a(float f) {
            }
        };
        this.f166791C = new AbstractC74254c() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.C742472 */

            static {
                Covode.recordClassIndex(87011);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final void mo110226a(float f) {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final void mo110227a(int i) {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final void mo110228a(boolean z) {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final boolean mo110229a() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: b */
            public final void mo110230b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: c */
            public final void mo110231c() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: d */
            public final void mo110232d() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: e */
            public final boolean mo110233e() {
                return false;
            }
        };
        this.f166829aq = new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.View$OnClickListenerC742483 */

            static {
                Covode.recordClassIndex(87012);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (LighteningRecordLayout.this.f166833e == 1) {
                    if (!new C80339de().mo123710a(view) || LighteningRecordLayout.this.f166791C.mo110229a()) {
                        return;
                    }
                    if (LighteningRecordLayout.this.f166850v) {
                        if (LighteningRecordLayout.this.f166854z != null && (LighteningRecordLayout.this.f166852x == EnumC74252a.PLAN_B || LighteningRecordLayout.this.f166852x == EnumC74252a.PLAN_C)) {
                            LighteningRecordLayout.this.f166854z.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                                /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.View$OnClickListenerC742483.RunnableC742491 */

                                static {
                                    Covode.recordClassIndex(87013);
                                }

                                public final void run() {
                                    LighteningRecordLayout.this.f166854z.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                }
                            }).start();
                        }
                        if (LighteningRecordLayout.this.f166853y != null && LighteningRecordLayout.this.f166852x == EnumC74252a.PLAN_C) {
                            LighteningRecordLayout.this.f166853y.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                                /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.View$OnClickListenerC742483.RunnableC742502 */

                                static {
                                    Covode.recordClassIndex(87014);
                                }

                                public final void run() {
                                    LighteningRecordLayout.this.f166853y.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                }
                            }).start();
                        }
                        LighteningRecordLayout.this.mo116748a(13);
                        LighteningRecordLayout.this.invalidate();
                        LighteningRecordLayout.this.f166791C.mo110231c();
                        return;
                    }
                    LighteningRecordLayout.this.mo116748a(2);
                    LighteningRecordLayout.this.invalidate();
                    LighteningRecordLayout.this.f166791C.mo110230b();
                } else if ((LighteningRecordLayout.this.f166833e == 3 || LighteningRecordLayout.this.f166833e == 2) && LighteningRecordLayout.this.f166851w) {
                    LighteningRecordLayout.this.mo116748a(9);
                    LighteningRecordLayout.this.f166791C.mo110228a(false);
                }
            }
        };
        this.f166804P = (int) C13628n.m24520b(context, 55.0f);
        this.f166805Q = (int) C13628n.m24520b(context, 40.0f);
        this.f166806R = (int) C13628n.m24520b(context, 40.0f);
        this.f166807S = (int) C13628n.m24520b(context, 58.0f);
        this.f166808T = (int) C13628n.m24520b(context, 48.0f);
        this.f166809U = (int) C13628n.m24520b(context, 40.0f);
        this.f166810V = (int) C13628n.m24520b(context, 6.0f);
        this.f166811W = (int) C13628n.m24520b(context, 8.0f);
        this.f166813aa = (int) C13628n.m24520b(context, 18.0f);
        this.f166814ab = (int) C13628n.m24520b(context, 32.0f);
        this.f166815ac = (int) C13628n.m24520b(context, 18.0f);
        if (context instanceof ActivityC0945e) {
            this.f166822aj = new C74291l((ActivityC0945e) context);
        }
        this.f166833e = 1;
        Paint paint = new Paint();
        this.f166837i = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f166837i.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f166838j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f166838j.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f166839k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f166839k.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f166840l = paint4;
        paint4.setStyle(Paint.Style.FILL);
        this.f166840l.setAntiAlias(true);
        this.f166852x = EnumC74252a.PLAN_LIGHTENING;
        int i = C742514.f166860a[this.f166852x.ordinal()];
        if (i == 1) {
            this.f166800L = C0643b.m2378c(getContext(), R.color.bh);
            this.f166801M = C0643b.m2378c(getContext(), R.color.oa);
            this.f166798J = C0643b.m2378c(getContext(), R.color.l);
            this.f166799K = C0643b.m2378c(getContext(), R.color.rd);
            this.f166803O = C0643b.m2378c(getContext(), R.color.l);
            this.f166802N = C0643b.m2378c(getContext(), R.color.nr);
        } else if (i == 2) {
            this.f166800L = C0643b.m2378c(getContext(), R.color.bh);
            this.f166801M = C0643b.m2378c(getContext(), R.color.l);
            this.f166798J = C0643b.m2378c(getContext(), R.color.l);
            this.f166799K = C0643b.m2378c(getContext(), R.color.l);
            this.f166803O = C0643b.m2378c(getContext(), R.color.l);
            this.f166802N = C0643b.m2378c(getContext(), R.color.nr);
        } else if (i == 3) {
            this.f166800L = 0;
            this.f166801M = C0643b.m2378c(getContext(), R.color.l);
            this.f166798J = C0643b.m2378c(getContext(), R.color.l);
            this.f166799K = C0643b.m2378c(getContext(), R.color.l);
            this.f166803O = C0643b.m2378c(getContext(), R.color.l);
            this.f166802N = C0643b.m2378c(getContext(), R.color.nr);
        } else if (i == 4) {
            this.f166800L = C0643b.m2378c(getContext(), R.color.bh);
            this.f166801M = C0643b.m2378c(getContext(), R.color.bh);
            this.f166798J = C0643b.m2378c(getContext(), R.color.bh);
            this.f166799K = C0643b.m2378c(getContext(), R.color.bh);
            this.f166803O = C0643b.m2378c(getContext(), R.color.l);
            this.f166802N = C0643b.m2378c(getContext(), R.color.nr);
        } else if (i == 5) {
            this.f166800L = C0643b.m2378c(getContext(), R.color.bh);
            this.f166801M = C0643b.m2378c(getContext(), R.color.oa);
            this.f166798J = C0643b.m2378c(getContext(), R.color.l);
            this.f166799K = C0643b.m2378c(getContext(), R.color.l);
            this.f166803O = C0643b.m2378c(getContext(), R.color.l);
            this.f166802N = C0643b.m2378c(getContext(), R.color.nr);
        }
        m130540n();
        setOnTouchListener(this);
        MethodCollector.m26664o(8066);
    }

    /* renamed from: a */
    private int m130527a(int i, int i2, long j, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = (((float) (uptimeMillis - j)) * 1.0f) / 350.0f;
        float f2 = (((float) (uptimeMillis - j2)) * 1.0f) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8) {
            return this.f166814ab;
        }
        if (i == 2) {
            return m130526a(this.f166814ab, this.f166811W, f);
        }
        if (i == 3) {
            if (i2 == 0) {
                return this.f166811W;
            }
            if (i2 == 2) {
                return m130526a(this.f166811W, this.f166813aa, f2);
            }
            if (i2 == 1) {
                return this.f166813aa;
            }
        }
        if (i == 9 || i == 4) {
            if (i2 == 0) {
                return m130526a(this.f166811W, this.f166814ab, f);
            }
            if (i2 == 2) {
                return 0;
            }
            if (i2 == 1) {
                return m130526a(this.f166813aa, this.f166814ab, f);
            }
        }
        if (i == 10) {
            return this.f166814ab;
        }
        if (i == 11) {
            return m130526a(this.f166814ab, this.f166811W, f);
        }
        if (i == 12) {
            return this.f166814ab;
        }
        return 0;
    }
}
