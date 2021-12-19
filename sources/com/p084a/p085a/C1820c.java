package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.ClipLinearLayout;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentAtSearchLayout;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentAtSearchLoadingView;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.c */
public final class C1820c implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1990);
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
        int i7;
        float f;
        int i8;
        MethodCollector.m26663i(960);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.c3o);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        View view = new View(context);
        view.setId(R.id.px);
        view.setAlpha(0.0f);
        view.setBackgroundColor(resources.getColor(R.color.g9));
        view.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        View view2 = new View(context);
        view2.setId(R.id.cy2);
        view2.setAlpha(0.0f);
        view2.setBackgroundColor(resources.getColor(R.color.bk));
        view2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams2);
        }
        MeasureLinearLayout measureLinearLayout = new MeasureLinearLayout(context);
        measureLinearLayout.setId(R.id.cy4);
        measureLinearLayout.setFitsSystemWindows(true);
        measureLinearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        View view3 = new View(context);
        view3.setId(R.id.cy3);
        ViewGroup.LayoutParams a2 = C0174a.m576a(measureLinearLayout, -1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).weight = 1.0f;
        }
        C0174a.m578a(view3);
        if (view3.getParent() == null) {
            measureLinearLayout.addView(view3, a2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams a3 = C0174a.m576a(measureLinearLayout, -1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a3)) {
            ((DrawerLayout.C0844d) a3).f3113a = 80;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.c4g);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.c4b);
        frameLayout3.setBackgroundColor(resources.getColor(R.color.bj));
        frameLayout3.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout3.getPaddingTop(), frameLayout3.getPaddingRight(), frameLayout3.getPaddingBottom());
        frameLayout3.setPadding(frameLayout3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout3.getPaddingRight(), frameLayout3.getPaddingBottom());
        frameLayout3.setPadding(frameLayout3.getPaddingLeft(), frameLayout3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout3.getPaddingBottom());
        frameLayout3.setPadding(frameLayout3.getPaddingLeft(), frameLayout3.getPaddingTop(), frameLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        frameLayout3.setVisibility(8);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.egc);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.C0844d) layoutParams6).f3113a = 17;
        }
        tuxTextView.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Regular"), tuxTextView, layoutParams6);
        C79467f.m138187a(tuxTextView, layoutParams6);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout3.addView(tuxTextView, layoutParams6);
        }
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams5);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.acf);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = 80;
            layoutParams7.gravity = 80;
        } else {
            i = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = i;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.C0844d) layoutParams7).f3113a = i;
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.cf3);
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 85.0f, resources.getDisplayMetrics()));
        linearLayout3.setAlpha(0.0f);
        linearLayout3.setOrientation(1);
        linearLayout3.setVisibility(8);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i2 = 80;
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 80;
        } else {
            i2 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = i2;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.C0844d) layoutParams9).f3113a = i2;
        }
        linearLayout3.setGravity(1);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.f7e);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i3 = 1;
            layoutParams10.gravity = 1;
        } else {
            i3 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i3;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.C0844d) layoutParams10).f3113a = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin = (int) TypedValue.applyDimension(i3, 16.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView2, layoutParams10);
        C79467f.m138187a(tuxTextView2, layoutParams10);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout3.addView(tuxTextView2, layoutParams10);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.b68);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        C0174a.m578a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4, layoutParams11);
        }
        C0174a.m578a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout4.addView(linearLayout3, layoutParams9);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.eqm);
        tuxTextView3.setText(R.string.h5p);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ab});
        tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        tuxTextView3.setVisibility(8);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i4 = 1;
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 1;
        } else {
            i4 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = i4;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams12)) {
            ((DrawerLayout.C0844d) layoutParams12).f3113a = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i10 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        tuxTextView3.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Regular"), tuxTextView3, layoutParams12);
        C79467f.m138187a(tuxTextView3, layoutParams12);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            frameLayout4.addView(tuxTextView3, layoutParams12);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.dut);
        linearLayout5.setBackgroundResource(R.drawable.l8);
        linearLayout5.setOrientation(0);
        linearLayout5.setVisibility(8);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i5 = 80;
            ((LinearLayout.LayoutParams) layoutParams13).gravity = 80;
        } else {
            i5 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.gravity = i5;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams13)) {
            ((DrawerLayout.C0844d) layoutParams13).f3113a = i5;
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.dhp);
        appCompatImageView.setBackgroundResource(2131231222);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            int i11 = Build.VERSION.SDK_INT;
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout5.addView(appCompatImageView, layoutParams14);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.duu);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i12 = Build.VERSION.SDK_INT;
            layoutParams15.setMarginStart((int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(smartImageView);
        if (smartImageView.getParent() == null) {
            linearLayout5.addView(smartImageView, layoutParams15);
        }
        C0174a.m578a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            frameLayout4.addView(linearLayout5, layoutParams13);
        }
        CommentAtSearchLayout commentAtSearchLayout = new CommentAtSearchLayout(context);
        commentAtSearchLayout.setId(R.id.a0n);
        commentAtSearchLayout.setBackgroundResource(R.drawable.l8);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams16)) {
            i6 = 80;
            ((LinearLayout.LayoutParams) layoutParams16).gravity = 80;
        } else {
            i6 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.gravity = i6;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams16)) {
            ((DrawerLayout.C0844d) layoutParams16).f3113a = i6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).bottomMargin = (int) TypedValue.applyDimension(1, -220.0f, resources.getDisplayMetrics());
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.evu);
        tuxTextView4.setText(R.string.cxg);
        tuxTextView4.setVisibility(8);
        ViewGroup.MarginLayoutParams a4 = C0174a.m576a(commentAtSearchLayout, -1, -1);
        tuxTextView4.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Regular"), tuxTextView4, a4);
        C79467f.m138187a(tuxTextView4, a4);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            commentAtSearchLayout.addView(tuxTextView4, a4);
        }
        CommentAtSearchLoadingView commentAtSearchLoadingView = new CommentAtSearchLoadingView(context);
        commentAtSearchLoadingView.setId(R.id.cg3);
        commentAtSearchLoadingView.setVisibility(8);
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(commentAtSearchLayout, -1, -1);
        C0174a.m578a(commentAtSearchLoadingView);
        if (commentAtSearchLoadingView.getParent() == null) {
            commentAtSearchLayout.addView(commentAtSearchLoadingView, a5);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.doi);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        ViewGroup.MarginLayoutParams a6 = C0174a.m576a(commentAtSearchLayout, -1, -1);
        C0174a.m578a(recyclerView);
        if (recyclerView.getParent() == null) {
            commentAtSearchLayout.addView(recyclerView, a6);
        }
        C0174a.m578a(commentAtSearchLayout);
        if (commentAtSearchLayout.getParent() == null) {
            frameLayout4.addView(commentAtSearchLayout, layoutParams16);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.cf4);
        linearLayout6.setBackgroundResource(R.drawable.l8);
        linearLayout6.setClickable(true);
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), linearLayout6.getPaddingBottom());
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingRight(), linearLayout6.getPaddingBottom());
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingBottom());
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        linearLayout6.setVisibility(8);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i7 = 80;
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 80;
        } else {
            i7 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = i7;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams17)) {
            ((DrawerLayout.C0844d) layoutParams17).f3113a = i7;
        }
        linearLayout6.setGravity(16);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(R.drawable.m_);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).rightMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        C0174a.m578a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            linearLayout6.addView(appCompatImageView2, layoutParams18);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.f7f);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        tuxTextView5.setSingleLine(true);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.c5));
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView5, layoutParams19);
        C79467f.m138187a(tuxTextView5, layoutParams19);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout6.addView(tuxTextView5, layoutParams19);
        }
        C0174a.m578a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            frameLayout4.addView(linearLayout6, layoutParams17);
        }
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout2.addView(frameLayout4, layoutParams8);
        }
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setBackgroundColor(resources.getColor(R.color.p));
        linearLayout7.setOrientation(1);
        ViewGroup.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
        View view4 = new View(context);
        view4.setId(R.id.edz);
        view4.setBackgroundColor(resources.getColor(R.color.b4));
        ViewGroup.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        C0174a.m578a(view4);
        if (view4.getParent() == null) {
            linearLayout7.addView(view4, layoutParams21);
        }
        View a7 = C1862a.m6033a(context, R.layout.i4, linearLayout7, false, 0);
        a7.setId(R.id.a99);
        ViewGroup.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, -2);
        if (a7.getParent() == null) {
            linearLayout7.addView(a7, layoutParams22);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.c49);
        frameLayout5.setVisibility(8);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            int i13 = Build.VERSION.SDK_INT;
            f = 16.0f;
            layoutParams23.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            ((ViewGroup.MarginLayoutParams) layoutParams23).leftMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.b_i);
        FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
        C1766a aVar = new C1766a();
        aVar.mo5576a("app:actualImageScaleType", new C1863a.C1866c("centerCrop"), remoteImageView, layoutParams24);
        aVar.mo5576a("app:fadeDuration", new C1863a.C1866c("300"), remoteImageView, layoutParams24);
        aVar.mo5576a("app:roundWithOverlayColor", new C1863a.C1865b("2131099683", C19386b.f45894a), remoteImageView, layoutParams24);
        aVar.mo5576a("app:roundedCornerRadius", new C1863a.C1867d("2", "dp"), remoteImageView, layoutParams24);
        aVar.mo5576a("app:roundingBorderColor", new C1863a.C1865b("2131099715", C19386b.f45894a), remoteImageView, layoutParams24);
        aVar.mo5576a("app:roundingBorderWidth", new C1863a.C1867d("0.5", "dp"), remoteImageView, layoutParams24);
        aVar.mo5575a(remoteImageView, layoutParams24);
        C0174a.m578a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            frameLayout5.addView(remoteImageView, layoutParams24);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.b_j);
        appCompatImageView3.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), appCompatImageView3.getPaddingTop(), appCompatImageView3.getPaddingRight(), appCompatImageView3.getPaddingBottom());
        appCompatImageView3.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), appCompatImageView3.getPaddingTop(), appCompatImageView3.getPaddingRight(), appCompatImageView3.getPaddingBottom());
        appCompatImageView3.setPadding(appCompatImageView3.getPaddingLeft(), appCompatImageView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), appCompatImageView3.getPaddingBottom());
        appCompatImageView3.setPadding(appCompatImageView3.getPaddingLeft(), appCompatImageView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), appCompatImageView3.getPaddingBottom());
        appCompatImageView3.setPadding(appCompatImageView3.getPaddingLeft(), appCompatImageView3.getPaddingTop(), appCompatImageView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setImageResource(2131231209);
        appCompatImageView3.setVisibility(8);
        FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((LinearLayout.LayoutParams) layoutParams25).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams25)) {
            ((DrawerLayout.C0844d) layoutParams25).f3113a = 8388613;
        }
        C0174a.m578a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout5.addView(appCompatImageView3, layoutParams25);
        }
        C0174a.m578a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            linearLayout7.addView(frameLayout5, layoutParams23);
        }
        C1862a.m6033a(context, R.layout.id, linearLayout7, true, 0);
        LinearLayout linearLayout8 = new LinearLayout(context);
        linearLayout8.setId(R.id.cyt);
        linearLayout8.setOrientation(1);
        linearLayout8.setVisibility(8);
        ViewGroup.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(linearLayout8);
        if (linearLayout8.getParent() == null) {
            linearLayout7.addView(linearLayout8, layoutParams26);
        }
        LinearLayout linearLayout9 = new LinearLayout(context);
        linearLayout9.setId(R.id.bad);
        linearLayout9.setOrientation(1);
        linearLayout9.setVisibility(8);
        ViewGroup.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(linearLayout9);
        if (linearLayout9.getParent() == null) {
            linearLayout7.addView(linearLayout9, layoutParams27);
        }
        ClipLinearLayout clipLinearLayout = new ClipLinearLayout(context);
        clipLinearLayout.setId(R.id.cyu);
        clipLinearLayout.setOrientation(1);
        clipLinearLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        C0174a.m578a(clipLinearLayout);
        if (clipLinearLayout.getParent() == null) {
            linearLayout7.addView(clipLinearLayout, layoutParams28);
        }
        C0174a.m578a(linearLayout7);
        if (linearLayout7.getParent() == null) {
            linearLayout2.addView(linearLayout7, layoutParams20);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams7);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout2.addView(linearLayout, layoutParams4);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.c64);
        frameLayout6.setVisibility(4);
        FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams29)) {
            i8 = 80;
            ((LinearLayout.LayoutParams) layoutParams29).gravity = 80;
        } else {
            i8 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.gravity = i8;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams29)) {
            ((DrawerLayout.C0844d) layoutParams29).f3113a = i8;
        }
        C0174a.m578a(frameLayout6);
        if (frameLayout6.getParent() == null) {
            frameLayout2.addView(frameLayout6, layoutParams29);
        }
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            measureLinearLayout.addView(frameLayout2, a3);
        }
        C0174a.m578a(measureLinearLayout);
        if (measureLinearLayout.getParent() == null) {
            frameLayout.addView(measureLinearLayout, layoutParams3);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.b_k);
        appCompatImageView4.setVisibility(8);
        ViewGroup.LayoutParams layoutParams30 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        C0174a.m578a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            frameLayout.addView(appCompatImageView4, layoutParams30);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(960);
        return frameLayout;
    }
}
