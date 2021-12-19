package com.lynx.p2032b.p2033a.p2038e;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28215d;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28221j;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28234a;
import com.lynx.p2032b.p2033a.p2041h.animationInterpolatorC28243b;

/* renamed from: com.lynx.b.a.e.a */
public final class C28229a implements ValueAnimator.AnimatorUpdateListener, AbstractC28215d, AbstractC28234a {

    /* renamed from: a */
    protected View f66185a;

    /* renamed from: b */
    protected View f66186b;

    /* renamed from: c */
    protected View f66187c;

    /* renamed from: d */
    protected View f66188d;

    /* renamed from: e */
    protected View f66189e;

    /* renamed from: f */
    protected int f66190f;

    /* renamed from: g */
    protected boolean f66191g = true;

    /* renamed from: h */
    protected boolean f66192h = true;

    /* renamed from: i */
    protected C28232d f66193i = new C28232d();

    static {
        Covode.recordClassIndex(34175);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    public final View mo48288a() {
        return this.f66185a;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: b */
    public final View mo48294b() {
        return this.f66187c;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: c */
    public final boolean mo48295c() {
        if (!this.f66191g || !this.f66193i.mo48297a(this.f66185a)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: d */
    public final boolean mo48296d() {
        if (!this.f66192h || !this.f66193i.mo48298b(this.f66185a)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    public final void mo48293a(boolean z) {
        this.f66193i.f66196c = z;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    public final void mo48292a(AbstractC28221j jVar) {
        if (jVar instanceof C28232d) {
            this.f66193i = (C28232d) jVar;
        } else {
            this.f66193i.f66195b = jVar;
        }
    }

    public C28229a(View view) {
        this.f66187c = view;
        this.f66186b = view;
        this.f66185a = view;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener mo48287a(int i) {
        View view = this.f66187c;
        if (view == null || i == 0) {
            return null;
        }
        if (i < 0) {
            if (!animationInterpolatorC28243b.m56418a(view, 1)) {
                return null;
            }
        } else if (!animationInterpolatorC28243b.m56418a(this.f66187c, -1)) {
            return null;
        }
        this.f66190f = i;
        return this;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    public final void mo48290a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset((float) (-this.f66185a.getLeft()), (float) (-this.f66185a.getTop()));
        View view = this.f66187c;
        View view2 = this.f66185a;
        if (view != view2) {
            this.f66187c = m56382a(view2, pointF, view);
        }
        if (this.f66187c == this.f66185a) {
            this.f66193i.f66194a = null;
        } else {
            this.f66193i.f66194a = pointF;
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = ((float) (intValue - this.f66190f)) * this.f66187c.getScaleY();
            View view = this.f66187c;
            if (view instanceof AbsListView) {
                int i = Build.VERSION.SDK_INT;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.f66190f = intValue;
    }

    @Override // com.lynx.p2032b.p2033a.p2040g.AbstractC28234a
    /* renamed from: a */
    public final void mo48308a(boolean z, boolean z2) {
        this.f66191g = z;
        this.f66192h = z2;
    }

    /* renamed from: a */
    private View m56382a(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (animationInterpolatorC28243b.m56421a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && animationInterpolatorC28243b.m56423b(childAt)) {
                        return childAt;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        View a = m56382a(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a;
                    }
                }
            }
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48289a(int r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 1
            r5 = -1
            r2 = 0
            r4 = 0
            if (r8 == r5) goto L_0x0062
            android.view.View r0 = r6.f66186b
            android.view.View r1 = r0.findViewById(r8)
            if (r1 == 0) goto L_0x0062
            if (r7 <= 0) goto L_0x0057
            float r0 = (float) r7
            r1.setTranslationY(r0)
            r3 = 1
        L_0x0015:
            if (r9 == r5) goto L_0x004e
            android.view.View r0 = r6.f66186b
            android.view.View r1 = r0.findViewById(r9)
            if (r1 == 0) goto L_0x004e
            if (r7 >= 0) goto L_0x0043
            float r0 = (float) r7
            r1.setTranslationY(r0)
        L_0x0025:
            android.view.View r0 = r6.f66186b
            r0.setTranslationY(r4)
        L_0x002a:
            android.view.View r1 = r6.f66188d
            if (r1 == 0) goto L_0x0036
            int r0 = java.lang.Math.max(r2, r7)
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x0036:
            android.view.View r1 = r6.f66189e
            if (r1 == 0) goto L_0x0042
            int r0 = java.lang.Math.min(r2, r7)
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x0042:
            return
        L_0x0043:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r1.setTranslationY(r4)
        L_0x004e:
            if (r3 != 0) goto L_0x0025
            android.view.View r1 = r6.f66186b
            float r0 = (float) r7
            r1.setTranslationY(r0)
            goto L_0x002a
        L_0x0057:
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0062
            r1.setTranslationY(r4)
        L_0x0062:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.p2038e.C28229a.mo48289a(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r3 == null) goto L_0x0058;
     */
    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28215d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48291a(com.lynx.p2032b.p2033a.p2034a.AbstractC28219h r14, android.view.View r15, android.view.View r16) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.p2038e.C28229a.mo48291a(com.lynx.b.a.a.h, android.view.View, android.view.View):void");
    }
}
