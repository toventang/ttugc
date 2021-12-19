package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableFrameLayout;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SweepEffectFrameLayout */
public final class SweepEffectFrameLayout extends ShapeControllableFrameLayout {

    /* renamed from: a */
    private final Paint f19096a;

    /* renamed from: b */
    private float f19097b;

    /* renamed from: c */
    private final Drawable f19098c;

    /* renamed from: d */
    private boolean f19099d;

    /* renamed from: e */
    private final GradientDrawable f19100e;

    static {
        Covode.recordClassIndex(8497);
    }

    public SweepEffectFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setSweepRatio(float f) {
        this.f19097b = f;
        invalidate();
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f19099d = z;
        Drawable drawable = this.f19098c;
        if (drawable != null) {
            C0705a.m2503b(drawable, C0792v.m2768e(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        float width;
        super.dispatchDraw(canvas);
        float f = this.f19097b;
        if (f > 0.0f && f < 1.0f && canvas != null && (drawable = this.f19098c) != null) {
            if (this.f19099d) {
                width = ((float) getWidth()) - (((float) (drawable.getBounds().width() + getWidth())) * this.f19097b);
            } else {
                width = ((float) getWidth()) - (((float) (drawable.getBounds().width() + getWidth())) * (1.0f - this.f19097b));
            }
            canvas.save();
            canvas.translate(width, 0.0f);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private /* synthetic */ SweepEffectFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SweepEffectFrameLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f19096a = new Paint(1);
        this.f19097b = -1.0f;
        Drawable a = C0643b.m2369a(context, 2131234339);
        if (a != null) {
            C0705a.m2500a(a, true);
        } else {
            a = null;
        }
        this.f19098c = a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, -1, 0});
        this.f19100e = gradientDrawable;
    }

    @Override // com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableFrameLayout
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f19098c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, (intrinsicWidth * i2) / intrinsicHeight, intrinsicHeight);
        }
    }
}
