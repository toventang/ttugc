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
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class BottomLikeView extends View {

    /* renamed from: b */
    public static final int f22534b = C3966y.m9653a(36.0f);

    /* renamed from: c */
    public static final int f22535c = C3966y.m9653a(28.0f);

    /* renamed from: d */
    public static final C9247a f22536d = new C9247a((byte) 0);

    /* renamed from: a */
    public final ArrayList<C9248b> f22537a = new ArrayList<>();

    /* renamed from: e */
    private final Paint f22538e;

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$a */
    static final class C9247a {
        static {
            Covode.recordClassIndex(10161);
        }

        private C9247a() {
        }

        public /* synthetic */ C9247a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10160);
    }

    /* renamed from: a */
    public final void mo15344a() {
        Iterator<C9248b> it = this.f22537a.iterator();
        while (it.hasNext()) {
            C9248b next = it.next();
            C89219l.m154716b(next, "");
            it.remove();
            next.f22545g.cancel();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b */
    public final class C9248b {

        /* renamed from: a */
        public final RectF f22539a = new RectF();

        /* renamed from: b */
        public final RectF f22540b = new RectF();

        /* renamed from: c */
        public float f22541c = 1.0f;

        /* renamed from: d */
        public float f22542d;

        /* renamed from: e */
        public int f22543e = 255;

        /* renamed from: f */
        public int f22544f;

        /* renamed from: g */
        final AnimatorSet f22545g;

        /* renamed from: h */
        public final Bitmap f22546h;

        /* renamed from: i */
        public final Bitmap f22547i;

        /* renamed from: j */
        final /* synthetic */ BottomLikeView f22548j;

        static {
            Covode.recordClassIndex(10162);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$b */
        public static final class C9250b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C9248b f22555a;

            /* renamed from: b */
            final /* synthetic */ PointF f22556b;

            /* renamed from: c */
            final /* synthetic */ PointF f22557c;

            /* renamed from: d */
            final /* synthetic */ PointF f22558d;

            /* renamed from: e */
            final /* synthetic */ boolean f22559e;

            /* renamed from: f */
            final /* synthetic */ long f22560f;

            static {
                Covode.recordClassIndex(10164);
            }

            public final void onAnimationEnd(Animator animator) {
                if (this.f22555a.f22548j.f22537a.contains(this.f22555a)) {
                    this.f22555a.f22548j.f22537a.remove(this.f22555a);
                }
            }

            C9250b(C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j) {
                this.f22555a = bVar;
                this.f22556b = pointF;
                this.f22557c = pointF2;
                this.f22558d = pointF3;
                this.f22559e = z;
                this.f22560f = j;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$c */
        static final class C9251c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22561a;

            /* renamed from: b */
            final /* synthetic */ PointF f22562b;

            /* renamed from: c */
            final /* synthetic */ PointF f22563c;

            /* renamed from: d */
            final /* synthetic */ PointF f22564d;

            /* renamed from: e */
            final /* synthetic */ boolean f22565e;

            /* renamed from: f */
            final /* synthetic */ long f22566f;

            static {
                Covode.recordClassIndex(10165);
            }

            C9251c(C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j) {
                this.f22561a = bVar;
                this.f22562b = pointF;
                this.f22563c = pointF2;
                this.f22564d = pointF3;
                this.f22565e = z;
                this.f22566f = j;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22561a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f22541c = ((Float) animatedValue).floatValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$d */
        static final class C9252d implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22567a;

            /* renamed from: b */
            final /* synthetic */ PointF f22568b;

            /* renamed from: c */
            final /* synthetic */ PointF f22569c;

            /* renamed from: d */
            final /* synthetic */ PointF f22570d;

            /* renamed from: e */
            final /* synthetic */ boolean f22571e;

            /* renamed from: f */
            final /* synthetic */ long f22572f;

            static {
                Covode.recordClassIndex(10166);
            }

            C9252d(C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j) {
                this.f22567a = bVar;
                this.f22568b = pointF;
                this.f22569c = pointF2;
                this.f22570d = pointF3;
                this.f22571e = z;
                this.f22572f = j;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22567a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f22541c = ((Float) animatedValue).floatValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$e */
        static final class C9253e implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ long f22573a;

            /* renamed from: b */
            final /* synthetic */ C9248b f22574b;

            /* renamed from: c */
            final /* synthetic */ PointF f22575c;

            /* renamed from: d */
            final /* synthetic */ PointF f22576d;

            /* renamed from: e */
            final /* synthetic */ PointF f22577e;

            /* renamed from: f */
            final /* synthetic */ boolean f22578f;

            /* renamed from: g */
            final /* synthetic */ long f22579g;

            static {
                Covode.recordClassIndex(10167);
            }

            C9253e(long j, C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f22573a = j;
                this.f22574b = bVar;
                this.f22575c = pointF;
                this.f22576d = pointF2;
                this.f22577e = pointF3;
                this.f22578f = z;
                this.f22579g = j2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22574b;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22544f = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$f */
        static final class C9254f implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22580a;

            /* renamed from: b */
            final /* synthetic */ PointF f22581b;

            /* renamed from: c */
            final /* synthetic */ PointF f22582c;

            /* renamed from: d */
            final /* synthetic */ PointF f22583d;

            /* renamed from: e */
            final /* synthetic */ boolean f22584e;

            /* renamed from: f */
            final /* synthetic */ long f22585f;

            static {
                Covode.recordClassIndex(10168);
            }

            C9254f(C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j) {
                this.f22580a = bVar;
                this.f22581b = pointF;
                this.f22582c = pointF2;
                this.f22583d = pointF3;
                this.f22584e = z;
                this.f22585f = j;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22580a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22544f = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$g */
        static final class C9255g implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ long f22586a;

            /* renamed from: b */
            final /* synthetic */ C9248b f22587b;

            /* renamed from: c */
            final /* synthetic */ PointF f22588c;

            /* renamed from: d */
            final /* synthetic */ PointF f22589d;

            /* renamed from: e */
            final /* synthetic */ PointF f22590e;

            /* renamed from: f */
            final /* synthetic */ boolean f22591f;

            /* renamed from: g */
            final /* synthetic */ long f22592g;

            static {
                Covode.recordClassIndex(10169);
            }

            C9255g(long j, C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j2) {
                this.f22586a = j;
                this.f22587b = bVar;
                this.f22588c = pointF;
                this.f22589d = pointF2;
                this.f22590e = pointF3;
                this.f22591f = z;
                this.f22592g = j2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22587b;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22544f = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$h */
        static final class C9256h implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22593a;

            static {
                Covode.recordClassIndex(10170);
            }

            C9256h(C9248b bVar) {
                this.f22593a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22593a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f22541c = ((Float) animatedValue).floatValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$i */
        static final class C9257i implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22594a;

            static {
                Covode.recordClassIndex(10171);
            }

            C9257i(C9248b bVar) {
                this.f22594a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22594a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22543e = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$j */
        static final class C9258j implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22595a;

            static {
                Covode.recordClassIndex(10172);
            }

            C9258j(C9248b bVar) {
                this.f22595a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22595a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f22542d = ((Float) animatedValue).floatValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$k */
        static final class C9259k implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22596a;

            static {
                Covode.recordClassIndex(10173);
            }

            C9259k(C9248b bVar) {
                this.f22596a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9248b bVar = this.f22596a;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                bVar.f22544f = ((Integer) animatedValue).intValue();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeView$b$a */
        static final class C9249a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9248b f22549a;

            /* renamed from: b */
            final /* synthetic */ PointF f22550b;

            /* renamed from: c */
            final /* synthetic */ PointF f22551c;

            /* renamed from: d */
            final /* synthetic */ PointF f22552d;

            /* renamed from: e */
            final /* synthetic */ boolean f22553e;

            /* renamed from: f */
            final /* synthetic */ long f22554f;

            static {
                Covode.recordClassIndex(10163);
            }

            C9249a(C9248b bVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z, long j) {
                this.f22549a = bVar;
                this.f22550b = pointF;
                this.f22551c = pointF2;
                this.f22552d = pointF3;
                this.f22553e = z;
                this.f22554f = j;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
                PointF pointF = (PointF) animatedValue;
                RectF rectF = this.f22549a.f22539a;
                rectF.left = pointF.x - ((((float) BottomLikeView.f22535c) * this.f22549a.f22541c) / 2.0f);
                rectF.top = pointF.y - ((((float) BottomLikeView.f22535c) * this.f22549a.f22541c) / 2.0f);
                rectF.right = rectF.left + (((float) BottomLikeView.f22535c) * this.f22549a.f22541c);
                rectF.bottom = rectF.top + (((float) BottomLikeView.f22535c) * this.f22549a.f22541c);
                RectF rectF2 = this.f22549a.f22540b;
                rectF2.left = pointF.x - ((((float) BottomLikeView.f22534b) * this.f22549a.f22542d) / 2.0f);
                rectF2.top = pointF.y - ((((float) BottomLikeView.f22534b) * this.f22549a.f22542d) / 2.0f);
                rectF2.right = rectF2.left + (((float) BottomLikeView.f22534b) * this.f22549a.f22542d);
                rectF2.bottom = rectF2.top + (((float) BottomLikeView.f22534b) * this.f22549a.f22542d);
                this.f22549a.f22548j.invalidate();
            }
        }

        public C9248b(BottomLikeView bottomLikeView, boolean z, Bitmap bitmap, Bitmap bitmap2, PointF pointF, PointF pointF2, PointF pointF3) {
            C9248b bVar;
            C89219l.m154721d(bitmap2, "");
            C89219l.m154721d(pointF, "");
            C89219l.m154721d(pointF2, "");
            C89219l.m154721d(pointF3, "");
            this.f22548j = bottomLikeView;
            this.f22546h = bitmap;
            this.f22547i = bitmap2;
            long nextLong = AbstractC89255c.Default.nextLong(500, 1200);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ValueAnimator ofObject = ValueAnimator.ofObject(new C9274a(pointF2), pointF, pointF3);
            ofObject.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            ofObject.addUpdateListener(new C9249a(this, pointF2, pointF, pointF3, z, nextLong));
            ofObject.addListener(new C9250b(this, pointF2, pointF, pointF3, z, nextLong));
            arrayList.add(ofObject);
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.15f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new C9251c(this, pointF2, pointF, pointF3, z, nextLong));
                arrayList.add(ofFloat);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.15f, 1.0f);
                ofFloat2.setDuration(100L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.addUpdateListener(new C9252d(this, pointF2, pointF, pointF3, z, nextLong));
                ofFloat2.setStartDelay(200);
                arrayList.add(ofFloat2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.setDuration(150L);
                ofFloat3.addUpdateListener(new C9256h(this));
                ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
                ofInt.setDuration(150L);
                ofInt.addUpdateListener(new C9257i(this));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat4.setDuration(150L);
                ofFloat4.setStartDelay(100);
                ofFloat4.addUpdateListener(new C9258j(this));
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 255);
                ofInt2.setDuration(150L);
                ofInt2.setStartDelay(100);
                ofInt2.addUpdateListener(new C9259k(this));
                animatorSet2.playTogether(ofFloat3, ofInt, ofFloat4, ofInt2);
                animatorSet2.setStartDelay(nextLong);
                arrayList.add(animatorSet2);
                long nextInt = nextLong + ((long) AbstractC89255c.Default.nextInt(100, 200));
                ValueAnimator ofInt3 = ValueAnimator.ofInt(255, 0);
                ofInt3.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - nextInt);
                ofInt3.setInterpolator(new DecelerateInterpolator());
                ofInt3.addUpdateListener(new C9253e(nextInt, this, pointF2, pointF, pointF3, z, nextLong));
                ofInt3.setStartDelay(nextInt);
                arrayList.add(ofInt3);
                bVar = this;
            } else {
                bVar = this;
                bVar.f22541c = 0.0f;
                bVar.f22543e = 0;
                bVar.f22542d = 1.0f;
                bVar.f22544f = 0;
                ValueAnimator ofInt4 = ValueAnimator.ofInt(0, 255);
                ofInt4.setDuration(300L);
                ofInt4.addUpdateListener(new C9254f(this, pointF2, pointF, pointF3, false, nextLong));
                arrayList.add(ofInt4);
                long nextInt2 = (long) AbstractC89255c.Default.nextInt(666, 1100);
                ValueAnimator ofInt5 = ValueAnimator.ofInt(255, 0);
                ofInt5.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - nextInt2);
                ofInt5.setStartDelay(nextInt2);
                ofInt5.addUpdateListener(new C9255g(nextInt2, this, pointF2, pointF, pointF3, false, nextLong));
                arrayList.add(ofInt5);
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            bVar.f22545g = animatorSet;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        for (T t : this.f22537a) {
            if (t.f22539a.width() > 0.0f) {
                this.f22538e.setAlpha(t.f22543e);
                if (t.f22546h != null && !t.f22546h.isRecycled()) {
                    canvas.drawBitmap(t.f22546h, (Rect) null, t.f22539a, this.f22538e);
                }
            }
            if (t.f22540b.width() > 0.0f) {
                this.f22538e.setAlpha(t.f22544f);
                if (!t.f22547i.isRecycled()) {
                    canvas.drawBitmap(t.f22547i, (Rect) null, t.f22540b, this.f22538e);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(6328);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f22538e = paint;
        MethodCollector.m26664o(6328);
    }

    /* renamed from: a */
    public final void mo15345a(Bitmap bitmap, Bitmap bitmap2, PointF pointF, PointF pointF2, PointF pointF3) {
        C89219l.m154721d(bitmap2, "");
        C89219l.m154721d(pointF, "");
        C89219l.m154721d(pointF2, "");
        C89219l.m154721d(pointF3, "");
        this.f22537a.add(new C9248b(this, false, bitmap, bitmap2, pointF, pointF2, pointF3));
    }
}
