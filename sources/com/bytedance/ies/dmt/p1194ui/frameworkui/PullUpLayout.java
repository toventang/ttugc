package com.bytedance.ies.dmt.p1194ui.frameworkui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout */
public class PullUpLayout extends FrameLayout {

    /* renamed from: a */
    protected Context f41172a;

    /* renamed from: b */
    protected float f41173b;

    /* renamed from: c */
    protected View f41174c;

    /* renamed from: d */
    public AbstractC17242a f41175d;

    /* renamed from: e */
    public AbstractC17240a f41176e;

    /* renamed from: f */
    private VelocityTracker f41177f;

    /* renamed from: g */
    private ObjectAnimator f41178g;

    /* renamed from: h */
    private AbstractC17241b f41179h;

    /* renamed from: com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout$a */
    public interface AbstractC17240a {
        static {
            Covode.recordClassIndex(19702);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout$b */
    public interface AbstractC17241b {
        static {
            Covode.recordClassIndex(19703);
        }

        /* renamed from: a */
        void mo27277a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(19700);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41177f = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.f41177f;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f41177f.recycle();
            this.f41177f = null;
        }
    }

    /* renamed from: a */
    public final void mo27261a() {
        float translationY = this.f41174c.getTranslationY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f41174c, "translationY", translationY, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    /* renamed from: a */
    public final void mo27263a(View view) {
        this.f41174c = view;
    }

    public void setAnimationListener(AbstractC17240a aVar) {
        this.f41176e = aVar;
    }

    public void setInternalTouchEventListener(AbstractC17241b bVar) {
        this.f41179h = bVar;
    }

    public void setPullUpListener(AbstractC17242a aVar) {
        this.f41175d = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC17241b bVar = this.f41179h;
        if (bVar != null) {
            bVar.mo27277a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo27264a(MotionEvent motionEvent) {
        View view = this.f41174c;
        if ((view == null || view.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f41173b = motionEvent.getY();
        } else if (motionEvent.getAction() != 2 || this.f41173b - motionEvent.getY() <= ((float) ViewConfiguration.get(this.f41172a).getScaledTouchSlop())) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f41177f.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f41173b = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            if (!mo27264a(motionEvent)) {
                return false;
            }
            this.f41174c.setTranslationY((float) ((int) Math.min(0.0f, motionEvent.getY() - this.f41173b)));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.f41174c.getTranslationY();
            if (Math.abs(this.f41174c.getTranslationY() / ((float) this.f41174c.getHeight())) > 0.3f) {
                z = true;
            }
            mo27262a(translationY, z);
        }
        return true;
    }

    public PullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public void mo27262a(float f, final boolean z) {
        long j;
        if (this.f41174c != null) {
            this.f41177f.computeCurrentVelocity(2);
            long j2 = 300;
            if (z) {
                if (this.f41177f.getYVelocity() != 0.0f) {
                    j = (long) ((((float) this.f41174c.getHeight()) + f) / Math.abs(this.f41177f.getYVelocity()));
                } else {
                    j = 300;
                }
                View view = this.f41174c;
                this.f41178g = ObjectAnimator.ofFloat(view, "translationY", f, (float) (-view.getHeight()));
            } else {
                if (this.f41177f.getYVelocity() != 0.0f) {
                    j = (long) (f / Math.abs(this.f41177f.getYVelocity()));
                } else {
                    j = 300;
                }
                this.f41178g = ObjectAnimator.ofFloat(this.f41174c, "translationY", f, 0.0f);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(j) <= 300) {
                j2 = Math.abs(j);
            }
            animatorSet.setDuration(j2);
            animatorSet.play(this.f41178g);
            animatorSet.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout.C172391 */

                static {
                    Covode.recordClassIndex(19701);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PullUpLayout.this.f41175d == null) {
                        return;
                    }
                    if (z) {
                        PullUpLayout.this.f41175d.mo27278a();
                    } else {
                        PullUpLayout.this.f41175d.mo27279b();
                    }
                }
            });
            animatorSet.start();
        }
    }

    private PullUpLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8333);
        this.f41172a = context;
        this.f41177f = VelocityTracker.obtain();
        MethodCollector.m26664o(8333);
    }
}
