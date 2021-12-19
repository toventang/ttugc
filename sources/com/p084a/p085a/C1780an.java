package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.RichTagView;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.TagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p2082ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p2082ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p2082ss.android.ugc.aweme.feed.adapter.WidgetContainerMonitorView;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.DebugInfoView;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.FeedInterceptTouchLayout;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.StoryTag;
import com.p2082ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.RestrictTextView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.an */
public final class C1780an implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1950);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f2;
        int i18;
        int i19;
        MethodCollector.m26663i(1246);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ffz);
        frameLayout.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        View longPressLayout = new LongPressLayout(context);
        longPressLayout.setId(R.id.ch5);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(longPressLayout);
        if (longPressLayout.getParent() == null) {
            frameLayout.addView(longPressLayout, layoutParams);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.d3e);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams2);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.afn);
        smartImageView.setBackgroundResource(R.drawable.b2g);
        smartImageView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.C0844d) layoutParams3).f3113a = 17;
        }
        C0174a.m578a(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams3);
        }
        View view = new View(context);
        view.setId(R.id.bbs);
        view.setBackgroundResource(R.drawable.a05);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 48;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.C0844d) layoutParams4).f3113a = 48;
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams4);
        }
        View view2 = new View(context);
        view2.setId(R.id.bbq);
        view2.setBackgroundResource(R.drawable.a04);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.C0844d) layoutParams5).f3113a = 80;
        }
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams5);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.bp8);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.C0844d) layoutParams6).f3113a = 17;
        }
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.em);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams7);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.fd);
        viewStub2.setLayoutResource(R.layout.st);
        ViewGroup.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        C0174a.m578a(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams8);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.b15);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setInflatedId(-1);
        C0174a.m578a(viewStub3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3, layoutParams9);
        }
        WidgetContainerMonitorView widgetContainerMonitorView = new WidgetContainerMonitorView(context);
        widgetContainerMonitorView.setId(R.id.fir);
        ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.emc);
        ViewGroup.LayoutParams a2 = C0174a.m576a(widgetContainerMonitorView, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
            ((RelativeLayout.LayoutParams) a2).addRule(2, R.id.dhe);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.feb);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(12, -1);
        }
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            relativeLayout.addView(frameLayout4, layoutParams11);
        }
        View space = new Space(context);
        space.setId(R.id.d2c);
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(2, R.id.p8);
        }
        C0174a.m578a(space);
        if (space.getParent() == null) {
            relativeLayout.addView(space, layoutParams12);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.fc4);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(2, R.id.p8);
        }
        C0174a.m578a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            relativeLayout.addView(frameLayout5, layoutParams13);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.p8);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(2, R.id.b3d);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.p7);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.fn);
        remoteImageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            int i20 = Build.VERSION.SDK_INT;
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView, layoutParams16);
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context);
        remoteImageView2.setId(R.id.f9);
        remoteImageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            int i21 = Build.VERSION.SDK_INT;
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            ((ViewGroup.MarginLayoutParams) layoutParams17).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(remoteImageView2);
        if (remoteImageView2.getParent() == null) {
            linearLayout.addView(remoteImageView2, layoutParams17);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.fb9);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundResource(R.drawable.a0g);
        linearLayout2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            int i22 = Build.VERSION.SDK_INT;
            layoutParams18.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        linearLayout2.setGravity(16);
        RemoteImageView remoteImageView3 = new RemoteImageView(context);
        remoteImageView3.setId(R.id.fb_);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            int i23 = Build.VERSION.SDK_INT;
            layoutParams19.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).topMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).bottomMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            int i24 = Build.VERSION.SDK_INT;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        C1766a aVar = new C1766a();
        aVar.mo5576a("app:failureImage", new C1863a.C1865b("2131231787", "drawable"), remoteImageView3, layoutParams19);
        aVar.mo5576a("app:actualImageScaleType", new C1863a.C1866c("fitCenter"), remoteImageView3, layoutParams19);
        aVar.mo5575a(remoteImageView3, layoutParams19);
        C0174a.m578a(remoteImageView3);
        if (remoteImageView3.getParent() == null) {
            linearLayout2.addView(remoteImageView3, layoutParams19);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.fba);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.ac));
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            int i25 = Build.VERSION.SDK_INT;
            i = 1;
            layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            f = 2.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams20).topMargin = (int) TypedValue.applyDimension(i, 2.0f, resources.getDisplayMetrics());
        } else {
            f = 2.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            ((ViewGroup.MarginLayoutParams) layoutParams20).bottomMargin = (int) TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView, layoutParams20);
        C79467f.m138187a(tuxTextView, layoutParams20);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout2.addView(tuxTextView, layoutParams20);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams18);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.b5q);
        frameLayout7.setVisibility(8);
        ViewGroup.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        C0174a.m578a(frameLayout7);
        if (frameLayout7.getParent() == null) {
            linearLayout.addView(frameLayout7, layoutParams21);
        }
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.fdr);
        ViewGroup.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            int i26 = Build.VERSION.SDK_INT;
            layoutParams23.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            i2 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams23).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i2 = 1;
        }
        StoryTag storyTag = new StoryTag(context);
        storyTag.setId(R.id.e_2);
        storyTag.setPadding(storyTag.getPaddingLeft(), (int) TypedValue.applyDimension(i2, 2.0f, resources.getDisplayMetrics()), storyTag.getPaddingRight(), storyTag.getPaddingBottom());
        storyTag.setPadding(storyTag.getPaddingLeft(), storyTag.getPaddingTop(), storyTag.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        storyTag.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), storyTag.getPaddingTop(), storyTag.getPaddingRight(), storyTag.getPaddingBottom());
        storyTag.setPadding(storyTag.getPaddingLeft(), storyTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), storyTag.getPaddingBottom());
        storyTag.setBackgroundColor(resources.getColor(R.color.c9));
        storyTag.setVisibility(8);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            int i27 = Build.VERSION.SDK_INT;
            i3 = 1;
            layoutParams24.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i3 = 1;
        }
        storyTag.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(context);
        ViewGroup.MarginLayoutParams a3 = C0174a.m576a(storyTag, (int) TypedValue.applyDimension(i3, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i3, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            int i28 = Build.VERSION.SDK_INT;
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            i4 = 16;
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = i4;
        }
        if (DrawerLayout.C0844d.class.isInstance(a3)) {
            ((DrawerLayout.C0844d) a3).f3113a = i4;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755493", "raw"), tuxIconView, a3);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView, a3);
        C79466e.m138185a(tuxIconView, a3);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            storyTag.addView(tuxIconView, a3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setText(R.string.g6_);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        ViewGroup.MarginLayoutParams a4 = C0174a.m576a(storyTag, -2, -2);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Semibold"), tuxTextView2, a4);
        C79467f.m138187a(tuxTextView2, a4);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            storyTag.addView(tuxTextView2, a4);
        }
        C0174a.m578a(storyTag);
        if (storyTag.getParent() == null) {
            linearLayout3.addView(storyTag, layoutParams24);
        }
        View tagLayout = new TagLayout(context);
        tagLayout.setId(R.id.fe0);
        ViewGroup.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(tagLayout);
        if (tagLayout.getParent() == null) {
            linearLayout3.addView(tagLayout, layoutParams25);
        }
        C0174a.m578a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout8.addView(linearLayout3, layoutParams23);
        }
        View animationImageView = new AnimationImageView(context);
        animationImageView.setId(R.id.fdf);
        FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 66.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams26)) {
            ((ViewGroup.MarginLayoutParams) layoutParams26).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(animationImageView);
        if (animationImageView.getParent() == null) {
            frameLayout8.addView(animationImageView, layoutParams26);
        }
        C0174a.m578a(frameLayout8);
        if (frameLayout8.getParent() == null) {
            linearLayout.addView(frameLayout8, layoutParams22);
        }
        View commerceMicroTagLayout = new CommerceMicroTagLayout(context);
        commerceMicroTagLayout.setId(R.id.ck2);
        commerceMicroTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            int i29 = Build.VERSION.SDK_INT;
            layoutParams27.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            int i30 = Build.VERSION.SDK_INT;
            layoutParams27.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            ((ViewGroup.MarginLayoutParams) layoutParams27).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(commerceMicroTagLayout);
        if (commerceMicroTagLayout.getParent() == null) {
            linearLayout.addView(commerceMicroTagLayout, layoutParams27);
        }
        View commerceTagLayout = new CommerceTagLayout(context);
        commerceTagLayout.setId(R.id.c9w);
        commerceTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            int i31 = Build.VERSION.SDK_INT;
            layoutParams28.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            ((ViewGroup.MarginLayoutParams) layoutParams28).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(commerceTagLayout);
        if (commerceTagLayout.getParent() == null) {
            linearLayout.addView(commerceTagLayout, layoutParams28);
        }
        View douPlusTagLayout = new DouPlusTagLayout(context);
        douPlusTagLayout.setId(R.id.anv);
        douPlusTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams29 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            int i32 = Build.VERSION.SDK_INT;
            layoutParams29.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            int i33 = Build.VERSION.SDK_INT;
            layoutParams29.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            ((ViewGroup.MarginLayoutParams) layoutParams29).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(douPlusTagLayout);
        if (douPlusTagLayout.getParent() == null) {
            linearLayout.addView(douPlusTagLayout, layoutParams29);
        }
        View feedInterceptTouchLayout = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout.setId(R.id.b17);
        ViewGroup.LayoutParams layoutParams30 = new LinearLayout.LayoutParams(-2, -2);
        C0174a.m578a(feedInterceptTouchLayout);
        if (feedInterceptTouchLayout.getParent() == null) {
            linearLayout.addView(feedInterceptTouchLayout, layoutParams30);
        }
        View frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.b14);
        ViewGroup.LayoutParams layoutParams31 = new LinearLayout.LayoutParams(-2, -2);
        C0174a.m578a(frameLayout9);
        if (frameLayout9.getParent() == null) {
            linearLayout.addView(frameLayout9, layoutParams31);
        }
        View feedInterceptTouchLayout2 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout2.setId(R.id.c34);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            int i34 = Build.VERSION.SDK_INT;
            layoutParams32.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            int i35 = Build.VERSION.SDK_INT;
            layoutParams32.setMarginEnd((int) resources.getDimension(R.dimen.g6));
        }
        C0174a.m578a(feedInterceptTouchLayout2);
        if (feedInterceptTouchLayout2.getParent() == null) {
            linearLayout.addView(feedInterceptTouchLayout2, layoutParams32);
        }
        View feedInterceptTouchLayout3 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout3.setId(R.id.fe_);
        LinearLayout.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams33)) {
            ((RelativeLayout.LayoutParams) layoutParams33).addRule(2, R.id.du);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            ((ViewGroup.MarginLayoutParams) layoutParams33).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(feedInterceptTouchLayout3);
        if (feedInterceptTouchLayout3.getParent() == null) {
            linearLayout.addView(feedInterceptTouchLayout3, layoutParams33);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.du);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams34)) {
            ((RelativeLayout.LayoutParams) layoutParams34).addRule(2, R.id.fec);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            int i36 = Build.VERSION.SDK_INT;
            i5 = 1;
            layoutParams34.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        } else {
            i5 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            ((ViewGroup.MarginLayoutParams) layoutParams34).bottomMargin = (int) TypedValue.applyDimension(i5, 6.0f, resources.getDisplayMetrics());
        }
        RichTagView richTagView = new RichTagView(context);
        richTagView.setId(R.id.dt);
        LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams35)) {
            i6 = 16;
            layoutParams35.gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams35)) {
            ((FrameLayout.LayoutParams) layoutParams35).gravity = i6;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams35)) {
            ((DrawerLayout.C0844d) layoutParams35).f3113a = i6;
        }
        C0174a.m578a(richTagView);
        if (richTagView.getParent() == null) {
            linearLayout4.addView(richTagView, layoutParams35);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.cki);
        tuxTextView3.setVisibility(8);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a_));
        LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams36)) {
            int i37 = Build.VERSION.SDK_INT;
            layoutParams36.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams36)) {
            i7 = 16;
            layoutParams36.gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams36)) {
            ((FrameLayout.LayoutParams) layoutParams36).gravity = i7;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams36)) {
            ((DrawerLayout.C0844d) layoutParams36).f3113a = i7;
        }
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout4.addView(tuxTextView3, layoutParams36);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.ckh);
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setVisibility(8);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a_));
        LinearLayout.LayoutParams layoutParams37 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams37)) {
            i8 = 16;
            layoutParams37.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams37)) {
            ((FrameLayout.LayoutParams) layoutParams37).gravity = i8;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams37)) {
            ((DrawerLayout.C0844d) layoutParams37).f3113a = i8;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView4, layoutParams37);
        C79467f.m138187a(tuxTextView4, layoutParams37);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout4.addView(tuxTextView4, layoutParams37);
        }
        C0174a.m578a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams34);
        }
        FrameLayout frameLayout10 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams38 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            ((RelativeLayout.LayoutParams) layoutParams38).addRule(2, R.id.apf);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout4 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout4.setId(R.id.fec);
        feedInterceptTouchLayout4.setPadding(feedInterceptTouchLayout4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), feedInterceptTouchLayout4.getPaddingRight(), feedInterceptTouchLayout4.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams39 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.g1), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            ((ViewGroup.MarginLayoutParams) layoutParams39).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            int i38 = Build.VERSION.SDK_INT;
            layoutParams39.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            int i39 = Build.VERSION.SDK_INT;
            layoutParams39.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            ((ViewGroup.MarginLayoutParams) layoutParams39).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(feedInterceptTouchLayout4);
        if (feedInterceptTouchLayout4.getParent() == null) {
            frameLayout10.addView(feedInterceptTouchLayout4, layoutParams39);
        }
        C0174a.m578a(frameLayout10);
        if (frameLayout10.getParent() == null) {
            linearLayout.addView(frameLayout10, layoutParams38);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.fcj);
        LinearLayout.LayoutParams layoutParams40 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            int i40 = Build.VERSION.SDK_INT;
            layoutParams40.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            int i41 = Build.VERSION.SDK_INT;
            layoutParams40.setMarginEnd((int) resources.getDimension(R.dimen.g6));
        }
        C0174a.m578a(frameLayout11);
        if (frameLayout11.getParent() == null) {
            linearLayout.addView(frameLayout11, layoutParams40);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.dbd);
        linearLayout5.setBackgroundResource(R.drawable.a06);
        linearLayout5.setOrientation(0);
        linearLayout5.setVisibility(8);
        LinearLayout.LayoutParams layoutParams41 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        linearLayout5.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            ((ViewGroup.MarginLayoutParams) layoutParams41).topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            int i42 = Build.VERSION.SDK_INT;
            layoutParams41.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            int i43 = Build.VERSION.SDK_INT;
            layoutParams41.setMarginEnd((int) resources.getDimension(R.dimen.g6));
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams41)) {
            i9 = 0;
            ((ConstraintLayout.C0547a) layoutParams41).f2281s = 0;
        } else {
            i9 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams41)) {
            ((ConstraintLayout.C0547a) layoutParams41).f2279q = i9;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams41)) {
            ((ConstraintLayout.C0547a) layoutParams41).f2271i = R.id.bai;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams42 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099683", C19386b.f45894a), tuxIconView2, layoutParams42);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams42)) {
            i10 = 17;
            layoutParams42.gravity = 17;
        } else {
            i10 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams42)) {
            ((FrameLayout.LayoutParams) layoutParams42).gravity = i10;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams42)) {
            ((DrawerLayout.C0844d) layoutParams42).f3113a = i10;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755449", "raw"), tuxIconView2, layoutParams42);
        C79466e.m138185a(tuxIconView2, layoutParams42);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout5.addView(tuxIconView2, layoutParams42);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setText(R.string.f28);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams43 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            int i44 = Build.VERSION.SDK_INT;
            layoutParams43.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams43)) {
            i11 = 16;
            layoutParams43.gravity = 16;
        } else {
            i11 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams43)) {
            ((FrameLayout.LayoutParams) layoutParams43).gravity = i11;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams43)) {
            ((DrawerLayout.C0844d) layoutParams43).f3113a = i11;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Semibold"), tuxTextView5, layoutParams43);
        C79467f.m138187a(tuxTextView5, layoutParams43);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout5.addView(tuxTextView5, layoutParams43);
        }
        C0174a.m578a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout.addView(linearLayout5, layoutParams41);
        }
        FrameLayout frameLayout12 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams44 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams44)) {
            ((RelativeLayout.LayoutParams) layoutParams44).addRule(2, R.id.cps);
        }
        FrameLayout frameLayout13 = new FrameLayout(context);
        frameLayout13.setId(R.id.apf);
        frameLayout13.setPadding(frameLayout13.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), frameLayout13.getPaddingRight(), frameLayout13.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams45 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            ((ViewGroup.MarginLayoutParams) layoutParams45).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            int i45 = Build.VERSION.SDK_INT;
            layoutParams45.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            ((ViewGroup.MarginLayoutParams) layoutParams45).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout13);
        if (frameLayout13.getParent() == null) {
            frameLayout12.addView(frameLayout13, layoutParams45);
        }
        C0174a.m578a(frameLayout12);
        if (frameLayout12.getParent() == null) {
            linearLayout.addView(frameLayout12, layoutParams44);
        }
        FrameLayout frameLayout14 = new FrameLayout(context);
        frameLayout14.setId(R.id.cps);
        ViewGroup.LayoutParams layoutParams46 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams46)) {
            ((RelativeLayout.LayoutParams) layoutParams46).addRule(12, -1);
        }
        ButtonAdBottomLabelView buttonAdBottomLabelView = new ButtonAdBottomLabelView(context);
        buttonAdBottomLabelView.setId(R.id.cpt);
        FrameLayout.LayoutParams layoutParams47 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            int i46 = Build.VERSION.SDK_INT;
            layoutParams47.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            ((ViewGroup.MarginLayoutParams) layoutParams47).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            ((ViewGroup.MarginLayoutParams) layoutParams47).bottomMargin = (int) resources.getDimension(R.dimen.g3);
        }
        C0174a.m578a(buttonAdBottomLabelView);
        if (buttonAdBottomLabelView.getParent() == null) {
            frameLayout14.addView(buttonAdBottomLabelView, layoutParams47);
        }
        C0174a.m578a(frameLayout14);
        if (frameLayout14.getParent() == null) {
            linearLayout.addView(frameLayout14, layoutParams46);
        }
        View frameLayout15 = new FrameLayout(context);
        frameLayout15.setId(R.id.ay1);
        LinearLayout.LayoutParams layoutParams48 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams48)) {
            int i47 = Build.VERSION.SDK_INT;
            layoutParams48.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        C0174a.m578a(frameLayout15);
        if (frameLayout15.getParent() == null) {
            linearLayout.addView(frameLayout15, layoutParams48);
        }
        View space2 = new Space(context);
        space2.setId(R.id.bpm);
        space2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams49 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(space2);
        if (space2.getParent() == null) {
            linearLayout.addView(space2, layoutParams49);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout6.addView(linearLayout, layoutParams15);
        }
        View frameLayout16 = new FrameLayout(context);
        frameLayout16.setId(R.id.d9r);
        frameLayout16.setVisibility(8);
        ViewGroup.LayoutParams layoutParams50 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()));
        C0174a.m578a(frameLayout16);
        if (frameLayout16.getParent() == null) {
            frameLayout6.addView(frameLayout16, layoutParams50);
        }
        C0174a.m578a(frameLayout6);
        if (frameLayout6.getParent() == null) {
            relativeLayout.addView(frameLayout6, layoutParams14);
        }
        View frameLayout17 = new FrameLayout(context);
        frameLayout17.setId(R.id.e5);
        frameLayout17.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams51 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.addRule(2, R.id.b3d);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams51)) {
            int i48 = Build.VERSION.SDK_INT;
            layoutParams51.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(frameLayout17);
        if (frameLayout17.getParent() == null) {
            relativeLayout.addView(frameLayout17, layoutParams51);
        }
        View feedInterceptTouchLayout5 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout5.setId(R.id.diq);
        RelativeLayout.LayoutParams layoutParams52 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.addRule(2, R.id.dke);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams52)) {
            ((ViewGroup.MarginLayoutParams) layoutParams52).bottomMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams52)) {
            int i49 = Build.VERSION.SDK_INT;
            layoutParams52.setMarginEnd((int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(feedInterceptTouchLayout5);
        if (feedInterceptTouchLayout5.getParent() == null) {
            relativeLayout.addView(feedInterceptTouchLayout5, layoutParams52);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.dke);
        linearLayout6.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams53 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.addRule(2, R.id.feb);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            i12 = -1;
            layoutParams53.addRule(21, -1);
        } else {
            i12 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.addRule(11, i12);
        }
        linearLayout6.setGravity(8388613);
        CircleWaveLayout circleWaveLayout = new CircleWaveLayout(context);
        circleWaveLayout.setId(R.id.f205082do);
        circleWaveLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams54 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams54)) {
            ((FrameLayout.LayoutParams) layoutParams54).gravity = 1;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams54)) {
            ((DrawerLayout.C0844d) layoutParams54).f3113a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams54)) {
            ((ViewGroup.MarginLayoutParams) layoutParams54).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(circleWaveLayout);
        if (circleWaveLayout.getParent() == null) {
            linearLayout6.addView(circleWaveLayout, layoutParams54);
        }
        FrameLayout frameLayout18 = new FrameLayout(context);
        frameLayout18.setId(R.id.oo);
        LinearLayout.LayoutParams layoutParams55 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams55)) {
            int i50 = Build.VERSION.SDK_INT;
            layoutParams55.setMarginEnd((int) TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(frameLayout18);
        if (frameLayout18.getParent() == null) {
            linearLayout6.addView(frameLayout18, layoutParams55);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout6 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout6.setId(R.id.alb);
        LinearLayout.LayoutParams layoutParams56 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams56)) {
            int i51 = Build.VERSION.SDK_INT;
            layoutParams56.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(feedInterceptTouchLayout6);
        if (feedInterceptTouchLayout6.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout6, layoutParams56);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout7 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout7.setId(R.id.a9t);
        LinearLayout.LayoutParams layoutParams57 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams57)) {
            int i52 = Build.VERSION.SDK_INT;
            layoutParams57.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(feedInterceptTouchLayout7);
        if (feedInterceptTouchLayout7.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout7, layoutParams57);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout8 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout8.setId(R.id.dxw);
        LinearLayout.LayoutParams layoutParams58 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams58)) {
            int i53 = Build.VERSION.SDK_INT;
            layoutParams58.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(feedInterceptTouchLayout8);
        if (feedInterceptTouchLayout8.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout8, layoutParams58);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout9 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout9.setId(R.id.cm0);
        LinearLayout.LayoutParams layoutParams59 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams59)) {
            int i54 = Build.VERSION.SDK_INT;
            layoutParams59.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(feedInterceptTouchLayout9);
        if (feedInterceptTouchLayout9.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout9, layoutParams59);
        }
        C0174a.m578a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            relativeLayout.addView(linearLayout6, layoutParams53);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bvl);
        appCompatImageView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams60 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.addRule(8, R.id.dke);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams60)) {
            int i55 = Build.VERSION.SDK_INT;
            i13 = 1;
            layoutParams60.setMarginEnd((int) TypedValue.applyDimension(1, -17.0f, resources.getDisplayMetrics()));
        } else {
            i13 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams60)) {
            ((ViewGroup.MarginLayoutParams) layoutParams60).bottomMargin = (int) TypedValue.applyDimension(i13, 15.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.addRule(16, R.id.dke);
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView, layoutParams60);
        }
        View frameLayout19 = new FrameLayout(context);
        frameLayout19.setId(R.id.b3d);
        RelativeLayout.LayoutParams layoutParams61 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams61)) {
            layoutParams61.addRule(12, -1);
        }
        C0174a.m578a(frameLayout19);
        if (frameLayout19.getParent() == null) {
            relativeLayout.addView(frameLayout19, layoutParams61);
        }
        C0174a.m578a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            widgetContainerMonitorView.addView(relativeLayout, a2);
        }
        FrameLayout frameLayout20 = new FrameLayout(context);
        frameLayout20.setId(R.id.dhe);
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(widgetContainerMonitorView, -1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a5)) {
            ((RelativeLayout.LayoutParams) a5).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            i14 = 1;
            a5.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        } else {
            i14 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.topMargin = (int) TypedValue.applyDimension(i14, 10.0f, resources.getDisplayMetrics());
        }
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setOrientation(i14);
        ViewGroup.LayoutParams layoutParams62 = new FrameLayout.LayoutParams(-1, -2);
        View frameLayout21 = new FrameLayout(context);
        frameLayout21.setId(R.id.e9y);
        frameLayout21.setVisibility(8);
        LinearLayout.LayoutParams layoutParams63 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams63)) {
            i15 = 80;
            layoutParams63.gravity = 80;
        } else {
            i15 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams63)) {
            ((FrameLayout.LayoutParams) layoutParams63).gravity = i15;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams63)) {
            ((DrawerLayout.C0844d) layoutParams63).f3113a = i15;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams63)) {
            ((ViewGroup.MarginLayoutParams) layoutParams63).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout21);
        if (frameLayout21.getParent() == null) {
            linearLayout7.addView(frameLayout21, layoutParams63);
        }
        View frameLayout22 = new FrameLayout(context);
        frameLayout22.setId(R.id.e_c);
        frameLayout22.setVisibility(8);
        LinearLayout.LayoutParams layoutParams64 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams64)) {
            i16 = 80;
            layoutParams64.gravity = 80;
        } else {
            i16 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams64)) {
            ((FrameLayout.LayoutParams) layoutParams64).gravity = i16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams64)) {
            ((DrawerLayout.C0844d) layoutParams64).f3113a = i16;
        }
        C0174a.m578a(frameLayout22);
        if (frameLayout22.getParent() == null) {
            linearLayout7.addView(frameLayout22, layoutParams64);
        }
        View a6 = C1862a.m6033a(context, R.layout.ro, linearLayout7, false, 0);
        a6.setId(R.id.ak2);
        a6.setVisibility(8);
        ViewGroup.LayoutParams layoutParams65 = new LinearLayout.LayoutParams(-1, -2);
        if (a6.getParent() == null) {
            linearLayout7.addView(a6, layoutParams65);
        }
        FrameLayout frameLayout23 = new FrameLayout(context);
        frameLayout23.setId(R.id.u2);
        ViewGroup.LayoutParams layoutParams66 = new LinearLayout.LayoutParams(-1, -2);
        View a7 = C1862a.m6033a(context, R.layout.te, frameLayout23, false, 0);
        a7.setId(R.id.b0z);
        a7.setVisibility(8);
        FrameLayout.LayoutParams layoutParams67 = new FrameLayout.LayoutParams(-1, -2);
        if (a7.getParent() == null) {
            frameLayout23.addView(a7, layoutParams67);
        }
        View a8 = C1862a.m6033a(context, R.layout.rp, frameLayout23, false, 0);
        a8.setId(R.id.e3);
        a8.setVisibility(8);
        FrameLayout.LayoutParams layoutParams68 = new FrameLayout.LayoutParams(-1, -2);
        if (a8.getParent() == null) {
            frameLayout23.addView(a8, layoutParams68);
        }
        View a9 = C1862a.m6033a(context, R.layout.sv, frameLayout23, false, 0);
        a9.setId(R.id.dxk);
        a9.setVisibility(8);
        FrameLayout.LayoutParams layoutParams69 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.fo));
        if (a9.getParent() == null) {
            frameLayout23.addView(a9, layoutParams69);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.b19);
        viewStub4.setVisibility(8);
        FrameLayout.LayoutParams layoutParams70 = new FrameLayout.LayoutParams(-1, -2);
        viewStub4.setInflatedId(-1);
        C0174a.m578a(viewStub4);
        if (viewStub4.getParent() == null) {
            frameLayout23.addView(viewStub4, layoutParams70);
        }
        View a10 = C1862a.m6033a(context, R.layout.tf, frameLayout23, false, 0);
        a10.setId(R.id.b12);
        a10.setVisibility(8);
        FrameLayout.LayoutParams layoutParams71 = new FrameLayout.LayoutParams(-1, -2);
        if (a10.getParent() == null) {
            frameLayout23.addView(a10, layoutParams71);
        }
        View a11 = C1862a.m6033a(context, R.layout.s9, frameLayout23, false, 0);
        a11.setId(R.id.bah);
        a11.setVisibility(8);
        FrameLayout.LayoutParams layoutParams72 = new FrameLayout.LayoutParams(-1, -2);
        if (a11.getParent() == null) {
            frameLayout23.addView(a11, layoutParams72);
        }
        View a12 = C1862a.m6033a(context, R.layout.tc, frameLayout23, false, 0);
        a12.setId(R.id.dh6);
        a12.setVisibility(8);
        FrameLayout.LayoutParams layoutParams73 = new FrameLayout.LayoutParams(-1, -2);
        if (a12.getParent() == null) {
            frameLayout23.addView(a12, layoutParams73);
        }
        C0174a.m578a(frameLayout23);
        if (frameLayout23.getParent() == null) {
            linearLayout7.addView(frameLayout23, layoutParams66);
        }
        View frameLayout24 = new FrameLayout(context);
        frameLayout24.setId(R.id.v0);
        ViewGroup.LayoutParams layoutParams74 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(frameLayout24);
        if (frameLayout24.getParent() == null) {
            linearLayout7.addView(frameLayout24, layoutParams74);
        }
        View view3 = new View(context);
        view3.setId(R.id.fce);
        view3.setBackgroundColor(resources.getColor(R.color.c9));
        view3.setVisibility(8);
        ViewGroup.LayoutParams layoutParams75 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(view3);
        if (view3.getParent() == null) {
            linearLayout7.addView(view3, layoutParams75);
        }
        C0174a.m578a(linearLayout7);
        if (linearLayout7.getParent() == null) {
            frameLayout20.addView(linearLayout7, layoutParams62);
        }
        C0174a.m578a(frameLayout20);
        if (frameLayout20.getParent() == null) {
            widgetContainerMonitorView.addView(frameLayout20, a5);
        }
        View frameLayout25 = new FrameLayout(context);
        frameLayout25.setId(R.id.e_l);
        ViewGroup.LayoutParams a13 = C0174a.m576a(widgetContainerMonitorView, -1, (int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(a13)) {
            ((RelativeLayout.LayoutParams) a13).addRule(2, R.id.dhe);
        }
        C0174a.m578a(frameLayout25);
        if (frameLayout25.getParent() == null) {
            widgetContainerMonitorView.addView(frameLayout25, a13);
        }
        View debugInfoView = new DebugInfoView(context);
        debugInfoView.setId(R.id.ahp);
        debugInfoView.setVisibility(8);
        ViewGroup.MarginLayoutParams a14 = C0174a.m576a(widgetContainerMonitorView, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a14)) {
            a14.bottomMargin = (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a14)) {
            int i56 = Build.VERSION.SDK_INT;
            a14.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a14)) {
            int i57 = Build.VERSION.SDK_INT;
            a14.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a14)) {
            a14.topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(debugInfoView);
        if (debugInfoView.getParent() == null) {
            widgetContainerMonitorView.addView(debugInfoView, a14);
        }
        RestrictTextView restrictTextView = new RestrictTextView(context);
        restrictTextView.setId(R.id.f2k);
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), resources.getColor(R.color.l));
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), 1.0f, restrictTextView.getShadowColor());
        restrictTextView.setShadowLayer(1.0f, restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), restrictTextView.getShadowColor());
        restrictTextView.setTextColor(resources.getColorStateList(R.color.np));
        restrictTextView.setTextSize(2, 16.0f);
        restrictTextView.setVisibility(8);
        ViewGroup.MarginLayoutParams a15 = C0174a.m576a(widgetContainerMonitorView, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a15)) {
            int i58 = Build.VERSION.SDK_INT;
            i17 = 1;
            a15.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        } else {
            i17 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a15)) {
            a15.topMargin = (int) TypedValue.applyDimension(i17, 100.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(restrictTextView);
        if (restrictTextView.getParent() == null) {
            widgetContainerMonitorView.addView(restrictTextView, a15);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.f8d);
        tuxTextView6.setText(R.string.h8k);
        tuxTextView6.setTextAlignment(4);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView6.setVisibility(8);
        ViewGroup.LayoutParams a16 = C0174a.m576a(widgetContainerMonitorView, -2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a16)) {
            ((RelativeLayout.LayoutParams) a16).addRule(13, -1);
        }
        tuxTextView6.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView6, a16);
        C79467f.m138187a(tuxTextView6, a16);
        C0174a.m578a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            widgetContainerMonitorView.addView(tuxTextView6, a16);
        }
        View frameLayout26 = new FrameLayout(context);
        frameLayout26.setId(R.id.e4);
        frameLayout26.setVisibility(8);
        ViewGroup.MarginLayoutParams a17 = C0174a.m576a(widgetContainerMonitorView, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a17)) {
            int i59 = Build.VERSION.SDK_INT;
            f2 = 12.0f;
            i18 = 1;
            a17.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 12.0f;
            i18 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a17)) {
            a17.bottomMargin = (int) TypedValue.applyDimension(i18, f2, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(a17)) {
            ((RelativeLayout.LayoutParams) a17).addRule(2, R.id.dhe);
        }
        C0174a.m578a(frameLayout26);
        if (frameLayout26.getParent() == null) {
            widgetContainerMonitorView.addView(frameLayout26, a17);
        }
        View adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        adHalfWebPageContainer.setId(R.id.eb);
        ViewGroup.MarginLayoutParams a18 = C0174a.m576a(widgetContainerMonitorView, (int) TypedValue.applyDimension(1, 255.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a18)) {
            ((LinearLayout.LayoutParams) a18).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a18)) {
            ((FrameLayout.LayoutParams) a18).gravity = 8388691;
        }
        if (DrawerLayout.C0844d.class.isInstance(a18)) {
            ((DrawerLayout.C0844d) a18).f3113a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a18)) {
            int i60 = Build.VERSION.SDK_INT;
            i19 = 1;
            a18.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        } else {
            i19 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a18)) {
            a18.bottomMargin = (int) TypedValue.applyDimension(i19, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(a18)) {
            ((RelativeLayout.LayoutParams) a18).addRule(2, R.id.dhe);
        }
        C0174a.m578a(adHalfWebPageContainer);
        if (adHalfWebPageContainer.getParent() == null) {
            widgetContainerMonitorView.addView(adHalfWebPageContainer, a18);
        }
        C0174a.m578a(widgetContainerMonitorView);
        if (widgetContainerMonitorView.getParent() == null) {
            frameLayout.addView(widgetContainerMonitorView, layoutParams10);
        }
        View adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        adHalfWebPageMaskLayer.setId(R.id.sv);
        adHalfWebPageMaskLayer.setVisibility(8);
        ViewGroup.LayoutParams layoutParams76 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(adHalfWebPageMaskLayer);
        if (adHalfWebPageMaskLayer.getParent() == null) {
            frameLayout.addView(adHalfWebPageMaskLayer, layoutParams76);
        }
        View frameLayout27 = new FrameLayout(context);
        frameLayout27.setId(R.id.ei);
        ViewGroup.LayoutParams layoutParams77 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout27);
        if (frameLayout27.getParent() == null) {
            frameLayout.addView(frameLayout27, layoutParams77);
        }
        MicroAppVideoCardView microAppVideoCardView = new MicroAppVideoCardView(context);
        microAppVideoCardView.setId(R.id.ck1);
        microAppVideoCardView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams78 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams78)) {
            ((LinearLayout.LayoutParams) layoutParams78).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams78)) {
            layoutParams78.gravity = 8388691;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams78)) {
            ((DrawerLayout.C0844d) layoutParams78).f3113a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams78)) {
            int i61 = Build.VERSION.SDK_INT;
            layoutParams78.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams78)) {
            ((ViewGroup.MarginLayoutParams) layoutParams78).bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(microAppVideoCardView);
        if (microAppVideoCardView.getParent() == null) {
            frameLayout.addView(microAppVideoCardView, layoutParams78);
        }
        View frameLayout28 = new FrameLayout(context);
        frameLayout28.setId(R.id.aaj);
        frameLayout28.setVisibility(8);
        FrameLayout.LayoutParams layoutParams79 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams79)) {
            ((LinearLayout.LayoutParams) layoutParams79).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams79)) {
            layoutParams79.gravity = 8388691;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams79)) {
            ((DrawerLayout.C0844d) layoutParams79).f3113a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams79)) {
            ((ViewGroup.MarginLayoutParams) layoutParams79).bottomMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout28);
        if (frameLayout28.getParent() == null) {
            frameLayout.addView(frameLayout28, layoutParams79);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.azz);
        ViewGroup.LayoutParams layoutParams80 = new FrameLayout.LayoutParams(-1, -1);
        viewStub5.setInflatedId(-1);
        C0174a.m578a(viewStub5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5, layoutParams80);
        }
        FrameLayout frameLayout29 = new FrameLayout(context);
        frameLayout29.setId(R.id.ea);
        ViewGroup.LayoutParams layoutParams81 = new FrameLayout.LayoutParams(-1, -1);
        View a19 = C1862a.m6033a(context, R.layout.sa, frameLayout29, false, 0);
        if (a19.getParent() == null) {
            frameLayout29.addView(a19);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.fg2);
        FrameLayout.LayoutParams layoutParams82 = new FrameLayout.LayoutParams(-1, -1);
        viewStub6.setInflatedId(-1);
        C0174a.m578a(viewStub6);
        if (viewStub6.getParent() == null) {
            frameLayout29.addView(viewStub6, layoutParams82);
        }
        C0174a.m578a(frameLayout29);
        if (frameLayout29.getParent() == null) {
            frameLayout.addView(frameLayout29, layoutParams81);
        }
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(R.id.enp);
        viewStub7.setLayoutResource(R.layout.tm);
        ViewGroup.LayoutParams layoutParams83 = new FrameLayout.LayoutParams(-1, -1);
        viewStub7.setInflatedId(-1);
        C0174a.m578a(viewStub7);
        if (viewStub7.getParent() == null) {
            frameLayout.addView(viewStub7, layoutParams83);
        }
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(R.id.aag);
        ViewGroup.LayoutParams layoutParams84 = new FrameLayout.LayoutParams(-1, -1);
        viewStub8.setInflatedId(-1);
        C0174a.m578a(viewStub8);
        if (viewStub8.getParent() == null) {
            frameLayout.addView(viewStub8, layoutParams84);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.aeo);
        appCompatImageView2.setImageResource(2131233142);
        FrameLayout.LayoutParams layoutParams85 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams85)) {
            ((LinearLayout.LayoutParams) layoutParams85).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams85)) {
            layoutParams85.gravity = 51;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams85)) {
            ((DrawerLayout.C0844d) layoutParams85).f3113a = 51;
        }
        C0174a.m578a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams85);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.aep);
        appCompatImageView3.setImageResource(2131233143);
        FrameLayout.LayoutParams layoutParams86 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams86)) {
            ((LinearLayout.LayoutParams) layoutParams86).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams86)) {
            layoutParams86.gravity = 53;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams86)) {
            ((DrawerLayout.C0844d) layoutParams86).f3113a = 53;
        }
        C0174a.m578a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout.addView(appCompatImageView3, layoutParams86);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.aek);
        appCompatImageView4.setImageResource(2131233144);
        FrameLayout.LayoutParams layoutParams87 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams87)) {
            ((LinearLayout.LayoutParams) layoutParams87).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams87)) {
            layoutParams87.gravity = 83;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams87)) {
            ((DrawerLayout.C0844d) layoutParams87).f3113a = 83;
        }
        C0174a.m578a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            frameLayout.addView(appCompatImageView4, layoutParams87);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context);
        appCompatImageView5.setId(R.id.ael);
        appCompatImageView5.setImageResource(2131233145);
        FrameLayout.LayoutParams layoutParams88 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams88)) {
            ((LinearLayout.LayoutParams) layoutParams88).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams88)) {
            layoutParams88.gravity = 85;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams88)) {
            ((DrawerLayout.C0844d) layoutParams88).f3113a = 85;
        }
        C0174a.m578a(appCompatImageView5);
        if (appCompatImageView5.getParent() == null) {
            frameLayout.addView(appCompatImageView5, layoutParams88);
        }
        ViewStub viewStub9 = new ViewStub(context);
        viewStub9.setId(R.id.b16);
        ViewGroup.LayoutParams layoutParams89 = new FrameLayout.LayoutParams(-1, -1);
        viewStub9.setInflatedId(-1);
        C0174a.m578a(viewStub9);
        if (viewStub9.getParent() == null) {
            frameLayout.addView(viewStub9, layoutParams89);
        }
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.f31);
        tuxTextView7.setText(R.string.fem);
        tuxTextView7.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView7.setAlpha(0.3f);
        tuxTextView7.setVisibility(8);
        FrameLayout.LayoutParams layoutParams90 = new FrameLayout.LayoutParams(-2, -2);
        tuxTextView7.setGravity(17);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams90)) {
            ((LinearLayout.LayoutParams) layoutParams90).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams90)) {
            layoutParams90.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams90)) {
            ((DrawerLayout.C0844d) layoutParams90).f3113a = 17;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H3_Semibold"), tuxTextView7, layoutParams90);
        C79467f.m138187a(tuxTextView7, layoutParams90);
        C0174a.m578a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            frameLayout.addView(tuxTextView7, layoutParams90);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(1246);
        return frameLayout;
    }
}
