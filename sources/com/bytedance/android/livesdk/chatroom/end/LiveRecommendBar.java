package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LiveRecommendBar extends View {

    /* renamed from: a */
    public int f18626a = -1;

    /* renamed from: b */
    public ValueAnimator f18627b;

    /* renamed from: c */
    private RunnableC7502a f18628c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar$b */
    public interface AbstractC7504b {
        static {
            Covode.recordClassIndex(8275);
        }

        /* renamed from: a */
        void mo13758a();
    }

    static {
        Covode.recordClassIndex(8272);
    }

    /* renamed from: a */
    public final void mo13751a() {
        removeCallbacks(this.f18628c);
        ValueAnimator valueAnimator = this.f18627b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f18627b.removeAllListeners();
            this.f18627b.cancel();
            C13628n.m24511a(this, this.f18626a, -3);
            this.f18627b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar$a */
    public class RunnableC7502a implements Runnable {

        /* renamed from: a */
        public AbstractC7504b f18629a;

        static {
            Covode.recordClassIndex(8273);
        }

        public final void run() {
            if (LiveRecommendBar.this.f18626a <= 0) {
                LiveRecommendBar liveRecommendBar = LiveRecommendBar.this;
                liveRecommendBar.f18626a = liveRecommendBar.getMeasuredWidth();
            }
            LiveRecommendBar.this.mo13751a();
            LiveRecommendBar.this.f18627b = ValueAnimator.ofFloat(1.0f, 0.0f);
            LiveRecommendBar.this.f18627b.setDuration(5000L);
            LiveRecommendBar.this.f18627b.setInterpolator(new LinearInterpolator());
            LiveRecommendBar.this.f18627b.addUpdateListener(new C7527i(this));
            LiveRecommendBar.this.f18627b.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar.RunnableC7502a.C75031 */

                static {
                    Covode.recordClassIndex(8274);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (RunnableC7502a.this.f18629a != null) {
                        RunnableC7502a.this.f18629a.mo13758a();
                    }
                }
            });
            LiveRecommendBar.this.f18627b.start();
        }

        public RunnableC7502a(AbstractC7504b bVar) {
            this.f18629a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo13752a(AbstractC7504b bVar) {
        removeCallbacks(this.f18628c);
        RunnableC7502a aVar = new RunnableC7502a(bVar);
        this.f18628c = aVar;
        post(aVar);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5044);
        MethodCollector.m26664o(5044);
    }
}
