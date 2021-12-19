package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68090d;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80339de;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout */
public class RecordLayout extends FrameLayout implements View.OnTouchListener {

    /* renamed from: A */
    private float f166896A;

    /* renamed from: B */
    private int f166897B;

    /* renamed from: C */
    private int f166898C;

    /* renamed from: D */
    private int f166899D;

    /* renamed from: E */
    private int f166900E;

    /* renamed from: F */
    private int f166901F;

    /* renamed from: G */
    private int f166902G;

    /* renamed from: H */
    private int f166903H;

    /* renamed from: I */
    private int f166904I;

    /* renamed from: J */
    private long f166905J;

    /* renamed from: K */
    private int f166906K;

    /* renamed from: L */
    private final int f166907L;

    /* renamed from: M */
    private long f166908M;

    /* renamed from: N */
    private long f166909N;

    /* renamed from: O */
    private final int[] f166910O;

    /* renamed from: P */
    private C74291l f166911P;

    /* renamed from: Q */
    private Activity f166912Q;

    /* renamed from: R */
    private boolean f166913R;

    /* renamed from: S */
    private final ArgbEvaluator f166914S;

    /* renamed from: T */
    private DashPathEffect f166915T;

    /* renamed from: U */
    private final boolean f166916U;

    /* renamed from: V */
    private final boolean f166917V;

    /* renamed from: W */
    private final View.OnClickListener f166918W;

    /* renamed from: a */
    public boolean f166919a;

    /* renamed from: b */
    protected float f166920b;

    /* renamed from: c */
    protected float f166921c;

    /* renamed from: d */
    protected int f166922d;

    /* renamed from: e */
    protected int f166923e;

    /* renamed from: f */
    protected int f166924f;

    /* renamed from: g */
    protected int f166925g;

    /* renamed from: h */
    protected Paint f166926h;

    /* renamed from: i */
    protected Paint f166927i;

    /* renamed from: j */
    protected float f166928j;

    /* renamed from: k */
    protected float f166929k;

    /* renamed from: l */
    protected long f166930l;

    /* renamed from: m */
    protected final RectF f166931m;

    /* renamed from: n */
    public boolean f166932n;

    /* renamed from: o */
    protected boolean f166933o;

    /* renamed from: p */
    protected boolean f166934p;

    /* renamed from: q */
    protected long f166935q;

    /* renamed from: r */
    protected boolean f166936r;

    /* renamed from: s */
    protected boolean f166937s;

    /* renamed from: t */
    protected boolean f166938t;

    /* renamed from: u */
    protected boolean f166939u;

    /* renamed from: v */
    protected ScaleGestureDetector f166940v;

    /* renamed from: w */
    protected VideoRecordGestureLayout.AbstractC14312a f166941w;

    /* renamed from: x */
    protected AbstractC74257a f166942x;

    /* renamed from: y */
    public boolean f166943y;

    /* renamed from: z */
    private float f166944z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a */
    public interface AbstractC74257a {
        static {
            Covode.recordClassIndex(87023);
        }

        /* renamed from: a */
        void mo111425a();

        /* renamed from: a */
        void mo111426a(float f);

        /* renamed from: a */
        void mo111427a(int i);

        /* renamed from: b */
        boolean mo111428b();

        /* renamed from: c */
        void mo111429c();

        /* renamed from: d */
        void mo111430d();

        /* renamed from: e */
        void mo111431e();

        /* renamed from: f */
        void mo111432f();

        /* renamed from: g */
        boolean mo111433g();

        /* renamed from: h */
        void mo111434h();
    }

    static {
        Covode.recordClassIndex(87021);
    }

    /* renamed from: a */
    private static double m130594a(double d) {
        double d2 = 1.0d - d;
        double d3 = d * d;
        double d4 = d2 * d2;
        return (d4 * d2 * 0.0d) + (d4 * 3.0d * d * 0.0d) + (d2 * 3.0d * d3 * 1.0d) + (d3 * d * 1.0d);
    }

    public int getCurrentScaleMode() {
        return this.f166924f;
    }

    public int getMode() {
        return this.f166923e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b */
    public class C74258b implements AbstractC74257a {

        /* renamed from: b */
        private final AbstractC74257a f166947b;

        static {
            Covode.recordClassIndex(87024);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: a */
        public final void mo111425a() {
            this.f166947b.mo111425a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: b */
        public final boolean mo111428b() {
            return this.f166947b.mo111428b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: e */
        public final void mo111431e() {
            this.f166947b.mo111431e();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: f */
        public final void mo111432f() {
            this.f166947b.mo111432f();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: g */
        public final boolean mo111433g() {
            return this.f166947b.mo111433g();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: h */
        public final void mo111434h() {
            this.f166947b.mo111434h();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: c */
        public final void mo111429c() {
            C73991bj.m130133d("RecordLayout onRecordStart isRecording: " + RecordLayout.this.f166943y);
            if (!RecordLayout.this.f166943y) {
                this.f166947b.mo111429c();
                RecordLayout.this.f166943y = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: d */
        public final void mo111430d() {
            C73991bj.m130133d("RecordLayout onRecordEnd isRecording: " + RecordLayout.this.f166943y);
            if (RecordLayout.this.f166943y) {
                this.f166947b.mo111430d();
                RecordLayout.this.f166943y = false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: a */
        public final void mo111426a(float f) {
            this.f166947b.mo111426a(f);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: a */
        public final void mo111427a(int i) {
            this.f166947b.mo111427a(i);
        }

        public C74258b(AbstractC74257a aVar) {
            this.f166947b = aVar;
        }
    }

    /* renamed from: g */
    private void m130609g() {
        int i = this.f166906K;
        if (i != -1) {
            this.f166923e = i;
            this.f166906K = -1;
            invalidate();
        }
    }

    public long getActionDownTime() {
        Activity activity = this.f166912Q;
        if (activity instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) activity).f164791E;
        }
        return this.f166909N;
    }

    /* renamed from: e */
    private void m130607e() {
        Paint paint = this.f166926h;
        if (paint != null && this.f166927i != null) {
            paint.setColor(this.f166899D);
            this.f166927i.setColor(this.f166900E);
        }
    }

    /* renamed from: h */
    private boolean m130610h() {
        if (System.currentTimeMillis() - this.f166908M < 300) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo116799b() {
        int i = this.f166922d;
        if (i == 1) {
            mo116800b(2);
            invalidate();
        } else if (i == 3 || i == 2) {
            mo116800b(4);
        }
    }

    /* renamed from: c */
    public final void mo116801c() {
        m130609g();
        int i = this.f166922d;
        if (i == 3 || i == 2) {
            mo116800b(4);
            this.f166943y = false;
            if (this.f166917V || this.f166916U) {
                invalidate();
            }
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.f166915T == null) {
            this.f166915T = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.f166915T;
    }

    /* renamed from: f */
    private void m130608f() {
        Paint paint = this.f166926h;
        if (paint != null && this.f166927i != null) {
            paint.setColor(C0643b.m2378c(getContext(), R.color.bh));
            this.f166927i.setColor(C0643b.m2378c(getContext(), R.color.oa));
        }
    }

    /* renamed from: d */
    public final void mo116802d() {
        m130609g();
        setHasBeenMoveScaled(false);
        this.f166942x.mo111432f();
        int i = this.f166922d;
        if (i == 3 || i == 2) {
            mo116800b(4);
        }
        this.f166942x.mo111430d();
        this.f166935q = System.currentTimeMillis();
        invalidate();
    }

    /* renamed from: a */
    public final void mo116796a() {
        Paint paint = this.f166926h;
        if (paint != null && this.f166927i != null) {
            paint.setColor(this.f166897B);
            this.f166927i.setColor(this.f166898C);
        }
    }

    public void setActivity(Activity activity) {
        this.f166912Q = activity;
    }

    public void setCurrentScaleMode(int i) {
        this.f166924f = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setOnGestureListener(VideoRecordGestureLayout.AbstractC14312a aVar) {
        this.f166941w = aVar;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.f166940v = scaleGestureDetector;
    }

    public void setCanTouch(Boolean bool) {
        this.f166913R = bool.booleanValue();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private int m130602c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return this.f166907L;
    }

    /* renamed from: d */
    private void m130606d(int i) {
        this.f166925g = i;
        this.f166905J = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo116800b(int i) {
        this.f166922d = i;
        this.f166930l = SystemClock.uptimeMillis();
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.f166932n = z;
        this.f166908M = System.currentTimeMillis();
    }

    public void setRecordListener(AbstractC74257a aVar) {
        if (aVar != null) {
            this.f166942x = new C74258b(aVar);
        } else {
            this.f166942x = null;
        }
    }

    /* renamed from: a */
    private int m130597a(long j) {
        return (int) (((((float) this.f166903H) * 0.85f) * ((float) Math.min(300L, SystemClock.uptimeMillis() - j))) / 300.0f);
    }

    /* renamed from: b */
    private int m130600b(long j) {
        int i;
        int i2;
        if (this.f166937s) {
            i = this.f166899D;
            i2 = this.f166897B;
        } else {
            if (this.f166936r) {
                i = this.f166897B;
            } else {
                i = this.f166899D;
            }
            i2 = this.f166899D;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f166930l > 300) {
            return i2;
        }
        return ((Integer) this.f166914S.evaluate((((float) (uptimeMillis - j)) * 1.0f) / 300.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    /* renamed from: c */
    private int m130604c(long j) {
        int i;
        int i2;
        if (this.f166937s) {
            i = this.f166900E;
            i2 = this.f166898C;
        } else {
            if (this.f166936r) {
                i = this.f166898C;
            } else {
                i = this.f166900E;
            }
            i2 = this.f166900E;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis > 300) {
            return i2;
        }
        return ((Integer) this.f166914S.evaluate((((float) uptimeMillis) * 1.0f) / 300.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r1 == 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        if (r11.f166930l != 2) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        if (r11.f166925g != 0) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo116797a(int i) {
        super.setOnClickListener(this.f166918W);
        this.f166906K = this.f166923e;
        this.f166923e = 1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0279, code lost:
        if (r19.f166925g == 2) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x034d, code lost:
        if (r12 == 1) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0378, code lost:
        if (r12 == 2) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037a, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r20) {
        /*
        // Method dump skipped, instructions count: 1136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public final void mo116798a(int i, boolean z) {
        m130601b(i, z);
    }

    public RecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9334);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(m130602c(i), 1073741824), View.MeasureSpec.makeMeasureSpec(m130602c(i2), 1073741824));
        MethodCollector.m26664o(9334);
    }

    /* renamed from: d */
    private int m130605d(int i, long j) {
        int i2;
        int i3;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            i2 = this.f166902G;
            i3 = (int) ((((long) (this.f166901F - i2)) * (uptimeMillis - j)) / 300);
        } else if (i == 3) {
            i2 = this.f166902G;
            i3 = this.f166901F - i2;
        } else if (i == 4) {
            i2 = this.f166902G;
            i3 = (int) (((float) (this.f166901F - i2)) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)));
        } else if (i == 1) {
            return this.f166902G;
        } else {
            return 0;
        }
        return i2 + i3;
    }

    /* renamed from: a */
    private int m130596a(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            int i2 = this.f166903H;
            return (int) ((((float) i2) * 0.1f) + (((float) i2) * 0.7f * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        } else if (i == 3) {
            return (int) (((float) this.f166903H) * 0.1f);
        } else {
            if (i == 4) {
                int i3 = this.f166903H;
                return (int) ((((float) i3) * 0.1f) + (((((float) i3) * 0.7f) * ((float) (uptimeMillis - j))) / 300.0f));
            } else if (i == 1) {
                return (int) (((float) this.f166903H) * 0.8f);
            } else {
                return 0;
            }
        }
    }

    /* renamed from: b */
    private int m130599b(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            int i2 = this.f166903H;
            return (int) ((((float) i2) * 0.4f) + (((float) i2) * 0.4f * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        } else if (i == 3) {
            return (int) (((float) this.f166903H) * 0.4f);
        } else {
            if (i == 4) {
                int i3 = this.f166903H;
                return (int) ((((float) i3) * 0.4f) + (((((float) i3) * 0.4f) * ((float) (uptimeMillis - j))) / 300.0f));
            } else if (i == 1) {
                return (int) (((float) this.f166903H) * 0.8f);
            } else {
                return 0;
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f166913R || this.f166941w == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            this.f166941w.mo23041a(motionEvent, this.f166910O);
        } else if (action == 5) {
            this.f166941w.mo23063d(motionEvent, this.f166910O);
            this.f166941w.mo23052b(motionEvent, this.f166910O);
        } else if (action == 6) {
            this.f166941w.mo23066e(motionEvent, this.f166910O);
            this.f166941w.mo23060c(motionEvent, this.f166910O);
        }
        return false;
    }

    /* renamed from: a */
    private void m130598a(Canvas canvas, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float a = (float) m130597a(this.f166930l);
        int i = this.f166902G;
        float f = (float) i;
        float f2 = (((float) i) * 0.8f) + ((1.0f - ((((float) (uptimeMillis - this.f166930l)) * 1.0f) / 300.0f)) * ((float) i) * 0.2f);
        this.f166927i.setStrokeWidth(f - a);
        this.f166927i.setPathEffect(null);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (f + a) / 2.0f, this.f166927i);
        this.f166926h.setStrokeWidth(f2);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), f2 / 2.0f, this.f166926h);
        if (uptimeMillis - this.f166930l > 300) {
            mo116800b(1);
            if (z) {
                this.f166923e = 3;
            } else {
                this.f166923e = 1;
            }
        }
        invalidate();
    }

    /* renamed from: b */
    private void m130601b(int i, boolean z) {
        this.f166936r = this.f166937s;
        int i2 = this.f166923e;
        this.f166923e = i;
        this.f166937s = z;
        this.f166938t = true;
        if (!this.f166933o) {
            invalidate();
            super.setOnClickListener(this.f166918W);
            this.f166933o = !this.f166933o;
        } else if (i != i2) {
            if (i == 1) {
                mo116796a();
                super.setOnClickListener(this.f166918W);
                mo116800b(6);
            } else if (i == 3) {
                m130607e();
                super.setOnClickListener(this.f166918W);
                mo116800b(7);
            }
            invalidate();
        }
    }

    /* renamed from: c */
    private int m130603c(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((long) this.f166903H) * (uptimeMillis - j)) / 300);
        }
        if (i == 3) {
            double d = (double) (uptimeMillis - j);
            Double.isNaN(d);
            double sin = Math.sin((d * 3.141592653589793d) / 700.0d) + 1.0d;
            if (this.f166917V) {
                int i2 = this.f166925g;
                if (i2 != 2) {
                    if (i2 != 1) {
                        double d2 = (double) this.f166903H;
                        double d3 = (double) (this.f166901F - this.f166902G);
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        return (int) (d2 + (sin * d3 * 0.30000001192092896d));
                    }
                } else if (this.f166904I == 0) {
                    double d4 = (double) this.f166903H;
                    double d5 = (double) (this.f166901F - this.f166902G);
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    this.f166904I = (int) (d4 + (sin * d5 * 0.30000001192092896d));
                }
                return this.f166904I;
            }
            double d6 = (double) this.f166903H;
            double d7 = (double) (this.f166901F - this.f166902G);
            Double.isNaN(d7);
            Double.isNaN(d6);
            return (int) (d6 + (sin * d7 * 0.30000001192092896d));
        } else if (i == 4) {
            return (int) (((float) this.f166903H) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)));
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    private static int m130595a(int i, int i2, float f) {
        double d = (double) (i2 - i);
        double a = m130594a((double) f);
        Double.isNaN(d);
        return i + ((int) (d * a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RecordLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        boolean z;
        float f;
        boolean z2 = false;
        MethodCollector.m26663i(9186);
        this.f166919a = true;
        this.f166923e = 3;
        this.f166906K = -1;
        this.f166907L = (int) C13628n.m24520b(getContext(), 100.0f);
        this.f166931m = new RectF();
        this.f166908M = 0;
        this.f166933o = false;
        this.f166934p = false;
        this.f166910O = new int[]{0, 0};
        this.f166913R = true;
        this.f166938t = true;
        this.f166914S = new ArgbEvaluator();
        if (C68090d.m120392a() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f166916U = z;
        z2 = C68109p.m120400a() != 0 ? true : z2;
        this.f166917V = z2;
        this.f166942x = new C74280e();
        this.f166918W = new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.View$OnClickListenerC742561 */

            static {
                Covode.recordClassIndex(87022);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (RecordLayout.this.f166922d == 1) {
                    if (!new C80339de().mo123710a(view) || RecordLayout.this.f166942x.mo111428b()) {
                        return;
                    }
                    if (RecordLayout.this.f166937s) {
                        RecordLayout.this.mo116800b(13);
                        RecordLayout.this.invalidate();
                        RecordLayout.this.f166942x.mo111431e();
                        return;
                    }
                    RecordLayout.this.mo116800b(2);
                    RecordLayout.this.invalidate();
                    RecordLayout.this.f166942x.mo111429c();
                } else if ((RecordLayout.this.f166922d == 3 || RecordLayout.this.f166922d == 2) && RecordLayout.this.f166938t) {
                    RecordLayout.this.mo116800b(4);
                    RecordLayout.this.f166942x.mo111430d();
                }
            }
        };
        if (z2) {
            f = 50.0f;
        } else {
            f = 55.0f;
        }
        this.f166901F = (int) C13628n.m24520b(context, f);
        this.f166902G = (int) C13628n.m24520b(context, 40.0f);
        this.f166903H = (int) C13628n.m24520b(context, 40.0f);
        if (context instanceof ActivityC0945e) {
            this.f166911P = new C74291l((ActivityC0945e) context);
        }
        this.f166922d = 1;
        Paint paint = new Paint();
        this.f166926h = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f166926h.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f166927i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f166927i.setAntiAlias(true);
        this.f166899D = C0643b.m2378c(getContext(), R.color.bh);
        this.f166900E = C0643b.m2378c(getContext(), R.color.oa);
        this.f166897B = C0643b.m2378c(getContext(), R.color.a2j);
        this.f166898C = C0643b.m2378c(getContext(), R.color.a2j);
        m130607e();
        setOnTouchListener(this);
        MethodCollector.m26664o(9186);
    }
}
