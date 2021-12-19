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
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.AdRatingView;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.AdTagGroup;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.DescTextView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ao */
public final class C1781ao implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1951);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        int i;
        int i2;
        MethodCollector.m26663i(1720);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.azv);
        linearLayout.setBackgroundColor(resources.getColor(R.color.bj));
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setVisibility(8);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        linearLayout.setGravity(17);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.ef);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        C1766a aVar = new C1766a();
        aVar.mo5576a("app:roundedCornerRadius", new C1863a.C1867d("9", "dp"), remoteImageView, layoutParams);
        aVar.mo5575a(remoteImageView, layoutParams);
        C0174a.m578a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.eu);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H2_Regular"), tuxTextView, layoutParams2);
        C79467f.m138187a(tuxTextView, layoutParams2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        View remoteImageView2 = new RemoteImageView(context);
        remoteImageView2.setId(R.id.eh);
        remoteImageView2.setBackgroundResource(R.drawable.zv);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(remoteImageView2);
        if (remoteImageView2.getParent() == null) {
            linearLayout.addView(remoteImageView2, layoutParams3);
        }
        RemoteImageView remoteImageView3 = new RemoteImageView(context);
        remoteImageView3.setId(R.id.gc);
        remoteImageView3.setBackgroundResource(R.drawable.a00);
        remoteImageView3.setVisibility(8);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()));
        C1766a aVar2 = new C1766a();
        aVar2.mo5576a("app:roundedCornerRadius", new C1863a.C1867d("2", "dp"), remoteImageView3, layoutParams4);
        aVar2.mo5575a(remoteImageView3, layoutParams4);
        C0174a.m578a(remoteImageView3);
        if (remoteImageView3.getParent() == null) {
            linearLayout.addView(remoteImageView3, layoutParams4);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.g6);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        linearLayout2.setGravity(17);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.en);
        tuxTextView2.setBackgroundResource(R.drawable.zw);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.bx));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView2.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Regular"), tuxTextView2, layoutParams6);
        C79467f.m138187a(tuxTextView2, layoutParams6);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout2.addView(tuxTextView2, layoutParams6);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.g5);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.bx));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView3, layoutParams7);
        C79467f.m138187a(tuxTextView3, layoutParams7);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout2.addView(tuxTextView3, layoutParams7);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams5);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.es);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout3.setGravity(16);
        AdRatingView adRatingView = new AdRatingView(context);
        adRatingView.setId(R.id.fm);
        adRatingView.setRatingDivide((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        adRatingView.setRatingImage(context.getResources().getDrawable(2131233902));
        adRatingView.setRatingStarNumber(5);
        adRatingView.setRatingUnImage(context.getResources().getDrawable(2131231781));
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        C0174a.m578a(adRatingView);
        if (adRatingView.getParent() == null) {
            linearLayout3.addView(adRatingView, layoutParams9);
        }
        View view = new View(context);
        view.setId(R.id.er);
        view.setBackgroundColor(resources.getColor(R.color.a7));
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams10.setMarginEnd((int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).rightMargin = (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            linearLayout3.addView(view, layoutParams10);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.d5);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.ac));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Regular"), tuxTextView4, layoutParams11);
        C79467f.m138187a(tuxTextView4, layoutParams11);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout3.addView(tuxTextView4, layoutParams11);
        }
        C0174a.m578a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout.addView(linearLayout3, layoutParams8);
        }
        DescTextView descTextView = new DescTextView(context);
        descTextView.setId(R.id.ds);
        descTextView.setMaxLines(3);
        descTextView.setTextColor(resources.getColorStateList(R.color.ac));
        descTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        descTextView.setGravity(1);
        C0174a.m578a(descTextView);
        if (descTextView.getParent() == null) {
            linearLayout.addView(descTextView, layoutParams12);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.fi);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            f = 8.5f;
            ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        } else {
            f = 8.5f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).topMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        linearLayout4.setGravity(17);
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setText(R.string.fcm);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.bx));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams14)) {
            ((DrawerLayout.C0844d) layoutParams14).f3113a = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        tuxTextView5.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("SmallText1_Regular"), tuxTextView5, layoutParams14);
        C79467f.m138187a(tuxTextView5, layoutParams14);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout4.addView(tuxTextView5, layoutParams14);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.fh);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.bx));
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView6.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView6, layoutParams15);
        C79467f.m138187a(tuxTextView6, layoutParams15);
        C0174a.m578a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            linearLayout4.addView(tuxTextView6, layoutParams15);
        }
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.fp);
        tuxTextView7.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView7.setMaxLines(1);
        tuxTextView7.setTextColor(resources.getColorStateList(R.color.ac));
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Regular"), tuxTextView7, layoutParams16);
        C79467f.m138187a(tuxTextView7, layoutParams16);
        C0174a.m578a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            linearLayout4.addView(tuxTextView7, layoutParams16);
        }
        C0174a.m578a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams13);
        }
        View adTagGroup = new AdTagGroup(context);
        adTagGroup.setId(R.id.g4);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            ((ViewGroup.MarginLayoutParams) layoutParams17).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(adTagGroup);
        if (adTagGroup.getParent() == null) {
            linearLayout.addView(adTagGroup, layoutParams17);
        }
        View space = new Space(context);
        ViewGroup.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        C0174a.m578a(space);
        if (space.getParent() == null) {
            linearLayout.addView(space, layoutParams18);
        }
        TuxTextView tuxTextView8 = new TuxTextView(context);
        tuxTextView8.setId(R.id.azt);
        tuxTextView8.setBackgroundResource(R.drawable.b0o);
        tuxTextView8.setPadding(tuxTextView8.getPaddingLeft(), tuxTextView8.getPaddingTop(), tuxTextView8.getPaddingRight(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()));
        tuxTextView8.setPadding(tuxTextView8.getPaddingLeft(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()), tuxTextView8.getPaddingRight(), tuxTextView8.getPaddingBottom());
        tuxTextView8.setText(R.string.bu5);
        tuxTextView8.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i = 17;
            layoutParams19.gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = i;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams19)) {
            ((DrawerLayout.C0844d) layoutParams19).f3113a = i;
        }
        tuxTextView8.setGravity(i);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView8, layoutParams19);
        C79467f.m138187a(tuxTextView8, layoutParams19);
        C0174a.m578a(tuxTextView8);
        if (tuxTextView8.getParent() == null) {
            linearLayout.addView(tuxTextView8, layoutParams19);
        }
        TuxTextView tuxTextView9 = new TuxTextView(context);
        tuxTextView9.setId(R.id.azy);
        tuxTextView9.setPadding(tuxTextView9.getPaddingLeft(), tuxTextView9.getPaddingTop(), tuxTextView9.getPaddingRight(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()));
        tuxTextView9.setPadding(tuxTextView9.getPaddingLeft(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()), tuxTextView9.getPaddingRight(), tuxTextView9.getPaddingBottom());
        tuxTextView9.setText(R.string.bu7);
        tuxTextView9.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i2 = 17;
            layoutParams20.gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((FrameLayout.LayoutParams) layoutParams20).gravity = i2;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams20)) {
            ((DrawerLayout.C0844d) layoutParams20).f3113a = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            ((ViewGroup.MarginLayoutParams) layoutParams20).topMargin = (int) TypedValue.applyDimension(1, 22.5f, resources.getDisplayMetrics());
        }
        tuxTextView9.setGravity(17);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView9, layoutParams20);
        C79467f.m138187a(tuxTextView9, layoutParams20);
        C0174a.m578a(tuxTextView9);
        if (tuxTextView9.getParent() == null) {
            linearLayout.addView(tuxTextView9, layoutParams20);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(1720);
        return linearLayout;
    }
}
