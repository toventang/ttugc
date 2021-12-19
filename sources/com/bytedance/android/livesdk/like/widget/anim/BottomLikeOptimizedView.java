package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.p036g.C0693f;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class BottomLikeOptimizedView extends View {

    /* renamed from: d */
    public static final int f22502d = C3966y.m9653a(36.0f);

    /* renamed from: e */
    public static final int f22503e = C3966y.m9653a(28.0f);

    /* renamed from: f */
    public static final C9244d f22504f = new C9244d((byte) 0);

    /* renamed from: a */
    public final LinkedList<C9238a> f22505a = new LinkedList<>();

    /* renamed from: b */
    public final C0693f.C0695b<C9238a> f22506b = new C0693f.C0695b<>(10);

    /* renamed from: c */
    public Bitmap f22507c;

    /* renamed from: g */
    private final Paint f22508g = new Paint(1);

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$d */
    static final class C9244d {
        static {
            Covode.recordClassIndex(10157);
        }

        private C9244d() {
        }

        public /* synthetic */ C9244d(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10150);
    }

    /* renamed from: a */
    public final void mo15328a() {
        Iterator<C9238a> it = this.f22505a.iterator();
        while (it.hasNext()) {
            C9238a next = it.next();
            C89219l.m154716b(next, "");
            C9238a aVar = next;
            it.remove();
            this.f22506b.release(aVar);
            aVar.f22509a.cancel();
        }
    }

    public final void setAvatar(Bitmap bitmap) {
        this.f22507c = bitmap;
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$b */
    final class C9242b extends Property<C9238a, Integer> {
        static {
            Covode.recordClassIndex(10155);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9242b() {
            super(Integer.TYPE, "avatar_alpha");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(C9238a aVar) {
            int i;
            C9238a aVar2 = aVar;
            if (aVar2 != null) {
                i = aVar2.f22514f;
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(C9238a aVar, Integer num) {
            if (aVar != null && num != null) {
                aVar.f22514f = num.intValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$c */
    final class C9243c extends Property<C9238a, Float> {
        static {
            Covode.recordClassIndex(10156);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9243c() {
            super(Float.TYPE, "avatar_scale");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(C9238a aVar) {
            float f;
            C9238a aVar2 = aVar;
            if (aVar2 != null) {
                f = aVar2.f22512d;
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(C9238a aVar, Float f) {
            if (aVar != null && f != null) {
                aVar.f22512d = f.floatValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$e */
    final class C9245e extends Property<C9238a, Integer> {
        static {
            Covode.recordClassIndex(10158);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9245e() {
            super(Integer.TYPE, "icon_alpha");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(C9238a aVar) {
            int i;
            C9238a aVar2 = aVar;
            if (aVar2 != null) {
                i = aVar2.f22515g;
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(C9238a aVar, Integer num) {
            if (aVar != null && num != null) {
                aVar.f22515g = num.intValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$f */
    final class C9246f extends Property<C9238a, Float> {
        static {
            Covode.recordClassIndex(10159);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9246f() {
            super(Float.TYPE, "icon_scale");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(C9238a aVar) {
            float f;
            C9238a aVar2 = aVar;
            if (aVar2 != null) {
                f = aVar2.f22513e;
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void set(C9238a aVar, Float f) {
            if (aVar != null && f != null) {
                aVar.f22513e = f.floatValue();
                BottomLikeOptimizedView.this.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$a */
    public final class C9238a {

        /* renamed from: a */
        final Animator f22509a;

        /* renamed from: b */
        public final RectF f22510b = new RectF();

        /* renamed from: c */
        public final RectF f22511c = new RectF();

        /* renamed from: d */
        public float f22512d;

        /* renamed from: e */
        public float f22513e;

        /* renamed from: f */
        public int f22514f;

        /* renamed from: g */
        public int f22515g;

        /* renamed from: h */
        public Bitmap f22516h;

        /* renamed from: j */
        private final Animator f22518j;

        /* renamed from: k */
        private final C9275b f22519k;

        /* renamed from: l */
        private final C9275b f22520l;

        /* renamed from: m */
        private final ValueAnimator f22521m;

        /* renamed from: n */
        private final ValueAnimator f22522n;

        /* renamed from: o */
        private final Animator f22523o;

        /* renamed from: p */
        private final Animator f22524p;

        /* renamed from: q */
        private final Animator f22525q;

        /* renamed from: r */
        private final Animator f22526r;

        static {
            Covode.recordClassIndex(10151);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$a$a */
        static final class C9240a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9238a f22528a;

            static {
                Covode.recordClassIndex(10153);
            }

            C9240a(C9238a aVar) {
                this.f22528a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                RectF rectF = this.f22528a.f22510b;
                rectF.left = floatValue - ((((float) BottomLikeOptimizedView.f22503e) * this.f22528a.f22512d) / 2.0f);
                rectF.right = rectF.left + (((float) BottomLikeOptimizedView.f22503e) * this.f22528a.f22512d);
                RectF rectF2 = this.f22528a.f22511c;
                rectF2.left = floatValue - ((((float) BottomLikeOptimizedView.f22502d) * this.f22528a.f22513e) / 2.0f);
                rectF2.right = rectF2.left + (((float) BottomLikeOptimizedView.f22502d) * this.f22528a.f22513e);
                BottomLikeOptimizedView.this.invalidate();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView$a$b */
        static final class C9241b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C9238a f22529a;

            static {
                Covode.recordClassIndex(10154);
            }

            C9241b(C9238a aVar) {
                this.f22529a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                RectF rectF = this.f22529a.f22510b;
                rectF.top = floatValue - ((((float) BottomLikeOptimizedView.f22503e) * this.f22529a.f22512d) / 2.0f);
                rectF.bottom = rectF.top + (((float) BottomLikeOptimizedView.f22503e) * this.f22529a.f22512d);
                RectF rectF2 = this.f22529a.f22511c;
                rectF2.top = floatValue - ((((float) BottomLikeOptimizedView.f22502d) * this.f22529a.f22513e) / 2.0f);
                rectF2.bottom = rectF2.top + (((float) BottomLikeOptimizedView.f22502d) * this.f22529a.f22513e);
                BottomLikeOptimizedView.this.invalidate();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9238a() {
            AnimatorSet animatorSet;
            C9275b bVar = new C9275b();
            this.f22519k = bVar;
            C9275b bVar2 = new C9275b();
            this.f22520l = bVar2;
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setEvaluator(bVar);
            valueAnimator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            valueAnimator.addUpdateListener(new C9240a(this));
            this.f22521m = valueAnimator;
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setEvaluator(bVar2);
            valueAnimator2.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            valueAnimator2.addUpdateListener(new C9241b(this));
            this.f22522n = valueAnimator2;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(valueAnimator, valueAnimator2);
            this.f22518j = animatorSet2;
            C9243c cVar = new C9243c();
            Keyframe ofFloat = Keyframe.ofFloat(0.6666667f, 1.15f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 1.0f);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(cVar, Keyframe.ofFloat(0.0f, 0.0f), ofFloat, ofFloat2));
            ofPropertyValuesHolder.setDuration(300L);
            C89219l.m154716b(ofPropertyValuesHolder, "");
            this.f22523o = ofPropertyValuesHolder;
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(new C9243c(), 1.0f, 0.0f), PropertyValuesHolder.ofInt(new C9242b(), 255, 0));
            ofPropertyValuesHolder2.setDuration(150L);
            ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(new C9246f(), 0.0f, 1.0f), PropertyValuesHolder.ofInt(new C9245e(), 0, 255));
            ofPropertyValuesHolder3.setDuration(150L);
            ofPropertyValuesHolder3.setStartDelay(100);
            animatorSet3.playTogether(ofPropertyValuesHolder2, ofPropertyValuesHolder3);
            this.f22524p = animatorSet3;
            ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(new C9245e(), 0, 255));
            ofPropertyValuesHolder4.setDuration(300L);
            C89219l.m154716b(ofPropertyValuesHolder4, "");
            this.f22525q = ofPropertyValuesHolder4;
            ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt(new C9245e(), 255, 0));
            C89219l.m154716b(ofPropertyValuesHolder5, "");
            this.f22526r = ofPropertyValuesHolder5;
            if (BottomLikeOptimizedView.this.f22507c != null) {
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofPropertyValuesHolder, animatorSet3, ofPropertyValuesHolder5, animatorSet2);
            } else {
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofPropertyValuesHolder4, ofPropertyValuesHolder5, animatorSet2);
            }
            this.f22509a = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter(this) {
                /* class com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView.C9238a.C92391 */

                /* renamed from: a */
                final /* synthetic */ C9238a f22527a;

                static {
                    Covode.recordClassIndex(10152);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f22527a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    if (BottomLikeOptimizedView.this.f22505a.contains(this.f22527a)) {
                        BottomLikeOptimizedView.this.f22505a.remove(this.f22527a);
                        BottomLikeOptimizedView.this.f22506b.release(this.f22527a);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo15332a(Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6) {
            C89219l.m154721d(bitmap, "");
            this.f22516h = bitmap;
            this.f22512d = 0.0f;
            this.f22515g = 0;
            this.f22519k.f22643a = f5;
            this.f22520l.f22643a = f6;
            this.f22521m.setFloatValues(f, f3);
            this.f22522n.setFloatValues(f2, f4);
            if (BottomLikeOptimizedView.this.f22507c != null) {
                this.f22514f = 255;
                this.f22513e = 0.0f;
                long nextLong = AbstractC89255c.Default.nextLong(500, 1200);
                this.f22524p.setStartDelay(nextLong);
                long nextInt = nextLong + ((long) AbstractC89255c.Default.nextInt(100, 200));
                this.f22526r.setStartDelay(nextInt);
                this.f22526r.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - nextInt);
            } else {
                this.f22514f = 0;
                this.f22513e = 1.0f;
                this.f22526r.setStartDelay(AbstractC89255c.Default.nextLong(666, 1100));
                Animator animator = this.f22526r;
                animator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT - animator.getStartDelay());
            }
            this.f22509a.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        for (T t : this.f22505a) {
            Bitmap bitmap = this.f22507c;
            if (bitmap != null && !bitmap.isRecycled() && t.f22510b.width() > 0.0f) {
                this.f22508g.setAlpha(t.f22514f);
                canvas.drawBitmap(bitmap, (Rect) null, t.f22510b, this.f22508g);
            }
            Bitmap bitmap2 = t.f22516h;
            if (bitmap2 != null && !bitmap2.isRecycled() && t.f22511c.width() > 0.0f) {
                this.f22508g.setAlpha(t.f22515g);
                canvas.drawBitmap(bitmap2, (Rect) null, t.f22511c, this.f22508g);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomLikeOptimizedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(6325);
        MethodCollector.m26664o(6325);
    }

    /* renamed from: a */
    public final void mo15329a(Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6) {
        C89219l.m154721d(bitmap, "");
        C9238a acquire = this.f22506b.acquire();
        if (acquire == null) {
            acquire = new C9238a();
        }
        this.f22505a.add(acquire);
        acquire.mo15332a(bitmap, f, f2, f3, f4, f5, f6);
    }
}
