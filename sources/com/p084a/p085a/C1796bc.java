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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.VideoTitleFollowBtn;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bc */
public final class C1796bc implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1966);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        MethodCollector.m26663i(2007);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.dlw);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, R.id.xm);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(0, R.id.xm);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.ces);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.title);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (Build.VERSION.SDK_INT >= 21) {
            tuxTextView.setLetterSpacing(-0.01f);
        }
        tuxTextView.setMaxLines(1);
        if (TextView.class.isInstance(tuxTextView)) {
            C0174a.m580b(tuxTextView, (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView.setMinimumHeight((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.iu));
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 1.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(1.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1.0f;
        }
        tuxTextView.setGravity(16);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView, layoutParams4);
        C79467f.m138187a(tuxTextView, layoutParams4);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout3.addView(tuxTextView, layoutParams4);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.e3z);
        linearLayout4.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout4.getPaddingBottom());
        linearLayout4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        linearLayout4.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.C0844d) layoutParams5).f3113a = 16;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            f = 6.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            f = 6.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755431", "raw"), tuxIconView, layoutParams6);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView, layoutParams6);
        C79466e.m138185a(tuxIconView, layoutParams6);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout4.addView(tuxIconView, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.e3y);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.weight = 1.0f;
        }
        C79467f.m138188a("android:breakStrategy", new C1863a.C1866c("simple"), tuxTextView2, layoutParams7);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Semibold"), tuxTextView2, layoutParams7);
        C79467f.m138187a(tuxTextView2, layoutParams7);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout4.addView(tuxTextView2, layoutParams7);
        }
        MutualRelationView mutualRelationView = new MutualRelationView(context);
        mutualRelationView.setId(R.id.e3x);
        mutualRelationView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(mutualRelationView);
        if (mutualRelationView.getParent() == null) {
            linearLayout4.addView(mutualRelationView, layoutParams8);
        }
        C0174a.m578a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4, layoutParams5);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.f1e);
        tuxTextView3.setShadowLayer(tuxTextView3.getShadowRadius(), tuxTextView3.getShadowDx(), tuxTextView3.getShadowDy(), resources.getColor(R.color.iu));
        tuxTextView3.setShadowLayer(tuxTextView3.getShadowRadius(), tuxTextView3.getShadowDx(), 2.0f, tuxTextView3.getShadowColor());
        tuxTextView3.setShadowLayer(2.0f, tuxTextView3.getShadowDx(), tuxTextView3.getShadowDy(), tuxTextView3.getShadowColor());
        tuxTextView3.setTextAlignment(5);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.ac));
        tuxTextView3.setTextDirection(5);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i = 16;
            layoutParams9.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.C0844d) layoutParams9).f3113a = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        tuxTextView3.setGravity(8388611);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView3, layoutParams9);
        C79467f.m138187a(tuxTextView3, layoutParams9);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout3.addView(tuxTextView3, layoutParams9);
        }
        C0174a.m578a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams3);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.ce9);
        linearLayout5.setVisibility(8);
        linearLayout5.setOrientation(1);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            int i10 = Build.VERSION.SDK_INT;
            f2 = 8.0f;
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).leftMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.f2b);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(2);
        tuxTextView4.setShadowLayer(tuxTextView4.getShadowRadius(), tuxTextView4.getShadowDx(), tuxTextView4.getShadowDy(), resources.getColor(R.color.iu));
        tuxTextView4.setShadowLayer(tuxTextView4.getShadowRadius(), tuxTextView4.getShadowDx(), 1.0f, tuxTextView4.getShadowColor());
        tuxTextView4.setMaxWidth((int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()));
        tuxTextView4.setShadowLayer(1.0f, tuxTextView4.getShadowDx(), tuxTextView4.getShadowDy(), tuxTextView4.getShadowColor());
        tuxTextView4.setText("From your contacts");
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView4.setGravity(16);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView4, layoutParams11);
        C79467f.m138187a(tuxTextView4, layoutParams11);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout5.addView(tuxTextView4, layoutParams11);
        }
        MutualRelationView mutualRelationView2 = new MutualRelationView(context);
        mutualRelationView2.setId(R.id.cp6);
        mutualRelationView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        C0174a.m578a(mutualRelationView2);
        if (mutualRelationView2.getParent() == null) {
            linearLayout5.addView(mutualRelationView2, layoutParams12);
        }
        C0174a.m578a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout2.addView(linearLayout5, layoutParams10);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2, layoutParams2);
        }
        VideoTitleFollowBtn videoTitleFollowBtn = new VideoTitleFollowBtn(context);
        videoTitleFollowBtn.setId(R.id.xm);
        videoTitleFollowBtn.setVisibility(8);
        videoTitleFollowBtn.setForceWidth((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i2 = -1;
            layoutParams13.addRule(21, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(11, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(15, i2);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i3 = 16;
            ((LinearLayout.LayoutParams) layoutParams13).gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i3;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams13)) {
            ((DrawerLayout.C0844d) layoutParams13).f3113a = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            int i11 = Build.VERSION.SDK_INT;
            f3 = 12.0f;
            i4 = 1;
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 12.0f;
            i4 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).leftMargin = (int) TypedValue.applyDimension(i4, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            int i12 = Build.VERSION.SDK_INT;
            f4 = 8.0f;
            i5 = 1;
            layoutParams13.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f4 = 8.0f;
            i5 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).rightMargin = (int) TypedValue.applyDimension(i5, f4, resources.getDisplayMetrics());
        }
        C0174a.m578a(videoTitleFollowBtn);
        if (videoTitleFollowBtn.getParent() == null) {
            relativeLayout.addView(videoTitleFollowBtn, layoutParams13);
        }
        C0174a.m578a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            linearLayout.addView(relativeLayout, layoutParams);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.e42);
        linearLayout6.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), linearLayout6.getPaddingBottom());
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), linearLayout6.getPaddingBottom());
        linearLayout6.setVisibility(8);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            int i13 = Build.VERSION.SDK_INT;
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        linearLayout6.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams14)) {
            ((DrawerLayout.C0844d) layoutParams14).f3113a = 16;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        C79466e.m138186a("android:layout_marginVertical", new C1863a.C1867d("6", "dp"), tuxIconView2, layoutParams15);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755431", "raw"), tuxIconView2, layoutParams15);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView2, layoutParams15);
        C79466e.m138185a(tuxIconView2, layoutParams15);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout6.addView(tuxIconView2, layoutParams15);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.e41);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView5.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            int i14 = Build.VERSION.SDK_INT;
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.weight = 1.0f;
        }
        C79467f.m138188a("android:breakStrategy", new C1863a.C1866c("simple"), tuxTextView5, layoutParams16);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Semibold"), tuxTextView5, layoutParams16);
        C79467f.m138187a(tuxTextView5, layoutParams16);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout6.addView(tuxTextView5, layoutParams16);
        }
        MutualRelationView mutualRelationView3 = new MutualRelationView(context);
        mutualRelationView3.setId(R.id.e40);
        mutualRelationView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            int i15 = Build.VERSION.SDK_INT;
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(mutualRelationView3);
        if (mutualRelationView3.getParent() == null) {
            linearLayout6.addView(mutualRelationView3, layoutParams17);
        }
        C0174a.m578a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout.addView(linearLayout6, layoutParams14);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(2007);
        return linearLayout;
    }
}
