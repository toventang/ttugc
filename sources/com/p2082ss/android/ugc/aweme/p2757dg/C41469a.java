package com.p2082ss.android.ugc.aweme.p2757dg;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.dg.a */
public final class C41469a extends LinearLayout {

    /* renamed from: a */
    public static int f96720a;

    /* renamed from: b */
    public static int f96721b;

    /* renamed from: c */
    public static int f96722c;

    /* renamed from: d */
    public static float f96723d;

    /* renamed from: e */
    public static float f96724e;

    /* renamed from: f */
    public static float f96725f;

    /* renamed from: g */
    public static int f96726g;

    /* renamed from: h */
    public static int f96727h;

    /* renamed from: i */
    private Paint f96728i;

    /* renamed from: j */
    private final Path f96729j;

    /* renamed from: k */
    private final Path f96730k;

    /* renamed from: l */
    private RectF f96731l;

    /* renamed from: m */
    private float f96732m;

    /* renamed from: n */
    private float f96733n;

    /* renamed from: o */
    private Path f96734o;

    /* renamed from: p */
    private RectF f96735p;

    /* renamed from: q */
    private int f96736q;

    /* renamed from: r */
    private Matrix f96737r;

    /* renamed from: s */
    private Bitmap f96738s;

    /* renamed from: t */
    private Canvas f96739t;

    /* renamed from: u */
    private int f96740u;

    /* renamed from: v */
    private int f96741v;

    /* renamed from: w */
    private float f96742w;

    /* renamed from: x */
    private int f96743x;

    /* renamed from: y */
    private boolean f96744y;

    /* renamed from: z */
    private boolean f96745z;

    static {
        Covode.recordClassIndex(49368);
    }

    /* renamed from: a */
    private void m83385a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.start();
        ofFloat.addUpdateListener(C41470b.f96746a);
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.f96742w, f96725f);
        int i = this.f96743x;
        if (i == 0) {
            return Math.min(max, this.f96732m - f96725f);
        }
        if (i == 1) {
            return Math.min(max, this.f96733n - f96725f);
        }
        if (i == 2) {
            return Math.min(max, this.f96733n - f96725f);
        }
        if (i != 3) {
            return 0.0f;
        }
        return Math.min(max, this.f96732m - f96725f);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void setBgColor(int i) {
        this.f96740u = i;
    }

    public final void setBorderColor(int i) {
        this.f96741v = i;
    }

    public final void setBubbleOrientation(int i) {
        this.f96743x = i;
    }

    public final void setNeedPath(boolean z) {
        this.f96744y = z;
    }

    public final void setNeedPressFade(boolean z) {
        this.f96745z = z;
    }

    public C41469a(Context context) {
        this(context, (byte) 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.f96745z) {
                    m83385a();
                }
            } else if (this.f96745z) {
                m83385a();
            }
        } else if (this.f96745z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.5f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(C41471c.f96747a);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(10229);
        if (this.f96738s == null) {
            this.f96738s = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.f96739t = new Canvas(this.f96738s);
        }
        float f = this.f96732m;
        float f2 = this.f96733n;
        float max = Math.max(this.f96742w, f96725f);
        float min = Math.min(max, f2 - f96725f);
        Matrix matrix = new Matrix();
        this.f96737r = new Matrix();
        int i = this.f96743x;
        if (i != 0) {
            if (i == 1) {
                f2 = Math.min(max, f2 - f96725f);
                setPadding(f96720a, 0, 0, 0);
                setGravity(17);
                Matrix matrix2 = this.f96737r;
                int i2 = this.f96736q;
                matrix2.postTranslate(((float) i2) + 0.0f, ((float) ((i2 * 3) / 2)) + f2);
                this.f96731l = new RectF((float) f96720a, 0.0f, this.f96732m, this.f96733n);
            } else if (i == 2) {
                f2 = Math.min(max, f2 - f96725f);
                matrix.postRotate(180.0f);
                this.f96737r.postRotate(180.0f);
                Matrix matrix3 = this.f96737r;
                int i3 = this.f96736q;
                matrix3.postTranslate(((float) (i3 * 2)) + f, ((float) ((i3 * 3) / 2)) + f2);
                setPadding(0, 0, f96720a, 0);
                setGravity(17);
                this.f96731l = new RectF(0.0f, 0.0f, this.f96732m - ((float) f96720a), this.f96733n);
            } else if (i != 3) {
                f2 = min;
            } else {
                f = Math.min(max, f - f96725f);
                matrix.postRotate(270.0f);
                this.f96737r.postRotate(270.0f);
                Matrix matrix4 = this.f96737r;
                int i4 = this.f96736q;
                matrix4.postTranslate(((float) ((i4 * 3) / 2)) + f, ((float) (i4 * 2)) + f2);
                setPadding(0, 0, 0, f96720a);
                setGravity(17);
                this.f96731l = new RectF(0.0f, 0.0f, this.f96732m, this.f96733n - ((float) f96720a));
            }
            f = 0.0f;
        } else {
            f = Math.min(max, f - f96725f);
            matrix.postRotate(90.0f);
            this.f96737r.postRotate(90.0f);
            Matrix matrix5 = this.f96737r;
            int i5 = this.f96736q;
            matrix5.postTranslate(((float) ((i5 * 3) / 2)) + f, ((float) i5) + 0.0f);
            setPadding(0, f96720a, 0, 0);
            setGravity(17);
            this.f96731l = new RectF(0.0f, (float) f96720a, this.f96732m, this.f96733n);
            f2 = 0.0f;
        }
        this.f96731l.left += (float) ((this.f96736q * 3) / 2);
        this.f96731l.top += (float) ((this.f96736q * 3) / 2);
        this.f96731l.right += (float) ((this.f96736q * 3) / 2);
        this.f96731l.bottom += (float) ((this.f96736q * 3) / 2);
        RectF rectF = new RectF();
        this.f96735p = rectF;
        rectF.left = this.f96731l.left - ((float) (this.f96736q / 2));
        this.f96735p.top = this.f96731l.top - ((float) (this.f96736q / 2));
        this.f96735p.right = this.f96731l.right + ((float) (this.f96736q / 2));
        this.f96735p.bottom = this.f96731l.bottom + ((float) (this.f96736q / 2));
        int i6 = this.f96736q;
        matrix.postTranslate(f + ((float) ((i6 * 3) / 2)), f2 + ((float) ((i6 * 3) / 2)));
        this.f96728i.setColor(this.f96741v);
        this.f96728i.setStyle(Paint.Style.STROKE);
        this.f96728i.setStrokeWidth((float) this.f96736q);
        if (this.f96744y) {
            this.f96729j.reset();
            Path path = this.f96729j;
            RectF rectF2 = this.f96735p;
            float f3 = f96724e;
            int i7 = this.f96736q;
            path.addRoundRect(rectF2, ((float) (i7 / 2)) + f3, f3 + ((float) (i7 / 2)), Path.Direction.CW);
            this.f96729j.addPath(this.f96734o, this.f96737r);
            this.f96739t.drawPath(this.f96729j, this.f96728i);
        }
        this.f96728i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f96728i.setColor(this.f96740u);
        this.f96728i.setStyle(Paint.Style.FILL);
        this.f96729j.reset();
        Path path2 = this.f96729j;
        RectF rectF3 = this.f96731l;
        float f4 = f96724e;
        path2.addRoundRect(rectF3, f4, f4, Path.Direction.CW);
        this.f96729j.addPath(this.f96730k, matrix);
        this.f96739t.drawPath(this.f96729j, this.f96728i);
        this.f96728i.setXfermode(null);
        canvas.drawBitmap(this.f96738s, 0.0f, 0.0f, (Paint) null);
        MethodCollector.m26664o(10229);
    }

    /* renamed from: a */
    public final void mo70729a(int i, float f) {
        this.f96742w = f;
        this.f96743x = i;
    }

    private C41469a(Context context, byte b) {
        this(context, (char) 0);
    }

    /* renamed from: a */
    private static float m83384a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int measuredWidth;
        int i3;
        MethodCollector.m26663i(10226);
        super.onMeasure(i, i2);
        if (getChildAt(0) instanceof TextView) {
            textView = (TextView) getChildAt(0);
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (textView != null) {
            measuredWidth = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            measuredWidth = getMeasuredWidth();
        }
        int i4 = this.f96743x;
        if (i4 == 2 || i4 == 1) {
            int i5 = f96726g;
            if (measuredWidth > i5) {
                i5 = (f96721b * 2) + measuredWidth;
            }
            i3 = i5 + f96720a;
        } else {
            i3 = f96726g;
            if (measuredWidth > i3) {
                i3 = (f96721b * 2) + measuredWidth;
            }
        }
        int i6 = f96727h;
        int i7 = this.f96736q;
        int i8 = i3 + (i7 * 3);
        int i9 = i6 + (i7 * 3);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i8, i9);
            }
            setMeasuredDimension(i8, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i9);
                }
            }
            setMeasuredDimension(i8, size2);
        }
        this.f96732m = (float) (getMeasuredWidth() - (this.f96736q * 3));
        this.f96733n = (float) (getMeasuredHeight() - (this.f96736q * 3));
        MethodCollector.m26664o(10226);
    }

    private C41469a(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(10062);
        this.f96729j = new Path();
        Path path = new Path();
        this.f96730k = path;
        this.f96734o = new Path();
        this.f96742w = 0.75f;
        this.f96743x = 1;
        this.f96744y = true;
        int a = (int) m83384a(context, 0.5f);
        this.f96736q = a;
        if (a < 2) {
            this.f96736q = 2;
        }
        f96720a = (int) m83384a(context, 7.0f);
        f96721b = (int) m83384a(context, 10.0f);
        f96722c = (int) m83384a(context, 6.0f);
        f96723d = 2.0f;
        f96724e = m83384a(context, 6.0f);
        f96725f = (float) (f96720a + f96722c);
        f96726g = (int) m83384a(context, 50.0f);
        f96727h = (int) m83384a(context, 46.0f);
        Paint paint = new Paint();
        this.f96728i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f96728i.setStrokeCap(Paint.Cap.BUTT);
        this.f96728i.setAntiAlias(true);
        this.f96728i.setStrokeWidth(f96723d);
        this.f96728i.setStrokeJoin(Paint.Join.MITER);
        this.f96740u = C0643b.m2378c(context, R.color.bj);
        this.f96741v = Color.parseColor("#1DFFFFFF");
        this.f96728i.setColor(this.f96740u);
        setLayerType(1, this.f96728i);
        path.moveTo(0.0f, 0.0f);
        int i = f96720a;
        path.lineTo((float) i, (float) (-i));
        int i2 = f96720a;
        path.lineTo((float) i2, (float) i2);
        path.close();
        this.f96734o.moveTo(0.0f, 0.0f);
        Path path2 = this.f96734o;
        double d = (double) f96720a;
        double d2 = (double) this.f96736q;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        float f = (float) (d + (d2 * sqrt));
        double d3 = (double) (-f96720a);
        double d4 = (double) this.f96736q;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        path2.lineTo(f, (float) (d3 - (d4 * sqrt2)));
        Path path3 = this.f96734o;
        double d5 = (double) f96720a;
        double d6 = (double) this.f96736q;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        Double.isNaN(d5);
        float f2 = (float) (d5 + (d6 * sqrt3));
        double d7 = (double) f96720a;
        double d8 = (double) this.f96736q;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        Double.isNaN(d7);
        path3.lineTo(f2, (float) (d7 + (d8 * sqrt4)));
        this.f96734o.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.m26664o(10062);
    }
}
