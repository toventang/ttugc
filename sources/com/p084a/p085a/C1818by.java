package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBarMaskView;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.MainBottomTabView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.by */
public final class C1818by implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1988);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        MethodCollector.m26663i(1286);
        Resources resources = context.getResources();
        FragmentTabHost fragmentTabHost = new FragmentTabHost(context);
        fragmentTabHost.setId(R.id.ci5);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        VideoSeekBarMaskView videoSeekBarMaskView = new VideoSeekBarMaskView(context);
        videoSeekBarMaskView.setBackgroundDrawable(null);
        videoSeekBarMaskView.setId(R.id.ci2);
        ViewGroup.LayoutParams a2 = C0174a.m576a(fragmentTabHost, -1, -1);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.edy);
        ViewGroup.LayoutParams a3 = C0174a.m576a(videoSeekBarMaskView, -1, -1);
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout, a3);
        }
        View view = new View(context);
        view.setId(R.id.vf);
        view.setBackgroundColor(resources.getColor(R.color.a8));
        ViewGroup.MarginLayoutParams a4 = C0174a.m576a(videoSeekBarMaskView, -1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a4)) {
            ((DrawerLayout.C0844d) a4).f3113a = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            a4.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            videoSeekBarMaskView.addView(view, a4);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.afi);
        viewStub.setLayoutResource(R.layout.a3h);
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(videoSeekBarMaskView, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            ((LinearLayout.LayoutParams) a5).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = 8388693;
        }
        if (DrawerLayout.C0844d.class.isInstance(a5)) {
            ((DrawerLayout.C0844d) a5).f3113a = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.bottomMargin = (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            int i4 = Build.VERSION.SDK_INT;
            a5.setMarginEnd((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.rightMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        viewStub.setInflatedId(-1);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub, a5);
        }
        View mainBottomTabView = new MainBottomTabView(context);
        mainBottomTabView.setId(R.id.ci0);
        ViewGroup.LayoutParams a6 = C0174a.m576a(videoSeekBarMaskView, -1, (int) resources.getDimension(R.dimen.n5));
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            ((LinearLayout.LayoutParams) a6).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a6)) {
            ((DrawerLayout.C0844d) a6).f3113a = 80;
        }
        C0174a.m578a(mainBottomTabView);
        if (mainBottomTabView.getParent() == null) {
            videoSeekBarMaskView.addView(mainBottomTabView, a6);
        }
        View videoSeekBar = new VideoSeekBar(context);
        videoSeekBar.setId(R.id.fdm);
        videoSeekBar.setVisibility(8);
        ViewGroup.MarginLayoutParams a7 = C0174a.m576a(videoSeekBarMaskView, -1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a7)) {
            ((LinearLayout.LayoutParams) a7).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a7)) {
            ((FrameLayout.LayoutParams) a7).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a7)) {
            ((DrawerLayout.C0844d) a7).f3113a = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
            a7.bottomMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(videoSeekBar);
        if (videoSeekBar.getParent() == null) {
            videoSeekBarMaskView.addView(videoSeekBar, a7);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.fdn);
        relativeLayout.setVisibility(8);
        ViewGroup.MarginLayoutParams a8 = C0174a.m576a(videoSeekBarMaskView, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a8)) {
            ((LinearLayout.LayoutParams) a8).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a8)) {
            ((FrameLayout.LayoutParams) a8).gravity = 81;
        }
        if (DrawerLayout.C0844d.class.isInstance(a8)) {
            ((DrawerLayout.C0844d) a8).f3113a = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a8)) {
            a8.bottomMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        relativeLayout.setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.agw);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(16, R.id.agv);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(0, R.id.agv);
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H1_Semibold"), tuxTextView, layoutParams);
        C79467f.m138187a(tuxTextView, layoutParams);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.agv);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        tuxTextView2.setText("/");
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(13, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H3_Semibold"), tuxTextView2, layoutParams2);
        C79467f.m138187a(tuxTextView2, layoutParams2);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams2);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.eml);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ac});
        tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = R.id.agv;
            layoutParams3.addRule(17, R.id.agv);
        } else {
            i = R.id.agv;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(1, i);
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H1_Semibold"), tuxTextView3, layoutParams3);
        C79467f.m138187a(tuxTextView3, layoutParams3);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout.addView(tuxTextView3, layoutParams3);
        }
        C0174a.m578a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            videoSeekBarMaskView.addView(relativeLayout, a8);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.zh);
        viewStub2.setLayoutResource(R.layout.a3s);
        ViewGroup.MarginLayoutParams a9 = C0174a.m576a(videoSeekBarMaskView, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a9)) {
            i2 = 81;
            ((LinearLayout.LayoutParams) a9).gravity = 81;
        } else {
            i2 = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a9)) {
            ((FrameLayout.LayoutParams) a9).gravity = i2;
        }
        if (DrawerLayout.C0844d.class.isInstance(a9)) {
            ((DrawerLayout.C0844d) a9).f3113a = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a9)) {
            a9.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub2.setInflatedId(-1);
        C0174a.m578a(viewStub2);
        if (viewStub2.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub2, a9);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.d3m);
        frameLayout2.setVisibility(8);
        ViewGroup.LayoutParams a10 = C0174a.m576a(videoSeekBarMaskView, -1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a10)) {
            i3 = 80;
            ((LinearLayout.LayoutParams) a10).gravity = 80;
        } else {
            i3 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a10)) {
            ((FrameLayout.LayoutParams) a10).gravity = i3;
        }
        if (DrawerLayout.C0844d.class.isInstance(a10)) {
            ((DrawerLayout.C0844d) a10).f3113a = i3;
        }
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout2, a10);
        }
        C0174a.m578a(videoSeekBarMaskView);
        if (videoSeekBarMaskView.getParent() == null) {
            fragmentTabHost.addView(videoSeekBarMaskView, a2);
        }
        View view2 = new View(context);
        view2.setId(R.id.fhw);
        view2.setAlpha(0.0f);
        view2.setBackgroundColor(Color.parseColor("#111111"));
        view2.setVisibility(8);
        ViewGroup.LayoutParams a11 = C0174a.m576a(fragmentTabHost, -1, -1);
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            fragmentTabHost.addView(view2, a11);
        }
        C0174a.m578a(fragmentTabHost);
        fragmentTabHost.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(fragmentTabHost);
        }
        MethodCollector.m26664o(1286);
        return fragmentTabHost;
    }
}
