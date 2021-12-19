package com.p2082ss.android.ugc.aweme.shortvideo.widget;

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
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView */
public class ShapedRemoteImageView extends RemoteImageView {

    /* renamed from: a */
    private int f166949a;

    /* renamed from: b */
    private float f166950b;

    /* renamed from: c */
    private int f166951c = 637534208;

    /* renamed from: d */
    private float f166952d;

    /* renamed from: e */
    private boolean f166953e;

    /* renamed from: f */
    private Path f166954f;

    /* renamed from: g */
    private Shape f166955g;

    /* renamed from: h */
    private Shape f166956h;

    /* renamed from: i */
    private Paint f166957i;

    /* renamed from: j */
    private Paint f166958j;

    /* renamed from: k */
    private Paint f166959k;

    /* renamed from: l */
    private Bitmap f166960l;

    /* renamed from: m */
    private AbstractC74259a f166961m;

    /* renamed from: n */
    private PorterDuffXfermode f166962n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView$a */
    public interface AbstractC74259a {
        static {
            Covode.recordClassIndex(87027);
        }
    }

    static {
        Covode.recordClassIndex(87026);
    }

    /* renamed from: c */
    private void m130641c() {
        Bitmap bitmap = this.f166960l;
        if (bitmap != null) {
            bitmap.recycle();
            this.f166960l = null;
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f166960l == null) {
            m130639b();
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m130641c();
        C58030k.m104850a(this);
    }

    /* renamed from: b */
    private Bitmap m130639b() {
        MethodCollector.m26663i(11972);
        if (this.f166952d <= 0.0f) {
            MethodCollector.m26664o(11972);
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            MethodCollector.m26664o(11972);
            return null;
        }
        m130641c();
        this.f166960l = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f166960l);
        Paint paint = new Paint(1);
        paint.setColor(this.f166951c);
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
        Bitmap bitmap = this.f166960l;
        MethodCollector.m26664o(11972);
        return bitmap;
    }

    public void setExtension(AbstractC74259a aVar) {
        this.f166961m = aVar;
        requestLayout();
    }

    public void setShapeMode(int i) {
        m130640b(i, this.f166950b);
    }

    public void setShapeRadius(float f) {
        m130640b(this.f166949a, f);
    }

    public void setStrokeColor(int i) {
        m130638a(i, this.f166952d);
    }

    public void setStrokeWidth(float f) {
        m130638a(this.f166951c, f);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        Shape shape;
        super.onDraw(canvas);
        if (!(this.f166952d <= 0.0f || this.f166956h == null || this.f166960l == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            this.f166958j.setXfermode(null);
            canvas.drawBitmap(this.f166960l, 0.0f, 0.0f, this.f166958j);
            float f = this.f166952d;
            canvas.translate(f, f);
            if (this.f166962n == null) {
                this.f166962n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.f166958j.setXfermode(this.f166962n);
            this.f166956h.draw(canvas, this.f166958j);
            canvas.restoreToCount(saveLayer);
        }
        if (this.f166961m != null) {
            canvas.drawPath(this.f166954f, this.f166959k);
        }
        int i = this.f166949a;
        if ((i == 1 || i == 2) && (shape = this.f166955g) != null) {
            shape.draw(canvas, this.f166957i);
        }
    }

    /* renamed from: b */
    private void m130640b(int i, float f) {
        boolean z;
        if (this.f166949a == i && this.f166950b == f) {
            z = false;
        } else {
            z = true;
        }
        this.f166953e = z;
        if (z) {
            this.f166949a = i;
            this.f166950b = f;
            this.f166955g = null;
            this.f166956h = null;
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m130638a(int i, float f) {
        float f2 = this.f166952d;
        if (f2 > 0.0f) {
            if (f2 != f) {
                this.f166952d = f;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Shape shape = this.f166956h;
                float f3 = this.f166952d;
                shape.resize(((float) measuredWidth) - (f3 * 2.0f), ((float) measuredHeight) - (f3 * 2.0f));
                postInvalidate();
            }
            if (this.f166951c != i) {
                this.f166951c = i;
                m130639b();
                postInvalidate();
            }
        }
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = Build.VERSION.SDK_INT;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa5, R.attr.abp, R.attr.afn, R.attr.afo});
            this.f166949a = obtainStyledAttributes.getInt(1, 0);
            this.f166950b = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f166952d = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f166951c = obtainStyledAttributes.getColor(2, this.f166951c);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f166957i = paint;
        paint.setFilterBitmap(true);
        this.f166957i.setColor(-16777216);
        this.f166957i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f166958j = paint2;
        paint2.setFilterBitmap(true);
        this.f166958j.setColor(-16777216);
        Paint paint3 = new Paint(1);
        this.f166959k = paint3;
        paint3.setFilterBitmap(true);
        this.f166959k.setColor(-16777216);
        this.f166959k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f166954f = new Path();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.f166953e) {
            this.f166953e = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f166949a == 2) {
                this.f166950b = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
            }
            if (this.f166955g == null || this.f166950b != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f166950b);
                this.f166955g = new RoundRectShape(fArr, null, null);
                this.f166956h = new RoundRectShape(fArr, null, null);
            }
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            this.f166955g.resize(f, f2);
            Shape shape = this.f166956h;
            float f3 = this.f166952d;
            shape.resize(f - (f3 * 2.0f), f2 - (f3 * 2.0f));
            m130639b();
        }
    }
}
