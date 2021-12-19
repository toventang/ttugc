package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class BarrageView extends RelativeLayout {

    /* renamed from: a */
    View f27147a = findViewById(R.id.ahh);

    /* renamed from: b */
    View f27148b = findViewById(R.id.ahf);

    /* renamed from: c */
    public boolean f27149c;

    /* renamed from: d */
    public boolean f27150d;

    static {
        Covode.recordClassIndex(12980);
    }

    public View getDanmuContainer() {
        return this.f27147a;
    }

    public View getDanmuInput() {
        return this.f27148b;
    }

    private int getLayoutId() {
        if (C6229a.m13521a(getContext())) {
            return R.layout.bdk;
        }
        return R.layout.bdj;
    }

    /* renamed from: a */
    public final void mo18138a() {
        if (!this.f27149c && !this.f27150d) {
            if (C6229a.m13521a(getContext())) {
                m20104c();
            } else {
                m20102b();
            }
        }
    }

    /* renamed from: b */
    private void m20102b() {
        this.f27148b.setSelected(false);
        ((TransitionDrawable) this.f27147a.getBackground()).reverseTransition(100);
        ((TransitionDrawable) this.f27148b.getBackground()).reverseTransition(100);
        this.f27148b.animate().translationXBy(-C13628n.m24520b(getContext(), 22.0f)).setDuration(100).start();
    }

    /* renamed from: c */
    private void m20104c() {
        this.f27148b.setSelected(false);
        ((TransitionDrawable) this.f27147a.getBackground()).reverseTransition(100);
        ((TransitionDrawable) this.f27148b.getBackground()).reverseTransition(100);
        this.f27148b.animate().setListener(new Animator.AnimatorListener() {
            /* class com.bytedance.android.livesdk.widget.BarrageView.C113412 */

            static {
                Covode.recordClassIndex(12982);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                BarrageView.this.f27150d = true;
            }

            public final void onAnimationEnd(Animator animator) {
                BarrageView.this.f27150d = false;
                BarrageView.this.f27148b.setTranslationX(0.0f);
            }
        }).translationXBy(C13628n.m24520b(getContext(), 22.0f)).setDuration(100).start();
    }

    /* renamed from: a */
    public final void mo18139a(boolean z) {
        if (!this.f27149c && !this.f27150d) {
            if (C6229a.m13521a(getContext())) {
                m20105c(z);
            } else {
                m20103b(z);
            }
        }
    }

    /* renamed from: b */
    private void m20103b(boolean z) {
        this.f27148b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f27147a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f27148b.getBackground()).startTransition(100);
            this.f27148b.animate().translationXBy(C13628n.m24520b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f27147a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f27148b.getBackground()).startTransition(0);
        this.f27148b.setTranslationX(C13628n.m24520b(getContext(), 22.0f));
    }

    /* renamed from: c */
    private void m20105c(boolean z) {
        this.f27148b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f27147a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f27148b.getBackground()).startTransition(100);
            this.f27148b.animate().setListener(new Animator.AnimatorListener() {
                /* class com.bytedance.android.livesdk.widget.BarrageView.C113401 */

                static {
                    Covode.recordClassIndex(12981);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f27149c = false;
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f27149c = true;
                }
            }).translationXBy(C13628n.m24520b(getContext(), -22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f27147a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f27148b.getBackground()).startTransition(0);
        this.f27148b.setTranslationX(C13628n.m24520b(getContext(), -22.0f));
    }

    public BarrageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10035);
        inflate(getContext(), getLayoutId(), this);
        MethodCollector.m26664o(10035);
    }
}
