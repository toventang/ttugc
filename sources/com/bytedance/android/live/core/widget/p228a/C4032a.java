package com.bytedance.android.live.core.widget.p228a;

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
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.core.widget.a.a */
public final class C4032a extends LinearLayout {

    /* renamed from: i */
    public static int f11067i;

    /* renamed from: j */
    public static int f11068j;

    /* renamed from: k */
    public static float f11069k;

    /* renamed from: l */
    public static float f11070l;

    /* renamed from: m */
    public static float f11071m;

    /* renamed from: n */
    public static int f11072n;

    /* renamed from: o */
    public static int f11073o;

    /* renamed from: p */
    public static final C4033a f11074p = new C4033a((byte) 0);

    /* renamed from: A */
    private boolean f11075A;

    /* renamed from: B */
    private boolean f11076B;

    /* renamed from: C */
    private boolean f11077C;

    /* renamed from: D */
    private boolean f11078D;

    /* renamed from: E */
    private boolean f11079E;

    /* renamed from: F */
    private boolean f11080F;

    /* renamed from: a */
    public Paint f11081a;

    /* renamed from: b */
    public Path f11082b;

    /* renamed from: c */
    public Path f11083c;

    /* renamed from: d */
    public Path f11084d;

    /* renamed from: e */
    public RectF f11085e;

    /* renamed from: f */
    public Matrix f11086f;

    /* renamed from: g */
    float f11087g;

    /* renamed from: h */
    int f11088h;

    /* renamed from: q */
    private float f11089q;

    /* renamed from: r */
    private RectF f11090r;

    /* renamed from: s */
    private float f11091s;

    /* renamed from: t */
    private float f11092t;

    /* renamed from: u */
    private int f11093u;

    /* renamed from: v */
    private Bitmap f11094v;

    /* renamed from: w */
    private Canvas f11095w;

    /* renamed from: x */
    private int f11096x;

    /* renamed from: y */
    private int f11097y;

    /* renamed from: z */
    private int f11098z;

    static {
        Covode.recordClassIndex(4573);
    }

    /* renamed from: com.bytedance.android.live.core.widget.a.a$a */
    public static final class C4033a {
        static {
            Covode.recordClassIndex(4574);
        }

        private C4033a() {
        }

        public /* synthetic */ C4033a(byte b) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.f11096x;
    }

    public final int getMBorderColor() {
        return this.f11097y;
    }

    public final int getMBorderWidth() {
        return this.f11093u;
    }

    public final float getMHeight() {
        return this.f11092t;
    }

    public final boolean getMNeedAddColor() {
        return this.f11079E;
    }

    public final boolean getMNeedArrow() {
        return this.f11078D;
    }

    public final boolean getMNeedPath() {
        return this.f11076B;
    }

    public final boolean getMNeedPressFade() {
        return this.f11077C;
    }

    public final boolean getMNeedShadow() {
        return this.f11075A;
    }

    public final float getMPadding() {
        return this.f11089q;
    }

    public final int getMShadowColor() {
        return this.f11098z;
    }

    public final float getMWidth() {
        return this.f11091s;
    }

    public final boolean getUseDefaultView() {
        return this.f11080F;
    }

    public final int getPADDING() {
        return f11067i / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f11084d;
        if (path == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f11086f;
        if (matrix == null) {
            C89219l.m154710a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f11085e;
        if (rectF == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f11083c;
        if (path == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f11081a;
        if (paint == null) {
            C89219l.m154710a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f11082b;
        if (path == null) {
            C89219l.m154710a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.f11087g, f11071m);
        int i = this.f11088h;
        if (i == 0) {
            return Math.min(max, this.f11091s - f11071m);
        }
        if (i == 1) {
            return Math.min(max, this.f11092t - f11071m);
        }
        if (i == 2) {
            return Math.min(max, this.f11092t - f11071m);
        }
        if (i != 3) {
            return 0.0f;
        }
        return Math.min(max, this.f11091s - f11071m);
    }

    public final void setBubbleOrientation(int i) {
        this.f11088h = i;
    }

    public final void setMBgColor(int i) {
        this.f11096x = i;
    }

    public final void setMBorderColor(int i) {
        this.f11097y = i;
    }

    public final void setMBorderWidth(int i) {
        this.f11093u = i;
    }

    public final void setMHeight(float f) {
        this.f11092t = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.f11079E = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.f11078D = z;
    }

    public final void setMNeedPath(boolean z) {
        this.f11076B = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.f11077C = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.f11075A = z;
    }

    public final void setMPadding(float f) {
        this.f11089q = f;
    }

    public final void setMShadowColor(int i) {
        this.f11098z = i;
    }

    public final void setMWidth(float f) {
        this.f11091s = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.f11079E = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.f11080F = z;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        C89219l.m154721d(path, "");
        this.f11084d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        C89219l.m154721d(matrix, "");
        this.f11086f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        C89219l.m154721d(rectF, "");
        this.f11085e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        C89219l.m154721d(path, "");
        this.f11083c = path;
    }

    public final void setMFillPaint(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f11081a = paint;
    }

    public final void setMPath(Path path) {
        C89219l.m154721d(path, "");
        this.f11082b = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4032a(Context context) {
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
        MethodCollector.m26663i(12533);
        C89219l.m154721d(canvas, "");
        if (this.f11094v == null) {
            this.f11094v = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f11094v;
            if (bitmap == null) {
                C89219l.m154715b();
            }
            this.f11095w = new Canvas(bitmap);
        }
        float f = this.f11091s;
        float f2 = this.f11092t;
        float max = Math.max(this.f11087g, f11071m);
        Matrix matrix = new Matrix();
        this.f11086f = new Matrix();
        int i = this.f11088h;
        if (i == 0) {
            float min = Math.min(max, f - f11071m);
            matrix.postRotate(90.0f);
            Matrix matrix2 = this.f11086f;
            if (matrix2 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix2.postRotate(90.0f);
            Matrix matrix3 = this.f11086f;
            if (matrix3 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i2 = this.f11093u;
            matrix3.postTranslate((((float) ((i2 * 3) / 2)) + min) - ((float) ((f11067i * 3) / 2)), ((float) i2) + 0.0f);
            setPadding(0, f11067i, 0, 0);
            setGravity(17);
            this.f11090r = new RectF(0.0f, (float) f11067i, this.f11091s, this.f11092t);
            int i3 = this.f11093u;
            matrix.postTranslate((min + ((float) ((i3 * 3) / 2))) - ((float) ((f11067i * 3) / 2)), ((float) ((i3 * 3) / 2)) + 0.0f);
        } else if (i == 1) {
            float min2 = Math.min(max, f2 - f11071m);
            setPadding(f11067i, 0, 0, 0);
            setGravity(17);
            Matrix matrix4 = this.f11086f;
            if (matrix4 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i4 = this.f11093u;
            matrix4.postTranslate(((float) i4) + 0.0f, (((float) (i4 * 2)) + min2) - ((float) ((f11067i * 3) / 2)));
            this.f11090r = new RectF((float) f11067i, 0.0f, this.f11091s, this.f11092t);
            int i5 = this.f11093u;
            matrix.postTranslate(((float) ((i5 * 3) / 2)) + 0.0f, (min2 + ((float) (i5 * 2))) - ((float) ((f11067i * 3) / 2)));
        } else if (i == 2) {
            float min3 = Math.min(max, f2 - f11071m);
            matrix.postRotate(180.0f);
            Matrix matrix5 = this.f11086f;
            if (matrix5 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix5.postRotate(180.0f);
            Matrix matrix6 = this.f11086f;
            if (matrix6 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i6 = this.f11093u;
            matrix6.postTranslate(((float) (i6 * 2)) + f, (((float) (i6 * 2)) + min3) - ((float) ((f11067i * 3) / 2)));
            setPadding(0, 0, f11067i, 0);
            setGravity(17);
            this.f11090r = new RectF(0.0f, 0.0f, this.f11091s - ((float) f11067i), this.f11092t);
            int i7 = this.f11093u;
            matrix.postTranslate(f + ((float) ((i7 * 3) / 2)), (min3 + ((float) (i7 * 2))) - ((float) ((f11067i * 3) / 2)));
        } else if (i == 3) {
            float min4 = Math.min(max, f - f11071m);
            matrix.postRotate(270.0f);
            Matrix matrix7 = this.f11086f;
            if (matrix7 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            matrix7.postRotate(270.0f);
            Matrix matrix8 = this.f11086f;
            if (matrix8 == null) {
                C89219l.m154710a("mBorderMatrix");
            }
            int i8 = this.f11093u;
            matrix8.postTranslate((((float) ((i8 * 3) / 2)) + min4) - ((float) ((f11067i * 3) / 2)), ((float) (i8 * 2)) + f2);
            setPadding(0, 0, 0, f11067i);
            setGravity(17);
            this.f11090r = new RectF(0.0f, 0.0f, this.f11091s, this.f11092t - ((float) f11067i));
            int i9 = this.f11093u;
            matrix.postTranslate((min4 + ((float) ((i9 * 3) / 2))) - ((float) ((f11067i * 3) / 2)), f2 + ((float) ((i9 * 3) / 2)));
        }
        RectF rectF = this.f11090r;
        if (rectF == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF.left += (float) ((this.f11093u * 3) / 2);
        RectF rectF2 = this.f11090r;
        if (rectF2 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF2.top += (float) ((this.f11093u * 3) / 2);
        RectF rectF3 = this.f11090r;
        if (rectF3 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF3.right += (float) ((this.f11093u * 3) / 2);
        RectF rectF4 = this.f11090r;
        if (rectF4 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.f11093u * 3) / 2);
        RectF rectF5 = new RectF();
        this.f11085e = rectF5;
        RectF rectF6 = this.f11090r;
        if (rectF6 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.f11093u / 2));
        RectF rectF7 = this.f11085e;
        if (rectF7 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF8 = this.f11090r;
        if (rectF8 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.f11093u / 2));
        RectF rectF9 = this.f11085e;
        if (rectF9 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF10 = this.f11090r;
        if (rectF10 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.f11093u / 2));
        RectF rectF11 = this.f11085e;
        if (rectF11 == null) {
            C89219l.m154710a("mBorderRoundRect");
        }
        RectF rectF12 = this.f11090r;
        if (rectF12 == null) {
            C89219l.m154710a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.f11093u / 2));
        if (this.f11075A) {
            Paint paint = this.f11081a;
            if (paint == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.f11098z);
        }
        if (this.f11076B) {
            Paint paint2 = this.f11081a;
            if (paint2 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint2.setColor(this.f11097y);
            Paint paint3 = this.f11081a;
            if (paint3 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.f11081a;
            if (paint4 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.f11093u);
            Path path = this.f11082b;
            if (path == null) {
                C89219l.m154710a("mPath");
            }
            path.reset();
            Path path2 = this.f11082b;
            if (path2 == null) {
                C89219l.m154710a("mPath");
            }
            RectF rectF13 = this.f11085e;
            if (rectF13 == null) {
                C89219l.m154710a("mBorderRoundRect");
            }
            float f3 = f11070l;
            int i10 = this.f11093u;
            path2.addRoundRect(rectF13, ((float) (i10 / 2)) + f3, f3 + ((float) (i10 / 2)), Path.Direction.CW);
            if (this.f11078D) {
                Path path3 = this.f11082b;
                if (path3 == null) {
                    C89219l.m154710a("mPath");
                }
                Path path4 = this.f11084d;
                if (path4 == null) {
                    C89219l.m154710a("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f11086f;
                if (matrix9 == null) {
                    C89219l.m154710a("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.f11095w;
            if (canvas2 == null) {
                C89219l.m154710a("mCanvas");
            }
            Path path5 = this.f11082b;
            if (path5 == null) {
                C89219l.m154710a("mPath");
            }
            Paint paint5 = this.f11081a;
            if (paint5 == null) {
                C89219l.m154710a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.f11079E) {
                Paint paint6 = this.f11081a;
                if (paint6 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                paint6.setColor(getResources().getColor(R.color.a1r));
                Paint paint7 = this.f11081a;
                if (paint7 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                paint7.setStyle(Paint.Style.STROKE);
                Path path6 = this.f11082b;
                if (path6 == null) {
                    C89219l.m154710a("mPath");
                }
                path6.reset();
                if (this.f11078D) {
                    Path path7 = this.f11082b;
                    if (path7 == null) {
                        C89219l.m154710a("mPath");
                    }
                    Path path8 = this.f11084d;
                    if (path8 == null) {
                        C89219l.m154710a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f11086f;
                    if (matrix10 == null) {
                        C89219l.m154710a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f11082b;
                if (path9 == null) {
                    C89219l.m154710a("mPath");
                }
                RectF rectF14 = this.f11085e;
                if (rectF14 == null) {
                    C89219l.m154710a("mBorderRoundRect");
                }
                float f4 = f11070l;
                int i11 = this.f11093u;
                path9.addRoundRect(rectF14, ((float) (i11 / 2)) + f4, f4 + ((float) (i11 / 2)), Path.Direction.CW);
                Canvas canvas3 = this.f11095w;
                if (canvas3 == null) {
                    C89219l.m154710a("mCanvas");
                }
                Path path10 = this.f11082b;
                if (path10 == null) {
                    C89219l.m154710a("mPath");
                }
                Paint paint8 = this.f11081a;
                if (paint8 == null) {
                    C89219l.m154710a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f11081a;
        if (paint9 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint10 = this.f11081a;
        if (paint10 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint10.setColor(this.f11096x);
        Paint paint11 = this.f11081a;
        if (paint11 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        Path path11 = this.f11082b;
        if (path11 == null) {
            C89219l.m154710a("mPath");
        }
        path11.reset();
        Path path12 = this.f11082b;
        if (path12 == null) {
            C89219l.m154710a("mPath");
        }
        RectF rectF15 = this.f11090r;
        if (rectF15 == null) {
            C89219l.m154710a("mRoundRect");
        }
        float f5 = f11070l;
        path12.addRoundRect(rectF15, f5, f5, Path.Direction.CW);
        if (this.f11078D) {
            Path path13 = this.f11082b;
            if (path13 == null) {
                C89219l.m154710a("mPath");
            }
            Path path14 = this.f11083c;
            if (path14 == null) {
                C89219l.m154710a("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.f11095w;
        if (canvas4 == null) {
            C89219l.m154710a("mCanvas");
        }
        Path path15 = this.f11082b;
        if (path15 == null) {
            C89219l.m154710a("mPath");
        }
        Paint paint12 = this.f11081a;
        if (paint12 == null) {
            C89219l.m154710a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f11081a;
        if (paint13 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint13.setXfermode(null);
        Bitmap bitmap2 = this.f11094v;
        if (bitmap2 == null) {
            C89219l.m154715b();
        }
        canvas.drawBitmap(bitmap2, ((float) f11067i) - C13628n.m24520b(getContext(), 1.4f), ((float) f11067i) - C13628n.m24520b(getContext(), 1.3f), (Paint) null);
        MethodCollector.m26664o(12533);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C4032a(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C4032a(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12637);
        this.f11089q = 12.0f;
        this.f11098z = -16777216;
        this.f11087g = 0.75f;
        this.f11088h = 1;
        this.f11076B = true;
        this.f11078D = true;
        this.f11079E = true;
        this.f11080F = true;
        C89219l.m154721d(context, "");
        this.f11093u = (int) C13628n.m24520b(context, 0.7f);
        f11067i = (int) C13628n.m24520b(context, 7.0f);
        f11069k = 2.0f;
        f11070l = C13628n.m24520b(context, 8.0f);
        f11071m = C13628n.m24520b(context, 3.0f);
        f11072n = (int) C13628n.m24520b(context, 40.0f);
        f11073o = (int) C13628n.m24520b(context, 56.0f);
        this.f11081a = new Paint();
        this.f11082b = new Path();
        this.f11084d = new Path();
        this.f11083c = new Path();
        Paint paint = this.f11081a;
        if (paint == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f11081a;
        if (paint2 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = this.f11081a;
        if (paint3 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f11081a;
        if (paint4 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint4.setStrokeWidth(f11069k);
        Paint paint5 = this.f11081a;
        if (paint5 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint5.setStrokeJoin(Paint.Join.MITER);
        this.f11096x = getResources().getColor(R.color.a1p);
        this.f11097y = getResources().getColor(R.color.a10);
        Paint paint6 = this.f11081a;
        if (paint6 == null) {
            C89219l.m154710a("mFillPaint");
        }
        paint6.setColor(this.f11096x);
        Paint paint7 = this.f11081a;
        if (paint7 == null) {
            C89219l.m154710a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.f11075A) {
            Paint paint8 = this.f11081a;
            if (paint8 == null) {
                C89219l.m154710a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.f11098z);
        }
        Path path = this.f11083c;
        if (path == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f11083c;
        if (path2 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        int i = f11067i;
        path2.lineTo((float) i, (float) (-i));
        Path path3 = this.f11083c;
        if (path3 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        int i2 = f11067i;
        path3.lineTo((float) i2, (float) i2);
        Path path4 = this.f11083c;
        if (path4 == null) {
            C89219l.m154710a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f11084d;
        if (path5 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f11084d;
        if (path6 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        double d = (double) f11067i;
        double d2 = (double) this.f11093u;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        float f = (float) (d + (d2 * sqrt));
        double d3 = (double) (-f11067i);
        double d4 = (double) this.f11093u;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        path6.lineTo(f, (float) (d3 - (d4 * sqrt2)));
        Path path7 = this.f11084d;
        if (path7 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        double d5 = (double) f11067i;
        double d6 = (double) this.f11093u;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        Double.isNaN(d5);
        float f2 = (float) (d5 + (d6 * sqrt3));
        double d7 = (double) f11067i;
        double d8 = (double) this.f11093u;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        Double.isNaN(d7);
        path7.lineTo(f2, (float) (d7 + (d8 * sqrt4)));
        Path path8 = this.f11084d;
        if (path8 == null) {
            C89219l.m154710a("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
        MethodCollector.m26664o(12637);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int measuredWidth;
        char c;
        int measuredWidth2;
        int measuredHeight;
        int measureText;
        MethodCollector.m26663i(12420);
        super.onMeasure(i, i2);
        f11068j = (int) C13628n.m24520b(getContext(), this.f11089q + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.m26664o(12420);
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
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > C13628n.m24520b(getContext(), 197.0f)) {
                measureText = (int) C13628n.m24520b(getContext(), 197.0f);
                String obj = textView.getText().toString();
                if (C89361p.m154929e((CharSequence) obj, (CharSequence) "\n")) {
                    TextPaint paint = textView.getPaint();
                    int a = C89361p.m154888a((CharSequence) obj, "\n", 0, false, 6);
                    if (obj != null) {
                        String substring = obj.substring(0, a);
                        C89219l.m154716b(substring, "");
                        int measureText2 = (int) paint.measureText(substring);
                        if (measureText2 < measureText) {
                            measureText = measureText2;
                        }
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.m26664o(12420);
                        throw nullPointerException2;
                    }
                }
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
        if (this.f11080F) {
            int i3 = this.f11088h;
            if (i3 == 2 || i3 == 1) {
                int i4 = f11072n;
                if (measuredWidth > i4) {
                    i4 = (f11068j * 2) + measuredWidth;
                }
                measuredWidth2 = i4 + f11067i;
            } else {
                measuredWidth2 = f11072n;
                if (measuredWidth > measuredWidth2) {
                    measuredWidth2 = (f11068j * 2) + measuredWidth;
                }
            }
            if (c == 1) {
                measuredHeight = f11073o;
            } else {
                measuredHeight = f11073o + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            C89219l.m154716b(contentView, "");
            measuredWidth2 = contentView.getMeasuredWidth() + (f11067i * 3) + f11068j;
            View contentView2 = popupWindow.getContentView();
            C89219l.m154716b(contentView2, "");
            measuredHeight = contentView2.getMeasuredHeight() + (f11067i * 3) + f11068j;
        }
        int i5 = this.f11093u;
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
        this.f11091s = (float) (getMeasuredWidth() - (f11067i * 2));
        this.f11092t = (float) (getMeasuredHeight() - (f11067i * 2));
        MethodCollector.m26664o(12420);
    }
}
