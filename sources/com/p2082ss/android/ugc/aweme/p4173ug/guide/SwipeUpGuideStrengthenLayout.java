package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout */
public final class SwipeUpGuideStrengthenLayout extends RelativeLayout {

    /* renamed from: a */
    private float f178712a;

    /* renamed from: b */
    private float f178713b;

    /* renamed from: c */
    private AbstractC39193e f178714c;

    /* renamed from: d */
    private final float f178715d;

    /* renamed from: e */
    private float f178716e;

    /* renamed from: f */
    private Runnable f178717f;

    static {
        Covode.recordClassIndex(92854);
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final float getDensity() {
        return this.f178715d;
    }

    public final float getDisAmount() {
        return this.f178716e;
    }

    public final Runnable getFallBackRunnable() {
        return this.f178717f;
    }

    public final float getPreviousY() {
        return this.f178713b;
    }

    public final AbstractC39193e getViewPager() {
        return this.f178714c;
    }

    public final float getYDown() {
        return this.f178712a;
    }

    public final void setDisAmount(float f) {
        this.f178716e = f;
    }

    public final void setFallBackRunnable(Runnable runnable) {
        this.f178717f = runnable;
    }

    public final void setPreviousY(float f) {
        this.f178713b = f;
    }

    public final void setViewPager(AbstractC39193e eVar) {
        this.f178714c = eVar;
    }

    public final void setYDown(float f) {
        this.f178712a = f;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        AbstractC39193e eVar;
        AbstractC39193e eVar2;
        AbstractC39193e eVar3;
        AbstractC39193e eVar4;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                float y = motionEvent.getY();
                this.f178712a = y;
                this.f178713b = y;
                AbstractC39193e eVar5 = this.f178714c;
                if (eVar5 != null) {
                    eVar5.mo67983c();
                }
            } else if (action == 1) {
                AbstractC39193e eVar6 = this.f178714c;
                if (!(eVar6 == null || !eVar6.mo67981b() || (eVar = this.f178714c) == null)) {
                    eVar.mo67987d();
                }
                this.f178712a = 0.0f;
                this.f178716e = 0.0f;
                AbstractC39193e eVar7 = this.f178714c;
                if (!(eVar7 instanceof VerticalViewPager)) {
                    eVar7 = null;
                }
                VerticalViewPager verticalViewPager = (VerticalViewPager) eVar7;
                if (!(verticalViewPager == null || verticalViewPager.getChildCount() != 1 || (runnable = this.f178717f) == null)) {
                    runnable.run();
                }
            } else if (action == 2) {
                float y2 = motionEvent.getY() - this.f178713b;
                this.f178713b = motionEvent.getY();
                if (y2 < 0.0f || this.f178716e < 0.0f) {
                    AbstractC39193e eVar8 = this.f178714c;
                    if (!(eVar8 == null || eVar8.mo67981b() || (eVar2 = this.f178714c) == null)) {
                        eVar2.mo67983c();
                    }
                    AbstractC39193e eVar9 = this.f178714c;
                    if (eVar9 != null) {
                        eVar9.mo67970a(y2);
                    }
                    this.f178716e += y2;
                }
            } else if (action == 3 && (eVar3 = this.f178714c) != null && eVar3.mo67981b() && (eVar4 = this.f178714c) != null) {
                eVar4.mo67987d();
            }
        }
        return true;
    }

    private /* synthetic */ SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5346);
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        this.f178715d = resources.getDisplayMetrics().density;
        MethodCollector.m26664o(5346);
    }
}
