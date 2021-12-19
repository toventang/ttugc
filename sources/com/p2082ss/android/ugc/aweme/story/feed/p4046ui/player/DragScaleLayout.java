package com.p2082ss.android.ugc.aweme.story.feed.p4046ui.player;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.ui.player.DragScaleLayout */
public final class DragScaleLayout extends FrameLayout {

    /* renamed from: a */
    private float f173267a;

    /* renamed from: b */
    private float f173268b;

    /* renamed from: c */
    private int f173269c;

    /* renamed from: d */
    private float f173270d;

    /* renamed from: e */
    private float f173271e;

    /* renamed from: f */
    private boolean f173272f;

    /* renamed from: g */
    private AbstractC89171a<C89391z> f173273g;

    static {
        Covode.recordClassIndex(90260);
    }

    public DragScaleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AbstractC89171a<C89391z> getReleaseListener() {
        return this.f173273g;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo120837a(false);
    }

    /* renamed from: a */
    private final void m135014a() {
        this.f173267a = 0.0f;
        this.f173268b = 0.0f;
        this.f173270d = 0.0f;
        this.f173271e = 0.0f;
        this.f173272f = true;
        if (getScaleX() < 0.9f || getScaleY() < 0.9f) {
            AbstractC89171a<C89391z> aVar = this.f173273g;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    public final void setReleaseListener(AbstractC89171a<C89391z> aVar) {
        this.f173273g = aVar;
    }

    /* renamed from: a */
    public final void mo120837a(boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", getScaleX(), 1.0f);
            ofFloat.setDuration(300L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", getScaleY(), 1.0f);
            ofFloat2.setDuration(300L);
            animatorSet.setInterpolator(C22971a.m43306b());
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
            return;
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f173267a = motionEvent.getX();
            this.f173268b = motionEvent.getY();
            this.f173272f = true;
        } else if (actionMasked == 1) {
            m135014a();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f173267a - x <= Math.abs(y - this.f173268b) || this.f173267a - x <= ((float) this.f173269c)) {
                this.f173268b = y;
                this.f173267a = x;
            } else {
                this.f173268b = y;
                this.f173267a = x;
                requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            m135014a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f173267a = motionEvent.getX();
            this.f173268b = motionEvent.getY();
            this.f173270d = motionEvent.getX();
            this.f173271e = motionEvent.getY();
            this.f173272f = true;
        } else if (actionMasked == 1) {
            m135014a();
        } else if (actionMasked == 2) {
            String.valueOf(motionEvent.getX());
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f173272f && this.f173267a - x > Math.abs(y - this.f173268b) && this.f173267a - x > ((float) this.f173269c)) {
                this.f173270d = motionEvent.getX();
                this.f173271e = motionEvent.getY();
                this.f173272f = false;
            }
            this.f173268b = y;
            this.f173267a = x;
            if (!this.f173272f) {
                float f = this.f173270d;
                if (f > x && f - x <= 1000.0f) {
                    float f2 = 1.0f - ((f - x) / 1000.0f);
                    String.valueOf(f2);
                    if (f2 >= 0.8f && f2 <= 1.0f) {
                        setScaleX(f2);
                        setScaleY(f2);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private /* synthetic */ DragScaleLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DragScaleLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4860);
        this.f173269c = 10;
        this.f173272f = true;
        MethodCollector.m26664o(4860);
    }
}
