package com.bytedance.android.livesdk.service.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.animation.b */
public final class C10646b {

    /* renamed from: com.bytedance.android.livesdk.service.animation.b$c */
    public interface AbstractC10650c {
        static {
            Covode.recordClassIndex(12240);
        }

        /* renamed from: a */
        void mo15154a();

        /* renamed from: b */
        void mo15155b();

        /* renamed from: c */
        void mo15156c();

        /* renamed from: d */
        void mo15157d();
    }

    static {
        Covode.recordClassIndex(12236);
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.b$1 */
    static /* synthetic */ class C106471 {

        /* renamed from: a */
        static final /* synthetic */ int[] f25652a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 12237(0x2fcd, float:1.7148E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.service.animation.b$b[] r0 = com.bytedance.android.livesdk.service.animation.C10646b.EnumC10649b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.service.animation.C10646b.C106471.f25652a = r2
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.C10646b.EnumC10649b.entry     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.service.animation.C10646b.C106471.f25652a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.C10646b.EnumC10649b.comb     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.service.animation.C10646b.C106471.f25652a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.C10646b.EnumC10649b.show     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.service.animation.C10646b.C106471.f25652a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.C10646b.EnumC10649b.exit     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.animation.C10646b.C106471.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.b$b */
    public enum EnumC10649b {
        entry,
        comb,
        show,
        exit;

        static {
            Covode.recordClassIndex(12239);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.b$a */
    public static class C10648a implements Animator.AnimatorListener {

        /* renamed from: a */
        private AbstractC10650c f25653a;

        /* renamed from: b */
        private final EnumC10649b f25654b;

        static {
            Covode.recordClassIndex(12238);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f25653a != null) {
                int i = C106471.f25652a[this.f25654b.ordinal()];
                if (i == 1) {
                    this.f25653a.mo15154a();
                } else if (i == 2) {
                    this.f25653a.mo15155b();
                } else if (i != 3) {
                    this.f25653a.mo15157d();
                    this.f25653a = null;
                } else {
                    this.f25653a.mo15156c();
                }
            }
        }

        public C10648a(EnumC10649b bVar, AbstractC10650c cVar) {
            this.f25653a = cVar;
            this.f25654b = bVar;
        }
    }

    /* renamed from: b */
    public static AnimatorSet m19206b(View view, AbstractC10650c cVar) {
        view.getX();
        float y = view.getY();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", y, y - 100.0f).setDuration(300L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C10648a(EnumC10649b.exit, cVar));
        return animatorSet;
    }

    /* renamed from: a */
    public static AnimatorSet m19204a(View view, AbstractC10650c cVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", 1.5f, 1.0f).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", 1.5f, 1.0f).setDuration(200L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(100L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.2f).setDuration(100L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.2f).setDuration(100L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "scaleX", 1.2f, 1.0f).setDuration(100L);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, "scaleY", 1.2f, 1.0f).setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration4, duration5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(duration6, duration7);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        animatorSet4.addListener(new C10648a(EnumC10649b.comb, cVar));
        return animatorSet4;
    }

    /* renamed from: a */
    public static AnimatorSet m19205a(View view, boolean z, AbstractC10650c cVar) {
        int i;
        float x = view.getX();
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        float f = (float) i;
        float f2 = x * f;
        float f3 = f * 75.0f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", f2, f3).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", f3, 0.0f).setDuration(50L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, 0.0f).setDuration(50L);
        if (z) {
            duration = ObjectAnimator.ofFloat(view, "translationX", f2, f3).setDuration(200L);
            duration2 = ObjectAnimator.ofFloat(view, "translationX", f3, (float) C3966y.m9653a(16.0f)).setDuration(50L);
            duration3 = ObjectAnimator.ofFloat(view, "translationX", (float) C3966y.m9653a(16.0f), (float) C3966y.m9653a(16.0f)).setDuration(50L);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C10648a(EnumC10649b.entry, cVar));
        return animatorSet;
    }
}
