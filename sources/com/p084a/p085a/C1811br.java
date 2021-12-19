package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchScanView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.br */
public final class C1811br implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1981);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        MethodCollector.m26663i(2743);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.cgi);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a)) {
            ((RelativeLayout.LayoutParams) a).addRule(15, -1);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setBackgroundColor(resources.getColor(R.color.l));
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        View view = new View(context);
        view.setId(R.id.b9r);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.em2);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a0s));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.c81);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        autoRTLImageView.setId(R.id.pj);
        autoRTLImageView.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        autoRTLImageView.setImageResource(R.drawable.ccw);
        autoRTLImageView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.C0844d) layoutParams5).f3113a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(autoRTLImageView);
        if (autoRTLImageView.getParent() == null) {
            frameLayout.addView(autoRTLImageView, layoutParams5);
        }
        SearchScanView searchScanView = new SearchScanView(context);
        searchScanView.setId(R.id.dsg);
        searchScanView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(searchScanView);
        if (searchScanView.getParent() == null) {
            frameLayout.addView(searchScanView, layoutParams6);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.gs);
        tuxIconView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.C0844d) layoutParams7).f3113a = 17;
        }
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("24", "dp"), tuxIconView, layoutParams7);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("24", "dp"), tuxIconView, layoutParams7);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755432", "raw"), tuxIconView, layoutParams7);
        C79466e.m138185a(tuxIconView, layoutParams7);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams7);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout3.addView(frameLayout, layoutParams4);
        }
        View a2 = C1862a.m6033a(context, R.layout.aw8, linearLayout3, false, 0);
        a2.setId(R.id.dl4);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i = -1;
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(20, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(9, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(15, i);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i2 = 16;
            layoutParams8.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i2;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.C0844d) layoutParams8).f3113a = i2;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.weight = 1.0f;
        }
        if (a2.getParent() == null) {
            linearLayout3.addView(a2, layoutParams8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.dk8);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -1);
        com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView autoRTLImageView2 = new com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView(context);
        autoRTLImageView2.setId(R.id.pl);
        autoRTLImageView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingTop(), autoRTLImageView2.getPaddingRight(), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingTop(), autoRTLImageView2.getPaddingRight(), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setPadding(autoRTLImageView2.getPaddingLeft(), autoRTLImageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setPadding(autoRTLImageView2.getPaddingLeft(), autoRTLImageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        autoRTLImageView2.setVisibility(8);
        autoRTLImageView2.setImageResource(R.drawable.a5o);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((RelativeLayout.LayoutParams) layoutParams10).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((RelativeLayout.LayoutParams) layoutParams10).addRule(11, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i3;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.C0844d) layoutParams10).f3113a = i3;
        }
        C0174a.m578a(autoRTLImageView2);
        if (autoRTLImageView2.getParent() == null) {
            frameLayout2.addView(autoRTLImageView2, layoutParams10);
        }
        SearchScanView searchScanView2 = new SearchScanView(context);
        searchScanView2.setId(R.id.dsh);
        searchScanView2.setVisibility(0);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((RelativeLayout.LayoutParams) layoutParams11).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            int i7 = Build.VERSION.SDK_INT;
            f = 2.0f;
            layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            f = 2.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        C0174a.m578a(searchScanView2);
        if (searchScanView2.getParent() == null) {
            frameLayout2.addView(searchScanView2, layoutParams11);
        }
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout3.addView(frameLayout2, layoutParams9);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f39);
        if (TextView.class.isInstance(tuxTextView)) {
            C0174a.m579a(tuxTextView, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView.setMinimumWidth((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setText(R.string.fey);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bh));
        tuxTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i4 = 16;
            layoutParams12.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i4;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams12)) {
            ((DrawerLayout.C0844d) layoutParams12).f3113a = i4;
        }
        tuxTextView.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView, layoutParams12);
        C79467f.m138187a(tuxTextView, layoutParams12);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout3.addView(tuxTextView, layoutParams12);
        }
        C0174a.m578a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams3);
        }
        View view2 = new View(context);
        view2.setId(R.id.c9f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.an});
        view2.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams13);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(resources.getColor(R.color.l));
        ViewGroup.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.b82);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -1);
        View a3 = C1862a.m6033a(context, R.layout.xy, frameLayout4, false, 0);
        if (a3.getParent() == null) {
            frameLayout4.addView(a3);
        }
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4, layoutParams15);
        }
        SearchIntermediateView searchIntermediateView = new SearchIntermediateView(context);
        searchIntermediateView.setId(R.id.drz);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(searchIntermediateView);
        if (searchIntermediateView.getParent() == null) {
            frameLayout3.addView(searchIntermediateView, layoutParams16);
        }
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams14);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(2743);
        return linearLayout;
    }
}
