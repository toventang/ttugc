package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.p036g.C0693f;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

public final class LikeViewOptimizedTapView extends FrameLayout {

    /* renamed from: c */
    public static final int f22630c = C3966y.m9653a(42.0f);

    /* renamed from: d */
    public static final C9273b f22631d = new C9273b((byte) 0);

    /* renamed from: a */
    public final C0693f.C0695b<C9271a> f22632a = new C0693f.C0695b<>(10);

    /* renamed from: b */
    public final LinkedList<C9271a> f22633b = new LinkedList<>();

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.LikeViewOptimizedTapView$b */
    static final class C9273b {
        static {
            Covode.recordClassIndex(10189);
        }

        private C9273b() {
        }

        public /* synthetic */ C9273b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10186);
    }

    /* renamed from: a */
    public final void mo15370a() {
        Iterator<C9271a> it = this.f22633b.iterator();
        while (it.hasNext()) {
            C9271a next = it.next();
            C89219l.m154716b(next, "");
            C9271a aVar = next;
            it.remove();
            this.f22632a.release(aVar);
            mo15371a(aVar);
            aVar.f22639f.cancel();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.anim.LikeViewOptimizedTapView$a */
    public final class C9271a {

        /* renamed from: a */
        public final ImageView f22634a;

        /* renamed from: b */
        public final C9275b f22635b;

        /* renamed from: c */
        public final C9275b f22636c;

        /* renamed from: d */
        public final PropertyValuesHolder f22637d;

        /* renamed from: e */
        public final PropertyValuesHolder f22638e;

        /* renamed from: f */
        public final AnimatorSet f22639f;

        static {
            Covode.recordClassIndex(10187);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.LikeViewOptimizedTapView$a$a */
        public static final class C9272a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C9271a f22641a;

            static {
                Covode.recordClassIndex(10188);
            }

            C9272a(C9271a aVar) {
                this.f22641a = aVar;
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (LikeViewOptimizedTapView.this.f22633b.contains(this.f22641a)) {
                    LikeViewOptimizedTapView.this.f22633b.remove(this.f22641a);
                    LikeViewOptimizedTapView.this.f22632a.release(this.f22641a);
                    LikeViewOptimizedTapView.this.mo15371a(this.f22641a);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9271a() {
            MethodCollector.m26663i(5505);
            ImageView imageView = new ImageView(LikeViewOptimizedTapView.this.getContext());
            this.f22634a = imageView;
            C9275b bVar = new C9275b();
            this.f22635b = bVar;
            C9275b bVar2 = new C9275b();
            this.f22636c = bVar2;
            Property property = FrameLayout.X;
            Float valueOf = Float.valueOf(0.0f);
            PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(property, bVar, valueOf, valueOf);
            C89219l.m154716b(ofObject, "");
            this.f22637d = ofObject;
            PropertyValuesHolder ofObject2 = PropertyValuesHolder.ofObject(FrameLayout.Y, bVar2, valueOf, valueOf);
            C89219l.m154716b(ofObject2, "");
            this.f22638e = ofObject2;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)));
            ofPropertyValuesHolder.setDuration(350L);
            Property property2 = FrameLayout.ALPHA;
            Keyframe ofFloat = Keyframe.ofFloat(0.33333334f, 0.6f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(property2, Keyframe.ofFloat(0.0f, 1.0f), ofFloat, Keyframe.ofFloat(1.0f, 0.0f));
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, ofObject, ofObject2, ofKeyframe, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 1.4f), Keyframe.ofFloat(0.16666667f, 0.5f), Keyframe.ofFloat(1.0f, 0.5f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 1.4f), Keyframe.ofFloat(0.16666667f, 0.5f), Keyframe.ofFloat(1.0f, 0.5f)));
            ofPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder2.setDuration(1500L);
            animatorSet.playSequentially(ofPropertyValuesHolder, ofPropertyValuesHolder2);
            animatorSet.addListener(new C9272a(this));
            this.f22639f = animatorSet;
            MethodCollector.m26664o(5505);
        }
    }

    /* renamed from: a */
    public final void mo15371a(C9271a aVar) {
        removeView(aVar.f22634a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeViewOptimizedTapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6317);
        MethodCollector.m26664o(6317);
    }
}
