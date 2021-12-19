package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.service.animation.p623b.C10651a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

public final class RoundWaveAnimationView extends FrameLayout {

    /* renamed from: a */
    public static final C10675a f25719a = new C10675a((byte) 0);

    /* renamed from: b */
    private AbstractC88412b f25720b;

    static {
        Covode.recordClassIndex(12270);
    }

    public RoundWaveAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.RoundWaveAnimationView$a */
    public static final class C10675a {
        static {
            Covode.recordClassIndex(12271);
        }

        private C10675a() {
        }

        public /* synthetic */ C10675a(byte b) {
            this();
        }
    }

    public final AbstractC88412b getDisposable() {
        return this.f25720b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.animation.view.RoundWaveAnimationView$c */
    public static final class RunnableC10678c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoundWaveAnimationView f25724a;

        static {
            Covode.recordClassIndex(12274);
        }

        RunnableC10678c(RoundWaveAnimationView roundWaveAnimationView) {
            this.f25724a = roundWaveAnimationView;
        }

        public final void run() {
            this.f25724a.removeAllViews();
        }
    }

    /* renamed from: b */
    public final void mo17596b() {
        AbstractC88412b bVar = this.f25720b;
        if (bVar != null) {
            bVar.dispose();
        }
        post(new RunnableC10678c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.animation.view.RoundWaveAnimationView$b */
    public static final class RunnableC10676b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoundWaveAnimationView f25721a;

        /* renamed from: b */
        final /* synthetic */ LottieAnimationView f25722b;

        static {
            Covode.recordClassIndex(12272);
        }

        RunnableC10676b(RoundWaveAnimationView roundWaveAnimationView, LottieAnimationView lottieAnimationView) {
            this.f25721a = roundWaveAnimationView;
            this.f25722b = lottieAnimationView;
        }

        public final void run() {
            this.f25722b.setAnimation("ttlive_gift_combo_wave.json");
            this.f25722b.mo5828a(new C10651a(this) {
                /* class com.bytedance.android.livesdk.service.animation.view.RoundWaveAnimationView.RunnableC10676b.C106771 */

                /* renamed from: a */
                final /* synthetic */ RunnableC10676b f25723a;

                static {
                    Covode.recordClassIndex(12273);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f25723a = r1;
                }

                @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (this.f25723a.f25721a.indexOfChild(this.f25723a.f25722b) >= 0) {
                        this.f25723a.f25721a.removeView(this.f25723a.f25722b);
                    }
                }

                public final void onAnimationEnd(Animator animator, boolean z) {
                    super.onAnimationEnd(animator, z);
                    if (this.f25723a.f25721a.indexOfChild(this.f25723a.f25722b) >= 0) {
                        this.f25723a.f25721a.removeView(this.f25723a.f25722b);
                    }
                }
            });
            this.f25722b.mo5826a();
        }
    }

    /* renamed from: a */
    public final void mo17595a() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        addView(lottieAnimationView);
        post(new RunnableC10676b(this, lottieAnimationView));
    }

    public final void setDisposable(AbstractC88412b bVar) {
        this.f25720b = bVar;
    }

    private /* synthetic */ RoundWaveAnimationView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundWaveAnimationView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6115);
        MethodCollector.m26664o(6115);
    }
}
