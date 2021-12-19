package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23154c;
import com.bytedance.tux.p1722h.C23158e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55189ai;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.FunRootLinearLayout */
public class FunRootLinearLayout extends LinearLayout {

    /* renamed from: a */
    private SoftInputResizeFuncLayoutView f124236a;

    /* renamed from: b */
    private boolean f124237b;

    /* renamed from: c */
    private final Rect f124238c = new Rect();

    static {
        Covode.recordClassIndex(63918);
    }

    private SoftInputResizeFuncLayoutView getPanelView() {
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = this.f124236a;
        if (softInputResizeFuncLayoutView != null) {
            return softInputResizeFuncLayoutView;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof SoftInputResizeFuncLayoutView) {
                SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = (SoftInputResizeFuncLayoutView) childAt;
                this.f124236a = softInputResizeFuncLayoutView2;
                return softInputResizeFuncLayoutView2;
            }
        }
        return null;
    }

    public FunRootLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5574);
        MethodCollector.m26664o(5574);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        MethodCollector.m26663i(5698);
        SoftInputResizeFuncLayoutView panelView = getPanelView();
        if (panelView != null) {
            Activity a = C23154c.m43640a(getContext());
            getWindowVisibleDisplayFrame(this.f124238c);
            int height = a.getWindow().getDecorView().getHeight();
            int a2 = C55189ai.m100894a(a);
            int a3 = C23158e.m43647a(a);
            if (((height - this.f124238c.bottom) - a2) + a3 >= (((height - a2) - a3) / 10) * 3) {
                z = true;
                panelView.setVisibility(8);
            } else {
                z = false;
                if (this.f124237b && panelView.mo91327b() == 1) {
                    panelView.setVisibility(0);
                }
            }
            this.f124237b = z;
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(5698);
    }
}
