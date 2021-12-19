package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.a */
public final class C40533a {

    /* renamed from: a */
    View f94846a;

    /* renamed from: b */
    int f94847b;

    /* renamed from: c */
    FrameLayout.LayoutParams f94848c;

    /* renamed from: d */
    int f94849d;

    /* renamed from: e */
    boolean f94850e = true;

    /* renamed from: f */
    int f94851f;

    static {
        Covode.recordClassIndex(48354);
    }

    public C40533a(Activity activity) {
        this.f94851f = activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        View childAt = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.f94846a = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC40534b(this));
        this.f94848c = (FrameLayout.LayoutParams) this.f94846a.getLayoutParams();
    }
}
