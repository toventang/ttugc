package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.tux.business.p4170a.C79468a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bz */
public final class C1819bz implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1989);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2095);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.bgi);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams)) {
            ((DrawerLayout.C0844d) layoutParams).f3113a = 17;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755491", "raw"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("24", "dp"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("24", "dp"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView, layoutParams);
        C79466e.m138185a(tuxIconView, layoutParams);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams);
        }
        StoryBrandView storyBrandView = new StoryBrandView(context);
        storyBrandView.setId(R.id.bgx);
        storyBrandView.setVisibility(4);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        C79468a.m138190a("app:ring_width", new C1863a.C1867d("2.5", "dp"), storyBrandView, layoutParams2);
        C79468a.m138189a(storyBrandView, layoutParams2);
        C0174a.m578a(storyBrandView);
        if (storyBrandView.getParent() == null) {
            frameLayout.addView(storyBrandView, layoutParams2);
        }
        AvatarImageView avatarImageView = new AvatarImageView(context);
        avatarImageView.setId(R.id.bsr);
        avatarImageView.setVisibility(8);
        avatarImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.C0844d) layoutParams3).f3113a = 17;
        }
        C0174a.m578a(avatarImageView);
        if (avatarImageView.getParent() == null) {
            frameLayout.addView(avatarImageView, layoutParams3);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(2095);
        return frameLayout;
    }
}
