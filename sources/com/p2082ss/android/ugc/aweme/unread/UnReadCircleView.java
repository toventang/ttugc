package com.p2082ss.android.ugc.aweme.unread;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.unread.UnReadCircleView */
public final class UnReadCircleView extends FrameLayout {

    /* renamed from: a */
    private float f178831a;

    /* renamed from: b */
    private float f178832b;

    /* renamed from: c */
    private float f178833c;

    /* renamed from: d */
    private float f178834d;

    /* renamed from: e */
    private Paint f178835e;

    /* renamed from: f */
    private final LottieAnimationView f178836f;

    static {
        Covode.recordClassIndex(92921);
    }

    public UnReadCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f178836f.f5900b.mo6025g()) {
            this.f178836f.mo5836d();
            this.f178836f.setVisibility(8);
        }
    }

    public final void setStrokeWidth(float f) {
        this.f178835e.setStrokeWidth(f);
        this.f178831a = f;
    }

    public final void setLoadingAnim(String str) {
        C89219l.m154721d(str, "");
        this.f178836f.setAnimation(str);
    }

    public final void setStrokeColor(int i) {
        this.f178835e.setColor(getResources().getColor(i));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(11461);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        if (this.f178836f.getVisibility() == 0) {
            MethodCollector.m26664o(11461);
            return;
        }
        canvas.drawCircle(this.f178832b, this.f178833c, this.f178834d, this.f178835e);
        MethodCollector.m26664o(11461);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11153);
        super.onMeasure(i, i2);
        this.f178832b = ((float) getMeasuredWidth()) / 2.0f;
        this.f178833c = ((float) getMeasuredHeight()) / 2.0f;
        this.f178834d = ((float) (getMeasuredHeight() / 2)) - (this.f178831a / 2.0f);
        MethodCollector.m26664o(11153);
    }

    private /* synthetic */ UnReadCircleView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private UnReadCircleView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11463);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.afl, R.attr.afm});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f178831a = (float) obtainStyledAttributes.getDimensionPixelSize(1, (int) C13628n.m24520b(context, 2.0f));
        obtainStyledAttributes.recycle();
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.c9));
        Paint paint = new Paint();
        paint.setColor(C0643b.m2378c(context, R.color.a));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f178831a);
        this.f178835e = paint;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.f178836f = lottieAnimationView;
        lottieAnimationView.setAnimation("story_upload_loading_yellow_lottie.json");
        lottieAnimationView.setLayerType(2, null);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(8);
        addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.m26664o(11463);
    }
}
