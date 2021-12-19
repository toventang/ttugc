package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.p033d.C0654g;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.p4611f.p4613b.C89219l;

public final class DiggTapView extends View {

    /* renamed from: b */
    public static final int f22597b = C3966y.m9653a(42.0f);

    /* renamed from: c */
    public static final C9260a f22598c = new C9260a((byte) 0);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C9261b> f22599a = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private final Paint f22600d = new Paint(1);

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$a */
    static final class C9260a {
        static {
            Covode.recordClassIndex(10175);
        }

        private C9260a() {
        }

        public /* synthetic */ C9260a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10174);
    }

    /* renamed from: a */
    public final void mo15358a() {
        Iterator<C9261b> it = this.f22599a.iterator();
        while (it.hasNext()) {
            it.next().f22604d.cancel();
            it.remove();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b */
    public final class C9261b {

        /* renamed from: a */
        public final RectF f22601a;

        /* renamed from: b */
        public int f22602b;

        /* renamed from: c */
        public float f22603c;

        /* renamed from: d */
        final AnimatorSet f22604d;

        /* renamed from: e */
        public final Bitmap f22605e;

        /* renamed from: f */
        public final boolean f22606f = false;

        /* renamed from: g */
        final /* synthetic */ DiggTapView f22607g;

        /* renamed from: h */
        private final boolean f22608h;

        /* renamed from: i */
        private final PointF f22609i;

        /* renamed from: j */
        private final PointF f22610j;

        static {
            Covode.recordClassIndex(10176);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$b */
        public static final class C9263b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C9261b f22614a;

            /* renamed from: b */
            final /* synthetic */ PointF f22615b;

            /* renamed from: c */
            final /* synthetic */ PointF f22616c;

            static {
                Covode.recordClassIndex(10178);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                this.f22614a.f22607g.f22599a.remove(this.f22614a);
            }

            C9263b(C9261b bVar, PointF pointF, PointF pointF2) {
                this.f22614a = bVar;
                this.f22615b = pointF;
                this.f22616c = pointF2;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$c */
        static final class C9264c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22617a;

            /* renamed from: b */
            final /* synthetic */ PointF f22618b;

            /* renamed from: c */
            final /* synthetic */ PointF f22619c;

            static {
                Covode.recordClassIndex(10179);
            }

            C9264c(C9261b bVar, PointF pointF, PointF pointF2) {
                this.f22617a = bVar;
                this.f22618b = pointF;
                this.f22619c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22617a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22602b = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$d */
        static final class C9265d implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22620a;

            /* renamed from: b */
            final /* synthetic */ PointF f22621b;

            /* renamed from: c */
            final /* synthetic */ PointF f22622c;

            static {
                Covode.recordClassIndex(10180);
            }

            C9265d(C9261b bVar, PointF pointF, PointF pointF2) {
                this.f22620a = bVar;
                this.f22621b = pointF;
                this.f22622c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22620a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22602b = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$e */
        static final class C9266e implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22623a;

            /* renamed from: b */
            final /* synthetic */ PointF f22624b;

            /* renamed from: c */
            final /* synthetic */ PointF f22625c;

            static {
                Covode.recordClassIndex(10181);
            }

            C9266e(C9261b bVar, PointF pointF, PointF pointF2) {
                this.f22623a = bVar;
                this.f22624b = pointF;
                this.f22625c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22623a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.mo15360a(((Float) animatedValue).floatValue());
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$h */
        static final class C9269h implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22628a;

            static {
                Covode.recordClassIndex(10184);
            }

            C9269h(C9261b bVar) {
                this.f22628a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22628a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f22603c = ((Float) animatedValue).floatValue();
                this.f22628a.f22607g.invalidate();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$i */
        static final class C9270i implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22629a;

            static {
                Covode.recordClassIndex(10185);
            }

            C9270i(C9261b bVar) {
                this.f22629a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22629a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f22603c = ((Float) animatedValue).floatValue();
                this.f22629a.f22607g.invalidate();
            }
        }

        /* renamed from: a */
        public final void mo15360a(float f) {
            RectF rectF = this.f22601a;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f2 = (((float) DiggTapView.f22597b) * f) / 2.0f;
            rectF.left = centerX - f2;
            rectF.top = centerY - f2;
            rectF.right = centerX + f2;
            rectF.bottom = centerY + f2;
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$a */
        static final class C9262a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22611a;

            /* renamed from: b */
            final /* synthetic */ PointF f22612b;

            /* renamed from: c */
            final /* synthetic */ PointF f22613c;

            static {
                Covode.recordClassIndex(10177);
            }

            C9262a(C9261b bVar, PointF pointF, PointF pointF2) {
                this.f22611a = bVar;
                this.f22612b = pointF;
                this.f22613c = pointF2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
                PointF pointF = (PointF) animatedValue;
                RectF rectF = this.f22611a.f22601a;
                float width = rectF.width() / 2.0f;
                rectF.left = pointF.x - width;
                rectF.top = pointF.y - width;
                rectF.right = pointF.x + width;
                rectF.bottom = pointF.y + width;
                this.f22611a.f22607g.invalidate();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$f */
        static final class C9267f implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22626a;

            static {
                Covode.recordClassIndex(10182);
            }

            C9267f(C9261b bVar) {
                this.f22626a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22626a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.mo15360a(((Float) animatedValue).floatValue());
                this.f22626a.f22607g.invalidate();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.DiggTapView$b$g */
        static final class C9268g implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9261b f22627a;

            static {
                Covode.recordClassIndex(10183);
            }

            C9268g(C9261b bVar) {
                this.f22627a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9261b bVar = this.f22627a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.mo15360a(((Float) animatedValue).floatValue());
                this.f22627a.f22607g.invalidate();
            }
        }

        public C9261b(DiggTapView diggTapView, Bitmap bitmap, PointF pointF, PointF pointF2) {
            C89219l.m154721d(bitmap, "");
            C89219l.m154721d(pointF, "");
            C89219l.m154721d(pointF2, "");
            this.f22607g = diggTapView;
            this.f22605e = bitmap;
            this.f22609i = pointF;
            this.f22610j = pointF2;
            RectF rectF = new RectF();
            this.f22601a = rectF;
            this.f22602b = 255;
            this.f22608h = true;
            rectF.left = pointF.x - ((float) (DiggTapView.f22597b / 2));
            rectF.top = pointF.y - ((float) (DiggTapView.f22597b / 2));
            rectF.right = pointF.x + ((float) (DiggTapView.f22597b / 2));
            rectF.bottom = pointF.y + ((float) (DiggTapView.f22597b / 2));
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            AnimatorSet animatorSet3 = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.5f);
            ofFloat.setDuration(100L);
            ofFloat.addUpdateListener(new C9267f(this));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.5f, 1.36f, 1.4f);
            ofFloat2.setDuration(150L);
            ofFloat2.addUpdateListener(new C9268g(this));
            animatorSet3.playSequentially(ofFloat, ofFloat2);
            AnimatorSet animatorSet4 = new AnimatorSet();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -8.0f);
            ofFloat3.setDuration(100L);
            ofFloat3.addUpdateListener(new C9269h(this));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-8.0f, 3.0f, 0.0f);
            ofFloat4.setDuration(150L);
            ofFloat4.addUpdateListener(new C9270i(this));
            animatorSet4.playSequentially(ofFloat3, ofFloat4);
            animatorSet2.playTogether(animatorSet3, animatorSet4);
            AnimatorSet animatorSet5 = new AnimatorSet();
            ValueAnimator ofObject = ValueAnimator.ofObject(new C9274a(new PointF(pointF2.x, pointF.y)), pointF, pointF2);
            ofObject.setDuration(1500L);
            ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
            ofObject.addUpdateListener(new C9262a(this, pointF, pointF2));
            ofObject.addListener(new C9263b(this, pointF, pointF2));
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 153);
            ofInt.setDuration(500L);
            ofInt.addUpdateListener(new C9264c(this, pointF, pointF2));
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator ofInt2 = ValueAnimator.ofInt(153, 0);
            ofInt2.setDuration(1000L);
            ofInt2.addUpdateListener(new C9265d(this, pointF, pointF2));
            ofInt2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt2.setStartDelay(500);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.4f, 0.5f);
            ofFloat5.setDuration(500L);
            ofFloat5.addUpdateListener(new C9266e(this, pointF, pointF2));
            animatorSet5.playTogether(ofObject, ofInt, ofInt2, ofFloat5);
            animatorSet5.setStartDelay(200);
            animatorSet.playSequentially(animatorSet2, animatorSet5);
            animatorSet.start();
            this.f22604d = animatorSet;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        for (T t : this.f22599a) {
            if (!t.f22605e.isRecycled()) {
                C0654g.m2391a("LikeIconDraw");
                canvas.save();
                this.f22600d.setAlpha(t.f22602b);
                if (t.f22603c != 0.0f) {
                    canvas.rotate(t.f22603c, t.f22601a.centerX(), t.f22601a.centerY());
                }
                canvas.drawBitmap(t.f22605e, (Rect) null, t.f22601a, this.f22600d);
                canvas.restore();
                C0654g.m2390a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiggTapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6480);
        MethodCollector.m26664o(6480);
    }
}
