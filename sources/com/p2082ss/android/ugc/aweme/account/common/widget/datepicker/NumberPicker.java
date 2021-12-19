package com.p2082ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker */
public class NumberPicker extends View {

    /* renamed from: Q */
    private static final int f75570Q = Color.rgb(0, 150, 136);

    /* renamed from: R */
    private static final int f75571R = Color.rgb(0, 150, 136);

    /* renamed from: S */
    private static final int f75572S = Color.rgb(255, 255, 255);

    /* renamed from: A */
    protected int f75573A;

    /* renamed from: B */
    protected Scroller f75574B;

    /* renamed from: C */
    protected Scroller f75575C;

    /* renamed from: D */
    protected int f75576D;

    /* renamed from: E */
    protected int f75577E;

    /* renamed from: F */
    protected int f75578F;

    /* renamed from: G */
    protected int f75579G;

    /* renamed from: H */
    protected int f75580H;

    /* renamed from: I */
    protected boolean f75581I;

    /* renamed from: J */
    protected AbstractC31602b f75582J;

    /* renamed from: K */
    protected Set<String> f75583K;

    /* renamed from: L */
    protected int f75584L;

    /* renamed from: M */
    protected C31603a f75585M;

    /* renamed from: N */
    protected boolean f75586N;

    /* renamed from: O */
    protected String[] f75587O;

    /* renamed from: P */
    int f75588P;

    /* renamed from: T */
    private int f75589T;

    /* renamed from: U */
    private int f75590U;

    /* renamed from: V */
    private int f75591V;

    /* renamed from: W */
    private int f75592W;

    /* renamed from: a */
    protected int f75593a;

    /* renamed from: aa */
    private VelocityTracker f75594aa;

    /* renamed from: ab */
    private float f75595ab;

    /* renamed from: ac */
    private boolean f75596ac;

    /* renamed from: b */
    protected int f75597b;

    /* renamed from: c */
    protected TextPaint f75598c;

    /* renamed from: d */
    protected TextPaint f75599d;

    /* renamed from: e */
    protected TextPaint f75600e;

    /* renamed from: f */
    protected Paint f75601f;

    /* renamed from: g */
    protected Rect f75602g;

    /* renamed from: h */
    protected C31601a[] f75603h;

    /* renamed from: i */
    protected int f75604i;

    /* renamed from: j */
    protected int f75605j;

    /* renamed from: k */
    protected int f75606k;

    /* renamed from: l */
    protected int f75607l;

    /* renamed from: m */
    protected float f75608m;

    /* renamed from: n */
    protected int f75609n;

    /* renamed from: o */
    protected int f75610o;

    /* renamed from: p */
    protected int f75611p;

    /* renamed from: q */
    protected float f75612q;

    /* renamed from: r */
    protected float f75613r;

    /* renamed from: s */
    protected int f75614s;

    /* renamed from: t */
    protected String f75615t;

    /* renamed from: u */
    protected int f75616u;

    /* renamed from: v */
    protected float f75617v;

    /* renamed from: w */
    protected int[] f75618w;

    /* renamed from: x */
    protected int f75619x;

    /* renamed from: y */
    protected RectF f75620y;

    /* renamed from: z */
    protected Rect f75621z;

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker$b */
    public interface AbstractC31602b {
        static {
            Covode.recordClassIndex(38331);
        }

        /* renamed from: a */
        void mo57618a(NumberPicker numberPicker, int i);
    }

    public int getCurrentNumber() {
        return this.f75611p;
    }

    static {
        Covode.recordClassIndex(38329);
    }

    /* renamed from: a */
    private void m65902a() {
        int i;
        int i2 = this.f75609n;
        if (i2 < 0 || (i = this.f75610o) < 0) {
            throw new IllegalArgumentException("number can not be negative");
        }
        if (i2 > i) {
            this.f75610o = i2;
        }
        if (this.f75611p < i2) {
            this.f75611p = i2;
        }
        int i3 = this.f75611p;
        int i4 = this.f75610o;
        if (i3 > i4) {
            this.f75611p = i4;
        }
        this.f75618w = new int[((i4 - i2) + 1)];
        int i5 = 0;
        while (true) {
            int[] iArr = this.f75618w;
            if (i5 < iArr.length) {
                iArr[i5] = this.f75609n + i5;
                i5++;
            } else {
                this.f75619x = this.f75611p - this.f75609n;
                return;
            }
        }
    }

    /* renamed from: b */
    private void m65903b() {
        int length = String.valueOf(this.f75610o).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        this.f75598c.getTextBounds(sb2, 0, sb2.length(), this.f75602g);
        String str = this.f75615t;
        if (str != null) {
            this.f75599d.getTextBounds(str, 0, str.length(), this.f75621z);
        }
    }

    /* renamed from: c */
    private void m65904c() {
        if (this.f75575C.isFinished()) {
            this.f75577E = 0;
            int round = (this.f75604i + (Math.round(((float) (this.f75603h[0].f75623b - this.f75604i)) / ((float) this.f75580H)) * this.f75580H)) - this.f75603h[0].f75623b;
            if (round != 0) {
                this.f75575C.startScroll(0, 0, 0, round, 300);
            }
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f75574B;
        if (scroller.isFinished()) {
            m65907e(0);
            scroller = this.f75575C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.f75578F = currY;
        int i = currY - this.f75577E;
        this.f75579G = i;
        m65906d(i);
        invalidate();
        this.f75577E = this.f75578F;
    }

    /* renamed from: d */
    private void m65905d() {
        int i = 0;
        if (this.f75596ac) {
            this.f75588P = this.f75603h.length / 2;
            while (i < this.f75603h.length) {
                this.f75603h[i] = new C31601a((this.f75619x - 3) + i, this.f75604i + (this.f75580H * i));
                i++;
            }
            return;
        }
        while (i < this.f75603h.length) {
            C31601a aVar = new C31601a((this.f75619x - 3) + i, this.f75604i + (this.f75580H * i));
            if (aVar.f75622a > this.f75618w.length - 1) {
                aVar.f75622a -= this.f75618w.length;
            } else if (aVar.f75622a < 0) {
                aVar.f75622a += this.f75618w.length;
            }
            this.f75603h[i] = aVar;
            i++;
        }
    }

    /* renamed from: a */
    public final NumberPicker mo57627a(AbstractC31602b bVar) {
        this.f75582J = bVar;
        return this;
    }

    /* renamed from: e */
    private void m65907e(int i) {
        if (this.f75590U != i) {
            this.f75590U = i;
        }
    }

    public void setNonRecurrent(boolean z) {
        this.f75596ac = z;
        m65905d();
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f75586N = z;
    }

    /* renamed from: a */
    public final NumberPicker mo57626a(int i) {
        this.f75609n = i;
        m65902a();
        m65905d();
        invalidate();
        return this;
    }

    /* renamed from: b */
    public final NumberPicker mo57629b(int i) {
        this.f75610o = i;
        m65902a();
        m65905d();
        invalidate();
        return this;
    }

    /* renamed from: c */
    public final NumberPicker mo57630c(int i) {
        this.f75611p = i;
        m65902a();
        m65905d();
        invalidate();
        return this;
    }

    /* renamed from: a */
    public final NumberPicker mo57628a(String[] strArr) {
        this.f75587O = strArr;
        m65902a();
        invalidate();
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f75594aa == null) {
            this.f75594aa = VelocityTracker.obtain();
        }
        this.f75594aa.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        this.f75573A = actionMasked;
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f75577E = (int) motionEvent.getY();
            if (!this.f75574B.isFinished() || !this.f75575C.isFinished()) {
                this.f75574B.forceFinished(true);
                this.f75575C.forceFinished(true);
                m65907e(0);
            }
        } else if (2 == actionMasked) {
            int y = (int) motionEvent.getY();
            this.f75578F = y;
            int i = y - this.f75577E;
            this.f75579G = i;
            if (!this.f75581I && Math.abs(i) < this.f75589T) {
                return false;
            }
            this.f75581I = true;
            int i2 = this.f75579G;
            int i3 = this.f75589T;
            if (i2 > i3) {
                this.f75579G = i2 - i3;
            } else if (i2 < (-i3)) {
                this.f75579G = i2 + i3;
            }
            this.f75577E = this.f75578F;
            m65906d(this.f75579G);
            m65907e(1);
            invalidate();
        } else if (1 == actionMasked) {
            this.f75581I = false;
            VelocityTracker velocityTracker = this.f75594aa;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f75592W);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f75591V) {
                if (yVelocity > 0) {
                    int i4 = (int) (this.f75608m * 10.0f);
                    this.f75577E = 0;
                    this.f75574B.fling(0, 0, 0, yVelocity, 0, 0, 0, i4);
                } else if (yVelocity < 0) {
                    int i5 = (int) (this.f75608m * 10.0f);
                    this.f75577E = i5;
                    this.f75574B.fling(0, i5, 0, yVelocity, 0, 0, 0, i5);
                }
                invalidate();
                m65907e(2);
            } else {
                m65904c();
                invalidate();
            }
            this.f75594aa.recycle();
            this.f75594aa = null;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m65906d(int r6) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.m65906d(int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r13) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.onDraw(android.graphics.Canvas):void");
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f75593a = size;
        } else {
            this.f75593a = this.f75602g.width() + getPaddingLeft() + getPaddingRight() + this.f75621z.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f75597b = size2;
        } else {
            this.f75597b = (this.f75584L * this.f75602g.height()) + ((this.f75584L - 1) * this.f75614s) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f75593a, this.f75597b);
        if (this.f75620y == null) {
            RectF rectF = new RectF();
            this.f75620y = rectF;
            rectF.left = 0.0f;
            this.f75620y.right = (float) this.f75593a;
            this.f75620y.top = (float) (((this.f75597b - this.f75602g.height()) - this.f75614s) / 2);
            this.f75620y.bottom = (float) (((this.f75597b + this.f75602g.height()) + this.f75614s) / 2);
            int height = this.f75614s + this.f75602g.height();
            this.f75580H = height;
            int i3 = this.f75597b;
            this.f75604i = (i3 / 2) - (height * 3);
            this.f75605j = (i3 / 2) + (height * 3);
            m65905d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker$a */
    public class C31601a {

        /* renamed from: a */
        public int f75622a;

        /* renamed from: b */
        public int f75623b;

        static {
            Covode.recordClassIndex(38330);
        }

        public C31601a(int i, int i2) {
            this.f75622a = i;
            this.f75623b = i2;
        }
    }

    private NumberPicker(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10473);
        this.f75573A = 3;
        this.f75583K = new HashSet();
        this.f75586N = true;
        this.f75595ab = getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jb, R.attr.qm, R.attr.qu, R.attr.qv, R.attr.rh, R.attr.rm, R.attr.rr, R.attr.su, R.attr.u2, R.attr.u3, R.attr.u4, R.attr.xa, R.attr.aab, R.attr.af8, R.attr.asx}, 0, 0);
        int i = f75570Q;
        this.f75606k = obtainStyledAttributes.getColor(2, i);
        this.f75608m = obtainStyledAttributes.getDimension(3, this.f75595ab * 32.0f);
        this.f75607l = obtainStyledAttributes.getColor(4, i);
        this.f75609n = obtainStyledAttributes.getInteger(13, 0);
        this.f75610o = obtainStyledAttributes.getInteger(7, 0);
        this.f75611p = obtainStyledAttributes.getInteger(1, 0);
        this.f75614s = (int) obtainStyledAttributes.getDimension(14, this.f75595ab * 16.0f);
        this.f75615t = obtainStyledAttributes.getString(8);
        this.f75616u = obtainStyledAttributes.getColor(9, f75571R);
        this.f75617v = obtainStyledAttributes.getDimension(10, this.f75595ab * 12.0f);
        this.f75576D = obtainStyledAttributes.getColor(0, f75572S);
        this.f75584L = obtainStyledAttributes.getInteger(12, 5);
        this.f75612q = obtainStyledAttributes.getDimension(6, this.f75595ab * 2.0f);
        this.f75613r = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        m65902a();
        TextPaint textPaint = new TextPaint();
        this.f75598c = textPaint;
        textPaint.setTextSize(this.f75608m);
        this.f75598c.setColor(this.f75606k);
        this.f75598c.setFlags(1);
        this.f75598c.setTextAlign(Paint.Align.CENTER);
        TextPaint textPaint2 = new TextPaint(this.f75598c);
        this.f75600e = textPaint2;
        textPaint2.setAlpha(77);
        TextPaint textPaint3 = new TextPaint();
        this.f75599d = textPaint3;
        textPaint3.setTextSize(this.f75617v);
        this.f75599d.setColor(this.f75616u);
        this.f75599d.setFlags(1);
        this.f75599d.setTextAlign(Paint.Align.LEFT);
        Paint paint = new Paint();
        this.f75601f = paint;
        paint.setColor(this.f75607l);
        this.f75601f.setStyle(Paint.Style.STROKE);
        this.f75601f.setStrokeWidth(this.f75612q);
        this.f75602g = new Rect();
        this.f75621z = new Rect();
        m65903b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f75589T = viewConfiguration.getScaledPagingTouchSlop();
        this.f75591V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f75592W = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f75574B = new Scroller(getContext(), null);
        this.f75575C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        this.f75603h = new C31601a[(this.f75584L + 4)];
        MethodCollector.m26664o(10473);
    }
}
