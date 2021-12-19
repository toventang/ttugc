package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.tools.view.style.d */
public final class C84969d extends LinearLayout {

    /* renamed from: g */
    public static int f189904g;

    /* renamed from: h */
    public static int f189905h;

    /* renamed from: i */
    public static float f189906i;

    /* renamed from: j */
    public static float f189907j;

    /* renamed from: k */
    public static float f189908k;

    /* renamed from: l */
    public static int f189909l;

    /* renamed from: m */
    public static int f189910m;

    /* renamed from: n */
    public static final C84970a f189911n = new C84970a((byte) 0);

    /* renamed from: A */
    private int f189912A;

    /* renamed from: B */
    private boolean f189913B;

    /* renamed from: C */
    private boolean f189914C;

    /* renamed from: D */
    private boolean f189915D;

    /* renamed from: E */
    private boolean f189916E;

    /* renamed from: F */
    private boolean f189917F;

    /* renamed from: a */
    public Paint f189918a;

    /* renamed from: b */
    public Path f189919b;

    /* renamed from: c */
    public Path f189920c;

    /* renamed from: d */
    public Path f189921d;

    /* renamed from: e */
    public RectF f189922e;

    /* renamed from: f */
    public Matrix f189923f;

    /* renamed from: o */
    private float f189924o;

    /* renamed from: p */
    private RectF f189925p;

    /* renamed from: q */
    private float f189926q;

    /* renamed from: r */
    private float f189927r;

    /* renamed from: s */
    private int f189928s;

    /* renamed from: t */
    private Bitmap f189929t;

    /* renamed from: u */
    private Canvas f189930u;

    /* renamed from: v */
    private int f189931v;

    /* renamed from: w */
    private int f189932w;

    /* renamed from: x */
    private int f189933x;

    /* renamed from: y */
    private boolean f189934y;

    /* renamed from: z */
    private float f189935z;

    static {
        Covode.recordClassIndex(98974);
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.d$a */
    public static final class C84970a {
        static {
            Covode.recordClassIndex(98975);
        }

        private C84970a() {
        }

        public /* synthetic */ C84970a(byte b) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.f189931v;
    }

    public final int getMBorderColor() {
        return this.f189932w;
    }

    public final int getMBorderWidth() {
        return this.f189928s;
    }

    public final float getMHeight() {
        return this.f189927r;
    }

    public final boolean getMNeedAddColor() {
        return this.f189916E;
    }

    public final boolean getMNeedArrow() {
        return this.f189915D;
    }

    public final boolean getMNeedPath() {
        return this.f189913B;
    }

    public final boolean getMNeedPressFade() {
        return this.f189914C;
    }

    public final boolean getMNeedShadow() {
        return this.f189934y;
    }

    public final float getMPadding() {
        return this.f189924o;
    }

    public final int getMShadowColor() {
        return this.f189933x;
    }

    public final float getMWidth() {
        return this.f189926q;
    }

    public final boolean getUseDefaultView() {
        return this.f189917F;
    }

    public final int getPADDING() {
        return f189904g / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f189921d;
        if (path == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f189923f;
        if (matrix == null) {
            C89219l.m154710a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f189922e;
        if (rectF == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f189920c;
        if (path == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f189918a;
        if (paint == null) {
            C89219l.m154710a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f189919b;
        if (path == null) {
            C89219l.m154710a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float b = C89271h.m154768b(this.f189935z, f189908k);
        int i = this.f189912A;
        if (i == 0) {
            return C89271h.m154771c(b, this.f189926q - f189908k);
        }
        if (i == 1) {
            return C89271h.m154771c(b, this.f189927r - f189908k);
        }
        if (i == 2) {
            return C89271h.m154771c(b, this.f189927r - f189908k);
        }
        if (i != 3) {
            return 0.0f;
        }
        return C89271h.m154771c(b, this.f189926q - f189908k);
    }

    public final void setBubbleOrientation(int i) {
        this.f189912A = i;
    }

    public final void setMBgColor(int i) {
        this.f189931v = i;
    }

    public final void setMBorderColor(int i) {
        this.f189932w = i;
    }

    public final void setMBorderWidth(int i) {
        this.f189928s = i;
    }

    public final void setMHeight(float f) {
        this.f189927r = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.f189916E = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.f189915D = z;
    }

    public final void setMNeedPath(boolean z) {
        this.f189913B = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.f189914C = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.f189934y = z;
    }

    public final void setMPadding(float f) {
        this.f189924o = f;
    }

    public final void setMShadowColor(int i) {
        this.f189933x = i;
    }

    public final void setMWidth(float f) {
        this.f189926q = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.f189916E = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.f189917F = z;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        C89219l.m154721d(path, "");
        this.f189921d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        C89219l.m154721d(matrix, "");
        this.f189923f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        C89219l.m154721d(rectF, "");
        this.f189922e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        C89219l.m154721d(path, "");
        this.f189920c = path;
    }

    public final void setMFillPaint(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f189918a = paint;
    }

    public final void setMPath(Path path) {
        C89219l.m154721d(path, "");
        this.f189919b = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C84969d(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9072);
        C89219l.m154721d(canvas, "");
        Bitmap bitmap = this.f189929t;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.f189929t = bitmap;
            this.f189930u = new Canvas(bitmap);
        }
        float f = this.f189926q;
        float f2 = this.f189927r;
        float max = Math.max(this.f189935z, f189908k);
        Matrix matrix = new Matrix();
        this.f189923f = new Matrix();
        int i = this.f189912A;
        if (i == 0) {
            float min = Math.min(max, f - f189908k);
            matrix.postRotate(90.0f);
            Matrix matrix2 = this.f189923f;
            if (matrix2 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix2.postRotate(90.0f);
            Matrix matrix3 = this.f189923f;
            if (matrix3 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i2 = this.f189928s;
            matrix3.postTranslate((((float) ((i2 * 3) / 2)) + min) - ((float) ((f189904g * 3) / 2)), ((float) i2) + 0.0f);
            setPadding(0, f189904g, 0, 0);
            setGravity(17);
            this.f189925p = new RectF(0.0f, (float) f189904g, this.f189926q, this.f189927r);
            int i3 = this.f189928s;
            matrix.postTranslate((min + ((float) ((i3 * 3) / 2))) - ((float) ((f189904g * 3) / 2)), ((float) ((i3 * 3) / 2)) + 0.0f);
        } else if (i == 1) {
            float min2 = Math.min(max, f2 - f189908k);
            setPadding(f189904g, 0, 0, 0);
            setGravity(17);
            Matrix matrix4 = this.f189923f;
            if (matrix4 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i4 = this.f189928s;
            matrix4.postTranslate(((float) i4) + 0.0f, (((float) (i4 * 2)) + min2) - ((float) ((f189904g * 3) / 2)));
            this.f189925p = new RectF((float) f189904g, 0.0f, this.f189926q, this.f189927r);
            int i5 = this.f189928s;
            matrix.postTranslate(((float) ((i5 * 3) / 2)) + 0.0f, (min2 + ((float) (i5 * 2))) - ((float) ((f189904g * 3) / 2)));
        } else if (i == 2) {
            float min3 = Math.min(max, f2 - f189908k);
            matrix.postRotate(180.0f);
            Matrix matrix5 = this.f189923f;
            if (matrix5 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix5.postRotate(180.0f);
            Matrix matrix6 = this.f189923f;
            if (matrix6 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i6 = this.f189928s;
            matrix6.postTranslate(((float) (i6 * 2)) + f, (((float) (i6 * 2)) + min3) - ((float) ((f189904g * 3) / 2)));
            setPadding(0, 0, f189904g, 0);
            setGravity(17);
            this.f189925p = new RectF(0.0f, 0.0f, this.f189926q - ((float) f189904g), this.f189927r);
            int i7 = this.f189928s;
            matrix.postTranslate(f + ((float) ((i7 * 3) / 2)), (min3 + ((float) (i7 * 2))) - ((float) ((f189904g * 3) / 2)));
        } else if (i == 3) {
            float min4 = Math.min(max, f - f189908k);
            matrix.postRotate(270.0f);
            Matrix matrix7 = this.f189923f;
            if (matrix7 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix7.postRotate(270.0f);
            Matrix matrix8 = this.f189923f;
            if (matrix8 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i8 = this.f189928s;
            matrix8.postTranslate((((float) ((i8 * 3) / 2)) + min4) - ((float) ((f189904g * 3) / 2)), ((float) (i8 * 2)) + f2);
            setPadding(0, 0, 0, f189904g);
            setGravity(17);
            this.f189925p = new RectF(0.0f, 0.0f, this.f189926q, this.f189927r - ((float) f189904g));
            int i9 = this.f189928s;
            matrix.postTranslate((min4 + ((float) ((i9 * 3) / 2))) - ((float) ((f189904g * 3) / 2)), f2 + ((float) ((i9 * 3) / 2)));
        }
        RectF rectF = this.f189925p;
        if (rectF == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF.left += (float) ((this.f189928s * 3) / 2);
        RectF rectF2 = this.f189925p;
        if (rectF2 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF2.top += (float) ((this.f189928s * 3) / 2);
        RectF rectF3 = this.f189925p;
        if (rectF3 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF3.right += (float) ((this.f189928s * 3) / 2);
        RectF rectF4 = this.f189925p;
        if (rectF4 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.f189928s * 3) / 2);
        RectF rectF5 = new RectF();
        this.f189922e = rectF5;
        RectF rectF6 = this.f189925p;
        if (rectF6 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.f189928s / 2));
        RectF rectF7 = this.f189922e;
        if (rectF7 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF8 = this.f189925p;
        if (rectF8 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.f189928s / 2));
        RectF rectF9 = this.f189922e;
        if (rectF9 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF10 = this.f189925p;
        if (rectF10 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.f189928s / 2));
        RectF rectF11 = this.f189922e;
        if (rectF11 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF12 = this.f189925p;
        if (rectF12 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.f189928s / 2));
        if (this.f189934y) {
            Paint paint = this.f189918a;
            if (paint == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.f189933x);
        }
        if (this.f189913B) {
            Paint paint2 = this.f189918a;
            if (paint2 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint2.setColor(this.f189932w);
            Paint paint3 = this.f189918a;
            if (paint3 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.f189918a;
            if (paint4 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.f189928s);
            Path path = this.f189919b;
            if (path == null) {
                C89219l.m154710a("mPath");
            }
            path.reset();
            Path path2 = this.f189919b;
            if (path2 == null) {
                C89219l.m154710a("mPath");
            }
            RectF rectF13 = this.f189922e;
            if (rectF13 == null) {
                C89219l.m154710a("mBorderRoundRect");
            }
            float f3 = f189907j;
            int i10 = this.f189928s;
            path2.addRoundRect(rectF13, ((float) (i10 / 2)) + f3, f3 + ((float) (i10 / 2)), Path.Direction.CW);
            if (this.f189915D) {
                Path path3 = this.f189919b;
                if (path3 == null) {
                    C89219l.m154710a("mPath");
                }
                Path path4 = this.f189921d;
                if (path4 == null) {
                    C89219l.m154710a("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f189923f;
                if (matrix9 == null) {
                    C89219l.m154710a("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.f189930u;
            if (canvas2 == null) {
                C89219l.m154710a("mCanvas");
            }
            Path path5 = this.f189919b;
            if (path5 == null) {
                C89219l.m154710a("mPath");
            }
            Paint paint5 = this.f189918a;
            if (paint5 == null) {
                C89219l.m154710a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.f189916E) {
                Paint paint6 = this.f189918a;
                if (paint6 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                paint6.setColor(getResources().getColor(R.color.qt));
                Paint paint7 = this.f189918a;
                if (paint7 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                paint7.setStyle(Paint.Style.STROKE);
                Path path6 = this.f189919b;
                if (path6 == null) {
                    C89219l.m154710a("mPath");
                }
                path6.reset();
                if (this.f189915D) {
                    Path path7 = this.f189919b;
                    if (path7 == null) {
                        C89219l.m154710a("mPath");
                    }
                    Path path8 = this.f189921d;
                    if (path8 == null) {
                        C89219l.m154710a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f189923f;
                    if (matrix10 == null) {
                        C89219l.m154710a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f189919b;
                if (path9 == null) {
                    C89219l.m154710a("mPath");
                }
                RectF rectF14 = this.f189922e;
                if (rectF14 == null) {
                    C89219l.m154710a("mBorderRoundRect");
                }
                float f4 = f189907j;
                int i11 = this.f189928s;
                path9.addRoundRect(rectF14, ((float) (i11 / 2)) + f4, f4 + ((float) (i11 / 2)), Path.Direction.CW);
                Canvas canvas3 = this.f189930u;
                if (canvas3 == null) {
                    C89219l.m154710a("mCanvas");
                }
                Path path10 = this.f189919b;
                if (path10 == null) {
                    C89219l.m154710a("mPath");
                }
                Paint paint8 = this.f189918a;
                if (paint8 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f189918a;
        if (paint9 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint10 = this.f189918a;
        if (paint10 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint10.setColor(this.f189931v);
        Paint paint11 = this.f189918a;
        if (paint11 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        Path path11 = this.f189919b;
        if (path11 == null) {
            C89219l.m154710a("mPath");
        }
        path11.reset();
        Path path12 = this.f189919b;
        if (path12 == null) {
            C89219l.m154710a("mPath");
        }
        RectF rectF15 = this.f189925p;
        if (rectF15 == null) {
            C89219l.m154710a("mRoundRect");
        }
        float f5 = f189907j;
        path12.addRoundRect(rectF15, f5, f5, Path.Direction.CW);
        if (this.f189915D) {
            Path path13 = this.f189919b;
            if (path13 == null) {
                C89219l.m154710a("mPath");
            }
            Path path14 = this.f189920c;
            if (path14 == null) {
                C89219l.m154710a("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.f189930u;
        if (canvas4 == null) {
            C89219l.m154710a("mCanvas");
        }
        Path path15 = this.f189919b;
        if (path15 == null) {
            C89219l.m154710a("mPath");
        }
        Paint paint12 = this.f189918a;
        if (paint12 == null) {
            C89219l.m154710a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f189918a;
        if (paint13 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint13.setXfermode(null);
        Context context = getContext();
        C89219l.m154716b(context, "");
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        canvas.drawBitmap(bitmap, ((float) f189904g) - C84912r.m145930a(context, 1.4f), ((float) f189904g) - C84912r.m145930a(context2, 1.3f), (Paint) null);
        MethodCollector.m26664o(9072);
    }

    /* renamed from: a */
    public final void mo129756a(int i, float f) {
        this.f189935z = f;
        this.f189912A = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C84969d(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84969d(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9216);
        this.f189924o = 12.0f;
        this.f189933x = -16777216;
        this.f189935z = 0.75f;
        this.f189912A = 1;
        this.f189913B = true;
        this.f189915D = true;
        this.f189916E = true;
        this.f189917F = true;
        C89219l.m154721d(context, "");
        this.f189928s = (int) C84912r.m145930a(context, 0.7f);
        f189904g = (int) C84912r.m145930a(context, 7.0f);
        f189906i = 2.0f;
        f189907j = C84912r.m145930a(context, 8.0f);
        f189908k = C84912r.m145930a(context, 3.0f);
        f189909l = (int) C84912r.m145930a(context, 50.0f);
        f189910m = (int) C84912r.m145930a(context, 56.0f);
        this.f189918a = new Paint();
        this.f189919b = new Path();
        this.f189921d = new Path();
        this.f189920c = new Path();
        Paint paint = this.f189918a;
        if (paint == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f189918a;
        if (paint2 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = this.f189918a;
        if (paint3 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f189918a;
        if (paint4 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint4.setStrokeWidth(f189906i);
        Paint paint5 = this.f189918a;
        if (paint5 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint5.setStrokeJoin(Paint.Join.MITER);
        this.f189931v = getResources().getColor(R.color.tg);
        this.f189932w = getResources().getColor(R.color.ne);
        Paint paint6 = this.f189918a;
        if (paint6 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint6.setColor(this.f189931v);
        Paint paint7 = this.f189918a;
        if (paint7 == null) {
            C89219l.m154710a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.f189934y) {
            Paint paint8 = this.f189918a;
            if (paint8 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.f189933x);
        }
        Path path = this.f189920c;
        if (path == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f189920c;
        if (path2 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        int i = f189904g;
        path2.lineTo((float) i, (float) (-i));
        Path path3 = this.f189920c;
        if (path3 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        int i2 = f189904g;
        path3.lineTo((float) i2, (float) i2);
        Path path4 = this.f189920c;
        if (path4 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f189921d;
        if (path5 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f189921d;
        if (path6 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        double d = (double) f189904g;
        double d2 = (double) this.f189928s;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        float f = (float) (d + (d2 * sqrt));
        double d3 = (double) (-f189904g);
        double d4 = (double) this.f189928s;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        path6.lineTo(f, (float) (d3 - (d4 * sqrt2)));
        Path path7 = this.f189921d;
        if (path7 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        double d5 = (double) f189904g;
        double d6 = (double) this.f189928s;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        Double.isNaN(d5);
        float f2 = (float) (d5 + (d6 * sqrt3));
        double d7 = (double) f189904g;
        double d8 = (double) this.f189928s;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        Double.isNaN(d7);
        path7.lineTo(f2, (float) (d7 + (d8 * sqrt4)));
        Path path8 = this.f189921d;
        if (path8 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.m26664o(9216);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        char c;
        int measuredWidth;
        int measuredHeight;
        MethodCollector.m26663i(8915);
        super.onMeasure(i, i2);
        Context context = getContext();
        C89219l.m154716b(context, "");
        f189905h = (int) C84912r.m145930a(context, this.f189924o + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.m26664o(8915);
                throw nullPointerException;
            }
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth2 = getMeasuredWidth();
        if (textView != null) {
            float measureText = (float) ((int) textView.getPaint().measureText(textView.getText().toString()));
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            if (measureText > C84912r.m145930a(context2, 197.0f)) {
                Context context3 = getContext();
                C89219l.m154716b(context3, "");
                C84912r.m145930a(context3, 197.0f);
                c = 2;
            } else {
                textView.getPaint().measureText(textView.getText().toString());
                c = 1;
            }
            textView.getPaddingLeft();
            textView.getPaddingRight();
        } else {
            c = 0;
        }
        if (this.f189917F) {
            measuredWidth = f189909l;
            if (measuredWidth2 > measuredWidth) {
                measuredWidth = (f189905h * 2) + measuredWidth2;
            }
            int i3 = this.f189912A;
            if (i3 == 2 || i3 == 1) {
                measuredWidth += f189904g;
            }
            measuredHeight = f189910m;
            if (c != 1) {
                measuredHeight += 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            C89219l.m154716b(contentView, "");
            measuredWidth = contentView.getMeasuredWidth() + (f189904g * 3) + f189905h;
            View contentView2 = popupWindow.getContentView();
            C89219l.m154716b(contentView2, "");
            measuredHeight = contentView2.getMeasuredHeight() + (f189904g * 3) + f189905h;
        }
        int i4 = this.f189928s;
        int i5 = measuredWidth + (i4 * 3);
        int i6 = measuredHeight + (i4 * 3);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i5, i6);
            }
            setMeasuredDimension(i5, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i6);
                }
            }
            setMeasuredDimension(i5, size2);
        }
        this.f189926q = (float) (getMeasuredWidth() - (f189904g * 2));
        this.f189927r = (float) (getMeasuredHeight() - (f189904g * 2));
        MethodCollector.m26664o(8915);
    }
}
