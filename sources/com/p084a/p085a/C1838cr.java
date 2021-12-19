package com.p084a.p085a;

import android.content.Context;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.cr */
public final class C1838cr implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2008);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2966);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        UpvoteBubbleView upvoteBubbleView = new UpvoteBubbleView(context);
        upvoteBubbleView.setId(R.id.f9v);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388627;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams)) {
            ((DrawerLayout.C0844d) layoutParams).f3113a = 8388627;
        }
        C0174a.m578a(upvoteBubbleView);
        if (upvoteBubbleView.getParent() == null) {
            frameLayout.addView(upvoteBubbleView, layoutParams);
        }
        UpvoteBubbleView upvoteBubbleView2 = new UpvoteBubbleView(context);
        upvoteBubbleView2.setId(R.id.f9w);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388627;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.C0844d) layoutParams2).f3113a = 8388627;
        }
        C0174a.m578a(upvoteBubbleView2);
        if (upvoteBubbleView2.getParent() == null) {
            frameLayout.addView(upvoteBubbleView2, layoutParams2);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(2966);
        return frameLayout;
    }
}
