package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

public class VHeadView extends AppCompatImageView {

    /* renamed from: a */
    private int f27309a;

    /* renamed from: b */
    private int f27310b;

    /* renamed from: c */
    private Bitmap f27311c;

    /* renamed from: d */
    private Boolean f27312d = false;

    /* renamed from: e */
    private int f27313e;

    /* renamed from: f */
    private Bitmap f27314f;

    /* renamed from: g */
    private boolean f27315g = false;

    /* renamed from: h */
    private Paint f27316h = new Paint();

    static {
        Covode.recordClassIndex(13023);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public void setAuthor(boolean z) {
        if (this.f27315g != z) {
            this.f27315g = z;
            invalidate();
        }
    }

    public void setVResId(int i) {
        if (this.f27310b != i) {
            this.f27310b = i;
            this.f27311c = null;
            invalidate();
        }
    }

    public void setVAble(boolean z) {
        if (this.f27312d.booleanValue() != z) {
            this.f27312d = Boolean.valueOf(z);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap decodeResource;
        Bitmap decodeResource2;
        MethodCollector.m26663i(12712);
        super.onDraw(canvas);
        if (this.f27312d.booleanValue() || this.f27315g) {
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(width, height);
            if (this.f27312d.booleanValue()) {
                if (this.f27311c == null && (decodeResource2 = BitmapFactory.decodeResource(getResources(), this.f27310b)) != null) {
                    this.f27311c = decodeResource2;
                }
                Bitmap bitmap = this.f27311c;
                if (bitmap != null) {
                    int width2 = (min - bitmap.getWidth()) - this.f27309a;
                    int height2 = min - this.f27311c.getHeight();
                    if (width > height) {
                        width2 += (width - height) / 2;
                    } else {
                        height2 += (height - width) / 2;
                    }
                    canvas.drawBitmap(this.f27311c, (float) width2, (float) height2, this.f27316h);
                }
            }
            if (this.f27315g) {
                if (this.f27314f == null && (decodeResource = BitmapFactory.decodeResource(getResources(), this.f27313e)) != null) {
                    this.f27314f = decodeResource;
                }
                Bitmap bitmap2 = this.f27314f;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (float) ((min - bitmap2.getWidth()) / 2), (float) (min - this.f27314f.getHeight()), this.f27316h);
                }
            }
            MethodCollector.m26664o(12712);
            return;
        }
        MethodCollector.m26664o(12712);
    }

    public VHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.io, R.attr.asv, R.attr.asw});
        this.f27310b = obtainStyledAttributes.getResourceId(2, 2131234736);
        this.f27312d = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
        this.f27313e = obtainStyledAttributes.getResourceId(0, 2131234015);
        obtainStyledAttributes.recycle();
    }
}
