package com.p2082ss.android.ugc.aweme.main.p3428b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.main.b.b */
public class C59044b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public View f134415a;

    /* renamed from: b */
    public ViewStub f134416b;

    /* renamed from: c */
    public Handler f134417c;

    /* renamed from: d */
    public Runnable f134418d = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.main.p3428b.C59044b.RunnableC590495 */

        static {
            Covode.recordClassIndex(69394);
        }

        public final void run() {
            C59044b.this.mo96570a();
        }
    };

    static {
        Covode.recordClassIndex(69389);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(252, new RunnableC90250g(C59044b.class, "onEventMainThread", C59043a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: b */
    private void m108524b() {
        EventBus.m156962a().mo145395b(this);
        Handler handler = this.f134417c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public final void mo96570a() {
        View view = this.f134415a;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f134415a, "scaleY", 1.0f, 0.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.main.p3428b.C59044b.C590484 */

                static {
                    Covode.recordClassIndex(69393);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (C59044b.this.f134416b != null) {
                        C59044b.this.f134416b.setVisibility(8);
                    }
                    if (C59044b.this.f134415a != null) {
                        C59044b.this.f134415a.clearAnimation();
                        C59044b.this.f134415a.setVisibility(8);
                    }
                }
            });
            animatorSet.start();
            m108524b();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEventMainThread(C59043a aVar) {
        mo96570a();
    }

    public C59044b(ViewStub viewStub) {
        this.f134416b = viewStub;
    }
}
