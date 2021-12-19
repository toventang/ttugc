package com.bytedance.ies.dmt.p1194ui.p1196b;

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
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.b.a */
public final class C17154a extends LinearLayout {

    /* renamed from: g */
    public static int f40791g;

    /* renamed from: h */
    public static int f40792h;

    /* renamed from: i */
    public static float f40793i;

    /* renamed from: j */
    public static float f40794j;

    /* renamed from: k */
    public static float f40795k;

    /* renamed from: l */
    public static int f40796l;

    /* renamed from: m */
    public static int f40797m;

    /* renamed from: n */
    public static final C17155a f40798n = new C17155a((byte) 0);

    /* renamed from: A */
    private int f40799A;

    /* renamed from: B */
    private boolean f40800B;

    /* renamed from: C */
    private boolean f40801C;

    /* renamed from: D */
    private boolean f40802D;

    /* renamed from: E */
    private boolean f40803E;

    /* renamed from: F */
    private boolean f40804F;

    /* renamed from: G */
    private float f40805G;

    /* renamed from: a */
    public Paint f40806a;

    /* renamed from: b */
    public Path f40807b;

    /* renamed from: c */
    public Path f40808c;

    /* renamed from: d */
    public Path f40809d;

    /* renamed from: e */
    public RectF f40810e;

    /* renamed from: f */
    public Matrix f40811f;

    /* renamed from: o */
    private float f40812o;

    /* renamed from: p */
    private RectF f40813p;

    /* renamed from: q */
    private float f40814q;

    /* renamed from: r */
    private float f40815r;

    /* renamed from: s */
    private int f40816s;

    /* renamed from: t */
    private Bitmap f40817t;

    /* renamed from: u */
    private Canvas f40818u;

    /* renamed from: v */
    private int f40819v;

    /* renamed from: w */
    private int f40820w;

    /* renamed from: x */
    private int f40821x;

    /* renamed from: y */
    private boolean f40822y;

    /* renamed from: z */
    private float f40823z;

    static {
        Covode.recordClassIndex(19611);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.b.a$a */
    public static final class C17155a {
        static {
            Covode.recordClassIndex(19612);
        }

        private C17155a() {
        }

        public /* synthetic */ C17155a(byte b) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.f40819v;
    }

    public final int getMBorderColor() {
        return this.f40820w;
    }

    public final int getMBorderWidth() {
        return this.f40816s;
    }

    public final float getMHeight() {
        return this.f40815r;
    }

    public final boolean getMNeedAddColor() {
        return this.f40803E;
    }

    public final boolean getMNeedArrow() {
        return this.f40802D;
    }

    public final boolean getMNeedPath() {
        return this.f40800B;
    }

    public final boolean getMNeedPressFade() {
        return this.f40801C;
    }

    public final boolean getMNeedShadow() {
        return this.f40822y;
    }

    public final float getMPadding() {
        return this.f40812o;
    }

    public final int getMShadowColor() {
        return this.f40821x;
    }

    public final float getMTextViewMaxWidth() {
        return this.f40805G;
    }

    public final float getMWidth() {
        return this.f40814q;
    }

    public final boolean getUseDefaultView() {
        return this.f40804F;
    }

    public final int getPADDING() {
        return f40791g / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f40809d;
        if (path == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f40811f;
        if (matrix == null) {
            C89219l.m154710a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f40810e;
        if (rectF == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f40808c;
        if (path == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f40806a;
        if (paint == null) {
            C89219l.m154710a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f40807b;
        if (path == null) {
            C89219l.m154710a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.f40823z, f40795k);
        int i = this.f40799A;
        if (i == 0) {
            return Math.min(max, this.f40814q - f40795k);
        }
        if (i == 1) {
            return Math.min(max, this.f40815r - f40795k);
        }
        if (i == 2) {
            return Math.min(max, this.f40815r - f40795k);
        }
        if (i != 3) {
            return 0.0f;
        }
        return Math.min(max, this.f40814q - f40795k);
    }

    public final void setBubbleOrientation(int i) {
        this.f40799A = i;
    }

    public final void setMBgColor(int i) {
        this.f40819v = i;
    }

    public final void setMBorderColor(int i) {
        this.f40820w = i;
    }

    public final void setMBorderWidth(int i) {
        this.f40816s = i;
    }

    public final void setMHeight(float f) {
        this.f40815r = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.f40803E = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.f40802D = z;
    }

    public final void setMNeedPath(boolean z) {
        this.f40800B = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.f40801C = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.f40822y = z;
    }

    public final void setMPadding(float f) {
        this.f40812o = f;
    }

    public final void setMShadowColor(int i) {
        this.f40821x = i;
    }

    public final void setMTextViewMaxWidth(float f) {
        this.f40805G = f;
    }

    public final void setMWidth(float f) {
        this.f40814q = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.f40803E = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.f40804F = z;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        C89219l.m154721d(path, "");
        this.f40809d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        C89219l.m154721d(matrix, "");
        this.f40811f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        C89219l.m154721d(rectF, "");
        this.f40810e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        C89219l.m154721d(path, "");
        this.f40808c = path;
    }

    public final void setMFillPaint(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f40806a = paint;
    }

    public final void setMPath(Path path) {
        C89219l.m154721d(path, "");
        this.f40807b = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17154a(Context context) {
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
        MethodCollector.m26663i(13056);
        C89219l.m154721d(canvas, "");
        if (this.f40817t == null) {
            this.f40817t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f40817t;
            if (bitmap == null) {
                C89219l.m154715b();
            }
            this.f40818u = new Canvas(bitmap);
        }
        float f = this.f40814q;
        float f2 = this.f40815r;
        float max = Math.max(this.f40823z, f40795k);
        Matrix matrix = new Matrix();
        this.f40811f = new Matrix();
        int i = this.f40799A;
        if (i == 0) {
            float min = Math.min(max, f - f40795k);
            matrix.postRotate(90.0f);
            Matrix matrix2 = this.f40811f;
            if (matrix2 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix2.postRotate(90.0f);
            Matrix matrix3 = this.f40811f;
            if (matrix3 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i2 = this.f40816s;
            matrix3.postTranslate((((float) ((i2 * 3) / 2)) + min) - ((float) ((f40791g * 3) / 2)), ((float) i2) + 0.0f);
            setPadding(0, f40791g, 0, 0);
            setGravity(17);
            this.f40813p = new RectF(0.0f, (float) f40791g, this.f40814q, this.f40815r);
            int i3 = this.f40816s;
            matrix.postTranslate((min + ((float) ((i3 * 3) / 2))) - ((float) ((f40791g * 3) / 2)), ((float) ((i3 * 3) / 2)) + 0.0f);
        } else if (i == 1) {
            float min2 = Math.min(max, f2 - f40795k);
            setPadding(f40791g, 0, 0, 0);
            setGravity(17);
            Matrix matrix4 = this.f40811f;
            if (matrix4 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i4 = this.f40816s;
            matrix4.postTranslate(((float) i4) + 0.0f, (((float) (i4 * 2)) + min2) - ((float) ((f40791g * 3) / 2)));
            this.f40813p = new RectF((float) f40791g, 0.0f, this.f40814q, this.f40815r);
            int i5 = this.f40816s;
            matrix.postTranslate(((float) ((i5 * 3) / 2)) + 0.0f, (min2 + ((float) (i5 * 2))) - ((float) ((f40791g * 3) / 2)));
        } else if (i == 2) {
            float min3 = Math.min(max, f2 - f40795k);
            matrix.postRotate(180.0f);
            Matrix matrix5 = this.f40811f;
            if (matrix5 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix5.postRotate(180.0f);
            Matrix matrix6 = this.f40811f;
            if (matrix6 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i6 = this.f40816s;
            matrix6.postTranslate(((float) (i6 * 2)) + f, (((float) (i6 * 2)) + min3) - ((float) ((f40791g * 3) / 2)));
            setPadding(0, 0, f40791g, 0);
            setGravity(17);
            this.f40813p = new RectF(0.0f, 0.0f, this.f40814q - ((float) f40791g), this.f40815r);
            int i7 = this.f40816s;
            matrix.postTranslate(f + ((float) ((i7 * 3) / 2)), (min3 + ((float) (i7 * 2))) - ((float) ((f40791g * 3) / 2)));
        } else if (i == 3) {
            float min4 = Math.min(max, f - f40795k);
            matrix.postRotate(270.0f);
            Matrix matrix7 = this.f40811f;
            if (matrix7 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix7.postRotate(270.0f);
            Matrix matrix8 = this.f40811f;
            if (matrix8 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i8 = this.f40816s;
            matrix8.postTranslate((((float) ((i8 * 3) / 2)) + min4) - ((float) ((f40791g * 3) / 2)), ((float) (i8 * 2)) + f2);
            setPadding(0, 0, 0, f40791g);
            setGravity(17);
            this.f40813p = new RectF(0.0f, 0.0f, this.f40814q, this.f40815r - ((float) f40791g));
            int i9 = this.f40816s;
            matrix.postTranslate((min4 + ((float) ((i9 * 3) / 2))) - ((float) ((f40791g * 3) / 2)), f2 + ((float) ((i9 * 3) / 2)));
        }
        RectF rectF = this.f40813p;
        if (rectF == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF.left += (float) ((this.f40816s * 3) / 2);
        RectF rectF2 = this.f40813p;
        if (rectF2 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF2.top += (float) ((this.f40816s * 3) / 2);
        RectF rectF3 = this.f40813p;
        if (rectF3 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF3.right += (float) ((this.f40816s * 3) / 2);
        RectF rectF4 = this.f40813p;
        if (rectF4 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.f40816s * 3) / 2);
        RectF rectF5 = new RectF();
        this.f40810e = rectF5;
        RectF rectF6 = this.f40813p;
        if (rectF6 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.f40816s / 2));
        RectF rectF7 = this.f40810e;
        if (rectF7 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF8 = this.f40813p;
        if (rectF8 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.f40816s / 2));
        RectF rectF9 = this.f40810e;
        if (rectF9 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF10 = this.f40813p;
        if (rectF10 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.f40816s / 2));
        RectF rectF11 = this.f40810e;
        if (rectF11 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF12 = this.f40813p;
        if (rectF12 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.f40816s / 2));
        if (this.f40822y) {
            Paint paint = this.f40806a;
            if (paint == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.f40821x);
        }
        if (this.f40800B) {
            Paint paint2 = this.f40806a;
            if (paint2 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint2.setColor(this.f40820w);
            Paint paint3 = this.f40806a;
            if (paint3 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.f40806a;
            if (paint4 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.f40816s);
            Path path = this.f40807b;
            if (path == null) {
                C89219l.m154710a("mPath");
            }
            path.reset();
            Path path2 = this.f40807b;
            if (path2 == null) {
                C89219l.m154710a("mPath");
            }
            RectF rectF13 = this.f40810e;
            if (rectF13 == null) {
                C89219l.m154710a("mBorderRoundRect");
            }
            float f3 = f40794j;
            int i10 = this.f40816s;
            path2.addRoundRect(rectF13, ((float) (i10 / 2)) + f3, f3 + ((float) (i10 / 2)), Path.Direction.CW);
            if (this.f40802D) {
                Path path3 = this.f40807b;
                if (path3 == null) {
                    C89219l.m154710a("mPath");
                }
                Path path4 = this.f40809d;
                if (path4 == null) {
                    C89219l.m154710a("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f40811f;
                if (matrix9 == null) {
                    C89219l.m154710a("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.f40818u;
            if (canvas2 == null) {
                C89219l.m154710a("mCanvas");
            }
            Path path5 = this.f40807b;
            if (path5 == null) {
                C89219l.m154710a("mPath");
            }
            Paint paint5 = this.f40806a;
            if (paint5 == null) {
                C89219l.m154710a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.f40803E) {
                Paint paint6 = this.f40806a;
                if (paint6 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                paint6.setColor(C0643b.m2378c(getContext(), R.color.ae));
                Paint paint7 = this.f40806a;
                if (paint7 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                paint7.setStyle(Paint.Style.STROKE);
                Path path6 = this.f40807b;
                if (path6 == null) {
                    C89219l.m154710a("mPath");
                }
                path6.reset();
                if (this.f40802D) {
                    Path path7 = this.f40807b;
                    if (path7 == null) {
                        C89219l.m154710a("mPath");
                    }
                    Path path8 = this.f40809d;
                    if (path8 == null) {
                        C89219l.m154710a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f40811f;
                    if (matrix10 == null) {
                        C89219l.m154710a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f40807b;
                if (path9 == null) {
                    C89219l.m154710a("mPath");
                }
                RectF rectF14 = this.f40810e;
                if (rectF14 == null) {
                    C89219l.m154710a("mBorderRoundRect");
                }
                float f4 = f40794j;
                int i11 = this.f40816s;
                path9.addRoundRect(rectF14, ((float) (i11 / 2)) + f4, f4 + ((float) (i11 / 2)), Path.Direction.CW);
                Canvas canvas3 = this.f40818u;
                if (canvas3 == null) {
                    C89219l.m154710a("mCanvas");
                }
                Path path10 = this.f40807b;
                if (path10 == null) {
                    C89219l.m154710a("mPath");
                }
                Paint paint8 = this.f40806a;
                if (paint8 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f40806a;
        if (paint9 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint10 = this.f40806a;
        if (paint10 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint10.setColor(this.f40819v);
        Paint paint11 = this.f40806a;
        if (paint11 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        Path path11 = this.f40807b;
        if (path11 == null) {
            C89219l.m154710a("mPath");
        }
        path11.reset();
        Path path12 = this.f40807b;
        if (path12 == null) {
            C89219l.m154710a("mPath");
        }
        RectF rectF15 = this.f40813p;
        if (rectF15 == null) {
            C89219l.m154710a("mRoundRect");
        }
        float f5 = f40794j;
        path12.addRoundRect(rectF15, f5, f5, Path.Direction.CW);
        if (this.f40802D) {
            Path path13 = this.f40807b;
            if (path13 == null) {
                C89219l.m154710a("mPath");
            }
            Path path14 = this.f40808c;
            if (path14 == null) {
                C89219l.m154710a("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.f40818u;
        if (canvas4 == null) {
            C89219l.m154710a("mCanvas");
        }
        Path path15 = this.f40807b;
        if (path15 == null) {
            C89219l.m154710a("mPath");
        }
        Paint paint12 = this.f40806a;
        if (paint12 == null) {
            C89219l.m154710a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f40806a;
        if (paint13 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint13.setXfermode(null);
        Bitmap bitmap2 = this.f40817t;
        if (bitmap2 == null) {
            C89219l.m154715b();
        }
        canvas.drawBitmap(bitmap2, ((float) f40791g) - C13628n.m24520b(getContext(), 1.4f), ((float) f40791g) - C13628n.m24520b(getContext(), 1.3f), (Paint) null);
        MethodCollector.m26664o(13056);
    }

    /* renamed from: a */
    public final void mo27054a(int i, float f) {
        this.f40823z = f;
        this.f40799A = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C17154a(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C17154a(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13132);
        this.f40812o = 12.0f;
        this.f40821x = -16777216;
        this.f40823z = 0.75f;
        this.f40799A = 1;
        this.f40800B = true;
        this.f40802D = true;
        this.f40803E = true;
        this.f40804F = true;
        this.f40805G = 197.0f;
        C89219l.m154721d(context, "");
        this.f40816s = (int) C13628n.m24520b(context, 0.7f);
        f40791g = (int) C13628n.m24520b(context, 7.0f);
        f40793i = 2.0f;
        f40794j = C13628n.m24520b(context, 8.0f);
        f40795k = C13628n.m24520b(context, 3.0f);
        f40796l = (int) C13628n.m24520b(context, 40.0f);
        f40797m = (int) C13628n.m24520b(context, 56.0f);
        this.f40806a = new Paint();
        this.f40807b = new Path();
        this.f40809d = new Path();
        this.f40808c = new Path();
        Paint paint = this.f40806a;
        if (paint == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f40806a;
        if (paint2 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = this.f40806a;
        if (paint3 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f40806a;
        if (paint4 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint4.setStrokeWidth(f40793i);
        Paint paint5 = this.f40806a;
        if (paint5 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint5.setStrokeJoin(Paint.Join.MITER);
        this.f40819v = C0643b.m2378c(context, R.color.a26);
        this.f40820w = C0643b.m2378c(context, R.color.b4);
        Paint paint6 = this.f40806a;
        if (paint6 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint6.setColor(this.f40819v);
        Paint paint7 = this.f40806a;
        if (paint7 == null) {
            C89219l.m154710a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.f40822y) {
            Paint paint8 = this.f40806a;
            if (paint8 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.f40821x);
        }
        Path path = this.f40808c;
        if (path == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f40808c;
        if (path2 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        int i = f40791g;
        path2.lineTo((float) i, (float) (-i));
        Path path3 = this.f40808c;
        if (path3 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        int i2 = f40791g;
        path3.lineTo((float) i2, (float) i2);
        Path path4 = this.f40808c;
        if (path4 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f40809d;
        if (path5 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f40809d;
        if (path6 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        double d = (double) f40791g;
        double d2 = (double) this.f40816s;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        float f = (float) (d + (d2 * sqrt));
        double d3 = (double) (-f40791g);
        double d4 = (double) this.f40816s;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        path6.lineTo(f, (float) (d3 - (d4 * sqrt2)));
        Path path7 = this.f40809d;
        if (path7 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        double d5 = (double) f40791g;
        double d6 = (double) this.f40816s;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        Double.isNaN(d5);
        float f2 = (float) (d5 + (d6 * sqrt3));
        double d7 = (double) f40791g;
        double d8 = (double) this.f40816s;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        Double.isNaN(d7);
        path7.lineTo(f2, (float) (d7 + (d8 * sqrt4)));
        Path path8 = this.f40809d;
        if (path8 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.m26664o(13132);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int measuredWidth;
        char c;
        int measuredWidth2;
        int measuredHeight;
        int measureText;
        MethodCollector.m26663i(12962);
        super.onMeasure(i, i2);
        f40792h = (int) C13628n.m24520b(getContext(), this.f40812o + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.m26664o(12962);
                throw nullPointerException;
            }
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (textView != null) {
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > C13628n.m24520b(getContext(), this.f40805G)) {
                measureText = (int) C13628n.m24520b(getContext(), this.f40805G);
                c = 2;
            } else {
                measureText = (int) textView.getPaint().measureText(textView.getText().toString());
                c = 1;
            }
            measuredWidth = measureText + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            measuredWidth = getMeasuredWidth();
            c = 0;
        }
        if (this.f40804F) {
            int i3 = this.f40799A;
            if (i3 == 2 || i3 == 1) {
                int i4 = f40796l;
                if (measuredWidth > i4) {
                    i4 = (f40792h * 2) + measuredWidth;
                }
                measuredWidth2 = i4 + f40791g;
            } else {
                measuredWidth2 = f40796l;
                if (measuredWidth > measuredWidth2) {
                    measuredWidth2 = (f40792h * 2) + measuredWidth;
                }
            }
            if (c == 1) {
                measuredHeight = f40797m;
            } else {
                measuredHeight = f40797m + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            C89219l.m154716b(contentView, "");
            measuredWidth2 = contentView.getMeasuredWidth() + (f40791g * 3) + f40792h;
            View contentView2 = popupWindow.getContentView();
            C89219l.m154716b(contentView2, "");
            measuredHeight = contentView2.getMeasuredHeight() + (f40791g * 3) + f40792h;
        }
        int i5 = this.f40816s;
        int i6 = measuredWidth2 + (i5 * 3);
        int i7 = measuredHeight + (i5 * 3);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i6, i7);
            }
            setMeasuredDimension(i6, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i7);
                }
            }
            setMeasuredDimension(i6, size2);
        }
        this.f40814q = (float) (getMeasuredWidth() - (f40791g * 2));
        this.f40815r = (float) (getMeasuredHeight() - (f40791g * 2));
        MethodCollector.m26664o(12962);
    }
}
