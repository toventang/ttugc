package com.bytedance.tux.sheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSheetNavBarContainer extends FrameLayout {

    /* renamed from: c */
    public static final C23202a f54962c = new C23202a((byte) 0);

    /* renamed from: a */
    public TuxNavBar f54963a;

    /* renamed from: b */
    public TuxNavBar f54964b;

    /* renamed from: d */
    private TuxNavBar.C23179a f54965d;

    /* renamed from: e */
    private final ValueAnimator f54966e;

    static {
        Covode.recordClassIndex(27139);
    }

    public TuxSheetNavBarContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.tux.sheet.TuxSheetNavBarContainer$a */
    public static final class C23202a {
        static {
            Covode.recordClassIndex(27142);
        }

        private C23202a() {
        }

        public /* synthetic */ C23202a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54966e.cancel();
    }

    public final void setNavActions(TuxNavBar.C23179a aVar) {
        if (this.f54966e.isRunning()) {
            this.f54966e.cancel();
        }
        if (aVar == null) {
            this.f54963a.setVisibility(8);
            this.f54964b.setVisibility(8);
        } else if (this.f54965d == null) {
            this.f54963a.setVisibility(0);
            this.f54963a.setNavActions(aVar);
            this.f54964b.setVisibility(8);
        } else {
            this.f54963a.setVisibility(0);
            this.f54964b.setVisibility(0);
            this.f54963a.setAlpha(0.0f);
            this.f54964b.setAlpha(1.0f);
            this.f54963a.setNavActions(aVar);
            TuxNavBar.C23179a aVar2 = this.f54965d;
            if (aVar2 != null) {
                this.f54964b.setNavActions(aVar2);
            }
            this.f54966e.start();
        }
        this.f54965d = aVar;
    }

    private /* synthetic */ TuxSheetNavBarContainer(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSheetNavBarContainer(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9683);
        this.f54963a = new TuxNavBar(context, null, 0, 6);
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 0, 6);
        this.f54964b = tuxNavBar;
        addView(tuxNavBar);
        addView(this.f54963a);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C89219l.m154709a((Object) ofFloat, "");
        this.f54966e = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.bytedance.tux.sheet.TuxSheetNavBarContainer.C232001 */

            /* renamed from: a */
            final /* synthetic */ TuxSheetNavBarContainer f54967a;

            static {
                Covode.recordClassIndex(27140);
            }

            {
                this.f54967a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154709a((Object) valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    this.f54967a.f54964b.setAlpha(1.0f - floatValue);
                    this.f54967a.f54963a.setAlpha(floatValue);
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter(this) {
            /* class com.bytedance.tux.sheet.TuxSheetNavBarContainer.C232012 */

            /* renamed from: a */
            final /* synthetic */ TuxSheetNavBarContainer f54968a;

            static {
                Covode.recordClassIndex(27141);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f54968a = r1;
            }

            public final void onAnimationEnd(Animator animator, boolean z) {
                this.f54968a.f54963a.setVisibility(0);
                this.f54968a.f54964b.setVisibility(8);
            }
        });
        MethodCollector.m26664o(9683);
    }
}
