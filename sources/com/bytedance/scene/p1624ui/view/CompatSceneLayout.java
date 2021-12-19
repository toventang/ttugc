package com.bytedance.scene.p1624ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.scene.ui.view.CompatSceneLayout */
public class CompatSceneLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(26090);
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        StatusBarView statusBarView = (StatusBarView) findViewById(R.id.dpp);
        if (statusBarView != null) {
            if (statusBarView.getParent() == this) {
                windowInsets = statusBarView.dispatchApplyWindowInsets(windowInsets);
            } else {
                throw new IllegalStateException("StatusBarView parent must be " + getClass().getSimpleName());
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        NavigationBarView navigationBarView = (NavigationBarView) findViewById(R.id.dpm);
        if (navigationBarView != null) {
            if (navigationBarView.getParent() == this) {
                windowInsets = navigationBarView.dispatchApplyWindowInsets(windowInsets);
            } else {
                throw new IllegalStateException("NavigationBarView parent must be " + getClass().getSimpleName());
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt == statusBarView || childAt == navigationBarView)) {
                windowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (windowInsets.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsets;
    }

    public CompatSceneLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(8310);
        MethodCollector.m26664o(8310);
    }
}
