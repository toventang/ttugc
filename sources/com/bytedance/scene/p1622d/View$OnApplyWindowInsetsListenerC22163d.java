package com.bytedance.scene.p1622d;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.d.d */
public final class View$OnApplyWindowInsetsListenerC22163d implements View.OnApplyWindowInsetsListener {
    static {
        Covode.recordClassIndex(25967);
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets2);
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
