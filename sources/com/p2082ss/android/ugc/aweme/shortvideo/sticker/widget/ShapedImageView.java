package com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ShapedImageView */
public final class ShapedImageView extends SimpleDraweeView {

    /* renamed from: a */
    public static final C73094a f164036a = new C73094a((byte) 0);

    /* renamed from: b */
    private int f164037b;

    /* renamed from: c */
    private float f164038c;

    /* renamed from: d */
    private int f164039d = 637534208;

    /* renamed from: e */
    private float f164040e;

    /* renamed from: f */
    private boolean f164041f;

    /* renamed from: g */
    private final Path f164042g = new Path();

    /* renamed from: h */
    private Shape f164043h;

    /* renamed from: i */
    private Shape f164044i;

    /* renamed from: j */
    private final Paint f164045j;

    /* renamed from: k */
    private final Paint f164046k;

    /* renamed from: l */
    private final Paint f164047l;

    /* renamed from: m */
    private Bitmap f164048m;

    /* renamed from: n */
    private AbstractC73095b f164049n;

    /* renamed from: o */
    private PorterDuffXfermode f164050o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ShapedImageView$b */
    public interface AbstractC73095b {
        static {
            Covode.recordClassIndex(85803);
        }
    }

    static {
        Covode.recordClassIndex(85801);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.ShapedImageView$a */
    public static final class C73094a {
        static {
            Covode.recordClassIndex(85802);
        }

        private C73094a() {
        }

        public /* synthetic */ C73094a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final void m129055b() {
        Bitmap bitmap = this.f164048m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f164048m = null;
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f164048m == null) {
            m129053a();
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m129055b();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    private final Bitmap m129053a() {
        MethodCollector.m26663i(5796);
        if (this.f164040e <= 0.0f) {
            MethodCollector.m26664o(5796);
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            MethodCollector.m26664o(5796);
            return null;
        }
        m129055b();
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        this.f164048m = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(this.f164039d);
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
        Bitmap bitmap = this.f164048m;
        MethodCollector.m26664o(5796);
        return bitmap;
    }

    public final void setExtension(AbstractC73095b bVar) {
        this.f164049n = bVar;
        requestLayout();
    }

    public final void setShapeMode(int i) {
        m129056b(i, this.f164038c);
    }

    public final void setShapeRadius(float f) {
        m129056b(this.f164037b, f);
    }

    public final void setStrokeColor(int i) {
        m129054a(i, this.f164040e);
    }

    public final void setStrokeWidth(float f) {
        m129054a(this.f164039d, f);
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDraw(Canvas canvas) {
        Shape shape;
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        Bitmap bitmap = this.f164048m;
        if (!(this.f164040e <= 0.0f || this.f164044i == null || bitmap == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            Paint paint = this.f164046k;
            if (paint == null) {
                C89219l.m154715b();
            }
            paint.setXfermode(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f164046k);
            float f = this.f164040e;
            canvas.translate(f, f);
            if (this.f164050o == null) {
                this.f164050o = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            Paint paint2 = this.f164046k;
            if (paint2 == null) {
                C89219l.m154715b();
            }
            paint2.setXfermode(this.f164050o);
            Shape shape2 = this.f164044i;
            if (shape2 == null) {
                C89219l.m154715b();
            }
            shape2.draw(canvas, this.f164046k);
            canvas.restoreToCount(saveLayer);
        }
        if (this.f164049n != null) {
            canvas.drawPath(this.f164042g, this.f164047l);
        }
        int i = this.f164037b;
        if ((i == 1 || i == 2) && (shape = this.f164043h) != null) {
            shape.draw(canvas, this.f164045j);
        }
    }

    /* renamed from: b */
    private void m129056b(int i, float f) {
        boolean z;
        if (this.f164037b == i && this.f164038c == f) {
            z = false;
        } else {
            z = true;
        }
        this.f164041f = z;
        if (z) {
            this.f164037b = i;
            this.f164038c = f;
            this.f164043h = null;
            this.f164044i = null;
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m129054a(int i, float f) {
        float f2 = this.f164040e;
        if (f2 > 0.0f) {
            if (f2 != f) {
                this.f164040e = f;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Shape shape = this.f164044i;
                if (shape == null) {
                    C89219l.m154715b();
                }
                float f3 = this.f164040e;
                shape.resize(((float) measuredWidth) - (f3 * 2.0f), ((float) measuredHeight) - (f3 * 2.0f));
                postInvalidate();
            }
            if (this.f164039d != i) {
                this.f164039d = i;
                m129053a();
                postInvalidate();
            }
        }
    }

    public ShapedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f164045j = paint;
        Paint paint2 = new Paint(1);
        this.f164046k = paint2;
        Paint paint3 = new Paint(1);
        this.f164047l = paint3;
        int i = Build.VERSION.SDK_INT;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f164037b = obtainStyledAttributes.getInt(16, 0);
            this.f164038c = obtainStyledAttributes.getDimension(15, 0.0f);
            this.f164040e = obtainStyledAttributes.getDimension(18, 0.0f);
            this.f164039d = obtainStyledAttributes.getColor(17, this.f164039d);
            obtainStyledAttributes.recycle();
        }
        paint.setFilterBitmap(true);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        paint2.setColor(-16777216);
        paint3.setFilterBitmap(true);
        paint3.setColor(-16777216);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.f164041f) {
            this.f164041f = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f164037b == 2) {
                this.f164038c = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
            }
            if (this.f164043h == null || this.f164038c != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f164038c);
                this.f164043h = new RoundRectShape(fArr, null, null);
                this.f164044i = new RoundRectShape(fArr, null, null);
            }
            Shape shape = this.f164043h;
            if (shape == null) {
                C89219l.m154715b();
            }
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            shape.resize(f, f2);
            Shape shape2 = this.f164044i;
            if (shape2 == null) {
                C89219l.m154715b();
            }
            float f3 = this.f164040e;
            shape2.resize(f - (f3 * 2.0f), f2 - (f3 * 2.0f));
            m129053a();
            AbstractC73095b bVar = this.f164049n;
        }
    }
}
