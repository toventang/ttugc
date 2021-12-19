package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveRoundImageView */
public class LiveRoundImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f19084a;

    /* renamed from: b */
    private int f19085b;

    /* renamed from: c */
    private int f19086c;

    /* renamed from: d */
    private int f19087d;

    /* renamed from: e */
    private Path f19088e = new Path();

    static {
        Covode.recordClassIndex(8489);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(this.f19084a, this.f19086c) + Math.max(this.f19085b, this.f19087d);
        int max2 = Math.max(this.f19084a, this.f19085b) + Math.max(this.f19086c, this.f19087d);
        if (width >= max && height > max2) {
            this.f19088e.reset();
            this.f19088e.moveTo((float) this.f19084a, 0.0f);
            this.f19088e.lineTo((float) (width - this.f19085b), 0.0f);
            float f = (float) width;
            this.f19088e.quadTo(f, 0.0f, f, (float) this.f19085b);
            this.f19088e.lineTo(f, (float) (height - this.f19087d));
            float f2 = (float) height;
            this.f19088e.quadTo(f, f2, (float) (width - this.f19087d), f2);
            this.f19088e.lineTo((float) this.f19086c, f2);
            this.f19088e.quadTo(0.0f, f2, 0.0f, (float) (height - this.f19086c));
            this.f19088e.lineTo(0.0f, (float) this.f19084a);
            this.f19088e.quadTo(0.0f, 0.0f, (float) this.f19084a, 0.0f);
            canvas.clipPath(this.f19088e);
        }
        super.onDraw(canvas);
    }

    public LiveRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.an7, R.attr.an8, R.attr.an9, R.attr.an_, R.attr.ana});
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            this.f19084a = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f19085b = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            this.f19086c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.f19087d = dimensionPixelOffset2;
            if (this.f19084a == 0) {
                this.f19084a = dimensionPixelOffset;
            }
            if (this.f19085b == 0) {
                this.f19085b = dimensionPixelOffset;
            }
            if (this.f19086c == 0) {
                this.f19086c = dimensionPixelOffset;
            }
            if (dimensionPixelOffset2 == 0) {
                this.f19087d = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
