package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton */
public final class AudioRecordStartButton extends FrameLayout {

    /* renamed from: a */
    public ImageView f158682a;

    /* renamed from: b */
    C70879a f158683b;

    /* renamed from: c */
    ValueAnimator f158684c = ValueAnimator.ofFloat(1.0f, 0.72f);

    /* renamed from: d */
    ValueAnimator f158685d = ValueAnimator.ofFloat(0.72f, 1.0f);

    static {
        Covode.recordClassIndex(83370);
    }

    /* renamed from: a */
    public final void mo112036a() {
        this.f158684c.end();
        this.f158685d.start();
    }

    /* renamed from: b */
    public final void mo112037b() {
        C70879a aVar = this.f158683b;
        if (aVar == null) {
            C89219l.m154710a("centerView");
        }
        aVar.f158688c.end();
        aVar.f158687b.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$a */
    public static final class C70879a extends View {

        /* renamed from: a */
        public float f158686a;

        /* renamed from: b */
        ValueAnimator f158687b;

        /* renamed from: c */
        ValueAnimator f158688c;

        /* renamed from: d */
        private final Paint f158689d;

        /* renamed from: e */
        private final float f158690e;

        /* renamed from: f */
        private final float f158691f;

        static {
            Covode.recordClassIndex(83371);
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ValueAnimator valueAnimator = this.f158687b;
            C89219l.m154716b(valueAnimator, "");
            if (valueAnimator.isRunning()) {
                this.f158687b.end();
            }
            ValueAnimator valueAnimator2 = this.f158688c;
            C89219l.m154716b(valueAnimator2, "");
            if (valueAnimator2.isRunning()) {
                this.f158688c.end();
            }
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            MethodCollector.m26663i(10918);
            super.onDraw(canvas);
            if (canvas != null) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float f = this.f158686a;
                canvas.drawRoundRect(rectF, f, f, this.f158689d);
                MethodCollector.m26664o(10918);
                return;
            }
            MethodCollector.m26664o(10918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70879a(Context context) {
            super(context);
            C89219l.m154721d(context, "");
            MethodCollector.m26663i(11060);
            Paint paint = new Paint();
            this.f158689d = paint;
            float b = C13628n.m24520b(getContext(), 3.5f);
            this.f158690e = b;
            float b2 = C13628n.m24520b(getContext(), 13.0f);
            this.f158691f = b2;
            this.f158686a = b2;
            this.f158687b = ValueAnimator.ofFloat(b, b2);
            this.f158688c = ValueAnimator.ofFloat(b2, b);
            paint.setAntiAlias(true);
            paint.setColor(Color.parseColor("#fe2c55"));
            this.f158687b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton.C70879a.C708801 */

                /* renamed from: a */
                final /* synthetic */ C70879a f158692a;

                static {
                    Covode.recordClassIndex(83372);
                }

                {
                    this.f158692a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C70879a aVar = this.f158692a;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f158686a = ((Float) animatedValue).floatValue();
                    this.f158692a.invalidate();
                }
            });
            ValueAnimator valueAnimator = this.f158687b;
            C89219l.m154716b(valueAnimator, "");
            valueAnimator.setDuration(250L);
            this.f158688c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton.C70879a.C708812 */

                /* renamed from: a */
                final /* synthetic */ C70879a f158693a;

                static {
                    Covode.recordClassIndex(83373);
                }

                {
                    this.f158693a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C70879a aVar = this.f158693a;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    aVar.f158686a = ((Float) animatedValue).floatValue();
                    this.f158693a.invalidate();
                }
            });
            ValueAnimator valueAnimator2 = this.f158688c;
            C89219l.m154716b(valueAnimator2, "");
            valueAnimator2.setDuration(250L);
            MethodCollector.m26664o(11060);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f158684c;
        C89219l.m154716b(valueAnimator, "");
        if (valueAnimator.isRunning()) {
            this.f158684c.end();
        }
        ValueAnimator valueAnimator2 = this.f158685d;
        C89219l.m154716b(valueAnimator2, "");
        if (valueAnimator2.isRunning()) {
            this.f158685d.end();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m125165a(AudioRecordStartButton audioRecordStartButton) {
        ImageView imageView = audioRecordStartButton.f158682a;
        if (imageView == null) {
            C89219l.m154710a("bgView");
        }
        return imageView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$b */
    static final class C70882b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioRecordStartButton f158694a;

        static {
            Covode.recordClassIndex(83374);
        }

        C70882b(AudioRecordStartButton audioRecordStartButton) {
            this.f158694a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            AudioRecordStartButton.m125165a(this.f158694a).setScaleX(floatValue);
            AudioRecordStartButton.m125165a(this.f158694a).setScaleY(floatValue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$c */
    static final class C70883c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioRecordStartButton f158695a;

        static {
            Covode.recordClassIndex(83375);
        }

        C70883c(AudioRecordStartButton audioRecordStartButton) {
            this.f158695a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            AudioRecordStartButton.m125165a(this.f158695a).setScaleX(floatValue);
            AudioRecordStartButton.m125165a(this.f158695a).setScaleY(floatValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioRecordStartButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10765);
        ImageView imageView = new ImageView(getContext());
        this.f158682a = imageView;
        imageView.setBackground(C84916a.m145946a(-16776961, -1, 0));
        View view = this.f158682a;
        if (view == null) {
            C89219l.m154710a("bgView");
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        this.f158683b = new C70879a(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C13628n.m24520b(getContext(), 20.0f), (int) C13628n.m24520b(getContext(), 20.0f));
        layoutParams.topMargin = (int) C13628n.m24520b(getContext(), 26.0f);
        layoutParams.leftMargin = (int) C13628n.m24520b(getContext(), 26.0f);
        int i = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart((int) C13628n.m24520b(getContext(), 26.0f));
        View view2 = this.f158683b;
        if (view2 == null) {
            C89219l.m154710a("centerView");
        }
        addView(view2, layoutParams);
        this.f158684c.addUpdateListener(new C70882b(this));
        this.f158685d.addUpdateListener(new C70883c(this));
        MethodCollector.m26664o(10765);
    }
}
