package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.h */
public final class C1843h implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2013);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(3238);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(resources.getColor(R.color.l));
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.e1n);
        frameLayout.setBackgroundColor(resources.getColor(R.color.k));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 375.0f, resources.getDisplayMetrics()));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.yw);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.C0844d) layoutParams2).f3113a = 17;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams2);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        View view = new View(context);
        view.setBackgroundColor(resources.getColor(R.color.k));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams3);
        }
        View view2 = new View(context);
        view2.setBackgroundColor(resources.getColor(R.color.k));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams4);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view3 = new View(context);
        view3.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view3);
        if (view3.getParent() == null) {
            frameLayout2.addView(view3, layoutParams6);
        }
        View view4 = new View(context);
        view4.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 42.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.C0844d) layoutParams7).f3113a = 8388613;
        }
        C0174a.m578a(view4);
        if (view4.getParent() == null) {
            frameLayout2.addView(view4, layoutParams7);
        }
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams5);
        }
        View view5 = new View(context);
        view5.setBackgroundColor(resources.getColor(R.color.k));
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.C0844d) layoutParams8).f3113a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        C0174a.m578a(view5);
        if (view5.getParent() == null) {
            linearLayout.addView(view5, layoutParams8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams9.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams9.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view6 = new View(context);
        view6.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view6);
        if (view6.getParent() == null) {
            frameLayout3.addView(view6, layoutParams10);
        }
        View view7 = new View(context);
        view7.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 105.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.C0844d) layoutParams11).f3113a = 8388613;
        }
        C0174a.m578a(view7);
        if (view7.getParent() == null) {
            frameLayout3.addView(view7, layoutParams11);
        }
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams9);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view8 = new View(context);
        view8.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view8);
        if (view8.getParent() == null) {
            frameLayout4.addView(view8, layoutParams13);
        }
        View view9 = new View(context);
        view9.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((LinearLayout.LayoutParams) layoutParams14).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams14)) {
            ((DrawerLayout.C0844d) layoutParams14).f3113a = 8388613;
        }
        C0174a.m578a(view9);
        if (view9.getParent() == null) {
            frameLayout4.addView(view9, layoutParams14);
        }
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout.addView(frameLayout4, layoutParams12);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams15.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).topMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i10 = Build.VERSION.SDK_INT;
            layoutParams15.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view10 = new View(context);
        view10.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view10);
        if (view10.getParent() == null) {
            frameLayout5.addView(view10, layoutParams16);
        }
        View view11 = new View(context);
        view11.setBackgroundColor(resources.getColor(R.color.k));
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 132.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams17)) {
            ((DrawerLayout.C0844d) layoutParams17).f3113a = 8388613;
        }
        C0174a.m578a(view11);
        if (view11.getParent() == null) {
            frameLayout5.addView(view11, layoutParams17);
        }
        C0174a.m578a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            linearLayout.addView(frameLayout5, layoutParams15);
        }
        View view12 = new View(context);
        view12.setBackgroundColor(resources.getColor(R.color.k));
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams18)) {
            ((DrawerLayout.C0844d) layoutParams18).f3113a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        C0174a.m578a(view12);
        if (view12.getParent() == null) {
            linearLayout.addView(view12, layoutParams18);
        }
        View view13 = new View(context);
        view13.setBackgroundColor(resources.getColor(R.color.k));
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 142.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).topMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        C0174a.m578a(view13);
        if (view13.getParent() == null) {
            linearLayout.addView(view13, layoutParams19);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(3238);
        return linearLayout;
    }
}
