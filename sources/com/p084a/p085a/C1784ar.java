package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.FollowFeedTagGroup;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ar */
public final class C1784ar implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1954);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        float f2;
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f3;
        int i23;
        int i24;
        int i25;
        int i26;
        MethodCollector.m26663i(2115);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        linearLayout.setGravity(80);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.cy1);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.bnw);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        linearLayout3.setGravity(16);
        AvatarImageView avatarImageView = new AvatarImageView(context);
        avatarImageView.setId(R.id.bw3);
        avatarImageView.setBackgroundResource(R.drawable.r3);
        avatarImageView.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        avatarImageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = 16;
            layoutParams3.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = i;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.C0844d) layoutParams3).f3113a = i;
        }
        C0174a.m578a(avatarImageView);
        if (avatarImageView.getParent() == null) {
            linearLayout3.addView(avatarImageView, layoutParams3);
        }
        AvatarImageView avatarImageView2 = new AvatarImageView(context);
        avatarImageView2.setId(R.id.bw4);
        avatarImageView2.setBackgroundResource(R.drawable.r3);
        avatarImageView2.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        avatarImageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i2 = 16;
            layoutParams4.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = i2;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.C0844d) layoutParams4).f3113a = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i27 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(avatarImageView2);
        if (avatarImageView2.getParent() == null) {
            linearLayout3.addView(avatarImageView2, layoutParams4);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.bw5);
        remoteImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        C1766a aVar = new C1766a();
        aVar.mo5576a("fresco:roundedCornerRadius", new C1863a.C1867d("2", "dp"), remoteImageView, layoutParams5);
        aVar.mo5575a(remoteImageView, layoutParams5);
        C0174a.m578a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout3.addView(remoteImageView, layoutParams5);
        }
        FollowFeedTagGroup followFeedTagGroup = new FollowFeedTagGroup(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i3 = 16;
            layoutParams6.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = i3;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.C0844d) layoutParams6).f3113a = i3;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.io);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        ViewGroup.MarginLayoutParams a2 = C0174a.m576a(followFeedTagGroup, -2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            i4 = 16;
            ((LinearLayout.LayoutParams) a2).gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = i4;
        }
        if (DrawerLayout.C0844d.class.isInstance(a2)) {
            ((DrawerLayout.C0844d) a2).f3113a = i4;
        }
        tuxTextView.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, a2);
        C79467f.m138187a(tuxTextView, a2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            followFeedTagGroup.addView(tuxTextView, a2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.amv);
        appCompatImageView.setBackgroundColor(resources.getColor(R.color.bz));
        ViewGroup.MarginLayoutParams a3 = C0174a.m576a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            i5 = 16;
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = i5;
        }
        if (DrawerLayout.C0844d.class.isInstance(a3)) {
            ((DrawerLayout.C0844d) a3).f3113a = i5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            int i28 = Build.VERSION.SDK_INT;
            i6 = 1;
            f = 4.0f;
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            i6 = 1;
            f = 4.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(i6, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int) TypedValue.applyDimension(i6, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            int i29 = Build.VERSION.SDK_INT;
            a3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView, a3);
        }
        View view = new View(context);
        view.setId(R.id.e03);
        view.setAlpha(0.34f);
        view.setBackgroundResource(R.drawable.zy);
        view.setVisibility(8);
        ViewGroup.MarginLayoutParams a4 = C0174a.m576a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            i7 = 16;
            ((LinearLayout.LayoutParams) a4).gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = i7;
        }
        if (DrawerLayout.C0844d.class.isInstance(a4)) {
            ((DrawerLayout.C0844d) a4).f3113a = i7;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            f2 = 4.0f;
            i8 = 1;
            a4.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            f2 = 4.0f;
            i8 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(i8, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            int i30 = Build.VERSION.SDK_INT;
            a4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            int i31 = Build.VERSION.SDK_INT;
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            followFeedTagGroup.addView(view, a4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.f8t);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(followFeedTagGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            i9 = 16;
            ((LinearLayout.LayoutParams) a5).gravity = 16;
        } else {
            i9 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = i9;
        }
        if (DrawerLayout.C0844d.class.isInstance(a5)) {
            ((DrawerLayout.C0844d) a5).f3113a = i9;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView2, a5);
        C79467f.m138187a(tuxTextView2, a5);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            followFeedTagGroup.addView(tuxTextView2, a5);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.e04);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a_));
        ViewGroup.MarginLayoutParams a6 = C0174a.m576a(followFeedTagGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            i10 = 16;
            ((LinearLayout.LayoutParams) a6).gravity = 16;
        } else {
            i10 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = i10;
        }
        if (DrawerLayout.C0844d.class.isInstance(a6)) {
            ((DrawerLayout.C0844d) a6).f3113a = i10;
        }
        tuxTextView3.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView3, a6);
        C79467f.m138187a(tuxTextView3, a6);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            followFeedTagGroup.addView(tuxTextView3, a6);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.bz5);
        appCompatImageView2.setImageResource(2131233162);
        appCompatImageView2.setVisibility(8);
        ViewGroup.MarginLayoutParams a7 = C0174a.m576a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a7)) {
            i11 = 16;
            ((LinearLayout.LayoutParams) a7).gravity = 16;
        } else {
            i11 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a7)) {
            ((FrameLayout.LayoutParams) a7).gravity = i11;
        }
        if (DrawerLayout.C0844d.class.isInstance(a7)) {
            ((DrawerLayout.C0844d) a7).f3113a = i11;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
            int i32 = Build.VERSION.SDK_INT;
            a7.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
            a7.leftMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView2, a7);
        }
        View view2 = new View(context);
        view2.setId(R.id.d2d);
        view2.setBackgroundColor(resources.getColor(R.color.c9));
        ViewGroup.MarginLayoutParams a8 = C0174a.m576a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), -1);
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            followFeedTagGroup.addView(view2, a8);
        }
        C0174a.m578a(followFeedTagGroup);
        if (followFeedTagGroup.getParent() == null) {
            linearLayout3.addView(followFeedTagGroup, layoutParams6);
        }
        C0174a.m578a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams2);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.a5j);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i33 = Build.VERSION.SDK_INT;
            i12 = 17;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            i12 = 17;
        }
        tuxTextView4.setGravity(i12);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView4, layoutParams7);
        C79467f.m138187a(tuxTextView4, layoutParams7);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout2.addView(tuxTextView4, layoutParams7);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.iv);
        linearLayout4.setOrientation(0);
        linearLayout4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i34 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout4.setGravity(16);
        FollowFeedTagGroup followFeedTagGroup2 = new FollowFeedTagGroup(context);
        followFeedTagGroup2.setId(R.id.elf);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.C0844d) layoutParams9).f3113a = 16;
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.a5i);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView5.setMaxLines(1);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.aa));
        ViewGroup.MarginLayoutParams a9 = C0174a.m576a(followFeedTagGroup2, -2, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a9)) {
            int i35 = Build.VERSION.SDK_INT;
            i13 = 1;
            a9.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        } else {
            i13 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a9)) {
            a9.rightMargin = (int) TypedValue.applyDimension(i13, 7.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView5, a9);
        C79467f.m138187a(tuxTextView5, a9);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            followFeedTagGroup2.addView(tuxTextView5, a9);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.amc);
        appCompatImageView3.setBackgroundColor(resources.getColor(R.color.ad));
        ViewGroup.MarginLayoutParams a10 = C0174a.m576a(followFeedTagGroup2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a10)) {
            i14 = 16;
            ((LinearLayout.LayoutParams) a10).gravity = 16;
        } else {
            i14 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a10)) {
            ((FrameLayout.LayoutParams) a10).gravity = i14;
        }
        if (DrawerLayout.C0844d.class.isInstance(a10)) {
            ((DrawerLayout.C0844d) a10).f3113a = i14;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a10)) {
            int i36 = Build.VERSION.SDK_INT;
            i15 = 1;
            a10.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        } else {
            i15 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a10)) {
            a10.rightMargin = (int) TypedValue.applyDimension(i15, 7.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            followFeedTagGroup2.addView(appCompatImageView3, a10);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.bqt);
        tuxTextView6.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView6.setMaxLines(1);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.aa));
        ViewGroup.MarginLayoutParams a11 = C0174a.m576a(followFeedTagGroup2, -2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a11)) {
            int i37 = Build.VERSION.SDK_INT;
            i16 = 1;
            a11.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i16 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a11)) {
            a11.rightMargin = (int) TypedValue.applyDimension(i16, 5.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView6, a11);
        C79467f.m138187a(tuxTextView6, a11);
        C0174a.m578a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            followFeedTagGroup2.addView(tuxTextView6, a11);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.afk);
        linearLayout5.setOrientation(0);
        ViewGroup.MarginLayoutParams a12 = C0174a.m576a(followFeedTagGroup2, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
            int i38 = Build.VERSION.SDK_INT;
            i17 = 1;
            a12.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i17 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
            a12.rightMargin = (int) TypedValue.applyDimension(i17, 5.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            followFeedTagGroup2.addView(linearLayout5, a12);
        }
        C0174a.m578a(followFeedTagGroup2);
        if (followFeedTagGroup2.getParent() == null) {
            linearLayout4.addView(followFeedTagGroup2, layoutParams9);
        }
        C0174a.m578a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout2.addView(linearLayout4, layoutParams8);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.aan);
        linearLayout6.setOrientation(0);
        linearLayout6.setVisibility(8);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i18 = 16;
            layoutParams10.gravity = 16;
        } else {
            i18 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i18;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.C0844d) layoutParams10).f3113a = i18;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            i19 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        } else {
            i19 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).leftMargin = (int) TypedValue.applyDimension(i19, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            int i39 = Build.VERSION.SDK_INT;
            i20 = 1;
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            i20 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(i20, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setGravity(16);
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.dta);
        tuxTextView7.setTextColor(resources.getColorStateList(R.color.aa));
        tuxTextView7.setVisibility(8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i21 = 16;
            layoutParams11.gravity = 16;
        } else {
            i21 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((FrameLayout.LayoutParams) layoutParams11).gravity = i21;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.C0844d) layoutParams11).f3113a = i21;
        }
        tuxTextView7.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView7, layoutParams11);
        C79467f.m138187a(tuxTextView7, layoutParams11);
        C0174a.m578a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            linearLayout6.addView(tuxTextView7, layoutParams11);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.dt3);
        appCompatImageView4.setBackgroundColor(resources.getColor(R.color.ad));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i22 = 16;
            layoutParams12.gravity = 16;
        } else {
            i22 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i22;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams12)) {
            ((DrawerLayout.C0844d) layoutParams12).f3113a = i22;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            f3 = 7.0f;
            i23 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams12).leftMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        } else {
            f3 = 7.0f;
            i23 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).rightMargin = (int) TypedValue.applyDimension(i23, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i40 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i41 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        C0174a.m578a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            linearLayout6.addView(appCompatImageView4, layoutParams12);
        }
        TuxTextView tuxTextView8 = new TuxTextView(context);
        tuxTextView8.setId(R.id.dtb);
        tuxTextView8.setMaxLines(1);
        tuxTextView8.setTextColor(resources.getColorStateList(R.color.aa));
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i24 = 16;
            layoutParams13.gravity = 16;
        } else {
            i24 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i24;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams13)) {
            ((DrawerLayout.C0844d) layoutParams13).f3113a = i24;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.weight = 1.0f;
        }
        tuxTextView8.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView8, layoutParams13);
        C79467f.m138187a(tuxTextView8, layoutParams13);
        C0174a.m578a(tuxTextView8);
        if (tuxTextView8.getParent() == null) {
            linearLayout6.addView(tuxTextView8, layoutParams13);
        }
        C0174a.m578a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout2.addView(linearLayout6, layoutParams10);
        }
        TuxTextView tuxTextView9 = new TuxTextView(context);
        tuxTextView9.setId(R.id.ew3);
        tuxTextView9.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView9.setMaxLines(1);
        tuxTextView9.setMaxWidth((int) TypedValue.applyDimension(1, 215.0f, resources.getDisplayMetrics()));
        tuxTextView9.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingTop(), tuxTextView9.getPaddingRight(), tuxTextView9.getPaddingBottom());
        tuxTextView9.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingTop(), tuxTextView9.getPaddingRight(), tuxTextView9.getPaddingBottom());
        tuxTextView9.setPadding(tuxTextView9.getPaddingLeft(), tuxTextView9.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingBottom());
        tuxTextView9.setPadding(tuxTextView9.getPaddingLeft(), tuxTextView9.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingBottom());
        tuxTextView9.setTextColor(resources.getColorStateList(R.color.a));
        tuxTextView9.setVisibility(8);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            i25 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            i25 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin = (int) TypedValue.applyDimension(i25, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            int i42 = Build.VERSION.SDK_INT;
            i26 = 1;
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            i26 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = (int) TypedValue.applyDimension(i26, -4.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView9, layoutParams14);
        C79467f.m138187a(tuxTextView9, layoutParams14);
        C0174a.m578a(tuxTextView9);
        if (tuxTextView9.getParent() == null) {
            linearLayout2.addView(tuxTextView9, layoutParams14);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(2115);
        return linearLayout;
    }
}
