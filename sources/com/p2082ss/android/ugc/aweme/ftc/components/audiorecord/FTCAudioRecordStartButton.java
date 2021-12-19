package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.view.C84916a;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton */
public final class FTCAudioRecordStartButton extends FrameLayout {

    /* renamed from: a */
    public ImageView f119798a;

    /* renamed from: b */
    C52004a f119799b;

    /* renamed from: c */
    ValueAnimator f119800c = ValueAnimator.ofFloat(1.0f, 0.72f);

    /* renamed from: d */
    ValueAnimator f119801d = ValueAnimator.ofFloat(0.72f, 1.0f);

    static {
        Covode.recordClassIndex(61376);
    }

    /* renamed from: a */
    public final void mo87723a() {
        this.f119800c.end();
        this.f119801d.start();
    }

    /* renamed from: b */
    public final void mo87724b() {
        C52004a aVar = this.f119799b;
        if (aVar == null) {
            C89219l.m154710a("centerView");
        }
        aVar.f119804c.end();
        aVar.f119803b.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton$a */
    public static final class C52004a extends View {

        /* renamed from: a */
        public float f119802a;

        /* renamed from: b */
        ValueAnimator f119803b;

        /* renamed from: c */
        ValueAnimator f119804c;

        /* renamed from: d */
        private final Paint f119805d;

        /* renamed from: e */
        private final float f119806e;

        /* renamed from: f */
        private final float f119807f;

        static {
            Covode.recordClassIndex(61377);
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ValueAnimator valueAnimator = this.f119803b;
            C89219l.m154716b(valueAnimator, "");
            if (valueAnimator.isRunning()) {
                this.f119803b.end();
            }
            ValueAnimator valueAnimator2 = this.f119804c;
            C89219l.m154716b(valueAnimator2, "");
            if (valueAnimator2.isRunning()) {
                this.f119804c.end();
            }
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            MethodCollector.m26663i(12102);
            super.onDraw(canvas);
            if (canvas != null) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float f = this.f119802a;
                canvas.drawRoundRect(rectF, f, f, this.f119805d);
                MethodCollector.m26664o(12102);
                return;
            }
            MethodCollector.m26664o(12102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52004a(Context context) {
            super(context);
            C89219l.m154721d(context, "");
            MethodCollector.m26663i(12245);
            Paint paint = new Paint();
            this.f119805d = paint;
            float b = C13628n.m24520b(context, 3.5f);
            this.f119806e = b;
            float b2 = C13628n.m24520b(context, 13.0f);
            this.f119807f = b2;
            this.f119802a = b2;
            this.f119803b = ValueAnimator.ofFloat(b, b2);
            this.f119804c = ValueAnimator.ofFloat(b2, b);
            paint.setAntiAlias(true);
            paint.setColor(Color.parseColor("#fe2c55"));
            this.f119803b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton.C52004a.C520051 */

                /* renamed from: a */
                final /* synthetic */ C52004a f119808a;

                static {
                    Covode.recordClassIndex(61378);
                }

                {
                    this.f119808a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C52004a aVar = this.f119808a;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f119802a = ((Float) animatedValue).floatValue();
                    this.f119808a.invalidate();
                }
            });
            ValueAnimator valueAnimator = this.f119803b;
            C89219l.m154716b(valueAnimator, "");
            valueAnimator.setDuration(250L);
            this.f119804c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton.C52004a.C520062 */

                /* renamed from: a */
                final /* synthetic */ C52004a f119809a;

                static {
                    Covode.recordClassIndex(61379);
                }

                {
                    this.f119809a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C52004a aVar = this.f119809a;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f119802a = ((Float) animatedValue).floatValue();
                    this.f119809a.invalidate();
                }
            });
            ValueAnimator valueAnimator2 = this.f119804c;
            C89219l.m154716b(valueAnimator2, "");
            valueAnimator2.setDuration(250L);
            MethodCollector.m26664o(12245);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f119800c;
        C89219l.m154716b(valueAnimator, "");
        if (valueAnimator.isRunning()) {
            this.f119800c.end();
        }
        ValueAnimator valueAnimator2 = this.f119801d;
        C89219l.m154716b(valueAnimator2, "");
        if (valueAnimator2.isRunning()) {
            this.f119801d.end();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m96745a(FTCAudioRecordStartButton fTCAudioRecordStartButton) {
        ImageView imageView = fTCAudioRecordStartButton.f119798a;
        if (imageView == null) {
            C89219l.m154710a("bgView");
        }
        return imageView;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton$b */
    static final class C52007b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FTCAudioRecordStartButton f119810a;

        static {
            Covode.recordClassIndex(61380);
        }

        C52007b(FTCAudioRecordStartButton fTCAudioRecordStartButton) {
            this.f119810a = fTCAudioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            FTCAudioRecordStartButton.m96745a(this.f119810a).setScaleX(floatValue);
            FTCAudioRecordStartButton.m96745a(this.f119810a).setScaleY(floatValue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCAudioRecordStartButton$c */
    static final class C52008c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FTCAudioRecordStartButton f119811a;

        static {
            Covode.recordClassIndex(61381);
        }

        C52008c(FTCAudioRecordStartButton fTCAudioRecordStartButton) {
            this.f119811a = fTCAudioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            FTCAudioRecordStartButton.m96745a(this.f119811a).setScaleX(floatValue);
            FTCAudioRecordStartButton.m96745a(this.f119811a).setScaleY(floatValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCAudioRecordStartButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11388);
        ImageView imageView = new ImageView(getContext());
        this.f119798a = imageView;
        imageView.setBackground(C84916a.m145946a(-16776961, -1, 0));
        View view = this.f119798a;
        if (view == null) {
            C89219l.m154710a("bgView");
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        this.f119799b = new C52004a(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C13628n.m24520b(getContext(), 20.0f), (int) C13628n.m24520b(getContext(), 20.0f));
        layoutParams.topMargin = (int) C13628n.m24520b(getContext(), 26.0f);
        layoutParams.leftMargin = (int) C13628n.m24520b(getContext(), 26.0f);
        int i = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart((int) C13628n.m24520b(getContext(), 26.0f));
        View view2 = this.f119799b;
        if (view2 == null) {
            C89219l.m154710a("centerView");
        }
        addView(view2, layoutParams);
        this.f119800c.addUpdateListener(new C52007b(this));
        this.f119801d.addUpdateListener(new C52008c(this));
        MethodCollector.m26664o(11388);
    }
}
