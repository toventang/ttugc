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
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ck */
public final class C1831ck implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2001);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(717);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.acf);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        HSImageView hSImageView = new HSImageView(context);
        hSImageView.setId(R.id.c_w);
        hSImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hSImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C1766a aVar = new C1766a();
        aVar.mo5576a("custom:placeholderImageScaleType", new C1863a.C1866c("centerCrop"), hSImageView, layoutParams);
        aVar.mo5575a(hSImageView, layoutParams);
        C0174a.m578a(hSImageView);
        if (hSImageView.getParent() == null) {
            frameLayout.addView(hSImageView, layoutParams);
        }
        View widgetContainer = new WidgetContainer(context);
        widgetContainer.setId(R.id.d6c);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer);
        if (widgetContainer.getParent() == null) {
            frameLayout.addView(widgetContainer, layoutParams2);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.iw);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams3);
        }
        HSImageView hSImageView2 = new HSImageView(context);
        hSImageView2.setId(R.id.c_q);
        hSImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hSImageView2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        C1766a aVar2 = new C1766a();
        aVar2.mo5576a("custom:placeholderImage", new C1863a.C1865b("2131234778", "drawable"), hSImageView2, layoutParams4);
        aVar2.mo5576a("custom:placeholderImageScaleType", new C1863a.C1866c("centerCrop"), hSImageView2, layoutParams4);
        aVar2.mo5575a(hSImageView2, layoutParams4);
        C0174a.m578a(hSImageView2);
        if (hSImageView2.getParent() == null) {
            frameLayout.addView(hSImageView2, layoutParams4);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.bpb);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams5);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.ba1);
        frameLayout4.setVisibility(8);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout.addView(frameLayout4, layoutParams6);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.bp3);
        frameLayout5.setClickable(false);
        frameLayout5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        HSImageView hSImageView3 = new HSImageView(context);
        hSImageView3.setId(R.id.ss);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 156.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.C0844d) layoutParams8).f3113a = 8388613;
        }
        C0174a.m578a(hSImageView3);
        if (hSImageView3.getParent() == null) {
            frameLayout5.addView(hSImageView3, layoutParams8);
        }
        HSImageView hSImageView4 = new HSImageView(context);
        hSImageView4.setId(R.id.bcn);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 1;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.C0844d) layoutParams9).f3113a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) TypedValue.applyDimension(1, 170.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(hSImageView4);
        if (hSImageView4.getParent() == null) {
            frameLayout5.addView(hSImageView4, layoutParams9);
        }
        LiveTextView liveTextView = new LiveTextView(context);
        liveTextView.setId(R.id.ca5);
        liveTextView.setTextColor(resources.getColorStateList(R.color.a2j));
        liveTextView.setTextSize(2, 28.0f);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(1, 380.0f, resources.getDisplayMetrics());
        }
        liveTextView.setGravity(17);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = 1;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.C0844d) layoutParams10).f3113a = 1;
        }
        C0174a.m578a(liveTextView);
        if (liveTextView.getParent() == null) {
            frameLayout5.addView(liveTextView, layoutParams10);
        }
        C0174a.m578a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            frameLayout.addView(frameLayout5, layoutParams7);
        }
        LiveLoadingView liveLoadingView = new LiveLoadingView(context);
        liveLoadingView.setId(R.id.c_y);
        liveLoadingView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.C0844d) layoutParams11).f3113a = 17;
        }
        C0174a.m578a(liveLoadingView);
        if (liveLoadingView.getParent() == null) {
            frameLayout.addView(liveLoadingView, layoutParams11);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(717);
        return frameLayout;
    }
}
