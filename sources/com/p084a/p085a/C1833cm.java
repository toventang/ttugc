package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.view.SurfaceRenderView;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.cm */
public final class C1833cm implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2003);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2919);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(resources.getColor(R.color.c9));
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        HSImageView hSImageView = new HSImageView(context);
        hSImageView.setId(R.id.fc1);
        if (Build.VERSION.SDK_INT >= 26) {
            hSImageView.setForeground(new ColorDrawable(Color.parseColor("#80000000")));
        }
        hSImageView.setImageResource(R.drawable.c1j);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C1766a aVar = new C1766a();
        aVar.mo5576a("custom:failureImage", new C1863a.C1865b("2131234509", "drawable"), hSImageView, layoutParams);
        aVar.mo5576a("custom:failureImageScaleType", new C1863a.C1866c("fitXY"), hSImageView, layoutParams);
        aVar.mo5575a(hSImageView, layoutParams);
        C0174a.m578a(hSImageView);
        if (hSImageView.getParent() == null) {
            frameLayout.addView(hSImageView, layoutParams);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.fe9);
        relativeLayout.setBackgroundColor(Color.parseColor("#3E3F49"));
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        HSImageView hSImageView2 = new HSImageView(context);
        hSImageView2.setId(R.id.c_v);
        hSImageView2.setBackgroundResource(R.drawable.c1j);
        hSImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        C0174a.m578a(hSImageView2);
        if (hSImageView2.getParent() == null) {
            relativeLayout.addView(hSImageView2, layoutParams3);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.cb3);
        frameLayout2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        HSImageView hSImageView3 = new HSImageView(context);
        hSImageView3.setId(R.id.cb2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        C1766a aVar2 = new C1766a();
        aVar2.mo5576a("custom:failureImage", new C1863a.C1865b("2131234492", "drawable"), hSImageView3, layoutParams5);
        aVar2.mo5576a("custom:failureImageScaleType", new C1863a.C1866c("fitXY"), hSImageView3, layoutParams5);
        aVar2.mo5575a(hSImageView3, layoutParams5);
        C0174a.m578a(hSImageView3);
        if (hSImageView3.getParent() == null) {
            frameLayout2.addView(hSImageView3, layoutParams5);
        }
        View view = new View(context);
        view.setAlpha(0.75f);
        view.setBackgroundColor(resources.getColor(R.color.a2));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(view);
        if (view.getParent() == null) {
            frameLayout2.addView(view, layoutParams6);
        }
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            relativeLayout.addView(frameLayout2, layoutParams4);
        }
        View liveLoadingView = new LiveLoadingView(context);
        liveLoadingView.setId(R.id.cbg);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(13, -1);
        }
        C0174a.m578a(liveLoadingView);
        if (liveLoadingView.getParent() == null) {
            relativeLayout.addView(liveLoadingView, layoutParams7);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.cc4);
        ViewGroup.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        SurfaceRenderView surfaceRenderView = new SurfaceRenderView(context);
        surfaceRenderView.setId(R.id.fe8);
        surfaceRenderView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(surfaceRenderView);
        if (surfaceRenderView.getParent() == null) {
            frameLayout3.addView(surfaceRenderView, layoutParams9);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.cbb);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setBackgroundColor(Color.parseColor("#B3000000"));
        ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        linearLayout.setGravity(1);
        HSAnimImageView hSAnimImageView = new HSAnimImageView(context);
        hSAnimImageView.setId(R.id.czj);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 187.6f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 112.6f, resources.getDisplayMetrics()));
        C0174a.m578a(hSAnimImageView);
        if (hSAnimImageView.getParent() == null) {
            linearLayout.addView(hSAnimImageView, layoutParams11);
        }
        LiveTextView liveTextView = new LiveTextView(context);
        liveTextView.setId(R.id.czm);
        liveTextView.setTextColor(resources.getColorStateList(R.color.a2j));
        liveTextView.setText(R.string.duq);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(liveTextView);
        if (liveTextView.getParent() == null) {
            linearLayout.addView(liveTextView, layoutParams12);
        }
        LiveTextView liveTextView2 = new LiveTextView(context);
        liveTextView2.setId(R.id.czl);
        liveTextView2.setTextColor(resources.getColorStateList(R.color.a2j));
        liveTextView2.setText(R.string.dv5);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(liveTextView2);
        if (liveTextView2.getParent() == null) {
            linearLayout.addView(liveTextView2, layoutParams13);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout3.addView(linearLayout, layoutParams10);
        }
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            relativeLayout.addView(frameLayout3, layoutParams8);
        }
        C0174a.m578a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams2);
        }
        HSImageView hSImageView4 = new HSImageView(context);
        hSImageView4.setId(R.id.c_u);
        hSImageView4.setBackgroundResource(R.drawable.c1j);
        if (Build.VERSION.SDK_INT >= 26) {
            hSImageView4.setForeground(new ColorDrawable(Color.parseColor("#80000000")));
        }
        hSImageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hSImageView4.setVisibility(8);
        ViewGroup.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(hSImageView4);
        if (hSImageView4.getParent() == null) {
            frameLayout.addView(hSImageView4, layoutParams14);
        }
        HSImageView hSImageView5 = new HSImageView(context);
        hSImageView5.setId(R.id.dds);
        hSImageView5.setScaleType(ImageView.ScaleType.FIT_XY);
        hSImageView5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(hSImageView5);
        if (hSImageView5.getParent() == null) {
            frameLayout.addView(hSImageView5, layoutParams15);
        }
        View view2 = new View(context);
        view2.setId(R.id.ddt);
        view2.setBackgroundColor(Color.parseColor("#66000000"));
        view2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams16);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
        View view3 = new View(context);
        view3.setId(R.id.bpd);
        view3.setBackgroundColor(Color.parseColor("#3d000000"));
        view3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view3);
        if (view3.getParent() == null) {
            linearLayout2.addView(view3, layoutParams18);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.b82);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout2.addView(frameLayout4, layoutParams19);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2, layoutParams17);
        }
        View widgetContainer = new WidgetContainer(context);
        widgetContainer.setId(R.id.e_h);
        FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((LinearLayout.LayoutParams) layoutParams20).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams20)) {
            ((DrawerLayout.C0844d) layoutParams20).f3113a = 16;
        }
        C0174a.m578a(widgetContainer);
        if (widgetContainer.getParent() == null) {
            frameLayout.addView(widgetContainer, layoutParams20);
        }
        LiveLoadingView liveLoadingView2 = new LiveLoadingView(context);
        liveLoadingView2.setId(R.id.cbf);
        liveLoadingView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((LinearLayout.LayoutParams) layoutParams21).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams21)) {
            ((DrawerLayout.C0844d) layoutParams21).f3113a = 17;
        }
        C0174a.m578a(liveLoadingView2);
        if (liveLoadingView2.getParent() == null) {
            frameLayout.addView(liveLoadingView2, layoutParams21);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.cip);
        frameLayout5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            frameLayout.addView(frameLayout5, layoutParams22);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(2919);
        return frameLayout;
    }
}
