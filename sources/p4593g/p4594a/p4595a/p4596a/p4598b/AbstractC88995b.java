package p4593g.p4594a.p4595a.p4596a.p4598b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import p4593g.p4594a.p4595a.p4596a.p4597a.AbstractC88988b;
import p4593g.p4594a.p4595a.p4596a.p4597a.C88987a;
import p4593g.p4594a.p4595a.p4596a.p4598b.p4599a.C88994a;

/* renamed from: g.a.a.a.b.b */
public abstract class AbstractC88995b extends ImageView {

    /* renamed from: a */
    private float f202079a;

    /* renamed from: b */
    private float f202080b;

    /* renamed from: c */
    private boolean f202081c;

    /* renamed from: d */
    private boolean f202082d;

    /* renamed from: e */
    private int f202083e;

    /* renamed from: f */
    private int f202084f;

    /* renamed from: g */
    private PointF f202085g;

    /* renamed from: h */
    private boolean f202086h;

    /* renamed from: i */
    private boolean f202087i;

    /* renamed from: j */
    private AbstractC89000b f202088j;

    /* renamed from: k */
    private AbstractC89001c f202089k;

    /* renamed from: m */
    protected AbstractC88988b f202090m;

    /* renamed from: n */
    protected Matrix f202091n;

    /* renamed from: o */
    protected Matrix f202092o;

    /* renamed from: p */
    protected Matrix f202093p;

    /* renamed from: q */
    protected Handler f202094q;

    /* renamed from: r */
    protected Runnable f202095r;

    /* renamed from: s */
    protected boolean f202096s;

    /* renamed from: t */
    protected final Matrix f202097t;

    /* renamed from: u */
    protected final float[] f202098u;

    /* renamed from: v */
    protected EnumC88999a f202099v;

    /* renamed from: w */
    protected final int f202100w;

    /* renamed from: x */
    protected RectF f202101x;

    /* renamed from: y */
    protected RectF f202102y;

    /* renamed from: z */
    protected RectF f202103z;

    /* renamed from: g.a.a.a.b.b$b */
    public interface AbstractC89000b {
        static {
            Covode.recordClassIndex(105042);
        }
    }

    /* renamed from: g.a.a.a.b.b$c */
    public interface AbstractC89001c {
        static {
            Covode.recordClassIndex(105043);
        }
    }

    static {
        Covode.recordClassIndex(105037);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo143308a(float f) {
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public PointF getCenter() {
        return this.f202085g;
    }

    public EnumC88999a getDisplayType() {
        return this.f202099v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo143310a(Drawable drawable, Matrix matrix, float f, float f2) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.f202091n.reset();
            super.setImageDrawable(null);
        }
        if (f == -1.0f || f2 == -1.0f) {
            this.f202080b = -1.0f;
            this.f202079a = -1.0f;
            this.f202082d = false;
            this.f202081c = false;
        } else {
            float min = Math.min(f, f2);
            float max = Math.max(min, f2);
            this.f202080b = min;
            this.f202079a = max;
            this.f202082d = true;
            this.f202081c = true;
            if (this.f202099v == EnumC88999a.FIT_TO_SCREEN || this.f202099v == EnumC88999a.FIT_IF_BIGGER) {
                if (this.f202080b >= 1.0f) {
                    this.f202082d = false;
                    this.f202080b = -1.0f;
                }
                if (this.f202079a <= 1.0f) {
                    this.f202081c = true;
                    this.f202079a = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f202093p = new Matrix(matrix);
        }
        this.f202087i = true;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143344a(RectF rectF, RectF rectF2) {
        if (rectF != null) {
            if (rectF.top >= 0.0f && rectF.bottom <= ((float) this.f202084f)) {
                rectF2.top = 0.0f;
            }
            if (rectF.left >= 0.0f && rectF.right <= ((float) this.f202083e)) {
                rectF2.left = 0.0f;
            }
            if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > ((float) this.f202084f)) {
                rectF2.top = (float) ((int) (0.0f - rectF.top));
            }
            if (rectF.bottom + rectF2.top <= ((float) (this.f202084f + 0)) && rectF.top < 0.0f) {
                rectF2.top = (float) ((int) (((float) (this.f202084f + 0)) - rectF.bottom));
            }
            if (rectF.left + rectF2.left >= 0.0f) {
                rectF2.left = (float) ((int) (0.0f - rectF.left));
            }
            int i = this.f202083e;
            if (rectF.right + rectF2.left <= ((float) (i + 0))) {
                rectF2.left = (float) ((int) (((float) (i + 0)) - rectF.right));
            }
        }
    }

    public float getBaseScale() {
        return m154392c(this.f202091n);
    }

    public RectF getBitmapRect() {
        return m154394d(this.f202092o);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f202092o);
    }

    public Matrix getImageViewMatrix() {
        return m154390b(this.f202092o);
    }

    public float getScale() {
        return m154392c(this.f202092o);
    }

    /* renamed from: g.a.a.a.b.b$a */
    public enum EnumC88999a {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER;

        static {
            Covode.recordClassIndex(105041);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo143345b() {
        if (getDrawable() != null) {
            RectF a = mo143339a(this.f202092o);
            if (a.left != 0.0f || a.top != 0.0f) {
                mo143307a(a.left, a.top);
            }
        }
    }

    public float getMaxScale() {
        float max;
        if (this.f202079a == -1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                max = 1.0f;
            } else {
                max = Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f202083e), ((float) drawable.getIntrinsicHeight()) / ((float) this.f202084f)) * 8.0f;
            }
            this.f202079a = max;
        }
        return this.f202079a;
    }

    public float getMinScale() {
        if (this.f202080b == -1.0f) {
            float f = 1.0f;
            if (getDrawable() != null) {
                f = Math.min(1.0f, 1.0f / m154392c(this.f202091n));
            }
            this.f202080b = f;
        }
        return this.f202080b;
    }

    /* renamed from: a */
    public final void mo143340a() {
        this.f202092o = new Matrix();
        float a = m154388a(this.f202099v);
        setImageMatrix(getImageViewMatrix());
        if (a != getScale()) {
            m154393c(a);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void setMaxScale(float f) {
        this.f202079a = f;
    }

    /* access modifiers changed from: protected */
    public void setMinScale(float f) {
        this.f202080b = f;
    }

    public void setOnDrawableChangedListener(AbstractC89000b bVar) {
        this.f202088j = bVar;
    }

    public void setOnLayoutChangeListener(AbstractC89001c cVar) {
        this.f202089k = cVar;
    }

    public void setImageDrawable(Drawable drawable) {
        mo143347b(drawable, null, -1.0f, -1.0f);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    /* renamed from: b */
    private Matrix m154390b(Matrix matrix) {
        this.f202097t.set(this.f202091n);
        this.f202097t.postConcat(matrix);
        return this.f202097t;
    }

    /* renamed from: c */
    private float m154392c(Matrix matrix) {
        matrix.getValues(this.f202098u);
        return this.f202098u[0];
    }

    public void setDisplayType(EnumC88999a aVar) {
        if (aVar != this.f202099v) {
            this.f202096s = false;
            this.f202099v = aVar;
            this.f202086h = true;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    private float m154388a(EnumC88999a aVar) {
        if (aVar == EnumC88999a.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (aVar == EnumC88999a.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / m154392c(this.f202091n));
        }
        return 1.0f / m154392c(this.f202091n);
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            mo143347b(new C88994a(bitmap), null, -1.0f, -1.0f);
        } else {
            mo143347b(null, null, -1.0f, -1.0f);
        }
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if (matrix == null) {
            imageMatrix.isIdentity();
        } else {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    /* renamed from: c */
    private void m154393c(float f) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        PointF center = getCenter();
        mo143342a(f, center.x, center.y);
    }

    /* renamed from: d */
    private RectF m154394d(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix b = m154390b(matrix);
        this.f202101x.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        b.mapRect(this.f202101x);
        return this.f202101x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RectF mo143339a(Matrix matrix) {
        float f;
        float f2;
        float f3;
        if (getDrawable() == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f202102y.set(0.0f, 0.0f, 0.0f, 0.0f);
        RectF d = m154394d(matrix);
        float height = d.height();
        float width = d.width();
        float f4 = (float) this.f202084f;
        if (height < f4) {
            f = ((f4 - height) / 2.0f) - d.top;
        } else if (d.top > 0.0f) {
            f = -d.top;
        } else if (d.bottom < f4) {
            f = ((float) this.f202084f) - d.bottom;
        } else {
            f = 0.0f;
        }
        float f5 = (float) this.f202083e;
        if (width < f5) {
            f5 = (f5 - width) / 2.0f;
            f3 = d.left;
        } else {
            if (d.left > 0.0f) {
                f2 = -d.left;
            } else if (d.right < f5) {
                f3 = d.right;
            } else {
                f2 = 0.0f;
            }
            this.f202102y.set(f2, f, 0.0f, 0.0f);
            return this.f202102y;
        }
        f2 = f5 - f3;
        this.f202102y.set(f2, f, 0.0f, 0.0f);
        return this.f202102y;
    }

    /* renamed from: b */
    public final void mo143346b(float f) {
        PointF center = getCenter();
        mo143343a(f, center.x, center.y, 50.0f);
    }

    public AbstractC88995b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: c */
    public final void mo143348c(float f, float f2) {
        mo143341a((double) f, (double) f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo143349d(float f, float f2) {
        final double d = (double) f;
        final double d2 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        this.f202094q.post(new Runnable() {
            /* class p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b.RunnableC889972 */

            /* renamed from: a */
            double f202109a;

            /* renamed from: b */
            double f202110b;

            /* renamed from: c */
            final /* synthetic */ double f202111c = 300.0d;

            static {
                Covode.recordClassIndex(105039);
            }

            public final void run() {
                double min = Math.min(this.f202111c, (double) (System.currentTimeMillis() - currentTimeMillis));
                double a = AbstractC88995b.this.f202090m.mo143305a(min, d, this.f202111c);
                double a2 = AbstractC88995b.this.f202090m.mo143305a(min, d2, this.f202111c);
                AbstractC88995b.this.mo143341a(a - this.f202109a, a2 - this.f202110b);
                this.f202109a = a;
                this.f202110b = a2;
                if (min < this.f202111c) {
                    AbstractC88995b.this.f202094q.post(this);
                    return;
                }
                AbstractC88995b bVar = AbstractC88995b.this;
                RectF a3 = bVar.mo143339a(bVar.f202092o);
                if (a3.left != 0.0f || a3.top != 0.0f) {
                    AbstractC88995b.this.mo143348c(a3.left, a3.top);
                }
            }
        });
    }

    /* renamed from: a */
    private void mo143307a(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f202092o.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143341a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f202103z.set((float) d, (float) d2, 0.0f, 0.0f);
        mo143344a(bitmapRect, this.f202103z);
        mo143307a(this.f202103z.left, this.f202103z.top);
        mo143345b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo143309a(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: b */
    private void m154391b(float f, float f2, float f3) {
        this.f202092o.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    public AbstractC88995b(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f202090m = new C88987a();
        this.f202091n = new Matrix();
        this.f202092o = new Matrix();
        this.f202094q = new Handler();
        this.f202095r = null;
        this.f202096s = false;
        this.f202079a = -1.0f;
        this.f202080b = -1.0f;
        this.f202097t = new Matrix();
        this.f202098u = new float[9];
        this.f202083e = -1;
        this.f202084f = -1;
        this.f202085g = new PointF();
        this.f202099v = EnumC88999a.NONE;
        this.f202100w = 200;
        this.f202101x = new RectF();
        this.f202102y = new RectF();
        this.f202103z = new RectF();
        mo143309a(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143342a(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        m154391b(f / getScale(), f2, f3);
        getScale();
        mo143345b();
    }

    /* renamed from: b */
    public final void mo143347b(final Drawable drawable, final Matrix matrix, final float f, final float f2) {
        if (getWidth() <= 0) {
            this.f202095r = new Runnable() {
                /* class p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b.RunnableC889961 */

                static {
                    Covode.recordClassIndex(105038);
                }

                public final void run() {
                    AbstractC88995b.this.mo143347b(drawable, matrix, f, f2);
                }
            };
        } else {
            mo143310a(drawable, matrix, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143343a(float f, float f2, float f3, final float f4) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f202092o);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo143339a(matrix);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        this.f202094q.post(new Runnable() {
            /* class p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b.RunnableC889983 */

            static {
                Covode.recordClassIndex(105040);
            }

            public final void run() {
                float min = Math.min(f4, (float) (System.currentTimeMillis() - currentTimeMillis));
                AbstractC88995b.this.mo143342a(scale + ((float) AbstractC88995b.this.f202090m.mo143306b((double) min, (double) f5, (double) f4)), f6, f7);
                if (min < f4) {
                    AbstractC88995b.this.f202094q.post(this);
                    return;
                }
                AbstractC88995b bVar = AbstractC88995b.this;
                bVar.mo143308a(bVar.getScale());
                AbstractC88995b.this.mo143345b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r7 != getScale()) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b.onLayout(boolean, int, int, int, int):void");
    }
}
