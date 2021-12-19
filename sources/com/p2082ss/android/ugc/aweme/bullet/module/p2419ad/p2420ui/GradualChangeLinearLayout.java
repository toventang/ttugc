package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.p2420ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout */
public final class GradualChangeLinearLayout extends LinearLayout implements SSWebView.AbstractC16469b {

    /* renamed from: a */
    public Space f83112a;

    /* renamed from: b */
    public int f83113b;

    /* renamed from: c */
    public boolean f83114c;

    /* renamed from: d */
    private int f83115d;

    /* renamed from: e */
    private int f83116e;

    /* renamed from: f */
    private int f83117f;

    /* renamed from: g */
    private BulletCommonTitleBar f83118g;

    static {
        Covode.recordClassIndex(42356);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final BulletCommonTitleBar getTitleBar() {
        return this.f83118g;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC35198a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f83119a;

        static {
            Covode.recordClassIndex(42357);
        }

        public final void onGlobalLayout() {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f83119a;
            gradualChangeLinearLayout.f83113b = GradualChangeLinearLayout.m72043a(gradualChangeLinearLayout).getHeight();
            GradualChangeLinearLayout.m72043a(this.f83119a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC35198a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f83119a = gradualChangeLinearLayout;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.cpw);
        C89219l.m154716b(findViewById, "");
        Space space = (Space) findViewById;
        this.f83112a = space;
        if (space == null) {
            C89219l.m154710a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC35198a(this));
    }

    public final void setTitleBar(BulletCommonTitleBar bulletCommonTitleBar) {
        this.f83118g = bulletCommonTitleBar;
    }

    /* renamed from: a */
    public static final /* synthetic */ Space m72043a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f83112a;
        if (space == null) {
            C89219l.m154710a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f83114c = z;
        Space space = this.f83112a;
        if (space == null) {
            C89219l.m154710a("space");
        }
        if (space.getHeight() != this.f83113b) {
            Space space2 = this.f83112a;
            if (space2 == null) {
                C89219l.m154710a("space");
            }
            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f83113b;
            Space space3 = this.f83112a;
            if (space3 == null) {
                C89219l.m154710a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!this.f83114c) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getActionMasked())) == null)) {
            if (valueOf.intValue() == 0) {
                this.f83115d = (int) motionEvent.getY();
                this.f83116e = (int) motionEvent.getY();
            } else if (valueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i = y - this.f83116e;
                Space space = this.f83112a;
                if (space == null) {
                    C89219l.m154710a("space");
                }
                int height = space.getHeight();
                this.f83116e = y;
                if (height > 0 && i < 0) {
                    Space space2 = this.f83112a;
                    if (space2 == null) {
                        C89219l.m154710a("space");
                    }
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height += i;
                    if (layoutParams.height < 0) {
                        layoutParams.height = 0;
                    }
                    Space space3 = this.f83112a;
                    if (space3 == null) {
                        C89219l.m154710a("space");
                    }
                    space3.setLayoutParams(layoutParams);
                    BulletCommonTitleBar bulletCommonTitleBar = this.f83118g;
                    if (bulletCommonTitleBar != null) {
                        bulletCommonTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f83113b));
                    }
                    return true;
                } else if (height < this.f83113b && this.f83117f == 0 && i > 0) {
                    Space space4 = this.f83112a;
                    if (space4 == null) {
                        C89219l.m154710a("space");
                    }
                    ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                    layoutParams2.height += i;
                    int i2 = layoutParams2.height;
                    int i3 = this.f83113b;
                    if (i2 > i3) {
                        layoutParams2.height = i3;
                    }
                    BulletCommonTitleBar bulletCommonTitleBar2 = this.f83118g;
                    if (bulletCommonTitleBar2 != null) {
                        bulletCommonTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f83113b));
                    }
                    Space space5 = this.f83112a;
                    if (space5 == null) {
                        C89219l.m154710a("space");
                    }
                    space5.setLayoutParams(layoutParams2);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ GradualChangeLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GradualChangeLinearLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6300);
        MethodCollector.m26664o(6300);
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16469b
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f83117f = i2;
    }
}
