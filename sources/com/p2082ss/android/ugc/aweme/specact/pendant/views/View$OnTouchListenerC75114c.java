package com.p2082ss.android.ugc.aweme.specact.pendant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.c */
public class View$OnTouchListenerC75114c extends FrameLayout implements View.OnTouchListener {

    /* renamed from: o */
    public static final C75115a f168839o = new C75115a((byte) 0);

    /* renamed from: a */
    private float f168840a;

    /* renamed from: b */
    private float f168841b;

    /* renamed from: c */
    private int f168842c;

    /* renamed from: d */
    private float f168843d;

    /* renamed from: e */
    private float f168844e;

    /* renamed from: f */
    private float f168845f;

    /* renamed from: g */
    private float f168846g;

    /* renamed from: h */
    private float f168847h;

    /* renamed from: i */
    private float f168848i;

    /* renamed from: j */
    private float f168849j;

    /* renamed from: k */
    private float f168850k;

    /* renamed from: l */
    private float f168851l;

    /* renamed from: m */
    private float f168852m;

    /* renamed from: n */
    public boolean f168853n = true;

    /* renamed from: p */
    private long f168854p;

    static {
        Covode.recordClassIndex(87987);
    }

    private final float getMaxDragX() {
        return 2.14748365E9f;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.c$a */
    public static final class C75115a {
        static {
            Covode.recordClassIndex(87988);
        }

        private C75115a() {
        }

        public /* synthetic */ C75115a(byte b) {
            this();
        }
    }

    public final boolean getCanDrag() {
        return this.f168853n;
    }

    public final void setCanDrag(boolean z) {
        this.f168853n = z;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null || !this.f168853n) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f168854p = System.currentTimeMillis();
            this.f168849j = motionEvent.getRawX();
            this.f168850k = motionEvent.getRawY();
            this.f168847h = getX() - motionEvent.getRawX();
            this.f168848i = getY() - motionEvent.getRawY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            motionEvent.getRawX();
            motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawY();
            float rawX = motionEvent.getRawX() - this.f168849j;
            float rawY = motionEvent.getRawY() - this.f168850k;
            if (Math.abs(rawX) < ((float) this.f168842c) && Math.abs(rawY) < ((float) this.f168842c) && System.currentTimeMillis() - this.f168854p < 250 && performClick()) {
                return true;
            }
            if (view == null) {
                C89219l.m154715b();
            }
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            view.getX();
            float y = view.getY();
            if (!C80471gb.m139482a()) {
                this.f168851l = (float) view2.getLeft();
                this.f168851l = Math.min(((float) view2.getWidth()) - ((float) view.getWidth()), this.f168851l) + this.f168843d;
            } else {
                this.f168851l = (float) view2.getRight();
                this.f168851l = Math.min(((float) view2.getWidth()) - ((float) view.getWidth()), this.f168851l) + this.f168845f;
            }
            this.f168852m = y;
            if (view.getY() + ((float) view2.getTop()) < this.f168844e) {
                this.f168852m = ((float) view2.getTop()) + this.f168844e;
            }
            float f = this.f168852m;
            float f2 = this.f168840a;
            if (f < f2) {
                this.f168852m = f2;
            }
            if ((((float) view2.getBottom()) - view.getY()) - ((float) view.getHeight()) < this.f168846g) {
                this.f168852m = ((float) (view2.getBottom() - view.getHeight())) - this.f168846g;
            }
            if (this.f168852m > ((float) view2.getBottom()) - this.f168841b) {
                this.f168852m = ((float) view2.getBottom()) - this.f168841b;
            }
            view.animate().x(this.f168851l).y(this.f168852m).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
            return false;
        } else if (actionMasked != 2) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (view == null) {
                C89219l.m154715b();
            }
            ViewParent parent2 = view.getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
            View view3 = (View) parent2;
            int width = view3.getWidth();
            int height = view3.getHeight();
            float min = Math.min(Math.max(0.0f, Math.max(motionEvent.getRawX() + this.f168847h, this.f168843d)), ((float) (width - view.getWidth())) - this.f168845f);
            if (min <= getMaxDragX()) {
                setX(min);
            }
            setY(Math.min(Math.max(0.0f, Math.max(motionEvent.getRawY() + this.f168848i, this.f168844e)), ((float) (height - view.getHeight())) - this.f168846g));
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC75114c(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7072);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C89219l.m154716b(viewConfiguration, "");
        this.f168842c = viewConfiguration.getScaledTouchSlop();
        this.f168840a = ((float) C34723i.m70924a(context)) * 0.11f;
        this.f168841b = ((float) C34723i.m70924a(context)) * 0.4f;
        this.f168843d = 0.0f;
        this.f168845f = C13628n.m24520b(context, 8.0f);
        setOnTouchListener(this);
        MethodCollector.m26664o(7072);
    }
}
