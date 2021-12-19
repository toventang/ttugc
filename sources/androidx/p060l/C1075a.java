package androidx.p060l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.a */
final class C1075a {

    /* renamed from: androidx.l.a$a */
    interface AbstractC1076a {
        static {
            Covode.recordClassIndex(1169);
        }

        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    static {
        Covode.recordClassIndex(1168);
    }

    /* renamed from: a */
    static void m3633a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        int i = Build.VERSION.SDK_INT;
        animator.addPauseListener(animatorListenerAdapter);
    }
}
