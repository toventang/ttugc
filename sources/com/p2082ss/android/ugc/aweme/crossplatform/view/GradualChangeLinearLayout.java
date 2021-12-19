package com.p2082ss.android.ugc.aweme.crossplatform.view;

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
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout */
public final class GradualChangeLinearLayout extends LinearLayout {

    /* renamed from: a */
    public Space f95381a;

    /* renamed from: b */
    public int f95382b;

    /* renamed from: c */
    public int f95383c;

    /* renamed from: d */
    public boolean f95384d;

    /* renamed from: e */
    private SingleWebView f95385e;

    /* renamed from: f */
    private CrossPlatformTitleBar f95386f;

    /* renamed from: g */
    private int f95387g;

    /* renamed from: h */
    private int f95388h;

    static {
        Covode.recordClassIndex(48583);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final CrossPlatformTitleBar getTitleBar() {
        return this.f95386f;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC40733a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f95389a;

        static {
            Covode.recordClassIndex(48584);
        }

        public final void onGlobalLayout() {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f95389a;
            gradualChangeLinearLayout.f95382b = GradualChangeLinearLayout.m82190a(gradualChangeLinearLayout).getHeight();
            GradualChangeLinearLayout.m82190a(this.f95389a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC40733a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f95389a = gradualChangeLinearLayout;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.cpw);
        C89219l.m154716b(findViewById, "");
        Space space = (Space) findViewById;
        this.f95381a = space;
        if (space == null) {
            C89219l.m154710a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC40733a(this));
        View findViewById2 = findViewById(R.id.agg);
        C89219l.m154716b(findViewById2, "");
        SingleWebView a = ((AbstractC40746j) ((CrossPlatformWebView) findViewById2).mo69911a(AbstractC40746j.class)).mo69969a();
        C89219l.m154716b(a, "");
        this.f95385e = a;
        if (a == null) {
            C89219l.m154710a("webView");
        }
        a.setWebScrollListener(new C40734b(this));
    }

    public final void setTitleBar(CrossPlatformTitleBar crossPlatformTitleBar) {
        this.f95386f = crossPlatformTitleBar;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout$b */
    public static final class C40734b implements AbstractC40736b {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f95390a;

        static {
            Covode.recordClassIndex(48585);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40734b(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f95390a = gradualChangeLinearLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40736b
        /* renamed from: a */
        public final void mo66154a(int i, int i2) {
            this.f95390a.f95383c = i;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Space m82190a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f95381a;
        if (space == null) {
            C89219l.m154710a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f95384d = z;
        Space space = this.f95381a;
        if (space == null) {
            C89219l.m154710a("space");
        }
        if (space.getHeight() != this.f95382b) {
            Space space2 = this.f95381a;
            if (space2 == null) {
                C89219l.m154710a("space");
            }
            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f95382b;
            Space space3 = this.f95381a;
            if (space3 == null) {
                C89219l.m154710a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!this.f95384d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getActionMasked())) == null)) {
            if (valueOf.intValue() == 0) {
                this.f95387g = (int) motionEvent.getY();
                this.f95388h = (int) motionEvent.getY();
            } else if (valueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i = y - this.f95388h;
                Space space = this.f95381a;
                if (space == null) {
                    C89219l.m154710a("space");
                }
                int height = space.getHeight();
                this.f95388h = y;
                if (height > 0 && i < 0) {
                    Space space2 = this.f95381a;
                    if (space2 == null) {
                        C89219l.m154710a("space");
                    }
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height += i;
                    if (layoutParams.height < 0) {
                        layoutParams.height = 0;
                    }
                    Space space3 = this.f95381a;
                    if (space3 == null) {
                        C89219l.m154710a("space");
                    }
                    space3.setLayoutParams(layoutParams);
                    CrossPlatformTitleBar crossPlatformTitleBar = this.f95386f;
                    if (crossPlatformTitleBar != null) {
                        crossPlatformTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f95382b));
                    }
                    return true;
                } else if (height < this.f95382b && this.f95383c == 0 && i > 0) {
                    Space space4 = this.f95381a;
                    if (space4 == null) {
                        C89219l.m154710a("space");
                    }
                    ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                    layoutParams2.height += i;
                    int i2 = layoutParams2.height;
                    int i3 = this.f95382b;
                    if (i2 > i3) {
                        layoutParams2.height = i3;
                    }
                    CrossPlatformTitleBar crossPlatformTitleBar2 = this.f95386f;
                    if (crossPlatformTitleBar2 != null) {
                        crossPlatformTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f95382b));
                    }
                    Space space5 = this.f95381a;
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
        MethodCollector.m26663i(4763);
        MethodCollector.m26664o(4763);
    }
}
