package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView;
import com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.NewVideoPlayerProgressbar;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bj */
public final class C1803bj implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1973);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(3514);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a)) {
            ((DrawerLayout.C0844d) a).f3113a = 80;
        }
        AudioControlView audioControlView = new AudioControlView(context);
        audioControlView.setId(R.id.mr);
        audioControlView.setAlpha(0.0f);
        audioControlView.setForegroundColor(resources.getColor(R.color.bm));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams)) {
            ((DrawerLayout.C0844d) layoutParams).f3113a = 80;
        }
        C0174a.m578a(audioControlView);
        if (audioControlView.getParent() == null) {
            frameLayout.addView(audioControlView, layoutParams);
        }
        LineProgressBar lineProgressBar = new LineProgressBar(context);
        lineProgressBar.setId(R.id.c9d);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(lineProgressBar);
        if (lineProgressBar.getParent() == null) {
            frameLayout.addView(lineProgressBar, layoutParams2);
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = new NewVideoPlayerProgressbar(context);
        newVideoPlayerProgressbar.setId(R.id.fd_);
        newVideoPlayerProgressbar.setReachedBarColor(resources.getColor(R.color.a_));
        newVideoPlayerProgressbar.setReachedProgressBarHeight(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(newVideoPlayerProgressbar);
        if (newVideoPlayerProgressbar.getParent() == null) {
            frameLayout.addView(newVideoPlayerProgressbar, layoutParams3);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(3514);
        return frameLayout;
    }
}
