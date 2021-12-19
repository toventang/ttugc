package com.p2082ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView */
public class LinearGradientDraweeView extends SmartImageView {

    /* renamed from: a */
    private int f116637a;

    /* renamed from: b */
    private int f116638b;

    /* renamed from: d */
    private int f116639d;

    /* renamed from: e */
    private Paint f116640e;

    /* renamed from: f */
    private LinearGradient f116641f;

    static {
        Covode.recordClassIndex(59632);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f116637a > 0) {
            int height = getHeight() - this.f116637a;
            if (this.f116641f == null) {
                LinearGradient linearGradient = new LinearGradient(0.0f, (float) height, 0.0f, (float) getHeight(), new int[]{this.f116638b, this.f116639d}, (float[]) null, Shader.TileMode.CLAMP);
                this.f116641f = linearGradient;
                this.f116640e.setShader(linearGradient);
            }
            canvas.drawRect(0.0f, (float) height, (float) getWidth(), (float) getHeight(), this.f116640e);
        }
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LinearGradientDraweeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.f116640e = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.t0, R.attr.a2b, R.attr.afc});
        this.f116638b = obtainStyledAttributes.getColor(2, 0);
        this.f116639d = obtainStyledAttributes.getColor(0, 0);
        this.f116637a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
